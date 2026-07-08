package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;

/* JADX INFO: renamed from: X.0W1R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C0W1R implements InterfaceC803900VgC {
    public final /* synthetic */ NpthCoreInitTask LIZ;

    public /* synthetic */ C0W1R(NpthCoreInitTask npthCoreInitTask) {
        this.LIZ = npthCoreInitTask;
    }

    public final C830490Whz LIZ(String str) throws Throwable {
        String strJ4;
        String string;
        this.LIZ.getClass();
        if (!"urlconnection".equals(str)) {
            return null;
        }
        C830490Whz c830490Whz = new C830490Whz();
        try {
            strJ4 = C786410Ut5.j4("carrierregion=%s;mccmnc=%s;sysregion=%s;appregion=%s", new Object[]{C2222691Bz1.LJ(), C1319780kRs.LIZIZ(), C2222691Bz1.LJFF(), C2222691Bz1.LIZIZ()});
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strJ4 = "";
        }
        if (!TextUtils.isEmpty(strJ4)) {
            c830490Whz.put("x-tt-app-init-region", strJ4);
        }
        TTWebViewEnableStatusSettings.LIZ.getClass();
        if (TTWebViewEnableStatusSettings.LIZ().isTTWebViewEnabled && !TTWebViewHelper.INSTANCE.isTTWebViewTriedInitialized()) {
            if (NpthCoreInitTask.LLILLJJLI == null) {
                NpthCoreInitTask.LLILLJJLI = new C1519810peV(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME));
            }
            string = NpthCoreInitTask.LLILLJJLI.getString("pns_npth_cookie", "");
        } else {
            try {
                string = C2204961BRm.LLIZ(C786410Ut5.A2(), "https://mon.tiktokv.com", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS/ow8O7CrR/2S0ji8CklPPMKGO5ju", null));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (NpthCoreInitTask.LLILLJJLI == null) {
                    NpthCoreInitTask.LLILLJJLI = new C1519810peV(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME));
                }
                string = NpthCoreInitTask.LLILLJJLI.getString("pns_npth_cookie", "");
            }
        }
        if (!TextUtils.isEmpty(string)) {
            c830490Whz.put("Cookie", string);
        }
        return c830490Whz;
    }
}
