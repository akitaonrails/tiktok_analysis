package X;

import android.content.Context;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.anchor.sensor.PoiVideoAnchorButtonClickEvent$invoke$2", f = "PoiVideoAnchorButtonClickEvent.kt", l = {}, m = "invokeSuspend")
public final class C613060O2u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ C1188440h22 LLILZ;
    public final /* synthetic */ PageFinder LLILZIL;
    public final /* synthetic */ C2189821An6 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613060O2u(Context context, Map<String, ? extends Object> map, Aweme aweme, C1188440h22 c1188440h22, PageFinder pageFinder, C2189821An6 c2189821An6, InterfaceC1364105Vn<? super C613060O2u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = map;
        this.LLILLL = aweme;
        this.LLILZ = c1188440h22;
        this.LLILZIL = pageFinder;
        this.LLILZLL = c2189821An6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613060O2u(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        String str;
        PoiAnchorInfo poiAnchorInfo;
        Object obj2;
        C1C7U.LIZ("PoiVideoAnchorButtonClickEvent@eacb.invoke$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1188720h2U c1188720h2U = C1188720h2U.LIZ;
        Context context = this.LL;
        Map<String, Object> map = this.LLILLJJLI;
        if (map != null && (obj2 = map.get("schema")) != null) {
            string = obj2.toString();
        } else {
            string = null;
        }
        Aweme aweme = this.LLILLL;
        C1188440h22 c1188440h22 = this.LLILZ;
        PageFinder pageFinder = this.LLILZIL;
        PoiDataStruct poiDataStruct = this.LLILLL.getPoiDataStruct();
        if (poiDataStruct != null && (poiAnchorInfo = poiDataStruct.videoAnchor) != null) {
            str = poiAnchorInfo.trackInfo;
        } else {
            str = null;
        }
        String strLJIJJ = C15WT.LIZIZ.LJIJJ(null, "homepage_hot", this.LLILZLL.getAid(), this.LLILLL.getAid());
        C1188750h2X c1188750h2X = C1188750h2X.LIZ;
        String aid = this.LLILLL.getAid();
        c1188750h2X.getClass();
        boolean zLIZIZ = C1188750h2X.LIZIZ(aid);
        c1188720h2U.getClass();
        C1188720h2U.LIZIZ(context, string, aweme, c1188440h22, pageFinder, "homepage_hot", "video_anchor", false, null, str, "click", null, null, false, strLJIJJ, zLIZIZ, "c6053.d52627");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiVideoAnchorButtonClickEvent@eacb.invoke$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
