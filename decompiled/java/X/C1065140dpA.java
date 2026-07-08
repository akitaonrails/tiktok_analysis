package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.util.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ISandboxService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065140dpA {
    public static void LIZ(Activity activity, Map map) {
        boolean z;
        String str;
        Object c098200Yq;
        String str2;
        String str3 = (String) map.get("pid");
        boolean z2 = true;
        if (str3 == null) {
            str3 = "lemon8_intro_default";
            z = true;
        } else {
            z = false;
        }
        String str4 = (String) map.get("amp_extra");
        if (str4 == null) {
            str4 = "";
        } else {
            z2 = false;
        }
        if (z || z2) {
            C1065120dp8.LIZJ(C1065120dp8.LIZ, str3, "error_miss_param", null, Boolean.FALSE, Boolean.valueOf(z), Boolean.valueOf(z2), null, 136);
        }
        StringBuilder sb = new StringBuilder("pid=");
        sb.append(str3);
        sb.append("&amp_extra=");
        sb.append(Uri.encode(str4));
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && (str2 = (String) map.get("advertising_id")) != null) {
            sb.append("&advertising_id=");
            sb.append(str2);
        }
        String str5 = C1065200dpG.LIZ().lemon8OneLink;
        if (a0.LJJIIZI(str5, "?", false)) {
            str = str5 + '&' + ((Object) sb);
        } else {
            str = str5 + '?' + ((Object) sb);
        }
        Logger.d("Lemon8AppIntro", "[OneLinkOpenStrategy] finalSchema: " + str);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
            ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
            if (iSandboxServiceLIZ != null) {
                iSandboxServiceLIZ.appendDataFlowId(intent, 1207962113);
            }
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatbpDAkjurH+WqEV2PXjx93UPQBTpi7TwqnYXpuCjoJMgxPMXuTeo=", null));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1065120dp8.LIZJ(C1065120dp8.LIZ, str3, "error_open_onelink", thM5exceptionOrNullimpl.getMessage(), null, null, null, null, 240);
            Logger.d("Lemon8AppIntro", "[OneLinkOpenStrategy] openLemon8App start activity failed " + thM5exceptionOrNullimpl.getMessage());
            C2344809Gs.LJI(thM5exceptionOrNullimpl);
        }
    }
}
