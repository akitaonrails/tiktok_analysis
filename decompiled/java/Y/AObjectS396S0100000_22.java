package Y;

import X.AbstractC1453750nvx;
import X.C0LAB;
import X.C1428940nHw;
import X.C1441830ncj;
import X.C1445970njP;
import X.C1C7U;
import X.C20684815ws;
import X.C2221281Bwk;
import X.C303380Buq;
import X.InterfaceC1452170ntP;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcher;
import com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcherCallBack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.capcutpromotion.CapcutPromotionPopupService;
import com.ss.android.ugc.aweme.capcutpromotion.CapcutPromotionPopupServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AObjectS396S0100000_22 implements Function0 {
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
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        CapcutPromotionPopupService capcutPromotionPopupServiceLIZIZ = CapcutPromotionPopupServiceImpl.LIZIZ();
        C1445970njP c1445970njP = (C1445970njP) aObjectS396S0100000_22.l0;
        capcutPromotionPopupServiceLIZIZ.LIZ(c1445970njP.LJIIJJI, (Aweme) c1445970njP.LIZJ);
        return null;
    }

    public static final Object invoke$1(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        return ((VideoEditContainerScene) aObjectS396S0100000_22.l0).LLLILZLLLI.LLLLLILLIL();
    }

    public static final Object invoke$10(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        return Boolean.valueOf(((C2221281Bwk) aObjectS396S0100000_22.l0).LJII);
    }

    public static final Object invoke$11(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        NLETemplateSource nLETemplateSource = (NLETemplateSource) aObjectS396S0100000_22.l0;
        NLETemplateSource.Companion companion = NLETemplateSource.LJIIIIZZ;
        final WeakReference weakReference = new WeakReference(nLETemplateSource);
        return new ResourceFetcher(weakReference) { // from class: X.0nI0
            public final WeakReference<NLETemplateSource> LL;

            {
                this.LL = weakReference;
            }

            @Override // com.bytedance.ies.cutsame.resourcefetcher.ResourceFetcher
            public final void fetch(String str, ResourceFetcherCallBack resourceFetcherCallBack) {
                C1428990nI1 c1428990nI1;
                int iIndexOf;
                NLETemplateSource nLETemplateSource2 = this.LL.get();
                if (nLETemplateSource2 == null) {
                    return;
                }
                if (str != null && (iIndexOf = str.indexOf("://")) > 0) {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                    } catch (IllegalArgumentException e) {
                                        e = e;
                                    }
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                            }
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                        }
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                    }
                    try {
                        c1428990nI1 = new C1428990nI1(EnumC1428950nHx.valueOf(str.substring(0, iIndexOf).toUpperCase()), str.substring(iIndexOf + 3));
                    } catch (IllegalArgumentException e6) {
                        e = e6;
                        TryCatchGuardChecker.doCheck(e);
                        c1428990nI1 = null;
                    }
                } else {
                    c1428990nI1 = null;
                }
                if (c1428990nI1 == null) {
                    resourceFetcherCallBack.notifyError(-1, "unknown input");
                    return;
                }
                ResourceFetcher resourceFetcher = nLETemplateSource2.LIZJ.get(c1428990nI1.LIZ);
                if (resourceFetcher == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("can not find fetcher for schema : ");
                    sbLIZ.append(c1428990nI1.LIZ.name());
                    resourceFetcherCallBack.notifyError(-1, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                resourceFetcher.fetch(c1428990nI1.LIZIZ, resourceFetcherCallBack);
            }
        };
    }

    public static final Object invoke$12(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        NLETemplateSource nLETemplateSource = (NLETemplateSource) aObjectS396S0100000_22.l0;
        NLETemplateSource.Companion companion = NLETemplateSource.LJIIIIZZ;
        return new C1428940nHw(new WeakReference(nLETemplateSource));
    }

    public static final Object invoke$13(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        return ((C1428940nHw) aObjectS396S0100000_22.l0).LIZ.get();
    }

    public static final Object invoke$14(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        long jLLL;
        InterfaceC1452170ntP interfaceC1452170ntP;
        C1441830ncj c1441830ncj = ((ChooseCoverActivity) aObjectS396S0100000_22.l0).LLILLJJLI;
        if (c1441830ncj != null && (interfaceC1452170ntP = c1441830ncj.LJIIIZ) != null) {
            jLLL = interfaceC1452170ntP.LLL();
        } else {
            jLLL = 0;
        }
        return Long.valueOf(jLLL);
    }

    public static final Object invoke$15(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        return Long.valueOf(((ChooseCoverActivity) aObjectS396S0100000_22.l0).LLILLJJLI.LJIIIZ.getDuration());
    }

    public static final Object invoke$16(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) aObjectS396S0100000_22.l0;
        String str = ChooseCoverActivity._pnsPageId;
        return chooseCoverActivity.LLFII();
    }

    public static final Object invoke$17(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        Runnable runnable = (Runnable) aObjectS396S0100000_22.l0;
        C1C7U.LIZ("ChooseCoverActivity$ChooseVideoCoverFragmentLifecycleCallbacks@7fda.onFragmentActivityCreated$2L");
        runnable.run();
        C1C7U.LIZIZ("ChooseCoverActivity$ChooseVideoCoverFragmentLifecycleCallbacks@7fda.onFragmentActivityCreated$2L");
        return null;
    }

    public static final Object invoke$18(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        C0LAB c0lab = (C0LAB) aObjectS396S0100000_22.l0;
        String str = TTEPEffectPreviewActivity._pnsPageId;
        C303380Buq.LIZ("tool_performance_record_first_frame", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        C0LAB c0lab = (C0LAB) aObjectS396S0100000_22.l0;
        String str = FTCVideoRecordNewActivity._pnsPageId;
        C20684815ws.LJIILLIIL("tool_performance_record_first_frame", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        return ((VideoEditContainerScene) aObjectS396S0100000_22.l0).LLLILZLLLI.LLLLLILLIL();
    }

    public static final Object invoke$3(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        AbstractC1453750nvx abstractC1453750nvx = ((VideoEditContainerScene) aObjectS396S0100000_22.l0).LLLILZLLLI;
        if (abstractC1453750nvx != null) {
            return abstractC1453750nvx.LLLLLILLIL();
        }
        return null;
    }

    public static final Object invoke$4(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) aObjectS396S0100000_22.l0;
        videoEditContainerScene.LLJLILLLLZIIL.addView(videoEditContainerScene.LLLIIIL.UZ());
        return null;
    }

    public static final Object invoke$5(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        return Long.valueOf(((VEVideoPublishPreviewScene) aObjectS396S0100000_22.l0).LLJLIL.LJIIIZ.getDuration());
    }

    public static final Object invoke$6(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        ((VideoPublishContainerScene) aObjectS396S0100000_22.l0).LLLLLLLZIL();
        return null;
    }

    public static final Object invoke$7(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        return Long.valueOf(((VEVideoPublishPreviewScene) aObjectS396S0100000_22.l0).LLJLIL.LJIIIZ.LLL());
    }

    public static final Object invoke$8(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        return Long.valueOf(((VEVideoPublishPreviewScene) aObjectS396S0100000_22.l0).LLJLIL.LJIIIZ.getDuration());
    }

    public static final Object invoke$9(AObjectS396S0100000_22 aObjectS396S0100000_22) {
        return Long.valueOf(((VEVideoPublishPreviewScene) aObjectS396S0100000_22.l0).LLJLIL.LJIIIZ.LLL());
    }

    public AObjectS396S0100000_22(VideoEditContainerScene videoEditContainerScene, int i) {
        this.$t = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
                this.l0 = videoEditContainerScene;
                break;
            default:
                this.l0 = videoEditContainerScene;
                break;
        }
    }

    public AObjectS396S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
