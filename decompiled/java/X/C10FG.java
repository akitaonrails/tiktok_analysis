package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.settings.ICommentFilterSettingsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.10FG, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10FG {
    public static final C10FG LIZ = new C10FG();
    public static final List<C10FJ> LIZIZ;
    public static C10FJ LIZJ;
    public static final C01GW LIZLLL;

    static {
        C10FJ c10fj;
        C10FJ c10fj2;
        C10FJ c10fj3;
        C10FJ c10fj4;
        C10FJ c10fj5;
        ArrayList arrayList = new ArrayList();
        LIZIZ = arrayList;
        arrayList.addAll(C19296410eQ.LIZIZ.providePushSettingCallbackList());
        ICommentFilterSettingsService.LIZ.getClass();
        ICommentFilterSettingsService iCommentFilterSettingsService = (ICommentFilterSettingsService) PluggableExtentionKt.pluggableSpi$default(ICommentFilterSettingsService.class, false, false, false, 14, null);
        if (iCommentFilterSettingsService == null) {
            iCommentFilterSettingsService = new ICommentFilterSettingsService() { // from class: X.10FL
                @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.settings.ICommentFilterSettingsService
                public final Object LIZ() {
                    return null;
                }
            };
        }
        Object objLIZ = iCommentFilterSettingsService.LIZ();
        if ((objLIZ instanceof C10FJ) && (c10fj5 = (C10FJ) objLIZ) != null) {
            LIZJ(c10fj5);
        }
        Object pushSettingCallback = C2277881EDy.LIZIZ.getPushSettingCallback();
        if ((pushSettingCallback instanceof C10FJ) && (c10fj4 = (C10FJ) pushSettingCallback) != null) {
            LIZJ(c10fj4);
        }
        Iterator<C10FJ> it2 = ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LJI().iterator();
        while (it2.hasNext()) {
            LIZJ(it2.next());
        }
        Object objLJII = ComplianceServiceProvider.LJI().LJII();
        if ((objLJII instanceof C10FJ) && (c10fj3 = (C10FJ) objLJII) != null) {
            LIZ.getClass();
            LIZJ(c10fj3);
        }
        Object objLJJIJL = ComplianceServiceProvider.LJI().LJJIJL();
        if ((objLJJIJL instanceof C10FJ) && (c10fj2 = (C10FJ) objLJJIJL) != null) {
            LIZ.getClass();
            LIZJ(c10fj2);
        }
        IFilterVideoService iFilterVideoService = (IFilterVideoService) PluggableExtentionKt.pluggableSpi$default(IFilterVideoService.class, false, false, false, 14, null);
        C635660OwW c635660OwWLIZJ = iFilterVideoService != null ? iFilterVideoService.LIZJ() : null;
        if ((c635660OwWLIZJ instanceof C10FJ) && c635660OwWLIZJ != null) {
            LIZ.getClass();
            LIZJ(c635660OwWLIZJ);
        }
        Object objLJJIJIIJIL = C1255704vj.LIZ().LJJIJIIJIL();
        if ((objLJJIJIIJIL instanceof C10FJ) && (c10fj = (C10FJ) objLJJIJIIJIL) != null) {
            LIZ.getClass();
            LIZJ(c10fj);
        }
        C844470XAv.LIZ.getClass();
        if (C2162308dZ.LJI(C844470XAv.LIZ())) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);
        }
        LIZLLL = C452501pT.LIZIZ(new C10FH());
    }

    public static void LIZ(Exception exc) {
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (it2.hasNext()) {
            ((C10FJ) it2.next()).onFailed(exc);
        }
        C10FJ c10fj = LIZJ;
        if (c10fj != null) {
            c10fj.onFailed(exc);
        }
        LIZJ = null;
    }

    public static void LIZIZ(PushSettings pushSettings) {
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (it2.hasNext()) {
            ((C10FJ) it2.next()).Hl(pushSettings);
        }
        C10FJ c10fj = LIZJ;
        if (c10fj != null) {
            c10fj.Hl(pushSettings);
        }
        LIZJ = null;
    }

    public static void LIZJ(C10FJ c10fj) {
        ((ArrayList) LIZIZ).add(c10fj);
    }

    public static void LIZLLL(C10FJ c10fj, boolean z) {
        LIZJ = c10fj;
        try {
            ((C1260870iur) LIZLLL.getValue()).LIZJ(new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!z) {
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C0CRI(c10fj, null), 2);
                return;
            }
            LIZ(new Exception());
        }
    }
}
