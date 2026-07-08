package X;

import android.content.res.XmlBlock;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07nz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1972107nz {
    public static volatile Constructor<?> LIZ;
    public static volatile Method LIZIZ;

    public static AttributeSet LIZIZ(byte[] bArr) {
        return new XmlBlock(bArr).newParser();
    }

    public static Method LIZJ() {
        Method declaredMethod;
        Method method = LIZIZ;
        if (method != null) {
            return method;
        }
        synchronized (C1972107nz.class) {
            try {
                declaredMethod = LIZIZ;
                if (declaredMethod == null) {
                    declaredMethod = Class.forName("android.content.res.XmlBlock").getDeclaredMethod("newParser", new Class[0]);
                    LIZIZ = declaredMethod;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return declaredMethod;
    }

    public C1972107nz() {
        throw new IllegalStateException("can not be instanced.");
    }

    public static AttributeSet LIZ(byte[] bArr) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor<?> constructor = LIZ;
        if (constructor == null) {
            synchronized (C1972107nz.class) {
                try {
                    constructor = LIZ;
                    if (constructor == null) {
                        constructor = Class.forName("android.content.res.XmlBlock").getConstructor(byte[].class);
                        LIZ = constructor;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        constructor.setAccessible(true);
        Object objNewInstance = constructor.newInstance(bArr);
        Method methodLIZJ = LIZJ();
        methodLIZJ.setAccessible(true);
        return (AttributeSet) C2204961BRm.a0(methodLIZJ, objNewInstance, new Object[0], new C0WZX("dTF6Tg0zW4TfWlk1QByQKGFwL0+1i13UtdbIlQIq6KQvLNN23IyTYOzQPBvLylJdP+I=", null));
    }
}
