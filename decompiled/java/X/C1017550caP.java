package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0caP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017550caP {
    public static boolean LIZ(Context context, Aweme aweme) {
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        return LIZIZ(context, aweme.getAwemeRawAd().getWebUrl());
    }

    public static boolean LIZIZ(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        String path = UriProtector.parse(str).getPath();
        if (TextUtils.isEmpty(path) || !path.endsWith(".apk")) {
            return false;
        }
        String string = context.getString(2131826352);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
            return true;
        }
        return true;
    }
}
