package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0maZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class DialogInterfaceOnDismissListenerC1402050maZ implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws Exception {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1402050maZ dialogInterfaceOnDismissListenerC1402050maZ, DialogInterface dialogInterface) throws Exception {
        String str;
        String aid;
        String uid;
        Aweme aweme;
        User author;
        Aweme aweme2;
        String str2 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParams = (VideoItemParams) dialogInterfaceOnDismissListenerC1402050maZ.l0;
        DialogFragment dialogFragment = null;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) dialogInterfaceOnDismissListenerC1402050maZ.l0;
        if (videoItemParams2 != null && (aweme2 = videoItemParams2.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        VideoItemParams videoItemParams3 = (VideoItemParams) dialogInterfaceOnDismissListenerC1402050maZ.l0;
        if (videoItemParams3 != null && (aweme = videoItemParams3.getAweme()) != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c1358550lSP.getClass();
        C1358550lSP.LIZ(str, aid, uid, abstractC343940De4LJIIJJI);
        T t = ((C259800zU) dialogInterfaceOnDismissListenerC1402050maZ.l1).element;
        if (t != 0) {
            dialogFragment = (DialogFragment) t;
        }
        Dialog dialog = dialogFragment.getDialog();
        if (dialog != null) {
            C2211631BhB.LIZIZ(dialog);
        }
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC1402050maZ.l2;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1402050maZ dialogInterfaceOnDismissListenerC1402050maZ, DialogInterface dialogInterface) throws Exception {
        String str;
        String aid;
        Dialog dialog;
        Aweme aweme;
        User author;
        Aweme aweme2;
        String str2 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParams = (VideoItemParams) dialogInterfaceOnDismissListenerC1402050maZ.l0;
        String uid = null;
        if (videoItemParams != null) {
            str = videoItemParams.mEventType;
        } else {
            str = null;
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) dialogInterfaceOnDismissListenerC1402050maZ.l0;
        if (videoItemParams2 != null && (aweme2 = videoItemParams2.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        VideoItemParams videoItemParams3 = (VideoItemParams) dialogInterfaceOnDismissListenerC1402050maZ.l0;
        if (videoItemParams3 != null && (aweme = videoItemParams3.getAweme()) != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        }
        c1358550lSP.getClass();
        C1358550lSP.LIZ(str, aid, uid, abstractC343940De4LJIIJJI);
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC1402050maZ.l1;
        if (function0 != null) {
            function0.invoke();
        }
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) dialogInterfaceOnDismissListenerC1402050maZ.l2).element;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            C2211631BhB.LIZIZ(dialog);
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1402050maZ dialogInterfaceOnDismissListenerC1402050maZ, DialogInterface dialogInterface) {
        Dialog dialog;
        if (((C1374200lre) dialogInterfaceOnDismissListenerC1402050maZ.l0).LLILLL && (dialog = (Dialog) ((InterfaceC1374230lrh) dialogInterfaceOnDismissListenerC1402050maZ.l1)) != null && dialog.getContext() != null) {
            C1374200lre c1374200lre = (C1374200lre) dialogInterfaceOnDismissListenerC1402050maZ.l0;
            if (!c1374200lre.LLILZ) {
                c1374200lre.LL.extras.putBoolean("ignore_version", true);
                ((InterfaceC1370310llN) dialogInterfaceOnDismissListenerC1402050maZ.l2).LJIILIIL(((Dialog) ((InterfaceC1374230lrh) dialogInterfaceOnDismissListenerC1402050maZ.l1)).getContext(), ((C1374200lre) dialogInterfaceOnDismissListenerC1402050maZ.l0).LL);
            }
        }
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1402050maZ dialogInterfaceOnDismissListenerC1402050maZ, DialogInterface dialogInterface) {
        String str;
        boolean z;
        String string;
        String str2 = TuxSheet._pnsPageId;
        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        if (abstractC343940De4LJIIJJI instanceof C572630Md3) {
            str = "click_function";
        } else if (abstractC343940De4LJIIJJI instanceof C572640Md4) {
            str = "share_video_out";
        } else if (abstractC343940De4LJIIJJI instanceof C1366410lf5) {
            str = "share_video";
        } else if (abstractC343940De4LJIIJJI instanceof C1367950lhZ) {
            str = "click_outside";
        } else if (abstractC343940De4LJIIJJI instanceof C1367520lgs) {
            str = "ai_avatar_share_icon";
        } else if (abstractC343940De4LJIIJJI instanceof C1366420lf6) {
            str = "recommend";
        } else {
            str = "slide_down";
        }
        C786410Ut5.LJJJI("key_dismiss_panel_reason", str, ((C1371590lnR) dialogInterfaceOnDismissListenerC1402050maZ.l0).LJIJJ.extras);
        C1371590lnR c1371590lnR = (C1371590lnR) dialogInterfaceOnDismissListenerC1402050maZ.l0;
        InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
        if (interfaceC1366490lfD != null) {
            interfaceC1366490lfD.LJI((C19EG) dialogInterfaceOnDismissListenerC1402050maZ.l1, c1371590lnR.LJIJJ);
        }
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJ(((SkeletonSharePanelFragment) dialogInterfaceOnDismissListenerC1402050maZ.l2).LLILLJJLI, (C1371590lnR) dialogInterfaceOnDismissListenerC1402050maZ.l0);
        InterfaceC1368120lhq interfaceC1368120lhq = C1370370llT.LJI;
        if (interfaceC1368120lhq != null) {
            interfaceC1368120lhq.LIZJ();
        }
        Bundle arguments = ((SkeletonSharePanelFragment) dialogInterfaceOnDismissListenerC1402050maZ.l2).getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_from_lpp_move_tips");
        } else {
            z = false;
        }
        BaseSharePackage baseSharePackage = null;
        if (z) {
            BaseSharePackage baseSharePackage2 = ((SkeletonSharePanelFragment) dialogInterfaceOnDismissListenerC1402050maZ.l2).LLILLL;
            if (baseSharePackage2 == null) {
                baseSharePackage2 = null;
            }
            String string2 = baseSharePackage2.extras.getString("enter_from", "");
            Bundle arguments2 = ((SkeletonSharePanelFragment) dialogInterfaceOnDismissListenerC1402050maZ.l2).getArguments();
            if (arguments2 != null) {
                string = arguments2.getString("group_id");
            } else {
                string = null;
            }
            C1440005kM.LIZ(new C732620SoW(string, string2));
        }
        SkeletonSharePanelFragment skeletonSharePanelFragment = (SkeletonSharePanelFragment) dialogInterfaceOnDismissListenerC1402050maZ.l2;
        skeletonSharePanelFragment.getClass();
        InterfaceC1366500lfE interfaceC1366500lfE = C1370370llT.LJIIIIZZ;
        if (interfaceC1366500lfE != null) {
            interfaceC1366500lfE.LIZIZ();
        }
        BaseSharePackage baseSharePackage3 = skeletonSharePanelFragment.LLILLL;
        if (baseSharePackage3 != null) {
            baseSharePackage = baseSharePackage3;
        }
        C1369870lkf.LJIILIIL(abstractC343940De4LJIIJJI, baseSharePackage);
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC1402050maZ dialogInterfaceOnDismissListenerC1402050maZ, DialogInterface dialogInterface) {
        ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).stopFpsMonitor("share_panel");
        ((DataCenter) dialogInterfaceOnDismissListenerC1402050maZ.l0).zQ2(Boolean.FALSE, "ENTER_DISLIKE_MODE");
        C19EG activity = ((Fragment) dialogInterfaceOnDismissListenerC1402050maZ.l1).getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            C1372310lob c1372310lob = new C1372310lob(1, activity.hashCode());
            ((C1372170loN) dialogInterfaceOnDismissListenerC1402050maZ.l2).LIZ.LJJLI();
            if (Intrinsics.LJFF("report", "")) {
                c1372310lob.LJI = true;
            }
            C1440005kM.LIZ(c1372310lob);
            C0SHX.LIZ(activity, null).LJIIJJI("long_press_panel", false, null);
        }
        C1440005kM.LIZ(new C739550Szh(false));
    }

    public DialogInterfaceOnDismissListenerC1402050maZ(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
