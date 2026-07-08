package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cCU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService$logClickSearchIconEvent$1", f = "SearchAdMainService.kt", l = {}, m = "invokeSuspend")
public final class C1002720cCU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002720cCU(Aweme aweme, InterfaceC1364105Vn<? super C1002720cCU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002720cCU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdMainService@1d03.logClickSearchIconEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1002730cCV c1002730cCV = new C1002730cCV(this.LL);
        Aweme aweme = c1002730cCV.LIZ;
        if (aweme != null && aweme.isAd()) {
            try {
                c1002730cCV.logAd(C1002740cCW.LIZ, c1002730cCV.LIZ.getAwemeRawAd());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdMainService@1d03.logClickSearchIconEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
