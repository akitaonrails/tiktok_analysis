package X;

import com.ss.android.ugc.aweme.image.sticker.newengine.ImageGlobalEditStickerNewEngineComponent;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.scene.ImagePublishFullPagePreviewScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.12Ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19775212Ys implements InterfaceC1737690vJv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        switch (this.$t) {
            case 0:
                return onBackPressed$0(this);
            case 1:
                return onBackPressed$1(this);
            case 2:
                return onBackPressed$2(this);
            case 3:
                return onBackPressed$3(this);
            case 4:
                return onBackPressed$4(this);
            case 5:
                return onBackPressed$5(this);
            case 6:
                return onBackPressed$6(this);
            case 7:
                return onBackPressed$7(this);
            case 8:
                return onBackPressed$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onBackPressed$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onBackPressed$10(this);
            default:
                return false;
        }
    }

    public static final boolean onBackPressed$0(C19775212Ys c19775212Ys) {
        C390390FSj c390390FSj = ((ImageGlobalEditStickerNewEngineComponent) c19775212Ys.l0).LLJI;
        if (c390390FSj == null) {
            c390390FSj = null;
        }
        c390390FSj.getClass();
        return new C390340FSe(c390390FSj).LJIIIZ();
    }

    public static final boolean onBackPressed$1(C19775212Ys c19775212Ys) {
        ((ImagePublishPreviewScene) c19775212Ys.l0).LLLLLZL(true);
        return false;
    }

    public static final boolean onBackPressed$10(C19775212Ys c19775212Ys) {
        LongPressAwemeFragment longPressAwemeFragment = (LongPressAwemeFragment) c19775212Ys.l0;
        String str = LongPressAwemeFragment._pnsPageId;
        longPressAwemeFragment.UR(null);
        return true;
    }

    public static final boolean onBackPressed$2(C19775212Ys c19775212Ys) {
        ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene = (ImagePublishFullPagePreviewScene) c19775212Ys.l0;
        if (!imagePublishFullPagePreviewScene.LLJZ) {
            imagePublishFullPagePreviewScene.LLLILZLLLI = true;
            return false;
        }
        return false;
    }

    public static final boolean onBackPressed$3(C19775212Ys c19775212Ys) {
        if (((C114F) c19775212Ys.l0).isVisible()) {
            ((C114F) c19775212Ys.l0).LLLLIL().LJ.invoke();
            return true;
        }
        return false;
    }

    public static final boolean onBackPressed$4(C19775212Ys c19775212Ys) {
        ((C19671511xp) c19775212Ys.l0).K4(-1.0f, -1.0f);
        return true;
    }

    public static final boolean onBackPressed$5(C19775212Ys c19775212Ys) {
        ((C19458411Aw) c19775212Ys.l0).LLLLIIIILLL();
        return true;
    }

    public static final boolean onBackPressed$6(C19775212Ys c19775212Ys) {
        return ((C196864120o) c19775212Ys.l0).LLLLIILL().LIZLLL();
    }

    public static final boolean onBackPressed$7(C19775212Ys c19775212Ys) {
        C11VM c11vm = ((C114K) c19775212Ys.l0).LLJJJJJIL;
        if (c11vm == null) {
            c11vm = null;
        }
        if (c11vm.getVisibility() == 0) {
            return true;
        }
        if (((C114K) c19775212Ys.l0).isVisible()) {
            ((C114K) c19775212Ys.l0).LLLLIL().LIZIZ.invoke(Boolean.FALSE);
            return true;
        }
        return false;
    }

    public static final boolean onBackPressed$8(C19775212Ys c19775212Ys) {
        ((C12DF) c19775212Ys.l0).LLLLIL().LIZ.invoke();
        return true;
    }

    public static final boolean onBackPressed$9(C19775212Ys c19775212Ys) {
        LongPressAwemeFragment longPressAwemeFragment = (LongPressAwemeFragment) c19775212Ys.l0;
        String str = LongPressAwemeFragment._pnsPageId;
        longPressAwemeFragment.UR(null);
        return true;
    }

    public C19775212Ys(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
