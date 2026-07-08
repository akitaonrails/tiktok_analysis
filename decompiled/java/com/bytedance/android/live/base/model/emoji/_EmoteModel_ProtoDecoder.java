package com.bytedance.android.live.base.model.emoji;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api.EmoteUploadInfo;
import com.bytedance.android.livesdk.chatroom.api._AuditInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._EmoteUploadInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EmoteModel_ProtoDecoder implements C0IMD<EmoteModel> {
    public static EmoteModel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EmoteModel emoteModel = new EmoteModel();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        emoteModel.emoteId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        emoteModel.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        emoteModel.auditStatus = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        emoteModel.uuid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        emoteModel.emoteType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        emoteModel.contentSource = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        emoteModel.emotePrivateType = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        emoteModel.packageId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        emoteModel.auditInfo = _AuditInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        emoteModel.rewardCondition = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        emoteModel.emoteUploadInfo = _EmoteUploadInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        emoteModel.createTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        emoteModel.emoteScene = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return emoteModel;
            }
        }
    }

    public static void LJ(EmoteModel emoteModel) {
        User user;
        ImageModel imageModel = emoteModel.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        EmoteUploadInfo emoteUploadInfo = emoteModel.emoteUploadInfo;
        if (emoteUploadInfo != null && (user = emoteUploadInfo.userInfo) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EmoteModel emoteModel) {
        LJ(emoteModel);
    }

    @Override // X.C0IMD
    public final EmoteModel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EmoteModel emoteModel, List list) {
    }
}
