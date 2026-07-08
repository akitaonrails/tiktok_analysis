package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: X.0mUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398530mUt {
    public static final C1398530mUt LIZ = new C1398530mUt();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r3) {
        /*
            java.lang.String r1 = "is_story_page"
            r2 = 0
            if (r3 == 0) goto L37
            android.app.Activity r0 = X.C1388190mED.LIZ(r3)
            if (r0 == 0) goto L22
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L22
            boolean r0 = r0.getBooleanExtra(r1, r2)
            if (r0 == 0) goto L20
            boolean r0 = LIZIZ(r3)
            if (r0 == 0) goto L20
            java.lang.String r0 = "story_immersive_anchor"
            return r0
        L20:
            if (r3 == 0) goto L37
        L22:
            android.app.Activity r0 = X.C1388190mED.LIZ(r3)
            if (r0 == 0) goto L37
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L37
            boolean r0 = r0.getBooleanExtra(r1, r2)
            if (r0 == 0) goto L37
            java.lang.String r0 = "post_immersive_anchor"
            return r0
        L37:
            java.lang.String r1 = "is_friend_page"
            if (r3 == 0) goto L6d
            android.app.Activity r0 = X.C1388190mED.LIZ(r3)
            if (r0 == 0) goto L58
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L58
            boolean r0 = r0.getBooleanExtra(r1, r2)
            if (r0 == 0) goto L56
            boolean r0 = LIZIZ(r3)
            if (r0 == 0) goto L56
            java.lang.String r0 = "story_friends_feed_anchor"
            return r0
        L56:
            if (r3 == 0) goto L6d
        L58:
            android.app.Activity r0 = X.C1388190mED.LIZ(r3)
            if (r0 == 0) goto L6d
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L6d
            boolean r0 = r0.getBooleanExtra(r1, r2)
            if (r0 == 0) goto L6d
            java.lang.String r0 = "post_friends_feed_anchor"
            return r0
        L6d:
            java.lang.String r0 = "click_prop_publish"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398530mUt.LIZ(android.content.Context):java.lang.String");
    }

    public static boolean LIZIZ(Context context) {
        Activity activityLIZ;
        Intent intent;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || (intent = activityLIZ.getIntent()) == null) {
            return false;
        }
        return intent.getBooleanExtra("story type", false);
    }
}
