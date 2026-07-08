package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _ProfileCardPanel_ProtoEncoder implements InterfaceC1132110fZB<ProfileCardPanel> {
    public static int LIZJ(ProfileCardPanel profileCardPanel) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZ = 0;
        int iLJI = C1142340fpg.LJI(1) + C1142340fpg.LJIIIZ(2, profileCardPanel.badgeTextPosition);
        ProjectionConfig projectionConfig = profileCardPanel.projectionConfig;
        if (projectionConfig == null) {
            iLIZIZ = 0;
        } else {
            int iLJI2 = C1142340fpg.LJI(1) + _ImageModel_ProtoEncoder.LJ(2, projectionConfig.icon);
            iLIZIZ = iLJI2 + C1142350fph.LIZIZ(iLJI2) + C1142350fph.LIZ(3);
        }
        int i = iLJI + iLIZIZ;
        ProfileContent profileContent = profileCardPanel.profileContent;
        if (profileContent == null) {
            iLIZIZ2 = 0;
        } else {
            int iLIZJ = _ProfileContent_ProtoEncoder.LIZJ(profileContent);
            iLIZIZ2 = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(4);
        }
        int i2 = i + iLIZIZ2;
        SeparatorConfig separatorConfig = profileCardPanel.separatorConfig;
        if (separatorConfig != null) {
            int iLJIILL = C1142340fpg.LJIILL(1, separatorConfig.color);
            iLIZ = C1142350fph.LIZ(5) + iLJIILL + C1142350fph.LIZIZ(iLJIILL);
        }
        return i2 + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, ProfileCardPanel profileCardPanel) {
        boolean z = profileCardPanel.useNewProfileCardStyle;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i = profileCardPanel.badgeTextPosition;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
        ProjectionConfig projectionConfig = profileCardPanel.projectionConfig;
        if (projectionConfig != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(C1142340fpg.LJI(1) + _ImageModel_ProtoEncoder.LJ(2, projectionConfig.icon));
            boolean z2 = projectionConfig.useProjection;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJ(z2 ? 1 : 0);
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, projectionConfig.icon);
        }
        ProfileContent profileContent = profileCardPanel.profileContent;
        if (profileContent != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_ProfileContent_ProtoEncoder.LIZJ(profileContent));
            _ProfileContent_ProtoEncoder.LIZIZ(c1142350fph, profileContent);
        }
        SeparatorConfig separatorConfig = profileCardPanel.separatorConfig;
        if (separatorConfig != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(C1142340fpg.LJIILL(1, separatorConfig.color));
            C1142340fpg.LJFF(c1142350fph, 1, separatorConfig.color);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, ProfileCardPanel profileCardPanel) {
        LIZIZ(c1142350fph, profileCardPanel);
    }
}
