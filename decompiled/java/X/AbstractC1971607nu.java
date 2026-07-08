package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.p;
import com.google.gson.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1971607nu {
    public static final AbstractC1971607nu LIZ;

    public abstract void LIZ(AccessibleObject accessibleObject);

    static {
        LIZ = p.LIZ < 9 ? new AbstractC1971607nu() { // from class: X.07nt
            @Override // X.AbstractC1971607nu
            public final void LIZ(AccessibleObject accessibleObject) {
                accessibleObject.setAccessible(true);
            }
        } : new AbstractC1971607nu() { // from class: X.07ns
            public static Class LIZLLL;
            public final Object LIZIZ;
            public final Field LIZJ;

            {
                Object obj;
                Field declaredField = null;
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    LIZLLL = cls;
                    Field declaredField2 = cls.getDeclaredField("theUnsafe");
                    declaredField2.setAccessible(true);
                    obj = declaredField2.get(null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                }
                this.LIZIZ = obj;
                try {
                    declaredField = AccessibleObject.class.getDeclaredField("override");
                } catch (NoSuchFieldException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                this.LIZJ = declaredField;
            }

            @Override // X.AbstractC1971607nu
            public final void LIZ(AccessibleObject accessibleObject) {
                if (this.LIZIZ != null && this.LIZJ != null) {
                    try {
                        LIZLLL.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.LIZIZ, accessibleObject, Long.valueOf(((Long) LIZLLL.getMethod("objectFieldOffset", Field.class).invoke(this.LIZIZ, this.LIZJ)).longValue()), Boolean.TRUE);
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                try {
                    accessibleObject.setAccessible(true);
                } catch (SecurityException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Gson couldn't modify fields for ");
                    sbLIZ.append(accessibleObject);
                    sbLIZ.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                    throw new l(C2188811AlT.LIZIZ(sbLIZ), e2);
                }
            }
        };
    }
}
