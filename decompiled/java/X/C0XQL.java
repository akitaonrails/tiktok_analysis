package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.router.SmartRouter;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0XQL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XQL {
    public static boolean LIZ(C0XQG c0xqg, C0XZV c0xzv) {
        C0XQF.LIZJ = new WeakReference<>(c0xqg);
        Activity fragmentActivity = c0xqg.getFragmentActivity();
        if (fragmentActivity == null) {
            return false;
        }
        String strOptString = c0xzv.LJII.optJSONObject("data").optString("webapp_url");
        if (TextUtils.isEmpty(strOptString)) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentActivity);
            c1389890mGx.LJIIIZ(2131834217);
            c1389890mGx.LJIIJJI();
        }
        SmartRouter.buildRoute(fragmentActivity, strOptString).open();
        return true;
    }
}
