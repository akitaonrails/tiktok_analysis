package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseFragment;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareFragment;

/* JADX INFO: renamed from: X.0IDV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDV implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
        }
    }

    public C0IDV(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C0IDV c0idv, DialogInterface dialogInterface, int i) throws Throwable {
        String packageName;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("package:");
            C19EG activity = ((MixStudioBaseFragment) c0idv.l0).getActivity();
            if (activity != null) {
                packageName = activity.getPackageName();
            } else {
                packageName = null;
            }
            sbLIZ.append(packageName);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
            intent.addFlags(268435456);
            C19EG activity2 = ((MixStudioBaseFragment) c0idv.l0).getActivity();
            if (activity2 != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Activity_startActivityForResult_2");
                C1701330uNH.LIZ(intent, activity2);
                C2204961BRm.LLJJJJJIL(20002, intent, activity2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0DPP/MoJBwQCsbA87ez4xhfL6bjtEBItUFRSnTB6RmqpgEerhOun+JulCRVn1GCbHQ==", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0W79.LIZLLL(((MixStudioBaseFragment) c0idv.l0).getActivity());
        }
    }

    public static final void onClick$1(C0IDV c0idv, DialogInterface dialogInterface, int i) throws Throwable {
        String packageName;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("package:");
            C19EG activity = ((MixStudioShareFragment) c0idv.l0).getActivity();
            if (activity != null) {
                packageName = activity.getPackageName();
            } else {
                packageName = null;
            }
            sbLIZ.append(packageName);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
            intent.addFlags(268435456);
            C19EG activity2 = ((MixStudioShareFragment) c0idv.l0).getActivity();
            if (activity2 != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, intent, "Activity_startActivityForResult_2");
                C1701330uNH.LIZ(intent, activity2);
                C2204961BRm.LLJJJJJIL(20002, intent, activity2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0DPP/MoJBwQCsbA87ez4xhfL/KLtDxJ0ck9B4AlmWlCypg370A53NZC7TwWyYg==", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0W79.LIZLLL(((MixStudioShareFragment) c0idv.l0).getActivity());
        }
    }
}
