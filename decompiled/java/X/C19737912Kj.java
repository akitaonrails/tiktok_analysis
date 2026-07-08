package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.12Kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19737912Kj {
    public static Rect LIZ(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            return new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C19738112Kl.LIZ(activity);
        }
    }
}
