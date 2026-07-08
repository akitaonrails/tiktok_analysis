package X;

import android.os.Build;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.088k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20684088k {
    public static void LIZ() throws Throwable {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object objInvoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mRoots");
            declaredField.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField.get(objInvoke);
            Field declaredField2 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mView");
            declaredField2.setAccessible(true);
            Field declaredField3 = View.class.getDeclaredField("mRenderNode");
            declaredField3.setAccessible(true);
            Method methodLJIILIIL = C791390V2r.LJIILIIL(Build.VERSION.SDK_INT > 28 ? Class.forName("android.graphics.RenderNode") : Class.forName("android.view.RenderNode"), new Class[0]);
            for (int i = 0; i < arrayList.size(); i++) {
                C2204961BRm.a0(methodLJIILIIL, declaredField3.get(declaredField2.get(arrayList.get(i))), new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++d6h9wTkbzMBF2mJcg==", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
