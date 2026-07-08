package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _ProfileContent_ProtoEncoder implements InterfaceC1132110fZB<ProfileContent> {
    public static int LIZJ(ProfileContent profileContent) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLJI = C1142340fpg.LJI(1);
        int iLIZ = 0;
        List<IconConfig> list = profileContent.iconList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < profileContent.iconList.size(); i++) {
                IconConfig iconConfig = (IconConfig) ListProtector.get(profileContent.iconList, i);
                if (iconConfig == null) {
                    iLIZIZ2 = 0;
                } else {
                    int iLJ = _ImageModel_ProtoEncoder.LJ(1, iconConfig.icon) + _CombineBadgeBackground_ProtoEncoder.LJ(2, iconConfig.background);
                    iLIZIZ2 = iLJ + C1142350fph.LIZIZ(iLJ) + C1142350fph.LIZ(2);
                }
                iLJI += iLIZIZ2;
            }
        }
        NumberConfig numberConfig = profileContent.numberConfig;
        if (numberConfig == null) {
            iLIZIZ = 0;
        } else {
            int iLIZIZ3 = _NumberConfig_ProtoEncoder.LIZIZ(numberConfig);
            iLIZIZ = iLIZIZ3 + C1142350fph.LIZIZ(iLIZIZ3) + C1142350fph.LIZ(3);
        }
        int i2 = iLJI + iLIZIZ;
        LabelConfig labelConfig = profileContent.labelConfig;
        if (labelConfig != null) {
            int iLIZIZ4 = _LabelConfig_ProtoEncoder.LIZIZ(labelConfig);
            iLIZ = C1142350fph.LIZ(4) + iLIZIZ4 + C1142350fph.LIZIZ(iLIZIZ4);
        }
        return i2 + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, ProfileContent profileContent) {
        boolean z = profileContent.useContent;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        List<IconConfig> list = profileContent.iconList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < profileContent.iconList.size(); i++) {
                IconConfig iconConfig = (IconConfig) ListProtector.get(profileContent.iconList, i);
                if (iconConfig != null) {
                    c1142350fph.LIZLLL(2, 2);
                    c1142350fph.LJ(_ImageModel_ProtoEncoder.LJ(1, iconConfig.icon) + _CombineBadgeBackground_ProtoEncoder.LJ(2, iconConfig.background));
                    _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, iconConfig.icon);
                    _CombineBadgeBackground_ProtoEncoder.LIZJ(c1142350fph, 2, iconConfig.background);
                }
            }
        }
        NumberConfig numberConfig = profileContent.numberConfig;
        if (numberConfig != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_NumberConfig_ProtoEncoder.LIZIZ(numberConfig));
            long j = numberConfig.number;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJFF(j);
            _FontStyle_ProtoEncoder.LIZJ(c1142350fph, 2, numberConfig.fontStyle);
            _CombineBadgeBackground_ProtoEncoder.LIZJ(c1142350fph, 3, numberConfig.background);
        }
        LabelConfig labelConfig = profileContent.labelConfig;
        if (labelConfig != null) {
            c1142350fph.LIZLLL(4, 2);
            c1142350fph.LJ(_LabelConfig_ProtoEncoder.LIZIZ(labelConfig));
            C1142340fpg.LJFF(c1142350fph, 1, labelConfig.label);
            _FontStyle_ProtoEncoder.LIZJ(c1142350fph, 2, labelConfig.fontStyle);
            _CombineBadgeBackground_ProtoEncoder.LIZJ(c1142350fph, 3, labelConfig.background);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, ProfileContent profileContent) {
        LIZIZ(c1142350fph, profileContent);
    }
}
