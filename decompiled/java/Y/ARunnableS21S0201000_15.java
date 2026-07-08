package Y;

import X.AbstractC960950b77;
import X.C09AJ;
import X.C0VSJ;
import X.C1117360fBO;
import X.C1324610kZf;
import X.C1C7U;
import X.C20441214yg;
import X.C207206166i;
import X.C207207166j;
import X.C2188811AlT;
import X.C410901il;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C814420VxA;
import X.C932860aNo;
import X.C935100aRQ;
import X.C936140aT6;
import X.C955590ayT;
import X.EnumC771350UNp;
import X.EnumC935940aSm;
import X.RunnableC781530UlD;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.MultiGuestAsGuestInviteSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2;
import com.bytedance.android.live.liveinteract.multilive.model.BannerContentMultiGuest;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: loaded from: classes16.dex */
public class ARunnableS21S0201000_15 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str;
        ImageModel imageModel = ((BannerContentMultiGuest) this.l0).coreImage;
        if (imageModel == null || (str = imageModel.mUri) == null || str.length() <= 0) {
            C500260Jjc.LJLL(0, 0, ((C932860aNo) this.l1).LLILLL);
        } else {
            C500260Jjc.LJLL(this.i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)), ((C932860aNo) this.l1).LLILLL);
            C1324610kZf c1324610kZfLJIIIZ = ((C932860aNo) this.l1).getImageLoader().LJIIIZ(((BannerContentMultiGuest) this.l0).coreImage);
            c1324610kZfLJIIIZ.LJJIFFI = true;
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_END;
            int i = this.i2;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
            c1324610kZfLJIIIZ.LJ = i;
            c1324610kZfLJIIIZ.LJFF = iLIZIZ;
            c1324610kZfLJIIIZ.LJJI(((C932860aNo) this.l1).LLILLL);
        }
        if (((BannerContentMultiGuest) this.l0).backgroundImage != null) {
            C1324610kZf c1324610kZfLJIIIZ2 = ((C932860aNo) this.l1).getBgLoader().LJIIIZ(((BannerContentMultiGuest) this.l0).backgroundImage);
            c1324610kZfLJIIIZ2.LJJIFFI = true;
            c1324610kZfLJIIIZ2.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLJIIIZ2.LJJI(((C932860aNo) this.l1).LLILZ);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS21S0201000_15.LIZ$1():void");
    }

    public final void LIZ$2() {
        String targetFilePath;
        String absolutePath;
        int i = this.i2;
        DownloadInfo downloadInfo = (DownloadInfo) this.l0;
        String str = "";
        if (downloadInfo == null || (targetFilePath = downloadInfo.getTargetFilePath()) == null) {
            targetFilePath = "";
        }
        Bitmap bitmapLoadBitmap = BitmapUtils.loadBitmap(i, targetFilePath);
        EnumC771350UNp enumC771350UNp = EnumC771350UNp.MULTI_LIVE_AVATAR;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("avatar_final_");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".jpg");
        C0VSJ c0vsjLIZIZ = C207206166i.LIZIZ(new C207207166j(C2188811AlT.LIZIZ(sbLIZ), enumC771350UNp, bitmapLoadBitmap, false, null, 0, 972));
        MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment = (MultiGuestCreateAvatarFragment) this.l1;
        if (c0vsjLIZIZ != null && (absolutePath = c0vsjLIZIZ.getAbsolutePath()) != null) {
            str = absolutePath;
        }
        C09AJ<C936140aT6> c09aj = multiGuestCreateAvatarFragment.LLJJJIL;
        if (c09aj != null) {
            c09aj.onNext(new C936140aT6(EnumC935940aSm.STATE_SUCCESS, 100, str));
        }
        C09AJ<C936140aT6> c09aj2 = multiGuestCreateAvatarFragment.LLJJJIL;
        if (c09aj2 != null) {
            c09aj2.onComplete();
        }
    }

    public final void LIZ$3() {
        C410901il c410901il;
        C410901il c410901il2;
        MultiHostInviteListFragmentV2 multiHostInviteListFragmentV2 = (MultiHostInviteListFragmentV2) this.l0;
        multiHostInviteListFragmentV2.LLIZLLLIL = false;
        if (multiHostInviteListFragmentV2.mStatusViewValid) {
            AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) multiHostInviteListFragmentV2.LLILLL;
            if (abstractC960950b77 != null && (c410901il2 = abstractC960950b77.LLJILJILJ) != null) {
                c410901il2.add(this.i2, (C955590ayT) this.l1);
            }
            MultiHostInviteListFragmentV2 multiHostInviteListFragmentV22 = (MultiHostInviteListFragmentV2) this.l0;
            C1117360fBO c1117360fBO = multiHostInviteListFragmentV22.LLJJI;
            AbstractC960950b77 abstractC960950b772 = (AbstractC960950b77) multiHostInviteListFragmentV22.LLILLL;
            if (abstractC960950b772 == null || (c410901il = abstractC960950b772.LLJILJILJ) == null) {
                c410901il = new C410901il();
            }
            c1117360fBO.LL = c410901il;
            ((MultiHostInviteListFragmentV2) this.l0).LLJJI.notifyItemInserted(this.i2);
            C20441214yg.LIZIZ("MultiHostInviteListUpgradeFragment", "User inserted completed");
            AbstractC960950b77 abstractC960950b773 = (AbstractC960950b77) ((MultiHostInviteListFragmentV2) this.l0).LLILLL;
            if (abstractC960950b773 != null) {
                abstractC960950b773.LJJIJIIJIL(((C955590ayT) this.l1).LJIIIIZZ);
            }
        }
    }

    public static final void run$0(ARunnableS21S0201000_15 aRunnableS21S0201000_15) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        View viewFindViewByPosition;
        C1C7U.LIZ("MultiGuestAsGuestInviteSheetFragment@eba2.scrollAndHighlight$1$1");
        try {
            RecyclerView.LayoutManager layoutManager = ((RunnableC781530UlD) aRunnableS21S0201000_15.l0).getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(aRunnableS21S0201000_15.i2)) != null) {
                MultiGuestAsGuestInviteSheetFragment multiGuestAsGuestInviteSheetFragment = (MultiGuestAsGuestInviteSheetFragment) aRunnableS21S0201000_15.l1;
                C935100aRQ c935100aRQ = new C935100aRQ(viewFindViewByPosition);
                multiGuestAsGuestInviteSheetFragment.LLLFF = c935100aRQ;
                c935100aRQ.LIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestAsGuestInviteSheetFragment@eba2.scrollAndHighlight$1$1");
    }

    public static final void run$1(ARunnableS21S0201000_15 aRunnableS21S0201000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestAsGuestInviteSheetFragment@eba2.scrollAndHighlight$1");
        try {
            RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) aRunnableS21S0201000_15.l0;
            HandlerHook.viewPost(runnableC781530UlD, new ARunnableS21S0201000_15(aRunnableS21S0201000_15.i2, runnableC781530UlD, (MultiGuestAsGuestInviteSheetFragment) aRunnableS21S0201000_15.l1, 0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestAsGuestInviteSheetFragment@eba2.scrollAndHighlight$1");
    }

    public static final void run$2(ARunnableS21S0201000_15 aRunnableS21S0201000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiPanelTopBanner@4d04.setupCommonBanner$1$1$3");
        try {
            aRunnableS21S0201000_15.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiPanelTopBanner@4d04.setupCommonBanner$1$1$3");
    }

    public static final void run$3(ARunnableS21S0201000_15 aRunnableS21S0201000_15) {
        boolean zLIZ;
        C1C7U.LIZ("TakeTheStageMvpSeatView@878.setMvpSeat$2");
        try {
            aRunnableS21S0201000_15.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakeTheStageMvpSeatView@878.setMvpSeat$2");
    }

    public static final void run$4(ARunnableS21S0201000_15 aRunnableS21S0201000_15) {
        boolean zLIZ;
        RecyclerView recyclerView;
        C1C7U.LIZ("LayoutSettingContract@73d7.refreshV3ForPlaybook$1$1");
        try {
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) aRunnableS21S0201000_15.l0).findFirstCompletelyVisibleItemPosition();
            int iFindLastCompletelyVisibleItemPosition = ((LinearLayoutManager) aRunnableS21S0201000_15.l0).findLastCompletelyVisibleItemPosition();
            int i = aRunnableS21S0201000_15.i2;
            if ((i < iFindFirstCompletelyVisibleItemPosition || i > iFindLastCompletelyVisibleItemPosition) && (recyclerView = ((LayoutSettingContract) aRunnableS21S0201000_15.l1).layoutChooseV3Rv) != null) {
                recyclerView.scrollToPosition(i);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutSettingContract@73d7.refreshV3ForPlaybook$1$1");
    }

    public static final void run$5(ARunnableS21S0201000_15 aRunnableS21S0201000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestCreateAvatarFragment@ace6.startToStylize$5$onImageStyleSuccess$1$1$invoke$2$1");
        try {
            aRunnableS21S0201000_15.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestCreateAvatarFragment@ace6.startToStylize$5$onImageStyleSuccess$1$1$invoke$2$1");
    }

    public static final void run$6(ARunnableS21S0201000_15 aRunnableS21S0201000_15) {
        boolean zLIZ;
        RecyclerView recyclerView;
        C1C7U.LIZ("LayoutSettingContract@73d7.initV3View$1$2");
        try {
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) aRunnableS21S0201000_15.l0).findFirstCompletelyVisibleItemPosition();
            int iFindLastCompletelyVisibleItemPosition = ((LinearLayoutManager) aRunnableS21S0201000_15.l0).findLastCompletelyVisibleItemPosition();
            int i = aRunnableS21S0201000_15.i2;
            if ((i < iFindFirstCompletelyVisibleItemPosition || i > iFindLastCompletelyVisibleItemPosition) && (recyclerView = ((LayoutSettingContract) aRunnableS21S0201000_15.l1).layoutChooseV3Rv) != null) {
                recyclerView.scrollToPosition(i);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutSettingContract@73d7.initV3View$1$2");
    }

    public static final void run$7(ARunnableS21S0201000_15 aRunnableS21S0201000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiHostInviteListFragmentV2@b7f0.triggerInsertionAndScroll$2");
        try {
            aRunnableS21S0201000_15.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiHostInviteListFragmentV2@b7f0.triggerInsertionAndScroll$2");
    }

    public ARunnableS21S0201000_15(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
