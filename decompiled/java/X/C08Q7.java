package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import jv6.a;

/* JADX INFO: renamed from: X.08Q7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08Q7 {
    public static boolean LIZ = true;
    public static boolean LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0111, code lost:
    
        if (r0 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08Q7.LIZIZ():void");
    }

    public static void LIZ(Context context) {
        if (!LIZIZ) {
            try {
                Reflect.on(Reflect.on("android.webkit.WebViewDelegate").create().get()).call("addWebViewAssetPath", new Class[]{Context.class}, context);
                C1697630uHJ.LIZJ(context);
                for (Activity activity : ActivityStack.getActivityStack()) {
                    C1697630uHJ.LIZJ(activity);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                a.LIZLLL(context);
                C20250514Ln.LIZ.getClass();
                C20250514Ln.LIZIZ(context);
                for (Activity activity2 : ActivityStack.getActivityStack()) {
                    a.LIZLLL(activity2);
                    C20250514Ln.LIZ.getClass();
                    C20250514Ln.LIZIZ(activity2);
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZIZ = true;
        }
    }
}
