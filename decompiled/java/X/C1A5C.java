package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.gesture.GestureControllerSettings;
import java.lang.reflect.Field;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1A5C, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5C {
    public static Field LIZ;
    public static Field LIZIZ;
    public static Field LIZJ;
    public static Class<?> LIZLLL;
    public static Class<?> LJ;
    public static Class<?> LJFF;
    public static boolean LJI;
    public static Integer LJII;
    public static Integer LJIIIIZZ;

    public static int LIZJ() {
        Integer num = LJIIIIZZ;
        if (num != null) {
            return num.intValue();
        }
        C844470XAv.LIZ.getClass();
        return C418440Gaw.LIZJ(C844470XAv.LIZ());
    }

    public static int LIZLLL() {
        Integer num = LJII;
        if (num != null) {
            return num.intValue();
        }
        C844470XAv.LIZ.getClass();
        return C418440Gaw.LIZLLL(C844470XAv.LIZ());
    }

    public static boolean LIZIZ(C1A5D c1a5d) {
        String name;
        C844470XAv.LIZ.getClass();
        if (!TextUtils.equals(C844470XAv.LJIILL, "local_test")) {
            return false;
        }
        String strLIZ = c1a5d.LIZ(true);
        View.OnTouchListener onTouchListener = c1a5d.LJ;
        String name2 = null;
        if (onTouchListener != null) {
            name = onTouchListener.getClass().getName();
        } else {
            name = null;
        }
        View.OnClickListener onClickListener = c1a5d.LIZLLL;
        if (onClickListener != null) {
            name2 = onClickListener.getClass().getName();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        if (name == null) {
            name = "";
        }
        sbLIZ.append(name);
        sbLIZ.append('/');
        if (name2 == null) {
            name2 = "";
        }
        sbLIZ.append(name2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Iterator<T> it2 = GestureControllerSettings.LJIILIIL.iterator();
        while (it2.hasNext()) {
            if (a0.LJJIIZI(strLIZIZ, (String) it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static View.OnClickListener LJ(View.OnClickListener onClickListener) {
        C844470XAv.LIZ.getClass();
        if (TextUtils.equals(C844470XAv.LJIILL, "local_test")) {
            try {
                Class<?> cls = LIZLLL;
                if (cls != null && cls.isInstance(onClickListener)) {
                    Field declaredField = cls.getDeclaredField("listener");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(onClickListener);
                    if (obj instanceof View.OnClickListener) {
                        onClickListener = (View.OnClickListener) obj;
                    } else {
                        onClickListener = null;
                    }
                    Class<?> cls2 = LJ;
                    if (cls2 != null && cls2.isInstance(onClickListener)) {
                        Field declaredField2 = cls2.getDeclaredField("originalListener");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(onClickListener);
                        if (!(obj2 instanceof View.OnClickListener)) {
                            return null;
                        }
                        return (View.OnClickListener) obj2;
                    }
                }
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return onClickListener;
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (NoSuchFieldException e3) {
                TryCatchGuardChecker.doCheck(e3);
                return onClickListener;
            }
        }
        return onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1A5D LJFF(android.view.View r14) throws java.lang.NoSuchFieldException {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A5C.LJFF(android.view.View):X.1A5D");
    }

    public static boolean LIZ(C1A5L c1a5l, C1A5D c1a5d) {
        if (LIZIZ(c1a5d)) {
            return true;
        }
        if (c1a5l != null && C2271391DvN.LIZJ(c1a5l.LIZ) && c1a5l.LJFF) {
            return true;
        }
        return false;
    }
}
