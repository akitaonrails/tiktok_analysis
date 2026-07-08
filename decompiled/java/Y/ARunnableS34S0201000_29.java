package Y;

import X.C0WZX;
import X.C122P;
import X.C1447800nmM;
import X.C19386810t0;
import X.C19398810uw;
import X.C19399210v0;
import X.C19574811iE;
import X.C19629011qy;
import X.C196902122a;
import X.C19723212Es;
import X.C19726412Fy;
import X.C198H;
import X.C1C7U;
import X.C20630615o8;
import X.C2204961BRm;
import X.C426750GoL;
import X.InterfaceC1452170ntP;
import X.InterfaceC19347710mh;
import X.InterfaceC19399010uy;
import X.InterfaceC19571111hd;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS34S0201000_29 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        InterfaceC1452170ntP value;
        int iLLL;
        ARunnableS102S0000000_29 aRunnableS102S0000000_29 = (ARunnableS102S0000000_29) this.l0;
        if (aRunnableS102S0000000_29 != null) {
            aRunnableS102S0000000_29.run();
            this.l0 = null;
        }
        ((C122P) this.l1).LJIIJJI().postDelayed(this, 16L);
        LiveData<InterfaceC1452170ntP> liveData = ((C122P) this.l1).LLIZ;
        if (liveData == null || (value = liveData.getValue()) == null || !((C122P) this.l1).LJIIL().LJLL() || (iLLL = value.LLL()) == this.i2) {
            return;
        }
        this.i2 = iLLL;
        ((C122P) this.l1).LJIIL().DJ2(iLLL);
    }

    public final void LIZ$1() throws Throwable {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(((C198H) this.l0).getScene());
        Activity activity = ((C198H) this.l0).getScene().mActivity;
        if (navigationSceneLIZ != null && navigationSceneLIZ.getSceneList().size() != 1) {
            navigationSceneLIZ.LLLLLLZZ(((C198H) this.l0).getScene(), new C20630615o8(this.i2, (Intent) this.l1));
        } else if (activity != null) {
            C2204961BRm.LJIIL(this.i2, activity, (Intent) this.l1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KMObQrng3SSTDPgYEDl6IdxJ", null));
        }
    }

    public final void LIZ$2() {
        if (((View) this.l0).getParent() == null) {
            return;
        }
        boolean zLJFF = C426750GoL.LJFF();
        if (this.i2 > 0) {
            ((C19726412Fy) this.l1).LJIIIIZZ = r1.LJII;
        } else {
            ((C19726412Fy) this.l1).LJIIIIZZ = zLJFF ? ((View) this.l0).getRight() - ((C19726412Fy) this.l1).LIZLLL.getRight() : -((View) this.l0).getLeft();
        }
        ((C19726412Fy) this.l1).LJ(zLJFF);
    }

    public final void LIZ$3() {
        InterfaceC1452170ntP value;
        int iLLL;
        ARunnableS102S0000000_29 aRunnableS102S0000000_29 = (ARunnableS102S0000000_29) this.l0;
        if (aRunnableS102S0000000_29 != null) {
            aRunnableS102S0000000_29.run();
            this.l0 = null;
        }
        SafeHandler safeHandler = ((C196902122a) this.l1).LLJJLIIIJLLLLLLLZ;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.postDelayed(this, 16L);
        LiveData<InterfaceC1452170ntP> liveData = ((C196902122a) this.l1).LLIZ;
        if (liveData == null || (value = liveData.getValue()) == null || !((C196902122a) this.l1).LIZJ().LJLL() || (iLLL = value.LLL()) == this.i2) {
            return;
        }
        this.i2 = iLLL;
        ((C196902122a) this.l1).LIZJ().DJ2(iLLL);
    }

    public static final void run$0(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EditTextStickerController@f6fd.initPlayingRefreshTask$1");
        try {
            aRunnableS34S0201000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditTextStickerController@f6fd.initPlayingRefreshTask$1");
    }

    public static final void run$1(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("CreativeBottomSheetBehavior@d3db.settleToStatePendingLayout$1");
        try {
            ((CreativeBottomSheetBehavior) aRunnableS34S0201000_29.l1).settleToState((View) aRunnableS34S0201000_29.l0, aRunnableS34S0201000_29.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreativeBottomSheetBehavior@d3db.settleToStatePendingLayout$1");
    }

    public static final void run$10(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("AiChatExtractFramesScene@6e18.initCoverView$1$1");
        try {
            ((C19723212Es) aRunnableS34S0201000_29.l0).LLLLLLIL((InterfaceC19571111hd) aRunnableS34S0201000_29.l1, aRunnableS34S0201000_29.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AiChatExtractFramesScene@6e18.initCoverView$1$1");
    }

    public static final void run$11(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("AutoPagerController@b4d2.scheduleAutoAdvance$1");
        try {
            if (!((C19386810t0) aRunnableS34S0201000_29.l0).LIZ) {
                int currentItem = ((ViewPager) aRunnableS34S0201000_29.l1).getCurrentItem();
                int i = aRunnableS34S0201000_29.i2;
                if (currentItem != i) {
                    try {
                        ((ViewPager) aRunnableS34S0201000_29.l1).setCurrentItem(i, true);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoPagerController@b4d2.scheduleAutoAdvance$1");
    }

    public static final void run$2(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("ISAFNavigateScene$DefaultImpls@4053.setResult$$inlined$runInMainThread$1");
        try {
            aRunnableS34S0201000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ISAFNavigateScene$DefaultImpls@4053.setResult$$inlined$runInMainThread$1");
    }

    public static final void run$3(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("OverlayHeaderSync@e8a.syncHeaderWithRv$1");
        try {
            aRunnableS34S0201000_29.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OverlayHeaderSync@e8a.syncHeaderWithRv$1");
    }

    public static final void run$4(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("CenterSelectionView@80dd.setSelectionSilent$1");
        try {
            ((C19399210v0) aRunnableS34S0201000_29.l0).LL.smoothScrollToPosition(aRunnableS34S0201000_29.i2);
            C19399210v0 c19399210v0 = (C19399210v0) aRunnableS34S0201000_29.l0;
            c19399210v0.LLILZ = (InterfaceC19399010uy) aRunnableS34S0201000_29.l1;
            c19399210v0.LLILZIL = aRunnableS34S0201000_29.i2;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CenterSelectionView@80dd.setSelectionSilent$1");
    }

    public static final void run$5(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("MentionStickerNewCoreService@fb6b.getIMentionStickerListViewManager$1$setSearchListViewVisibility$1");
        try {
            if (((ViewGroup) aRunnableS34S0201000_29.l0).getParent() != null) {
                ((C19629011qy) aRunnableS34S0201000_29.l1).LIZ.Hi(aRunnableS34S0201000_29.i2, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MentionStickerNewCoreService@fb6b.getIMentionStickerListViewManager$1$setSearchListViewVisibility$1");
    }

    public static final void run$6(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("CenterSelectionView@80dd.<init>$1$onScrollStateChanged$1$1");
        try {
            List<C19398810uw> list = ((C19399210v0) aRunnableS34S0201000_29.l0).LLIZ;
            if (list != null && ((C19398810uw) ListProtector.get(list, aRunnableS34S0201000_29.i2)) != null) {
                int i = aRunnableS34S0201000_29.i2;
                InterfaceC19399010uy interfaceC19399010uy = ((C19399210v0) aRunnableS34S0201000_29.l0).LLILZ;
                if (interfaceC19399010uy != null) {
                    interfaceC19399010uy.LIZ(i, false);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CenterSelectionView@80dd.<init>$1$onScrollStateChanged$1$1");
    }

    public static final void run$7(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("ReuseStickerHelper@c1.tryUpdateDialogFakeProgress$1");
        try {
            C19574811iE c19574811iE = (C19574811iE) aRunnableS34S0201000_29.l1;
            int i = c19574811iE.LJJLI + 1;
            c19574811iE.LJJLI = i;
            if (aRunnableS34S0201000_29.i2 < 20 && !c19574811iE.LJJLIIIJ) {
                C19574811iE.LJIILLIIL((Dialog) aRunnableS34S0201000_29.l0, i);
                C19574811iE c19574811iE2 = (C19574811iE) aRunnableS34S0201000_29.l1;
                c19574811iE2.LJIJ((Dialog) aRunnableS34S0201000_29.l0, c19574811iE2.LJJLI);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReuseStickerHelper@c1.tryUpdateDialogFakeProgress$1");
    }

    public static final void run$8(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EffectDownloadController@2473.callbackDownloadProgress$1");
        try {
            List<InterfaceC19347710mh> list = ((EffectDownloadController) aRunnableS34S0201000_29.l0).LJFF;
            Effect effect = (Effect) aRunnableS34S0201000_29.l1;
            int i = aRunnableS34S0201000_29.i2;
            Iterator<InterfaceC19347710mh> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().zf(effect, i);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectDownloadController@2473.callbackDownloadProgress$1");
    }

    public static final void run$9(ARunnableS34S0201000_29 aRunnableS34S0201000_29) {
        boolean zLIZ;
        C1C7U.LIZ("FTCEditTextStickerController@69fb.initPlayingRefreshTask$1");
        try {
            aRunnableS34S0201000_29.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FTCEditTextStickerController@69fb.initPlayingRefreshTask$1");
    }

    public ARunnableS34S0201000_29(C122P c122p, int i) {
        this.$t = i;
        this.l1 = c122p;
        this.i2 = -1;
        this.l0 = new ARunnableS102S0000000_29(c122p, 0);
    }

    public ARunnableS34S0201000_29(C196902122a c196902122a, int i) {
        this.$t = i;
        this.l1 = c196902122a;
        this.i2 = -1;
        this.l0 = new ARunnableS102S0000000_29(c196902122a, 1);
    }

    public ARunnableS34S0201000_29(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }

    public ARunnableS34S0201000_29(EffectDownloadController effectDownloadController, Effect effect, Effect effect2, int i, int i2) {
        this.$t = i2;
        this.l0 = effectDownloadController;
        this.l1 = effect;
        this.i2 = i;
    }
}
