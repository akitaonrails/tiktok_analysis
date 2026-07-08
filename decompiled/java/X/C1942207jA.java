package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;

/* JADX INFO: renamed from: X.07jA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1942207jA {
    public static final void LIZ(Context context, String str) {
        SmartRouter.buildRoute(context, UriProtector.parse("aweme://webview/").buildUpon().appendQueryParameter("url", UriProtector.parse(str).buildUpon().build().toString()).build().toString()).open();
    }
}
