package androidx.lifecycle;

import X.C089E;
import X.C13LQ;
import X.C1697810uHb;
import X.C2188811AlT;
import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SavedStateViewModelFactory_androidKt {
    public static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = C1697810uHb.LJIIJJI(Application.class, SavedStateHandle.class);
    public static final List<Class<?>> VIEWMODEL_SIGNATURE = Collections.singletonList(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> cls, List<? extends Class<?>> list) {
        C089E c089e = new C089E(cls.getConstructors());
        while (c089e.hasNext()) {
            Constructor<T> constructor = (Constructor) c089e.next();
            List listLJJLL = C13LQ.LJJLL(constructor.getParameterTypes());
            if (Intrinsics.LJFF(list, listLJJLL)) {
                return constructor;
            }
            if (list.size() == listLJJLL.size() && listLJJLL.containsAll(list)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Class ");
                sbLIZ.append(cls.getSimpleName());
                sbLIZ.append(" must have parameters in the proper order: ");
                sbLIZ.append(list);
                throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to access ");
            sbLIZ.append(cls);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("A ");
            sbLIZ2.append(cls);
            sbLIZ2.append(" cannot be instantiated.");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e2);
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("An exception happened in constructor of ");
            sbLIZ3.append(cls);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3), e3.getCause());
        }
    }
}
