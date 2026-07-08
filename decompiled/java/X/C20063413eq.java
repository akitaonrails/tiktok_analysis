package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {215}, m = "invokeSuspend")
public final class C20063413eq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20063313ep LLILLL;
    public final /* synthetic */ C1677660tl6 LLILZ;
    public final /* synthetic */ InterfaceC20063613es LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20063413eq(C20063313ep c20063313ep, C1677660tl6 c1677660tl6, InterfaceC20063613es interfaceC20063613es, InterfaceC1364105Vn<? super C20063413eq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20063313ep;
        this.LLILZ = c1677660tl6;
        this.LLILZIL = interfaceC20063613es;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20063413eq c20063413eq = new C20063413eq(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c20063413eq.LLILLJJLI = obj;
        return c20063413eq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        CancellationException cancellationException = null;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    C09AE c09aeLJII = C23118094a.LJII(((InterfaceC497601wk) this.LLILLJJLI).getCoroutineContext());
                    C20063313ep c20063313ep = this.LLILLL;
                    c20063313ep.LLJJJJJIL = true;
                    C20082713hx c20082713hx = c20063313ep.LLJJI;
                    EnumC1384205bM enumC1384205bM = EnumC1384205bM.Default;
                    C20063513er c20063513er = new C20063513er(this.LLILZ, c20063313ep, this.LLILZIL, c09aeLJII, null);
                    this.LL = 1;
                    if (c20082713hx.LJFF(enumC1384205bM, c20063513er, this) == objLJFF) {
                        return objLJFF;
                    }
                }
                this.LLILLL.LLJJIJIIJIL.LIZIZ();
                C20063313ep c20063313ep2 = this.LLILLL;
                c20063313ep2.LLJJJJJIL = false;
                c20063313ep2.LLJJIJIIJIL.LIZ(null);
                this.LLILLL.LLJJJ = false;
                return Unit.LIZ;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cancellationException = e;
                    TryCatchGuardChecker.doCheck(th);
                    C20063313ep c20063313ep3 = this.LLILLL;
                    c20063313ep3.LLJJJJJIL = false;
                    c20063313ep3.LLJJIJIIJIL.LIZ(cancellationException);
                    this.LLILLL.LLJJJ = false;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C20063313ep c20063313ep32 = this.LLILLL;
            c20063313ep32.LLJJJJJIL = false;
            c20063313ep32.LLJJIJIIJIL.LIZ(cancellationException);
            this.LLILLL.LLJJJ = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
