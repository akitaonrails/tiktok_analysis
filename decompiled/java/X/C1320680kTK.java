package X;

import android.graphics.drawable.Animatable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kTK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1320680kTK<INFO> extends C1320700kTM<INFO> {
    public final List<InterfaceC1320650kTH<? super INFO>> LIZIZ = new ArrayList(2);

    public final synchronized void LJIIL() {
        ((ArrayList) this.LIZIZ).clear();
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final synchronized void LIZIZ(String str) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LIZIZ(str);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL(e);
            }
        }
    }

    public final synchronized void LJIIJJI(InterfaceC1320650kTH<? super INFO> interfaceC1320650kTH) {
        ((ArrayList) this.LIZIZ).add(interfaceC1320650kTH);
    }

    public final synchronized void LJIILIIL(Throwable th) {
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZ(String str, Throwable th) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LIZ(str, th);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                synchronized (this) {
                }
            }
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZJ(Object obj, String str) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LIZJ(obj, str);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                synchronized (this) {
                }
            }
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final synchronized void LIZLLL(String str, Throwable th) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LIZLLL(str, th);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL(e);
            }
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final synchronized void LJFF(Object obj, String str) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LJFF(obj, str);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL(e);
            }
        }
    }

    @Override // X.C1320700kTM
    public final void LJI(C1325710kbR c1325710kbR, long j) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH instanceof C1321250kUF) {
                    ((C1321250kUF) interfaceC1320650kTH).LJI(c1325710kbR, j);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                synchronized (this) {
                }
            }
        }
    }

    @Override // X.C1320700kTM
    public final synchronized void LJIIJ(String str, C1325710kbR c1325710kbR) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH instanceof C1321250kUF) {
                    ((C1321250kUF) interfaceC1320650kTH).LJIIJ(str, c1325710kbR);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL(e);
            }
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final synchronized void LJ(String str, INFO info, Animatable animatable) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH != null) {
                    interfaceC1320650kTH.LJ(str, info, animatable);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL(e);
            }
        }
    }

    @Override // X.C1320700kTM
    public final synchronized void LJII(String str, C1325710kbR c1325710kbR, Throwable th) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH instanceof C1321250kUF) {
                    ((C1321250kUF) interfaceC1320650kTH).LJII(str, c1325710kbR, th);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LJIILIIL(e);
            }
        }
    }

    @Override // X.C1320700kTM
    public final void LJIIIZ(String str, INFO info, Animatable animatable) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH instanceof C1320700kTM) {
                    ((C1320700kTM) interfaceC1320650kTH).LJIIIZ(str, info, animatable);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                synchronized (this) {
                }
            }
        }
    }

    @Override // X.C1320700kTM
    public final void LJIIIIZZ(String str, INFO info, Animatable animatable, C1325710kbR c1325710kbR, Map map) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC1320650kTH interfaceC1320650kTH = (InterfaceC1320650kTH) ((ArrayList) this.LIZIZ).get(i);
                if (interfaceC1320650kTH != null && (interfaceC1320650kTH instanceof C1321250kUF)) {
                    ((C1321250kUF) interfaceC1320650kTH).LJIIIIZZ(str, info, animatable, c1325710kbR, map);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                synchronized (this) {
                }
            }
        }
    }
}
