package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBIndustryVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api._VerificationWarningInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.game.model._GameLiveFragment_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoal_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.android.livesdk.message.proto._CppAgeVerificationInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._LiveProInfo_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._WebcastLSAccessStatus_ProtoDecoder;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model._Hashtag_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.RoomEventMessage;
import com.bytedance.android.livesdk.model.message._BannerInRoomCollection_BannerInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RoomEventMessage_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComAvoidConfig;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live._MsgNotifyComAvoidConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._MsgNotifyQuota_ProtoDecoder;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.api.room._LiveManagerEntranceInfo_ProtoDecoder;
import webcast.api.room._PlaybookBannerContainer_ProtoDecoder;
import webcast.data.AnchorReminderWordStatus;
import webcast.data.LiveGoLivePageContainer;
import webcast.data.MultiGuestPlayInfo;
import webcast.data._AnchorReminderWordStatus_ProtoDecoder;
import webcast.data._AutoShareLiveCardToBulletinBoard_ProtoDecoder;
import webcast.data._CampaignExposureData_ProtoDecoder;
import webcast.data._LiveGoLivePageContainer_ProtoDecoder;
import webcast.data._MultiGuestPlayInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomCreateInfo_ProtoDecoder implements C0IMD<RoomCreateInfo> {
    @Override // X.C0IMD
    public final void LIZ(RoomCreateInfo roomCreateInfo) {
        SMBVerificationInfo sMBVerificationInfo;
        SMBIndustryVerificationInfo sMBIndustryVerificationInfo;
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        ImageModel imageModel4 = roomCreateInfo2.mCover;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        Hashtag hashtag = roomCreateInfo2.hashtag;
        if (hashtag != null && (imageModel3 = hashtag.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        Map<Long, PushStreamInfo> map = roomCreateInfo2.pushStreamInfoMap;
        if (map == null) {
            roomCreateInfo2.pushStreamInfoMap = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, PushStreamInfo>> it2 = roomCreateInfo2.pushStreamInfoMap.entrySet().iterator();
            while (it2.hasNext()) {
                PushStreamInfo value = it2.next().getValue();
                if (value != null) {
                    _PushStreamInfo_ProtoDecoder.LJ(value);
                }
            }
        }
        GameLiveFragment gameLiveFragment = roomCreateInfo2.lastFragment;
        if (gameLiveFragment != null) {
            _GameLiveFragment_ProtoDecoder.LJ(gameLiveFragment);
        }
        BannerInRoomCollection.BannerInfo bannerInfo = roomCreateInfo2.bannerInfo;
        if (bannerInfo != null) {
            _BannerInRoomCollection_BannerInfo_ProtoDecoder.LJ(bannerInfo);
        }
        if (roomCreateInfo2.adminEcShowPermission == null) {
            roomCreateInfo2.adminEcShowPermission = new HashMap();
        }
        List<CreateInfoPerceptionMessage> list = roomCreateInfo2.perceptionMessages;
        if (list == null) {
            roomCreateInfo2.perceptionMessages = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<CreateInfoPerceptionMessage> it3 = roomCreateInfo2.perceptionMessages.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        LiveProInfo liveProInfo = roomCreateInfo2.liveProInfo;
        if (liveProInfo != null) {
            _LiveProInfo_ProtoDecoder.LJ(liveProInfo);
        }
        ImageModel imageModel5 = roomCreateInfo2.voiceCover;
        if (imageModel5 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel5);
        }
        List<PopMsgContainer> list2 = roomCreateInfo2.popInfoList;
        if (list2 == null) {
            roomCreateInfo2.popInfoList = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (PopMsgContainer popMsgContainer : roomCreateInfo2.popInfoList) {
                if (popMsgContainer != null && popMsgContainer.buttonContent == null) {
                    popMsgContainer.buttonContent = new ArrayList();
                }
            }
        }
        Map<Long, MsgNotifyQuota> map2 = roomCreateInfo2.notifyQuotaConfig;
        if (map2 == null) {
            roomCreateInfo2.notifyQuotaConfig = new HashMap();
        } else if (!map2.isEmpty()) {
            Iterator<Map.Entry<Long, MsgNotifyQuota>> it4 = roomCreateInfo2.notifyQuotaConfig.entrySet().iterator();
            while (it4.hasNext()) {
                MsgNotifyQuota value2 = it4.next().getValue();
                if (value2 != null && value2.positionCountMap == null) {
                    value2.positionCountMap = new HashMap();
                }
            }
        }
        CampaignBannerData campaignBannerData = roomCreateInfo2.campaignBannerData;
        if (campaignBannerData != null && (imageModel2 = campaignBannerData.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ActivitiesIconInfo activitiesIconInfo = roomCreateInfo2.activitiesIconInfo;
        if (activitiesIconInfo != null && (imageModel = activitiesIconInfo.iconImage) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        List<AnchorReminderWordStatus> list3 = roomCreateInfo2.reminderWordStatus;
        if (list3 == null) {
            roomCreateInfo2.reminderWordStatus = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<AnchorReminderWordStatus> it5 = roomCreateInfo2.reminderWordStatus.iterator();
            while (it5.hasNext()) {
                it5.next();
            }
        }
        MsgNotifyComAvoidConfig msgNotifyComAvoidConfig = roomCreateInfo2.avoidConfig;
        if (msgNotifyComAvoidConfig != null) {
            _MsgNotifyComAvoidConfig_ProtoDecoder.LJ(msgNotifyComAvoidConfig);
        }
        LiveStreamGoal liveStreamGoal = roomCreateInfo2.ongoingGoal;
        if (liveStreamGoal != null) {
            _LiveStreamGoal_ProtoDecoder.LJ(liveStreamGoal);
        }
        MultiGuestPlayInfo multiGuestPlayInfo = roomCreateInfo2.multiGuestPlayInfo;
        if (multiGuestPlayInfo != null) {
            _MultiGuestPlayInfo_ProtoDecoder.LJ(multiGuestPlayInfo);
        }
        NewAnchorIncentiveBannerData newAnchorIncentiveBannerData = roomCreateInfo2.newAnchorIncentiveBannerData;
        if (newAnchorIncentiveBannerData != null) {
            ImageModel imageModel6 = newAnchorIncentiveBannerData.image;
            if (imageModel6 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel6);
            }
            if (newAnchorIncentiveBannerData.metricsMap == null) {
                newAnchorIncentiveBannerData.metricsMap = new HashMap();
            }
        }
        UnifiedBannerData unifiedBannerData = roomCreateInfo2.unifiedBannerData;
        if (unifiedBannerData != null) {
            _UnifiedBannerData_ProtoDecoder.LJ(unifiedBannerData);
        }
        UnifiedBannerData unifiedBannerData2 = roomCreateInfo2.liveJourneyBanner;
        if (unifiedBannerData2 != null) {
            _UnifiedBannerData_ProtoDecoder.LJ(unifiedBannerData2);
        }
        RoomEventMessage roomEventMessage = roomCreateInfo2.roomEventMessageInfo;
        if (roomEventMessage != null) {
            _RoomEventMessage_ProtoDecoder.LJ(roomEventMessage);
        }
        LiveGoLivePageContainer liveGoLivePageContainer = roomCreateInfo2.liveGoLivePageContainer;
        if (liveGoLivePageContainer != null) {
            _LiveGoLivePageContainer_ProtoDecoder.LJ(liveGoLivePageContainer);
        }
        UnifiedBannerData unifiedBannerData3 = roomCreateInfo2.ecomGrowthLineBanner;
        if (unifiedBannerData3 != null) {
            _UnifiedBannerData_ProtoDecoder.LJ(unifiedBannerData3);
        }
        RoomCreateInfo.SMBVerification sMBVerification = roomCreateInfo2.smbVerification;
        if (sMBVerification != null && (sMBVerificationInfo = sMBVerification.verificationInfo) != null && (sMBIndustryVerificationInfo = sMBVerificationInfo.industryVerificationInfo) != null && sMBIndustryVerificationInfo.blockedReasons == null) {
            sMBIndustryVerificationInfo.blockedReasons = new ArrayList();
        }
        if (roomCreateInfo2.createRoomCopyrightGeoBlockList == null) {
            roomCreateInfo2.createRoomCopyrightGeoBlockList = new ArrayList();
        }
        Map<Integer, LiveGoLivePageContainer> map3 = roomCreateInfo2.modeGoLivePageContainers;
        if (map3 == null) {
            roomCreateInfo2.modeGoLivePageContainers = new HashMap();
            return;
        }
        if (map3.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Integer, LiveGoLivePageContainer>> it6 = roomCreateInfo2.modeGoLivePageContainers.entrySet().iterator();
        while (it6.hasNext()) {
            LiveGoLivePageContainer value3 = it6.next().getValue();
            if (value3 != null) {
                _LiveGoLivePageContainer_ProtoDecoder.LJ(value3);
            }
        }
    }

    @Override // X.C0IMD
    public final RoomCreateInfo LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RoomCreateInfo roomCreateInfo = new RoomCreateInfo();
        roomCreateInfo.notifyQuotaConfig = new HashMap();
        roomCreateInfo.perceptionMessages = new ArrayList();
        roomCreateInfo.popInfoList = new ArrayList();
        roomCreateInfo.reminderWordStatus = new ArrayList();
        roomCreateInfo.adminEcShowPermission = new HashMap();
        roomCreateInfo.createRoomCopyrightGeoBlockList = new ArrayList();
        roomCreateInfo.modeGoLivePageContainers = new HashMap();
        roomCreateInfo.pushStreamInfoMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Object objValueOf = null;
                switch (iLJI) {
                    case 1:
                        roomCreateInfo.mCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        roomCreateInfo.mCoverAuditStatus = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        roomCreateInfo.mTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        roomCreateInfo.mPrompt = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        roomCreateInfo.mAnchorPromptType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 14:
                    case 15:
                    case 16:
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    case 21:
                    case 35:
                    case 40:
                    case 41:
                    case 42:
                    case BaseNotice.CREATOR /* 62 */:
                    case 64:
                    case 68:
                    case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                    case 86:
                    case 93:
                    case 99:
                    case 101:
                    case 103:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 7:
                        roomCreateInfo.mIsFirstBroadcastFlag = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        roomCreateInfo.mAdditionalPrompt = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        roomCreateInfo.donationSticker = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 19:
                        roomCreateInfo.mLastRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case 22:
                        roomCreateInfo.blockStatus = _BlockStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 23:
                        roomCreateInfo.mLiveEventInfo = _LiveEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        roomCreateInfo.live_house_status = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 25:
                        roomCreateInfo.hashtag = _Hashtag_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 26:
                        roomCreateInfo.useAvatarAsCover = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 27:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        PushStreamInfo pushStreamInfoLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        pushStreamInfoLIZLLL = _PushStreamInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (objValueOf != null) {
                                    if (pushStreamInfoLIZLLL != null) {
                                        roomCreateInfo.pushStreamInfoMap.put((Long) objValueOf, pushStreamInfoLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 28:
                        roomCreateInfo.showGameTags = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 29:
                        roomCreateInfo.guideStatus = c1516680pZS.LJIIJ();
                        break;
                    case 30:
                        roomCreateInfo.isNewAnchor = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 31:
                        roomCreateInfo.canShowFragment = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 32:
                        roomCreateInfo.hasFragment = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        roomCreateInfo.lastFragment = _GameLiveFragment_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        roomCreateInfo.screenShotCoverStatus = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        roomCreateInfo.blockDetailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 37:
                        roomCreateInfo.perceptionMessage = _CreateInfoPerceptionMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 38:
                        roomCreateInfo.ageRestrictedConfig = _AgeRestrictedConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 39:
                        roomCreateInfo.bannerInfo = _BannerInRoomCollection_BannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 43:
                        roomCreateInfo.gameLiveInfo = _GameLiveInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 44:
                        roomCreateInfo.deviceLevel = c1516680pZS.LJIIJ();
                        break;
                    case 45:
                        roomCreateInfo.punishmentMessage = _CreateInfoPunishmentMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 46:
                        roomCreateInfo.gameLiveConvertInfo = _GameLiveConvertInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 47:
                        roomCreateInfo.roomAuthCustomizablePoll = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 48:
                        roomCreateInfo.enablePinMessage = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 49:
                        roomCreateInfo.roomGiftCount = c1516680pZS.LJIIJJI();
                        break;
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 != -1) {
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ3);
                                if (objValueOf != null) {
                                    if (lValueOf != null) {
                                        roomCreateInfo.adminEcShowPermission.put((Long) objValueOf, lValueOf);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 51:
                        roomCreateInfo.permissionLevelInfo = _PermissionLevelInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 52:
                        roomCreateInfo.perceptionMessages.add(_CreateInfoPerceptionMessage_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 53:
                        roomCreateInfo.coverSource = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 54:
                        roomCreateInfo.liveProInfo = _LiveProInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 55:
                        roomCreateInfo.anchorCanOpenCaption = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 56:
                        roomCreateInfo.voiceTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 57:
                        roomCreateInfo.voiceCover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 58:
                        roomCreateInfo.voiceCoverAuditStatus = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 59:
                        roomCreateInfo.useAvatarAsVoiceCover = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 60:
                        roomCreateInfo.voiceCoverSource = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 61:
                        roomCreateInfo.anchorStarCommentPermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 63:
                        roomCreateInfo.pollOptimizeGroup = c1516680pZS.LJIIJJI();
                        break;
                    case 65:
                        roomCreateInfo.cppBannerInfo = _CppBannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 66:
                        roomCreateInfo.cppAgeVerificationInfo = _CppAgeVerificationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 67:
                        roomCreateInfo.webcastLSAccessStatus = _WebcastLSAccessStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 69:
                        roomCreateInfo.foldBottomArea = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 70:
                        roomCreateInfo.effectActiveLevel = c1516680pZS.LJIIJ();
                        break;
                    case 71:
                        roomCreateInfo.hasGrowthCenter = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 73:
                        roomCreateInfo.growthCenterFirstDisplayText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 74:
                        roomCreateInfo.growthCenterNotFirstDisplayText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 75:
                        roomCreateInfo.hasRecentStream = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 76:
                        roomCreateInfo.hasGameGuessPermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 77:
                        roomCreateInfo.defaultCommentTraySwitch = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 78:
                        roomCreateInfo.showCampaignCenterOpenPage = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 79:
                        roomCreateInfo.showCampaignCenterMorePage = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 80:
                        roomCreateInfo.haveCampaign = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 81:
                        roomCreateInfo.popInfoList.add(_PopMsgContainer_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 82:
                        long jLIZJ4 = c1516680pZS.LIZJ();
                        MsgNotifyQuota msgNotifyQuotaLIZLLL = null;
                        while (true) {
                            int iLJI4 = c1516680pZS.LJI();
                            if (iLJI4 != -1) {
                                if (iLJI4 != 1) {
                                    if (iLJI4 == 2) {
                                        msgNotifyQuotaLIZLLL = _MsgNotifyQuota_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ4);
                                if (objValueOf != null) {
                                    if (msgNotifyQuotaLIZLLL != null) {
                                        roomCreateInfo.notifyQuotaConfig.put((Long) objValueOf, msgNotifyQuotaLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 83:
                        roomCreateInfo.starCommentPermissionSwitch = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 84:
                        roomCreateInfo.starCommentPermissionSwitchOffReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 85:
                        roomCreateInfo.campaignBannerData = _CampaignBannerData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 87:
                        roomCreateInfo.pollTemplateOptimizeGroup = c1516680pZS.LJIIJJI();
                        break;
                    case 88:
                        roomCreateInfo.goLiveEcIconInfo = _GoLiveECIconInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 89:
                        roomCreateInfo.activitiesIconInfo = _ActivitiesIconInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 90:
                        roomCreateInfo.ttsProbationMode = c1516680pZS.LJIIJ();
                        break;
                    case 91:
                        roomCreateInfo.reminderWordStatus.add(_AnchorReminderWordStatus_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 92:
                        roomCreateInfo.avoidConfig = _MsgNotifyComAvoidConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 94:
                        roomCreateInfo.ongoingGoal = _LiveStreamGoal_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 95:
                        roomCreateInfo.multiGuestPlayInfo = _MultiGuestPlayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 96:
                        roomCreateInfo.newAnchorIncentiveBannerData = _NewAnchorIncentiveBannerData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 97:
                        roomCreateInfo.walletRewardsContainerInfo = _WalletRewardsContainerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 98:
                        roomCreateInfo.unifiedBannerData = _UnifiedBannerData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 100:
                        roomCreateInfo.showShoppingManage = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 102:
                        roomCreateInfo.guessingGameInfo = _GuessingGameInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 104:
                        roomCreateInfo.campaignExposureData = _CampaignExposureData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 105:
                        roomCreateInfo.autoShareLiveCardToBulletinBoard = _AutoShareLiveCardToBulletinBoard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 120:
                        roomCreateInfo.liveJourneyBanner = _UnifiedBannerData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 121:
                        roomCreateInfo.goliveLocaleRestricted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 122:
                        roomCreateInfo.roomEventMessageInfo = _RoomEventMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 123:
                        roomCreateInfo.liveManagerEntranceInfo = _LiveManagerEntranceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 124:
                        roomCreateInfo.fragmentRevertSwitch = c1516680pZS.LJIIJ();
                        break;
                    case 125:
                        roomCreateInfo.viewerWishesIconInfo = _RoomCreateInfo_ViewerWishesIconInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 126:
                        roomCreateInfo.playbookBanner = _PlaybookBannerContainer_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 127:
                        roomCreateInfo.subscriptionLiveOpenPageRedDot = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 128:
                        roomCreateInfo.liveGoLivePageContainer = _LiveGoLivePageContainer_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 129:
                        roomCreateInfo.fanClubInfo = _RoomCreateInfo_FanClubInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 130:
                        roomCreateInfo.ecomGrowthLineBanner = _UnifiedBannerData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 131:
                        roomCreateInfo.liveGoalRewardPremission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 132:
                        roomCreateInfo.hasTtlsLivePermission = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 133:
                        roomCreateInfo.isEnigma = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 134:
                        roomCreateInfo.canStrongReachAutoPostLiving = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 135:
                        roomCreateInfo.smbVerificationWarningInfo = _VerificationWarningInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 136:
                        roomCreateInfo.smbVerification = _RoomCreateInfo_SMBVerification_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 137:
                        roomCreateInfo.showVoiceChatGuide = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 138:
                        roomCreateInfo.isLocationOldButtonOpen = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 139:
                        roomCreateInfo.createRoomCopyrightGeoBlockList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 140:
                        long jLIZJ5 = c1516680pZS.LIZJ();
                        LiveGoLivePageContainer liveGoLivePageContainerLIZLLL = null;
                        while (true) {
                            int iLJI5 = c1516680pZS.LJI();
                            if (iLJI5 != -1) {
                                if (iLJI5 != 1) {
                                    if (iLJI5 == 2) {
                                        liveGoLivePageContainerLIZLLL = _LiveGoLivePageContainer_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    objValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ5);
                                if (objValueOf != null) {
                                    if (liveGoLivePageContainerLIZLLL != null) {
                                        roomCreateInfo.modeGoLivePageContainers.put((Integer) objValueOf, liveGoLivePageContainerLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 141:
                        roomCreateInfo.sellerPreLiveExpGroup = c1516680pZS.LJIIJ();
                        break;
                    case 142:
                        roomCreateInfo.streamTranslationState = c1516680pZS.LJIIJ();
                        break;
                    case 143:
                        roomCreateInfo.lsShowMobileViewGuide = C1516700pZU.LIZ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomCreateInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomCreateInfo roomCreateInfo, List list) {
    }
}
