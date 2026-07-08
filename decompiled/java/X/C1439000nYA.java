package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IPrivacyService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import uxk.a;

/* JADX INFO: renamed from: X.0nYA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439000nYA {
    public static final C1439000nYA LIZ = new C1439000nYA();

    public static final int LIZIZ(Integer num) {
        boolean z;
        Integer numLIZ;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "comment");
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("comment")) != null && numLIZ.intValue() == 3) {
            z = false;
        } else {
            z = true;
        }
        if ((privacySettingsRestrictionItemLJIIIZ != null && (privacySettingsRestrictionItemLJIIIZ.showType == 2 || privacySettingsRestrictionItemLJIIIZ.showType == 1)) || !z) {
            return 3;
        }
        if (num != null) {
            return num.intValue();
        }
        if (C289950BYb.LIZ()) {
            return 0;
        }
        a.LIZ.getClass();
        return a.LJIIIZ;
    }

    public static final int LIZ(VideoPublishEditModel videoPublishEditModel, Integer num) {
        int i;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "allow_ai_remix");
        if ((privacySettingsRestrictionItemLJIIIZ != null && (privacySettingsRestrictionItemLJIIIZ.showType == 2 || privacySettingsRestrictionItemLJIIIZ.showType == 1)) || ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().shouldDisableDuetOrStitch(videoPublishEditModel.getVideoLength()) || C857680Xkk.LIZIZ(videoPublishEditModel)) {
            return 2;
        }
        if (num != null) {
            return num.intValue();
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (!creativeModel.draftInfoModel.isDraft || (i = creativeModel.privacySettingModel.allowAIRemix) == 0) {
            return 1;
        }
        return i;
    }

    public static final int LIZJ(VideoPublishEditModel videoPublishEditModel, Integer num) {
        boolean z;
        boolean z2;
        Integer numLIZ;
        C548590LfN.LIZ.getClass();
        if (!C548590LfN.LIZIZ().LJIIJ(videoPublishEditModel.creativeModel)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 2;
        }
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "content_reuse_permission");
        if (privacySettingsRestrictionItemLJIIIZ == null || privacySettingsRestrictionItemLJIIIZ.showType != 2) {
            PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
            if (privacyUserSettingsV2LJIIIIZZ != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("content_reuse_permission")) != null && numLIZ.intValue() == 5) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((privacySettingsRestrictionItemLJIIIZ == null || privacySettingsRestrictionItemLJIIIZ.showType != 1) && !((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ() && z2 && !((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().shouldDisableDuetOrStitch(videoPublishEditModel.getVideoLength()) && !C857680Xkk.LIZIZ(videoPublishEditModel)) {
                if (num != null) {
                    return num.intValue();
                }
                if (C0CHQ.LIZ().LJJIIZI().LJ()) {
                    if (C289950BYb.LIZ()) {
                        return 1;
                    }
                    return C0CHQ.LIZ().LJJIIZI().LJJ();
                }
                if (privacySettingsRestrictionItemLJIIIZ != null) {
                    return privacySettingsRestrictionItemLJIIIZ.defaultValue;
                }
            }
        }
        return 2;
    }

    public static final int LIZLLL(VideoPublishEditModel videoPublishEditModel, Integer num) {
        boolean z;
        Integer numLIZ;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "duet");
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("duet")) != null && numLIZ.intValue() == 3) {
            z = false;
        } else {
            z = true;
        }
        if (videoPublishEditModel.getVideoLength() <= 0 || ((privacySettingsRestrictionItemLJIIIZ != null && (privacySettingsRestrictionItemLJIIIZ.showType == 2 || privacySettingsRestrictionItemLJIIIZ.showType == 1)) || ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ() || videoPublishEditModel.getCreationMode() == 2 || !z || ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().shouldDisableDuetOrStitch(videoPublishEditModel.getVideoLength()) || C857680Xkk.LIZIZ(videoPublishEditModel))) {
            return 1;
        }
        if (num != null) {
            return num.intValue();
        }
        if (C0CHQ.LIZ().LJJIIZI().LJJJZ(false) && !C289950BYb.LIZ()) {
            a.LIZ.getClass();
            return a.LJIIJ;
        }
        return 0;
    }

    public static final int LJ(VideoPublishEditModel videoPublishEditModel, Integer num) {
        boolean z;
        Integer numLIZ;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "share_to_story");
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("share_to_story")) != null && numLIZ.intValue() == 5) {
            z = false;
        } else {
            z = true;
        }
        if ((privacySettingsRestrictionItemLJIIIZ == null || (privacySettingsRestrictionItemLJIIIZ.showType != 2 && privacySettingsRestrictionItemLJIIIZ.showType != 1)) && !((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ() && z && !((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().shouldDisableDuetOrStitch(videoPublishEditModel.getVideoLength()) && !C857680Xkk.LIZIZ(videoPublishEditModel)) {
            if (num != null) {
                return num.intValue();
            }
            if (C0CHQ.LIZ().LJJIIZI().LJJIZ()) {
                if (C289950BYb.LIZ()) {
                    return 1;
                }
                return C0CHQ.LIZ().LJJIIZI().LJIIZILJ();
            }
            if (privacySettingsRestrictionItemLJIIIZ != null) {
                return privacySettingsRestrictionItemLJIIIZ.defaultValue;
            }
        }
        return 2;
    }

    public static final int LJFF(VideoPublishEditModel videoPublishEditModel, Integer num) {
        boolean z;
        Integer numLIZ;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "create_sticker");
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("create_sticker")) != null && numLIZ.intValue() == 5) {
            z = false;
        } else {
            z = true;
        }
        if (videoPublishEditModel.getVideoLength() > 0 && ((privacySettingsRestrictionItemLJIIIZ == null || (privacySettingsRestrictionItemLJIIIZ.showType != 2 && privacySettingsRestrictionItemLJIIIZ.showType != 1)) && !((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ() && videoPublishEditModel.getCreationMode() != 2 && z && !((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().shouldDisableDuetOrStitch(videoPublishEditModel.getVideoLength()) && !C857680Xkk.LIZIZ(videoPublishEditModel))) {
            if (num != null) {
                return num.intValue();
            }
            if (C0CHQ.LIZ().LJJIIZI().LJIJ()) {
                if (C289950BYb.LIZ()) {
                    return 1;
                }
                return C0CHQ.LIZ().LJJIIZI().LJII(2);
            }
            if (privacySettingsRestrictionItemLJIIIZ != null) {
                return privacySettingsRestrictionItemLJIIIZ.defaultValue;
            }
        }
        return 2;
    }

    public static final int LJI(VideoPublishEditModel videoPublishEditModel, Integer num) {
        boolean z;
        Integer numLIZ;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "stitch");
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("stitch")) != null && numLIZ.intValue() == 3) {
            z = false;
        } else {
            z = true;
        }
        if (videoPublishEditModel.getVideoLength() <= 0 || ((privacySettingsRestrictionItemLJIIIZ != null && (privacySettingsRestrictionItemLJIIIZ.showType == 2 || privacySettingsRestrictionItemLJIIIZ.showType == 1)) || ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ() || videoPublishEditModel.getCreationMode() == 2 || !z || ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().shouldDisableDuetOrStitch(videoPublishEditModel.getVideoLength()) || C857680Xkk.LIZIZ(videoPublishEditModel))) {
            return 1;
        }
        if (num != null) {
            return num.intValue();
        }
        if (C0CHQ.LIZ().LJJIIZI().LJJII(false) && !C289950BYb.LIZ()) {
            return C0CHQ.LIZ().LJJIIZI().LJIJJ();
        }
        return 0;
    }
}
