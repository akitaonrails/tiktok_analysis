package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ShopEntranceInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._EcommerceEntrance_ShowcaseEntranceInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.ActivityRewardInfo;
import com.bytedance.android.livesdk.model.AnchorLevel;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.UserHonor;
import com.bytedance.android.livesdk.model._ActivityRewardInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._AnchorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._AnchorLevel_ProtoDecoder;
import com.bytedance.android.livesdk.model._AuthenticationInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._Author_ProtoDecoder;
import com.bytedance.android.livesdk.model._BorderInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._FansClubMember_ProtoDecoder;
import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserAttr_ProtoDecoder;
import com.bytedance.android.livesdk.model._UserHonor_ProtoDecoder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _User_ProtoDecoder implements C0IMD<User> {
    public static User LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        User user = new User();
        user.topFans = new ArrayList();
        user.userBadges = new ArrayList();
        user.commerceWebcastConfigIds = new ArrayList();
        user.borders = new ArrayList();
        user.badgeList = new ArrayList();
        user.mediaBadgeImageList = new ArrayList();
        user.newUserBadges = new ArrayList();
        user.mintTypeLabel = new ArrayList();
        user.upcomingEventList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 5) {
                            if (iLJI != 52) {
                                if (iLJI != 53) {
                                    if (iLJI != 1012) {
                                        if (iLJI != 1013) {
                                            if (iLJI != 1023) {
                                                if (iLJI != 1024) {
                                                    switch (iLJI) {
                                                        case 5:
                                                            break;
                                                        case 22:
                                                            user.followInfo = _FollowInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 23:
                                                            user.userHonor = _UserHonor_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                                            user.fansClub = _FansClubMember_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 25:
                                                            user.border = _BorderInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 26:
                                                            user.specialId = C1516700pZU.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 27:
                                                            user.avatarBorder = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 28:
                                                            user.medal = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 29:
                                                            user.userBadges.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                                                            continue;
                                                        case 30:
                                                            user.newUserBadges.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                                                            continue;
                                                        case 31:
                                                            user.topVipNo = (int) c1516680pZS.LJIIJJI();
                                                            continue;
                                                        case 32:
                                                            user.userAttr = _UserAttr_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                            user.ownRoom = _User_OwnRoom_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                            user.payScore = c1516680pZS.LJIIJJI();
                                                            continue;
                                                        case 35:
                                                            user.fanTicketCount = c1516680pZS.LJIIJJI();
                                                            continue;
                                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                                            user.anchorInfo = _AnchorInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 37:
                                                            user.linkMicStats = c1516680pZS.LJIIJ();
                                                            continue;
                                                        case 38:
                                                            user.username = C1516700pZU.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 39:
                                                            user.enableShowCommerceSale = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 40:
                                                            user.withFusionShopEntry = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 41:
                                                            user.payScores = c1516680pZS.LJIIJJI();
                                                            continue;
                                                        case 42:
                                                            user.anchorLevel = _AnchorLevel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 43:
                                                            user.verifiedContent = C1516700pZU.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 44:
                                                            user.authorInfo = _Author_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 45:
                                                            user.topFans.add(LIZLLL(c1516680pZS));
                                                            continue;
                                                        case 46:
                                                            user.secUid = C1516700pZU.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 47:
                                                            user.userRole = c1516680pZS.LJIIJ();
                                                            continue;
                                                        case 49:
                                                            user.rewardInfo = _ActivityRewardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 57:
                                                            user.mediaBadgeImageList.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                                                            continue;
                                                        case 1033:
                                                            user.pushCommentStatus = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1034:
                                                            user.pushDigg = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1035:
                                                            user.pushFollow = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1036:
                                                            user.pushFriendAction = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1037:
                                                            user.pushIchat = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1038:
                                                            user.pushStatus = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1039:
                                                            user.pushVideoPost = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1040:
                                                            user.pushVideoRecommend = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1043:
                                                            user.verifiedReason = C1516700pZU.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 1044:
                                                            user.enableCarManagementPermission = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1045:
                                                            user.upcomingEventList.add(_LiveEventInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                                            continue;
                                                        case 1046:
                                                            user.scmLabel = C1516700pZU.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 1047:
                                                            user.ecommerceEntrance = _EcommerceEntrance_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        case 1048:
                                                            user.isBlock = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1090:
                                                            user.isSubscribe = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1091:
                                                            user.isAnchorMarked = C1516700pZU.LIZ(c1516680pZS);
                                                            continue;
                                                        case 1092:
                                                            user.enigmaInfo = _User_EnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            continue;
                                                        default:
                                                            switch (iLJI) {
                                                                case BdTuring.TYPE_ECAF /* 9 */:
                                                                    user.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                    continue;
                                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                                    user.avatarMedium = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                    break;
                                                                case BdTuring.TYPE_EMAIL /* 11 */:
                                                                    user.avatarLarge = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                    break;
                                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                                    user.isVerified = C1516700pZU.LIZ(c1516680pZS);
                                                                    break;
                                                                default:
                                                                    switch (iLJI) {
                                                                        case 15:
                                                                            user.status = c1516680pZS.LJIIJ();
                                                                            break;
                                                                        case 16:
                                                                            user.createTime = c1516680pZS.LJIIJJI();
                                                                            break;
                                                                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                                            user.modifyTime = c1516680pZS.LJIIJJI();
                                                                            break;
                                                                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                                            user.secret = c1516680pZS.LJIIJ();
                                                                            break;
                                                                        case 19:
                                                                            user.shareQrcodeUri = C1516700pZU.LIZLLL(c1516680pZS);
                                                                            break;
                                                                        default:
                                                                            switch (iLJI) {
                                                                                case 60:
                                                                                    user.commerceWebcastConfigIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                                                                                    break;
                                                                                case 61:
                                                                                    user.borders.add(_BorderInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                                                                    break;
                                                                                case BaseNotice.CREATOR /* 62 */:
                                                                                    user.comboBadgeInfo = _User_ComboBadgeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                    break;
                                                                                case 63:
                                                                                    user.subscribeInfo = _SubscribeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                    break;
                                                                                case 64:
                                                                                    user.badgeList.add(_BadgeStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                                                                                    break;
                                                                                case 65:
                                                                                    user.mintTypeLabel.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                                                                                    break;
                                                                                case 66:
                                                                                    user.fansClubInfo = _User_FansClubInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                    break;
                                                                                default:
                                                                                    switch (iLJI) {
                                                                                        case 1002:
                                                                                            user.allowFindByContacts = C1516700pZU.LIZ(c1516680pZS);
                                                                                            break;
                                                                                        case 1003:
                                                                                            user.allowOthersDownloadVideo = C1516700pZU.LIZ(c1516680pZS);
                                                                                            break;
                                                                                        case 1004:
                                                                                            user.allowOthersDownloadWhenSharingVideo = C1516700pZU.LIZ(c1516680pZS);
                                                                                            break;
                                                                                        case 1005:
                                                                                            user.allowShareShowProfile = C1516700pZU.LIZ(c1516680pZS);
                                                                                            break;
                                                                                        case 1006:
                                                                                            user.allowShowInGossip = C1516700pZU.LIZ(c1516680pZS);
                                                                                            break;
                                                                                        case 1007:
                                                                                            user.allowShowMyAction = C1516700pZU.LIZ(c1516680pZS);
                                                                                            break;
                                                                                        case 1008:
                                                                                            user.allowStrangeComment = C1516700pZU.LIZ(c1516680pZS);
                                                                                            break;
                                                                                        case 1009:
                                                                                            user.allowUnfollowerComment = C1516700pZU.LIZ(c1516680pZS);
                                                                                            break;
                                                                                        case 1010:
                                                                                            user.allowUseLinkmic = C1516700pZU.LIZ(c1516680pZS);
                                                                                            break;
                                                                                        default:
                                                                                            switch (iLJI) {
                                                                                                case 1016:
                                                                                                    user.blockStatus = c1516680pZS.LJIIJ();
                                                                                                    break;
                                                                                                case 1017:
                                                                                                    user.commentRestrict = c1516680pZS.LJIIJ();
                                                                                                    break;
                                                                                                case 1018:
                                                                                                    user.constellation = C1516700pZU.LIZLLL(c1516680pZS);
                                                                                                    break;
                                                                                                case 1019:
                                                                                                    user.disableIchat = c1516680pZS.LJIIJ();
                                                                                                    break;
                                                                                                case 1020:
                                                                                                    user.enableIchatImg = c1516680pZS.LJIIJJI();
                                                                                                    break;
                                                                                                case 1021:
                                                                                                    user.exp = c1516680pZS.LJIIJ();
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (iLJI) {
                                                                                                        case 1027:
                                                                                                            user.ichatRestrictType = c1516680pZS.LJIIJ();
                                                                                                            break;
                                                                                                        case 1028:
                                                                                                            user.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                                                                                                            break;
                                                                                                        case 1029:
                                                                                                            user.isFollower = C1516700pZU.LIZ(c1516680pZS);
                                                                                                            break;
                                                                                                        case 1030:
                                                                                                            user.isFollowing = C1516700pZU.LIZ(c1516680pZS);
                                                                                                            break;
                                                                                                        case 1031:
                                                                                                            user.needProfileGuide = C1516700pZU.LIZ(c1516680pZS);
                                                                                                            break;
                                                                                                        default:
                                                                                                            C1516700pZU.LJ(c1516680pZS);
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    user.followStatus = Long.valueOf(c1516680pZS.LJIIJJI());
                                                }
                                            } else {
                                                user.foldStrangerChat = C1516700pZU.LIZ(c1516680pZS);
                                            }
                                        } else {
                                            user.backgroundImgUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        user.avatarJpg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    user.authenticationInfo = _AuthenticationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                user.personalCard = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        }
                        user.signature = C1516700pZU.LIZLLL(c1516680pZS);
                    } else {
                        user.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    user.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return user;
            }
        }
    }

    public static void LJ(User user) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3;
        ImageModel imageModel4 = user.avatarThumb;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        ImageModel imageModel5 = user.avatarMedium;
        if (imageModel5 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel5);
        }
        ImageModel imageModel6 = user.avatarLarge;
        if (imageModel6 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel6);
        }
        UserHonor userHonor = user.userHonor;
        if (userHonor != null) {
            _UserHonor_ProtoDecoder.LJ(userHonor);
        }
        FansClubMember fansClubMember = user.fansClub;
        if (fansClubMember != null) {
            _FansClubMember_ProtoDecoder.LJ(fansClubMember);
        }
        BorderInfo borderInfo = user.border;
        if (borderInfo != null) {
            _BorderInfo_ProtoDecoder.LJ(borderInfo);
        }
        ImageModel imageModel7 = user.avatarBorder;
        if (imageModel7 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel7);
        }
        ImageModel imageModel8 = user.medal;
        if (imageModel8 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel8);
        }
        List<ImageModel> list = user.userBadges;
        if (list == null) {
            user.userBadges = new ArrayList();
        } else if (!list.isEmpty()) {
            for (ImageModel imageModel9 : user.userBadges) {
                if (imageModel9 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel9);
                }
            }
        }
        List<ImageModel> list2 = user.newUserBadges;
        if (list2 == null) {
            user.newUserBadges = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (ImageModel imageModel10 : user.newUserBadges) {
                if (imageModel10 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel10);
                }
            }
        }
        UserAttr userAttr = user.userAttr;
        if (userAttr != null && userAttr.adminPermissions == null) {
            userAttr.adminPermissions = new HashMap();
        }
        User.OwnRoom ownRoom = user.ownRoom;
        if (ownRoom != null && ownRoom.roomIdList == null) {
            ownRoom.roomIdList = new ArrayList();
        }
        AnchorLevel anchorLevel = user.anchorLevel;
        if (anchorLevel != null) {
            _AnchorLevel_ProtoDecoder.LJ(anchorLevel);
        }
        List<User> list3 = user.topFans;
        if (list3 == null) {
            user.topFans = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (User user2 : user.topFans) {
                if (user2 != null) {
                    LJ(user2);
                }
            }
        }
        ActivityRewardInfo activityRewardInfo = user.rewardInfo;
        if (activityRewardInfo != null) {
            ImageModel imageModel11 = activityRewardInfo.mBage;
            if (imageModel11 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel11);
            }
            ImageModel imageModel12 = activityRewardInfo.mStoryTag;
            if (imageModel12 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel12);
            }
        }
        ImageModel imageModel13 = user.personalCard;
        if (imageModel13 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel13);
        }
        AuthenticationInfo authenticationInfo = user.authenticationInfo;
        if (authenticationInfo != null && (imageModel3 = authenticationInfo.authenticationBadge) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        List<ImageModel> list4 = user.mediaBadgeImageList;
        if (list4 == null) {
            user.mediaBadgeImageList = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (ImageModel imageModel14 : user.mediaBadgeImageList) {
                if (imageModel14 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel14);
                }
            }
        }
        if (user.commerceWebcastConfigIds == null) {
            user.commerceWebcastConfigIds = new ArrayList();
        }
        List<BorderInfo> list5 = user.borders;
        if (list5 == null) {
            user.borders = new ArrayList();
        } else if (!list5.isEmpty()) {
            for (BorderInfo borderInfo2 : user.borders) {
                if (borderInfo2 != null) {
                    _BorderInfo_ProtoDecoder.LJ(borderInfo2);
                }
            }
        }
        User.ComboBadgeInfo comboBadgeInfo = user.comboBadgeInfo;
        if (comboBadgeInfo != null && (imageModel2 = comboBadgeInfo.icon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        SubscribeInfo subscribeInfo = user.subscribeInfo;
        if (subscribeInfo != null) {
            _SubscribeInfo_ProtoDecoder.LJ(subscribeInfo);
        }
        List<BadgeStruct> list6 = user.badgeList;
        if (list6 == null) {
            user.badgeList = new ArrayList();
        } else if (!list6.isEmpty()) {
            for (BadgeStruct badgeStruct : user.badgeList) {
                if (badgeStruct != null) {
                    _BadgeStruct_ProtoDecoder.LJ(badgeStruct);
                }
            }
        }
        if (user.mintTypeLabel == null) {
            user.mintTypeLabel = new ArrayList();
        }
        User.FansClubInfo fansClubInfo = user.fansClubInfo;
        if (fansClubInfo != null && (imageModel = fansClubInfo.badge) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel15 = user.avatarJpg;
        if (imageModel15 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel15);
        }
        List<LiveEventInfo> list7 = user.upcomingEventList;
        if (list7 == null) {
            user.upcomingEventList = new ArrayList();
        } else if (!list7.isEmpty()) {
            for (LiveEventInfo liveEventInfo : user.upcomingEventList) {
                if (liveEventInfo != null) {
                    _LiveEventInfo_ProtoDecoder.LJ(liveEventInfo);
                }
            }
        }
        EcommerceEntrance ecommerceEntrance = user.ecommerceEntrance;
        if (ecommerceEntrance != null) {
            EcommerceEntrance.ShopEntranceInfo shopEntranceInfo = ecommerceEntrance.shopEntranceInfo;
            if (shopEntranceInfo != null) {
                _EcommerceEntrance_ShopEntranceInfo_ProtoDecoder.LJ(shopEntranceInfo);
            }
            EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo = ecommerceEntrance.showcaseEntranceInfo;
            if (showcaseEntranceInfo != null) {
                _EcommerceEntrance_ShowcaseEntranceInfo_ProtoDecoder.LJ(showcaseEntranceInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(User user) {
        LJ(user);
    }

    @Override // X.C0IMD
    public final User LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, User user, List list) {
    }
}
