package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19494011Oo<T> extends C11K7<T> implements InterfaceC626120Oh8<T> {
    public static final long serialVersionUID = 4109457741734051389L;
    public final InterfaceC626120Oh8<? super T> LL;
    public final InterfaceC781210Ukh LLILLJJLI;
    public InterfaceC420801kM LLILLL;
    public InterfaceC19495611Pe<T> LLILZ;
    public boolean LLILZIL;

    public final void LIZ() throws Throwable {
        if (compareAndSet(0, 1)) {
            try {
                this.LLILLJJLI.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                C19489211Ms.LIZIZ(th);
            }
        }
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final void clear() {
        this.LLILZ.clear();
    }

    @Override // X.C11K7, X.InterfaceC420801kM
    public final void dispose() throws Throwable {
        this.LLILLL.dispose();
        LIZ();
    }

    @Override // X.C11K7, X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILLL.isDisposed();
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLILZ.isEmpty();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() throws Throwable {
        this.LL.onComplete();
        LIZ();
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final T poll() throws Throwable {
        T tPoll = this.LLILZ.poll();
        if (tPoll == null && this.LLILZIL) {
            LIZ();
        }
        return tPoll;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) throws Throwable {
        this.LL.onError(th);
        LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        this.LL.onNext(t);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLILLL, interfaceC420801kM)) {
            this.LLILLL = interfaceC420801kM;
            if (interfaceC420801kM instanceof InterfaceC19495611Pe) {
                this.LLILZ = (InterfaceC19495611Pe) interfaceC420801kM;
            }
            this.LL.onSubscribe(this);
        }
    }

    @Override // X.C11K7, X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        InterfaceC19495611Pe<T> interfaceC19495611Pe = this.LLILZ;
        boolean z = false;
        if (interfaceC19495611Pe == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = interfaceC19495611Pe.requestFusion(i);
        if (iRequestFusion != 0) {
            if (iRequestFusion == 1) {
                z = true;
            }
            this.LLILZIL = z;
        }
        return iRequestFusion;
    }

    public C19494011Oo(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, InterfaceC781210Ukh interfaceC781210Ukh) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC781210Ukh;
    }
}
