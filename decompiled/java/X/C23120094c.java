package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.094c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23120094c implements InterfaceC20035313aJ {
    public final Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> LL;
    public final C054G LLILLJJLI;
    public AnonymousClass0956 LLILLL;

    @Override // X.InterfaceC20035313aJ
    public final void LIZLLL() {
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(new C2328409Ak());
        }
        this.LLILLL = null;
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJ() {
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(new C2328409Ak());
        }
        this.LLILLL = null;
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJFF() {
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            C23118094a.LIZIZ("Old job was still running!", null, anonymousClass0956);
        }
        this.LLILLL = C23250099c.LIZLLL(this.LLILLJJLI, null, null, this.LL, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23120094c(CoroutineContext coroutineContext, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        this.LL = function2;
        this.LLILLJJLI = C2296808zG.LIZ(coroutineContext);
    }
}
