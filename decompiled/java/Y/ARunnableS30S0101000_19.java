package Y;

import X.C1020810cff;
import X.C1212040he6;
import X.C1239720iMk;
import X.C1239800iMs;
import X.C1259870itF;
import X.C1264320j0Q;
import X.C1317780kOe;
import X.C1904050zeF;
import X.C1C7U;
import X.C1EJQ;
import X.C20603715jn;
import X.C20673215v0;
import X.C21578619ce;
import X.C2188811AlT;
import X.C419910GdJ;
import X.C427690Gpr;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationInputAnswerAssem;
import com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationFormAssem;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh.AlgoRefreshAssem;
import com.tts.oecverify.BdTuring;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS30S0101000_19 implements Runnable {
    public final int $t;
    public int i1;
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
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) ((AsS46S0100000_19) this.l0).l0;
        RecyclerView recyclerView = awemeListFragmentImpl.LLJJIJI;
        if (recyclerView == null) {
            return;
        }
        C1020810cff c1020810cff = C1020810cff.LIZ;
        Rect rect = awemeListFragmentImpl.LLZL;
        c1020810cff.getClass();
        int iLIZ = C1020810cff.LIZ(recyclerView, rect);
        int i = this.i1;
        if (i > 0) {
            AwemeListFragmentImpl awemeListFragmentImpl2 = (AwemeListFragmentImpl) ((AsS46S0100000_19) this.l0).l0;
            if (iLIZ > awemeListFragmentImpl2.LLZ) {
                awemeListFragmentImpl2.LLZ = iLIZ;
                awemeListFragmentImpl2.LLZIL = iLIZ;
                return;
            }
            return;
        }
        if (i < 0) {
            AwemeListFragmentImpl awemeListFragmentImpl3 = (AwemeListFragmentImpl) ((AsS46S0100000_19) this.l0).l0;
            if (iLIZ < awemeListFragmentImpl3.LLZIL) {
                awemeListFragmentImpl3.LLZIL = iLIZ;
            }
            int i2 = awemeListFragmentImpl3.LLZ - awemeListFragmentImpl3.LLZIL;
            if (i2 > awemeListFragmentImpl3.LLZILL) {
                awemeListFragmentImpl3.LLZILL = i2;
                boolean z = awemeListFragmentImpl3.LLJILLL;
                String strLIZ = C1259870itF.LIZ(awemeListFragmentImpl3.LLJIJIL);
                AwemeListFragmentImpl awemeListFragmentImpl4 = (AwemeListFragmentImpl) ((AsS46S0100000_19) this.l0).l0;
                C1020810cff.LJI.submit(new ARunnableS0S2011000_16(z, strLIZ, awemeListFragmentImpl4.LLZILL, awemeListFragmentImpl4.LLIZ, 0));
            }
        }
    }

    public final void LIZ$1() {
        C1904050zeF c1904050zeF = (C1904050zeF) this.l0;
        C20603715jn c20603715jn = c1904050zeF.LLILZIL;
        if (c20603715jn == null) {
            c20603715jn = null;
        }
        int i = c20603715jn.LIZ;
        int itemCount = c1904050zeF.getItemCount();
        if (itemCount - this.i1 <= i + 1) {
            C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger loadMore, total: ");
            sbLIZ.append(itemCount);
            sbLIZ.append(", position: ");
            sbLIZ.append(this.i1);
            sbLIZ.append(", preloadCnt: ");
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1264320j0Q.getClass();
            C1264320j0Q.LIZ("Adapter", strLIZIZ);
            ((C1904050zeF) this.l0).LLILLIZIL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e A[PHI: r1
      0x002e: PHI (r1v1 boolean) = (r1v3 boolean), (r1v4 boolean) binds: [B:17:0x002c, B:15:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$0(Y.ARunnableS30S0101000_19 r9) {
        /*
            java.lang.Object r8 = r9.l0
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r8 = (com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel) r8
            int r7 = r9.i1
            r8.getClass()
            java.lang.String r6 = "DetailFragmentPanel@5b0b.checkFeedItemLayoutCacheAndLoadFeedAutomaticAsControl$1L"
            X.C1C7U.LIZ(r6)
            X.0hZQ r5 = r8.q0
            if (r5 != 0) goto L16
            X.C1C7U.LIZIZ(r6)
            return
        L16:
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r4 = r8.LLJJIJI
            if (r4 != 0) goto L1e
            X.C1C7U.LIZIZ(r6)
            return
        L1e:
            boolean r3 = r5.LJ
            r2 = 0
            if (r3 == 0) goto L3c
            boolean r0 = r5.LJI
            if (r0 == 0) goto L61
            r1 = 1
            if (r3 == 0) goto L2e
        L2a:
            boolean r0 = r5.LJFF
            if (r0 == 0) goto L2f
        L2e:
            r2 = 1
        L2f:
            if (r1 == 0) goto L40
            if (r2 != 0) goto L3c
            int r0 = r4.getScrollState()
            if (r0 != 0) goto L3c
            r5.LIZ()
        L3c:
            X.C1C7U.LIZIZ(r6)
            return
        L40:
            if (r2 == 0) goto L4e
            if (r1 != 0) goto L3c
            int r0 = r4.getScrollState()
            if (r0 != 0) goto L3c
            r5.LIZIZ()
            goto L3c
        L4e:
            if (r1 != 0) goto L3c
            if (r2 != 0) goto L3c
            int r0 = r4.getScrollState()
            if (r0 != 0) goto L5b
            r5.LIZIZ()
        L5b:
            int r0 = r7 + 1
            r8.LLZZJLIL(r0)
            goto L3c
        L61:
            r1 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS30S0101000_19.run$0(Y.ARunnableS30S0101000_19):void");
    }

    public static final void run$1(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("GroupInvitationInputAnswerAssem@dec4.keyBoardListener$2$1$onKeyboardChanged$1$1$1");
        try {
            C21578619ce c21578619ce = (C21578619ce) ((GroupInvitationInputAnswerAssem) aRunnableS30S0101000_19.l0).LLJILJILJ.getValue();
            if (c21578619ce != null) {
                c21578619ce.scrollBy(0, aRunnableS30S0101000_19.i1);
            }
            GroupInvitationInputAnswerAssem groupInvitationInputAnswerAssem = (GroupInvitationInputAnswerAssem) aRunnableS30S0101000_19.l0;
            TuxTextView tuxTextView = groupInvitationInputAnswerAssem.LLJJIII;
            if (tuxTextView != null) {
                tuxTextView.addOnLayoutChangeListener(groupInvitationInputAnswerAssem.LLJJIJIL);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupInvitationInputAnswerAssem@dec4.keyBoardListener$2$1$onKeyboardChanged$1$1$1");
    }

    public static final void run$10(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AbsRecUserCell@596c.paintHighlightAfterRecMoreAnimation$1$1");
        try {
            C427690Gpr.LIZLLL(((AbsRecUserCell) aRunnableS30S0101000_19.l0).itemView, aRunnableS30S0101000_19.i1);
            ((AbsRecUserCell) aRunnableS30S0101000_19.l0).itemView.setBackgroundColor(aRunnableS30S0101000_19.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsRecUserCell@596c.paintHighlightAfterRecMoreAnimation$1$1");
    }

    public static final void run$11(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AbsRecUserCell@596c.paintHighlightAfterRecMoreAnimation$2$1");
        try {
            C427690Gpr.LIZLLL(((AbsRecUserCell) aRunnableS30S0101000_19.l0).itemView, aRunnableS30S0101000_19.i1);
            ((AbsRecUserCell) aRunnableS30S0101000_19.l0).itemView.setBackgroundColor(aRunnableS30S0101000_19.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsRecUserCell@596c.paintHighlightAfterRecMoreAnimation$2$1");
    }

    public static final void run$12(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aRunnableS30S0101000_19.l0;
        int i = aRunnableS30S0101000_19.i1;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.tryRefreshList$3L");
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) C1EJQ.LJI.getValue()).booleanValue() && awemeListFragmentImpl.LLJILLL) {
                C20673215v0.LJII(awemeListFragmentImpl.getActivity(), "profile_item_aweme_mine");
            } else {
                C20673215v0.LJII(awemeListFragmentImpl.getActivity(), "profile_item_aweme");
            }
        }
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.tryRefreshList$3L");
    }

    public static final void run$13(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ThirdPartyAuthenticator@c769.initData$2$1");
        try {
            C1239720iMk c1239720iMk = ((C1239800iMs) aRunnableS30S0101000_19.l0).LLIZLLLIL;
            ImageView imageView = null;
            if (c1239720iMk == null) {
                c1239720iMk = null;
            }
            c1239720iMk.setEnabled(true);
            ImageView imageView2 = ((C1239800iMs) aRunnableS30S0101000_19.l0).LLJ;
            if (imageView2 == null) {
                imageView2 = null;
            }
            int i = aRunnableS30S0101000_19.i1;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            ImageView imageView3 = ((C1239800iMs) aRunnableS30S0101000_19.l0).LLJ;
            if (imageView3 != null) {
                imageView = imageView3;
            }
            imageView2.setImageDrawable(c419910GdJ.LIZ(imageView.getContext()));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThirdPartyAuthenticator@c769.initData$2$1");
    }

    public static final void run$14(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        List list = (List) aRunnableS30S0101000_19.l0;
        int i = aRunnableS30S0101000_19.i1;
        C1C7U.LIZ("FontMap@ec9e.clearFont$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear font ");
        sbLIZ.append(i);
        C1317780kOe.LIZ(C2188811AlT.LIZIZ(sbLIZ), list);
        C1C7U.LIZIZ("FontMap@ec9e.clearFont$1L");
    }

    public static final void run$2(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeListFragmentImpl@a373.initAdapter$1$onScrolled$1");
        try {
            aRunnableS30S0101000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.initAdapter$1$onScrolled$1");
    }

    public static final void run$3(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("FindSchoolFriendsPageContainerAssem@2e2e.onCreateView$8$4");
        try {
            ((FindSchoolFriendsPageContainerAssem) aRunnableS30S0101000_19.l0).Qp(aRunnableS30S0101000_19.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.onCreateView$8$4");
    }

    public static final void run$4(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AlgoRefreshAssem@4092.retryToastReset$1");
        try {
            ((AlgoRefreshAssem) aRunnableS30S0101000_19.l0).lp(aRunnableS30S0101000_19.i1 + 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AlgoRefreshAssem@4092.retryToastReset$1");
    }

    public static final void run$5(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAIVideoToast@38f9.show$$inlined$runOnMainThread$1");
        try {
            C1212040he6.LIZLLL(aRunnableS30S0101000_19.i1, (View) aRunnableS30S0101000_19.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAIVideoToast@38f9.show$$inlined$runOnMainThread$1");
    }

    public static final void run$6(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAIVideoToast@38f9.show$$inlined$runOnMainThread$2");
        try {
            C1212040he6.LIZLLL(aRunnableS30S0101000_19.i1, C1212040he6.LIZ((Fragment) aRunnableS30S0101000_19.l0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAIVideoToast@38f9.show$$inlined$runOnMainThread$2");
    }

    public static final void run$7(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAIVideoToast@38f9.show$$inlined$runOnMainThread$4");
        try {
            C1212040he6.LIZJ(aRunnableS30S0101000_19.i1, (Activity) aRunnableS30S0101000_19.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAIVideoToast@38f9.show$$inlined$runOnMainThread$4");
    }

    public static final void run$8(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("GroupCreationFormAssem@9095.observerLayoutChange$1$1");
        try {
            C21578619ce c21578619ceKp = ((GroupCreationFormAssem) aRunnableS30S0101000_19.l0).kp();
            if (c21578619ceKp != null) {
                c21578619ceKp.scrollBy(0, aRunnableS30S0101000_19.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupCreationFormAssem@9095.observerLayoutChange$1$1");
    }

    public static final void run$9(ARunnableS30S0101000_19 aRunnableS30S0101000_19) {
        boolean zLIZ;
        C1C7U.LIZ("RelationUserCardAdapter@95f7.triggerLoadMoreByAuto$1");
        try {
            aRunnableS30S0101000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RelationUserCardAdapter@95f7.triggerLoadMoreByAuto$1");
    }

    public ARunnableS30S0101000_19(Activity activity, int i) {
        this.$t = i;
        this.l0 = activity;
        this.i1 = 2131822589;
    }

    public ARunnableS30S0101000_19(TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment, int i) {
        this.$t = i;
        this.l0 = takoAiVideoDetailPageFragment;
        this.i1 = 2131827517;
    }

    public ARunnableS30S0101000_19(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
