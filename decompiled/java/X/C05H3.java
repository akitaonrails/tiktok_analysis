package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05H3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol$Companion$toResultEvent$1", f = "LandMallProtocol.kt", l = {}, m = "invokeSuspend")
public final class C05H3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05H3(String str, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05H3(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandMallProtocol$Companion@47b7.toResultEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("result", C2286608xc.LJ(this.LL ? 1 : 0));
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("fail_reason", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("default_landing_result", mapLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LandMallProtocol$Companion@47b7.toResultEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
