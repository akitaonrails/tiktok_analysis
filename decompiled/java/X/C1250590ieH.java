package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.exp.IProfileDefaultConfigAppDiffProtocol;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0ieH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250590ieH {
    public static final C1250590ieH LIZ = new C1250590ieH();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(736));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(738));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(737));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(739));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(735));

    public static String LJ() {
        return (String) LIZJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r39v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r39v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r44v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r45v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r46v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r51v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r58v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r60v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r66v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r67v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r68v0, types: [java.util.List] */
    public final ProfileUser LIZIZ() {
        n nVar;
        List listSingletonList;
        ProfileUser profileUser = new ProfileUser();
        ProfileComponents[] profileComponentsArr = new ProfileComponents[3];
        n nVar2 = new n();
        n nVar3 = new n();
        nVar3.LJJIIJ("icon_key", "IconArrowLeftLTR");
        nVar2.LJJIFFI("icon", nVar3);
        nVar2.LJJIIJ("accessibility", "accessibilityLabels_profile_btn_back");
        profileComponentsArr[0] = LJFF(this, "nav_bar_start", "nav_bar_start", null, null, Collections.singletonList(LJFF(this, "nav_bar_base_item", "nav_bar_start_back", nVar2, null, null, LIZ("nav", "back_button"), 24)), null, 44);
        if (((Boolean) C307360C3a.LIZIZ.getValue()).booleanValue()) {
            nVar = null;
            listSingletonList = Collections.singletonList(LJFF(this, "nav_bar_base_item", "nav_bar_center_avatar", null, null, null, LIZ("nav", "avatar_avatar"), 28));
        } else {
            n nVar4 = new n();
            n nVar5 = new n();
            nVar5.LJJIIJ("icon_key", "icon_chevron_down_fill");
            nVar4.LJJIFFI("icon", nVar5);
            nVar = null;
            listSingletonList = Collections.singletonList(LJFF(this, "nav_bar_base_item", "nav_bar_center_nickname", nVar4, null, null, null, 56));
        }
        profileComponentsArr[1] = LJFF(this, "nav_bar_center", "nav_bar_center", null, null, listSingletonList, null, 44);
        n nVar6 = new n();
        n nVar7 = new n();
        nVar7.LJJIIJ("icon_key", "iconbell");
        nVar6.LJJIFFI("icon", nVar7);
        nVar6.LJJIII(2, "live_push_notification_status");
        n nVar8 = new n();
        nVar8.LJJIII(0, "guide_time");
        Boolean bool = Boolean.FALSE;
        nVar8.LJJII(bool, "show_guide");
        nVar6.LJJIFFI("nudge_guide_info", nVar8);
        ProfileComponents profileComponentsLJFF = LJFF(this, "nav_bar_base_item", "nav_bar_end_bell", nVar6, null, null, LIZ("nav", "nav_bell"), 24);
        IProfileDefaultConfigAppDiffProtocol.LIZ.getClass();
        C1250600ieI.LIZ().LIZIZ();
        C1250590ieH c1250590ieH = LIZ;
        n nVar9 = new n();
        n nVar10 = new n();
        nVar10.LJJIIJ("icon_key", "iconarrowturnupright");
        nVar9.LJJIFFI("icon", nVar10);
        profileComponentsArr[2] = LJFF(this, "nav_bar_end", "nav_bar_end", null, null, C1697810uHb.LJIIJJI(profileComponentsLJFF, LJFF(this, "nav_bar_base_item", "nav_bar_end_more", nVar9, null, null, LIZ("nav", "more"), 24)), null, 44);
        profileUser.navBarComponents = LJFF(this, "nav_bar", "nav_bar", null, null, C1697810uHb.LJIIJJI(profileComponentsArr), null, 44);
        ProfileComponents[] profileComponentsArr2 = new ProfileComponents[3];
        n nVar11 = new n();
        n nVar12 = new n();
        nVar12.LJJIIJ("text", "");
        nVar11.LJJIFFI("describe", nVar12);
        n nVar13 = new n();
        nVar13.LJJII(bool, "username_update_reminder");
        n nVar14 = new n();
        nVar14.LJJIIJ("text", e3.g);
        nVar13.LJJIFFI("describe", nVar14);
        n nVar15 = nVar;
        ?? r39 = nVar;
        ProfileComponents[] profileComponentsArr3 = {LJFF(this, "header_avatar", "header_avatar", nVar, nVar, Collections.singletonList(LJFF(this, "avatar_normal", "avatar_normal", nVar, nVar, nVar, nVar, 60)), nVar, 44), LJFF(this, "user_info", "user_info", nVar15, r39, C1697810uHb.LJIIJJI(LJFF(this, "user_account_name_info", "user_account_name_info", nVar, nVar, Collections.singletonList(LJFF(this, "user_account_name_info_base_item", "user_info_nickname", nVar11, nVar, nVar, LIZ("info", "nick_name"), 24)), nVar, 44), LJFF(this, "user_account_base_info", "user_account_base_info", nVar, nVar, Collections.singletonList(LJFF(this, "user_info_base_item", "user_account_user_name", nVar13, nVar, nVar, LIZ("info", "user_name"), 24)), nVar, 44)), nVar, 44)};
        n nVar16 = new n();
        n nVar17 = new n();
        nVar17.LJJIIJ("starling_key", "mus_following");
        nVar16.LJJIFFI("describe", nVar17);
        nVar16.LJJIII(0, "following_count");
        n nVar18 = new n();
        n nVar19 = new n();
        nVar19.LJJIIJ("starling_key", "mus_follower");
        nVar18.LJJIFFI("describe", nVar19);
        nVar18.LJJIII(0, "follower_count");
        n nVar20 = new n();
        n nVar21 = new n();
        nVar21.LJJIIJ("starling_key", "mus_hearts");
        nVar20.LJJIFFI("describe", nVar21);
        nVar20.LJJIII(0, "like_count");
        n nVar22 = nVar;
        ?? r58 = nVar;
        profileComponentsArr2[0] = LJFF(this, "info", "info", nVar22, r58, C1697810uHb.LJIIJJI(LJFF(this, "user_basic_info", "user_basic_info", nVar, nVar, C1697810uHb.LJIIJJI(profileComponentsArr3), LIZ("info", "relation_info_follower"), 12), LJFF(this, "user_relation_info", "user_relation_info", nVar, nVar, C1697810uHb.LJIIJJI(LJFF(this, "relation_info_base_item", "relation_info_following", nVar16, nVar, nVar, LIZ("info", "relation_info_following"), 24), LJFF(this, "relation_info_base_item", "relation_info_follower", nVar18, nVar, nVar, LIZ("info", "relation_info_follower"), 24), LJFF(this, "relation_info_base_item", "relation_info_like", nVar20, nVar, nVar, LIZ("info", "relation_info_like"), 24)), nVar, 44)), nVar, 44);
        n nVar23 = new n();
        n nVar24 = new n();
        nVar24.LJJIIJ("text", "");
        nVar23.LJJIFFI("describe", nVar24);
        profileComponentsArr2[1] = LJFF(this, "bio", "bio", nVar, nVar, Collections.singletonList(LJFF(this, "bio_signature", "bio_signature", nVar23, nVar, nVar, nVar, 56)), nVar, 44);
        n nVar25 = new n();
        nVar25.LJJIFFI("can_message_follow_status_list", LJI(new Integer[]{0, 1, 2, 4}));
        nVar25.LJJII(bool, "show_messaging_entrance_on_profile");
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(LJFF(this, "cta_social_follow", "cta_social_follow", nVar, nVar, nVar, nVar, 60), LJFF(this, "cta_social_message", "cta_social_message", nVar25, nVar, nVar, nVar, 56), LJFF(this, "cta_recommend_button", "cta_recommend_button", nVar, nVar, nVar, nVar, 60));
        if (C299880BpC.LIZ() && C1253000iiA.LIZ()) {
            ListProtector.add(listLJIILJJIL, 2, LJFF(c1250590ieH, "cta_settings_button", "cta_settings_button", nVar, nVar, nVar, nVar, 60));
        }
        profileComponentsArr2[2] = LJFF(this, "cta", "cta", nVar, nVar, listLJIILJJIL, nVar, 44);
        profileUser.headerComponents = LJFF(this, "header", "header", null, null, C1697810uHb.LJIIJJI(profileComponentsArr2), null, 44);
        n nVar26 = new n();
        n nVar27 = new n();
        nVar27.LJJIIJ("icon_key", LJ());
        nVar26.LJJIFFI("icon", nVar27);
        n nVar28 = new n();
        nVar28.LJJIIJ("guide_text", "");
        nVar28.LJJIIJ("guide_key", "");
        nVar26.LJJIFFI("user_profile_guide", nVar28);
        n nVar29 = new n();
        nVar29.LJJIII(1, "user_now_status");
        nVar26.LJJIFFI("user_now_pack_info", nVar29);
        List<? extends ProfileComponents> listLJIIJJI = C1697810uHb.LJIIJJI(LJFF(this, "profile_tab_base_item", "profile_tab_public_post", nVar26, null, null, LIZ("tab", "output_tab"), 24), LJFF(this, "", "", null, null, null, null, 60));
        C1250600ieI.LIZ().LIZLLL(listLJIIJJI);
        profileUser.tabsComponents = LJFF(this, "profile_tab", "profile_tab", null, null, listLJIIJJI, null, 44);
        ProfileCommonInfo profileCommonInfo = new ProfileCommonInfo();
        profileCommonInfo.setMode("normal_mode");
        profileUser.common = profileCommonInfo;
        return profileUser;
    }

    public final ProfileUser LIZJ() {
        ProfileUser profileUser = new ProfileUser();
        n nVar = new n();
        n nVar2 = new n();
        nVar2.LJJIIJ("icon_key", "icon_chevron_down_fill");
        nVar.LJJIFFI("icon", nVar2);
        n nVar3 = new n();
        n nVar4 = new n();
        nVar4.LJJIIJ("icon_key", "icon3lineshorizontal2");
        nVar3.LJJIFFI("icon", nVar4);
        n nVar5 = new n();
        n nVar6 = new n();
        nVar6.LJJIIJ("icon_key", "IconGear");
        nVar5.LJJIFFI("icon", nVar6);
        n nVar7 = new n();
        nVar7.LJJIIJ("text", "Settings and privacy");
        nVar5.LJJIFFI("describe", nVar7);
        Action action = new Action();
        action.setType("router");
        Action.RouterInfo routerInfo = new Action.RouterInfo();
        routerInfo.setUrl("aweme://setting");
        action.setRouter(routerInfo);
        ProfileComponents profileComponentsLJFF = LJFF(this, "nav_bar_base_item", "nav_bar_end_settings", nVar3, null, Collections.singletonList(LJFF(this, "content_section", "content_section", null, null, Collections.singletonList(LJFF(this, "content_section_cell_list_base_item", "content_section_cell_list_others", null, null, Collections.singletonList(LJFF(this, "content_section_cell_base_item", "content_section_cell_settings_and_privacy", nVar5, Collections.singletonList(action), null, null, 48)), null, 44)), null, 44)), null, 40);
        IProfileDefaultConfigAppDiffProtocol.LIZ.getClass();
        C1250600ieI.LIZ().LIZJ(profileComponentsLJFF);
        profileUser.navBarComponents = LJFF(this, "nav_bar", "nav_bar", null, null, C1697810uHb.LJIIJJI(LJFF(this, "nav_bar_start", "nav_bar_start", null, null, null, null, 60), LJFF(this, "nav_bar_center", "nav_bar_center", null, null, Collections.singletonList(LJFF(this, "nav_bar_base_item", "nav_bar_center_nickname", nVar, null, null, null, 56)), null, 44), LJFF(this, "nav_bar_end", "nav_bar_end", null, null, Collections.singletonList(profileComponentsLJFF), LIZ("nav", "setting"), 12)), null, 44);
        n nVar8 = new n();
        n nVar9 = new n();
        nVar9.LJJIIJ("text", "");
        nVar8.LJJIFFI("describe", nVar9);
        n nVar10 = new n();
        nVar10.LJJII(Boolean.FALSE, "username_update_reminder");
        n nVar11 = new n();
        nVar11.LJJIIJ("text", e3.g);
        nVar10.LJJIFFI("describe", nVar11);
        ProfileComponents[] profileComponentsArr = {LJFF(this, "user_account_name_info", "user_account_name_info", null, null, Collections.singletonList(LJFF(this, "user_account_name_info_base_item", "user_info_nickname", nVar8, null, null, LIZ("info", "nick_name"), 24)), null, 44), LJFF(this, "user_account_base_info", "user_account_base_info", null, null, Collections.singletonList(LJFF(this, "user_info_base_item", "user_account_user_name", nVar10, null, null, LIZ("info", "user_name"), 24)), null, 44)};
        n nVar12 = new n();
        n nVar13 = new n();
        nVar13.LJJIIJ("text", "Edit");
        nVar12.LJJIFFI("describe", nVar13);
        n nVar14 = new n();
        nVar14.LJJIIJ("icon_key", "IconPen");
        nVar12.LJJIFFI("icon", nVar14);
        Action action2 = new Action();
        action2.setType("router");
        Action.RouterInfo routerInfo2 = new Action.RouterInfo();
        routerInfo2.setUrl("aweme://profile_edit");
        action2.setRouter(routerInfo2);
        ProfileComponents profileComponentsLJFF2 = LJFF(this, "user_info_manage", "user_info_manage", null, null, Collections.singletonList(LJFF(this, "user_info_manage_base_item", "user_info_manage_edit_profile", nVar12, Collections.singletonList(action2), null, null, 48)), null, 44);
        C1250600ieI.LIZ().LJ();
        ProfileComponents[] profileComponentsArr2 = {LJFF(this, "header_avatar", "header_avatar", null, null, Collections.singletonList(LJFF(this, "avatar_normal", "avatar_normal", null, null, null, null, 60)), null, 44), LJFF(this, "user_info", "user_info", null, null, C1697810uHb.LJIIJJI(profileComponentsArr), null, 44), profileComponentsLJFF2};
        n nVar15 = new n();
        n nVar16 = new n();
        nVar16.LJJIIJ("starling_key", "mus_following");
        nVar15.LJJIFFI("describe", nVar16);
        n nVar17 = new n();
        n nVar18 = new n();
        nVar18.LJJIIJ("starling_key", "mus_follower");
        nVar17.LJJIFFI("describe", nVar18);
        n nVar19 = new n();
        n nVar20 = new n();
        nVar20.LJJIIJ("starling_key", "mus_hearts");
        nVar19.LJJIFFI("describe", nVar20);
        profileUser.headerComponents = LJFF(this, "header", "header", null, null, Collections.singletonList(LJFF(this, "info", "info", null, null, C1697810uHb.LJIIJJI(LJFF(this, "user_basic_info", "user_basic_info", null, null, C13LQ.LJIJI(profileComponentsArr2), LIZ("info", "relation_info_follower"), 12), LJFF(this, "user_relation_info", "user_relation_info", null, null, C1697810uHb.LJIIJJI(LJFF(this, "relation_info_base_item", "relation_info_following", nVar15, null, null, LIZ("info", "relation_info_following"), 24), LJFF(this, "relation_info_base_item", "relation_info_follower", nVar17, null, null, LIZ("info", "relation_info_follower"), 24), LJFF(this, "relation_info_base_item", "relation_info_like", nVar19, null, null, LIZ("info", "relation_info_like"), 24)), null, 44)), null, 44)), null, 44);
        n nVar21 = new n();
        n nVar22 = new n();
        nVar22.LJJIIJ("icon_key", LJ());
        nVar21.LJJIFFI("icon", nVar22);
        n nVar23 = new n();
        nVar23.LJJIIJ("guide_text", "");
        nVar23.LJJIIJ("guide_key", "");
        nVar21.LJJIFFI("user_profile_guide", nVar23);
        n nVar24 = new n();
        nVar24.LJJIII(1, "user_now_status");
        nVar21.LJJIFFI("user_now_pack_info", nVar24);
        n nVar25 = new n();
        n nVar26 = new n();
        nVar26.LJJIIJ("icon_key", (String) LJ.getValue());
        nVar25.LJJIFFI("icon", nVar26);
        n nVar27 = new n();
        n nVar28 = new n();
        nVar28.LJJIIJ("icon_key", (String) LJFF.getValue());
        nVar27.LJJIFFI("icon", nVar28);
        n nVar29 = new n();
        n nVar30 = new n();
        nVar30.LJJIIJ("icon_key", (String) LIZLLL.getValue());
        nVar29.LJJIFFI("icon", nVar30);
        List<? extends ProfileComponents> listLJIIJJI = C1697810uHb.LJIIJJI(LJFF(this, "profile_tab_base_item", "profile_tab_public_post", nVar21, null, null, LIZ("tab", "output_tab"), 24), LJFF(this, "profile_tab_base_item", "profile_tab_private", nVar25, null, null, LIZ("tab", "private_tab"), 24), LJFF(this, "profile_tab_base_item", "profile_tab_favorite", nVar27, null, null, LIZ("tab", "collection_tab"), 24), LJFF(this, "profile_tab_base_item", "profile_tab_like", nVar29, null, null, LIZ("tab", "likes_tab"), 24));
        C1250600ieI.LIZ().LIZLLL(listLJIIJJI);
        profileUser.tabsComponents = LJFF(this, "profile_tab", "profile_tab", null, null, listLJIIJJI, null, 44);
        ProfileCommonInfo profileCommonInfo = new ProfileCommonInfo();
        profileCommonInfo.setMode("normal_mode");
        profileUser.common = profileCommonInfo;
        return profileUser;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProfileUser LIZLLL() {
        C1250590ieH c1250590ieH;
        List listSingletonList;
        C1250590ieH c1250590ieH2;
        List listLJIIJJI;
        ProfileComponents profileComponentsLJFF;
        char c;
        C1250590ieH c1250590ieH3;
        List list;
        List listSingletonList2;
        C1250590ieH c1250590ieH4;
        ProfileComponents profileComponentsLJFF2;
        boolean zLIZLLL = C268330AfP.LIZLLL();
        C1250590ieH c1250590ieH5 = LIZ;
        if (zLIZLLL) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("test_log", "getAlignLeftAndAvatarRightOtherUser");
            ProfileUser profileUser = new ProfileUser();
            ProfileComponents[] profileComponentsArr = new ProfileComponents[3];
            n nVar = new n();
            n nVar2 = new n();
            nVar2.LJJIIJ("icon_key", "IconArrowLeftLTR");
            nVar.LJJIFFI("icon", nVar2);
            nVar.LJJIIJ("accessibility", "accessibilityLabels_profile_btn_back");
            profileComponentsArr[0] = LJFF(this, "nav_bar_start", "nav_bar_start", null, null, Collections.singletonList(LJFF(this, "nav_bar_base_item", "nav_bar_start_back", nVar, null, null, LIZ("nav", "back_button"), 24)), null, 44);
            if (((Boolean) C307360C3a.LIZIZ.getValue()).booleanValue()) {
                c1250590ieH3 = this;
                list = null;
                listSingletonList2 = Collections.singletonList(LJFF(c1250590ieH3, "nav_bar_base_item", "nav_bar_center_avatar", null, null, null, LIZ("nav", "avatar_avatar"), 28));
            } else {
                n nVar3 = new n();
                n nVar4 = new n();
                nVar4.LJJIIJ("icon_key", "icon_chevron_down_fill");
                nVar3.LJJIFFI("icon", nVar4);
                c1250590ieH3 = this;
                list = null;
                listSingletonList2 = Collections.singletonList(LJFF(c1250590ieH3, "nav_bar_base_item", "nav_bar_center_nickname", nVar3, null, null, null, 56));
            }
            profileComponentsArr[1] = LJFF(c1250590ieH3, "nav_bar_center", "nav_bar_center", list, list, listSingletonList2, list, 44);
            n nVar5 = new n();
            n nVar6 = new n();
            nVar6.LJJIIJ("icon_key", "iconbell");
            nVar5.LJJIFFI("icon", nVar6);
            nVar5.LJJIII(2, "live_push_notification_status");
            n nVar7 = new n();
            nVar7.LJJIII(0, "guide_time");
            Boolean bool = Boolean.FALSE;
            nVar7.LJJII(bool, "show_guide");
            nVar5.LJJIFFI("nudge_guide_info", nVar7);
            ProfileComponents profileComponentsLJFF3 = LJFF(c1250590ieH3, "nav_bar_base_item", "nav_bar_end_bell", nVar5, list, list, LIZ("nav", "nav_bell"), 24);
            IProfileDefaultConfigAppDiffProtocol.LIZ.getClass();
            C1250600ieI.LIZ().LIZIZ();
            n nVar8 = new n();
            n nVar9 = new n();
            nVar9.LJJIIJ("icon_key", "iconarrowturnupright");
            nVar8.LJJIFFI("icon", nVar9);
            profileComponentsArr[2] = LJFF(c1250590ieH3, "nav_bar_end", "nav_bar_end", list, list, C1697810uHb.LJIIJJI(profileComponentsLJFF3, LJFF(c1250590ieH3, "nav_bar_base_item", "nav_bar_end_more", nVar8, list, list, LIZ("nav", "more"), 24)), list, 44);
            profileUser.navBarComponents = LJFF(c1250590ieH3, "nav_bar", "nav_bar", list, list, C1697810uHb.LJIIJJI(profileComponentsArr), list, 44);
            ProfileComponents[] profileComponentsArr2 = new ProfileComponents[3];
            ProfileComponents[] profileComponentsArr3 = new ProfileComponents[3];
            if (C268330AfP.LIZJ()) {
                c1250590ieH4 = c1250590ieH3;
                profileComponentsLJFF2 = LJFF(c1250590ieH4, "", "", null, null, null, null, 60);
            } else {
                List listSingletonList3 = Collections.singletonList(LJFF(c1250590ieH3, "avatar_normal", "avatar_normal", null, null, null, null, 60));
                c1250590ieH4 = c1250590ieH3;
                profileComponentsLJFF2 = LJFF(c1250590ieH4, "header_avatar", "header_avatar", null, null, listSingletonList3, null, 44);
            }
            profileComponentsArr3[0] = profileComponentsLJFF2;
            n nVar10 = new n();
            n nVar11 = new n();
            nVar11.LJJIIJ("text", "");
            nVar10.LJJIFFI("describe", nVar11);
            C1250590ieH c1250590ieH6 = c1250590ieH4;
            n nVar12 = new n();
            nVar12.LJJII(bool, "username_update_reminder");
            n nVar13 = new n();
            nVar13.LJJIIJ("text", e3.g);
            nVar12.LJJIFFI("describe", nVar13);
            n nVar14 = new n();
            n nVar15 = new n();
            nVar15.LJJIIJ("starling_key", "mus_following");
            nVar14.LJJIFFI("describe", nVar15);
            nVar14.LJJIII(0, "following_count");
            n nVar16 = new n();
            n nVar17 = new n();
            nVar17.LJJIIJ("starling_key", "mus_follower");
            nVar16.LJJIFFI("describe", nVar17);
            nVar16.LJJIII(0, "follower_count");
            n nVar18 = new n();
            n nVar19 = new n();
            nVar19.LJJIIJ("starling_key", "mus_hearts");
            nVar18.LJJIFFI("describe", nVar19);
            nVar18.LJJIII(0, "like_count");
            profileComponentsArr3[1] = LJFF(c1250590ieH6, "user_info", "user_info", null, null, C1697810uHb.LJIIJJI(LJFF(c1250590ieH6, "user_account_name_info", "user_account_name_info", null, null, Collections.singletonList(LJFF(c1250590ieH6, "user_account_name_info_base_item", "user_info_nickname", nVar10, null, null, LIZ("info", "nick_name"), 24)), null, 44), LJFF(c1250590ieH6, "user_account_base_info", "user_account_base_info", null, null, Collections.singletonList(LJFF(c1250590ieH6, "user_info_base_item", "user_account_user_name", nVar12, null, null, LIZ("info", "user_name"), 24)), null, 44), LJFF(c1250590ieH6, "user_relation_info", "user_relation_info", null, null, C1697810uHb.LJIIJJI(LJFF(c1250590ieH6, "relation_info_base_item", "relation_info_following", nVar14, null, null, LIZ("info", "relation_info_following"), 24), LJFF(c1250590ieH6, "relation_info_base_item", "relation_info_follower", nVar16, null, null, LIZ("info", "relation_info_follower"), 24), LJFF(c1250590ieH6, "relation_info_base_item", "relation_info_like", nVar18, null, null, LIZ("info", "relation_info_like"), 24)), null, 44)), null, 44);
            profileComponentsArr3[2] = C268330AfP.LIZJ() ? LJFF(c1250590ieH6, "header_avatar", "header_avatar", null, null, Collections.singletonList(LJFF(c1250590ieH6, "avatar_normal", "avatar_normal", null, null, null, null, 60)), null, 44) : LJFF(c1250590ieH6, "", "", null, null, null, null, 60);
            profileComponentsArr2[0] = LJFF(c1250590ieH6, "info", "info", null, null, Collections.singletonList(LJFF(c1250590ieH6, "user_basic_info", "user_basic_info", null, null, C1697810uHb.LJIIJJI(profileComponentsArr3), null, 44)), null, 44);
            n nVar20 = new n();
            nVar20.LJJIFFI("can_message_follow_status_list", LJI(new Integer[]{0, 1, 2, 4}));
            nVar20.LJJII(bool, "show_messaging_entrance_on_profile");
            char c2 = 2;
            List listLJIILJJIL = C1697810uHb.LJIILJJIL(LJFF(c1250590ieH6, "cta_social_follow", "cta_social_follow", null, null, null, null, 60), LJFF(c1250590ieH6, "cta_social_message", "cta_social_message", nVar20, null, null, null, 56), LJFF(c1250590ieH6, "cta_recommend_button", "cta_recommend_button", null, null, null, null, 60));
            if (C299880BpC.LIZ() && C1253000iiA.LIZ()) {
                c2 = 2;
                ListProtector.add(listLJIILJJIL, 2, LJFF(c1250590ieH5, "cta_settings_button", "cta_settings_button", null, null, null, null, 60));
            }
            profileComponentsArr2[1] = LJFF(c1250590ieH6, "cta", "cta", null, null, listLJIILJJIL, null, 44);
            n nVar21 = new n();
            n nVar22 = new n();
            nVar22.LJJIIJ("text", "");
            nVar21.LJJIFFI("describe", nVar22);
            profileComponentsArr2[c2] = LJFF(c1250590ieH6, "bio", "bio", null, null, Collections.singletonList(LJFF(c1250590ieH6, "bio_signature", "bio_signature", nVar21, null, null, null, 56)), null, 44);
            profileUser.headerComponents = LJFF(c1250590ieH6, "header", "header", null, null, C1697810uHb.LJIIJJI(profileComponentsArr2), null, 44);
            n nVar23 = new n();
            n nVar24 = new n();
            nVar24.LJJIIJ("icon_key", LJ());
            nVar23.LJJIFFI("icon", nVar24);
            n nVar25 = new n();
            nVar25.LJJIIJ("guide_text", "");
            nVar25.LJJIIJ("guide_key", "");
            nVar23.LJJIFFI("user_profile_guide", nVar25);
            n nVar26 = new n();
            nVar26.LJJIII(1, "user_now_status");
            nVar23.LJJIFFI("user_now_pack_info", nVar26);
            profileUser.tabsComponents = LJFF(c1250590ieH6, "profile_tab", "profile_tab", null, null, C1697810uHb.LJIIJJI(LJFF(c1250590ieH6, "profile_tab_base_item", "profile_tab_public_post", nVar23, null, null, LIZ("tab", "output_tab"), 24), LJFF(c1250590ieH6, "", "", null, null, null, null, 60)), null, 44);
            ProfileCommonInfo profileCommonInfo = new ProfileCommonInfo();
            profileCommonInfo.setMode("normal_mode");
            profileUser.common = profileCommonInfo;
            return profileUser;
        }
        if (C268330AfP.LJIIIZ()) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("test_log", "generateAlignLeftOtherUser");
            return LIZIZ();
        }
        ProfileUser profileUser2 = new ProfileUser();
        ProfileComponents[] profileComponentsArr4 = new ProfileComponents[3];
        n nVar27 = new n();
        n nVar28 = new n();
        nVar28.LJJIIJ("icon_key", "IconArrowLeftLTR");
        nVar27.LJJIFFI("icon", nVar28);
        nVar27.LJJIIJ("accessibility", "accessibilityLabels_profile_btn_back");
        profileComponentsArr4[0] = LJFF(this, "nav_bar_start", "nav_bar_start", null, null, Collections.singletonList(LJFF(this, "nav_bar_base_item", "nav_bar_start_back", nVar27, null, null, LIZ("nav", "back_button"), 24)), null, 44);
        if (((Boolean) C307360C3a.LIZIZ.getValue()).booleanValue()) {
            c1250590ieH = this;
            listSingletonList = Collections.singletonList(LJFF(c1250590ieH, "nav_bar_base_item", "nav_bar_center_avatar", null, null, null, LIZ("nav", "avatar_avatar"), 28));
        } else {
            n nVar29 = new n();
            n nVar30 = new n();
            nVar30.LJJIIJ("icon_key", "icon_chevron_down_fill");
            nVar29.LJJIFFI("icon", nVar30);
            c1250590ieH = this;
            listSingletonList = Collections.singletonList(LJFF(c1250590ieH, "nav_bar_base_item", "nav_bar_center_nickname", nVar29, null, null, !C2537109wv.LJIIIIZZ() ? LIZ("nav", "nick_name") : null, 24));
        }
        profileComponentsArr4[1] = LJFF(c1250590ieH, "nav_bar_center", "nav_bar_center", null, null, listSingletonList, null, 44);
        if (C1253010iiB.LIZJ.LJIIZILJ()) {
            n nVar31 = new n();
            n nVar32 = new n();
            nVar32.LJJIIJ("icon_key", "icon3lineshorizontal2");
            nVar31.LJJIFFI("icon", nVar32);
            c1250590ieH2 = c1250590ieH;
            listLJIIJJI = Collections.singletonList(LJFF(c1250590ieH2, "nav_bar_base_item", "nav_bar_end_more", nVar31, null, null, LIZ("nav", "more"), 24));
        } else {
            n nVar33 = new n();
            n nVar34 = new n();
            nVar34.LJJIIJ("icon_key", "iconbell");
            nVar33.LJJIFFI("icon", nVar34);
            nVar33.LJJIII(2, "live_push_notification_status");
            n nVar35 = new n();
            nVar35.LJJIII(0, "guide_time");
            nVar35.LJJII(Boolean.FALSE, "show_guide");
            nVar33.LJJIFFI("nudge_guide_info", nVar35);
            C1250590ieH c1250590ieH7 = c1250590ieH;
            ProfileComponents profileComponentsLJFF4 = LJFF(c1250590ieH7, "nav_bar_base_item", "nav_bar_end_bell", nVar33, null, null, LIZ("nav", "nav_bell"), 24);
            IProfileDefaultConfigAppDiffProtocol.LIZ.getClass();
            C1250600ieI.LIZ().LIZIZ();
            n nVar36 = new n();
            n nVar37 = new n();
            nVar37.LJJIIJ("icon_key", "iconarrowturnupright");
            nVar36.LJJIFFI("icon", nVar37);
            c1250590ieH2 = c1250590ieH7;
            listLJIIJJI = C1697810uHb.LJIIJJI(profileComponentsLJFF4, LJFF(c1250590ieH2, "nav_bar_base_item", "nav_bar_end_more", nVar36, null, null, LIZ("nav", "more"), 24));
        }
        profileComponentsArr4[2] = LJFF(c1250590ieH2, "nav_bar_end", "nav_bar_end", null, null, listLJIIJJI, null, 44);
        profileUser2.navBarComponents = LJFF(c1250590ieH2, "nav_bar", "nav_bar", null, null, C1697810uHb.LJIIJJI(profileComponentsArr4), null, 44);
        ProfileComponents[] profileComponentsArr5 = new ProfileComponents[4];
        List listSingletonList4 = Collections.singletonList(LJFF(c1250590ieH2, "avatar_normal", "avatar_normal", null, null, null, null, 60));
        C1250590ieH c1250590ieH8 = c1250590ieH2;
        profileComponentsArr5[0] = LJFF(c1250590ieH8, "header_avatar", "header_avatar", null, null, listSingletonList4, null, 44);
        ProfileComponents[] profileComponentsArr6 = new ProfileComponents[2];
        ProfileComponents[] profileComponentsArr7 = new ProfileComponents[2];
        if (C2537109wv.LJI()) {
            n nVar38 = new n();
            n nVar39 = new n();
            nVar39.LJJIIJ("text", "");
            nVar38.LJJIFFI("describe", nVar39);
            profileComponentsLJFF = LJFF(c1250590ieH8, "user_account_name_info", "user_account_name_info", null, null, Collections.singletonList(LJFF(c1250590ieH8, "user_account_name_info_base_item", "user_info_nickname", nVar38, null, null, LIZ("info", "nick_name"), 24)), null, 44);
        } else {
            c1250590ieH8 = c1250590ieH8;
            profileComponentsLJFF = LJFF(c1250590ieH8, "", "", null, null, null, null, 60);
        }
        profileComponentsArr7[0] = profileComponentsLJFF;
        n nVar40 = new n();
        Boolean bool2 = Boolean.FALSE;
        nVar40.LJJII(bool2, "username_update_reminder");
        n nVar41 = new n();
        nVar41.LJJIIJ("text", e3.g);
        nVar40.LJJIFFI("describe", nVar41);
        C1250590ieH c1250590ieH9 = c1250590ieH8;
        profileComponentsArr7[1] = LJFF(c1250590ieH9, "user_account_base_info", "user_account_base_info", null, null, Collections.singletonList(LJFF(c1250590ieH8, "user_info_base_item", "user_account_user_name", nVar40, null, null, null, 56)), LIZ("info", "user_name"), 12);
        profileComponentsArr6[0] = LJFF(c1250590ieH9, "user_info", "user_info", null, null, C1697810uHb.LJIIJJI(profileComponentsArr7), null, 44);
        n nVar42 = new n();
        n nVar43 = new n();
        nVar43.LJJIIJ("starling_key", "mus_following");
        nVar42.LJJIFFI("describe", nVar43);
        nVar42.LJJIII(0, "following_count");
        n nVar44 = new n();
        n nVar45 = new n();
        nVar45.LJJIIJ("starling_key", "mus_follower");
        nVar44.LJJIFFI("describe", nVar45);
        nVar44.LJJIII(0, "follower_count");
        n nVar46 = new n();
        n nVar47 = new n();
        nVar47.LJJIIJ("starling_key", "mus_hearts");
        nVar46.LJJIFFI("describe", nVar47);
        nVar46.LJJIII(0, "like_count");
        profileComponentsArr6[1] = LJFF(c1250590ieH9, "user_relation_info", "user_relation_info", null, null, C1697810uHb.LJIIJJI(LJFF(c1250590ieH9, "relation_info_base_item", "relation_info_following", nVar42, null, null, LIZ("info", "relation_info_following"), 24), LJFF(c1250590ieH9, "relation_info_base_item", "relation_info_follower", nVar44, null, null, LIZ("info", "relation_info_follower"), 24), LJFF(c1250590ieH9, "relation_info_base_item", "relation_info_like", nVar46, null, null, LIZ("info", "relation_info_like"), 24)), null, 44);
        profileComponentsArr5[1] = LJFF(c1250590ieH9, "info", "info", null, null, C1697810uHb.LJIIJJI(profileComponentsArr6), null, 44);
        n nVar48 = new n();
        nVar48.LJJIFFI("can_message_follow_status_list", LJI(new Integer[]{0, 1, 2, 4}));
        nVar48.LJJII(bool2, "show_messaging_entrance_on_profile");
        char c3 = 2;
        List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(LJFF(c1250590ieH9, "cta_social_follow", "cta_social_follow", null, null, null, null, 60), LJFF(c1250590ieH9, "cta_social_message", "cta_social_message", nVar48, null, null, null, 56), LJFF(c1250590ieH9, "cta_recommend_button", "cta_recommend_button", null, null, null, null, 60));
        if (C299880BpC.LIZ() && C1253000iiA.LIZ()) {
            c = 3;
            c3 = 2;
            ListProtector.add(listLJIILJJIL2, 2, LJFF(c1250590ieH5, "cta_settings_button", "cta_settings_button", null, null, null, null, 60));
        } else {
            c = 3;
        }
        profileComponentsArr5[c3] = LJFF(c1250590ieH9, "cta", "cta", null, null, listLJIILJJIL2, null, 44);
        n nVar49 = new n();
        n nVar50 = new n();
        nVar50.LJJIIJ("text", "");
        nVar49.LJJIFFI("describe", nVar50);
        profileComponentsArr5[c] = LJFF(c1250590ieH9, "bio", "bio", null, null, Collections.singletonList(LJFF(c1250590ieH9, "bio_signature", "bio_signature", nVar49, null, null, null, 56)), null, 44);
        profileUser2.headerComponents = LJFF(c1250590ieH9, "header", "header", null, null, C1697810uHb.LJIIJJI(profileComponentsArr5), null, 44);
        n nVar51 = new n();
        n nVar52 = new n();
        nVar52.LJJIIJ("icon_key", LJ());
        nVar51.LJJIFFI("icon", nVar52);
        n nVar53 = new n();
        nVar53.LJJIIJ("guide_text", "");
        nVar53.LJJIIJ("guide_key", "");
        nVar51.LJJIFFI("user_profile_guide", nVar53);
        n nVar54 = new n();
        nVar54.LJJIII(1, "user_now_status");
        nVar51.LJJIFFI("user_now_pack_info", nVar54);
        List<? extends ProfileComponents> listLJIIJJI2 = C1697810uHb.LJIIJJI(LJFF(c1250590ieH9, "profile_tab_base_item", "profile_tab_public_post", nVar51, null, null, LIZ("tab", "output_tab"), 24), LJFF(c1250590ieH9, "", "", null, null, null, null, 60));
        IProfileDefaultConfigAppDiffProtocol.LIZ.getClass();
        C1250600ieI.LIZ().LIZLLL(listLJIIJJI2);
        profileUser2.tabsComponents = LJFF(c1250590ieH9, "profile_tab", "profile_tab", null, null, listLJIIJJI2, null, 44);
        ProfileCommonInfo profileCommonInfo2 = new ProfileCommonInfo();
        profileCommonInfo2.setMode("normal_mode");
        profileUser2.common = profileCommonInfo2;
        return profileUser2;
    }

    public static h LJI(Number[] numberArr) {
        h hVar = new h();
        for (Number number : numberArr) {
            hVar.LJJII(number);
        }
        return hVar;
    }

    public static List LIZ(String str, String str2) {
        if (!C1248730ibH.LIZIZ()) {
            return null;
        }
        EventParams eventParams = new EventParams();
        eventParams.event = "profile_info_collect";
        eventParams.type = 5;
        n nVar = new n();
        nVar.LJJIIJ("component_field", str);
        nVar.LJJIIJ(Scene.SCENE_SERVICE, str2);
        eventParams.bizParams = nVar;
        EventParams eventParams2 = new EventParams();
        eventParams2.event = "profile_info_click";
        eventParams2.type = 4;
        n nVar2 = new n();
        nVar2.LJJIIJ("component_field", str);
        nVar2.LJJIIJ(Scene.SCENE_SERVICE, str2);
        eventParams2.bizParams = nVar2;
        return C1697810uHb.LJIIJJI(eventParams, eventParams2);
    }

    public static ProfileComponents LJFF(C1250590ieH c1250590ieH, String str, String str2, n nVar, List list, List list2, List list3, int i) {
        if ((i & 4) != 0) {
            nVar = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            list2 = null;
        }
        if ((i & 32) != 0) {
            list3 = null;
        }
        c1250590ieH.getClass();
        ProfileComponents profileComponents = new ProfileComponents();
        profileComponents.componentId = str;
        profileComponents.componentName = str2;
        profileComponents.bizData = nVar;
        profileComponents.actions = list;
        profileComponents.components = list2;
        profileComponents.eventParams = list3;
        return profileComponents;
    }
}
