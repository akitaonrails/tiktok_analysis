package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11Lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19485311Lf extends AbstractC19486711Lt {
    public final C11IV LL;
    public final InterfaceC19483011Ki<? super Throwable> LLILLJJLI;

    public C19485311Lf(C11IV c11iv) {
        C09MN c09mn = C19487811Me.LJI;
        this.LL = c11iv;
        this.LLILLJJLI = c09mn;
    }

    @Override // X.AbstractC19486711Lt
    public final void LJIJJ(final C11IY c11iy) {
        this.LL.LIZIZ(new C11IY(c11iy) { // from class: X.11Le
            public final C11IY LL;

            @Override // X.C11IY
            public final void onComplete() {
                this.LL.onComplete();
            }

            @Override // X.C11IY
            public final void onError(Throwable th) throws Throwable {
                try {
                    if (this.LLILLJJLI.LLILLJJLI.test(th)) {
                        this.LL.onComplete();
                    } else {
                        this.LL.onError(th);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C11SP.LIZ(th2);
                    this.LL.onError(new C0VYA(th, th2));
                }
            }

            @Override // X.C11IY
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL.onSubscribe(interfaceC420801kM);
            }

            {
                this.LL = c11iy;
            }
        });
    }
}
