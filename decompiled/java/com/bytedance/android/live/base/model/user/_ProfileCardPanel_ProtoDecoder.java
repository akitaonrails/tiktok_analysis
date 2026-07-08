package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ProfileCardPanel_ProtoDecoder implements C0IMD<ProfileCardPanel> {
    public static ProfileCardPanel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ProfileCardPanel profileCardPanel = new ProfileCardPanel();
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
                                    profileCardPanel.separatorConfig = _SeparatorConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                profileCardPanel.profileContent = _ProfileContent_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            profileCardPanel.projectionConfig = _ProjectionConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        profileCardPanel.badgeTextPosition = c1516680pZS.LJIIJ();
                    }
                } else {
                    profileCardPanel.useNewProfileCardStyle = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return profileCardPanel;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ProfileCardPanel profileCardPanel) {
        ImageModel imageModel;
        ProfileCardPanel profileCardPanel2 = profileCardPanel;
        ProjectionConfig projectionConfig = profileCardPanel2.projectionConfig;
        if (projectionConfig != null && (imageModel = projectionConfig.icon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ProfileContent profileContent = profileCardPanel2.profileContent;
        if (profileContent != null) {
            _ProfileContent_ProtoDecoder.LJ(profileContent);
        }
    }

    @Override // X.C0IMD
    public final ProfileCardPanel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProfileCardPanel profileCardPanel, List list) {
    }
}
