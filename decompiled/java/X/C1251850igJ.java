package X;

import com.bytedance.android.livesdk.livesetting.watchlive.ProfileLiveEntranceExperiment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BizAddress;
import com.ss.android.ugc.aweme.commerce.BizContactInfo;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.OriginalMusician;
import com.ss.android.ugc.aweme.profile.model.AccountLabelInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfoWithCategory;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import com.ss.android.ugc.aweme.profile.model.BATab;
import com.ss.android.ugc.aweme.profile.model.Describe;
import com.ss.android.ugc.aweme.profile.model.FavoriteTab;
import com.ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.ss.android.ugc.aweme.profile.model.Icon;
import com.ss.android.ugc.aweme.profile.model.IconImageModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.MusicTabClaimInfo;
import com.ss.android.ugc.aweme.profile.model.MusicTabInfo;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.RepostTab;
import com.ss.android.ugc.aweme.profile.model.ShopTab;
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.profile.model.UserNowPackStruct;
import com.ss.android.ugc.aweme.profile.model.UserProfileActivityGuide;
import com.ss.android.ugc.aweme.profile.model.UserProfileActivityGuideKt;
import com.ss.android.ugc.aweme.profile.model.UserProfileGuide;
import com.ss.android.ugc.aweme.profile.model.UserProfileGuideDataV2;
import com.ss.android.ugc.aweme.profile.story.ProfileStoryNote;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager;
import com.ss.android.ugc.profile.business.ad.platform.BioAddressData;
import com.ss.android.ugc.profile.business.ad.platform.BioContactData;
import com.ss.android.ugc.profile.business.ad.platform.BioDownloadData;
import com.ss.android.ugc.profile.business.ad.platform.BioEmailData;
import com.ss.android.ugc.profile.business.avatar.data.AvatarNormalData;
import com.ss.android.ugc.profile.business.ur.platform.AddFriendsData;
import com.ss.android.ugc.profile.business.ur.platform.AdvancedOrderData;
import com.ss.android.ugc.profile.business.ur.platform.BioRelationLabelData;
import com.ss.android.ugc.profile.business.ur.platform.EditProfileData;
import com.ss.android.ugc.profile.platform.base.data.Avatar;
import com.ss.android.ugc.profile.platform.base.data.Legacy;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgBizData;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgVideoInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.data.UserStaticsInfo;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialConnect;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialEntranceData;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AFwS341S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0igJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251850igJ {
    public static n LIZIZ;
    public static n LIZJ;
    public static boolean LJFF;
    public static final C1251850igJ LIZ = new C1251850igJ();
    public static final AFwS303S0000000_19 LIZLLL = AFwS303S0000000_19.get$arr$(39);
    public static final AFwS341S0000000_19 LJ = AFwS341S0000000_19.get$arr$(8);

    public static void LIZIZ(User user) {
        user.setProfileBackgroundMediaType(0);
        user.setProfileBackgroundImageUrlList(null);
        user.setProfileBackgroundAweme(null);
        user.setProfileBackgroundOffsetRatio(0.5f);
    }

    public static void LJIIZILJ(n nVar) {
        AddFriendsData addFriendsData;
        int iIntValue;
        int iIntValue2;
        Integer newFriendsCount;
        Integer mafRedCount;
        LIZIZ = nVar;
        if (nVar == null) {
            addFriendsData = null;
        } else {
            addFriendsData = (AddFriendsData) C1250210idf.LIZ(nVar.toString(), AddFriendsData.class);
        }
        User curUser = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
        if (addFriendsData != null && (mafRedCount = addFriendsData.getMafRedCount()) != null) {
            iIntValue = mafRedCount.intValue();
        } else {
            iIntValue = 2;
        }
        curUser.mafRedCount = iIntValue;
        if (addFriendsData != null && (newFriendsCount = addFriendsData.getNewFriendsCount()) != null) {
            iIntValue2 = newFriendsCount.intValue();
        } else {
            iIntValue2 = 0;
        }
        curUser.newFriendsCount = iIntValue2;
    }

    public static void LJJJJ(ProfileUser profileUser) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (profileUser == null) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            return;
        }
        ProfileCommonInfo profileCommonInfo = profileUser.common;
        if (profileCommonInfo == null) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            return;
        }
        User curUser = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
        LJJIIZI(profileCommonInfo, curUser, true);
        LJJIL(curUser, profileUser.navBarComponents, true);
        LJJIJIIJIL(curUser, profileUser.headerComponents, true);
        LJJJIL(curUser, profileUser, true);
        C1251390ifZ.LIZ.getClass();
        if (C1251390ifZ.LIZIZ(true)) {
            LJJJ(curUser, profileUser.profileBackground);
        }
        LJJIJL(profileUser.legacy, curUser);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C1250680ieQ.LIZ.getClass();
        C1250680ieQ.LIZLLL(jCurrentTimeMillis2 - jCurrentTimeMillis, "convert_data_new_2_old", true);
    }

    public static void LIZ(n nVar, User user) {
        String strLIZJ;
        String strLIZJ2;
        String strLIZJ3;
        n nVar2 = new n();
        if (C123100dR.LIZ(user.getInsId())) {
            nVar2.LJJIIJ("ins_id", user.getInsId());
        }
        n nVarLJJIJ = nVar.LJJIJ("social_connect");
        String str = "";
        if (nVarLJJIJ == null || (strLIZJ = C2399609ak.LIZJ(nVarLJJIJ, "lemon8_open_id")) == null) {
            strLIZJ = "";
        }
        n nVarLJJIJ2 = nVar.LJJIJ("social_connect");
        if (nVarLJJIJ2 == null || (strLIZJ2 = C2399609ak.LIZJ(nVarLJJIJ2, "lemon8_user_name")) == null) {
            strLIZJ2 = "";
        }
        n nVarLJJIJ3 = nVar.LJJIJ("social_connect");
        if (nVarLJJIJ3 != null && (strLIZJ3 = C2399609ak.LIZJ(nVarLJJIJ3, "lemon8_store_region")) != null) {
            str = strLIZJ3;
        }
        nVar2.LJJIIJ("lemon8_open_id", strLIZJ);
        nVar2.LJJIIJ("lemon8_user_name", strLIZJ2);
        nVar2.LJJIIJ("lemon8_store_region", str);
        user.setLemon8OpenId(strLIZJ);
        user.setLemon8UserName(strLIZJ2);
        user.setLemon8StoreRegion(str);
        if (C123100dR.LIZ(user.getYoutubeChannelId())) {
            nVar2.LJJIIJ("youtube_channel_id", user.getYoutubeChannelId());
        }
        if (C123100dR.LIZ(user.getYoutubeChannelTitle())) {
            nVar2.LJJIIJ("youtube_channel_title", user.getYoutubeChannelTitle());
        }
        if (C123100dR.LIZ(user.getTwitterId())) {
            nVar2.LJJIIJ("twitter_id", user.getTwitterId());
        }
        if (C123100dR.LIZ(user.getTwitterName())) {
            nVar2.LJJIIJ("twitter_name", user.getTwitterName());
        }
        nVar.LJJIJL("social_connect");
        nVar.LJJIFFI("social_connect", nVar2);
    }

    public static boolean LIZLLL(Field field, Field field2) {
        if (Intrinsics.LJFF(field.getType(), Integer.class) && Intrinsics.LJFF(field2.getType().getSimpleName(), "int")) {
            return true;
        }
        if ((Intrinsics.LJFF(field.getType(), Character.class) && Intrinsics.LJFF(field2.getType().getSimpleName(), "char")) || Intrinsics.LJFF(field2.getType(), field.getType()) || u.LJIJI(field2.getType().getSimpleName(), field.getType().getSimpleName(), true)) {
            return true;
        }
        return false;
    }

    public static void LJ(n nVar, User user) {
        LIZIZ = nVar;
        if (nVar != null) {
            if (user.getTabSetting() == null) {
                user.setTabSetting(new TabSetting());
            }
            if (user.getTabSetting().shopTab == null) {
                user.getTabSetting().shopTab = new ShopTab();
            }
            C1251850igJ c1251850igJ = LIZ;
            AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(user, 696);
            c1251850igJ.getClass();
            LIZJ(nVar, "shop_schema", String.class, awS598S0100000_19);
            LIZJ(nVar, "shop_schema_v2", String.class, new AwS598S0100000_19(user, 697));
            LIZJ(nVar, "show_red_dot", Boolean.TYPE, new AwS598S0100000_19(user, 698));
        }
    }

    public static void LJIIL(n nVar, String str) {
        n nVar2;
        k kVarLJJIIZ;
        String strLJIL;
        n nVar3;
        k kVarLJJIIZ2;
        String strLJIL2;
        LIZJ = nVar;
        if (str != null) {
            n nVar4 = new n();
            nVar4.LJJIIJ("text", str);
            k kVarLJJIIZ3 = nVar.LJJIIZ("describe");
            if ((kVarLJJIIZ3 instanceof n) && (nVar3 = (n) kVarLJJIIZ3) != null && (kVarLJJIIZ2 = nVar3.LJJIIZ("text_color")) != null && (strLJIL2 = kVarLJJIIZ2.LJIL()) != null) {
                nVar4.LJJIIJ("text_color", strLJIL2);
            }
            k kVarLJJIIZ4 = nVar.LJJIIZ("describe");
            if ((kVarLJJIIZ4 instanceof n) && (nVar2 = (n) kVarLJJIIZ4) != null && (kVarLJJIIZ = nVar2.LJJIIZ("text_font")) != null && (strLJIL = kVarLJJIIZ.LJIL()) != null) {
                nVar4.LJJIIJ("text_font", strLJIL);
            }
            LIZ.getClass();
            LJJIIJZLJL(nVar, "describe", nVar4, false);
        }
    }

    public static void LJIILL(User user, ProfileComponents profileComponents) {
        String uri;
        String uri2;
        List<String> urlList;
        List<String> urlList2;
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            ShareInfo shareInfo = user.getShareInfo();
            if (shareInfo == null) {
                shareInfo = new ShareInfo();
            }
            ProfileBadgeStruct profileBadge = user.getProfileBadge();
            if (profileBadge == null) {
                profileBadge = new ProfileBadgeStruct();
            }
            UserNowPackStruct userNowPackStruct = user.getUserNowPackStruct();
            if (userNowPackStruct == null) {
                userNowPackStruct = new UserNowPackStruct(0, 0);
            }
            n nVar2 = new n();
            nVar2.LJJIIJ("share_title", shareInfo.getShareTitle());
            nVar2.LJJIIJ("share_url", shareInfo.getShareUrl());
            nVar2.LJJIIJ("share_desc", shareInfo.getShareDesc());
            LIZ.getClass();
            LJJIIJZLJL(nVar, "share_info", nVar2, false);
            n nVar3 = new n();
            nVar3.LJJIII(profileBadge.getId(), FollowStatusChangeMethod.PARAM_UID);
            nVar3.LJJIIJ("name", profileBadge.getName());
            nVar3.LJJIIJ("description", profileBadge.getDescription());
            nVar3.LJJIIJ("url", profileBadge.getUrl());
            nVar3.LJJII(Boolean.valueOf(profileBadge.getShouldShow()), "should_show");
            LJJIIJZLJL(nVar, "badge_info", nVar3, false);
            n nVar4 = new n();
            nVar4.LJJIII(Integer.valueOf(userNowPackStruct.userNowStatus), "user_now_status");
            nVar4.LJJIII(userNowPackStruct.nowAvatarBadgeStatus, "now_avatar_badge_status");
            LJJIIJZLJL(nVar, "user_now_pack_info", nVar3, false);
            LJJIIJZLJL(nVar, "room_id", Long.valueOf(user.roomId), true);
            if (((Boolean) C256780A4m.LIZ.getValue()).booleanValue()) {
                LJJIIJZLJL(nVar, "room_data", user.roomData, true);
            } else {
                LJJIIJZLJL(nVar, "roomData", user.roomData, true);
            }
            LJJIIJZLJL(nVar, "story_status", Integer.valueOf(user.getStoryStatus()), true);
            n nVar5 = new n();
            StoryNoteDataCollection storyNoteDataCollectionKO = user.storyNoteData;
            if (storyNoteDataCollectionKO != null || (C461720I8s.LJI(user.getUid()) && (storyNoteDataCollectionKO = ((IStoryThoughtMyDataManager) ServiceManager.get().getService(IStoryThoughtMyDataManager.class)).KO(false)) != null)) {
                nVar5.LJJIIJ("text_content", storyNoteDataCollectionKO.text);
                nVar5.LJJIIJ("aweme_id", storyNoteDataCollectionKO.aid);
                n nVar6 = new n();
                UrlModel urlModel = storyNoteDataCollectionKO.animatedAvatarUri;
                if (urlModel != null) {
                    uri = urlModel.getUri();
                } else {
                    uri = null;
                }
                nVar6.LJJIIJ("uri", uri);
                h hVar = new h();
                UrlModel urlModel2 = storyNoteDataCollectionKO.animatedAvatarUri;
                if (urlModel2 != null && (urlList2 = urlModel2.getUrlList()) != null) {
                    Iterator<String> it2 = urlList2.iterator();
                    while (it2.hasNext()) {
                        hVar.LJJIII(it2.next());
                    }
                }
                nVar6.LJJIFFI("url_list", hVar);
                nVar5.LJJIFFI("dynamic_avatar_url", nVar6);
                h hVar2 = new h();
                List<RichTextInfo> list = storyNoteDataCollectionKO.richText;
                if (list != null) {
                    for (RichTextInfo richTextInfo : list) {
                        n nVar7 = new n();
                        nVar7.LJJIII(Integer.valueOf(richTextInfo.start), "start");
                        nVar7.LJJIII(Integer.valueOf(richTextInfo.end), "end");
                        h hVar3 = new h();
                        Iterator<Integer> it3 = richTextInfo.gradientColors.iterator();
                        while (it3.hasNext()) {
                            hVar3.LJJII(Integer.valueOf(it3.next().intValue()));
                        }
                        nVar7.LJJIFFI("gradient_colors", hVar3);
                        hVar2.LJJIFFI(nVar7);
                    }
                }
                nVar5.LJJIFFI("rich_text", hVar2);
                nVar5.LJJIII(storyNoteDataCollectionKO.avatarThoughtType, "avatar_thought_type");
                h hVar4 = new h();
                List<String> list2 = storyNoteDataCollectionKO.avatarSecondaryUrlList;
                if (list2 != null) {
                    Iterator<String> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        hVar4.LJJIII(it4.next());
                    }
                }
                nVar5.LJJIFFI("avatar_img_url", hVar4);
                if (C298620BnA.LIZ()) {
                    h hVar5 = new h();
                    List<StoryNoteTextExtra> list3 = storyNoteDataCollectionKO.textExtras;
                    if (list3 != null) {
                        for (StoryNoteTextExtra storyNoteTextExtra : list3) {
                            n nVar8 = new n();
                            nVar8.LJJIII(storyNoteTextExtra.type, "type");
                            nVar8.LJJIII(storyNoteTextExtra.start, "start");
                            nVar8.LJJIII(storyNoteTextExtra.end, "end");
                            nVar8.LJJIIJ("uid", storyNoteTextExtra.userId);
                            nVar8.LJJIIJ("sec_uid", storyNoteTextExtra.secUid);
                            nVar8.LJJIIJ("nickname", storyNoteTextExtra.nickname);
                            n nVar9 = new n();
                            UrlModel urlModel3 = storyNoteTextExtra.avatar;
                            if (urlModel3 != null) {
                                uri2 = urlModel3.getUri();
                            } else {
                                uri2 = null;
                            }
                            nVar9.LJJIIJ("uri", uri2);
                            h hVar6 = new h();
                            UrlModel urlModel4 = storyNoteTextExtra.avatar;
                            if (urlModel4 != null && (urlList = urlModel4.getUrlList()) != null) {
                                Iterator<String> it5 = urlList.iterator();
                                while (it5.hasNext()) {
                                    hVar6.LJJIII(it5.next());
                                }
                            }
                            nVar9.LJJIFFI("url_list", hVar6);
                            nVar8.LJJIFFI("avatar_url", nVar9);
                            hVar5.LJJIFFI(nVar8);
                        }
                    }
                    nVar5.LJJIFFI("text_extra", hVar5);
                }
            }
            LIZ.getClass();
            LJJIIJZLJL(nVar, "story_note_bubble", nVar5, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJ(com.google.gson.n r3, com.ss.android.ugc.aweme.profile.model.User r4) {
        /*
            X.C1251850igJ.LIZIZ = r3
            r2 = 0
            if (r3 == 0) goto L7c
            java.lang.String r1 = r3.toString()
            java.lang.Class<com.ss.android.ugc.profile.business.creator.monetization.SupportingData> r0 = com.ss.android.ugc.profile.business.creator.monetization.SupportingData.class
            java.lang.Object r0 = X.C1250210idf.LIZ(r1, r0)
            com.ss.android.ugc.profile.business.creator.monetization.SupportingData r0 = (com.ss.android.ugc.profile.business.creator.monetization.SupportingData) r0
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct r0 = r0.getSupportedNonprofit()
        L17:
            r4.setProfileNgoStruct(r0)
            com.ss.android.ugc.aweme.base.share.ShareInfo r0 = r4.getShareInfo()
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.getShareUrl()
            if (r0 == 0) goto L55
            int r0 = r0.length()
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.base.share.ShareInfo r0 = r4.getShareInfo()
            if (r0 == 0) goto L36
            java.lang.String r2 = r0.getShareUrl()
        L36:
            java.lang.String r0 = X.C1375500ltk.LIZJ(r2)
            if (r0 == 0) goto L48
            java.lang.String r0 = X.C1375500ltk.LJ(r0)
            if (r0 == 0) goto L48
            java.lang.String r1 = X.C1375500ltk.LJFF(r0)
            if (r1 != 0) goto L4a
        L48:
            java.lang.String r1 = ""
        L4a:
            X.0igJ r0 = X.C1251850igJ.LIZ
            r0.getClass()
            java.lang.String r0 = "profile_share_url"
            LJI(r3, r1, r0)
            return
        L55:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "tiktok.com/@"
            r1.append(r0)
            java.lang.String r0 = r4.getUniqueId()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = X.C1375500ltk.LIZJ(r0)
            if (r0 == 0) goto L48
            java.lang.String r0 = X.C1375500ltk.LJ(r0)
            if (r0 == 0) goto L48
            java.lang.String r1 = X.C1375500ltk.LJFF(r0)
            if (r1 != 0) goto L4a
            goto L48
        L7c:
            r0 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJIJ(com.google.gson.n, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static void LJIJI(n nVar, User user) {
        AvatarNormalData avatarNormalData;
        UserNowPackStruct userNowPackStruct;
        long jLongValue;
        ShareInfo shareInfo;
        int status;
        UserAllStoryMetadata allStoryMetadata;
        ProfileBadgeStruct profileBadgeStruct;
        ISocialThoughtDataCenterService iSocialThoughtDataCenterServiceLJJIIZI;
        ThoughtInfo thoughtBubble;
        ProfileStoryNote userLatestStoryNote;
        Integer storyStatus;
        String roomData;
        ShareInfo shareInfo2;
        Long roomId;
        LIZIZ = nVar;
        if (nVar != null) {
            try {
                avatarNormalData = (AvatarNormalData) C1250210idf.LIZ(nVar.toString(), AvatarNormalData.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                avatarNormalData = null;
            }
            if (avatarNormalData == null) {
                userNowPackStruct = null;
            } else {
                userNowPackStruct = avatarNormalData.getUserNowPackStruct();
            }
        } else {
            avatarNormalData = null;
            userNowPackStruct = null;
        }
        user.setUserNowPackStruct(userNowPackStruct);
        if (avatarNormalData != null && (roomId = avatarNormalData.getRoomId()) != null) {
            jLongValue = roomId.longValue();
        } else {
            jLongValue = 0;
        }
        user.roomId = jLongValue;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("audience_control_nav_bar_end_more_fix", true)) {
            if (avatarNormalData != null && (shareInfo2 = avatarNormalData.getShareInfo()) != null) {
                user.setShareInfo(shareInfo2);
            }
        } else {
            if (avatarNormalData != null) {
                shareInfo = avatarNormalData.getShareInfo();
            } else {
                shareInfo = null;
            }
            user.setShareInfo(shareInfo);
        }
        IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
        if ((iEcommerceLiveService != null && iEcommerceLiveService.s7()) || ProfileLiveEntranceExperiment.INSTANCE.getValue()) {
            if (avatarNormalData != null) {
                roomData = avatarNormalData.getRoomData();
            } else {
                roomData = null;
            }
            user.roomData = roomData;
        }
        if (avatarNormalData != null && (storyStatus = avatarNormalData.getStoryStatus()) != null) {
            status = storyStatus.intValue();
        } else {
            status = EnumC727130Sff.NULL.getStatus();
        }
        user.setStoryStatus(status);
        if (avatarNormalData != null) {
            allStoryMetadata = avatarNormalData.getAllStoryMetadata();
        } else {
            allStoryMetadata = null;
        }
        user.setAllStoryMetadata(allStoryMetadata);
        if (avatarNormalData != null) {
            Integer activityStatusSetting = avatarNormalData.getActivityStatusSetting();
            if (activityStatusSetting != null) {
                user.activityStatusSetting = activityStatusSetting.intValue();
            }
            profileBadgeStruct = avatarNormalData.getProfileBadgeStruct();
        } else {
            profileBadgeStruct = null;
        }
        user.setProfileBadgeStruct(profileBadgeStruct);
        if (avatarNormalData != null && (userLatestStoryNote = avatarNormalData.getUserLatestStoryNote()) != null) {
            String str = userLatestStoryNote.text;
            String str2 = userLatestStoryNote.aid;
            String uid = user.getUid();
            UrlModel urlModel = userLatestStoryNote.dynamicAvatarUrl;
            List<RichTextInfo> list = userLatestStoryNote.richText;
            Integer num = userLatestStoryNote.avatarThoughtType;
            List<String> list2 = userLatestStoryNote.avatarImgUrl;
            user.storyNoteData = new StoryNoteDataCollection(str, str2, uid, urlModel, list, null, num, list2, list2, null, userLatestStoryNote.textExtras);
        }
        SocialThoughtService socialThoughtService = (SocialThoughtService) PluggableExtentionKt.pluggableSpi$default(SocialThoughtService.class, false, false, false, 14, null);
        if (socialThoughtService != null && (iSocialThoughtDataCenterServiceLJJIIZI = socialThoughtService.LJJIIZI()) != null) {
            String uid2 = user.getUid();
            if (avatarNormalData != null) {
                thoughtBubble = avatarNormalData.getThoughtBubble();
            } else {
                thoughtBubble = null;
            }
            iSocialThoughtDataCenterServiceLJJIIZI.LJIIIZ(uid2, thoughtBubble);
        }
    }

    public static void LJIJJ(n nVar, User user) {
        BioAddressData bioAddressData;
        BizContactInfo bizContactInfo;
        BizAddress bizAddress;
        String latitude;
        String longitude;
        String formattedAddressText;
        String simplifiedAddressText = null;
        if (nVar == null) {
            bioAddressData = null;
        } else {
            bioAddressData = (BioAddressData) C1250210idf.LIZ(nVar.toString(), BioAddressData.class);
        }
        BizAccountInfo bizAccountInfo = user.getBizAccountInfo();
        if (bizAccountInfo != null && (bizContactInfo = bizAccountInfo.getBizContactInfo()) != null && (bizAddress = bizContactInfo.getBizAddress()) != null) {
            if (bioAddressData != null) {
                latitude = bioAddressData.getLatitude();
            } else {
                latitude = null;
            }
            bizAddress.setLatitude(latitude);
            if (bioAddressData != null) {
                longitude = bioAddressData.getLongitude();
            } else {
                longitude = null;
            }
            bizAddress.setLongitude(longitude);
            if (bioAddressData != null) {
                formattedAddressText = bioAddressData.getFormattedAddressText();
            } else {
                formattedAddressText = null;
            }
            bizAddress.setFormattedAddressText(formattedAddressText);
            if (bioAddressData != null) {
                simplifiedAddressText = bioAddressData.getSimplifiedAddressText();
            }
            bizAddress.setSimplifiedAddressText(simplifiedAddressText);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJLI(com.google.gson.n r2, com.ss.android.ugc.aweme.profile.model.User r3) {
        /*
            if (r2 != 0) goto L8
            r0 = 1
            r1 = 0
            if (r0 != 0) goto L14
            if (r2 == 0) goto L14
        L8:
            java.lang.String r1 = r2.toString()
            java.lang.Class<com.ss.android.ugc.profile.business.ad.platform.BioCouponData> r0 = com.ss.android.ugc.profile.business.ad.platform.BioCouponData.class
            java.lang.Object r1 = X.C1250210idf.LIZ(r1, r0)
            com.ss.android.ugc.profile.business.ad.platform.BioCouponData r1 = (com.ss.android.ugc.profile.business.ad.platform.BioCouponData) r1
        L14:
            com.ss.android.ugc.aweme.commerce.BizAccountInfo r0 = r3.getBizAccountInfo()
            if (r0 != 0) goto L22
            com.ss.android.ugc.aweme.commerce.BizAccountInfo r0 = new com.ss.android.ugc.aweme.commerce.BizAccountInfo
            r0.<init>()
            r3.setBizAccountInfo(r0)
        L22:
            com.ss.android.ugc.aweme.commerce.BizAccountInfo r3 = r3.getBizAccountInfo()
            if (r3 == 0) goto L4a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 == 0) goto L47
            java.util.List r0 = r1.getCouponList()
            if (r0 == 0) goto L47
            java.util.Iterator r1 = r0.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L39
        L47:
            r3.setCouponInfo(r2)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJIJJLI(com.google.gson.n, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static void LJIL(n nVar, User user) {
        BioDownloadData bioDownloadData;
        String androidDownloadAppLink = null;
        if (nVar == null) {
            bioDownloadData = null;
        } else {
            bioDownloadData = (BioDownloadData) C1250210idf.LIZ(nVar.toString(), BioDownloadData.class);
        }
        BizAccountInfo bizAccountInfo = user.getBizAccountInfo();
        if (bizAccountInfo != null) {
            if (bioDownloadData != null) {
                androidDownloadAppLink = bioDownloadData.getAndroidDownloadAppLink();
            }
            bizAccountInfo.setAndroidDownloadAppLink(androidDownloadAppLink);
        }
    }

    public static void LJJ(n nVar, User user) {
        BioContactData bioContactData;
        BizContactInfo bizContactInfo;
        Boolean bizPhoneEnableCall;
        Boolean bizPhoneEnableText;
        BizContactInfo bizContactInfo2;
        String bizPhone;
        BizContactInfo bizContactInfo3;
        String bizPhone2;
        String type = null;
        if (nVar == null) {
            bioContactData = null;
        } else {
            bioContactData = (BioContactData) C1250210idf.LIZ(nVar.toString(), BioContactData.class);
        }
        BizAccountInfo bizAccountInfo = user.getBizAccountInfo();
        if (bizAccountInfo != null && (bizContactInfo3 = bizAccountInfo.getBizContactInfo()) != null) {
            if (bioContactData != null) {
                bizPhone2 = bioContactData.getBizPhone();
            } else {
                bizPhone2 = null;
            }
            bizContactInfo3.setBizPhone(bizPhone2);
        }
        BizAccountInfo bizAccountInfo2 = user.getBizAccountInfo();
        if (bizAccountInfo2 != null && (bizContactInfo2 = bizAccountInfo2.getBizContactInfo()) != null) {
            if (bioContactData != null) {
                bizPhone = bioContactData.getBizPhone();
            } else {
                bizPhone = null;
            }
            bizContactInfo2.setBizPhone(bizPhone);
        }
        BizAccountInfo bizAccountInfo3 = user.getBizAccountInfo();
        if (bizAccountInfo3 != null && (bizContactInfo = bizAccountInfo3.getBizContactInfo()) != null) {
            if (bioContactData != null) {
                bizPhoneEnableCall = bioContactData.getBizPhoneEnableCall();
            } else {
                bizPhoneEnableCall = null;
            }
            bizContactInfo.setCall(bizPhoneEnableCall);
            if (bioContactData != null) {
                bizPhoneEnableText = bioContactData.getBizPhoneEnableText();
            } else {
                bizPhoneEnableText = null;
            }
            bizContactInfo.setText(bizPhoneEnableText);
            if (bioContactData != null) {
                type = bioContactData.getType();
            }
            bizContactInfo.setType(type);
        }
    }

    public static void LJJI(n nVar, User user) {
        BioEmailData bioEmailData;
        String bioEmail = null;
        if (nVar != null && (bioEmailData = (BioEmailData) C1250210idf.LIZ(nVar.toString(), BioEmailData.class)) != null) {
            bioEmail = bioEmailData.getBioEmail();
        }
        user.setBioEmail(bioEmail);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIFFI(com.google.gson.n r3, com.ss.android.ugc.aweme.profile.model.User r4) {
        /*
            r2 = 0
            if (r3 != 0) goto L27
            r0 = r2
        L4:
            r1 = r2
        L5:
            r4.setBioUrl(r1)
            if (r0 == 0) goto Le
            java.lang.String r2 = r0.getBioSecureUrl()
        Le:
            r4.setBioSecureUrl(r2)
            com.ss.android.ugc.aweme.profile.model.ProfileUserExperiments r1 = r4.profileUserExperiments
            if (r1 == 0) goto L24
            if (r0 == 0) goto L25
            java.lang.Integer r0 = r0.getBlockLinkJump()
            if (r0 == 0) goto L25
            int r0 = r0.intValue()
        L21:
            r1.setCanShowEntrance(r0)
        L24:
            return
        L25:
            r0 = 0
            goto L21
        L27:
            java.lang.String r1 = r3.toString()
            java.lang.Class<com.ss.android.ugc.profile.business.ur.platform.BioLinkData> r0 = com.ss.android.ugc.profile.business.ur.platform.BioLinkData.class
            java.lang.Object r0 = X.C1250210idf.LIZ(r1, r0)
            com.ss.android.ugc.profile.business.ur.platform.BioLinkData r0 = (com.ss.android.ugc.profile.business.ur.platform.BioLinkData) r0
            if (r0 == 0) goto L4
            java.lang.String r1 = r0.getBioUrl()
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJJIFFI(com.google.gson.n, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static void LJJII(n nVar, User user) {
        BioRelationLabelData bioRelationLabelData;
        MatchedFriendStruct matchedFriend;
        if (nVar != null && (bioRelationLabelData = (BioRelationLabelData) C1250210idf.LIZ(nVar.toString(), BioRelationLabelData.class)) != null && (matchedFriend = bioRelationLabelData.getMatchedFriend()) != null) {
            user.setMatchedFriendStruct(matchedFriend);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIII(com.google.gson.n r6, com.ss.android.ugc.aweme.profile.model.User r7) {
        /*
            r5 = 0
            if (r6 == 0) goto L4f
            java.lang.String r1 = r6.toString()
            java.lang.Class<com.ss.android.ugc.profile.business.profile.ProfileBioLinkData> r0 = com.ss.android.ugc.profile.business.profile.ProfileBioLinkData.class
            java.lang.Object r6 = X.C1250210idf.LIZ(r1, r0)
            com.ss.android.ugc.profile.business.profile.ProfileBioLinkData r6 = (com.ss.android.ugc.profile.business.profile.ProfileBioLinkData) r6
            if (r6 == 0) goto L50
            java.util.List r1 = r6.getProfileLinks()
            if (r1 == 0) goto L50
            X.0igJ r0 = X.C1251850igJ.LIZ
            r0.getClass()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r3 = r1.iterator()
        L25:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.profile.business.profile.ProfileLinkData r1 = (com.ss.android.ugc.profile.business.profile.ProfileLinkData) r1
            java.lang.Integer r0 = r1.getProfileLinkId()
            if (r0 == 0) goto L25
            int r2 = r0.intValue()
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r1.getText()
            if (r0 == 0) goto L25
            java.lang.String r1 = r0.getRemoteText()
            if (r1 == 0) goto L25
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4.put(r0, r1)
            goto L25
        L4f:
            r6 = r5
        L50:
            r4 = r5
        L51:
            r7.setProfileLinksMap(r4)
            if (r6 == 0) goto L87
            java.util.List r0 = r6.getProfileLinks()
            if (r0 == 0) goto L87
            java.util.Iterator r4 = r0.iterator()
        L60:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.ss.android.ugc.profile.business.profile.ProfileLinkData r0 = (com.ss.android.ugc.profile.business.profile.ProfileLinkData) r0
            java.lang.Integer r2 = r0.getProfileLinkId()
            X.0hlp r0 = X.EnumC1216830hlp.LEMON8
            int r1 = r0.getType()
            if (r2 == 0) goto L60
            int r0 = r2.intValue()
            if (r0 != r1) goto L60
        L7f:
            com.ss.android.ugc.profile.business.profile.ProfileLinkData r3 = (com.ss.android.ugc.profile.business.profile.ProfileLinkData) r3
            if (r3 == 0) goto L87
            java.lang.String r5 = r3.getLemonOpenId()
        L87:
            r7.setLemon8OpenId(r5)
            return
        L8b:
            r3 = r5
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJJIII(com.google.gson.n, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092 A[PHI: r1
      0x0092: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v10 java.lang.String) binds: [B:45:0x008f, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIJ(com.google.gson.n r8, com.ss.android.ugc.aweme.profile.model.User r9) {
        /*
            r6 = 0
            if (r8 == 0) goto L94
            java.lang.String r1 = r8.toString()
            java.lang.Class<com.ss.android.ugc.profile.business.ur.platform.BioSchoolData> r0 = com.ss.android.ugc.profile.business.ur.platform.BioSchoolData.class
            java.lang.Object r8 = X.C1250210idf.LIZ(r1, r0)
            com.ss.android.ugc.profile.business.ur.platform.BioSchoolData r8 = (com.ss.android.ugc.profile.business.ur.platform.BioSchoolData) r8
            if (r8 == 0) goto L95
            com.ss.android.ugc.profile.business.ur.platform.SchoolInfo r0 = r8.getSchoolInfo()
            if (r0 == 0) goto L8e
            java.lang.String r1 = r0.schoolId
        L19:
            com.ss.android.ugc.profile.business.ur.platform.SchoolInfo r0 = r8.getSchoolInfo()
            if (r0 == 0) goto L92
            java.lang.String r0 = r0.schoolName
        L21:
            if (r1 == 0) goto L95
            if (r0 == 0) goto L95
            X.0DHZ r7 = new X.0DHZ
            r7.<init>(r0, r1)
        L2a:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            if (r1 == 0) goto L8c
            java.lang.Class<com.ss.android.ugc.ur.school.service.UserCampusService> r0 = com.ss.android.ugc.ur.school.service.UserCampusService.class
            java.lang.Object r5 = r1.getService(r0)
            com.ss.android.ugc.ur.school.service.UserCampusService r5 = (com.ss.android.ugc.ur.school.service.UserCampusService) r5
        L38:
            if (r7 == 0) goto L80
            if (r8 == 0) goto L7d
            com.ss.android.ugc.profile.business.ur.platform.SchoolInfo r0 = r8.getSchoolInfo()
            if (r0 == 0) goto L7d
            java.lang.Integer r1 = r0.graduateYear
            if (r1 == 0) goto L7e
            int r0 = r1.intValue()
            if (r0 != 0) goto L7e
        L4c:
            if (r5 == 0) goto L7c
            java.lang.String r4 = r9.getUid()
            X.0DMw r3 = new X.0DMw
            r2 = 0
            if (r8 == 0) goto L70
            com.ss.android.ugc.profile.business.ur.platform.SchoolInfo r0 = r8.getSchoolInfo()
            if (r0 == 0) goto L70
            java.lang.Boolean r1 = r0.enableSchoolGroup
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L70
            X.06uk r0 = X.C1759206uk.LIZ
            boolean r0 = X.C1759206uk.LIZ()
            if (r0 == 0) goto L70
            r2 = 1
        L70:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.<init>(r7, r6, r0)
            X.0DN8 r0 = X.C0DN8.INTO_ALL
            r5.LIZLLL(r4, r3, r0)
        L7c:
            return
        L7d:
            r1 = r6
        L7e:
            r6 = r1
            goto L4c
        L80:
            if (r5 == 0) goto L7c
            java.lang.String r1 = r9.getUid()
            X.0DN8 r0 = X.C0DN8.INTO_ALL
            r5.LIZLLL(r1, r6, r0)
            return
        L8c:
            r5 = r6
            goto L38
        L8e:
            r1 = r6
            if (r8 == 0) goto L92
            goto L19
        L92:
            r0 = r6
            goto L21
        L94:
            r8 = r6
        L95:
            r7 = r6
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJJIIJ(com.google.gson.n, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static void LJJIJ(n nVar, User user) {
        EditProfileData editProfileData;
        int iIntValue;
        int iIntValue2;
        List<Integer> profileLinkOrderList;
        List<AdvancedOrderData> advancedOrderList;
        List<AdvancedOrderData> advancedOrderList2;
        Boolean hideLemon8EditLink;
        Integer lemon8ProfileSettings;
        Integer lemon8AccountType;
        LIZIZ = nVar;
        ArrayList arrayList = null;
        if (nVar == null) {
            editProfileData = null;
        } else {
            editProfileData = (EditProfileData) C1250210idf.LIZ(nVar.toString(), EditProfileData.class);
        }
        boolean zBooleanValue = false;
        if (editProfileData != null && (lemon8AccountType = editProfileData.getLemon8AccountType()) != null) {
            iIntValue = lemon8AccountType.intValue();
        } else {
            iIntValue = 0;
        }
        user.setLemon8AccountType(iIntValue);
        if (editProfileData != null && (lemon8ProfileSettings = editProfileData.getLemon8ProfileSettings()) != null) {
            iIntValue2 = lemon8ProfileSettings.intValue();
        } else {
            iIntValue2 = 0;
        }
        user.setLemon8ProfileSettings(iIntValue2);
        if (editProfileData != null) {
            profileLinkOrderList = editProfileData.getProfileLinkOrderList();
        } else {
            profileLinkOrderList = null;
        }
        user.setProfileLinkOrderList(profileLinkOrderList);
        if (editProfileData != null && (hideLemon8EditLink = editProfileData.getHideLemon8EditLink()) != null) {
            zBooleanValue = hideLemon8EditLink.booleanValue();
        }
        user.setHideLemon8EditLink(zBooleanValue);
        if (editProfileData != null && (advancedOrderList2 = editProfileData.getAdvancedOrderList()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(advancedOrderList2, 10));
            Iterator<AdvancedOrderData> it2 = advancedOrderList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getFeatureId());
            }
        }
        user.setMoreAdvancedFeaturesOrder(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (editProfileData != null && (advancedOrderList = editProfileData.getAdvancedOrderList()) != null) {
            for (AdvancedOrderData advancedOrderData : advancedOrderList) {
                if (advancedOrderData.getFeatureId() != null && C123100dR.LIZ(advancedOrderData.getName())) {
                    linkedHashMap.put(advancedOrderData.getFeatureId(), advancedOrderData.getName());
                }
            }
        }
        user.setMoreAdvancedFeatureTextMap(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJIIJI(com.google.gson.n r3, com.ss.android.ugc.aweme.profile.model.User r4) {
        /*
            X.C1251850igJ.LIZIZ = r3
            r2 = 0
            if (r3 != 0) goto L1e
            r0 = r2
        L6:
            r1 = r2
        L7:
            r4.setCanMessageFollowStatusList(r1)
            if (r0 == 0) goto L10
            java.util.List r2 = r0.getNewMessageInInboxFollowStatusList()
        L10:
            r4.setNewMessageInInboxFollowStatusList(r2)
            if (r0 == 0) goto L1c
            boolean r0 = r0.isShowMessageEntrance()
        L19:
            r4.isShowMessageEntrance = r0
            return
        L1c:
            r0 = 0
            goto L19
        L1e:
            java.lang.String r1 = r3.toString()
            java.lang.Class<com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialInteractionData> r0 = com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialInteractionData.class
            java.lang.Object r0 = X.C1250210idf.LIZ(r1, r0)
            com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialInteractionData r0 = (com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialInteractionData) r0
            if (r0 == 0) goto L6
            java.util.List r1 = r0.getCanMessageFollowStatusList()
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJJIJIIJI(com.google.gson.n, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static void LJJIJL(Legacy legacy, User user) {
        if (legacy == null) {
            return;
        }
        try {
            for (Field field : Legacy.class.getDeclaredFields()) {
                for (Field field2 : user.getClass().getDeclaredFields()) {
                    if (Intrinsics.LJFF(field.getName(), field2.getName())) {
                        LIZ.getClass();
                        if (LIZLLL(field, field2)) {
                            field2.setAccessible(true);
                            field.setAccessible(true);
                            field2.set(user, field.get(legacy));
                        }
                    }
                }
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("after adapter User: ");
            sbLIZ.append(C1250210idf.LIZIZ(user));
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            String message = th.getMessage();
            if (message == null) {
                message = "updateLegacyInfo exception";
            }
            c1250680ieQ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("profile_attributes", C1250680ieQ.LJIIJJI);
            c2344009Gk.LJIIIIZZ("report_scene", "profile_legacy_to_user_error");
            c2344009Gk.LJIIIIZZ("error_msg", message);
            C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJLIJ(com.google.gson.n r5, com.ss.android.ugc.aweme.profile.model.User r6) {
        /*
            X.C1251850igJ.LIZIZ = r5
            r2 = 0
            if (r5 != 0) goto L5e
            r0 = r2
        L6:
            r1 = r2
        L7:
            r6.setCanMessageFollowStatusList(r1)
            if (r0 == 0) goto L10
            java.util.List r2 = r0.getNewMessageInInboxFollowStatusList()
        L10:
            r6.setNewMessageInInboxFollowStatusList(r2)
            if (r0 == 0) goto L5c
            boolean r1 = r0.isShowMessageEntrance()
        L19:
            r6.isShowMessageEntrance = r1
            java.lang.String r5 = r6.getUid()
            if (r0 == 0) goto L5b
            com.ss.android.ugc.profile.business.message.IMUserTags r1 = r0.getUserTags()
            if (r1 == 0) goto L5b
            X.1BFw r0 = com.ss.android.ugc.aweme.im.contacts.api.model.IMUser.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r4 = X.C2201941BFw.LIZJ(r6)
            java.util.List<java.lang.Integer> r3 = r1.baTags
            if (r3 != 0) goto L36
            X.13BV r3 = X.C13BV.INSTANCE
        L36:
            java.util.List<java.lang.Integer> r2 = r1.oaTags
            if (r2 != 0) goto L3c
            X.13BV r2 = X.C13BV.INSTANCE
        L3c:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r0 = "ba"
            r1.put(r0, r3)
            java.lang.String r0 = "oa"
            r1.put(r0, r2)
            X.069P r0 = com.ss.android.ugc.aweme.im.contacts.api.IMContactApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.contacts.api.IMContactApi r0 = X.C069P.LIZ()
            X.1BGS r0 = r0.LJ()
            r0.LJJ(r5, r1, r4)
        L5b:
            return
        L5c:
            r1 = 0
            goto L19
        L5e:
            java.lang.String r1 = r5.toString()
            java.lang.Class<com.ss.android.ugc.profile.business.message.MessageData> r0 = com.ss.android.ugc.profile.business.message.MessageData.class
            java.lang.Object r0 = X.C1250210idf.LIZ(r1, r0)
            com.ss.android.ugc.profile.business.message.MessageData r0 = (com.ss.android.ugc.profile.business.message.MessageData) r0
            if (r0 == 0) goto L6
            java.util.List r1 = r0.getCanMessageFollowStatusList()
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJJIJLIJ(com.google.gson.n, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static User LJJIZ(User user, ProfileUser profileUser) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (profileUser == null) {
            return user;
        }
        if (user == null) {
            user = new User();
        }
        LJJIIZI(profileUser.common, user, false);
        LJJIL(user, profileUser.navBarComponents, false);
        LJJIJIIJIL(user, profileUser.headerComponents, false);
        LJJJIL(user, profileUser, false);
        C1251390ifZ.LIZ.getClass();
        if (C1251390ifZ.LIZIZ(false)) {
            LJJJ(user, profileUser.profileBackground);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C1250680ieQ.LIZ.getClass();
        C1250680ieQ.LIZLLL(jCurrentTimeMillis2 - jCurrentTimeMillis, "convert_data_new_2_old", false);
        return user;
    }

    public static void LJJJ(User user, ProfileComponents profileComponents) {
        n nVar;
        Object c098200Yq;
        ProfileBgInfo profileBgInfo;
        float offsetYRatio;
        Aweme awemeInfo = null;
        if (profileComponents != null && (nVar = profileComponents.bizData) != null && !(nVar instanceof m)) {
            try {
                c098200Yq = (ProfileBgBizData) C1250210idf.LIZ(C1250210idf.LIZIZ(nVar), ProfileBgBizData.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            ProfileBgBizData profileBgBizData = (ProfileBgBizData) c098200Yq;
            if (profileBgBizData != null && (profileBgInfo = profileBgBizData.getProfileBgInfo()) != null) {
                LIZ.getClass();
                if (!profileBgInfo.hasBackground()) {
                    LIZIZ(user);
                    return;
                }
                user.setProfileBackgroundMediaType(profileBgInfo.getMediaType());
                user.setProfileBackgroundImageUrlList(profileBgInfo.getImageUrlList());
                ProfileBgVideoInfo videoInfo = profileBgInfo.getVideoInfo();
                if (videoInfo != null) {
                    offsetYRatio = videoInfo.getOffsetYRatio();
                } else {
                    offsetYRatio = 0.5f;
                }
                user.setProfileBackgroundOffsetRatio(offsetYRatio);
                ProfileBgVideoInfo videoInfo2 = profileBgInfo.getVideoInfo();
                if (videoInfo2 != null) {
                    awemeInfo = videoInfo2.getAwemeInfo();
                }
                user.setProfileBackgroundAweme(awemeInfo);
                return;
            }
            LIZIZ(user);
            return;
        }
        LIZIZ(user);
    }

    public static void LJJJI(n nVar, User user) {
        SocialEntranceData socialEntranceData;
        String insId;
        String youtubeChannelId;
        String youtubeChannelTitle;
        String twitterId;
        String twitterName;
        String lemon8OpenId;
        String lemon8UserName;
        SocialConnect socialConnect;
        String lemon8StoreRegion;
        SocialConnect socialConnect2;
        SocialConnect socialConnect3;
        SocialConnect socialConnect4;
        SocialConnect socialConnect5;
        SocialConnect socialConnect6;
        SocialConnect socialConnect7;
        SocialConnect socialConnect8;
        LIZIZ = nVar;
        if (nVar == null) {
            socialEntranceData = null;
        } else {
            socialEntranceData = (SocialEntranceData) C1250210idf.LIZ(nVar.toString(), SocialEntranceData.class);
        }
        String str = "";
        if (socialEntranceData == null || (socialConnect8 = socialEntranceData.getSocialConnect()) == null || (insId = socialConnect8.getInsId()) == null) {
            insId = "";
        }
        user.setInsId(insId);
        if (socialEntranceData == null || (socialConnect7 = socialEntranceData.getSocialConnect()) == null || (youtubeChannelId = socialConnect7.getYoutubeChannelId()) == null) {
            youtubeChannelId = "";
        }
        user.setYoutubeChannelId(youtubeChannelId);
        if (socialEntranceData == null || (socialConnect6 = socialEntranceData.getSocialConnect()) == null || (youtubeChannelTitle = socialConnect6.getYoutubeChannelTitle()) == null) {
            youtubeChannelTitle = "";
        }
        user.setYoutubeChannelTitle(youtubeChannelTitle);
        if (socialEntranceData == null || (socialConnect5 = socialEntranceData.getSocialConnect()) == null || (twitterId = socialConnect5.getTwitterId()) == null) {
            twitterId = "";
        }
        user.setTwitterId(twitterId);
        if (socialEntranceData == null || (socialConnect4 = socialEntranceData.getSocialConnect()) == null || (twitterName = socialConnect4.getTwitterName()) == null) {
            twitterName = "";
        }
        user.setTwitterName(twitterName);
        if (socialEntranceData == null || (socialConnect3 = socialEntranceData.getSocialConnect()) == null || (lemon8OpenId = socialConnect3.getLemon8OpenId()) == null) {
            lemon8OpenId = "";
        }
        user.setLemon8OpenId(lemon8OpenId);
        if (socialEntranceData == null || (socialConnect2 = socialEntranceData.getSocialConnect()) == null || (lemon8UserName = socialConnect2.getLemon8UserName()) == null) {
            lemon8UserName = "";
        }
        user.setLemon8UserName(lemon8UserName);
        if (socialEntranceData != null && (socialConnect = socialEntranceData.getSocialConnect()) != null && (lemon8StoreRegion = socialConnect.getLemon8StoreRegion()) != null) {
            str = lemon8StoreRegion;
        }
        user.setLemon8StoreRegion(str);
    }

    public static void LJI(n nVar, String str, String str2) {
        if (C123100dR.LIZ(str) && str != null && nVar != null) {
            nVar.LJJIJL(str2);
            nVar.LJJIIJ(str2, str);
        }
    }

    public static void LJII(String str, ProfileComponents profileComponents, String str2) {
        if (C123100dR.LIZ(str) && str != null) {
            n nVar = profileComponents.bizData;
            if (nVar != null) {
                nVar.LJJIJL(str2);
            }
            n nVar2 = profileComponents.bizData;
            if (nVar2 != null) {
                nVar2.LJJIIJ(str2, str);
            }
        }
    }

    public static void LJIIIIZZ(int i, User user, ProfileComponents profileComponents) {
        n nVar = profileComponents.bizData;
        if (nVar != null && user.getAccountLabelInfos() != null) {
            C1251850igJ c1251850igJ = LIZ;
            List<AccountLabelInfo> accountLabelInfos = user.getAccountLabelInfos();
            c1251850igJ.getClass();
            if (accountLabelInfos != null) {
                for (AccountLabelInfo accountLabelInfo : accountLabelInfos) {
                    if (accountLabelInfo.labelType == i) {
                        LJIIL(nVar, accountLabelInfo.content);
                        LJJIIJZLJL(nVar, "learn_more_url", accountLabelInfo.learnMoreUrl, true);
                        return;
                    }
                }
            }
        }
    }

    public static void LJIIIZ(User user, ProfileComponents profileComponents, boolean z) {
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            String strLIZIZ = null;
            if (C2525309v1.LIZ) {
                List<String> list = user.boldFields;
                if (list != null) {
                    if (z) {
                        if (list.contains("nickname") && user.getNickname() != null) {
                            strLIZIZ = user.getNickname();
                        }
                        List<String> list2 = user.boldFields;
                        if (list2 != null && list2.contains("alias") && C1247000iYU.LIZIZ(user) != null) {
                            strLIZIZ = C1247000iYU.LIZIZ(user);
                        }
                    }
                } else if (z) {
                    return;
                }
                if (user.getNickname() != null) {
                    strLIZIZ = user.getNickname();
                }
                if (C1247000iYU.LIZIZ(user) != null) {
                    strLIZIZ = C1247000iYU.LIZIZ(user);
                }
            } else {
                List<String> list3 = user.boldFields;
                if (list3 == null) {
                    return;
                }
                if (list3.contains("nickname") && user.getNickname() != null) {
                    strLIZIZ = user.getNickname();
                }
                List<String> list4 = user.boldFields;
                if (list4 != null && list4.contains("alias") && C1247000iYU.LIZIZ(user) != null) {
                    strLIZIZ = C1247000iYU.LIZIZ(user);
                }
            }
            if (strLIZIZ != null) {
                n nVar2 = new n();
                nVar2.LJJIIJ("text", strLIZIZ);
                nVar.LJJIJL("describe");
                nVar.LJJIFFI("describe", nVar2);
            }
        }
    }

    public static void LJIIJ(int i, User user, ProfileComponents profileComponents) {
        AccountLabelInfo accountLabelInfo;
        n nVar = profileComponents.bizData;
        if (nVar != null) {
            C1251850igJ c1251850igJ = LIZ;
            List<AccountLabelInfo> accountLabelInfos = user.getAccountLabelInfos();
            c1251850igJ.getClass();
            if (accountLabelInfos != null) {
                Iterator<AccountLabelInfo> it2 = accountLabelInfos.iterator();
                while (it2.hasNext()) {
                    accountLabelInfo = it2.next();
                    if (accountLabelInfo.labelType == i) {
                        break;
                    }
                }
                ArrayList arrayList = new ArrayList();
                accountLabelInfo = new AccountLabelInfo(-1, "", "");
                accountLabelInfo.setLabelType(i);
                arrayList.add(accountLabelInfo);
                user.setAccountLabelInfos(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                accountLabelInfo = new AccountLabelInfo(-1, "", "");
                accountLabelInfo.setLabelType(i);
                arrayList2.add(accountLabelInfo);
                user.setAccountLabelInfos(arrayList2);
            }
            LIZJ(nVar, "learn_more_url", String.class, new AwS598S0100000_19(accountLabelInfo, 743));
            LIZJ(nVar, "describe", n.class, new AwS598S0100000_19(accountLabelInfo, 748));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJIIJJI(User user, ProfileUser profileUser, boolean z) {
        List<? extends ProfileComponents> arrayList;
        Boolean bool;
        Boolean bool2;
        Integer num;
        Integer num2;
        StickerTab stickerTab;
        StickerTab stickerTab2;
        StickerTab stickerTab3;
        StickerTab stickerTab4;
        Boolean showBATab;
        BATab bATab;
        n nVar;
        List<UserProfileGuideDataV2> userProfileGuideV2;
        String remoteIcon;
        String remoteText;
        String remoteText2;
        String remoteText3;
        Integer numValueOf;
        String subTabName;
        FavoriteTab favoriteTab;
        String str;
        List<Long> newReleaseClipIds;
        String str2;
        String str3;
        ShopTab shopTab;
        ShopTab shopTab2;
        ProfileComponents profileComponents = profileUser.tabsComponents;
        if (profileComponents == null) {
            profileComponents = new ProfileComponents();
        }
        profileComponents.componentId = "profile_tab";
        ProfileComponents profileComponents2 = profileUser.tabsComponents;
        if (profileComponents2 == null || (arrayList = profileComponents2.components) == null) {
            arrayList = new ArrayList<>();
        }
        profileComponents.components = arrayList;
        for (ProfileComponents profileComponents3 : arrayList) {
            C1251850igJ c1251850igJ = LIZ;
            n nVar2 = profileComponents3.bizData;
            c1251850igJ.getClass();
            LIZJ = nVar2;
            String str4 = profileComponents3.componentId;
            if (str4 != null) {
                switch (str4.hashCode()) {
                    case -1893890292:
                        if (str4.equals("profile_tab_ecommerce_showcase")) {
                        }
                        break;
                    case -1648586267:
                        if (str4.equals("profile_tab_music")) {
                            n nVar3 = profileComponents3.bizData;
                            if (nVar3 != null) {
                                if (!z) {
                                    n nVar4 = new n();
                                    h hVar = new h();
                                    OriginalMusician originalMusician = user.getOriginalMusician();
                                    if (originalMusician != null && (newReleaseClipIds = originalMusician.getNewReleaseClipIds()) != null) {
                                        Iterator<Long> it2 = newReleaseClipIds.iterator();
                                        while (it2.hasNext()) {
                                            hVar.LJJII(it2.next());
                                        }
                                    }
                                    nVar4.LJJIFFI("new_release_clip_ids", hVar);
                                    nVar4.LJJIII(Long.valueOf(user.getOriginalMusician().getHighlightMusicId()), "highlight_music_id");
                                    LIZ.getClass();
                                    LJJIIJZLJL(nVar3, "original_musician", nVar4, false);
                                    if (user.getShowArtistPlaylist() == 1) {
                                        str = "true";
                                    } else {
                                        str = "false";
                                    }
                                    LJJIIJZLJL(nVar3, "show_artist_playlist", str, true);
                                    MusicTabInfo musicTabInfo = user.getMusicTabInfo();
                                    if (musicTabInfo == null) {
                                        musicTabInfo = new MusicTabInfo(false, false, null);
                                    }
                                    LJJIIJZLJL(nVar3, "show_artist_pick_videos", Boolean.valueOf(musicTabInfo.showArtistPickVideos), true);
                                } else {
                                    MusicTabInfo musicTabInfo2 = user.getMusicTabInfo();
                                    if (musicTabInfo2 == null) {
                                        musicTabInfo2 = new MusicTabInfo(false, false, null);
                                    }
                                    MusicTabClaimInfo musicTabClaimInfo = musicTabInfo2.musicTabClaimInfo;
                                    if (musicTabClaimInfo == null) {
                                        musicTabClaimInfo = new MusicTabClaimInfo(0, "", "", "", "");
                                    }
                                    n nVar5 = new n();
                                    nVar5.LJJIII(Integer.valueOf(musicTabClaimInfo.status), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                    nVar5.LJJIIJ("title", musicTabClaimInfo.title);
                                    nVar5.LJJIIJ("title_key", musicTabClaimInfo.titleKey);
                                    nVar5.LJJIIJ("desc", musicTabClaimInfo.desc);
                                    nVar5.LJJIIJ("desc_key", musicTabClaimInfo.descKey);
                                    LJJIIJZLJL(nVar3, "claim_info", nVar5, false);
                                    LJJIIJZLJL(nVar3, "show_ghost_music_tab", Boolean.valueOf(musicTabInfo2.showGhostMusicTab), true);
                                    LJJIIJZLJL(nVar3, "show_artist_pick_videos", Boolean.valueOf(musicTabInfo2.showArtistPickVideos), true);
                                    GeneralPermission generalPermission = user.getGeneralPermission();
                                    if (generalPermission != null) {
                                        LJJIIJZLJL(nVar3, "original_list", Integer.valueOf(generalPermission.getOriginalList()), true);
                                    }
                                    OriginalMusician originalMusician2 = user.getOriginalMusician();
                                    if (originalMusician2 != null) {
                                        LJJIIJZLJL(nVar3, "new_release_clip_ids", originalMusician2.getNewReleaseClipIds(), true);
                                        LJJIIJZLJL(nVar3, "highlight_music_id", Long.valueOf(originalMusician2.getHighlightMusicId()), true);
                                        LJJIIJZLJL(nVar3, "main_artist_new_release_count", Integer.valueOf(originalMusician2.getMainArtistNewReleaseCount()), true);
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        break;
                    case -53914142:
                        if (str4.equals("profile_tab_ecommerce_store")) {
                        }
                        break;
                    case 124554716:
                        if (str4.equals("profile_tab_favorite")) {
                            n nVar6 = profileComponents3.bizData;
                            if (nVar6 != null) {
                                TabSetting tabSetting = user.getTabSetting();
                                if (tabSetting != null && (favoriteTab = tabSetting.getFavoriteTab()) != null) {
                                    subTabName = favoriteTab.getSubTabName();
                                } else {
                                    subTabName = null;
                                }
                                LJJIIJZLJL(nVar6, "sub_tab_name", subTabName, true);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 600411254:
                        if (!str4.equals("profile_tab_public_post")) {
                            continue;
                        } else if (z && (nVar = profileComponents3.bizData) != null) {
                            if (user.viewerEntranceInfo != null) {
                                List<UserProfileGuide> userProfileGuide = user.getUserProfileGuide();
                                if (userProfileGuide != null) {
                                    h hVar2 = new h();
                                    for (UserProfileGuide userProfileGuide2 : userProfileGuide) {
                                        n nVar7 = new n();
                                        nVar7.LJJIIJ("guide_text", userProfileGuide2.guideContext);
                                        nVar7.LJJIIJ("guide_key", userProfileGuide2.guideContextKeyToReport);
                                        hVar2.LJJIFFI(nVar7);
                                    }
                                    LIZ.getClass();
                                    LJJIIJZLJL(nVar, "user_profile_guide", hVar2, false);
                                }
                                UserProfileActivityGuide userProfileActivityGuide = user.getUserProfileActivityGuide();
                                if (userProfileActivityGuide != null) {
                                    n nVar8 = new n();
                                    nVar8.LJJIIJ("title", userProfileActivityGuide.title);
                                    nVar8.LJJIIJ("description", userProfileActivityGuide.description);
                                    IconImageModel iconImageModel = userProfileActivityGuide.imageUrl;
                                    if (iconImageModel != null) {
                                        nVar8.LJJIFFI("icon", UserProfileActivityGuideKt.toJsonObject(iconImageModel));
                                    }
                                    nVar8.LJJIII(userProfileActivityGuide.deliveryId, "delivery_id");
                                    LIZ.getClass();
                                    LJJIIJZLJL(nVar, "user_profile_activity_guide", nVar8, false);
                                }
                                C1251850igJ c1251850igJ2 = LIZ;
                                UserNowPackStruct userNowPackStruct = user.getUserNowPackStruct();
                                if (userNowPackStruct != null) {
                                    numValueOf = Integer.valueOf(userNowPackStruct.userNowStatus);
                                } else {
                                    numValueOf = null;
                                }
                                c1251850igJ2.getClass();
                                LJJIIJZLJL(nVar, "user_now_status", numValueOf, true);
                            }
                            if (C1EDI.LIZLLL() && (userProfileGuideV2 = user.getUserProfileGuideV2()) != null) {
                                h hVar3 = new h();
                                for (UserProfileGuideDataV2 userProfileGuideDataV2 : userProfileGuideV2) {
                                    n nVar9 = new n();
                                    nVar9.LJJIIJ("guide_name", userProfileGuideDataV2.getName());
                                    n nVar10 = new n();
                                    Icon icon = userProfileGuideDataV2.getIcon();
                                    if (icon != null) {
                                        remoteIcon = icon.getRemoteIcon();
                                    } else {
                                        remoteIcon = null;
                                    }
                                    nVar10.LJJIIJ("icon_key", remoteIcon);
                                    nVar9.LJJIFFI("icon", nVar10);
                                    n nVar11 = new n();
                                    Describe title = userProfileGuideDataV2.getTitle();
                                    if (title != null) {
                                        remoteText = title.getRemoteText();
                                    } else {
                                        remoteText = null;
                                    }
                                    nVar11.LJJIIJ("text", remoteText);
                                    nVar9.LJJIFFI("title", nVar11);
                                    n nVar12 = new n();
                                    Describe subtitle = userProfileGuideDataV2.getSubtitle();
                                    if (subtitle != null) {
                                        remoteText2 = subtitle.getRemoteText();
                                    } else {
                                        remoteText2 = null;
                                    }
                                    nVar11.LJJIIJ("text", remoteText2);
                                    nVar9.LJJIFFI("subtitle", nVar12);
                                    n nVar13 = new n();
                                    Describe buttonName = userProfileGuideDataV2.getButtonName();
                                    if (buttonName != null) {
                                        remoteText3 = buttonName.getRemoteText();
                                    } else {
                                        remoteText3 = null;
                                    }
                                    nVar11.LJJIIJ("text", remoteText3);
                                    nVar9.LJJIFFI("button_name", nVar13);
                                    hVar3.LJJIFFI(nVar9);
                                }
                                LIZ.getClass();
                                LJJIIJZLJL(nVar, "user_profile_guide_v2", hVar3, false);
                            }
                        }
                        break;
                    case 772937582:
                        if (str4.equals("profile_tab_business_page")) {
                            n nVar14 = profileComponents3.bizData;
                            if (nVar14 != null) {
                                if (z) {
                                    TabSetting tabSetting2 = user.getTabSetting();
                                    if (tabSetting2 != null && (bATab = tabSetting2.baTab) != null) {
                                        showBATab = bATab.getShowBATab();
                                    } else {
                                        showBATab = null;
                                    }
                                    LJJIIJZLJL(nVar14, "show_biz_page_tab", showBATab, true);
                                } else {
                                    LJJIIJZLJL(nVar14, "bio_url", user.getBioUrl(), true);
                                    LJJIIJZLJL(nVar14, "bio_secure_url", user.getBioSecureUrl(), true);
                                }
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 1605609247:
                        if (str4.equals("profile_tab_sticker_store")) {
                            n nVar15 = profileComponents3.bizData;
                            if (nVar15 != null) {
                                TabSetting tabSetting3 = user.getTabSetting();
                                if (tabSetting3 != null && (stickerTab4 = tabSetting3.stickerTab) != null) {
                                    bool = stickerTab4.showStickerSetSticker;
                                } else {
                                    bool = null;
                                }
                                LJJIIJZLJL(nVar15, "show_sticker_set_sticker", bool, true);
                                TabSetting tabSetting4 = user.getTabSetting();
                                if (tabSetting4 != null && (stickerTab3 = tabSetting4.stickerTab) != null) {
                                    bool2 = stickerTab3.showVideoSticker;
                                } else {
                                    bool2 = null;
                                }
                                LJJIIJZLJL(nVar15, "show_video_sticker", bool2, true);
                                TabSetting tabSetting5 = user.getTabSetting();
                                if (tabSetting5 != null && (stickerTab2 = tabSetting5.stickerTab) != null) {
                                    num = stickerTab2.stickerSetCount;
                                } else {
                                    num = null;
                                }
                                LJJIIJZLJL(nVar15, "sticker_set_count", num, true);
                                TabSetting tabSetting6 = user.getTabSetting();
                                if (tabSetting6 != null && (stickerTab = tabSetting6.stickerTab) != null) {
                                    num2 = stickerTab.videoStickerCount;
                                } else {
                                    num2 = null;
                                }
                                LJJIIJZLJL(nVar15, "video_sticker_count", num2, true);
                            }
                        } else {
                            continue;
                        }
                        break;
                }
                n nVar16 = profileComponents3.bizData;
                if (nVar16 != null) {
                    TabSetting tabSetting7 = user.getTabSetting();
                    if (tabSetting7 != null && (shopTab2 = tabSetting7.shopTab) != null) {
                        str2 = shopTab2.shopSchemaV2;
                    } else {
                        str2 = null;
                    }
                    LJJIIJZLJL(nVar16, "shop_schema", str2, true);
                    TabSetting tabSetting8 = user.getTabSetting();
                    if (tabSetting8 != null && (shopTab = tabSetting8.shopTab) != null) {
                        str3 = shopTab.shopSchemaV2;
                    } else {
                        str3 = null;
                    }
                    LJJIIJZLJL(nVar16, "shop_schema_v2", str3, true);
                }
            }
        }
        n nVar17 = profileComponents.bizData;
        if (nVar17 == null) {
            nVar17 = new n();
        }
        if (user != null) {
            int i = user.tabType;
            C1251850igJ c1251850igJ3 = LIZ;
            Integer numValueOf2 = Integer.valueOf(i);
            c1251850igJ3.getClass();
            LJJIIJZLJL(nVar17, "default_landing_tab_id", numValueOf2, true);
        }
        profileUser.tabsComponents = profileComponents;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0007, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILLIIL(java.util.List r7, boolean r8, com.ss.android.ugc.aweme.profile.model.User r9) {
        /*
            Method dump skipped, instruction units count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJIILLIIL(java.util.List, boolean, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public static void LJJIIZI(ProfileCommonInfo profileCommonInfo, User user, boolean z) {
        Integer fpBlockByType;
        Boolean boolIsPendingUnblockRequest;
        Boolean boolIsGeoBlocked;
        Boolean boolIsBlocking;
        Boolean boolIsBlocked;
        Integer followerStatus;
        Integer followStatus;
        UserRelationInfo userRelationInfo;
        UserAccountInfo userAccountInfo;
        Integer audienceControlViewerMode;
        Integer friendCount;
        Integer visibleVideosCount;
        Avatar avatar;
        AvatarSizeUrlStruct staticAvatar;
        Avatar avatar2;
        AvatarSizeUrlStruct dynamicSocialAvatar;
        Avatar avatar3;
        AvatarSizeUrlStruct socialAvatarWithoutBackground;
        Avatar avatar4;
        AvatarSizeUrlStruct socialAvatarWithBackground;
        Avatar avatar5;
        List<AvatarMetaInfoWithCategory> avatarMetaInfoList;
        Avatar avatar6;
        AvatarMetaInfo avatarMetaInfo;
        Integer awemeCount;
        Long registerTime;
        Boolean boolIsSecret;
        List<String> boldFields;
        Avatar avatar7;
        String naviId;
        Avatar avatar8;
        UrlModel avatar300;
        Avatar avatar9;
        UrlModel avatarVideoUri;
        Avatar avatar10;
        UrlModel avatarMedium;
        Avatar avatar11;
        UrlModel avatarThumb;
        Avatar avatar12;
        UrlModel avatarLarger;
        Integer banStatus;
        Integer accountType;
        String username;
        String nickname;
        String secUid;
        String uid;
        if (profileCommonInfo != null) {
            UserProfileInfo userProfileInfo = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo != null && (uid = userProfileInfo.getUid()) != null) {
                user.setUid(uid);
            }
            UserProfileInfo userProfileInfo2 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo2 != null && (secUid = userProfileInfo2.getSecUid()) != null) {
                user.setSecUid(secUid);
            }
            UserProfileInfo userProfileInfo3 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo3 != null && (nickname = userProfileInfo3.getNickname()) != null) {
                user.setNickname(nickname);
            }
            UserProfileInfo userProfileInfo4 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo4 != null && (username = userProfileInfo4.getUsername()) != null) {
                user.setUniqueId(username);
            }
        }
        user.setShortId(CardStruct.IStatusCode.DEFAULT);
        if (profileCommonInfo != null) {
            UserAccountInfo userAccountInfo2 = profileCommonInfo.getUserAccountInfo();
            if (userAccountInfo2 != null && (accountType = userAccountInfo2.getAccountType()) != null) {
                user.setAccountType(accountType.intValue());
            }
            UserAccountInfo userAccountInfo3 = profileCommonInfo.getUserAccountInfo();
            if (userAccountInfo3 != null && (banStatus = userAccountInfo3.getBanStatus()) != null) {
                int iIntValue = banStatus.intValue();
                if (user.getGeneralPermission() == null) {
                    user.setGeneralPermission(new GeneralPermission());
                }
                user.getGeneralPermission().setFollowToastType(iIntValue);
            }
            UserProfileInfo userProfileInfo5 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo5 != null && (avatar12 = userProfileInfo5.getAvatar()) != null && (avatarLarger = avatar12.getAvatarLarger()) != null) {
                user.setAvatarLarger(avatarLarger);
            }
            UserProfileInfo userProfileInfo6 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo6 != null && (avatar11 = userProfileInfo6.getAvatar()) != null && (avatarThumb = avatar11.getAvatarThumb()) != null) {
                user.setAvatarThumb(avatarThumb);
            }
            UserProfileInfo userProfileInfo7 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo7 != null && (avatar10 = userProfileInfo7.getAvatar()) != null && (avatarMedium = avatar10.getAvatarMedium()) != null) {
                user.setAvatarMedium(avatarMedium);
            }
            UserProfileInfo userProfileInfo8 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo8 != null && (avatar9 = userProfileInfo8.getAvatar()) != null && (avatarVideoUri = avatar9.getAvatarVideoUri()) != null) {
                user.setAvatarVideoUri(avatarVideoUri);
            }
            UserProfileInfo userProfileInfo9 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo9 != null && (avatar8 = userProfileInfo9.getAvatar()) != null && (avatar300 = avatar8.getAvatar300()) != null) {
                user.setAvatar300(avatar300);
            }
            UserProfileInfo userProfileInfo10 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo10 != null && (avatar7 = userProfileInfo10.getAvatar()) != null && (naviId = avatar7.getNaviId()) != null) {
                user.naviId = naviId;
            }
            UserProfileInfo userProfileInfo11 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo11 != null && (boldFields = userProfileInfo11.getBoldFields()) != null) {
                user.boldFields = boldFields;
            }
            UserAccountInfo userAccountInfo4 = profileCommonInfo.getUserAccountInfo();
            if (userAccountInfo4 != null && (boolIsSecret = userAccountInfo4.isSecret()) != null) {
                boolean zBooleanValue = boolIsSecret.booleanValue();
                user.setSecret(zBooleanValue);
                user.setPrivateAccount(zBooleanValue);
            }
            UserProfileInfo userProfileInfo12 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo12 != null && (registerTime = userProfileInfo12.getRegisterTime()) != null) {
                user.setRegisterTime(registerTime.longValue());
            }
            UserStaticsInfo userStaticsInfo = profileCommonInfo.getUserStaticsInfo();
            if (userStaticsInfo != null && (awemeCount = userStaticsInfo.getAwemeCount()) != null) {
                user.setAwemeCount(awemeCount.intValue());
            }
            UserProfileInfo userProfileInfo13 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo13 != null && (avatar6 = userProfileInfo13.getAvatar()) != null && (avatarMetaInfo = avatar6.getAvatarMetaInfo()) != null) {
                user.setAvatarMeta(avatarMetaInfo);
            }
            UserProfileInfo userProfileInfo14 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo14 != null && (avatar5 = userProfileInfo14.getAvatar()) != null && (avatarMetaInfoList = avatar5.getAvatarMetaInfoList()) != null) {
                user.setAvatarMetaInfoList(avatarMetaInfoList);
            }
            UserProfileInfo userProfileInfo15 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo15 != null && (avatar4 = userProfileInfo15.getAvatar()) != null && (socialAvatarWithBackground = avatar4.getSocialAvatarWithBackground()) != null) {
                user.setSocialAvatarWithBackground(socialAvatarWithBackground);
            }
            UserProfileInfo userProfileInfo16 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo16 != null && (avatar3 = userProfileInfo16.getAvatar()) != null && (socialAvatarWithoutBackground = avatar3.getSocialAvatarWithoutBackground()) != null) {
                user.setSocialAvatarWithoutBackground(socialAvatarWithoutBackground);
            }
            UserProfileInfo userProfileInfo17 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo17 != null && (avatar2 = userProfileInfo17.getAvatar()) != null && (dynamicSocialAvatar = avatar2.getDynamicSocialAvatar()) != null) {
                user.setDynamicSocialAvatar(dynamicSocialAvatar);
            }
            UserProfileInfo userProfileInfo18 = profileCommonInfo.getUserProfileInfo();
            if (userProfileInfo18 != null && (avatar = userProfileInfo18.getAvatar()) != null && (staticAvatar = avatar.getStaticAvatar()) != null) {
                user.setStaticAvatar(staticAvatar);
            }
            UserStaticsInfo userStaticsInfo2 = profileCommonInfo.getUserStaticsInfo();
            if (userStaticsInfo2 != null && (visibleVideosCount = userStaticsInfo2.getVisibleVideosCount()) != null) {
                user.visibleVideosCount = visibleVideosCount.intValue();
            }
        }
        if (((Boolean) C267720AeQ.LIZ.getValue()).booleanValue() && z) {
            if (profileCommonInfo != null) {
                userRelationInfo = profileCommonInfo.getUserRelationInfo();
                if (userRelationInfo != null) {
                    user.setFriendCount(friendCount.intValue());
                }
                userAccountInfo = profileCommonInfo.getUserAccountInfo();
                if (userAccountInfo != null) {
                    user.audienceControlViewerMode = audienceControlViewerMode.intValue();
                    return;
                }
            }
        } else if (profileCommonInfo != null) {
            UserRelationInfo userRelationInfo2 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo2 != null && (followStatus = userRelationInfo2.getFollowStatus()) != null) {
                user.setFollowStatus(followStatus.intValue());
            }
            UserRelationInfo userRelationInfo3 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo3 != null && (followerStatus = userRelationInfo3.getFollowerStatus()) != null) {
                user.setFollowerStatus(followerStatus.intValue());
            }
            UserRelationInfo userRelationInfo4 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo4 != null && (boolIsBlocked = userRelationInfo4.isBlocked()) != null) {
                user.setBlocked(boolIsBlocked.booleanValue());
            }
            UserRelationInfo userRelationInfo5 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo5 != null && (boolIsBlocking = userRelationInfo5.isBlocking()) != null) {
                user.isBlock = boolIsBlocking.booleanValue();
            }
            UserRelationInfo userRelationInfo6 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo6 != null && (boolIsGeoBlocked = userRelationInfo6.isGeoBlocked()) != null) {
                user.setGeoBlocked(boolIsGeoBlocked.booleanValue());
            }
            UserRelationInfo userRelationInfo7 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo7 != null && (boolIsPendingUnblockRequest = userRelationInfo7.isPendingUnblockRequest()) != null) {
                user.setPendingUnblockRequest(boolIsPendingUnblockRequest.booleanValue());
            }
            UserRelationInfo userRelationInfo8 = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo8 != null && (fpBlockByType = userRelationInfo8.getFpBlockByType()) != null) {
                user.setFpBlockByType(fpBlockByType.intValue());
            }
            userRelationInfo = profileCommonInfo.getUserRelationInfo();
            if (userRelationInfo != null && (friendCount = userRelationInfo.getFriendCount()) != null) {
                user.setFriendCount(friendCount.intValue());
            }
            userAccountInfo = profileCommonInfo.getUserAccountInfo();
            if (userAccountInfo != null && (audienceControlViewerMode = userAccountInfo.getAudienceControlViewerMode()) != null) {
                user.audienceControlViewerMode = audienceControlViewerMode.intValue();
                return;
            }
        }
        user.audienceControlViewerMode = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:335:0x0040, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:530:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.gson.n] */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJIIJIL(com.ss.android.ugc.aweme.profile.model.User r37, com.ss.android.ugc.profile.platform.base.data.ProfileComponents r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 1752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJJIJIIJIL(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.profile.platform.base.data.ProfileComponents, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x000a, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIL(com.ss.android.ugc.aweme.profile.model.User r6, com.ss.android.ugc.profile.platform.base.data.ProfileComponents r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJJIL(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.profile.platform.base.data.ProfileComponents, boolean):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJJJIL(User user, ProfileUser profileUser, boolean z) {
        n nVar;
        List<? extends ProfileComponents> list;
        String string;
        TabSetting tabSetting;
        if (profileUser != null) {
            ProfileComponents profileComponents = profileUser.tabsComponents;
            if (profileComponents != null && (list = profileComponents.components) != null) {
                for (ProfileComponents profileComponents2 : list) {
                    String str = profileComponents2.componentName;
                    if (str != null) {
                        List<Long> listLJFF = null;
                        switch (str.hashCode()) {
                            case -1893890292:
                                if (str.equals("profile_tab_ecommerce_showcase")) {
                                    C1251850igJ c1251850igJ = LIZ;
                                    n nVar2 = profileComponents2.bizData;
                                    c1251850igJ.getClass();
                                    LJ(nVar2, user);
                                }
                                break;
                            case -1648586267:
                                if (str.equals("profile_tab_music")) {
                                    if (z) {
                                        C1251850igJ c1251850igJ2 = LIZ;
                                        n nVar3 = profileComponents2.bizData;
                                        c1251850igJ2.getClass();
                                        LIZIZ = nVar3;
                                        if (nVar3 != null) {
                                            if (user.getMusicTabInfo() == null) {
                                                user.setMusicTabInfo(new MusicTabInfo(false, false, null));
                                            }
                                            MusicTabInfo musicTabInfo = user.getMusicTabInfo();
                                            if (musicTabInfo != null) {
                                                musicTabInfo.setMusicTabClaimInfo(new MusicTabClaimInfo(0, "", "", "", ""));
                                            }
                                            user.setShowArtistPlaylist(0);
                                            Class cls = Boolean.TYPE;
                                            LIZJ(nVar3, "show_ghost_music_tab", cls, new AwS588S0100000_9(user, 586));
                                            LIZJ(nVar3, "show_artist_pick_videos", cls, new AwS588S0100000_9(user, 587));
                                            LIZJ(nVar3, "claim_info", n.class, new AwS598S0100000_19(user, 742));
                                            LIZJ(nVar3, "show_artist_playlist", cls, new AwS598S0100000_19(user, 745));
                                            if (user.getGeneralPermission() == null) {
                                                user.setGeneralPermission(new GeneralPermission());
                                            }
                                            LIZJ(nVar3, "original_list", Integer.TYPE, new AwS598S0100000_19(user, 747));
                                            if (user.getOriginalMusician() == null) {
                                                user.setOriginalMusician(new OriginalMusician());
                                            }
                                            OriginalMusician originalMusician = user.getOriginalMusician();
                                            if (originalMusician != null) {
                                                if (nVar3.LJJIJIIJIL("new_release_clip_ids")) {
                                                    try {
                                                        C1227904rF c1227904rF = C1227904rF.LIZ;
                                                        k kVarLJJIIZ = nVar3.LJJIIZ("new_release_clip_ids");
                                                        if (kVarLJJIIZ != null) {
                                                            string = kVarLJJIIZ.toString();
                                                        } else {
                                                            string = null;
                                                        }
                                                        c1227904rF.getClass();
                                                        listLJFF = C1227904rF.LJFF(Long[].class, string);
                                                    } catch (Exception e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                    }
                                                }
                                                originalMusician.setNewReleaseClipIds(listLJFF);
                                            }
                                            C1251850igJ c1251850igJ3 = LIZ;
                                            Class cls2 = Long.TYPE;
                                            AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(user, 750);
                                            c1251850igJ3.getClass();
                                            LIZJ(nVar3, "highlight_music_id", cls2, awS598S0100000_19);
                                            LIZJ(nVar3, "main_artist_new_release_count", Integer.TYPE, new AwS598S0100000_19(user, 753));
                                        }
                                    } else {
                                        C1251850igJ c1251850igJ4 = LIZ;
                                        n nVar4 = profileComponents2.bizData;
                                        c1251850igJ4.getClass();
                                        LIZIZ = nVar4;
                                        if (nVar4 != null) {
                                            if (user.getOriginalMusician() == null) {
                                                user.setOriginalMusician(new OriginalMusician());
                                            }
                                            LIZJ(nVar4, "new_release_clip_ids", h.class, new AwS598S0100000_19(user, 756));
                                            LIZJ(nVar4, "highlight_music_id", Long.TYPE, new AwS598S0100000_19(user, 759));
                                            Class cls3 = Boolean.TYPE;
                                            LIZJ(nVar4, "show_artist_playlist", cls3, new AwS598S0100000_19(user, 762));
                                            if (user.getMusicTabInfo() == null) {
                                                user.setMusicTabInfo(new MusicTabInfo(false, false, null));
                                            }
                                            LIZJ(nVar4, "show_artist_pick_videos", cls3, new AwS588S0100000_9(user, 588));
                                        }
                                    }
                                }
                                break;
                            case -745958441:
                                if (str.equals("profile_tab_like") && !z) {
                                    C1251850igJ c1251850igJ5 = LIZ;
                                    n nVar5 = profileComponents2.bizData;
                                    c1251850igJ5.getClass();
                                    if (nVar5 != null) {
                                        LIZJ(nVar5, "show_like_list", Boolean.TYPE, new AwS598S0100000_19(user, 720));
                                    }
                                }
                                break;
                            case -53914142:
                                if (str.equals("profile_tab_ecommerce_store")) {
                                    C1251850igJ c1251850igJ6 = LIZ;
                                    n nVar6 = profileComponents2.bizData;
                                    c1251850igJ6.getClass();
                                    LJ(nVar6, user);
                                }
                                break;
                            case 124554716:
                                if (str.equals("profile_tab_favorite")) {
                                    C1251850igJ c1251850igJ7 = LIZ;
                                    n nVar7 = profileComponents2.bizData;
                                    c1251850igJ7.getClass();
                                    LIZIZ = nVar7;
                                    if (nVar7 != null) {
                                        if (user.getTabSetting() == null) {
                                            user.setTabSetting(new TabSetting());
                                        }
                                        TabSetting tabSetting2 = user.getTabSetting();
                                        if ((tabSetting2 == null || tabSetting2.getFavoriteTab() == null) && (tabSetting = user.getTabSetting()) != null) {
                                            tabSetting.setFavoriteTab(new FavoriteTab(null));
                                        }
                                        LIZJ(nVar7, "sub_tab_name", String.class, new AwS598S0100000_19(user, 717));
                                    }
                                }
                                break;
                            case 190156241:
                                if (str.equals("profile_tab_effect")) {
                                    C1251850igJ c1251850igJ8 = LIZ;
                                    n nVar8 = profileComponents2.bizData;
                                    c1251850igJ8.getClass();
                                    if (nVar8 != null) {
                                        user.setShowEffectList(true);
                                    }
                                }
                                break;
                            case 561719699:
                                if (str.equals("profile_tab_repost")) {
                                    C1251850igJ c1251850igJ9 = LIZ;
                                    n nVar9 = profileComponents2.bizData;
                                    c1251850igJ9.getClass();
                                    LIZIZ = nVar9;
                                    if (nVar9 != null) {
                                        if (user.getTabSetting() == null) {
                                            user.setTabSetting(new TabSetting());
                                        }
                                        if (user.getTabSetting().repostTab == null) {
                                            user.getTabSetting().repostTab = new RepostTab(0, 0, false);
                                        }
                                        if (z) {
                                            user.getTabSetting().repostTab.setShowRepostSelf(1);
                                        } else {
                                            user.getTabSetting().repostTab.setShowRepostOther(1);
                                        }
                                    }
                                }
                                break;
                            case 600411254:
                                if (str.equals("profile_tab_public_post") && z) {
                                    C1251850igJ c1251850igJ10 = LIZ;
                                    n nVar10 = profileComponents2.bizData;
                                    c1251850igJ10.getClass();
                                    LIZIZ = nVar10;
                                    C013C c013c = new C013C();
                                    if (nVar10 != null) {
                                        LIZJ(nVar10, "user_profile_guide", h.class, new AwS598S0100000_19(user, 767));
                                        LIZJ(nVar10, "user_profile_activity_guide", n.class, new AwS598S0100000_19(user, 770));
                                        if (C1EDI.LIZLLL()) {
                                            LIZJ(nVar10, "user_profile_guide_v2", h.class, new AwS385S0200000_19(c013c, user, 112));
                                        }
                                        if (user.getUserNowPackStruct() == null) {
                                            user.setUserNowPackStruct(new UserNowPackStruct(0, 0));
                                        }
                                        LIZJ(nVar10, "user_now_pack_info", n.class, new AwS385S0200000_19(nVar10, user, 111));
                                        if (C1EDI.LIZLLL() && !c013c.element) {
                                            user.setUserProfileGuideV2(null);
                                        }
                                    }
                                }
                                break;
                            case 772937582:
                                if (str.equals("profile_tab_business_page")) {
                                    C1251850igJ c1251850igJ11 = LIZ;
                                    n nVar11 = profileComponents2.bizData;
                                    c1251850igJ11.getClass();
                                    if (nVar11 != null) {
                                        if (z) {
                                            if (user.getTabSetting() == null) {
                                                user.setTabSetting(new TabSetting());
                                            }
                                            if (user.getTabSetting().baTab == null) {
                                                user.getTabSetting().baTab = new BATab(Boolean.FALSE);
                                            }
                                            Class cls4 = Boolean.TYPE;
                                            LIZJ(nVar11, "show_biz_page_tab", cls4, new AwS598S0100000_19(user, 703));
                                            LIZJ(nVar11, "show_biz_page_tab", cls4, new AwS598S0100000_19(user, 707));
                                        } else {
                                            LIZJ(nVar11, "bio_url", String.class, new AwS598S0100000_19(user, 710));
                                            LIZJ(nVar11, "bio_secure_url", String.class, new AwS598S0100000_19(user, 714));
                                        }
                                    }
                                }
                                break;
                            case 1605609247:
                                if (str.equals("profile_tab_sticker_store")) {
                                    C1251850igJ c1251850igJ12 = LIZ;
                                    n nVar12 = profileComponents2.bizData;
                                    c1251850igJ12.getClass();
                                    LIZIZ = nVar12;
                                    if (nVar12 != null) {
                                        if (user.getTabSetting() == null) {
                                            user.setTabSetting(new TabSetting());
                                        }
                                        if (user.getTabSetting().stickerTab == null) {
                                            user.getTabSetting().stickerTab = new StickerTab(null, null, null, null, null);
                                        }
                                        TabSetting tabSetting3 = user.getTabSetting();
                                        StickerTab stickerTab = user.getTabSetting().stickerTab;
                                        tabSetting3.stickerTab = stickerTab.copy(Boolean.TRUE, stickerTab.showStickerSetSticker, stickerTab.showVideoSticker, stickerTab.stickerSetCount, stickerTab.videoStickerCount);
                                        Class cls5 = Boolean.TYPE;
                                        LIZJ(nVar12, "show_sticker_set_sticker", cls5, new AwS598S0100000_19(user, 704));
                                        LIZJ(nVar12, "show_video_sticker", cls5, new AwS598S0100000_19(user, 708));
                                        Class cls6 = Integer.TYPE;
                                        LIZJ(nVar12, "sticker_set_count", cls6, new AwS598S0100000_19(user, 711));
                                        LIZJ(nVar12, "video_sticker_count", cls6, new AwS598S0100000_19(user, 715));
                                    }
                                }
                                break;
                        }
                    }
                }
            }
            ProfileComponents profileComponents3 = profileUser.tabsComponents;
            if (profileComponents3 != null && (nVar = profileComponents3.bizData) != null) {
                C1251850igJ c1251850igJ13 = LIZ;
                Class cls7 = Integer.TYPE;
                AwS598S0100000_19 awS598S0100000_192 = new AwS598S0100000_19(user, 713);
                c1251850igJ13.getClass();
                LIZJ(nVar, "default_landing_tab_id", cls7, awS598S0100000_192);
            }
        }
    }

    public static void LIZJ(n nVar, String str, Class cls, Function1 function1) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ == null || (kVarLJJIIZ instanceof m)) {
            return;
        }
        if (Intrinsics.LJFF(cls, Boolean.TYPE)) {
            function1.invoke(Boolean.valueOf(kVarLJJIIZ.LJ()));
            return;
        }
        if (Intrinsics.LJFF(cls, String.class)) {
            function1.invoke(kVarLJJIIZ.LJIL());
            return;
        }
        if (Intrinsics.LJFF(cls, Integer.TYPE)) {
            function1.invoke(Integer.valueOf(kVarLJJIIZ.LJIIJJI()));
            return;
        }
        if (Intrinsics.LJFF(cls, Long.TYPE)) {
            function1.invoke(Long.valueOf(kVarLJJIIZ.LJIIZILJ()));
            return;
        }
        if (Intrinsics.LJFF(cls, Float.TYPE)) {
            function1.invoke(Float.valueOf(kVarLJJIIZ.LJIIJ()));
            return;
        }
        if (Intrinsics.LJFF(cls, Double.TYPE)) {
            function1.invoke(Double.valueOf(kVarLJJIIZ.LJIIIZ()));
        } else if (Intrinsics.LJFF(cls, n.class)) {
            function1.invoke(kVarLJJIIZ.LJIILIIL());
        } else {
            if (!Intrinsics.LJFF(cls, h.class)) {
                return;
            }
            function1.invoke(kVarLJJIIZ.LJIIL());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:576:0x02e9, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x05fb, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x068a, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:429:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x09dd  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.ss.android.ugc.aweme.profile.model.User r14, com.ss.android.ugc.profile.platform.base.data.ProfileUser r15, boolean r16, kotlin.jvm.functions.Function1 r17) {
        /*
            Method dump skipped, instruction units count: 2642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJFF(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.profile.platform.base.data.ProfileUser, boolean, kotlin.jvm.functions.Function1):void");
    }

    public static ProfileUser LJIILIIL(User user, ProfileUser profileUser, boolean z, Function1 function1) {
        ProfileUser profileUser2 = profileUser;
        if (user == null) {
            return null;
        }
        if (profileUser2 == null) {
            profileUser2 = new ProfileUser();
        }
        if (C2140508a3.LIZ()) {
            LJFF(user, profileUser2, z, function1);
            return profileUser2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1250200ide(user, profileUser2, z, function1, null), 3);
        return profileUser2;
    }

    public static void LJJIIJZLJL(n nVar, String str, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        nVar.LJJIJL(str);
        if (!z) {
            nVar.LJJIFFI(str, (k) obj);
            return;
        }
        if (obj instanceof Boolean) {
            nVar.LJJII((Boolean) obj, str);
            return;
        }
        if (obj instanceof String) {
            nVar.LJJIIJ(str, (String) obj);
        } else if (obj instanceof Character) {
            nVar.LJJIFFI(str, new q(obj));
        } else if (obj instanceof Number) {
            nVar.LJJIII((Number) obj, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0006, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJIL(java.util.List r6, com.ss.android.ugc.aweme.profile.model.User r7, boolean r8, kotlin.jvm.functions.Function0 r9) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251850igJ.LJJIJIL(java.util.List, com.ss.android.ugc.aweme.profile.model.User, boolean, kotlin.jvm.functions.Function0):void");
    }
}
