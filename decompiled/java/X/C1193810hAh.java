package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.component.AnchorInfoComponent;
import com.ss.android.ugc.aweme.poi.PoiAnchorData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.anchor.chat.PoiChatAnchorMaker$onAnchorShown$1", f = "PoiChatAnchorMaker.kt", l = {}, m = "invokeSuspend")
public final class C1193810hAh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ AnchorInfoComponent LLILLJJLI;
    public final /* synthetic */ C1193790hAf LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1193810hAh(String str, AnchorInfoComponent anchorInfoComponent, C1193790hAf c1193790hAf, Map<String, String> map, InterfaceC1364105Vn<? super C1193810hAh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = anchorInfoComponent;
        this.LLILLL = c1193790hAf;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1193810hAh(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("PoiChatAnchorMaker@bb8c.onAnchorShown$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LL;
        AnchorInfoComponent anchorInfoComponent = this.LLILLJJLI;
        C1193790hAf c1193790hAf = this.LLILLL;
        Map<String, String> map = this.LLILZ;
        linkedHashMap.put("enter_from", str);
        String str2 = anchorInfoComponent.id;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("poi_id", str2);
        try {
            PoiAnchorData poiAnchorData = (PoiAnchorData) C08JS.LIZIZ().LJII(anchorInfoComponent.extra, PoiAnchorData.class);
            C1189060h32.LIZ(poiAnchorData.collectInfo, linkedHashMap);
            Long l = poiAnchorData.favCnt;
            if (l != null) {
                linkedHashMap.put("favourite_cnt", String.valueOf(l.longValue()));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        String str3 = c1193790hAf.LLILZ;
        if (str3 != null) {
            Keva keva = c1193790hAf.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show_index_");
            sbLIZ.append(str3);
            int i = keva.getInt(C1189060h32.LJIILL(C2188811AlT.LIZIZ(sbLIZ)), -1) + 1;
            linkedHashMap.put("show_index", String.valueOf(i));
            Keva keva2 = c1193790hAf.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("show_index_");
            sbLIZ2.append(str3);
            keva2.storeInt(C1189060h32.LJIILL(C2188811AlT.LIZIZ(sbLIZ2)), i);
        }
        linkedHashMap.putAll(map);
        C20684815ws.LJIILLIIL("poi_video_card_anchor_show", linkedHashMap);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PoiChatAnchorMaker@bb8c.onAnchorShown$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
