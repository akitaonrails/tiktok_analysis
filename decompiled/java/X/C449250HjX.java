package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew$openSearchSquare$1$4", f = "DynamicSingleIntermediateFragmentNew.kt", l = {1209}, m = "invokeSuspend")
public final class C449250HjX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C449250HjX(InterfaceC1364105Vn<? super C449250HjX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C449250HjX(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C669810QPb c669810QPb;
        C1C7U.LIZ("DynamicSingleIntermediateFragmentNew@4e1a.openSearchSquare$1$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                        C1C7U.LIZIZ("DynamicSingleIntermediateFragmentNew@4e1a.openSearchSquare$1$4");
                        return objLJFF;
                    }
                }
                c669810QPb = C669810QPb.LIZ;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                c669810QPb = C669810QPb.LIZ;
            }
            c669810QPb.getClass();
            C669810QPb.LIZIZ = false;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DynamicSingleIntermediateFragmentNew@4e1a.openSearchSquare$1$4");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C669810QPb.LIZ.getClass();
            C669810QPb.LIZIZ = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C449250HjX(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
