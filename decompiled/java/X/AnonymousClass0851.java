package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: X.0851, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0851 {
    public static Object LIZ(Constructor<?> constructor, Object... objArr) {
        boolean z;
        if (C0WP5.LIZ && C0WP5.LJIIIIZZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                if (constructor.getDeclaringClass() == Handler.class) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE && objArr.length == 1) {
                        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
                        BPEAHandler bPEAHandler = new BPEAHandler();
                        if (zBooleanValue) {
                            bPEAHandler.makeAsynchronous();
                        }
                        return bPEAHandler;
                    }
                    if (parameterTypes.length == 2 && objArr.length == 2 && parameterTypes[0] == Handler.Callback.class && parameterTypes[1] == Boolean.TYPE) {
                        Handler.Callback callback = (Handler.Callback) objArr[0];
                        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                        BPEAHandler bPEAHandler2 = new BPEAHandler(callback);
                        if (zBooleanValue2) {
                            bPEAHandler2.makeAsynchronous();
                        }
                        return bPEAHandler2;
                    }
                    if (parameterTypes.length == 3 && objArr.length == 3 && parameterTypes[0] == Looper.class && parameterTypes[1] == Handler.Callback.class && parameterTypes[2] == Boolean.TYPE) {
                        Looper looper = (Looper) objArr[0];
                        Handler.Callback callback2 = (Handler.Callback) objArr[1];
                        boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                        BPEAHandler bPEAHandler3 = new BPEAHandler(looper, callback2);
                        if (zBooleanValue3) {
                            bPEAHandler3.makeAsynchronous();
                        }
                        return bPEAHandler3;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return constructor.newInstance(objArr);
    }
}
