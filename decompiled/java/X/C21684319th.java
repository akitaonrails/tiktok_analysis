package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: X.19th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21684319th {
    public Object LIZ;
    public Method LIZIZ;
    public Method LIZJ;
    public Method LIZLLL;
    public Method LJ;
    public Field LJFF;
    public Object LJI;
    public Method LJII;
    public final Field LJIIIIZZ;
    public List LJIIIZ;
    public final RecyclerView.LayoutManager LJIIJ;
    public final Object[] LJIIJJI = new Object[1];
    public final /* synthetic */ ExposeLinearLayoutManagerEx LJIIL;

    public final void LIZ() {
        try {
            if (this.LIZ == null) {
                Object obj = this.LJIIIIZZ.get(this.LJIIJ);
                this.LIZ = obj;
                if (obj == null) {
                    return;
                }
                Class<?> cls = obj.getClass();
                Method declaredMethod = cls.getDeclaredMethod("hide", View.class);
                this.LIZIZ = declaredMethod;
                declaredMethod.setAccessible(true);
                try {
                    Class<?> cls2 = Integer.TYPE;
                    Method declaredMethod2 = cls.getDeclaredMethod("findHiddenNonRemovedView", cls2, cls2);
                    this.LIZJ = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    TryCatchGuardChecker.doCheck(e);
                    Method declaredMethod3 = cls.getDeclaredMethod("findHiddenNonRemovedView", Integer.TYPE);
                    this.LIZLLL = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Method declaredMethod4 = cls.getDeclaredMethod("isHidden", View.class);
                this.LJ = declaredMethod4;
                declaredMethod4.setAccessible(true);
                Field declaredField = cls.getDeclaredField("mBucket");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this.LIZ);
                this.LJI = obj2;
                Method declaredMethod5 = obj2.getClass().getDeclaredMethod("clear", Integer.TYPE);
                this.LJII = declaredMethod5;
                declaredMethod5.setAccessible(true);
                Field declaredField2 = cls.getDeclaredField("mHiddenViews");
                this.LJFF = declaredField2;
                declaredField2.setAccessible(true);
                this.LJIIIZ = (List) this.LJFF.get(this.LIZ);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final void LIZIZ(View view) throws Throwable {
        try {
            LIZ();
            if (this.LJIIIZ.indexOf(view) < 0) {
                Object[] objArr = this.LJIIJJI;
                objArr[0] = view;
                C2204961BRm.a0(this.LIZIZ, this.LIZ, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KYwkfTaHYJk/j45QfBpnaHO5k4gTCIlNDMKvFsFXHHhiCZzguH+", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C21684319th(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx, RecyclerView.LayoutManager layoutManager) {
        this.LJIIL = exposeLinearLayoutManagerEx;
        this.LJIIJ = layoutManager;
        try {
            Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mChildHelper");
            this.LJIIIIZZ = declaredField;
            declaredField.setAccessible(true);
            LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
