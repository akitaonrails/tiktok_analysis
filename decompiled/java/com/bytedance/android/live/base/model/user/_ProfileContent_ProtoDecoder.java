package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ProfileContent_ProtoDecoder implements C0IMD<ProfileContent> {
    public static ProfileContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ProfileContent profileContent = new ProfileContent();
        profileContent.iconList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                profileContent.labelConfig = _LabelConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            profileContent.numberConfig = _NumberConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        profileContent.iconList.add(_IconConfig_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    profileContent.useContent = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return profileContent;
            }
        }
    }

    public static void LJ(ProfileContent profileContent) {
        CombineBadgeBackground combineBadgeBackground;
        CombineBadgeBackground combineBadgeBackground2;
        List<IconConfig> list = profileContent.iconList;
        if (list == null) {
            profileContent.iconList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (IconConfig iconConfig : profileContent.iconList) {
                if (iconConfig != null) {
                    ImageModel imageModel = iconConfig.icon;
                    if (imageModel != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel);
                    }
                    CombineBadgeBackground combineBadgeBackground3 = iconConfig.background;
                    if (combineBadgeBackground3 != null) {
                        _CombineBadgeBackground_ProtoDecoder.LJ(combineBadgeBackground3);
                    }
                }
            }
        }
        NumberConfig numberConfig = profileContent.numberConfig;
        if (numberConfig != null && (combineBadgeBackground2 = numberConfig.background) != null) {
            _CombineBadgeBackground_ProtoDecoder.LJ(combineBadgeBackground2);
        }
        LabelConfig labelConfig = profileContent.labelConfig;
        if (labelConfig != null && (combineBadgeBackground = labelConfig.background) != null) {
            _CombineBadgeBackground_ProtoDecoder.LJ(combineBadgeBackground);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ProfileContent profileContent) {
        LJ(profileContent);
    }

    @Override // X.C0IMD
    public final ProfileContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProfileContent profileContent, List list) {
    }
}
