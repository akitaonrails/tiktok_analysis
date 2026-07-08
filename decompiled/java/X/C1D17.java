package X;

import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import com.ss.android.ugc.aweme.tako.aivideo.detail.page.TakoAiVideoDetailPageFragment;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1D17, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D17 implements InterfaceC1616070s9l {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onBeforePageChange$0(C1D17 c1d17) {
    }

    public static final /* synthetic */ void onBeforePageChange$1(C1D17 c1d17) {
    }

    public static final /* synthetic */ void onBeforePageChange$2(C1D17 c1d17) {
    }

    public static final /* synthetic */ void onBeforePageChange$3(C1D17 c1d17) {
    }

    public static final /* synthetic */ void onBeforePageChange$4(C1D17 c1d17) {
    }

    public static final /* synthetic */ void onBeforePageChange$5(C1D17 c1d17) {
    }

    public static final /* synthetic */ void onBeforePageChange$6(C1D17 c1d17) {
    }

    public static final void onPageScrollStateChanged$0(C1D17 c1d17, int i) {
    }

    public static final void onPageScrollStateChanged$1(C1D17 c1d17, int i) {
    }

    public static final void onPageScrollStateChanged$2(C1D17 c1d17, int i) {
    }

    public static final void onPageScrollStateChanged$3(C1D17 c1d17, int i) {
    }

    public static final void onPageScrollStateChanged$4(C1D17 c1d17, int i) {
    }

    public static final void onPageScrollStateChanged$5(C1D17 c1d17, int i) {
    }

    public static final void onPageScrollStateChanged$6(C1D17 c1d17, int i) {
    }

    public static final void onPageScrolled$0(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolled$2(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolled$3(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolled$4(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolled$5(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolled$6(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$0(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$1(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$2(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$3(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$4(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$5(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageScrolledEnd$6(C1D17 c1d17, int i, float f, int i2) {
    }

    public static final void onPageSelected$0(C1D17 c1d17, int i, boolean z) {
    }

    public static final void onPageSelected$1(C1D17 c1d17, int i, boolean z) {
    }

    public static final void onPageSelected$2(C1D17 c1d17, int i, boolean z) {
    }

    public static final void onPageSelected$3(C1D17 c1d17, int i, boolean z) {
    }

    public static final void onPageSelected$4(C1D17 c1d17, int i, boolean z) {
    }

    public static final void onPageSelected$5(C1D17 c1d17, int i, boolean z) {
    }

    public static final void onPageSelected$6(C1D17 c1d17, int i, boolean z) {
    }

    public static final void onPageUnSelected$0(C1D17 c1d17, C0SZ8 c0sz8) {
    }

    public static final void onPageUnSelected$1(C1D17 c1d17, C0SZ8 c0sz8) {
    }

    public static final void onPageUnSelected$2(C1D17 c1d17, C0SZ8 c0sz8) {
    }

    public static final void onPageUnSelected$3(C1D17 c1d17, C0SZ8 c0sz8) {
    }

    public static final void onPageUnSelected$4(C1D17 c1d17, C0SZ8 c0sz8) {
    }

    public static final void onPageUnSelected$5(C1D17 c1d17, C0SZ8 c0sz8) {
    }

    public static final void onPageUnSelected$6(C1D17 c1d17, C0SZ8 c0sz8) {
    }

    public static final /* synthetic */ void onScrollToItemStart$0(C1D17 c1d17, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$0(C1D17 c1d17, int i, boolean z) {
    }

    public static final /* synthetic */ void onScrollToItemStart$1(C1D17 c1d17, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$1(C1D17 c1d17, int i, boolean z) {
    }

    public static final /* synthetic */ void onScrollToItemStart$2(C1D17 c1d17, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$2(C1D17 c1d17, int i, boolean z) {
    }

    public static final /* synthetic */ void onScrollToItemStart$3(C1D17 c1d17, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$3(C1D17 c1d17, int i, boolean z) {
    }

    public static final /* synthetic */ void onScrollToItemStart$4(C1D17 c1d17, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$4(C1D17 c1d17, int i, boolean z) {
    }

    public static final /* synthetic */ void onScrollToItemStart$5(C1D17 c1d17, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$5(C1D17 c1d17, int i, boolean z) {
    }

    public static final /* synthetic */ void onScrollToItemStart$6(C1D17 c1d17, int i) {
    }

    public static final /* synthetic */ void onScrollToItemStart$6(C1D17 c1d17, int i, boolean z) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
        switch (this.$t) {
            case 0:
                onBeforePageChange$0(this);
                break;
            case 1:
                onBeforePageChange$1(this);
                break;
            case 2:
                onBeforePageChange$2(this);
                break;
            case 3:
                onBeforePageChange$3(this);
                break;
            case 4:
                onBeforePageChange$4(this);
                break;
            case 5:
                onBeforePageChange$5(this);
                break;
            case 6:
                onBeforePageChange$6(this);
                break;
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
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

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
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

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolledEnd$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolledEnd$1(this, i, f, i2);
                break;
            case 2:
                onPageScrolledEnd$2(this, i, f, i2);
                break;
            case 3:
                onPageScrolledEnd$3(this, i, f, i2);
                break;
            case 4:
                onPageScrolledEnd$4(this, i, f, i2);
                break;
            case 5:
                onPageScrolledEnd$5(this, i, f, i2);
                break;
            case 6:
                onPageScrolledEnd$6(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) throws JSONException {
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

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i, z);
                break;
            case 1:
                onPageSelected$1(this, i, z);
                break;
            case 2:
                onPageSelected$2(this, i, z);
                break;
            case 3:
                onPageSelected$3(this, i, z);
                break;
            case 4:
                onPageSelected$4(this, i, z);
                break;
            case 5:
                onPageSelected$5(this, i, z);
                break;
            case 6:
                onPageSelected$6(this, i, z);
                break;
        }
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
        switch (this.$t) {
            case 0:
                onPageUnSelected$0(this, c0sz8);
                break;
            case 1:
                onPageUnSelected$1(this, c0sz8);
                break;
            case 2:
                onPageUnSelected$2(this, c0sz8);
                break;
            case 3:
                onPageUnSelected$3(this, c0sz8);
                break;
            case 4:
                onPageUnSelected$4(this, c0sz8);
                break;
            case 5:
                onPageUnSelected$5(this, c0sz8);
                break;
            case 6:
                onPageUnSelected$6(this, c0sz8);
                break;
        }
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
        switch (this.$t) {
            case 0:
                onScrollToItemStart$0(this, i);
                break;
            case 1:
                onScrollToItemStart$1(this, i);
                break;
            case 2:
                onScrollToItemStart$2(this, i);
                break;
            case 3:
                onScrollToItemStart$3(this, i);
                break;
            case 4:
                onScrollToItemStart$4(this, i);
                break;
            case 5:
                onScrollToItemStart$5(this, i);
                break;
            case 6:
                onScrollToItemStart$6(this, i);
                break;
        }
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
        switch (this.$t) {
            case 0:
                onScrollToItemStart$0(this, i, z);
                break;
            case 1:
                onScrollToItemStart$1(this, i, z);
                break;
            case 2:
                onScrollToItemStart$2(this, i, z);
                break;
            case 3:
                onScrollToItemStart$3(this, i, z);
                break;
            case 4:
                onScrollToItemStart$4(this, i, z);
                break;
            case 5:
                onScrollToItemStart$5(this, i, z);
                break;
            case 6:
                onScrollToItemStart$6(this, i, z);
                break;
        }
    }

    public C1D17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(C1D17 c1d17, int i) {
        ((C2239781ClU) c1d17.l0).LJIILIIL(i);
    }

    public static final void onPageSelected$1(C1D17 c1d17, int i) {
        ((C2239781ClU) c1d17.l0).LJIILIIL(i);
    }

    public static final void onPageSelected$2(C1D17 c1d17, int i) {
        C0SZ8 c0sz8LJLIL;
        int size;
        List<Aweme> listFg;
        Aweme aweme;
        int size2;
        List<PhotoModeImageUrlModel> imageList;
        List<Aweme> listFg2;
        C0SR4 c0sr4;
        List<Aweme> listFg3;
        Aweme aweme2;
        C0SZ8 c0sz8LJLIL2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility;
        C0SZ8 c0sz8;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        C2239881Cle c2239881Cle = (C2239881Cle) c1d17.l0;
        c2239881Cle.LJ = i;
        C0SZ8 c0sz82 = c2239881Cle.LIZIZ;
        if (c0sz82 != null) {
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) ((LinkedHashMap) c2239881Cle.LIZJ).get(Integer.valueOf(System.identityHashCode(c0sz82)));
            if (iPhotoSlidesEventDispatchAbility2 != null || ((c0sz8 = c2239881Cle.LIZIZ) != null && (interfaceC665370Q7zLIZIZ2 = C0T0K.LIZIZ(c0sz8)) != null && (iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, IPhotoSlidesEventDispatchAbility.class, null)) != null)) {
                iPhotoSlidesEventDispatchAbility2.b3(c2239881Cle.LJII);
            }
            c2239881Cle.LIZIZ = null;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) c2239881Cle.LJFF.getValue();
        if (iViewPagerComponentAbility != null) {
            c0sz8LJLIL = iViewPagerComponentAbility.LJLIL();
        } else {
            c0sz8LJLIL = null;
        }
        if ((c0sz8LJLIL instanceof IPhotosViewHolderType) && (c0sr4 = (C0SR4) c2239881Cle.LJI.getValue()) != null && (listFg3 = c0sr4.Fg()) != null && (aweme2 = (Aweme) C13LP.LJJJLZIJ(c2239881Cle.LJ, listFg3)) != null && aweme2.getAid() != null) {
            IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) c2239881Cle.LJFF.getValue();
            if (iViewPagerComponentAbility2 != null) {
                c0sz8LJLIL2 = iViewPagerComponentAbility2.LJLIL();
            } else {
                c0sz8LJLIL2 = null;
            }
            c2239881Cle.LIZIZ = c0sz8LJLIL2;
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility3 = (IPhotoSlidesEventDispatchAbility) ((LinkedHashMap) c2239881Cle.LIZJ).get(Integer.valueOf(System.identityHashCode(c0sz8LJLIL2)));
            if (iPhotoSlidesEventDispatchAbility3 != null) {
                iPhotoSlidesEventDispatchAbility3.LLJJI(c2239881Cle.LJII);
            } else {
                C0SZ8 c0sz83 = c2239881Cle.LIZIZ;
                if (c0sz83 != null && (interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(c0sz83)) != null && (iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IPhotoSlidesEventDispatchAbility.class, null)) != null) {
                    iPhotoSlidesEventDispatchAbility.LLJJI(c2239881Cle.LJII);
                    c2239881Cle.LIZJ.put(Integer.valueOf(System.identityHashCode(c2239881Cle.LIZIZ)), iPhotoSlidesEventDispatchAbility);
                }
            }
            c2239881Cle.LIZJ(0);
        }
        int i2 = i + 2;
        C0SR4 c0sr42 = (C0SR4) c2239881Cle.LJI.getValue();
        if (c0sr42 != null && (listFg2 = c0sr42.Fg()) != null) {
            size = listFg2.size();
        } else {
            size = 0;
        }
        int iMin = Math.min(size, i + C2239941Clk.LIZ().verticalTriggerDelta);
        if (iMin < i2) {
            return;
        }
        while (i2 < iMin) {
            C0SR4 c0sr43 = (C0SR4) c2239881Cle.LJI.getValue();
            if (c0sr43 != null && (listFg = c0sr43.Fg()) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(i2, listFg)) != null && aweme.getAid() != null && AwemeExtKt.isPhotoMode(aweme)) {
                int i3 = C2239941Clk.LIZ().verticalLoadHorizontalCount;
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    size2 = imageList.size();
                } else {
                    size2 = 0;
                }
                int iMin2 = Math.min(i3, size2);
                if (iMin2 >= 0) {
                    for (int i4 = 0; i4 < iMin2; i4++) {
                        c2239881Cle.LIZLLL(i2, i4, 0, aweme);
                    }
                }
            }
            i2++;
        }
    }

    public static final void onPageSelected$3(C1D17 c1d17, int i) {
        ((C2239731ClP) c1d17.l0).LJIIIZ(i);
    }

    public static final void onPageSelected$4(C1D17 c1d17, int i) {
        ((C2239731ClP) c1d17.l0).LJIIIZ(i);
    }

    public static final void onPageSelected$5(C1D17 c1d17, int i) {
        ((C2239861Clc) c1d17.l0).LJIILJJIL(i);
    }

    public static final void onPageSelected$6(C1D17 c1d17, int i) throws JSONException {
        String aid;
        EnumC1687410u0p messageType;
        String str;
        int i2;
        Aweme awemeLJIIIIZZ;
        TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment = (TakoAiVideoDetailPageFragment) c1d17.l0;
        takoAiVideoDetailPageFragment.getClass();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(takoAiVideoDetailPageFragment);
        if (iFeedPanelPlatformAbilityLIZJ != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ()) != null) {
            aid = awemeLJIIIIZZ.getAid();
        } else {
            aid = null;
        }
        ((TakoAiVideoDetailPageFragment) c1d17.l0).iS().LJIILIIL(aid);
        TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment2 = (TakoAiVideoDetailPageFragment) c1d17.l0;
        if (takoAiVideoDetailPageFragment2.LLJJJJLIIL) {
            takoAiVideoDetailPageFragment2.iS().LJIIJJI(EnumC1284940jXg.MUTE);
            TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment3 = (TakoAiVideoDetailPageFragment) c1d17.l0;
            int i3 = 0;
            if (takoAiVideoDetailPageFragment3.LLJJLIIIJLLLLLLLZ) {
                takoAiVideoDetailPageFragment3.LLJJLIIIJLLLLLLLZ = false;
            } else if (takoAiVideoDetailPageFragment3.LLLIIIIL.getValue() == C05TC.HIDE_AWEME) {
                C1687320u0g state = takoAiVideoDetailPageFragment3.hS().getState();
                InterfaceC1672680td4 interfaceC1672680td4 = (InterfaceC1672680td4) C13LP.LJJLIIIJL(state.LL);
                if (interfaceC1672680td4 != null) {
                    messageType = interfaceC1672680td4.getMessageType();
                } else {
                    messageType = null;
                }
                if (messageType != EnumC1687410u0p.USER_QUERY && messageType != EnumC1687410u0p.THINK && ((str = state.LLILLJJLI) == null || str.length() == 0)) {
                    ((TakoAiVideoDetailPageFragment) c1d17.l0).fz(C05TC.SHOW_AWEME_INSTANT);
                }
            }
            TakoAiVideoDetailPageFragment takoAiVideoDetailPageFragment4 = (TakoAiVideoDetailPageFragment) c1d17.l0;
            String str2 = takoAiVideoDetailPageFragment4.LLJJL;
            if (str2 != null && aid != null) {
                ArrayList arrayList = (ArrayList) ((BaseDetailShareVM) takoAiVideoDetailPageFragment4.LLJJIJI.getValue()).getAwemeList();
                Iterator it2 = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    i2 = -1;
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((Aweme) it2.next()).getAid(), str2)) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(((Aweme) it3.next()).getAid(), aid)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i4 >= 0 && i2 > i4) {
                    takoAiVideoDetailPageFragment4.LLJJL = null;
                    takoAiVideoDetailPageFragment4.WR(takoAiVideoDetailPageFragment4.getString(2131822615));
                    return;
                }
                return;
            }
            return;
        }
        takoAiVideoDetailPageFragment2.LLJJJJLIIL = true;
    }
}
