package X;

import Y.ARunnableS111S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.livephoto.ability.PhotoLivePhotoComponentAbility;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoDynamicBgColorComponent;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoModeLastImageHintAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideEventDispatchComponent;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0Syj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738950Syj implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(C738950Syj c738950Syj, int i) {
    }

    public static final void onPageScrollStateChanged$4(C738950Syj c738950Syj, int i) {
    }

    public static final void onPageScrolled$0(C738950Syj c738950Syj, int i, float f, int i2) {
    }

    public static final void onPageScrolled$4(C738950Syj c738950Syj, int i, float f, int i2) {
    }

    public static final void onPageSelected$2(C738950Syj c738950Syj, int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
            case 3:
                onPageScrollStateChanged$3(this, i);
                break;
            case 4:
                onPageScrollStateChanged$4(this, i);
                break;
            case 5:
                onPageScrollStateChanged$5(this, i);
                break;
            case 6:
                onPageScrollStateChanged$6(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolled$2(this, i, f, i2);
                break;
            case 3:
                onPageScrolled$3(this, i, f, i2);
                break;
            case 4:
                onPageScrolled$4(this, i, f, i2);
                break;
            case 5:
                onPageScrolled$5(this, i, f, i2);
                break;
            case 6:
                onPageScrolled$6(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
            case 3:
                onPageSelected$3(this, i);
                break;
            case 4:
                onPageSelected$4(this, i);
                break;
            case 5:
                onPageSelected$5(this, i);
                break;
            case 6:
                onPageSelected$6(this, i);
                break;
        }
    }

    public final CopyOnWriteArrayList<InterfaceC469360Ias> LIZ$0() {
        return (CopyOnWriteArrayList) ((C01GW) this.l0).getValue();
    }

    public C738950Syj(int i) {
        this.$t = i;
        this.l0 = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(198));
    }

    public C738950Syj(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$1(C738950Syj c738950Syj, int i) {
        Iterator<InterfaceC469360Ias> it2 = c738950Syj.LIZ$0().iterator();
        while (it2.hasNext()) {
            it2.next().onPageScrollStateChanged(i);
        }
    }

    public static final void onPageScrollStateChanged$2(C738950Syj c738950Syj, int i) {
        InterfaceC710220RtU interfaceC710220RtUHp;
        int currentItem;
        PhotoDynamicBgColorComponent photoDynamicBgColorComponent = (PhotoDynamicBgColorComponent) c738950Syj.l0;
        photoDynamicBgColorComponent.LLJLLIL = i;
        if (i == 0 && (interfaceC710220RtUHp = photoDynamicBgColorComponent.hp()) != null && interfaceC710220RtUHp.LJIIL()) {
            C0SLX c0slx = ((PhotoDynamicBgColorComponent) c738950Syj.l0).LLJLLL;
            if (c0slx != null) {
                currentItem = c0slx.getCurrentItem();
            } else {
                currentItem = -1;
            }
            ((PhotoDynamicBgColorComponent) c738950Syj.l0).lp(0.0f, currentItem);
            ((PhotoDynamicBgColorComponent) c738950Syj.l0).kp(currentItem);
        }
    }

    public static final void onPageScrollStateChanged$3(C738950Syj c738950Syj, int i) {
        boolean z;
        View view;
        TuxIconView tuxIconView;
        PhotoModeLastImageHintAssem photoModeLastImageHintAssem = (PhotoModeLastImageHintAssem) c738950Syj.l0;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        photoModeLastImageHintAssem.LLLF = z;
        if (i != 0) {
            if (i == 2 && photoModeLastImageHintAssem.op()) {
                ((PhotoModeLastImageHintAssem) c738950Syj.l0).lp(false);
                C736680Sv4.LJIJJLI(((PhotoModeLastImageHintAssem) c738950Syj.l0).ip(), new AwS590S0100000_11((PhotoModeLastImageHintAssem) c738950Syj.l0, 291));
                C0SLX c0slx = ((PhotoModeLastImageHintAssem) c738950Syj.l0).LLJJJJLIIL;
                if (c0slx != null) {
                    c0slx.setSmoothScrollDelay(false);
                    return;
                }
                return;
            }
            return;
        }
        C0SLX c0slx2 = photoModeLastImageHintAssem.LLJJJJLIIL;
        if (c0slx2 != null && c0slx2.getCurrentItem() == ((PhotoModeLastImageHintAssem) c738950Syj.l0).hp() - 1) {
            ((PhotoModeLastImageHintAssem) c738950Syj.l0).LLJZIJLIL = false;
        }
        if (!((VideoItemParams) C631370Opb.LIZ((PhotoModeLastImageHintAssem) c738950Syj.l0)).getAweme().isSubOnlyVideo()) {
            ((PhotoModeLastImageHintAssem) c738950Syj.l0).mp(false, null);
        }
        PhotosViewHolderV3 photosViewHolderV3Ep = ((PhotoModeLastImageHintAssem) c738950Syj.l0).ep();
        if (photosViewHolderV3Ep == null || (view = photosViewHolderV3Ep.LL) == null || (tuxIconView = (TuxIconView) view.findViewById(R.id.qcv)) == null) {
            return;
        }
        C786410Ut5.x5(tuxIconView, 0.0f);
    }

    public static final void onPageScrollStateChanged$5(C738950Syj c738950Syj, int i) {
        ScrollSwitchStateManager scrollSwitchStateManagerYo = ((C0SRZ) c738950Syj.l0).Yo();
        if (scrollSwitchStateManagerYo != null) {
            scrollSwitchStateManagerYo.LLJ.setValue(Integer.valueOf(i));
        }
        if (i == 2) {
            ((C0SRZ) c738950Syj.l0).DR().LLIZ.setValue(Unit.LIZ);
        }
    }

    public static final void onPageScrollStateChanged$6(C738950Syj c738950Syj, int i) {
        ((C0S00) c738950Syj.l0).LIZ.getAweme();
        C1440005kM.LIZ(new C714410S0p(EnumC714390S0n.PAGE_STATE_CHANGE, -1, null, null, Integer.valueOf(i)));
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C0SQJ.LIZ.getClass();
                    if (C0SQJ.LIZIZ) {
                        return;
                    }
                    VideoViewCell videoViewCell = ((C0S00) c738950Syj.l0).LIZ;
                    videoViewCell.c0.Y2(videoViewCell.getAweme(), false, false);
                    ((C0S00) c738950Syj.l0).LIZIZ = true;
                    return;
                }
                return;
            }
            C0S00 c0s00 = (C0S00) c738950Syj.l0;
            c0s00.LIZIZ = false;
            c0s00.LIZ.c0.nk(false);
            return;
        }
        if (((C0S00) c738950Syj.l0).LIZIZ) {
            return;
        }
        C0SQJ.LIZ.getClass();
        if (C0SQJ.LIZIZ) {
            return;
        }
        VideoViewCell videoViewCell2 = ((C0S00) c738950Syj.l0).LIZ;
        videoViewCell2.c0.Y2(videoViewCell2.getAweme(), false, false);
    }

    public static final void onPageSelected$0(C738950Syj c738950Syj, int i) {
        if (i == 0) {
            DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) c738950Syj.l0;
            Aweme item = detailFragmentPanel.LLJL.getItem(detailFragmentPanel.LLJJIJI.getCurrentItem());
            if (item != null && !item.equals(C740740T3w.LJFF((C19EG) ((DetailFragmentPanel) c738950Syj.l0).activity))) {
                C740740T3w.LJII((C19EG) ((DetailFragmentPanel) c738950Syj.l0).activity, item);
                return;
            }
            return;
        }
        DetailFragmentPanel detailFragmentPanel2 = (DetailFragmentPanel) c738950Syj.l0;
        Aweme item2 = detailFragmentPanel2.LLJL.getItem(detailFragmentPanel2.LLJJIJI.getCurrentItem());
        C736400Suc c736400Suc = C736400Suc.LIZ;
        Activity activity = ((DetailFragmentPanel) c738950Syj.l0).activity;
        EnumC1584370rKd enumC1584370rKd = EnumC1584370rKd.FEED;
        c736400Suc.getClass();
        C736400Suc.LIZJ(activity, "enter_profile", enumC1584370rKd, item2);
    }

    public static final void onPageSelected$1(C738950Syj c738950Syj, int i) {
        Iterator<InterfaceC469360Ias> it2 = c738950Syj.LIZ$0().iterator();
        while (it2.hasNext()) {
            it2.next().onPageSelected(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.19ng] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, X.19ng] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onPageSelected$3(X.C738950Syj r12, int r13) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C738950Syj.onPageSelected$3(X.0Syj, int):void");
    }

    public static final void onPageSelected$4(C738950Syj c738950Syj, int i) {
        PhotoSlideEventDispatchComponent photoSlideEventDispatchComponent = (PhotoSlideEventDispatchComponent) c738950Syj.l0;
        if (photoSlideEventDispatchComponent.LLJLLL >= 0) {
            Iterator<C0SOB> it2 = photoSlideEventDispatchComponent.ep().LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().Aa();
            }
        }
        PhotoSlideEventDispatchComponent photoSlideEventDispatchComponent2 = (PhotoSlideEventDispatchComponent) c738950Syj.l0;
        photoSlideEventDispatchComponent2.LLJLLL = i;
        Iterator<C0SOB> it3 = photoSlideEventDispatchComponent2.ep().LIZ.iterator();
        while (it3.hasNext()) {
            it3.next().onPageSelected(i);
        }
    }

    public static final void onPageSelected$5(C738950Syj c738950Syj, int i) {
        CommonPageFragment commonPageFragmentLJJIJLIJ;
        PostModeDetailFragment postModeDetailFragment;
        String str;
        PostModeDetailParams postModeDetailParams;
        C1590400rUM c1590400rUMLH = ((C0SRZ) c738950Syj.l0).LH();
        if (c1590400rUMLH != null) {
            commonPageFragmentLJJIJLIJ = c1590400rUMLH.LJJIJLIJ("PostModeDetailFragment");
        } else {
            commonPageFragmentLJJIJLIJ = null;
        }
        if ((commonPageFragmentLJJIJLIJ instanceof PostModeDetailFragment) && (postModeDetailFragment = (PostModeDetailFragment) commonPageFragmentLJJIJLIJ) != null) {
            postModeDetailFragment.LLILZ = i;
            if (i == 0) {
                postModeDetailFragment.gS(false);
                postModeDetailFragment.DR().LLJJIII.setValue(Unit.LIZ);
                postModeDetailFragment.bS();
                PhotoLivePhotoComponentAbility photoLivePhotoComponentAbility = (PhotoLivePhotoComponentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(postModeDetailFragment, null), PhotoLivePhotoComponentAbility.class, null);
                if (photoLivePhotoComponentAbility != null) {
                    photoLivePhotoComponentAbility.N10();
                }
            } else {
                postModeDetailFragment.LLLLLLLLLL();
                postModeDetailFragment.DR().LLJJIJI.setValue(Unit.LIZ);
                IScreenshotService iScreenshotService = (IScreenshotService) ServiceManager.get().getService(IScreenshotService.class);
                C0SRL c0srl = postModeDetailFragment.LLJILJIL;
                if (c0srl == null || (postModeDetailParams = c0srl.LJII) == null || (str = postModeDetailParams.previousPage) == null) {
                    str = "";
                }
                iScreenshotService.LIZJ(str);
                PhotoLivePhotoComponentAbility photoLivePhotoComponentAbility2 = (PhotoLivePhotoComponentAbility) C1558520qew.LIZ(C1558360qeg.LJFF(postModeDetailFragment, null), PhotoLivePhotoComponentAbility.class, null);
                if (photoLivePhotoComponentAbility2 != null) {
                    photoLivePhotoComponentAbility2.Ri0();
                }
                postModeDetailFragment.VR().C81();
            }
        }
        ScrollSwitchStateManager scrollSwitchStateManagerYo = ((C0SRZ) c738950Syj.l0).Yo();
        if (scrollSwitchStateManagerYo != null) {
            scrollSwitchStateManagerYo.LLIZLLLIL.setValue(Integer.valueOf(i));
        }
        ((C0SRZ) c738950Syj.l0).DR().LLJJL.setValue(Integer.valueOf(i));
    }

    public static final void onPageSelected$6(C738950Syj c738950Syj, int i) {
        ((C0S00) c738950Syj.l0).LIZ.getAweme();
        C1440005kM.LIZ(new C714410S0p(EnumC714390S0n.PAGE_SELECTED, i, null, null, null));
        if (i != 0) {
            C0S00 c0s00 = (C0S00) c738950Syj.l0;
            HandlerHook.viewPostDelay(c0s00.LIZ.c, new ARunnableS111S0100000_11(c0s00, 143), 500L);
        }
    }

    public static final void onPageScrolled$1(C738950Syj c738950Syj, int i, float f, int i2) {
        Iterator<InterfaceC469360Ias> it2 = c738950Syj.LIZ$0().iterator();
        while (it2.hasNext()) {
            it2.next().onPageScrolled(i, f, i2);
        }
    }

    public static final void onPageScrolled$2(C738950Syj c738950Syj, int i, float f, int i2) {
        ((PhotoDynamicBgColorComponent) c738950Syj.l0).lp(f, i);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.19ng] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.19ng] */
    public static final void onPageScrolled$3(C738950Syj c738950Syj, int i, float f, int i2) {
        TuxIconView tuxIconView;
        View view;
        PhotoModeLastImageHintAssem photoModeLastImageHintAssem = (PhotoModeLastImageHintAssem) c738950Syj.l0;
        int iLJIIJ = C12ES.LJIIJ(photoModeLastImageHintAssem.getContext());
        if (photoModeLastImageHintAssem.op() && ((i == photoModeLastImageHintAssem.hp() - 1 || i == photoModeLastImageHintAssem.hp()) && i2 < iLJIIJ)) {
            photoModeLastImageHintAssem.lp(photoModeLastImageHintAssem.LLLF);
            C0SLX c0slx = photoModeLastImageHintAssem.LLJJJJLIIL;
            if (c0slx != null) {
                c0slx.setSpringDragEnabled(true);
            }
            PhotosViewHolderV3 photosViewHolderV3Ep = photoModeLastImageHintAssem.ep();
            if (photosViewHolderV3Ep != null && (view = photosViewHolderV3Ep.LL) != null) {
                tuxIconView = (TuxIconView) view.findViewById(R.id.qcv);
            } else {
                tuxIconView = null;
            }
            C259800zU c259800zU = new C259800zU();
            C259800zU c259800zU2 = new C259800zU();
            if (tuxIconView != null) {
                float f2 = iLJIIJ * 0.08f;
                float f3 = i2;
                if (f3 >= f2) {
                    C786410Ut5.x5(tuxIconView, 1.0f);
                } else {
                    C786410Ut5.x5(tuxIconView, f3 / f2);
                }
                Context context = tuxIconView.getContext();
                EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.SPRING;
                c259800zU.element = new C21647019ng(context, tuxIconView, new C19746312Np(enumC19746112Nn, photoModeLastImageHintAssem.LLLIIL, photoModeLastImageHintAssem.LLLIILIL), false);
                c259800zU2.element = new C21647019ng(tuxIconView.getContext(), tuxIconView, new C19746312Np(enumC19746112Nn, photoModeLastImageHintAssem.LLLIIL, photoModeLastImageHintAssem.LLLIL), false);
            }
            C736680Sv4.LJIJJLI(photoModeLastImageHintAssem.ip(), new C0SRE(i2, iLJIIJ, photoModeLastImageHintAssem, tuxIconView, photosViewHolderV3Ep, i, c259800zU2, c259800zU));
            return;
        }
        photoModeLastImageHintAssem.LLJLILLLLZIIL = false;
        if (!C0RHE.LJ() && !C0RHE.LIZLLL()) {
            return;
        }
        C0SLX c0slx2 = photoModeLastImageHintAssem.LLJJJJLIIL;
        if (c0slx2 != null) {
            c0slx2.setSpringDragEnabled(false);
        }
        C0SLX c0slx3 = photoModeLastImageHintAssem.LLJJJJLIIL;
        if (c0slx3 != null) {
            c0slx3.setSmoothScrollDelay(false);
        }
        photoModeLastImageHintAssem.lp(false);
    }

    public static final void onPageScrolled$5(C738950Syj c738950Syj, int i, float f, int i2) {
        ScrollSwitchStateManager scrollSwitchStateManagerYo = ((C0SRZ) c738950Syj.l0).Yo();
        if (scrollSwitchStateManagerYo != null) {
            scrollSwitchStateManagerYo.JQ2(f, i, i2);
        }
    }

    public static final void onPageScrolled$6(C738950Syj c738950Syj, int i, float f, int i2) {
        ((C0S00) c738950Syj.l0).LIZ.getAweme();
        C1440005kM.LIZ(new C714410S0p(EnumC714390S0n.PAGE_SCROLL, i, Float.valueOf(f), Integer.valueOf(i2), null));
    }
}
