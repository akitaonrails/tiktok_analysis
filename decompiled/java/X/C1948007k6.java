package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07k6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1948007k6 {
    public static final Map<Class, Object> LIZ = new ConcurrentHashMap();

    public static <T> T LIZ(Context context, Class<T> cls) {
        final Context contextN3;
        if (context == null || (contextN3 = C786410Ut5.N3(context)) == null || !cls.isInterface() || !InterfaceC1070550dxt.class.equals(cls)) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null || !(t instanceof C1948107k7)) {
            T t2 = (T) new InterfaceC1070550dxt(contextN3) { // from class: X.07k7
                public final Keva LIZ;

                @Override // X.InterfaceC1070550dxt
                public final void LIZ() {
                    this.LIZ.storeBoolean("read_contact_denied", false);
                }

                {
                    this.LIZ = KevaImpl.getRepoFromSp(contextN3, "FriendsSharePreferences", 0);
                }
            };
            concurrentHashMap.put(cls, t2);
            return t2;
        }
        return t;
    }
}
