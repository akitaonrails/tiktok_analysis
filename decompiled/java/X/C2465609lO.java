package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;

/* JADX INFO: renamed from: X.09lO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2465609lO extends AbstractRunnableC2463509l3 {
    public final /* synthetic */ C835520Wq6 LLILLJJLI;
    public final /* synthetic */ AbstractRunnableC2463509l3 LLILLL;
    public final /* synthetic */ C2465209lK LLILZ;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractRunnableC2463509l3
    public final void LIZIZ() {
        synchronized (this.LLILZ.LJFF) {
            try {
                final C2465209lK c2465209lK = this.LLILZ;
                final C835520Wq6 c835520Wq6 = this.LLILLJJLI;
                ((HashSet) c2465209lK.LJ).add(c835520Wq6);
                c835520Wq6.LIZ.LIZIZ((InterfaceC834580Woa<TResult>) new InterfaceC834580Woa() { // from class: X.09lQ
                    @Override // X.InterfaceC834580Woa
                    public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                        C2465209lK c2465209lK2 = c2465209lK;
                        C835520Wq6 c835520Wq62 = c835520Wq6;
                        synchronized (c2465209lK2.LJFF) {
                            try {
                                ((HashSet) c2465209lK2.LJ).remove(c835520Wq62);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                });
                if (this.LLILZ.LJIIJ.getAndIncrement() > 0) {
                    this.LLILZ.LIZIZ.LIZJ("Already connected to the service.", new Object[0]);
                }
                C2465209lK.LIZIZ(this.LLILZ, this.LLILLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2465609lO(C2465209lK c2465209lK, C835520Wq6 c835520Wq6, C835520Wq6 c835520Wq62, AbstractRunnableC2463509l3 abstractRunnableC2463509l3) {
        super(c835520Wq6);
        this.LLILZ = c2465209lK;
        this.LLILLJJLI = c835520Wq62;
        this.LLILLL = abstractRunnableC2463509l3;
    }
}
