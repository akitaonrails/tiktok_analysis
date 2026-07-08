package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0ruW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606620ruW implements C0ZUN {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(516));

    public static final C310720CFy LIZIZ() {
        return C1E90.LIZIZ.LIZIZ();
    }

    public static final void LIZJ(Context context, String str) {
        Uri uri;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openUrl: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(true);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str != null && str.length() != 0) {
            Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
            try {
                uri = UriProtector.parse(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                uri = null;
            }
            intent.putExtra("sec_link_scene", "im");
            if (uri != null) {
                intent.putExtra("need_sec_link", true);
                intent.putExtra("sec_link_scene", "im");
                intent.putExtra("need_detect_2_jump", true);
                intent.putExtra("safeTemplate", true);
                intent.setData(uri);
                intent.putExtra("enter_from", "chat");
                intent.putExtra("hide_more", false);
                intent.putExtra("use_webview_title", false);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLbbj7zfNKDNna62y1hO/9kozHA==", null));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(android.content.Context r17, java.lang.String r18, java.lang.String r19, int r20, android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1606620ruW.LIZ(android.content.Context, java.lang.String, java.lang.String, int, android.view.View, android.os.Bundle):void");
    }
}
