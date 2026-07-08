package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0HdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445380HdI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context) {
        Activity activityLIZ;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        C457760HxG.LIZ(activityLIZ);
    }

    public static void LIZIZ(View view) {
        Context context;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        LIZ(context);
    }
}
