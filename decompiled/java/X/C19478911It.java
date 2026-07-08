package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11It, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19478911It extends AtomicReference<InterfaceC420801kM> implements C11IY, InterfaceC420801kM {
    public static final long serialVersionUID = 5018523762564524046L;
    public final C11IY LL;
    public final InterfaceC1487280oo2<? super Throwable, ? extends C11IV> LLILLJJLI;
    public boolean LLILLL;

    @Override // X.C11IY
    public final void onComplete() {
        this.LL.onComplete();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        C11JE.dispose(this);
    }

    @Override // X.C11IY
    public final void onError(Throwable th) throws Throwable {
        if (this.LLILLL) {
            this.LL.onError(th);
            return;
        }
        this.LLILLL = true;
        try {
            C11IV c11ivApply = this.LLILLJJLI.apply(th);
            C1701890uOB.LIZ(c11ivApply, "The errorMapper returned a null CompletableSource");
            c11ivApply.LIZIZ(this);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LL.onError(new C0VYA(th, th2));
        }
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.replace(this, interfaceC420801kM);
    }

    public C19478911It(C11IY c11iy, InterfaceC1487280oo2<? super Throwable, ? extends C11IV> interfaceC1487280oo2) {
        this.LL = c11iy;
        this.LLILLJJLI = interfaceC1487280oo2;
    }
}
