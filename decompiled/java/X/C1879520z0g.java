package X;

import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.0z0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879520z0g {
    public static final String LIZ = C1879520z0g.class.getSimpleName();

    public static IWsClient LIZ(C1879540z0i c1879540z0i) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("org.chromium.wschannel.WsClient");
            if (cls != null) {
                Object objNewInstance = cls.getDeclaredConstructor(IMessageReceiveListener.class).newInstance(c1879540z0i);
                if (!(objNewInstance instanceof IWsClient)) {
                    return null;
                }
                return (IWsClient) objNewInstance;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        throw new ClassNotFoundException("org.chromium.wschannel.WsClient class not found");
    }
}
