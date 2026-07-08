package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.190m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C214698190m implements InterfaceC214697190l {
    public final C214700190o LIZ = new C214700190o();
    public final C214701190p LIZIZ = new C214701190p();
    public final C214699190n LIZJ = new C214699190n();

    @Override // X.InterfaceC214697190l
    public float LIZLLL(View view) {
        this.LIZ.getClass();
        if (!C214700190o.LIZLLL) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                C214700190o.LIZJ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C214700190o.LIZLLL = true;
        }
        Method method = C214700190o.LIZJ;
        if (method != null) {
            try {
                return ((Float) C2204961BRm.a0(method, view, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1avWjRBM6DOGFwCR0ryGcsAPmhDmgPnLtuHclmzUCw99s8WxiqWd+Y2xjmpLVN/mhWjyxb38EiqZ2B6cLVDvJvQ9q3", null))).floatValue();
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return 0.0f;
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new RuntimeException(e3.getCause());
            }
        }
        return 0.0f;
    }

    @Override // X.InterfaceC214697190l
    public void LIZ(View view, float f) {
        this.LIZ.getClass();
        if (!C214700190o.LIZIZ) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                C214700190o.LIZ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C214700190o.LIZIZ = true;
        }
        Method method = C214700190o.LIZ;
        if (method != null) {
            try {
                C2204961BRm.a0(method, view, new Object[]{Float.valueOf(f)}, new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1avWjRBM6DOGFwCR0ryGcsAPmhDmgPnLtuHclmzUCw99s8WxiqWd+Y2xjmpLVN/mhWjyxb38EiqZ2B6cLVDvJvQ9q3", null));
                return;
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new RuntimeException(e3.getCause());
            }
        }
        C786410Ut5.T4(view, f);
    }

    @Override // X.InterfaceC214697190l
    public void LIZIZ(ViewGroup viewGroup, boolean z) {
        this.LIZIZ.getClass();
        if (!C214701190p.LIZIZ) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                C214701190p.LIZ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C214701190p.LIZIZ = true;
        }
        Method method = C214701190p.LIZ;
        if (method != null) {
            try {
                C2204961BRm.a0(method, viewGroup, new Object[]{Boolean.valueOf(z)}, new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1avWjRBM6DOGFwCR0ryGcsAPmhDmgPnLtuHclmzUCw99s8WxiqWd+Y2xjmpLJK73ZXgytB/M4aqpid3eQGcsM=", null));
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // X.InterfaceC214697190l
    public void LJ(View view, Matrix matrix) {
        this.LIZJ.getClass();
        if (!C214699190n.LIZIZ) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                C214699190n.LIZ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C214699190n.LIZIZ = true;
        }
        Method method = C214699190n.LIZ;
        if (method != null) {
            try {
                C2204961BRm.a0(method, view, new Object[]{matrix}, new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1avWjRBM6DOGFwCR0ryGcsAPmhDmgPnLtuHclmzUCw99s8WxiqWd+Y2xjmpLVN/mhWgDdA3eICsZ+A8MWL4plH", null));
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    @Override // X.InterfaceC214697190l
    public void LJFF(View view, Matrix matrix) {
        this.LIZJ.getClass();
        if (!C214699190n.LIZLLL) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setAnimationMatrix", Matrix.class);
                C214699190n.LIZJ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C214699190n.LIZLLL = true;
        }
        Method method = C214699190n.LIZJ;
        if (method != null) {
            try {
                C2204961BRm.a0(method, view, new Object[]{matrix}, new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1avWjRBM6DOGFwCR0ryGcsAPmhDmgPnLtuHclmzUCw99s8WxiqWd+Y2xjmpLVN/mhWgDdA3eICsZ+A8MWL4plH", null));
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException(e2.getCause());
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }
}
