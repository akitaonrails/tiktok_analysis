package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08pY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2236608pY {
    public static final List<Field> LIZIZ(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !LIZLLL(cls)) {
            C19719612Di.LJJII(arrayList, cls.getDeclaredFields());
            cls = cls.getSuperclass();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Modifier.isStatic(((Field) obj).getModifiers())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final void LIZJ(Throwable th) throws Throwable {
        if (!(th instanceof C0MY3)) {
            C0CHQ.LIZ().getApplicationService().getClass();
            C1AF0.LJ(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StringFieldAnnotationHandler, --->  ");
            sbLIZ.append(Log.getStackTraceString(th));
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        throw th;
    }

    public static final boolean LIZLLL(Class<?> cls) {
        return Intrinsics.LJFF(cls.getClassLoader(), String.class.getClassLoader());
    }

    public static final Field LIZ(Class<?> cls, String str) throws NoSuchFieldException {
        Field declaredField;
        Class<?> superclass = cls;
        loop0: while (true) {
            declaredField = null;
            while (declaredField == null && superclass != null && !LIZLLL(superclass)) {
                try {
                    declaredField = superclass.getDeclaredField(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    superclass = superclass.getSuperclass();
                }
            }
            break loop0;
        }
        if (declaredField != null) {
            return declaredField;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fieldName : ");
        sbLIZ.append(str);
        sbLIZ.append(" ; for class : ");
        sbLIZ.append(cls.getCanonicalName());
        throw new NoSuchFieldException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
