package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.14SP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14SP {
    public static final boolean LIZ;
    public static final Method LIZIZ;
    public static final Field LIZJ;
    public static final Field LIZLLL;
    public static final Field LJ;
    public static final Field LJFF;

    static {
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            Method method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            try {
                Field field = cls.getField("left");
                try {
                    Field field2 = cls.getField("top");
                    try {
                        Field field3 = cls.getField("right");
                        try {
                            Field field4 = cls.getField("bottom");
                            LIZIZ = method;
                            LIZJ = field;
                            LIZLLL = field2;
                            LJ = field3;
                            LJFF = field4;
                            LIZ = true;
                        } catch (ClassNotFoundException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            LIZIZ = null;
                            LIZJ = null;
                            LIZLLL = null;
                            LJ = null;
                            LJFF = null;
                            LIZ = false;
                        } catch (NoSuchFieldException e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                            LIZIZ = null;
                            LIZJ = null;
                            LIZLLL = null;
                            LJ = null;
                            LJFF = null;
                            LIZ = false;
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            TryCatchGuardChecker.doCheck(e);
                            LIZIZ = null;
                            LIZJ = null;
                            LIZLLL = null;
                            LJ = null;
                            LJFF = null;
                            LIZ = false;
                        }
                    } catch (ClassNotFoundException e4) {
                        e = e4;
                    } catch (NoSuchFieldException e5) {
                        e = e5;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                    }
                } catch (ClassNotFoundException e7) {
                    e = e7;
                } catch (NoSuchFieldException e8) {
                    e = e8;
                } catch (NoSuchMethodException e9) {
                    e = e9;
                }
            } catch (ClassNotFoundException e10) {
                e = e10;
            } catch (NoSuchFieldException e11) {
                e = e11;
            } catch (NoSuchMethodException e12) {
                e = e12;
            }
        } catch (ClassNotFoundException e13) {
            e = e13;
        } catch (NoSuchFieldException e14) {
            e = e14;
        } catch (NoSuchMethodException e15) {
            e = e15;
        }
    }
}
