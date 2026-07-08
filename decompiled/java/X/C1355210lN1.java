package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostSharePanel;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostSharePanelBehavior;
import com.ss.android.ugc.aweme.upvote.detail.repostshare.TuxRepostSharePanelBehavior;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lN1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355210lN1 {
    public static void LIZ(Aweme aweme, UpvoteStruct upvoteStruct, RepostReplyStruct repostReplyStruct, boolean z, String str, String str2, String str3, RepostInteractListViewModel repostInteractListViewModel, UpvoteStruct upvoteStruct2, Function0 function0, Fragment fragment, boolean z2) {
        Activity activityLIZ;
        C19EG c19eg;
        int iIntValue;
        String aid;
        User author;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        String uid = null;
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            RepostSharePanel repostSharePanel = new RepostSharePanel();
            repostSharePanel.LLIZ = aweme;
            repostSharePanel.LLIZLLLIL = upvoteStruct;
            repostSharePanel.LLJ = repostReplyStruct;
            repostSharePanel.LLJI = z;
            repostSharePanel.LLJIJIL = str;
            repostSharePanel.LLJILJIL = str2;
            repostSharePanel.LLJILJILJ = str3;
            repostSharePanel.LLJILLL = repostInteractListViewModel;
            repostSharePanel.LLJJ = upvoteStruct2;
            repostSharePanel.LLJJI = z2;
            repostSharePanel.LLJJIII = function0;
            repostSharePanel.LLJJIJI = fragment;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, c19eg);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LJIIIIZZ(4);
            Integer numValueOf = Integer.valueOf(iIntValue);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJI = numValueOf;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJJIJI = repostSharePanel;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1265960j34(repostSharePanel, 3);
            c1390920mIc.LJI(53);
            c1390920mIc.LIZ.LLILZIL = true;
            if (C299110Bnx.LIZ()) {
                TuxRepostSharePanelBehavior tuxRepostSharePanelBehavior = new TuxRepostSharePanelBehavior();
                if (C0BV2.LIZ() > 0) {
                    tuxRepostSharePanelBehavior.LJJIZ = C1355230lN3.LIZ(C0BV2.LIZ());
                }
                repostSharePanel.LLJJJ = tuxRepostSharePanelBehavior;
                c1390920mIc.LIZ.LLLIIIIL = tuxRepostSharePanelBehavior;
            } else {
                RepostSharePanelBehavior repostSharePanelBehavior = new RepostSharePanelBehavior();
                if (C0BV2.LIZ() > 0) {
                    repostSharePanelBehavior.LIZJ = C1355230lN3.LIZ(C0BV2.LIZ());
                }
                repostSharePanel.LLJJJ = repostSharePanelBehavior;
                c1390920mIc.LIZ.LLLIIII = repostSharePanelBehavior;
            }
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            repostSharePanel.LLJJIJIL = tuxSheet2;
            ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
            C1369870lkf.LJIJI(tuxSheet2);
            TuxSheet tuxSheet3 = repostSharePanel.LLJJIJIL;
            if (tuxSheet3 != null) {
                tuxSheet3.show(c19eg.getSupportFragmentManager(), "repost_share_panel");
            }
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            String str4 = repostSharePanel.LLJIJIL;
            String str5 = repostSharePanel.LLJILJILJ;
            Aweme aweme2 = repostSharePanel.LLIZ;
            c1358550lSP.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str4);
            c2344009Gk.LJIIIIZZ("enter_type", str5);
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                uid = author.getUid();
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            c2344009Gk.LJIIIIZZ("panel_source", "repost_share_panel");
            C20684815ws.LJIILLIIL("ttsocial_share_panel_show", c2344009Gk.LIZ);
        }
    }
}
