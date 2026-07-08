package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0INr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465610INr {
    public static void LIZ(int i) {
        String str;
        if (i == 1) {
            str = "anchor_linkmic_red_dot_shown";
        } else {
            str = "guest_linkmic_red_dot_shown";
        }
        Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
        if (context != null) {
            C1305440k4k c1305440k4kLIZIZ = C1305440k4k.LIZIZ(context);
            c1305440k4kLIZIZ.LJII(Boolean.TRUE, str);
            c1305440k4kLIZIZ.LIZ();
        }
    }
}
