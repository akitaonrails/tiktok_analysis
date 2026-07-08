package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.layout.core.PowerLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: X.19tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21685619tu {
    public Object LIZ;
    public Method LIZIZ;
    public Object LIZJ;
    public Method LIZLLL;
    public final Field LJ;
    public List LJFF;
    public final PowerLayoutManager LJI;
    public final Object[] LJII = new Object[1];

    public final void LIZ() {
        try {
            if (this.LIZ == null) {
                Object obj = this.LJ.get(this.LJI);
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
                    cls.getDeclaredMethod("findHiddenNonRemovedView", cls2, cls2).setAccessible(true);
                } catch (NoSuchMethodException e) {
                    TryCatchGuardChecker.doCheck(e);
                    cls.getDeclaredMethod("findHiddenNonRemovedView", Integer.TYPE).setAccessible(true);
                }
                cls.getDeclaredMethod("isHidden", View.class).setAccessible(true);
                Field declaredField = cls.getDeclaredField("mBucket");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this.LIZ);
                this.LIZJ = obj2;
                Method declaredMethod2 = obj2.getClass().getDeclaredMethod("clear", Integer.TYPE);
                this.LIZLLL = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Field declaredField2 = cls.getDeclaredField("mHiddenViews");
                declaredField2.setAccessible(true);
                this.LJFF = (List) declaredField2.get(this.LIZ);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public C21685619tu(PowerLayoutManager powerLayoutManager) {
        this.LJI = powerLayoutManager;
        try {
            Field declaredField = RecyclerView.LayoutManager.class.getDeclaredField("mChildHelper");
            this.LJ = declaredField;
            declaredField.setAccessible(true);
            LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
