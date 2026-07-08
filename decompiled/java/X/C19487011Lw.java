package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19487011Lw extends AtomicReference<InterfaceC420801kM> implements C11IY, InterfaceC420801kM, C09JN<Throwable> {
    public static final long serialVersionUID = -4361286194466301354L;
    public final C09JN<? super Throwable> LL;
    public final InterfaceC781210Ukh LLILLJJLI;

    public boolean hasCustomOnError() {
        return this.LL != this;
    }

    @Override // X.C11IY
    public void onComplete() throws Throwable {
        try {
            this.LLILLJJLI.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            C19489211Ms.LIZIZ(th);
        }
        lazySet(C11JE.DISPOSED);
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return get() == C11JE.DISPOSED;
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    public C19487011Lw(InterfaceC781210Ukh interfaceC781210Ukh) {
        this.LL = this;
        this.LLILLJJLI = interfaceC781210Ukh;
    }

    @Override // X.C09JN
    public void accept(Throwable th) {
        C19489211Ms.LIZIZ(new C1324280kZ8(th));
    }

    @Override // X.C11IY
    public void onError(Throwable th) throws Throwable {
        try {
            this.LL.accept(th);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            C19489211Ms.LIZIZ(th2);
        }
        lazySet(C11JE.DISPOSED);
    }

    @Override // X.C11IY
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }

    public C19487011Lw(C09JN<? super Throwable> c09jn, InterfaceC781210Ukh interfaceC781210Ukh) {
        this.LL = c09jn;
        this.LLILLJJLI = interfaceC781210Ukh;
    }
}
