package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.09fu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2431609fu {
    public static final C2431609fu LIZ = new C2431609fu();

    public static void LIZ(Context context, String str, boolean z) {
        Object c098200Yq;
        Activity activityLIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ;
        String packageName = context.getPackageName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://play.google.com/d?id=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C10SW.LIZ.getClass();
        C10SW.LJIIJJI("shortcut_open_gp");
        try {
            if (C085T.LIZ(context) != null || ((abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (context = abstractC1387200mCcLJ.LIZIZ()) != null)) {
                activityLIZ = C085T.LIZ(context);
            } else {
                activityLIZ = null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("com.android.vending");
            intent.setData(UriProtector.parse(strLIZIZ));
            intent.putExtra("overlay", z);
            intent.putExtra("callerId", packageName);
            if (activityLIZ != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intent, "Activity_startActivityForResult_2");
                C1701330uNH.LIZ(intent, activityLIZ);
                C2204961BRm.LJIIZILJ(0, activityLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+vLYzG0yA0HpWX1EK2AxN9ZlY7z3P4j+1iBxnCpgR3FyCfsQ8=", null));
            }
            C10SW.LJIIJJI("shortcut_open_gp_success");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C10SW.LIZ.getClass();
            C10SW.LJIIJJI("shortcut_open_gp_failed");
        }
    }
}
