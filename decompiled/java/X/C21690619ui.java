package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.19ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21690619ui {
    public static C21690619ui LJIIIZ;
    public static final Object LJIIJ = new Object();
    public final Field LIZ;
    public final Field LIZIZ;
    public final Field LIZJ;
    public final Field LIZLLL;
    public final Method LJ;
    public final Method LJFF;
    public final int LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;

    public C21690619ui() {
        this.LJI = -1;
        this.LJII = -1;
        try {
            SystemClock.elapsedRealtimeNanos();
            Field fieldLIZ = C1959007ls.LIZ(View.class, "mParent");
            this.LIZ = fieldLIZ;
            fieldLIZ.setAccessible(true);
            Field fieldLIZ2 = C1959007ls.LIZ(View.class, "mPrivateFlags");
            this.LIZLLL = fieldLIZ2;
            fieldLIZ2.setAccessible(true);
            C1959007ls.LIZ(View.class, "mPrivateFlags3").setAccessible(true);
            Field fieldLIZ3 = C1959007ls.LIZ(View.class, "mOldWidthMeasureSpec");
            this.LIZIZ = fieldLIZ3;
            fieldLIZ3.setAccessible(true);
            Field fieldLIZ4 = C1959007ls.LIZ(View.class, "mOldHeightMeasureSpec");
            this.LIZJ = fieldLIZ4;
            fieldLIZ4.setAccessible(true);
            C1959007ls.LIZ(View.class, "mAttachInfo").setAccessible(true);
            C1959007ls.LIZ(Class.forName("android.view.View$AttachInfo"), "mViewRequestingLayout").setAccessible(true);
            Class cls = Integer.TYPE;
            Method methodLIZIZ = C1959007ls.LIZIZ(View.class, "onMeasure", cls, cls);
            this.LJ = methodLIZIZ;
            methodLIZIZ.setAccessible(true);
            Method methodLIZIZ2 = C1959007ls.LIZIZ(View.class, "onLayout", Boolean.TYPE, cls, cls, cls, cls);
            this.LJFF = methodLIZIZ2;
            methodLIZIZ2.setAccessible(true);
            Field fieldLIZ5 = C1959007ls.LIZ(View.class, "PFLAG_FORCE_LAYOUT");
            Field fieldLIZ6 = C1959007ls.LIZ(View.class, "PFLAG_LAYOUT_REQUIRED");
            Field fieldLIZ7 = C1959007ls.LIZ(View.class, "PFLAG3_IS_LAID_OUT");
            fieldLIZ5.setAccessible(true);
            fieldLIZ6.setAccessible(true);
            fieldLIZ7.setAccessible(true);
            int i = fieldLIZ5.getInt(View.class);
            this.LJI = i;
            int i2 = fieldLIZ6.getInt(View.class);
            this.LJII = i2;
            int i3 = fieldLIZ7.getInt(View.class);
            SystemClock.elapsedRealtimeNanos();
            if (i == 4096 && i2 == 8192 && i3 == 4) {
                this.LJIIIIZZ = true;
            } else {
                this.LJIIIIZZ = false;
            }
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
