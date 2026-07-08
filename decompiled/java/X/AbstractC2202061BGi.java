package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.1BGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2202061BGi<T> {
    public abstract C2202081BGk<T> getData();

    public void onDataLoad(T t) {
    }

    public void onDataUnload(T t) {
    }

    public final T getUserScopeObject() {
        InterfaceC461710I8r interfaceC461710I8rLIZ = C0I0B.LJFF.LIZ();
        String curUserId = interfaceC461710I8rLIZ.getCurUserId();
        T t = null;
        if (!interfaceC461710I8rLIZ.isLogin() || curUserId == null || curUserId.length() == 0 || !((t = (T) getData().LIZIZ) == C2202091BGl.LIZ || t == null)) {
            return t;
        }
        C2202081BGk<T> data = getData();
        T tInvoke = data.LIZ.invoke();
        data.LIZIZ = tInvoke;
        onDataLoad(tInvoke);
        return tInvoke;
    }

    public AbstractC2202061BGi() {
        C0I0B.LJFF.LIZ().LIZLLL(new InterfaceC908170Zjz(this) { // from class: X.1BGj
            public final /* synthetic */ AbstractC2202061BGi<T> LL;

            {
                this.LL = this;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if ((i == 1 || i == 2 || i == 3) && z) {
                    AbstractC2202061BGi<T> abstractC2202061BGi = this.LL;
                    C2202081BGk data = abstractC2202061BGi.getData();
                    Object obj = data.LIZIZ;
                    C2202091BGl c2202091BGl = C2202091BGl.LIZ;
                    Object obj2 = null;
                    if (obj != c2202091BGl) {
                        synchronized (data) {
                            try {
                                Object obj3 = data.LIZIZ;
                                data.LIZIZ = null;
                                if (obj3 != c2202091BGl) {
                                    obj2 = obj3;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    abstractC2202061BGi.onDataUnload((T) obj2);
                }
            }
        });
    }
}
