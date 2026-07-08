package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0J9X, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J9X {
    public static void LIZ(Context context) {
        Method declaredMethod;
        LIZIZ(context, 0, "live-app-core-sdk");
        LIZIZ(context, 0, "ttlive_live_user");
        LIZIZ(context, 0, "live_fans_comment_guide");
        LIZIZ(context, 0, "live_fans_club_tips");
        LIZIZ(context, 0, "extra_group");
        LIZIZ(context, 4, "pay_controll");
        LIZIZ(context, 4, "ttlive_sdk_shared_pref_cache");
        try {
            Class<?> cls = Class.forName("com.bytedance.android.livesdk.i18n.I18nDbManager");
            if (cls != null) {
                try {
                    if (context != null) {
                        declaredMethod = cls.getDeclaredMethod("prepareInit", Context.class);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(null, context);
                    } else {
                        declaredMethod = cls.getDeclaredMethod("prepareInit", new Class[0]);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(null, new Object[0]);
                    }
                    declaredMethod.setAccessible(false);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LIZIZ(Context context, int i, String str) {
        if (context != null && str.length() > 0) {
            C810670Vr7.LIZJ(context, i, str);
        }
    }
}
