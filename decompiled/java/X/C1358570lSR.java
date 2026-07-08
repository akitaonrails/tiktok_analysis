package X;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lSR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1358570lSR extends C2217421BqW implements Function0<Unit> {
    public C1358570lSR(Object obj) {
        super(0, obj, UpvotePanelListCell.class, "onInteractionViewClick", "onInteractionViewClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SetSticker setSticker;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        View view;
        FrameLayout frameLayout;
        VideoItemParams videoItemParams;
        VideoItemParams videoItemParams2;
        UpvotePanelListCell upvotePanelListCell = (UpvotePanelListCell) this.receiver;
        upvotePanelListCell.getClass();
        C455830Hu9.LIZ.getClass();
        C455870HuD c455870HuD = (C455870HuD) C455830Hu9.LJ.getValue();
        String name = C424430Gkb.LIZ() ? (String) C13LP.LJJJLL(upvotePanelListCell.W5()) : (c455870HuD == null || (setSticker = c455870HuD.LIZ) == null) ? null : setSticker.getName();
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        C1358130lRj item = upvotePanelListCell.getItem();
        String str = (item == null || (videoItemParams2 = item.LLILLJJLI) == null) ? null : videoItemParams2.mEventType;
        String strF6 = upvotePanelListCell.f6();
        Aweme awemeA6 = upvotePanelListCell.a6();
        C1358130lRj item2 = upvotePanelListCell.getItem();
        UpvoteStruct upvoteStruct = item2 != null ? item2.LL : null;
        c1358550lSP.getClass();
        C1358550lSP.LJIIJJI(str, strF6, "click", awemeA6, name, upvoteStruct);
        C1358130lRj item3 = upvotePanelListCell.getItem();
        C1358550lSP.LJIILIIL(c1358550lSP, (item3 == null || (videoItemParams = item3.LLILLJJLI) == null) ? null : videoItemParams.mEventType, upvotePanelListCell.f6(), upvotePanelListCell.a6(), "quick_reply", null, null, null, null, null, null, upvotePanelListCell.d6(), 1008);
        Activity activityLIZ = C1388190mED.LIZ(upvotePanelListCell.itemView.getContext());
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("UpvotePanel")) != null && (view = fragmentLJJJJZI.getView()) != null && (frameLayout = (FrameLayout) view.findViewById(R.id.t_p)) != null) {
            Integer numValueOf = Integer.valueOf(c455870HuD.LIZIZ);
            String str2 = (String) C13LP.LJJJLL(upvotePanelListCell.W5());
            View iconView = ((C1358650lSZ) upvotePanelListCell.LLJJ.getValue()).getIconView();
            View view2 = (View) upvotePanelListCell.LL.getValue();
            AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(upvotePanelListCell, 1223);
            C420020GdU c420020GdU = new C420020GdU(upvotePanelListCell.itemView.getContext());
            C420030GdV c420030GdV = new C420030GdV();
            if (C1355260lN6.LIZ()) {
                c420030GdV.LIZ = false;
            }
            c420020GdU.LJ(numValueOf, str2, iconView, view2, frameLayout, c420030GdV, awS565S0100000_21);
        }
        return Unit.LIZ;
    }
}
