package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.utils.SeaLiveEffectBillboardLiveStatusHelper$onLiveStart$2", f = "SeaLiveEffectBillboardLiveStatusHelper.kt", l = {}, m = "invokeSuspend")
public final class C1729140v68 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1729170v6B LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729140v68(C1729170v6B c1729170v6B, String str, long j, String str2, InterfaceC1364105Vn<? super C1729140v68> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1729170v6B;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729140v68(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaLiveEffectBillboardLiveStatusHelper@c705.onLiveStart$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1728970v5r.LIZ.getClass();
        if (!C1728970v5r.LIZJ()) {
            C1728670v5N.LLJLILLLLZIIL(null, this.LLILLJJLI);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SeaLiveEffectBillboardLiveStatusHelper@c705.onLiveStart$2");
            return unit;
        }
        C1729160v6A c1729160v6ALJLZ = C1728670v5N.LJLZ(this.LLILLJJLI);
        if (c1729160v6ALJLZ == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SeaLiveEffectBillboardLiveStatusHelper@c705.onLiveStart$2");
            return unit2;
        }
        C1729160v6A c1729160v6A = new C1729160v6A(c1729160v6ALJLZ.LIZ, C2286608xc.LJFF(this.LLILLL), true, c1729160v6ALJLZ.LIZLLL, c1729160v6ALJLZ.LJ, this.LLILZ, c1729160v6ALJLZ.LJII, 64);
        Map<String, String> map = C1729230v6H.LIZ;
        Pair[] pairArr = new Pair[3];
        String str = CardStruct.IStatusCode.DEFAULT;
        pairArr[0] = new Pair("is_org_template", CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("is_live_take_default", "1");
        if (c1729160v6A.LJII.isAutoDisplay) {
            str = "1";
        }
        pairArr[2] = new Pair("is_auto_display", str);
        C1729230v6H.LIZ(C2097608Jq.LJIIIIZZ(pairArr), this.LLILZ, this.LLILLJJLI, c1729160v6A.LIZLLL, c1729160v6A.LJ, c1729160v6A.LIZ);
        C1728670v5N.LLJLILLLLZIIL(c1729160v6A, this.LLILLJJLI);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveEffectBillboardLiveStatusHelper@c705.onLiveStart$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
