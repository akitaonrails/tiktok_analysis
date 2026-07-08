package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _BadgeStruct_ProtoEncoder implements InterfaceC1132110fZB<BadgeStruct> {
    public static int LIZJ(BadgeStruct badgeStruct) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4 = 0;
        int iLJIIIZ = C1142340fpg.LJIIIZ(1, badgeStruct.badgeDisplayType) + C1142340fpg.LJIIIZ(2, badgeStruct.badgePriorityType) + C1142340fpg.LJIIIZ(3, badgeStruct.badgeScene) + C1142340fpg.LJIIJ(4, badgeStruct.position) + C1142340fpg.LJIIJ(5, badgeStruct.displayStatus) + C1142340fpg.LJIIL(6, badgeStruct.greyedByClient) + C1142340fpg.LJIIIZ(7, badgeStruct.exhibitionType) + C1142340fpg.LJIILL(10, badgeStruct.schemaUrl) + C1142340fpg.LJI(11) + _PrivilegeLogExtra_ProtoEncoder.LJ(12, badgeStruct.logExtra);
        ImageBadge imageBadge = badgeStruct.imageBadge;
        if (imageBadge == null) {
            iLIZIZ = 0;
        } else {
            int iLJIIIZ2 = C1142340fpg.LJIIIZ(1, imageBadge.badgeDisplayType) + _ImageModel_ProtoEncoder.LJ(2, imageBadge.imageModel);
            iLIZIZ = iLJIIIZ2 + C1142350fph.LIZIZ(iLJIIIZ2) + C1142350fph.LIZ(20);
        }
        int i = iLJIIIZ + iLIZIZ;
        TextBadge textBadge = badgeStruct.textBadge;
        if (textBadge == null) {
            iLIZIZ2 = 0;
        } else {
            int iLIZJ = _TextBadge_ProtoEncoder.LIZJ(textBadge);
            iLIZIZ2 = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(21);
        }
        int i2 = i + iLIZIZ2;
        StringBadge stringBadge = badgeStruct.stringBadge;
        if (stringBadge == null) {
            iLIZIZ3 = 0;
        } else {
            int iLJIIIZ3 = C1142340fpg.LJIIIZ(1, stringBadge.badgeDisplayType) + C1142340fpg.LJIILL(2, stringBadge.contentStr);
            iLIZIZ3 = iLJIIIZ3 + C1142350fph.LIZIZ(iLJIIIZ3) + C1142350fph.LIZ(22);
        }
        int i3 = i2 + iLIZIZ3;
        CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
        if (combineBadgeStruct != null) {
            int iLIZJ2 = _CombineBadgeStruct_ProtoEncoder.LIZJ(combineBadgeStruct);
            iLIZIZ4 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(23);
        }
        return i3 + iLIZIZ4 + C1142340fpg.LJI(24);
    }

    public static void LIZIZ(C1142350fph c1142350fph, BadgeStruct badgeStruct) {
        int i = badgeStruct.badgeDisplayType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        int i2 = badgeStruct.badgePriorityType;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i2);
        int i3 = badgeStruct.badgeScene;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i3);
        C1142340fpg.LIZLLL(c1142350fph, 4, badgeStruct.position);
        C1142340fpg.LIZLLL(c1142350fph, 5, badgeStruct.displayStatus);
        long j = badgeStruct.greyedByClient;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j);
        int i4 = badgeStruct.exhibitionType;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i4);
        C1142340fpg.LJFF(c1142350fph, 10, badgeStruct.schemaUrl);
        boolean z = badgeStruct.display;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LJ(z ? 1 : 0);
        _PrivilegeLogExtra_ProtoEncoder.LIZJ(c1142350fph, 12, badgeStruct.logExtra);
        ImageBadge imageBadge = badgeStruct.imageBadge;
        if (imageBadge != null) {
            c1142350fph.LIZLLL(20, 2);
            c1142350fph.LJ(C1142340fpg.LJIIIZ(1, imageBadge.badgeDisplayType) + _ImageModel_ProtoEncoder.LJ(2, imageBadge.imageModel));
            int i5 = imageBadge.badgeDisplayType;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LIZJ(i5);
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, imageBadge.imageModel);
        }
        TextBadge textBadge = badgeStruct.textBadge;
        if (textBadge != null) {
            c1142350fph.LIZLLL(21, 2);
            c1142350fph.LJ(_TextBadge_ProtoEncoder.LIZJ(textBadge));
            _TextBadge_ProtoEncoder.LIZIZ(c1142350fph, textBadge);
        }
        StringBadge stringBadge = badgeStruct.stringBadge;
        if (stringBadge != null) {
            c1142350fph.LIZLLL(22, 2);
            c1142350fph.LJ(C1142340fpg.LJIIIZ(1, stringBadge.badgeDisplayType) + C1142340fpg.LJIILL(2, stringBadge.contentStr));
            int i6 = stringBadge.badgeDisplayType;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LIZJ(i6);
            C1142340fpg.LJFF(c1142350fph, 2, stringBadge.contentStr);
        }
        CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
        if (combineBadgeStruct != null) {
            c1142350fph.LIZLLL(23, 2);
            c1142350fph.LJ(_CombineBadgeStruct_ProtoEncoder.LIZJ(combineBadgeStruct));
            _CombineBadgeStruct_ProtoEncoder.LIZIZ(c1142350fph, combineBadgeStruct);
        }
        boolean z2 = badgeStruct.isCustomized;
        c1142350fph.LIZLLL(24, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, BadgeStruct badgeStruct) {
        LIZIZ(c1142350fph, badgeStruct);
    }
}
