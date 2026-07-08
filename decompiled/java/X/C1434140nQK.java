package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.social.creation.api.SocialCameraEditorService;
import com.ss.android.ugc.aweme.wavepublish.dm.service.IDM2CreativeService;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434140nQK implements InterfaceC1433590nPR {
    public static final C01GW<ExecutorService> LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(478));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(441));

    public static C1434730nRH LIZIZ(C1433530nPL c1433530nPL, C1430790nKv c1430790nKv) {
        String strLIZ;
        if (C2535709wh.LIZ()) {
            strLIZ = c1433530nPL.LIZIZ;
        } else {
            strLIZ = C309040C9m.LIZ();
        }
        return new C1434730nRH(c1433530nPL, strLIZ, c1430790nKv, new C1434310nQb());
    }

    @Override // X.InterfaceC1433590nPR
    public final InterfaceC1433580nPQ LIZ(C1433530nPL c1433530nPL, String str, C1430790nKv c1430790nKv) {
        VideoPublishEditModel videoPublishEditModel;
        boolean zIsEnterFromDM;
        String strLIZ;
        boolean z;
        VideoPublishEditModelKt videoPublishEditModelKt;
        VideoPublishEditModel videoPublishEditModel2;
        String strLIZ2;
        VideoPublishEditModel videoPublishEditModel3;
        CreativeModel creativeModel;
        String strLIZ3;
        VideoPublishEditModel videoPublishEditModel4;
        CreativeModel creativeModel2;
        DMMediaModel dMMediaModel;
        VideoPublishEditModel videoPublishEditModel5;
        CreativeModel creativeModel3;
        VideoPublishEditModel videoPublishEditModel6;
        PublishModel publishModel = c1433530nPL.LIZ;
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
        } else {
            videoPublishEditModel = null;
        }
        if (videoPublishEditModel != null) {
            zIsEnterFromDM = videoPublishEditModel.isEnterFromDM();
        } else {
            zIsEnterFromDM = false;
        }
        if (publishModel.isEditSave && C1428580nHM.LIZ(zIsEnterFromDM)) {
            return new C1434780nRM(c1433530nPL, C309040C9m.LIZ(), new C1434310nQb());
        }
        if (c1433530nPL.LIZ.publishType == 3) {
            return new C1434750nRJ(c1433530nPL, new C1434310nQb());
        }
        if (!c1433530nPL.LIZ.isTTEPSave && !c1433530nPL.LIZ.isEditSave) {
            BaseShortVideoContext baseShortVideoContext2 = c1433530nPL.LIZ.editModel;
            if ((baseShortVideoContext2 instanceof VideoPublishEditModel) && (videoPublishEditModel6 = (VideoPublishEditModel) baseShortVideoContext2) != null && videoPublishEditModel6.isEnterFromBulletin()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                BaseShortVideoContext baseShortVideoContext3 = c1433530nPL.LIZ.editModel;
                if ((baseShortVideoContext3 instanceof VideoPublishEditModel) && (videoPublishEditModel5 = (VideoPublishEditModel) baseShortVideoContext3) != null && (creativeModel3 = videoPublishEditModel5.creativeModel) != null && C1434160nQM.LIZIZ(creativeModel3)) {
                    if (c1430790nKv != null) {
                        return LIZIZ(c1433530nPL, c1430790nKv);
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            BaseShortVideoContext baseShortVideoContext4 = c1433530nPL.LIZ.editModel;
            if ((baseShortVideoContext4 instanceof VideoPublishEditModel) && (videoPublishEditModel3 = (VideoPublishEditModel) baseShortVideoContext4) != null && (creativeModel = videoPublishEditModel3.creativeModel) != null && creativeModel.dmMediaModel != null) {
                if (c1430790nKv != null) {
                    if (C2535709wh.LIZ()) {
                        strLIZ3 = c1433530nPL.LIZIZ;
                    } else {
                        strLIZ3 = C309040C9m.LIZ();
                    }
                    BaseShortVideoContext baseShortVideoContext5 = c1433530nPL.LIZ.editModel;
                    if ((baseShortVideoContext5 instanceof VideoPublishEditModel) && (videoPublishEditModel4 = (VideoPublishEditModel) baseShortVideoContext5) != null && (creativeModel2 = videoPublishEditModel4.creativeModel) != null && (dMMediaModel = creativeModel2.dmMediaModel) != null && (dMMediaModel.type == 0 || dMMediaModel.type == 2 || dMMediaModel.type == 4)) {
                        IDM2CreativeService iDM2CreativeService = (IDM2CreativeService) this.LIZ.getValue();
                        if (iDM2CreativeService != null) {
                            return iDM2CreativeService.LIZIZ(c1433530nPL, strLIZ3, c1430790nKv, new C1434310nQb());
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    IDM2CreativeService iDM2CreativeService2 = (IDM2CreativeService) this.LIZ.getValue();
                    if (iDM2CreativeService2 != null) {
                        return iDM2CreativeService2.LIZ(c1433530nPL, strLIZ3, c1430790nKv, new C1434310nQb());
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            BaseShortVideoContext baseShortVideoContext6 = c1433530nPL.LIZ.editModel;
            if ((baseShortVideoContext6 instanceof VideoPublishEditModel) && (videoPublishEditModel2 = (VideoPublishEditModel) baseShortVideoContext6) != null && C1428470nHB.LLFZ(videoPublishEditModel2)) {
                if (c1430790nKv != null) {
                    if (C2535709wh.LIZ()) {
                        strLIZ2 = c1433530nPL.LIZIZ;
                    } else {
                        strLIZ2 = C309040C9m.LIZ();
                    }
                    SocialCameraEditorService socialCameraEditorService = (SocialCameraEditorService) PluggableExtentionKt.pluggableSpi$default(SocialCameraEditorService.class, false, false, false, 14, null);
                    if (socialCameraEditorService != null) {
                        return socialCameraEditorService.LJI(c1433530nPL, strLIZ2, c1430790nKv, new C1434310nQb());
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            BaseShortVideoContext baseShortVideoContext7 = c1433530nPL.LIZ.editModel;
            if ((baseShortVideoContext7 instanceof VideoPublishEditModel) && (videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext7) != null && videoPublishEditModelKt.getTextPublishUploadModel() != null) {
                if (c1430790nKv != null) {
                    return LIZIZ(c1433530nPL, c1430790nKv);
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            if (c1430790nKv != null) {
                return LIZIZ(c1433530nPL, c1430790nKv);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (C2535709wh.LIZ()) {
            strLIZ = c1433530nPL.LIZIZ;
        } else {
            strLIZ = C309040C9m.LIZ();
        }
        return new C1434790nRN(c1433530nPL, strLIZ, new C1434310nQb());
    }
}
