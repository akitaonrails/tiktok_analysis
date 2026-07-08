package X;

import Y.AObserverS233S0100000_31;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.feed.match.title.MatchFeedTitleViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.15FA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15FA {
    public InterfaceC962060b8u LIZIZ;
    public ViewStub LIZJ;
    public FrameLayout LIZLLL;
    public FrameLayout LJ;
    public ConstraintLayout LJFF;
    public LinearLayout LJI;
    public DataChannel LJIIJ;
    public final MatchFeedTitleViewModel LIZ = new MatchFeedTitleViewModel();
    public final C15FB LJII = new C15FB();
    public final C15FD LJIIIIZZ = new C15FD();
    public final AObserverS233S0100000_31 LJIIIZ = new AObserverS233S0100000_31(this, 46);
    public final AtomicBoolean LJIIJJI = new AtomicBoolean(true);

    public final void LIZIZ() {
        C20441214yg.LJ("MatchFeedTitleDelegate", "onDestroy");
        DataChannel dataChannel = this.LJIIJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LIZ.LLILLL.removeObserver(this.LJIIIZ);
        MatchFeedTitleViewModel matchFeedTitleViewModel = this.LIZ;
        DataChannel dataChannel2 = matchFeedTitleViewModel.LL;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(matchFeedTitleViewModel);
        }
        matchFeedTitleViewModel.LL = null;
    }

    public final void LIZJ() {
        ConstraintLayout constraintLayout = this.LJFF;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        LinearLayout linearLayout = this.LJI;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C15FB c15fb = this.LJII;
        AnimatorSet animatorSet = c15fb.LJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = c15fb.LJFF;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        MatchFeedTitleViewModel matchFeedTitleViewModel = this.LIZ;
        matchFeedTitleViewModel.getClass();
        C15F4 c15f4 = C15F4.LIZ;
        C497740JfY.LIZIZ(40.0f);
        C497740JfY.LJFF(R.color.a2l);
        MatchFeedTitleViewModel.vQ2(matchFeedTitleViewModel, c15f4, new C15FE(0));
    }

    public final void LIZ(String str) {
        if (!this.LJIIJJI.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initView, isViewStubInitial == false, return, source = ");
            sbLIZ.append(str);
            C20441214yg.LJ("MatchFeedTitleDelegate", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LJIIJJI.set(false);
        ViewStub viewStub = this.LIZJ;
        if (viewStub == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initView, tempViewStub == null, return, source = ");
            sbLIZ2.append(str);
            C20441214yg.LJ("MatchFeedTitleDelegate", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("initView, tempViewStub.inflate, source = ");
        sbLIZ3.append(str);
        C20441214yg.LIZIZ("MatchFeedTitleDelegate", C2188811AlT.LIZIZ(sbLIZ3));
        FrameLayout frameLayout = (FrameLayout) C786410Ut5.LJLLLL(viewStub);
        this.LIZLLL = frameLayout;
        this.LJ = (FrameLayout) frameLayout.findViewById(R.id.m_n);
        this.LJFF = (ConstraintLayout) frameLayout.findViewById(R.id.m8x);
        this.LJI = (LinearLayout) frameLayout.findViewById(R.id.m8y);
        ConstraintLayout constraintLayout = this.LJFF;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        LinearLayout linearLayout = this.LJI;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C15FB c15fb = this.LJII;
        View viewFindViewById = frameLayout.findViewById(R.id.m8x);
        c15fb.getClass();
        c15fb.LIZLLL = (ConstraintLayout) viewFindViewById;
        c15fb.LIZ = (ImageView) viewFindViewById.findViewById(R.id.lqy);
        c15fb.LIZIZ = (C1126540fQC) viewFindViewById.findViewById(R.id.lqv);
        c15fb.LIZJ = (C16F5) viewFindViewById.findViewById(R.id.tv_pk_countdown_value);
        c15fb.LJII = C800330VaR.LIZIZ(viewFindViewById.getContext(), R.drawable.dv7);
        C20736316Cj.LIZIZ(R.attr.c9i, viewFindViewById.getContext());
        c15fb.LJIIIIZZ = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.c5q, viewFindViewById.getContext()));
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ("tiktok_live_match_resource", "ttlive_match_calculating_clock.webp"));
        c15fb.LJI = c1320810kTXLIZJ;
        C15FD c15fd = this.LJIIIIZZ;
        View viewFindViewById2 = frameLayout.findViewById(R.id.m8y);
        c15fd.getClass();
        c15fd.LIZJ = (LinearLayout) viewFindViewById2;
        c15fd.LIZ = (C16F5) viewFindViewById2.findViewById(R.id.tv_pk_punish_countdown_value);
        c15fd.LIZIZ = (C16F5) viewFindViewById2.findViewById(R.id.tv_pk_punish_title);
    }
}
