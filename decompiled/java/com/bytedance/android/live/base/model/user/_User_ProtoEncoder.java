package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ProtoEncoder;
import com.bytedance.android.livesdk.model.ActivityRewardInfo;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.bytedance.android.livesdk.model.AnchorLevel;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.Author;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.UserHonor;
import com.bytedance.android.livesdk.model._AnchorLevel_ProtoEncoder;
import com.bytedance.android.livesdk.model._AuthenticationInfo_ProtoEncoder;
import com.bytedance.android.livesdk.model._Author_ProtoEncoder;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoEncoder;
import com.bytedance.android.livesdk.model._FansClubMember_ProtoEncoder;
import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoEncoder;
import com.bytedance.android.livesdk.model._UserAttr_ProtoEncoder;
import com.bytedance.android.livesdk.model._UserHonor_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _User_ProtoEncoder implements InterfaceC1132110fZB<User> {
    public static int LIZLLL(User user) {
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int iLIZIZ6;
        int iLIZIZ7;
        int iLIZIZ8;
        int iLIZIZ9;
        int iLIZIZ10;
        int iLIZIZ11;
        int iLIZIZ12;
        int iLIZIZ13;
        int iLIZIZ14;
        int iLIZIZ15;
        int iLIZIZ16;
        int iLIZIZ17;
        int iLIZIZ18;
        int iLIZIZ19;
        int iLIZ = 0;
        if (user == null) {
            return 0;
        }
        int iLJIIL = C1142340fpg.LJIIL(1, user.id) + C1142340fpg.LJIILL(3, user.nickName) + C1142340fpg.LJIILL(5, user.signature) + _ImageModel_ProtoEncoder.LJ(9, user.avatarThumb) + _ImageModel_ProtoEncoder.LJ(10, user.avatarMedium) + _ImageModel_ProtoEncoder.LJ(11, user.avatarLarge) + C1142340fpg.LJI(12) + C1142340fpg.LJIIIZ(15, user.status) + C1142340fpg.LJIIL(16, user.createTime) + C1142340fpg.LJIIL(17, user.modifyTime) + C1142340fpg.LJIIIZ(18, user.secret) + C1142340fpg.LJIILL(19, user.shareQrcodeUri);
        FollowInfo followInfo = user.followInfo;
        if (followInfo == null) {
            iLIZIZ = 0;
        } else {
            int iLIZJ = _FollowInfo_ProtoEncoder.LIZJ(followInfo);
            iLIZIZ = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(22);
        }
        int i = iLJIIL + iLIZIZ;
        UserHonor userHonor = user.userHonor;
        if (userHonor == null) {
            iLIZIZ2 = 0;
        } else {
            int iLIZJ2 = _UserHonor_ProtoEncoder.LIZJ(userHonor);
            iLIZIZ2 = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(23);
        }
        int i2 = i + iLIZIZ2;
        FansClubMember fansClubMember = user.fansClub;
        if (fansClubMember == null) {
            iLIZIZ3 = 0;
        } else {
            int iLIZJ3 = _FansClubMember_ProtoEncoder.LIZJ(fansClubMember);
            iLIZIZ3 = iLIZJ3 + C1142350fph.LIZIZ(iLIZJ3) + C1142350fph.LIZ(24);
        }
        int i3 = i2 + iLIZIZ3;
        BorderInfo borderInfo = user.border;
        if (borderInfo == null) {
            iLIZIZ4 = 0;
        } else {
            int iLIZJ4 = _BorderInfo_ProtoEncoder.LIZJ(borderInfo);
            iLIZIZ4 = iLIZJ4 + C1142350fph.LIZIZ(iLIZJ4) + C1142350fph.LIZ(25);
        }
        int iLJIILL = i3 + iLIZIZ4 + C1142340fpg.LJIILL(26, user.specialId) + _ImageModel_ProtoEncoder.LJ(27, user.avatarBorder) + _ImageModel_ProtoEncoder.LJ(28, user.medal);
        List<ImageModel> list = user.userBadges;
        if (list != null && !list.isEmpty()) {
            for (int i4 = 0; i4 < user.userBadges.size(); i4++) {
                iLJIILL += _ImageModel_ProtoEncoder.LJ(29, (ImageModel) ListProtector.get(user.userBadges, i4));
            }
        }
        List<ImageModel> list2 = user.newUserBadges;
        if (list2 != null && !list2.isEmpty()) {
            for (int i5 = 0; i5 < user.newUserBadges.size(); i5++) {
                iLJIILL += _ImageModel_ProtoEncoder.LJ(30, (ImageModel) ListProtector.get(user.newUserBadges, i5));
            }
        }
        int iLJIIL2 = iLJIILL + C1142340fpg.LJIIL(31, user.topVipNo);
        UserAttr userAttr = user.userAttr;
        if (userAttr == null) {
            iLIZIZ5 = 0;
        } else {
            int iLIZJ5 = _UserAttr_ProtoEncoder.LIZJ(userAttr);
            iLIZIZ5 = iLIZJ5 + C1142350fph.LIZIZ(iLIZJ5) + C1142350fph.LIZ(32);
        }
        int i6 = iLJIIL2 + iLIZIZ5;
        User.OwnRoom ownRoom = user.ownRoom;
        if (ownRoom == null) {
            iLIZIZ6 = 0;
        } else {
            int iLIZJ6 = _User_OwnRoom_ProtoEncoder.LIZJ(ownRoom);
            iLIZIZ6 = iLIZJ6 + C1142350fph.LIZIZ(iLIZJ6) + C1142350fph.LIZ(33);
        }
        int iLJIIL3 = i6 + iLIZIZ6 + C1142340fpg.LJIIL(34, user.payScore) + C1142340fpg.LJIIL(35, user.fanTicketCount);
        AnchorInfo anchorInfo = user.anchorInfo;
        if (anchorInfo == null) {
            iLIZIZ7 = 0;
        } else {
            int iLJIIL4 = C1142340fpg.LJIIL(1, anchorInfo.level);
            iLIZIZ7 = iLJIIL4 + C1142350fph.LIZIZ(iLJIIL4) + C1142350fph.LIZ(36);
        }
        int iLJIIIZ = iLJIIL3 + iLIZIZ7 + C1142340fpg.LJIIIZ(37, user.linkMicStats) + C1142340fpg.LJIILL(38, user.username) + C1142340fpg.LJI(39) + C1142340fpg.LJI(40) + C1142340fpg.LJIIL(41, user.payScores);
        AnchorLevel anchorLevel = user.anchorLevel;
        if (anchorLevel == null) {
            iLIZIZ8 = 0;
        } else {
            int iLIZJ7 = _AnchorLevel_ProtoEncoder.LIZJ(anchorLevel);
            iLIZIZ8 = iLIZJ7 + C1142350fph.LIZIZ(iLIZJ7) + C1142350fph.LIZ(42);
        }
        int iLJIILL2 = iLJIIIZ + iLIZIZ8 + C1142340fpg.LJIILL(43, user.verifiedContent);
        Author author = user.authorInfo;
        if (author == null) {
            iLIZIZ9 = 0;
        } else {
            int iLIZJ8 = _Author_ProtoEncoder.LIZJ(author);
            iLIZIZ9 = iLIZJ8 + C1142350fph.LIZIZ(iLIZJ8) + C1142350fph.LIZ(44);
        }
        int i7 = iLJIILL2 + iLIZIZ9;
        List<User> list3 = user.topFans;
        if (list3 != null && !list3.isEmpty()) {
            for (int i8 = 0; i8 < user.topFans.size(); i8++) {
                User user2 = (User) ListProtector.get(user.topFans, i8);
                if (user2 == null) {
                    iLIZIZ19 = 0;
                } else {
                    int iLIZLLL = LIZLLL(user2);
                    iLIZIZ19 = iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(45);
                }
                i7 += iLIZIZ19;
            }
        }
        int iLJIILL3 = i7 + C1142340fpg.LJIILL(46, user.secUid) + C1142340fpg.LJIIIZ(47, user.userRole);
        ActivityRewardInfo activityRewardInfo = user.rewardInfo;
        if (activityRewardInfo == null) {
            iLIZIZ10 = 0;
        } else {
            int iLJ = _ImageModel_ProtoEncoder.LJ(1, activityRewardInfo.mBage) + _ImageModel_ProtoEncoder.LJ(2, activityRewardInfo.mStoryTag);
            iLIZIZ10 = iLJ + C1142350fph.LIZIZ(iLJ) + C1142350fph.LIZ(49);
        }
        int iLJ2 = iLJIILL3 + iLIZIZ10 + _ImageModel_ProtoEncoder.LJ(52, user.personalCard);
        AuthenticationInfo authenticationInfo = user.authenticationInfo;
        if (authenticationInfo == null) {
            iLIZIZ11 = 0;
        } else {
            int iLIZJ9 = _AuthenticationInfo_ProtoEncoder.LIZJ(authenticationInfo);
            iLIZIZ11 = iLIZJ9 + C1142350fph.LIZIZ(iLIZJ9) + C1142350fph.LIZ(53);
        }
        int iLJIILIIL = iLJ2 + iLIZIZ11;
        List<ImageModel> list4 = user.mediaBadgeImageList;
        if (list4 != null && !list4.isEmpty()) {
            for (int i9 = 0; i9 < user.mediaBadgeImageList.size(); i9++) {
                iLJIILIIL += _ImageModel_ProtoEncoder.LJ(57, (ImageModel) ListProtector.get(user.mediaBadgeImageList, i9));
            }
        }
        List<Long> list5 = user.commerceWebcastConfigIds;
        if (list5 != null && !list5.isEmpty()) {
            for (int i10 = 0; i10 < user.commerceWebcastConfigIds.size(); i10++) {
                iLJIILIIL += C1142340fpg.LJIILIIL(60, (Long) ListProtector.get(user.commerceWebcastConfigIds, i10));
            }
        }
        List<BorderInfo> list6 = user.borders;
        if (list6 != null && !list6.isEmpty()) {
            for (int i11 = 0; i11 < user.borders.size(); i11++) {
                BorderInfo borderInfo2 = (BorderInfo) ListProtector.get(user.borders, i11);
                if (borderInfo2 == null) {
                    iLIZIZ18 = 0;
                } else {
                    int iLIZJ10 = _BorderInfo_ProtoEncoder.LIZJ(borderInfo2);
                    iLIZIZ18 = iLIZJ10 + C1142350fph.LIZIZ(iLIZJ10) + C1142350fph.LIZ(61);
                }
                iLJIILIIL += iLIZIZ18;
            }
        }
        User.ComboBadgeInfo comboBadgeInfo = user.comboBadgeInfo;
        if (comboBadgeInfo == null) {
            iLIZIZ12 = 0;
        } else {
            int iLJ3 = _ImageModel_ProtoEncoder.LJ(1, comboBadgeInfo.icon) + C1142340fpg.LJIIL(2, comboBadgeInfo.comboCount);
            iLIZIZ12 = iLJ3 + C1142350fph.LIZIZ(iLJ3) + C1142350fph.LIZ(62);
        }
        int i12 = iLJIILIIL + iLIZIZ12;
        SubscribeInfo subscribeInfo = user.subscribeInfo;
        if (subscribeInfo == null) {
            iLIZIZ13 = 0;
        } else {
            int iLIZJ11 = _SubscribeInfo_ProtoEncoder.LIZJ(subscribeInfo);
            iLIZIZ13 = iLIZJ11 + C1142350fph.LIZIZ(iLIZJ11) + C1142350fph.LIZ(63);
        }
        int iLJIILIIL2 = i12 + iLIZIZ13;
        List<BadgeStruct> list7 = user.badgeList;
        if (list7 != null && !list7.isEmpty()) {
            for (int i13 = 0; i13 < user.badgeList.size(); i13++) {
                BadgeStruct badgeStruct = (BadgeStruct) ListProtector.get(user.badgeList, i13);
                if (badgeStruct == null) {
                    iLIZIZ17 = 0;
                } else {
                    int iLIZJ12 = _BadgeStruct_ProtoEncoder.LIZJ(badgeStruct);
                    iLIZIZ17 = iLIZJ12 + C1142350fph.LIZIZ(iLIZJ12) + C1142350fph.LIZ(64);
                }
                iLJIILIIL2 += iLIZIZ17;
            }
        }
        List<Long> list8 = user.mintTypeLabel;
        if (list8 != null && !list8.isEmpty()) {
            for (int i14 = 0; i14 < user.mintTypeLabel.size(); i14++) {
                iLJIILIIL2 += C1142340fpg.LJIILIIL(65, (Long) ListProtector.get(user.mintTypeLabel, i14));
            }
        }
        User.FansClubInfo fansClubInfo = user.fansClubInfo;
        if (fansClubInfo == null) {
            iLIZIZ14 = 0;
        } else {
            int iLIZJ13 = _User_FansClubInfo_ProtoEncoder.LIZJ(fansClubInfo);
            iLIZIZ14 = iLIZJ13 + C1142350fph.LIZIZ(iLIZJ13) + C1142350fph.LIZ(66);
        }
        int iLJI = iLJIILIIL2 + iLIZIZ14 + C1142340fpg.LJI(1002) + C1142340fpg.LJI(1003) + C1142340fpg.LJI(1004) + C1142340fpg.LJI(1005) + C1142340fpg.LJI(1006) + C1142340fpg.LJI(1007) + C1142340fpg.LJI(1008) + C1142340fpg.LJI(1009) + C1142340fpg.LJI(1010) + _ImageModel_ProtoEncoder.LJ(1012, user.avatarJpg) + C1142340fpg.LJIILL(1013, user.backgroundImgUrl) + C1142340fpg.LJIIIZ(1016, user.blockStatus) + C1142340fpg.LJIIIZ(1017, user.commentRestrict) + C1142340fpg.LJIILL(1018, user.constellation) + C1142340fpg.LJIIIZ(1019, user.disableIchat) + C1142340fpg.LJIIL(1020, user.enableIchatImg) + C1142340fpg.LJIIIZ(1021, user.exp) + C1142340fpg.LJI(1023) + C1142340fpg.LJIILIIL(1024, user.followStatus) + C1142340fpg.LJIIIZ(1027, user.ichatRestrictType) + C1142340fpg.LJIILL(1028, user.idStr) + C1142340fpg.LJI(1029) + C1142340fpg.LJI(1030) + C1142340fpg.LJI(1031) + C1142340fpg.LJI(1033) + C1142340fpg.LJI(1034) + C1142340fpg.LJI(1035) + C1142340fpg.LJI(1036) + C1142340fpg.LJI(1037) + C1142340fpg.LJI(1038) + C1142340fpg.LJI(1039) + C1142340fpg.LJI(1040) + C1142340fpg.LJIILL(1043, user.verifiedReason) + C1142340fpg.LJI(1044);
        List<LiveEventInfo> list9 = user.upcomingEventList;
        if (list9 != null && !list9.isEmpty()) {
            for (int i15 = 0; i15 < user.upcomingEventList.size(); i15++) {
                LiveEventInfo liveEventInfo = (LiveEventInfo) ListProtector.get(user.upcomingEventList, i15);
                if (liveEventInfo == null) {
                    iLIZIZ16 = 0;
                } else {
                    int iLIZJ14 = _LiveEventInfo_ProtoEncoder.LIZJ(liveEventInfo);
                    iLIZIZ16 = iLIZJ14 + C1142350fph.LIZIZ(iLIZJ14) + C1142350fph.LIZ(1045);
                }
                iLJI += iLIZIZ16;
            }
        }
        int iLJIILL4 = iLJI + C1142340fpg.LJIILL(1046, user.scmLabel);
        EcommerceEntrance ecommerceEntrance = user.ecommerceEntrance;
        if (ecommerceEntrance == null) {
            iLIZIZ15 = 0;
        } else {
            int iLIZJ15 = _EcommerceEntrance_ProtoEncoder.LIZJ(ecommerceEntrance);
            iLIZIZ15 = iLIZJ15 + C1142350fph.LIZIZ(iLIZJ15) + C1142350fph.LIZ(1047);
        }
        int iLJI2 = iLJIILL4 + iLIZIZ15 + C1142340fpg.LJI(1048) + C1142340fpg.LJI(1090) + C1142340fpg.LJI(1091);
        if (user.enigmaInfo != null) {
            int iLJI3 = C1142340fpg.LJI(1);
            iLIZ = C1142350fph.LIZ(1092) + iLJI3 + C1142350fph.LIZIZ(iLJI3);
        }
        return iLJI2 + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, User user) {
        long j = user.id;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 3, user.nickName);
        C1142340fpg.LJFF(c1142350fph, 5, user.signature);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 9, user.avatarThumb);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 10, user.avatarMedium);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 11, user.avatarLarge);
        boolean z = user.isVerified;
        c1142350fph.LIZLLL(12, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i = user.status;
        c1142350fph.LIZLLL(15, 0);
        c1142350fph.LIZJ(i);
        long j2 = user.createTime;
        c1142350fph.LIZLLL(16, 0);
        c1142350fph.LJFF(j2);
        long j3 = user.modifyTime;
        c1142350fph.LIZLLL(17, 0);
        c1142350fph.LJFF(j3);
        int i2 = user.secret;
        c1142350fph.LIZLLL(18, 0);
        c1142350fph.LIZJ(i2);
        C1142340fpg.LJFF(c1142350fph, 19, user.shareQrcodeUri);
        FollowInfo followInfo = user.followInfo;
        if (followInfo != null) {
            c1142350fph.LIZLLL(22, 2);
            c1142350fph.LJ(_FollowInfo_ProtoEncoder.LIZJ(followInfo));
            _FollowInfo_ProtoEncoder.LIZIZ(c1142350fph, followInfo);
        }
        UserHonor userHonor = user.userHonor;
        if (userHonor != null) {
            c1142350fph.LIZLLL(23, 2);
            c1142350fph.LJ(_UserHonor_ProtoEncoder.LIZJ(userHonor));
            _UserHonor_ProtoEncoder.LIZIZ(c1142350fph, userHonor);
        }
        FansClubMember fansClubMember = user.fansClub;
        if (fansClubMember != null) {
            c1142350fph.LIZLLL(24, 2);
            c1142350fph.LJ(_FansClubMember_ProtoEncoder.LIZJ(fansClubMember));
            _FansClubMember_ProtoEncoder.LIZIZ(c1142350fph, fansClubMember);
        }
        BorderInfo borderInfo = user.border;
        if (borderInfo != null) {
            c1142350fph.LIZLLL(25, 2);
            c1142350fph.LJ(_BorderInfo_ProtoEncoder.LIZJ(borderInfo));
            _BorderInfo_ProtoEncoder.LIZIZ(c1142350fph, borderInfo);
        }
        C1142340fpg.LJFF(c1142350fph, 26, user.specialId);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 27, user.avatarBorder);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 28, user.medal);
        List<ImageModel> list = user.userBadges;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < user.userBadges.size(); i3++) {
                _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 29, (ImageModel) ListProtector.get(user.userBadges, i3));
            }
        }
        List<ImageModel> list2 = user.newUserBadges;
        if (list2 != null && !list2.isEmpty()) {
            for (int i4 = 0; i4 < user.newUserBadges.size(); i4++) {
                _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 30, (ImageModel) ListProtector.get(user.newUserBadges, i4));
            }
        }
        long j4 = user.topVipNo;
        c1142350fph.LIZLLL(31, 0);
        c1142350fph.LJFF(j4);
        UserAttr userAttr = user.userAttr;
        if (userAttr != null) {
            c1142350fph.LIZLLL(32, 2);
            c1142350fph.LJ(_UserAttr_ProtoEncoder.LIZJ(userAttr));
            _UserAttr_ProtoEncoder.LIZIZ(c1142350fph, userAttr);
        }
        User.OwnRoom ownRoom = user.ownRoom;
        if (ownRoom != null) {
            c1142350fph.LIZLLL(33, 2);
            c1142350fph.LJ(_User_OwnRoom_ProtoEncoder.LIZJ(ownRoom));
            _User_OwnRoom_ProtoEncoder.LIZIZ(c1142350fph, ownRoom);
        }
        long j5 = user.payScore;
        c1142350fph.LIZLLL(34, 0);
        c1142350fph.LJFF(j5);
        long j6 = user.fanTicketCount;
        c1142350fph.LIZLLL(35, 0);
        c1142350fph.LJFF(j6);
        AnchorInfo anchorInfo = user.anchorInfo;
        if (anchorInfo != null) {
            c1142350fph.LIZLLL(36, 2);
            c1142350fph.LJ(C1142340fpg.LJIIL(1, anchorInfo.level));
            long j7 = anchorInfo.level;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJFF(j7);
        }
        int i5 = user.linkMicStats;
        c1142350fph.LIZLLL(37, 0);
        c1142350fph.LIZJ(i5);
        C1142340fpg.LJFF(c1142350fph, 38, user.username);
        boolean z2 = user.enableShowCommerceSale;
        c1142350fph.LIZLLL(39, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        boolean z3 = user.withFusionShopEntry;
        c1142350fph.LIZLLL(40, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
        long j8 = user.payScores;
        c1142350fph.LIZLLL(41, 0);
        c1142350fph.LJFF(j8);
        AnchorLevel anchorLevel = user.anchorLevel;
        if (anchorLevel != null) {
            c1142350fph.LIZLLL(42, 2);
            c1142350fph.LJ(_AnchorLevel_ProtoEncoder.LIZJ(anchorLevel));
            _AnchorLevel_ProtoEncoder.LIZIZ(c1142350fph, anchorLevel);
        }
        C1142340fpg.LJFF(c1142350fph, 43, user.verifiedContent);
        Author author = user.authorInfo;
        if (author != null) {
            c1142350fph.LIZLLL(44, 2);
            c1142350fph.LJ(_Author_ProtoEncoder.LIZJ(author));
            _Author_ProtoEncoder.LIZIZ(c1142350fph, author);
        }
        List<User> list3 = user.topFans;
        if (list3 != null && !list3.isEmpty()) {
            for (int i6 = 0; i6 < user.topFans.size(); i6++) {
                LIZJ(c1142350fph, 45, (User) ListProtector.get(user.topFans, i6));
            }
        }
        C1142340fpg.LJFF(c1142350fph, 46, user.secUid);
        int i7 = user.userRole;
        c1142350fph.LIZLLL(47, 0);
        c1142350fph.LIZJ(i7);
        ActivityRewardInfo activityRewardInfo = user.rewardInfo;
        if (activityRewardInfo != null) {
            c1142350fph.LIZLLL(49, 2);
            c1142350fph.LJ(_ImageModel_ProtoEncoder.LJ(1, activityRewardInfo.mBage) + _ImageModel_ProtoEncoder.LJ(2, activityRewardInfo.mStoryTag));
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, activityRewardInfo.mBage);
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, activityRewardInfo.mStoryTag);
        }
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 52, user.personalCard);
        AuthenticationInfo authenticationInfo = user.authenticationInfo;
        if (authenticationInfo != null) {
            c1142350fph.LIZLLL(53, 2);
            c1142350fph.LJ(_AuthenticationInfo_ProtoEncoder.LIZJ(authenticationInfo));
            _AuthenticationInfo_ProtoEncoder.LIZIZ(c1142350fph, authenticationInfo);
        }
        List<ImageModel> list4 = user.mediaBadgeImageList;
        if (list4 != null && !list4.isEmpty()) {
            for (int i8 = 0; i8 < user.mediaBadgeImageList.size(); i8++) {
                _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 57, (ImageModel) ListProtector.get(user.mediaBadgeImageList, i8));
            }
        }
        List<Long> list5 = user.commerceWebcastConfigIds;
        if (list5 != null && !list5.isEmpty()) {
            for (int i9 = 0; i9 < user.commerceWebcastConfigIds.size(); i9++) {
                C1142340fpg.LJ(c1142350fph, 60, (Long) ListProtector.get(user.commerceWebcastConfigIds, i9));
            }
        }
        List<BorderInfo> list6 = user.borders;
        if (list6 != null && !list6.isEmpty()) {
            for (int i10 = 0; i10 < user.borders.size(); i10++) {
                BorderInfo borderInfo2 = (BorderInfo) ListProtector.get(user.borders, i10);
                if (borderInfo2 != null) {
                    c1142350fph.LIZLLL(61, 2);
                    c1142350fph.LJ(_BorderInfo_ProtoEncoder.LIZJ(borderInfo2));
                    _BorderInfo_ProtoEncoder.LIZIZ(c1142350fph, borderInfo2);
                }
            }
        }
        User.ComboBadgeInfo comboBadgeInfo = user.comboBadgeInfo;
        if (comboBadgeInfo != null) {
            c1142350fph.LIZLLL(62, 2);
            c1142350fph.LJ(_ImageModel_ProtoEncoder.LJ(1, comboBadgeInfo.icon) + C1142340fpg.LJIIL(2, comboBadgeInfo.comboCount));
            _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, comboBadgeInfo.icon);
            long j9 = comboBadgeInfo.comboCount;
            c1142350fph.LIZLLL(2, 0);
            c1142350fph.LJFF(j9);
        }
        SubscribeInfo subscribeInfo = user.subscribeInfo;
        if (subscribeInfo != null) {
            c1142350fph.LIZLLL(63, 2);
            c1142350fph.LJ(_SubscribeInfo_ProtoEncoder.LIZJ(subscribeInfo));
            _SubscribeInfo_ProtoEncoder.LIZIZ(c1142350fph, subscribeInfo);
        }
        List<BadgeStruct> list7 = user.badgeList;
        if (list7 != null && !list7.isEmpty()) {
            for (int i11 = 0; i11 < user.badgeList.size(); i11++) {
                BadgeStruct badgeStruct = (BadgeStruct) ListProtector.get(user.badgeList, i11);
                if (badgeStruct != null) {
                    c1142350fph.LIZLLL(64, 2);
                    c1142350fph.LJ(_BadgeStruct_ProtoEncoder.LIZJ(badgeStruct));
                    _BadgeStruct_ProtoEncoder.LIZIZ(c1142350fph, badgeStruct);
                }
            }
        }
        List<Long> list8 = user.mintTypeLabel;
        if (list8 != null && !list8.isEmpty()) {
            for (int i12 = 0; i12 < user.mintTypeLabel.size(); i12++) {
                C1142340fpg.LJ(c1142350fph, 65, (Long) ListProtector.get(user.mintTypeLabel, i12));
            }
        }
        User.FansClubInfo fansClubInfo = user.fansClubInfo;
        if (fansClubInfo != null) {
            c1142350fph.LIZLLL(66, 2);
            c1142350fph.LJ(_User_FansClubInfo_ProtoEncoder.LIZJ(fansClubInfo));
            _User_FansClubInfo_ProtoEncoder.LIZIZ(c1142350fph, fansClubInfo);
        }
        boolean z4 = user.allowFindByContacts;
        c1142350fph.LIZLLL(1002, 0);
        c1142350fph.LJ(z4 ? 1 : 0);
        boolean z5 = user.allowOthersDownloadVideo;
        c1142350fph.LIZLLL(1003, 0);
        c1142350fph.LJ(z5 ? 1 : 0);
        boolean z6 = user.allowOthersDownloadWhenSharingVideo;
        c1142350fph.LIZLLL(1004, 0);
        c1142350fph.LJ(z6 ? 1 : 0);
        boolean z7 = user.allowShareShowProfile;
        c1142350fph.LIZLLL(1005, 0);
        c1142350fph.LJ(z7 ? 1 : 0);
        boolean z8 = user.allowShowInGossip;
        c1142350fph.LIZLLL(1006, 0);
        c1142350fph.LJ(z8 ? 1 : 0);
        boolean z9 = user.allowShowMyAction;
        c1142350fph.LIZLLL(1007, 0);
        c1142350fph.LJ(z9 ? 1 : 0);
        boolean z10 = user.allowStrangeComment;
        c1142350fph.LIZLLL(1008, 0);
        c1142350fph.LJ(z10 ? 1 : 0);
        boolean z11 = user.allowUnfollowerComment;
        c1142350fph.LIZLLL(1009, 0);
        c1142350fph.LJ(z11 ? 1 : 0);
        boolean z12 = user.allowUseLinkmic;
        c1142350fph.LIZLLL(1010, 0);
        c1142350fph.LJ(z12 ? 1 : 0);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1012, user.avatarJpg);
        C1142340fpg.LJFF(c1142350fph, 1013, user.backgroundImgUrl);
        int i13 = user.blockStatus;
        c1142350fph.LIZLLL(1016, 0);
        c1142350fph.LIZJ(i13);
        int i14 = user.commentRestrict;
        c1142350fph.LIZLLL(1017, 0);
        c1142350fph.LIZJ(i14);
        C1142340fpg.LJFF(c1142350fph, 1018, user.constellation);
        int i15 = user.disableIchat;
        c1142350fph.LIZLLL(1019, 0);
        c1142350fph.LIZJ(i15);
        long j10 = user.enableIchatImg;
        c1142350fph.LIZLLL(1020, 0);
        c1142350fph.LJFF(j10);
        int i16 = user.exp;
        c1142350fph.LIZLLL(1021, 0);
        c1142350fph.LIZJ(i16);
        boolean z13 = user.foldStrangerChat;
        c1142350fph.LIZLLL(1023, 0);
        c1142350fph.LJ(z13 ? 1 : 0);
        C1142340fpg.LJ(c1142350fph, 1024, user.followStatus);
        int i17 = user.ichatRestrictType;
        c1142350fph.LIZLLL(1027, 0);
        c1142350fph.LIZJ(i17);
        C1142340fpg.LJFF(c1142350fph, 1028, user.idStr);
        boolean z14 = user.isFollower;
        c1142350fph.LIZLLL(1029, 0);
        c1142350fph.LJ(z14 ? 1 : 0);
        boolean z15 = user.isFollowing;
        c1142350fph.LIZLLL(1030, 0);
        c1142350fph.LJ(z15 ? 1 : 0);
        boolean z16 = user.needProfileGuide;
        c1142350fph.LIZLLL(1031, 0);
        c1142350fph.LJ(z16 ? 1 : 0);
        boolean z17 = user.pushCommentStatus;
        c1142350fph.LIZLLL(1033, 0);
        c1142350fph.LJ(z17 ? 1 : 0);
        boolean z18 = user.pushDigg;
        c1142350fph.LIZLLL(1034, 0);
        c1142350fph.LJ(z18 ? 1 : 0);
        boolean z19 = user.pushFollow;
        c1142350fph.LIZLLL(1035, 0);
        c1142350fph.LJ(z19 ? 1 : 0);
        boolean z20 = user.pushFriendAction;
        c1142350fph.LIZLLL(1036, 0);
        c1142350fph.LJ(z20 ? 1 : 0);
        boolean z21 = user.pushIchat;
        c1142350fph.LIZLLL(1037, 0);
        c1142350fph.LJ(z21 ? 1 : 0);
        boolean z22 = user.pushStatus;
        c1142350fph.LIZLLL(1038, 0);
        c1142350fph.LJ(z22 ? 1 : 0);
        boolean z23 = user.pushVideoPost;
        c1142350fph.LIZLLL(1039, 0);
        c1142350fph.LJ(z23 ? 1 : 0);
        boolean z24 = user.pushVideoRecommend;
        c1142350fph.LIZLLL(1040, 0);
        c1142350fph.LJ(z24 ? 1 : 0);
        C1142340fpg.LJFF(c1142350fph, 1043, user.verifiedReason);
        boolean z25 = user.enableCarManagementPermission;
        c1142350fph.LIZLLL(1044, 0);
        c1142350fph.LJ(z25 ? 1 : 0);
        List<LiveEventInfo> list9 = user.upcomingEventList;
        if (list9 != null && !list9.isEmpty()) {
            for (int i18 = 0; i18 < user.upcomingEventList.size(); i18++) {
                LiveEventInfo liveEventInfo = (LiveEventInfo) ListProtector.get(user.upcomingEventList, i18);
                if (liveEventInfo != null) {
                    c1142350fph.LIZLLL(1045, 2);
                    c1142350fph.LJ(_LiveEventInfo_ProtoEncoder.LIZJ(liveEventInfo));
                    _LiveEventInfo_ProtoEncoder.LIZIZ(c1142350fph, liveEventInfo);
                }
            }
        }
        C1142340fpg.LJFF(c1142350fph, 1046, user.scmLabel);
        EcommerceEntrance ecommerceEntrance = user.ecommerceEntrance;
        if (ecommerceEntrance != null) {
            c1142350fph.LIZLLL(1047, 2);
            c1142350fph.LJ(_EcommerceEntrance_ProtoEncoder.LIZJ(ecommerceEntrance));
            _EcommerceEntrance_ProtoEncoder.LIZIZ(c1142350fph, ecommerceEntrance);
        }
        boolean z26 = user.isBlock;
        c1142350fph.LIZLLL(1048, 0);
        c1142350fph.LJ(z26 ? 1 : 0);
        boolean z27 = user.isSubscribe;
        c1142350fph.LIZLLL(1090, 0);
        c1142350fph.LJ(z27 ? 1 : 0);
        boolean z28 = user.isAnchorMarked;
        c1142350fph.LIZLLL(1091, 0);
        c1142350fph.LJ(z28 ? 1 : 0);
        User.EnigmaInfo enigmaInfo = user.enigmaInfo;
        if (enigmaInfo != null) {
            c1142350fph.LIZLLL(1092, 2);
            c1142350fph.LJ(C1142340fpg.LJI(1));
            boolean z29 = enigmaInfo.isEnigmaMaskOn;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LJ(z29 ? 1 : 0);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, User user) {
        LIZIZ(c1142350fph, user);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, User user) {
        if (user == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(LIZLLL(user));
        LIZIZ(c1142350fph, user);
    }
}
