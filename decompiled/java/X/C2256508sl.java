package X;

import android.app.Activity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2256508sl {
    public static final void LIZ(Activity activity, String str, Function1 function1) {
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            C0XPD.LIZIZ(activity, "video_edit_page", str, null, new C2501709rD(function1, 1));
        } else {
            function1.invoke(Boolean.FALSE);
        }
    }
}
