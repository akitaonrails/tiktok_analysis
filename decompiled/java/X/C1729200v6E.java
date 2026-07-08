package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.utils.EffectBillboardLiveStatusHelper$onLiveStart$2", f = "EffectBillboardLiveStatusHelper.kt", l = {}, m = "invokeSuspend")
public final class C1729200v6E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1729220v6G LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729200v6E(C1729220v6G c1729220v6G, String str, long j, String str2, InterfaceC1364105Vn<? super C1729200v6E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1729220v6G;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729200v6E(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectBillboardLiveStatusHelper@aaaf.onLiveStart$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1728980v5s.LIZ.getClass();
        if (!C1728980v5s.LIZLLL()) {
            C1728830v5d.LLJLILLLLZIIL(null, this.LLILLJJLI);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EffectBillboardLiveStatusHelper@aaaf.onLiveStart$2");
            return unit;
        }
        C1729210v6F c1729210v6FLJLZ = C1728830v5d.LJLZ(this.LLILLJJLI);
        if (c1729210v6FLJLZ == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EffectBillboardLiveStatusHelper@aaaf.onLiveStart$2");
            return unit2;
        }
        C1729210v6F c1729210v6F = new C1729210v6F(c1729210v6FLJLZ.LIZ, C2286608xc.LJFF(this.LLILLL), true, c1729210v6FLJLZ.LIZLLL, c1729210v6FLJLZ.LJ, this.LLILZ, c1729210v6FLJLZ.LJII, 64);
        Map<String, String> map = C1729240v6I.LIZ;
        Pair[] pairArr = new Pair[3];
        String str = CardStruct.IStatusCode.DEFAULT;
        pairArr[0] = new Pair("is_org_template", CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("is_live_take_default", "1");
        if (c1729210v6F.LJII.isAutoDisplay) {
            str = "1";
        }
        pairArr[2] = new Pair("is_auto_display", str);
        C1729240v6I.LIZIZ(C2097608Jq.LJIIIIZZ(pairArr), this.LLILZ, "during_live", this.LLILLJJLI, "photo", c1729210v6F.LIZLLL, c1729210v6F.LJ, c1729210v6F.LIZ, 1);
        C1728830v5d.LLJLILLLLZIIL(c1729210v6F, this.LLILLJJLI);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EffectBillboardLiveStatusHelper@aaaf.onLiveStart$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
