package Y;

import X.C0FV2;
import X.C118300cf;
import X.C1358130lRj;
import X.C1358220lRs;
import X.C1358240lRu;
import X.C1C7U;
import X.C299110Bnx;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.InterfaceC1350190lEv;
import X.InterfaceC1366280les;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.bottomsheet.SharePanelNewBehavior;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentpage.landscapevideo.LandscapeCommentPageContainer;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.share.core.ui.TuxSharePanelNewBehavior;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS8S0102000_21 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S0102000_21.LIZ$0():void");
    }

    public final void LIZ$1() {
        View viewFindViewById;
        View viewFindViewById2;
        RecyclerView recyclerView = ((ShareSheetPanelFragment) this.l0).LLIZLLLIL;
        final int measuredHeight = (recyclerView == null || (viewFindViewById2 = recyclerView.findViewById(R.id.olj)) == null) ? 0 : viewFindViewById2.getMeasuredHeight();
        LinearLayout linearLayout = ((ShareSheetPanelFragment) this.l0).LLJ;
        final int measuredHeight2 = (linearLayout == null || (viewFindViewById = linearLayout.findViewById(R.id.ofm)) == null) ? 0 : viewFindViewById.getMeasuredHeight();
        final C118300cf c118300cf = new C118300cf();
        FrameLayout frameLayout = ((ShareSheetPanelFragment) this.l0).LLJJ;
        c118300cf.element = frameLayout != null ? frameLayout.getMeasuredHeight() : 0;
        ShareSheetPanelFragment shareSheetPanelFragment = (ShareSheetPanelFragment) this.l0;
        if (shareSheetPanelFragment.LLJJJJJIL == -1) {
            View view = shareSheetPanelFragment.LLJILJILJ;
            shareSheetPanelFragment.LLJJJJJIL = view != null ? view.getMeasuredHeight() : 0;
        }
        int i = this.i1 + measuredHeight + c118300cf.element + measuredHeight2 + ((ShareSheetPanelFragment) this.l0).LLJJIJIL;
        C844470XAv.LIZ.getClass();
        double dLIZ = ((double) C0FV2.LIZ(C844470XAv.LIZ())) * 0.9d;
        if (i <= dLIZ) {
            ((ShareSheetPanelFragment) this.l0).SR(this.i2, this.i1, measuredHeight, c118300cf.element, measuredHeight2);
            return;
        }
        if (i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)) > dLIZ) {
            InterfaceC1366280les interfaceC1366280les = ((ShareSheetPanelFragment) this.l0).LLJILLL;
            if (interfaceC1366280les != null) {
                interfaceC1366280les.LIZJ(false);
            }
        } else {
            InterfaceC1366280les interfaceC1366280les2 = ((ShareSheetPanelFragment) this.l0).LLJILLL;
            if (interfaceC1366280les2 != null) {
                interfaceC1366280les2.LIZJ(true);
            }
        }
        final ShareSheetPanelFragment shareSheetPanelFragment2 = (ShareSheetPanelFragment) this.l0;
        FrameLayout frameLayout2 = shareSheetPanelFragment2.LLJJ;
        if (frameLayout2 != null) {
            final int i2 = this.i2;
            final int i3 = this.i1;
            HandlerHook.viewPost(frameLayout2, new Runnable() { // from class: X.0lyt
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ShareSheetPanelFragment@267a.onKeyboardHeightChange$3$1$1");
                    try {
                        C118300cf c118300cf2 = c118300cf;
                        FrameLayout frameLayout3 = shareSheetPanelFragment2.LLJJ;
                        c118300cf2.element = frameLayout3 != null ? frameLayout3.getMeasuredHeight() : 0;
                        shareSheetPanelFragment2.SR(i2, i3, measuredHeight, c118300cf.element, measuredHeight2);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ShareSheetPanelFragment@267a.onKeyboardHeightChange$3$1$1");
                }
            });
        }
    }

    public final void LIZ$2() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(((UpvotePanelListCell) this.l0).itemView, "backgroundColor", this.i1, this.i2);
        objectAnimatorOfInt.setDuration(3000L);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        C786410Ut5.Pd(objectAnimatorOfInt);
        C1358130lRj item = ((UpvotePanelListCell) this.l0).getItem();
        if (item != null) {
            item.LLILLL = false;
        }
    }

    public final void LIZ$3() {
        SkeletonSharePanelFragment skeletonSharePanelFragment = (SkeletonSharePanelFragment) this.l0;
        int i = this.i1;
        skeletonSharePanelFragment.LLLLJ = i;
        skeletonSharePanelFragment.JS(i);
        SkeletonSharePanelFragment skeletonSharePanelFragment2 = (SkeletonSharePanelFragment) this.l0;
        skeletonSharePanelFragment2.LLLF = skeletonSharePanelFragment2.NR();
        if (C299110Bnx.LIZ()) {
            SkeletonSharePanelFragment skeletonSharePanelFragment3 = (SkeletonSharePanelFragment) this.l0;
            TuxSharePanelNewBehavior tuxSharePanelNewBehavior = skeletonSharePanelFragment3.LLJILLL;
            if (tuxSharePanelNewBehavior != null) {
                tuxSharePanelNewBehavior.LJJJZ = skeletonSharePanelFragment3.LLLF;
                tuxSharePanelNewBehavior.LJIIIZ(this.i1 - this.i2, true);
                return;
            }
            return;
        }
        SkeletonSharePanelFragment skeletonSharePanelFragment4 = (SkeletonSharePanelFragment) this.l0;
        SharePanelNewBehavior sharePanelNewBehavior = skeletonSharePanelFragment4.LLJILJILJ;
        if (sharePanelNewBehavior != null) {
            sharePanelNewBehavior.LJIJI = skeletonSharePanelFragment4.LLLF;
            sharePanelNewBehavior.LJ(this.i1 - this.i2, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$4() {
        C1358240lRu c1358240lRu;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(((BaseRepostCell) this.l0).itemView, "backgroundColor", this.i1, this.i2);
        objectAnimatorOfInt.setDuration(3000L);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        C786410Ut5.Pd(objectAnimatorOfInt);
        C1358220lRs c1358220lRs = (C1358220lRs) ((BaseRepostCell) this.l0).getItem();
        if (c1358220lRs == null || (c1358240lRu = c1358220lRs.LLILLL) == null) {
            return;
        }
        c1358240lRu.LIZIZ = false;
    }

    public static final void run$0(ARunnableS8S0102000_21 aRunnableS8S0102000_21) {
        boolean zLIZ;
        C1C7U.LIZ("DanmakuPresentAssem@1c48.tryInitLayout$1");
        try {
            aRunnableS8S0102000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DanmakuPresentAssem@1c48.tryInitLayout$1");
    }

    public static final void run$1(ARunnableS8S0102000_21 aRunnableS8S0102000_21) {
        boolean zLIZ;
        CommentCommonModel commonModel;
        InterfaceC1350190lEv interfaceC1350190lEv;
        C1C7U.LIZ("LandscapeCommentPageContainer@dfb5.onViewCreated$1$3$onStateChanged$1");
        try {
            CommentContextSource commentContextSourceGL = ((LandscapeCommentPageContainer) aRunnableS8S0102000_21.l0).GL();
            if (commentContextSourceGL != null && (commonModel = commentContextSourceGL.getCommonModel()) != null && (interfaceC1350190lEv = commonModel.scrollStateChangedListener) != null) {
                interfaceC1350190lEv.LIZ(aRunnableS8S0102000_21.i1, aRunnableS8S0102000_21.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandscapeCommentPageContainer@dfb5.onViewCreated$1$3$onStateChanged$1");
    }

    public static final void run$2(ARunnableS8S0102000_21 aRunnableS8S0102000_21) {
        boolean zLIZ;
        C1C7U.LIZ("ShareSheetPanelFragment@267a.onKeyboardHeightChange$3$1");
        try {
            aRunnableS8S0102000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareSheetPanelFragment@267a.onKeyboardHeightChange$3$1");
    }

    public static final void run$3(ARunnableS8S0102000_21 aRunnableS8S0102000_21) {
        boolean zLIZ;
        C1C7U.LIZ("UpvotePanelListCell@a4df.highLight$1");
        try {
            aRunnableS8S0102000_21.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UpvotePanelListCell@a4df.highLight$1");
    }

    public static final void run$4(ARunnableS8S0102000_21 aRunnableS8S0102000_21) {
        boolean zLIZ;
        C1C7U.LIZ("SkeletonSharePanelFragment@a513.observeSharePanelFloatBottomContainerHeightChange$1$onLayoutChange$1");
        try {
            aRunnableS8S0102000_21.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkeletonSharePanelFragment@a513.observeSharePanelFloatBottomContainerHeightChange$1$onLayoutChange$1");
    }

    public static final void run$5(ARunnableS8S0102000_21 aRunnableS8S0102000_21) {
        boolean zLIZ;
        C1C7U.LIZ("BaseRepostCell@a2f9.highLight$1");
        try {
            aRunnableS8S0102000_21.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseRepostCell@a2f9.highLight$1");
    }

    public ARunnableS8S0102000_21(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
