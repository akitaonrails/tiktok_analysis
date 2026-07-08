package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.keva.KevaImpl;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488560oq6 {
    public static final Map<Class, Object> LIZ = new ConcurrentHashMap();

    public static <T> T LIZ(Context context, Class<T> cls) {
        final Context contextN3;
        if (context != null && (contextN3 = C786410Ut5.N3(context)) != null && cls.isInterface()) {
            if (InterfaceC1488580oq8.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
                T t = (T) concurrentHashMap.get(cls);
                if (t == null || !(t instanceof C1488570oq7)) {
                    T t2 = (T) new InterfaceC1488580oq8(contextN3) { // from class: X.0oq7
                        {
                            KevaImpl.getRepoFromSp(contextN3, "PrivateAlbumSp", 0);
                        }
                    };
                    concurrentHashMap.put(cls, t2);
                    return t2;
                }
                return t;
            }
            if (InterfaceC1255750imb.class.equals(cls)) {
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) LIZ;
                T t3 = (T) concurrentHashMap2.get(cls);
                if (t3 == null || !(t3 instanceof C1488550oq5)) {
                    T t4 = (T) new InterfaceC1255750imb(contextN3) { // from class: X.0oq5
                        public final SharedPreferences LIZ;

                        @Override // X.InterfaceC1255750imb
                        public final void LIZ() {
                            SharedPreferences.Editor editorEdit = this.LIZ.edit();
                            editorEdit.putString("profile_cache_post_list", "");
                            editorEdit.apply();
                        }

                        {
                            this.LIZ = C810670Vr7.LIZJ(contextN3, 0, "ProfilePreferences");
                        }
                    };
                    concurrentHashMap2.put(cls, t4);
                    return t4;
                }
                return t3;
            }
        }
        return null;
    }
}
