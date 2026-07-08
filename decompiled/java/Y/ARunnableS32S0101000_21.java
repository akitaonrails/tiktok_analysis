package Y;

import X.AbstractC1664130tPH;
import X.C1349220lDM;
import X.C1383410m6V;
import X.C1396820mS8;
import X.C1396840mSA;
import X.C1396850mSB;
import X.C1401160mZ8;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1C7U;
import X.DialogC1390150mHN;
import X.InterfaceC1385080m9C;
import X.InterfaceC1396870mSD;
import X.InterfaceC1396910mSH;
import X.InterfaceC1401150mZ7;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerPagerAssem;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelContactRootAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.utils.PreloadVideoUtil;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS32S0101000_21 implements Runnable {
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
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        InterfaceC1396910mSH interfaceC1396910mSHLJJJ;
        C1396840mSA c1396840mSA = ((C1396820mS8) this.l0).LJIIIIZZ;
        int i = this.i1;
        Iterator<InterfaceC1396870mSD> it2 = c1396840mSA.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIII(i);
        }
        int i2 = this.i1;
        if (i2 == 1100) {
            InterfaceC1396910mSH interfaceC1396910mSHLJJJ2 = ((C1396820mS8) this.l0).LJJJ();
            if (interfaceC1396910mSHLJJJ2 != null) {
                interfaceC1396910mSHLJJJ2.LIZJ(((C1396820mS8) this.l0).LIZIZ.LIZLLL.LIZJ / 255.0f);
            }
        } else if (i2 == 1101) {
            C1396850mSB c1396850mSB = ((C1396820mS8) this.l0).LJFF;
            c1396850mSB.LJI = c1396850mSB.LJIIIIZZ;
            c1396850mSB.LJII = System.currentTimeMillis();
        } else if (i2 == 1103) {
            C1396820mS8 c1396820mS8 = (C1396820mS8) this.l0;
            if (!c1396820mS8.LIZIZ.LIZLLL.LJII) {
                c1396820mS8.LJIIIIZZ.LIZIZ(1002, null);
            }
        } else if (i2 == 1104) {
            C1396820mS8 c1396820mS82 = (C1396820mS8) this.l0;
            if (!c1396820mS82.LIZIZ.LIZLLL.LJIIIIZZ) {
                c1396820mS82.LJIIIIZZ.LIZIZ(1003, null);
            }
        } else if (i2 == 1200) {
            C1396820mS8 c1396820mS83 = (C1396820mS8) this.l0;
            c1396820mS83.LJIIIIZZ.LJIIIIZZ(c1396820mS83.LJFF.LJI(), ((C1396820mS8) this.l0).LJIIL, true);
        } else if (i2 == 1800 && (interfaceC1396910mSHLJJJ = ((C1396820mS8) this.l0).LJJJ()) != null) {
            interfaceC1396910mSHLJJJ.LIZ();
        }
        InterfaceC1396910mSH interfaceC1396910mSHLJJJ3 = ((C1396820mS8) this.l0).LJJJ();
        if (interfaceC1396910mSHLJJJ3 != null) {
            interfaceC1396910mSHLJJJ3.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS32S0101000_21.LIZ$1():void");
    }

    public final void LIZ$2() {
        LinearLayoutManager linearLayoutManager;
        IMDPAutoPlayAbility iMDPAutoPlayAbility;
        int i;
        IMDPAutoPlayAbility iMDPAutoPlayAbility2;
        RecyclerView recyclerView = ((C1401160mZ8) this.l0).LIZ;
        if (recyclerView == null || recyclerView.getParent() == null) {
            return;
        }
        RecyclerView recyclerView2 = ((C1401160mZ8) this.l0).LIZ;
        RecyclerView.LayoutManager layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
        if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int i2 = this.i1;
        if (i2 < iFindFirstVisibleItemPosition || i2 > iFindLastVisibleItemPosition || (i = ((C1401160mZ8) this.l0).LJFF) < iFindFirstVisibleItemPosition || i > iFindLastVisibleItemPosition) {
            InterfaceC1401150mZ7 interfaceC1401150mZ7 = ((C1401160mZ8) this.l0).LJIIJ;
            if (interfaceC1401150mZ7 != null) {
                interfaceC1401150mZ7.LIZ(2);
            }
            ((C1401160mZ8) this.l0).LIZJ(-1);
            RecyclerView recyclerView3 = ((C1401160mZ8) this.l0).LIZ;
            if (recyclerView3 != null && (iMDPAutoPlayAbility = (IMDPAutoPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(recyclerView3, null), IMDPAutoPlayAbility.class, null)) != null) {
                iMDPAutoPlayAbility.CO1(null);
            }
            ((C1401160mZ8) this.l0).getClass();
            ((C1401160mZ8) this.l0).LJFF = -1;
            return;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i2);
        if (viewFindViewByPosition == null) {
            return;
        }
        int[] iArr = new int[2];
        viewFindViewByPosition.getLocationOnScreen(iArr);
        C1401160mZ8 c1401160mZ8 = (C1401160mZ8) this.l0;
        if (c1401160mZ8.LIZIZ < iArr[1]) {
            InterfaceC1401150mZ7 interfaceC1401150mZ72 = c1401160mZ8.LJIIJ;
            if (interfaceC1401150mZ72 != null) {
                interfaceC1401150mZ72.LIZ(2);
            }
            ((C1401160mZ8) this.l0).LIZJ(-1);
            RecyclerView recyclerView4 = ((C1401160mZ8) this.l0).LIZ;
            if (recyclerView4 != null && (iMDPAutoPlayAbility2 = (IMDPAutoPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(recyclerView4, null), IMDPAutoPlayAbility.class, null)) != null) {
                iMDPAutoPlayAbility2.CO1(null);
            }
            ((C1401160mZ8) this.l0).getClass();
            ((C1401160mZ8) this.l0).LJFF = -1;
        }
    }

    public static final void run$0(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("AbsConfig@b9e9.notifyConfigChanged$$inlined$forEach$lambda$1");
        try {
            ((InterfaceC1385080m9C) aRunnableS32S0101000_21.l0).LJJIII(aRunnableS32S0101000_21.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsConfig@b9e9.notifyConfigChanged$$inlined$forEach$lambda$1");
    }

    public static final void run$1(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncDanmakuController@3623.clearBuffer$1");
        try {
            ((C1396820mS8) aRunnableS32S0101000_21.l0).LJIIIIZZ.LIZJ(aRunnableS32S0101000_21.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncDanmakuController@3623.clearBuffer$1");
    }

    public static final void run$10(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("SharePanelContactRootAssem@96e0.subscribeAdapterData$2$1$1");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((SharePanelContactRootAssem) aRunnableS32S0101000_21.l0).LLJJI;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.scrollToPosition(aRunnableS32S0101000_21.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SharePanelContactRootAssem@96e0.subscribeAdapterData$2$1$1");
    }

    public static final void run$11(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("SkeletonSharePanelFragment@a513.observeAdditionLayoutVisibility$1");
        try {
            aRunnableS32S0101000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkeletonSharePanelFragment@a513.observeAdditionLayoutVisibility$1");
    }

    public static final void run$12(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("MDPSquareScrollPlayerController@6919.updateFirstFitTypePosition$1");
        try {
            aRunnableS32S0101000_21.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MDPSquareScrollPlayerController@6919.updateFirstFitTypePosition$1");
    }

    public static final void run$13(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        int iIntValue;
        C1C7U.LIZ("CommentPowerListAssem@dc7a.switchListData$12$1");
        try {
            RecyclerView.LayoutManager layoutManager = ((CommentPowerListAssem) aRunnableS32S0101000_21.l0).Bp().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int i = aRunnableS32S0101000_21.i1;
                Integer num = ((CommentPowerListAssem) aRunnableS32S0101000_21.l0).mp().DQ2().LJJIL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                linearLayoutManager.scrollToPositionWithOffset(i, iIntValue);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPowerListAssem@dc7a.switchListData$12$1");
    }

    public static final void run$14(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        int iIntValue;
        C1C7U.LIZ("CommentPowerListAssem@dc7a.switchListData$3$1");
        try {
            RecyclerView.LayoutManager layoutManager = ((CommentPowerListAssem) aRunnableS32S0101000_21.l0).Bp().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int i = aRunnableS32S0101000_21.i1;
                Integer num = ((CommentPowerListAssem) aRunnableS32S0101000_21.l0).mp().DQ2().LJJIL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                linearLayoutManager.scrollToPositionWithOffset(i, iIntValue);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPowerListAssem@dc7a.switchListData$3$1");
    }

    public static final void run$15(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        int iIntValue;
        C1C7U.LIZ("CommentPowerListAssem@dc7a.switchListData$6$1");
        try {
            RecyclerView.LayoutManager layoutManager = ((CommentPowerListAssem) aRunnableS32S0101000_21.l0).Bp().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int i = aRunnableS32S0101000_21.i1;
                Integer num = ((CommentPowerListAssem) aRunnableS32S0101000_21.l0).mp().DQ2().LJJIL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                linearLayoutManager.scrollToPositionWithOffset(i, iIntValue);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPowerListAssem@dc7a.switchListData$6$1");
    }

    public static final void run$16(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        int iIntValue;
        C1C7U.LIZ("CommentPowerListAssem@dc7a.switchListData$9$1");
        try {
            RecyclerView.LayoutManager layoutManager = ((CommentPowerListAssem) aRunnableS32S0101000_21.l0).Bp().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int i = aRunnableS32S0101000_21.i1;
                Integer num = ((CommentPowerListAssem) aRunnableS32S0101000_21.l0).mp().DQ2().LJJIL;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                linearLayoutManager.scrollToPositionWithOffset(i, iIntValue);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPowerListAssem@dc7a.switchListData$9$1");
    }

    public static final void run$2(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncDanmakuController@3623.onConfigChanged$1");
        try {
            aRunnableS32S0101000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncDanmakuController@3623.onConfigChanged$1");
    }

    public static final void run$3(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorBusinessApiImpl@f0d7.preloadVideoIfHitRules$1$task$1");
        try {
            PreloadVideoUtil preloadVideoUtil = PreloadVideoUtil.LIZ;
            int i = aRunnableS32S0101000_21.i1;
            List list = (List) aRunnableS32S0101000_21.l0;
            preloadVideoUtil.getClass();
            PreloadVideoUtil.LIZ(i, list);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorBusinessApiImpl@f0d7.preloadVideoIfHitRules$1$task$1");
    }

    public static final void run$4(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentInnerPagerAssem@d4d7.onViewCreated$1$onRefreshSuccess$1");
        try {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((CommentInnerPagerAssem) aRunnableS32S0101000_21.l0).LLIZLLLIL;
            if (viewOnAttachStateChangeListenerC20631115oD != null) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(aRunnableS32S0101000_21.i1, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentInnerPagerAssem@d4d7.onViewCreated$1$onRefreshSuccess$1");
    }

    public static final void run$5(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentPowerListAssem@dc7a.onViewCreated$1$2$onScrolled$2");
        try {
            IPageActionBarAbility iPageActionBarAbility = ((CommentPowerListAssem) aRunnableS32S0101000_21.l0).LLLJIL;
            if (iPageActionBarAbility != null) {
                iPageActionBarAbility.Li1(0.0f, aRunnableS32S0101000_21.i1, null, null);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPowerListAssem@dc7a.onViewCreated$1$2$onScrolled$2");
    }

    public static final void run$6(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("SharePanelContactRootAssem@96e0.onImLayoutHeightOffset$1");
        try {
            ((SharePanelContactRootAssem) aRunnableS32S0101000_21.l0).k3(aRunnableS32S0101000_21.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SharePanelContactRootAssem@96e0.onImLayoutHeightOffset$1");
    }

    public static final void run$7(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        C1383410m6V c1383410m6V = (C1383410m6V) aRunnableS32S0101000_21.l0;
        int i = aRunnableS32S0101000_21.i1;
        c1383410m6V.getClass();
        C1C7U.LIZ("GifShareNew@9c1b.onDownloadProgress$1L");
        DialogC1390150mHN dialogC1390150mHN = c1383410m6V.LIZIZ;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.LJJLL(i, false);
        }
        C1C7U.LIZIZ("GifShareNew@9c1b.onDownloadProgress$1L");
    }

    public static final void run$8(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        C1C7U.LIZ("GiftChoosePanel@3980.setupViews$1$1");
        try {
            ((C1349220lDM) aRunnableS32S0101000_21.l0).setCurrentItem(aRunnableS32S0101000_21.i1, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftChoosePanel@3980.setupViews$1$1");
    }

    public static final void run$9(ARunnableS32S0101000_21 aRunnableS32S0101000_21) {
        boolean zLIZ;
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        C1C7U.LIZ("VCBaseAdapter@7fdb.scrollToPosition$1");
        try {
            RecyclerView recyclerView = ((AbstractC1664130tPH) aRunnableS32S0101000_21.l0).LL;
            RecyclerView.LayoutManager layoutManager2 = null;
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager instanceof LinearLayoutManager) {
                RecyclerView recyclerView2 = ((AbstractC1664130tPH) aRunnableS32S0101000_21.l0).LL;
                if (recyclerView2 != null) {
                    layoutManager2 = recyclerView2.getLayoutManager();
                }
                if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager2) != null) {
                    linearLayoutManager.scrollToPositionWithOffset(aRunnableS32S0101000_21.i1, 0);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VCBaseAdapter@7fdb.scrollToPosition$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS32S0101000_21(int i, int i2, List<AnchorCommonStruct> list) {
        this.$t = list;
        this.i1 = i;
        this.l0 = i2;
    }
}
