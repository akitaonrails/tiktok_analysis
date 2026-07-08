package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.LongClickHandler$prefetchGroupOwnerAccountType$1", f = "LongClickHandler.kt", l = {942}, m = "invokeSuspend")
public final class C05LN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C893630Z3x LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LN(C893630Z3x c893630Z3x, String str, InterfaceC1364105Vn<? super C05LN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c893630Z3x;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LongClickHandler@7f82.prefetchGroupOwnerAccountType$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    C1DFB c1dfb = C0PEM.LIZJ;
                    C05LM c05lm = new C05LM(this.LLILLL, null);
                    this.LL = 1;
                    obj = C23250099c.LJI(this, c1dfb, c05lm);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("LongClickHandler@7f82.prefetchGroupOwnerAccountType$1");
                        return objLJFF;
                    }
                }
                String str = (String) obj;
                if (str.length() <= 0) {
                    z = false;
                }
                if (z) {
                    this.LLILLJJLI.LLJJJIL = str;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LLILLJJLI.LLJJJ.set(false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LongClickHandler@7f82.prefetchGroupOwnerAccountType$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LLJJJ.set(false);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
