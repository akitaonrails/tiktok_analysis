package Y;

import X.C0CHQ;
import X.C0WIY;
import X.C113Z;
import X.C117U;
import X.C11F3;
import X.C121O;
import X.C123100dR;
import X.C124T;
import X.C128Y;
import X.C1462820oAa;
import X.C1463670oBx;
import X.C1669670tYD;
import X.C19339410lM;
import X.C19339910lR;
import X.C19557511fR;
import X.C19557811fU;
import X.C19558011fW;
import X.C196868120s;
import X.C196871120v;
import X.C19719212De;
import X.C366400EYc;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1427810nG7;
import X.InterfaceC387610FHr;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.savedstate.Recreator;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.model.AMEPublishCampaignItem;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.prop.fragment.ame.AmeProfileFrameActivityBannerTTEPResController;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS199S1100000_25;

/* JADX INFO: loaded from: classes30.dex */
public class AObjectS403S0100000_29 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        C19557811fU c19557811fU = (C19557811fU) aObjectS403S0100000_29.l0;
        return Boolean.valueOf(C19558011fW.LIZJ(c19557811fU.LJIJI, c19557811fU.LJJIJ, c19557811fU.LJIJJLI()));
    }

    public static final Object invoke$1(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        String str;
        C124T c124t = (C124T) aObjectS403S0100000_29.l0;
        InterfaceC387610FHr interfaceC387610FHr = c124t.LLJZIJLIL;
        if (c124t.LLLILZLLLI) {
            str = "caption";
        } else {
            str = "text";
        }
        interfaceC387610FHr.LIZJ(new C1462820oAa(c124t.LLLJ.getTouchDownSize(), c124t.LLLJ.getTouchUpSize(), str, false));
        c124t.LLLFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS403S0100000_29.l0;
        String str = StickerPropDetailFragment._pnsPageId;
        stickerPropDetailFragment.nS(false);
        return null;
    }

    public static final Object invoke$11(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        ComposeView composeView;
        ComposeView composeView2;
        String strValueOf;
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS403S0100000_29.l0;
        AmeProfileFrameActivityBannerTTEPResController ameProfileFrameActivityBannerTTEPResController = stickerPropDetailFragment.s;
        AMEPublishCampaignItem aMEPublishCampaignItem = ameProfileFrameActivityBannerTTEPResController.LLILZ;
        if (aMEPublishCampaignItem != null) {
            View view = ameProfileFrameActivityBannerTTEPResController.LLILLJJLI;
            if (view != null && (composeView2 = (ComposeView) view.findViewById(R.id.eoa)) != null) {
                if (C960203pA.LIZIZ(composeView2.getContext()) && C123100dR.LIZ(aMEPublishCampaignItem.activityMediumBannerDarkModeUrl)) {
                    strValueOf = String.valueOf(aMEPublishCampaignItem.activityMediumBannerDarkModeUrl);
                } else {
                    strValueOf = String.valueOf(aMEPublishCampaignItem.activityMediumBannerLightModeUrl);
                }
                C1669670tYD.LJ(composeView2, EnumC1427810nG7.Auto, new C19719212De(-1279266521, new AwS199S1100000_25(aMEPublishCampaignItem, strValueOf, 4), true));
            }
        } else {
            View view2 = ameProfileFrameActivityBannerTTEPResController.LLILLJJLI;
            if (view2 != null && (composeView = (ComposeView) view2.findViewById(R.id.eoa)) != null) {
                C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, C19339410lM.LIZIZ);
            }
        }
        String strLIZ = stickerPropDetailFragment.s.LIZ();
        if (!strLIZ.isEmpty() ? C19339910lR.LIZIZ().getInt(C19339910lR.LIZ(strLIZ), 0) == 2 : C19339910lR.LIZIZ().getInt("click_status", 0) == 2) {
            if (stickerPropDetailFragment.mS()) {
                C786410Ut5.LJLLLLLL(0, stickerPropDetailFragment.LLJLLIL);
                C786410Ut5.I7(new ACListenerS163S0100000_29(stickerPropDetailFragment, 253), stickerPropDetailFragment.LLJLLIL);
            }
        }
        return null;
    }

    public static final Object invoke$12(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        ((StickerPropDetailFragment) aObjectS403S0100000_29.l0).LLLLLLLZIL = 0.0f;
        return null;
    }

    public static final Object invoke$13(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS403S0100000_29.l0;
        String str = StickerPropDetailFragment._pnsPageId;
        stickerPropDetailFragment.nS(false);
        return null;
    }

    public static final Object invoke$14(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS403S0100000_29.l0;
        String str = StickerPropDetailFragment._pnsPageId;
        stickerPropDetailFragment.rS(null);
        return null;
    }

    public static final Object invoke$15(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS403S0100000_29.l0;
        String str = StickerPropDetailFragment._pnsPageId;
        stickerPropDetailFragment.rS(null);
        return null;
    }

    public static final Object invoke$2(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        boolean z;
        C19557511fR c19557511fR = (C19557511fR) aObjectS403S0100000_29.l0;
        C113Z c113z = c19557511fR.LJJIZ;
        if (c113z != null) {
            if (c113z.getCurrentPage() != null && c19557511fR.LJJIZ.getCurrentPage().LJII()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.valueOf(C19558011fW.LIZJ(c19557511fR.LJIL, c19557511fR.LJJIJIL, c19557511fR.LJJLI));
    }

    public static final Object invoke$3(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        C19557511fR c19557511fR = (C19557511fR) aObjectS403S0100000_29.l0;
        c19557511fR.getClass();
        C366400EYc c366400EYc = C366400EYc.LIZ;
        VideoPublishEditModel videoPublishEditModel = c19557511fR.LIZ;
        NLEModel model = ((C1463670oBx) c19557511fR.LJJIII).LIZLLL().LIZ.getModel();
        c366400EYc.getClass();
        return Boolean.valueOf(C366400EYc.LJFF(videoPublishEditModel, model));
    }

    public static final Object invoke$4(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        return Boolean.valueOf(((C117U) aObjectS403S0100000_29.l0).LLJJJJLIIL);
    }

    public static final Object invoke$5(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        return ((C117U) aObjectS403S0100000_29.l0).LJIIJ();
    }

    public static final Object invoke$6(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        return ((C11F3) aObjectS403S0100000_29.l0).LLILZIL;
    }

    public static final Object invoke$7(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        return Integer.valueOf(((C11F3) aObjectS403S0100000_29.l0).LLILZLL);
    }

    public static final Object invoke$8(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        C196871120v c196871120v;
        C196868120s c196868120s = (C196868120s) aObjectS403S0100000_29.l0;
        C121O c121o = c196868120s.LLJL;
        if (c121o != null && (c196871120v = c196868120s.LLILLL) != null) {
            int i = c196871120v.LLILLL;
            int i2 = c196871120v.LLILZ;
            if (i != 0 && i2 != 0) {
                Rect deleteRect = c121o.getDeleteRect();
                return new C0WIY(Float.valueOf((deleteRect.centerX() * 1.0f) / i), Float.valueOf(((deleteRect.centerY() - (ScreenUtils.getStatusBarHeight(C0CHQ.LIZ) * 2)) * 1.0f) / i2));
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$9(AObjectS403S0100000_29 aObjectS403S0100000_29) {
        C128Y c128y = (C128Y) aObjectS403S0100000_29.l0;
        c128y.getLifecycle().addObserver(new Recreator(c128y));
        return Unit.LIZ;
    }

    public AObjectS403S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
