package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.StatePassingVM;
import com.ss.android.ugc.aweme.feed.assem.share.GuideSelfAwemeEventViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.feed.component.surveybutton.FeedBottomSurveyButtonVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.hvr.FollowingHvrLabelInFypVM;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FYPFollowingSuggestViewModel;
import com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0P4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638900P4e implements InterfaceC1731706qJ {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1731706qJ
    public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        switch (this.$t) {
            case 0:
                return getValue$0(this, obj, interfaceC2217461Bqa);
            case 1:
                return getValue$1(this, obj, interfaceC2217461Bqa);
            case 2:
                return getValue$2(this, obj, interfaceC2217461Bqa);
            case 3:
                return getValue$3(this, obj, interfaceC2217461Bqa);
            case 4:
                return getValue$4(this, obj, interfaceC2217461Bqa);
            case 5:
                return getValue$5(this, obj, interfaceC2217461Bqa);
            case 6:
                return getValue$6(this, obj, interfaceC2217461Bqa);
            case 7:
                return getValue$7(this, obj, interfaceC2217461Bqa);
            case 8:
                return getValue$8(this, obj, interfaceC2217461Bqa);
            case BdTuring.TYPE_ECAF /* 9 */:
                return getValue$9(this, obj, interfaceC2217461Bqa);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return getValue$10(this, obj, interfaceC2217461Bqa);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return getValue$11(this, obj, interfaceC2217461Bqa);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return getValue$12(this, obj, interfaceC2217461Bqa);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return getValue$13(this, obj, interfaceC2217461Bqa);
            case 14:
                return getValue$14(this, obj, interfaceC2217461Bqa);
            case 15:
                return getValue$15(this, obj, interfaceC2217461Bqa);
            case 16:
                return getValue$16(this, obj, interfaceC2217461Bqa);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return getValue$17(this, obj, interfaceC2217461Bqa);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return getValue$18(this, obj, interfaceC2217461Bqa);
            case 19:
                return getValue$19(this, obj, interfaceC2217461Bqa);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return getValue$20(this, obj, interfaceC2217461Bqa);
            case 21:
                return getValue$21(this, obj, interfaceC2217461Bqa);
            case 22:
                return getValue$22(this, obj, interfaceC2217461Bqa);
            case 23:
                return getValue$23(this, obj, interfaceC2217461Bqa);
            default:
                return null;
        }
    }

    public C638900P4e(InterfaceC608500Nto interfaceC608500Nto, C19719912Dl c19719912Dl, int i) {
        this.$t = i;
        this.l1 = interfaceC608500Nto;
        this.l2 = c19719912Dl;
    }

    public static final Object getValue$0(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 352), null, AFwS240S0000000_9.get$arr$(922)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoFavoriteVM.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$1(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 120), null, AFwS240S0000000_9.get$arr$(922)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoPlayViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$10(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 252), null, AFwS240S0000000_9.get$arr$(722)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$11(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 440), null, AFwS240S0000000_9.get$arr$(904)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoPlayViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$12(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 441), null, AFwS240S0000000_9.get$arr$(905)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$13(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 442), null, AFwS240S0000000_9.get$arr$(906)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoEventDispatchViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$14(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C019F.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 555), null, AFwS240S0000000_9.get$arr$(938)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(FeedBottomSurveyButtonVM.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$15(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 556), null, AFwS240S0000000_9.get$arr$(939)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$16(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C019F.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 595), null, AFwS231S0000000_3.get$arr$(255)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(FYPFollowingSuggestViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$17(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 596), null, AFwS240S0000000_9.get$arr$(949)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$18(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C019F.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 597), null, AFwS231S0000000_3.get$arr$(256)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(ProfileFollowingSuggestViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$19(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 604), null, AFwS240S0000000_9.get$arr$(951)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoPlayViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$2(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 121), null, AFwS240S0000000_9.get$arr$(922)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoEventDispatchViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$20(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 605), null, AFwS240S0000000_9.get$arr$(952)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoPlayViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$21(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 606), null, AFwS240S0000000_9.get$arr$(953)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$22(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C019F.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 628), null, AFwS231S0000000_3.get$arr$(271)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(FollowingHvrLabelInFypVM.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$23(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 629), null, AFwS240S0000000_9.get$arr$(967)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$3(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 114), null, AFwS240S0000000_9.get$arr$(922)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(QuickExternalShareVM.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$4(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 115), null, AFwS240S0000000_9.get$arr$(922)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$5(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 116), null, AFwS240S0000000_9.get$arr$(922)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(InterceptorEventViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$6(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 117), null, AFwS240S0000000_9.get$arr$(922)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoEventDispatchViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$7(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 118), null, AFwS240S0000000_9.get$arr$(922)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(GuideSelfAwemeEventViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$8(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C019F.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 119), null, AFwS240S0000000_9.get$arr$(922)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(StatePassingVM.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object getValue$9(C638900P4e c638900P4e, Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        C702030RgH c702030RgHLIZIZ;
        ReusedUIAssem<? extends C03H5> reusedUIAssem;
        if (((AssemViewModel) c638900P4e.l0) == null) {
            InterfaceC608510Ntp interfaceC608510NtpLIZ = ((InterfaceC608500Nto) c638900P4e.l1).LIZ();
            AssemViewModel assemViewModel = null;
            if (interfaceC608510NtpLIZ != null && (c702030RgHLIZIZ = interfaceC608510NtpLIZ.LIZIZ()) != null && (reusedUIAssem = c702030RgHLIZIZ.LL) != null) {
                C13IQ c13iq = (C13IQ) c638900P4e.l2;
                assemViewModel = (AssemViewModel) C737910Sx3.LIZ(reusedUIAssem, C724750Sbp.LJIIJ(reusedUIAssem, c13iq), C0HHT.LIZ, C1637806bA.LIZ, new C5182020e(c13iq, 535), null, AFwS240S0000000_9.get$arr$(933)).getValue(obj, interfaceC2217461Bqa);
            }
            c638900P4e.l0 = assemViewModel;
        }
        AssemViewModel assemViewModel2 = (AssemViewModel) c638900P4e.l0;
        if (assemViewModel2 != null) {
            return assemViewModel2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LE.LIZ(VideoViewModel.class).LJI());
        sbLIZ.append(" is null");
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
