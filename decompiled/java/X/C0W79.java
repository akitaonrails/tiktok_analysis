package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0W79, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W79 {
    public static final List<Intent> LIZ = new ArrayList();

    public static Intent LIZIZ(Context context) {
        boolean z = false;
        try {
            String strTrim = C2105708Mt.LIZ("ro.miui.ui.version.name").trim();
            if (strTrim != null && !strTrim.isEmpty()) {
                if (CastIntegerProtector.valueOf(strTrim.substring(1)).intValue() >= 12) {
                    z = true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (z) {
            return null;
        }
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3 A[Catch: Exception -> 0x00fc, TryCatch #0 {Exception -> 0x00fc, blocks: (B:9:0x008e, B:11:0x009c, B:13:0x00a2, B:14:0x00a8, B:16:0x00ae, B:18:0x00ba, B:19:0x00bd, B:21:0x00c3, B:22:0x00cf, B:24:0x00d8, B:27:0x00df, B:29:0x00e7), top: B:42:0x008e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W79.LIZLLL(android.content.Context):void");
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhS4r9t+CRS0kFDv6mTkkvpSIYr46Gk=", null));
    }

    public static boolean LIZJ(Context context, Intent intent) {
        ActivityInfo activityInfo;
        if (context != null && intent != null) {
            try {
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 1);
                if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
                    return false;
                }
                return activityInfo.exported;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
