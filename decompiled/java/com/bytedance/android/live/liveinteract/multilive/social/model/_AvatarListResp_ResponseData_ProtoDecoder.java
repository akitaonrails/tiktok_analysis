package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarListResp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multi_guest_social_data.AvatarImageSelectTips;
import webcast.data.multi_guest_social_data.AvatarStyle;
import webcast.data.multi_guest_social_data._AvatarImageSelectTips_ProtoDecoder;
import webcast.data.multi_guest_social_data._AvatarStyle_ProtoDecoder;
import webcast.data.multi_guest_social_data._Avatar_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _AvatarListResp_ResponseData_ProtoDecoder implements C0IMD<AvatarListResp.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(AvatarListResp.ResponseData responseData) {
        ImageModel imageModel;
        ImageModel imageModel2;
        AvatarListResp.ResponseData responseData2 = responseData;
        List<Avatar> list = responseData2.avatars;
        if (list == null) {
            responseData2.avatars = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Avatar avatar : responseData2.avatars) {
                if (avatar != null && (imageModel = avatar.image) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<AvatarStyle> list2 = responseData2.styles;
        if (list2 == null) {
            responseData2.styles = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (AvatarStyle avatarStyle : responseData2.styles) {
                if (avatarStyle != null && (imageModel2 = avatarStyle.image) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
        }
        AvatarImageSelectTips avatarImageSelectTips = responseData2.imageSelectTips;
        if (avatarImageSelectTips != null) {
            _AvatarImageSelectTips_ProtoDecoder.LJ(avatarImageSelectTips);
        }
    }

    @Override // X.C0IMD
    public final AvatarListResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AvatarListResp.ResponseData responseData = new AvatarListResp.ResponseData();
        responseData.styles = new ArrayList();
        responseData.avatars = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    responseData.imageSelectTips = _AvatarImageSelectTips_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                responseData.styles.add(_AvatarStyle_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            responseData.avatars.add(_Avatar_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        responseData.customMax = c1516680pZS.LJIIJJI();
                    }
                } else {
                    responseData.canCustomize = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarListResp.ResponseData responseData, List list) {
    }
}
