package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Q4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11Q4<T> extends C11Q3<T, T> implements C11OM<T> {
    public final InterfaceC19483011Ki<? super T> LLILZLL;

    @Override // X.InterfaceC19494911Ox
    public final T poll() {
        InterfaceC19495511Pd<T> interfaceC19495511Pd = this.LLILLL;
        InterfaceC19483011Ki<? super T> interfaceC19483011Ki = this.LLILZLL;
        while (true) {
            T tPoll = interfaceC19495511Pd.poll();
            if (tPoll == null) {
                return null;
            }
            if (interfaceC19483011Ki.test(tPoll)) {
                return tPoll;
            }
            if (this.LLILZIL == 2) {
                interfaceC19495511Pd.request(1L);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C11OM
    public final boolean LIZJ(T t) throws Throwable {
        if (this.LLILZ) {
            return false;
        }
        if (this.LLILZIL != 0) {
            this.LL.onNext(null);
            return true;
        }
        try {
            boolean zTest = this.LLILZLL.test(t);
            if (zTest) {
                this.LL.onNext((Object) t);
            }
            return zTest;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LLILLJJLI.cancel();
            onError(th);
            return true;
        }
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        if (!LIZJ(t)) {
            this.LLILLJJLI.request(1L);
        }
    }

    @Override // X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        return LIZ(i);
    }

    public C11Q4(C11M9<? super T> c11m9, InterfaceC19483011Ki<? super T> interfaceC19483011Ki) {
        super(c11m9);
        this.LLILZLL = interfaceC19483011Ki;
    }
}
