package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1779230wOv implements InterfaceC1779210wOt {
    public transient C2256361DTe mCallbacks;

    public void notifyChange() {
        synchronized (this) {
            try {
                C2256361DTe c2256361DTe = this.mCallbacks;
                if (c2256361DTe == null) {
                    return;
                }
                c2256361DTe.LIZLLL(0, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1DTe] */
    @Override // X.InterfaceC1779210wOt
    public void addOnPropertyChangedCallback(AbstractC1779220wOu abstractC1779220wOu) {
        synchronized (this) {
            try {
                if (this.mCallbacks == null) {
                    this.mCallbacks = new C1324130kYt<AbstractC1779220wOu, InterfaceC1779210wOt, Void>() { // from class: X.1DTe
                        public static final C2256351DTd LLILZLL = new AbstractC1324140kYu<AbstractC1779220wOu, InterfaceC1779210wOt, Void>() { // from class: X.1DTd
                            @Override // X.AbstractC1324140kYu
                            public final void LIZ(int i, Object obj, Object obj2) {
                                ((AbstractC1779220wOu) obj).LIZJ(i, (InterfaceC1779210wOt) obj2);
                            }
                        };

                        {
                            C2256351DTd c2256351DTd = LLILZLL;
                        }
                    };
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZ(abstractC1779220wOu);
    }

    public void notifyPropertyChanged(int i) {
        synchronized (this) {
            try {
                C2256361DTe c2256361DTe = this.mCallbacks;
                if (c2256361DTe == null) {
                    return;
                }
                c2256361DTe.LIZLLL(i, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1779210wOt
    public void removeOnPropertyChangedCallback(AbstractC1779220wOu abstractC1779220wOu) {
        synchronized (this) {
            try {
                C2256361DTe c2256361DTe = this.mCallbacks;
                if (c2256361DTe == null) {
                    return;
                }
                c2256361DTe.LJFF(abstractC1779220wOu);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
