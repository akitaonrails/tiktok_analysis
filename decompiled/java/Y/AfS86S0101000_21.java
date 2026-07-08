package Y;

import X.C09JN;
import X.C0O8X;
import X.C0TMQ;
import X.C1156290gCB;
import X.C1344030l4z;
import X.C1345420l7E;
import X.C1386970mCF;
import X.C1498560p6E;
import X.C15O7;
import X.C1720106oR;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2192401ArG;
import X.C589170N8x;
import X.C844470XAv;
import X.InterfaceC625970Ogt;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentLikeViewModel;
import com.ss.android.ugc.profile.business.ci.viewer.viewmodel.ProfileViewerViewModel;

/* JADX INFO: loaded from: classes22.dex */
public class AfS86S0101000_21 implements C09JN {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS86S0101000_21 afS86S0101000_21, Object obj) {
        C1C7U.LIZ("ProfileViewerViewModel@f1c5.checkProfileViewerSetting$1$disposable$1");
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update profile settings success and update value is ");
        sbLIZ.append(afS86S0101000_21.i1);
        C1720106oR.LJI("PVViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (afS86S0101000_21.i1 == 1) {
            ((PowerPageSource) ((ProfileViewerViewModel) afS86S0101000_21.l0).LLJJI.getValue()).getOperator().refresh();
        } else {
            ((ProfileViewerViewModel) afS86S0101000_21.l0).xQ2().postValue(new C1386970mCF(0, 3));
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC625970Ogt interfaceC625970OgtLIZ = C2192401ArG.LIZ(C589170N8x.LIZ("social", "profile"), "profile_viewer_dialog_keva_repo_name");
            C0TMQ.LIZ.getClass();
            interfaceC625970OgtLIZ.LJIIIIZZ("profile_viewer_close_auth_time", jCurrentTimeMillis);
        }
        C1C7U.LIZIZ("ProfileViewerViewModel@f1c5.checkProfileViewerSetting$1$disposable$1");
    }

    public static final void accept$1(AfS86S0101000_21 afS86S0101000_21, Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("CommentLikeViewModel@72bd.requestLikeComment$3");
        Throwable th = (Throwable) obj;
        CommentPerfMonitorUtil.LIZ.getClass();
        C1345420l7E c1345420l7E = CommentPerfMonitorUtil.LJFF;
        c1345420l7E.LJ = System.currentTimeMillis();
        int i = afS86S0101000_21.i1;
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                CommentLikeViewModel commentLikeViewModel = (CommentLikeViewModel) afS86S0101000_21.l0;
                commentLikeViewModel.getClass();
                if (i == 3) {
                    str2 = "hate failed";
                } else {
                    str2 = "unhate failed";
                }
                commentLikeViewModel.LLILLJJLI.setValue(new C1156290gCB(str2, th));
                C1344030l4z.LIZJ("LikeAndHateView", "hate failed");
                commentLikeViewModel.AQ2(i, null, false);
            }
        } else {
            CommentLikeViewModel commentLikeViewModel2 = (CommentLikeViewModel) afS86S0101000_21.l0;
            commentLikeViewModel2.getClass();
            if (i == 1) {
                str = "like failed";
            } else {
                str = "unlike failed";
            }
            commentLikeViewModel2.LLILLJJLI.setValue(new C1156290gCB(str, th));
            C1344030l4z.LIZJ("LikeAndHateView", "digg failed");
            commentLikeViewModel2.AQ2(i, null, false);
        }
        CommentLikeViewModel commentLikeViewModel3 = (CommentLikeViewModel) afS86S0101000_21.l0;
        commentLikeViewModel3.LLILLL = false;
        C0O8X c0o8x = commentLikeViewModel3.LLJILJILJ;
        C844470XAv.LIZ.getClass();
        c0o8x.LJI(C1498560p6E.LIZ(C844470XAv.LIZ(), th));
        c1345420l7E.LIZJ = System.currentTimeMillis();
        C15O7.LIZJ(new ACallableS426S0100000_21(c1345420l7E, 10));
        C1C7U.LIZIZ("CommentLikeViewModel@72bd.requestLikeComment$3");
    }

    public AfS86S0101000_21(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
