package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07jR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1943907jR {
    public static <T> T LIZ(Context context, Class<T> cls) {
        final Context contextN3;
        if (context != null && (contextN3 = C786410Ut5.N3(context)) != null && cls.isInterface() && C0XUL.class.equals(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1943807jQ.LIZ;
            T t = (T) concurrentHashMap.get(cls);
            if (t == null || !(t instanceof C2114008Py)) {
                T t2 = (T) new C0XUL(contextN3) { // from class: X.08Py
                    public final SharedPreferences LIZ;

                    @Override // X.C0XUL
                    public final boolean LIZ() {
                        return this.LIZ.getBoolean("save_login_info", true);
                    }

                    @Override // X.C0XUL
                    public final String LIZIZ() {
                        return this.LIZ.getString("latest_login_info", "[]");
                    }

                    {
                        this.LIZ = C810670Vr7.LIZJ(contextN3, 0, "LoginSharePreferences");
                    }

                    @Override // X.C0XUL
                    public final void LIZJ(String str) {
                        SharedPreferences.Editor editorEdit = this.LIZ.edit();
                        editorEdit.putString("latest_login_info", str);
                        editorEdit.apply();
                    }
                };
                concurrentHashMap.put(cls, t2);
                return t2;
            }
            return t;
        }
        return null;
    }
}
