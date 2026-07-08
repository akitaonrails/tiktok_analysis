package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _UpdateGuestSettingParams_ProtoDecoder implements C0IMD<UpdateGuestSettingParams> {
    @Override // X.C0IMD
    public final UpdateGuestSettingParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UpdateGuestSettingParams updateGuestSettingParams = new UpdateGuestSettingParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        updateGuestSettingParams.flowDistribute = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        updateGuestSettingParams.rankListShowAction = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        updateGuestSettingParams.guestCameraStatus = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        updateGuestSettingParams.distributionStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        updateGuestSettingParams.guestCameraMirrorStatus = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        updateGuestSettingParams.guestHearYourVoiceStatus = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        updateGuestSettingParams.guestPreviewCameraStatus = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        updateGuestSettingParams.guestPreviewUsedEffectId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        switch (iLJI) {
                            case 1001:
                                updateGuestSettingParams.channelId = c1516680pZS.LJIIJJI();
                                break;
                            case 1002:
                                updateGuestSettingParams.roomId = c1516680pZS.LJIIJJI();
                                break;
                            case 1003:
                                updateGuestSettingParams.liveId = c1516680pZS.LJIIJJI();
                                break;
                            case 1004:
                                updateGuestSettingParams.anchorId = c1516680pZS.LJIIJJI();
                                break;
                            case 1005:
                                updateGuestSettingParams.updateGuestSettingScene = c1516680pZS.LJIIJ();
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return updateGuestSettingParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UpdateGuestSettingParams updateGuestSettingParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpdateGuestSettingParams updateGuestSettingParams, List list) {
    }
}
