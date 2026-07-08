package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;

/* JADX INFO: renamed from: X.0QRB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QRB<T> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public final Function1<T, Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function1<Throwable, Unit> LLILLL;
    public InterfaceC420801kM LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        InterfaceC420801kM interfaceC420801kM = this.LLILZ;
        if (interfaceC420801kM == null || interfaceC420801kM.isDisposed()) {
            return;
        }
        interfaceC420801kM.dispose();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        InterfaceC420801kM interfaceC420801kM = this.LLILZ;
        if (interfaceC420801kM != null) {
            return interfaceC420801kM.isDisposed();
        }
        return true;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        try {
            try {
                this.LLILLJJLI.invoke();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                onError(e);
            }
            dispose();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dispose();
            throw th;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        try {
            try {
                this.LLILLL.invoke(th);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            dispose();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            dispose();
            throw th2;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        try {
            this.LL.invoke(t);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        dispose();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        this.LLILZ = interfaceC420801kM;
    }

    public C0QRB(AwS376S0200000_10 awS376S0200000_10, AwS376S0200000_10 awS376S0200000_102) {
        AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(721);
        this.LL = awS376S0200000_10;
        this.LLILLJJLI = aFwS196S0000000_10;
        this.LLILLL = awS376S0200000_102;
    }
}
