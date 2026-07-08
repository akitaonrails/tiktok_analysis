package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06Vv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1619706Vv {
    public static final C1619706Vv LIZ = new C1619706Vv();

    public static void LIZ(Context context, String str, String str2, String str3, String str4) {
        C06IM.LIZ.getClass();
        if (!C06IM.LIZJ()) {
            return;
        }
        String string = a0.LJLIIIL(str).toString();
        if (string.length() != 0 && SmartRouter.canOpen(string)) {
            SmartRouter.buildRoute(context, string).open();
            C1619406Vs.LIZ.getClass();
            if (C06IM.LIZJ()) {
                String string2 = a0.LJLIIIL(str2).toString();
                String string3 = a0.LJLIIIL(str3).toString();
                if (string2.length() != 0 && string3.length() != 0) {
                    C1619406Vs.LIZLLL = new C1619806Vw(string2, string3, str4, System.currentTimeMillis());
                }
            }
        }
    }
}
