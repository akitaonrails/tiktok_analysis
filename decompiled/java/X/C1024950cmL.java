package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

/* JADX INFO: renamed from: X.0cmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024950cmL {
    public static final C1024950cmL LIZ = new C1024950cmL();

    public static final boolean LIZ(Context context, String str) {
        if (str == null) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://play.google.com/store/apps/details?id=");
        sbLIZ.append(str);
        intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        C2429209fW.LIZ().appendDataFlowId(intent, "402657282");
        return AbstractC1025070cmX.LJJIIZ(context, intent);
    }
}
