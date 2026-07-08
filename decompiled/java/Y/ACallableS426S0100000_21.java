package Y;

import X.AbstractC1345440l7G;
import X.AbstractC21673619ry;
import X.AnonymousClass0175;
import X.C1164120gOo;
import X.C1165370gQp;
import X.C1169240gX4;
import X.C123100dR;
import X.C1350920lG6;
import X.C1386190mAz;
import X.C1387120mCU;
import X.C1387290mCl;
import X.C1398780mVI;
import X.C1481000odu;
import X.C1481060oe0;
import X.C15OF;
import X.C1C7U;
import X.C1ER1;
import X.C201955140j;
import X.C20703515zt;
import X.C207069161b;
import X.C2344009Gk;
import X.C297010BkZ;
import X.C584760Mwc;
import X.C654670Pm5;
import X.C729980SkG;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentListFragmentV2;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.fe.method.ImageChooseActivity;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public class ACallableS426S0100000_21 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return call$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case 16:
                return call$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return call$17(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("CommentListFragmentV2@8fe4.onViewCreated$2");
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceGL = ((CommentListFragmentV2) aCallableS426S0100000_21.l0).GL();
        c1350920lG6.getClass();
        C1350920lG6.LJLJL(commentContextSourceGL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentListFragmentV2@8fe4.onViewCreated$2");
        return unit;
    }

    public static final Object call$1(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("ImageChooseActivity@dd41.loadData$1");
        List<MediaModel> mediaLoaderImages = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().getMediaLoaderImages((ImageChooseActivity) aCallableS426S0100000_21.l0);
        C1C7U.LIZIZ("ImageChooseActivity@dd41.loadData$1");
        return mediaLoaderImages;
    }

    public static final Object call$10(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("CommentPerfMonitorUtil@f359.reportInBackground$1");
        CommentPerfMonitorUtil commentPerfMonitorUtil = CommentPerfMonitorUtil.LIZ;
        AbstractC1345440l7G abstractC1345440l7G = (AbstractC1345440l7G) aCallableS426S0100000_21.l0;
        commentPerfMonitorUtil.getClass();
        CommentPerfMonitorUtil.LJII(abstractC1345440l7G);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPerfMonitorUtil@f359.reportInBackground$1");
        return unit;
    }

    public static final Object call$11(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("CommentPerfMonitorUtil@f359.reportPageLoadEndInBackground$1");
        CommentPerfMonitorUtil commentPerfMonitorUtil = CommentPerfMonitorUtil.LIZ;
        AbstractC1345440l7G abstractC1345440l7G = (AbstractC1345440l7G) aCallableS426S0100000_21.l0;
        commentPerfMonitorUtil.getClass();
        CommentPerfMonitorUtil.LJII(abstractC1345440l7G);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPerfMonitorUtil@f359.reportPageLoadEndInBackground$1");
        return unit;
    }

    public static final Object call$12(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        IWaterMarkService iWaterMarkService;
        C1C7U.LIZ("WaterMarkVideoAbilityExecutor@4e11.initWaterMark$2");
        C1398780mVI c1398780mVI = (C1398780mVI) aCallableS426S0100000_21.l0;
        WaterMarkBuilder waterMarkBuilder = c1398780mVI.LJIIIIZZ;
        if (waterMarkBuilder != null && (iWaterMarkService = (IWaterMarkService) c1398780mVI.LJIIJ.get()) != null) {
            iWaterMarkService.prepareDataForI18n(waterMarkBuilder);
        }
        C1C7U.LIZIZ("WaterMarkVideoAbilityExecutor@4e11.initWaterMark$2");
        return null;
    }

    public static final Object call$13(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("CommentLogger@c1c.sendAutoTranslateBannerClick$1");
        C207069161b.LJFF(new AnonymousClass0175(), "auto_translate_banner_click", ((C2344009Gk) aCallableS426S0100000_21.l0).LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLogger@c1c.sendAutoTranslateBannerClick$1");
        return unit;
    }

    public static final Object call$14(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("CommentLogger@c1c.sendAutoTranslateBannerShow$1");
        C207069161b.LJFF(new AnonymousClass0175(), "auto_translate_banner_show", ((C2344009Gk) aCallableS426S0100000_21.l0).LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLogger@c1c.sendAutoTranslateBannerShow$1");
        return unit;
    }

    public static final Object call$15(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("CommentLogger@c1c.sendCommentTranslationResult$2");
        C207069161b.LJFF(new AnonymousClass0175(), "comment_translation_result", ((C2344009Gk) aCallableS426S0100000_21.l0).LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLogger@c1c.sendCommentTranslationResult$2");
        return unit;
    }

    public static final Object call$16(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("CommentLogger@c1c.sendClaCommentLongPressCrashMonitor$1");
        C207069161b.LJFF(new AnonymousClass0175(), "cla_comment_long_press_crash_monitor", ((C2344009Gk) aCallableS426S0100000_21.l0).LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLogger@c1c.sendClaCommentLongPressCrashMonitor$1");
        return unit;
    }

    public static final Object call$17(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        Object[] objArr = (Object[]) aCallableS426S0100000_21.l0;
        C1C7U.LIZ("AwemeStatusModel@d54d.sendRequest$1$1L");
        AwemeStatsApi.LIZ((C1387290mCl) objArr[0]);
        C1C7U.LIZIZ("AwemeStatusModel@d54d.sendRequest$1$1L");
        return null;
    }

    public static final Object call$2(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("CommentTranslationRepo@e4dc.sendCommentTranslationResultAuto$1");
        C207069161b.LJFF(new AnonymousClass0175(), "comment_translation_result", ((C2344009Gk) aCallableS426S0100000_21.l0).LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentTranslationRepo@e4dc.sendCommentTranslationResultAuto$1");
        return unit;
    }

    public static final Object call$3(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("CommentTranslationRepo@e4dc.sendCommentTranslationResultClick$1");
        C207069161b.LJFF(new AnonymousClass0175(), "comment_translation_result", ((C2344009Gk) aCallableS426S0100000_21.l0).LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentTranslationRepo@e4dc.sendCommentTranslationResultClick$1");
        return unit;
    }

    public static final Object call$4(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("WrapLinearLayoutManager@7ea3.notifyDataChangeAsync$1");
        try {
            ((AbstractC21673619ry) aCallableS426S0100000_21.l0).notifyDataSetChanged();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().LIZIZ(((AbstractC21673619ry) aCallableS426S0100000_21.l0).getClass().getName(), e);
        }
        C1C7U.LIZIZ("WrapLinearLayoutManager@7ea3.notifyDataChangeAsync$1");
        return null;
    }

    public static final Object call$5(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("WrapLinearLayoutManager@119c.notifyDataChangeAsync$1");
        try {
            ((AbstractC21673619ry) aCallableS426S0100000_21.l0).notifyDataSetChanged();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI(((AbstractC21673619ry) aCallableS426S0100000_21.l0).getClass().getName(), e);
        }
        C1C7U.LIZIZ("WrapLinearLayoutManager@119c.notifyDataChangeAsync$1");
        return null;
    }

    public static final Object call$6(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("StitchWithMovieHelper@c4b6.progressRunnable$1");
        ((C15OF) aCallableS426S0100000_21.l0).getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StitchWithMovieHelper@c4b6.progressRunnable$1");
        return unit;
    }

    public static final Object call$7(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("ImageChooseUploadActivity@57f9.loadData$1");
        List<MediaModel> mediaLoaderImages = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().getMediaLoaderImages((ImageChooseUploadActivity) aCallableS426S0100000_21.l0);
        C1C7U.LIZIZ("ImageChooseUploadActivity@57f9.loadData$1");
        return mediaLoaderImages;
    }

    public static final Object call$8(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        C1C7U.LIZ("AwemeManager@3e.clearCache$1");
        ((C1387120mCU) aCallableS426S0100000_21.l0).LIZ.clear();
        C1C7U.LIZIZ("AwemeManager@3e.clearCache$1");
        return null;
    }

    public static final Object call$9(ACallableS426S0100000_21 aCallableS426S0100000_21) {
        boolean z;
        String strValueOf;
        String mEventType;
        String mixId;
        String mEventType2;
        String aKVar;
        long j;
        int iWR;
        long j2;
        String mEventType3;
        VideoUrlModel playAddr;
        C1C7U.LIZ("MixVideoPlayDetailPageFragment@cd0f.mobVideoPlayEvent$1");
        MixVideoPlayDetailPageFragment mixVideoPlayDetailPageFragment = (MixVideoPlayDetailPageFragment) aCallableS426S0100000_21.l0;
        Aweme aweme = mixVideoPlayDetailPageFragment.LLJJIJIIJIL;
        if (aweme != null) {
            boolean z2 = false;
            String str = "";
            if (aweme.getMusic() != null) {
                strValueOf = String.valueOf(aweme.getMusic().getId());
                if (aweme.getMusic().getMatchedPGCSoundInfo() != null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
                strValueOf = "";
            }
            C1169240gX4 c1169240gX4 = mixVideoPlayDetailPageFragment.LLJILLL;
            if (c1169240gX4 == null || (mEventType = c1169240gX4.getMEventType()) == null) {
                mEventType = "";
            }
            String playlistPreviousPage = mixVideoPlayDetailPageFragment.LLILLJJLI.getPlaylistPreviousPage();
            if (aweme.getBottomBarModel() != null) {
                z2 = true;
            }
            C1386190mAz c1386190mAz = new C1386190mAz();
            c1386190mAz.LJJLL = mixVideoPlayDetailPageFragment.LLILLJJLI.getPreviousPage();
            c1386190mAz.LJJZ = mixVideoPlayDetailPageFragment.LLILLJJLI.getPreviousPagePosition();
            c1386190mAz.LJJZZI = z2;
            c1386190mAz.LJLLLLLL = mixVideoPlayDetailPageFragment.SR().LLJJL.getFrom();
            c1386190mAz.LIZLLL = mEventType;
            c1386190mAz.LJLIIIL = "enter";
            c1386190mAz.LJJIJL(mixVideoPlayDetailPageFragment.LLILLJJLI.getPageType(), aweme);
            C729980SkG.LJII(aweme);
            int i = C1481060oe0.LIZLLL + 1;
            C1481060oe0.LIZLLL = i;
            c1386190mAz.LJZ = i;
            c1386190mAz.LJJLIIIJLLLLLLLZ = C1481000odu.LIZIZ().name();
            c1386190mAz.LJZL = strValueOf;
            c1386190mAz.LLF = z;
            c1386190mAz.LJLLLL = AwemeBizExtKt.isHighlighted(aweme);
            C1169240gX4 c1169240gX42 = mixVideoPlayDetailPageFragment.LLJILLL;
            C1165370gQp c1165370gQp = null;
            if (c1169240gX42 != null) {
                mixId = c1169240gX42.getMixId();
            } else {
                mixId = null;
            }
            c1386190mAz.LLIIII = mixId;
            c1386190mAz.LLIIIL = mixVideoPlayDetailPageFragment.LLILLJJLI.getPlaylistSearchId();
            c1386190mAz.LLIIIJ = mixVideoPlayDetailPageFragment.LLILLJJLI.isFromVideo();
            c1386190mAz.LLIIIILZ = mixVideoPlayDetailPageFragment.LLILLJJLI.getCategoryName();
            C1169240gX4 c1169240gX43 = mixVideoPlayDetailPageFragment.LLJILLL;
            if (c1169240gX43 == null || (mEventType2 = c1169240gX43.getMEventType()) == null) {
                mEventType2 = "";
            }
            c1386190mAz.LLIIL = mEventType2;
            c1386190mAz.LLIILII = mixVideoPlayDetailPageFragment.LLILLJJLI.getLastGroupId();
            c1386190mAz.LLIILZL = playlistPreviousPage;
            c1386190mAz.LLIIZ = mixVideoPlayDetailPageFragment.LLILLJJLI.getEnterPlaylistGroupId();
            Video video = aweme.getVideo();
            if (video != null && (playAddr = video.getPlayAddr()) != null) {
                aKVar = playAddr.getaK();
            } else {
                aKVar = null;
            }
            c1386190mAz.LLJJIJIL = C123100dR.LIZ(aKVar);
            c1386190mAz.LLIIJI = C20703515zt.LJIIZILJ(aweme) ? 1 : 0;
            c1386190mAz.LLIIIZ = C20703515zt.LJIJJLI(aweme);
            c1386190mAz.LLFF = mixVideoPlayDetailPageFragment.LLILLJJLI.getSearchType();
            c1386190mAz.LJ("playlist_session_id", mixVideoPlayDetailPageFragment.LLILLJJLI.getExtra().get("playlist_session_id"));
            c1386190mAz.LIZIZ(C584760Mwc.LIZIZ(mixVideoPlayDetailPageFragment.LLILLJJLI.getPreviousPage(), mixVideoPlayDetailPageFragment.LLILLJJLI.getFromGroupId()));
            C1ER1 c1er1 = C1ER1.LIZIZ;
            if (c1er1.LJJJLL(mEventType) || c1er1.LJJJLL(playlistPreviousPage)) {
                if (!TextUtils.isEmpty(aweme.getAid())) {
                    c1386190mAz.LJ("aweme_id", aweme.getAid());
                }
                c1386190mAz.LJJII(c1er1.fetchSearchParams(mEventType, playlistPreviousPage));
            }
            c1386190mAz.LJIILJJIL();
            String playlistPreviousPage2 = mixVideoPlayDetailPageFragment.LLILLJJLI.getPlaylistPreviousPage();
            if (TextUtils.equals(playlistPreviousPage2, "search_result") || TextUtils.equals(playlistPreviousPage2, "general_search")) {
                if (!C297010BkZ.LIZ()) {
                    j = mixVideoPlayDetailPageFragment.dS().LLJI;
                } else {
                    C1165370gQp c1165370gQp2 = mixVideoPlayDetailPageFragment.cS().LLILZIL;
                    if (c1165370gQp2 != null) {
                        c1165370gQp = c1165370gQp2;
                    }
                    j = c1165370gQp.LLILZLL;
                }
                if (j > 0) {
                    j++;
                }
                if (!C297010BkZ.LIZ()) {
                    iWR = MixVideoPlayDetailPageFragment.WR(mixVideoPlayDetailPageFragment.LLJJIJIIJIL, ((C1164120gOo) mixVideoPlayDetailPageFragment.dS().vmDispatcher.getState()).LL);
                } else {
                    iWR = MixVideoPlayDetailPageFragment.WR(mixVideoPlayDetailPageFragment.LLJJIJIIJIL, mixVideoPlayDetailPageFragment.cS().getAwemeList());
                }
                long j3 = iWR;
                if (j3 > 0) {
                    j2 = j + j3;
                } else {
                    j2 = -1;
                }
                if (!TextUtils.equals(playlistPreviousPage2, "search_result")) {
                    TextUtils.equals(playlistPreviousPage2, "search_for_you_list");
                }
                ISearchResultStatistics iSearchResultStatisticsLIZLLL = SearchResultStatisticsImpl.LIZLLL();
                Aweme aweme2 = mixVideoPlayDetailPageFragment.LLJJIJIIJIL;
                C1169240gX4 c1169240gX44 = mixVideoPlayDetailPageFragment.LLJILLL;
                if (c1169240gX44 != null && (mEventType3 = c1169240gX44.getMEventType()) != null) {
                    str = mEventType3;
                }
                iSearchResultStatisticsLIZLLL.LIZ(new C654670Pm5("search_video_play", aweme2, str, -1L, playlistPreviousPage2, "", j2));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixVideoPlayDetailPageFragment@cd0f.mobVideoPlayEvent$1");
        return unit;
    }

    public ACallableS426S0100000_21(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
