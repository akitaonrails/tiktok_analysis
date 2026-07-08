package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import java.util.List;

/* JADX INFO: renamed from: X.10IT, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IT {
    public static final C10IT LIZ = new C10IT();

    public static final boolean LIZ(Aweme aweme) {
        IShortVideoConfig iShortVideoConfigShortVideoConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig();
        if (aweme != null && aweme.getVideo() != null && aweme.getVideo().getVideoLength() > 0) {
            if ((aweme.getVideo().getVideoLength() <= iShortVideoConfigShortVideoConfig.maxConsumerDuetOrStitchVideoTime() || AwemeExtKt.isSupportGameChallenge(aweme) || (C729980SkG.LJIIIIZZ(aweme) && aweme.getVideo().getVideoLength() <= iShortVideoConfigShortVideoConfig.extendedDuetOrStitchTime())) && AwemeExtKt.canDuetVideoType(aweme) && !aweme.isVr() && aweme.getDuetSetting() != 2) {
                if (((aweme.getDuetSetting() != 1 && !aweme.isSubOnlyVideo()) || C729980SkG.LJIIIIZZ(aweme)) && !LJFF(aweme) && aweme.getMusic() != null && aweme.getMusic().getPlayUrl() != null && aweme.getMusic().getPlayUrl().getUrlList() != null && (!aweme.getMusic().getPlayUrl().getUrlList().isEmpty()) && !aweme.isWithPromotionalMusic()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final C15OK LIZIZ(Aweme aweme) {
        IShortVideoConfig iShortVideoConfigShortVideoConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig();
        if (aweme != null && aweme.getVideo() != null) {
            if (aweme.getVideo().getVideoLength() <= 0) {
                return C15OK.VIDEO_IS_NOT_EXIT;
            }
            if (!AwemeExtKt.canDuetVideoType(aweme)) {
                return C15OK.AWEME_TYPE;
            }
            if (aweme.isVr()) {
                return C15OK.AWEME_IS_VR;
            }
            if (aweme.getDuetSetting() == 2) {
                return C15OK.COMMERCE_CLOSE_DUET_OR_STITCH;
            }
            if (aweme.getDuetSetting() == 1 && !C729980SkG.LJIIIIZZ(aweme)) {
                return C15OK.USER_CLOSE_DUET_OR_STITCH_AND_NOT_SELF;
            }
            if (!LJFF(aweme) && aweme.getMusic() != null && aweme.getMusic().getPlayUrl() != null && aweme.getMusic().getPlayUrl().getUrlList() != null && !aweme.getMusic().getPlayUrl().getUrlList().isEmpty()) {
                if (aweme.isWithPromotionalMusic()) {
                    return C15OK.AWEME_IS_WITH_PROMOTIONAL_MUSIC;
                }
                if (!C729980SkG.LJIIIIZZ(aweme) && aweme.getVideo().getVideoLength() > iShortVideoConfigShortVideoConfig.maxConsumerDuetOrStitchVideoTime() && !AwemeExtKt.isSupportGameChallenge(aweme)) {
                    return C15OK.VIDEO_LENGTH_RESTRICT;
                }
                if (C729980SkG.LJIIIIZZ(aweme) && aweme.getVideo().getVideoLength() > iShortVideoConfigShortVideoConfig.extendedDuetOrStitchTime() && !AwemeExtKt.isSupportGameChallenge(aweme)) {
                    return C15OK.VIDEO_LENGTH_RESTRICT;
                }
                return C15OK.NO_ERROR;
            }
            return C15OK.MUSIC_NULL;
        }
        return C15OK.VIDEO_IS_NOT_EXIT;
    }

    public static C15OK LIZJ(Aweme aweme) {
        IShortVideoConfig iShortVideoConfigShortVideoConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig();
        if (aweme != null && aweme.getVideo() != null) {
            if (aweme.getVideo().getVideoLength() <= 0) {
                return C15OK.VIDEO_IS_NOT_EXIT;
            }
            if (!AwemeExtKt.canStitchVideoType(aweme)) {
                return C15OK.AWEME_TYPE;
            }
            if (aweme.isVr()) {
                return C15OK.AWEME_IS_VR;
            }
            if (aweme.getStitchSetting() == 2) {
                return C15OK.COMMERCE_CLOSE_DUET_OR_STITCH;
            }
            if (aweme.getStitchSetting() == 1 && !C729980SkG.LJIIIIZZ(aweme)) {
                return C15OK.USER_CLOSE_DUET_OR_STITCH_AND_NOT_SELF;
            }
            if (!LJFF(aweme) && aweme.getMusic() != null && aweme.getMusic().getPlayUrl() != null && aweme.getMusic().getPlayUrl().getUrlList() != null && !aweme.getMusic().getPlayUrl().getUrlList().isEmpty()) {
                if (aweme.isWithPromotionalMusic()) {
                    return C15OK.AWEME_IS_WITH_PROMOTIONAL_MUSIC;
                }
                IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null);
                if (iUnKnownOwnershipBusinessOuterService != null && iUnKnownOwnershipBusinessOuterService.LIZJ(aweme.getMusic())) {
                    return C15OK.COMMERCE_USER_NOT_COMMERCE_MUSIC;
                }
                if ((!C729980SkG.LJIIIIZZ(aweme) && aweme.getVideo().getVideoLength() > iShortVideoConfigShortVideoConfig.maxConsumerDuetOrStitchVideoTime()) || (C729980SkG.LJIIIIZZ(aweme) && aweme.getVideo().getVideoLength() > iShortVideoConfigShortVideoConfig.extendedDuetOrStitchTime())) {
                    return C15OK.VIDEO_LENGTH_RESTRICT;
                }
                return C15OK.NO_ERROR;
            }
            return C15OK.MUSIC_NULL;
        }
        return C15OK.VIDEO_IS_NOT_EXIT;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        IShortVideoConfig iShortVideoConfigShortVideoConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig();
        if (aweme.getVideo() != null && (((aweme.getVideo().getVideoLength() > 0 && aweme.getVideo().getVideoLength() <= iShortVideoConfigShortVideoConfig.maxConsumerDuetOrStitchVideoTime()) || (C729980SkG.LJIIIIZZ(aweme) && aweme.getVideo().getVideoLength() <= iShortVideoConfigShortVideoConfig.extendedDuetOrStitchTime())) && AwemeExtKt.canStitchVideoType(aweme) && !aweme.isVr() && aweme.getStitchSetting() != 2 && (((aweme.getStitchSetting() != 1 && !aweme.isSubOnlyVideo()) || C729980SkG.LJIIIIZZ(aweme)) && !LJFF(aweme) && aweme.getMusic() != null && aweme.getMusic().getPlayUrl() != null && aweme.getMusic().getPlayUrl().getUrlList() != null && (!aweme.getMusic().getPlayUrl().getUrlList().isEmpty()) && !aweme.isWithPromotionalMusic()))) {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null && !anchors.isEmpty()) {
                for (AnchorCommonStruct anchorCommonStruct : anchors) {
                    if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SHOP_LINK.getTYPE()) {
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static final String LJ(Aweme aweme) {
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
        if (statusSafety == null) {
            return null;
        }
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus = statusSafety.getMappedMuteStripStatus();
        if (mappedMuteStripStatus != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_DISABLE) {
            LIZ.getClass();
            if (!LJIIJ(aweme)) {
                if (mappedMuteStripStatus != null) {
                    switch (C10IQ.LIZ[mappedMuteStripStatus.ordinal()]) {
                    }
                    return null;
                }
                return null;
            }
        }
        return "replace";
    }

    public static final boolean LJFF(Aweme aweme) {
        Music music;
        IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService;
        if (aweme != null) {
            music = aweme.getMusic();
        } else {
            music = null;
        }
        if (music == null || aweme.getMusic().getMusicStatus() != 0 || ((iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi$default(IUnKnownOwnershipBusinessOuterService.class, false, false, false, 14, null)) != null && iUnKnownOwnershipBusinessOuterService.LIZIZ(aweme))) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(Aweme aweme) {
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        if (LJII(aweme)) {
            LIZ.getClass();
            if (aweme == null || (statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || (videoMuteInfo = statusSafety.getVideoMuteInfo()) == null || videoMuteInfo.getAudioChangeStatus() == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJII(Aweme aweme) {
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        if (aweme != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && (videoMuteInfo = statusSafety.getVideoMuteInfo()) != null) {
            return videoMuteInfo.getIsCopyrightViolation();
        }
        return false;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        if (aweme == null) {
            return false;
        }
        Music music = aweme.getMusic();
        if ((music == null || music.getMusicStatus() != 0) && ((statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || (videoMuteInfo = statusSafety.getVideoMuteInfo()) == null || !videoMuteInfo.isMute())) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(Aweme aweme) {
        if (aweme != null && aweme.getMusic() != null && aweme.getMusic().getMusicStatus() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJ(Aweme aweme) {
        String originVolume;
        String originVolume2;
        Float fLJIIIIZZ;
        if (aweme != null && (originVolume = aweme.getOriginVolume()) != null && originVolume.length() != 0 && aweme != null && (originVolume2 = aweme.getOriginVolume()) != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(originVolume2)) != null && fLJIIIIZZ.floatValue() > 0.0f) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJJI(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        Boolean bool = aweme.getContentClassificationMaskInfo().showMask;
        if (bool == null || !bool.booleanValue() || C2105908Mv.LIZ(aweme.getContentClassificationMaskInfo().title)) {
            Boolean bool2 = aweme.getReportMaskInfo().showMask;
            if (bool2 == null || !bool2.booleanValue() || C2105908Mv.LIZ(aweme.getReportMaskInfo().title) || C2105908Mv.LIZ(aweme.getReportMaskInfo().cancelMaskLabel)) {
                Boolean bool3 = aweme.getGeneralMaskInfo().showMask;
                if (bool3 == null || !bool3.booleanValue() || C2105908Mv.LIZ(aweme.getGeneralMaskInfo().title) || C2105908Mv.LIZ(aweme.getGeneralMaskInfo().content)) {
                    Boolean bool4 = aweme.getPhotosensitiveMaskInfo().showMask;
                    if (bool4 == null || !bool4.booleanValue() || Integer.valueOf(ComplianceServiceProvider.LJI().LJJJJIZL()).intValue() <= 0 || ComplianceServiceProvider.LJI().LJIJ() == 2) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean LJIIL(Aweme aweme) {
        Boolean bool;
        if (aweme == null || aweme.getGeneralMaskInfo() == null || LJIILJJIL(aweme) || (bool = aweme.getGeneralMaskInfo().showMask) == null || !bool.booleanValue() || C2105908Mv.LIZ(aweme.getGeneralMaskInfo().title) || C2105908Mv.LIZ(aweme.getGeneralMaskInfo().content)) {
            return false;
        }
        return true;
    }

    public static boolean LJIILIIL(Aweme aweme) {
        Boolean bool;
        if (aweme == null || aweme.getPhotosensitiveMaskInfo() == null || LJIILJJIL(aweme) || LJIIL(aweme) || (bool = aweme.getPhotosensitiveMaskInfo().showMask) == null || !bool.booleanValue() || ComplianceServiceProvider.LJI().LJJJJIZL() <= 0 || ComplianceServiceProvider.LJI().LJIJ() == 2) {
            return false;
        }
        return true;
    }

    public static boolean LJIILJJIL(Aweme aweme) {
        Boolean bool;
        if (aweme == null || aweme.getReportMaskInfo() == null || (bool = aweme.getReportMaskInfo().showMask) == null || !bool.booleanValue() || C2105908Mv.LIZ(aweme.getReportMaskInfo().title) || C2105908Mv.LIZ(aweme.getReportMaskInfo().cancelMaskLabel)) {
            return false;
        }
        return true;
    }
}
