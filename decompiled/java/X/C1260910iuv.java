package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260910iuv extends AbstractC1386140mAu<C1260910iuv> {
    public String LJJLIIIJ;
    public EnumC1260920iuw LJJLIIIJILLIZJL;
    public EnumC1260930iux LJJLIIIJJI;
    public EnumC736410Sud LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public final C01GW LJJLIIIJLJLI;
    public String LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;
    public String LJJLJ;
    public String LJJLJLI;
    public String LJJLL;
    public final String LJJZ;
    public final String LJJZZI;
    public String LJJZZIII;
    public String LJL;
    public String LJLI;
    public int LJLIIIL;
    public int LJLIIL;
    public int LJLIL;
    public String LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public int LJLLILLLL;
    public String LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public Map<String, String> LJZ;
    public Integer LJZI;
    public String LJZL;
    public Boolean LL;
    public Boolean LLD;
    public Boolean LLF;
    public Boolean LLFF;
    public Boolean LLFFF;
    public Boolean LLFII;
    public Boolean LLFZ;
    public String LLI;
    public String LLIFFJFJJ;
    public Integer LLII;

    public C1260910iuv() {
        this(0);
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        Aweme aweme;
        String str = this.LIZLLL;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("enter_from", str, c2082308Dt);
        LJFF("previous_page", this.LJJLIIIJ, c2082308Dt);
        EnumC1260920iuw enumC1260920iuw = this.LJJLIIIJILLIZJL;
        LJFF("scene_type", enumC1260920iuw != null ? enumC1260920iuw.getType() : null, c2082308Dt);
        EnumC1260930iux enumC1260930iux = this.LJJLIIIJJI;
        LJFF("action_type", enumC1260930iux != null ? enumC1260930iux.getType() : null, c2082308Dt);
        LJFF("rec_type", this.LJIJJ, c2082308Dt);
        EnumC736410Sud enumC736410Sud = this.LJJLIIIJJIZ;
        LJFF("follow_type", enumC736410Sud != null ? enumC736410Sud.getType() : null, c2082308Dt);
        LJFF("to_user_id", this.LJJLIIIJL, c2082308Dt);
        LJFF("group_id", this.LJJLIIIJLLLLLLLZ, c2082308Dt);
        LJFF("author_id", this.LJJLIIJ, c2082308Dt);
        LJFF("req_id", this.LJJLIL, c2082308Dt);
        LJFF("homepage_user_id", this.LJJLJ, c2082308Dt);
        LJFF("relation_type", this.LJJLJLI, c2082308Dt);
        LJ("position", this.LJJZZIII);
        LJ("previous_position", this.LJL);
        LIZLLL(this.LJLL, "is_landscape_screen");
        Integer num = this.LJZI;
        LIZLLL(num != null ? num.intValue() : 0, "share_type");
        LJ("share_source", this.LJZL);
        int i = this.LJLLLL;
        if (i != -1) {
            LIZLLL(i, "network_status");
        }
        if (C123100dR.LIZ(this.LJLLI)) {
            LJ("now_type", this.LJLLI);
        }
        if (C123100dR.LIZ(this.LJLLJ)) {
            LJ("is_now_clear", this.LJLLJ);
        }
        LIZLLL(this.LJLLL, "has_small_window");
        int i2 = this.LJLIIIL;
        if (i2 > 0) {
            LIZLLL(i2, "video_cover_num");
            LJ("video_cover_loaded", this.LJLLLLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
        }
        int i3 = this.LJLIIL;
        if (i3 != -1) {
            LIZLLL(i3, "face_cover_num");
        }
        if (C123100dR.LIZ(this.LJLILLLLZI)) {
            LJ("video_num_type", this.LJLILLLLZI);
            LIZLLL(this.LJLIL, "with_video_num");
        }
        if (!TextUtils.isEmpty(this.LJJLL)) {
            LJ("enter_method", this.LJJLL);
        }
        if (this.LJLI.length() > 0) {
            LJ("extra_name", this.LJLI);
        }
        if (this.LJJLIIIJILLIZJL == EnumC1260920iuw.ITEM) {
            Aweme aweme2 = this.LJJJJZ;
            if ((aweme2 != null && aweme2.getIsTikTokStory()) || ((aweme = this.LJJJJZ) != null && aweme.getAwemeType() == 40)) {
                LJ("story_type", "story");
            } else {
                LJ("story_type", "post");
            }
        }
        if (this.LJLJI) {
            LIZLLL(1, "is_bigcard");
        }
        LJ("is_related_rec", this.LJLJJI ? "1" : CardStruct.IStatusCode.DEFAULT);
        if (this.LJLJJI) {
            if (this.LJLJJL) {
                LJ("prev_follow_user_id", this.LJLJL);
            } else {
                LJ("from_user_id", this.LJLJL);
            }
            LIZLLL(this.LJLJLJ, "iterate_cnt");
        }
        int i4 = this.LJLLILLLL;
        if (i4 != -1) {
            LIZLLL(i4, "is_new_suggested");
        }
        Map<String, String> map = this.LJZ;
        if (map != null && !map.isEmpty()) {
            LIZIZ(this.LJZ);
        }
        LIZLLL(this.LJLZ, "has_badge");
        LJ("is_from_local_list", this.LJLJLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
        Boolean bool = this.LL;
        if (bool != null) {
            LIZLLL(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "is_private_account");
        }
        Boolean bool2 = this.LLD;
        if (bool2 != null) {
            LIZLLL(Intrinsics.LJFF(bool2, Boolean.TRUE) ? 1 : 0, "has_published_content");
        }
        Boolean bool3 = this.LLF;
        if (bool3 != null) {
            LIZLLL(Intrinsics.LJFF(bool3, Boolean.TRUE) ? 1 : 0, "has_repost");
        }
        Boolean bool4 = this.LLFF;
        if (bool4 != null) {
            LIZLLL(Intrinsics.LJFF(bool4, Boolean.TRUE) ? 1 : 0, "has_maf_tags");
        }
        Boolean bool5 = this.LLFFF;
        if (bool5 != null) {
            LIZLLL(Intrinsics.LJFF(bool5, Boolean.TRUE) ? 1 : 0, "has_follow_button");
        }
        Boolean bool6 = this.LLFII;
        if (bool6 != null) {
            LIZLLL(Intrinsics.LJFF(bool6, Boolean.TRUE) ? 1 : 0, "show_relation_label");
        }
        Boolean bool7 = this.LLFZ;
        if (bool7 != null) {
            LIZLLL(Intrinsics.LJFF(bool7, Boolean.TRUE) ? 1 : 0, "has_story_halo");
        }
        if (C123100dR.LIZ(this.LLI)) {
            LJ("friend_relation_type", this.LLI);
        }
        if (C123100dR.LIZ(this.LLIFFJFJJ)) {
            LJ("label_type", this.LLIFFJFJJ);
        }
        Integer num2 = this.LLII;
        LIZLLL(num2 != null ? num2.intValue() : 0, "cover_count");
        if (C304890BxH.LIZIZ()) {
            LIZLLL(this.LJLJJL ? 1 : 0, "is_rec_more_after_follow");
            LIZLLL(this.LJLJJLL, "rec_more_after_follow_index");
        }
        if (C296550Bjp.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            EnumC1260930iux enumC1260930iux2 = this.LJJLIIIJJI;
            sbLIZ.append(enumC1260930iux2 != null ? enumC1260930iux2.getType() : null);
            sbLIZ.append(", reqId=");
            sbLIZ.append(this.LJJLIL);
            sbLIZ.append(", toUserId=");
            sbLIZ.append(this.LJJLIIIJL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void LJJJJI() {
        boolean zIsEmpty = TextUtils.isEmpty(this.LJIJJ);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.LJJLJLI);
        if (((Boolean) C0AJE.LIZ.getValue()).booleanValue()) {
            if (zIsEmpty) {
                return;
            }
        } else if (zIsEmpty2 && zIsEmpty) {
            return;
        }
        LJIILJJIL();
    }

    public final void LJJJJLL() {
        HashMap<String, String> mobParams;
        String str;
        Aweme aweme = this.LJJJJZ;
        if (aweme == null || this.LJJLIIIJILLIZJL == null || (mobParams = aweme.getMobParams()) == null || (str = mobParams.get("scene_type")) == null) {
            return;
        }
        try {
            this.LJJLIIIJILLIZJL = LJJJ(str);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final String toString() {
        return "FollowRecommendEvent(previousPage='" + this.LJJLIIIJ + "', sceneType=" + this.LJJLIIIJILLIZJL + ", recType=" + this.LJIJJ + "actionType=" + this.LJJLIIIJJI + ", followType=" + this.LJJLIIIJJIZ + ", toUserId='" + this.LJJLIIIJL + "', groupId='" + this.LJJLIIIJLLLLLLLZ + "', authorId='" + this.LJJLIIJ + "', reqId='" + this.LJJLIL + "', homepageUserId='" + this.LJJLJ + "', friendTypeStr='" + this.LJJLJLI + "', enterMethod='" + this.LJJLL + "', awemeRelationRecommendModel=null, storyType='" + this.LJJZ + "', storyCollectionId='" + this.LJJZZI + "', position='" + this.LJJZZIII + "', previousPosition='" + this.LJL + "', extraName=" + this.LJLI + " enterFrom=" + this.LIZLLL + " nowType=" + this.LJLLI + " isNowClear=" + this.LJLLJ + ')';
    }

    public C1260910iuv(int i) {
        super("follow_recommend");
        this.LJJLIIIJ = "";
        this.LJJLIIIJL = "";
        this.LJJLIIIJLJLI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3467));
        this.LJJLIIIJLLLLLLLZ = "";
        this.LJJLIIJ = "";
        this.LJJLIL = "";
        this.LJJLJ = "";
        this.LJJLJLI = "";
        this.LJJLL = "";
        this.LJJZ = "";
        this.LJJZZI = "";
        this.LJJZZIII = "";
        this.LJL = "";
        this.LJLI = "";
        this.LJLIIIL = -1;
        this.LJLIIL = -1;
        this.LJLIL = -1;
        this.LJLILLLLZI = "";
        this.LJLJJLL = -1;
        this.LJLJLJ = -1;
        this.LJLLI = "";
        this.LJLLILLLL = -1;
        this.LJLLJ = "";
        this.LJLLL = 1;
        this.LJLLLL = -1;
        this.LJI = true;
    }

    public static EnumC1260930iux LJJIZ(String str) {
        EnumC1260930iux enumC1260930iux = EnumC1260930iux.SHOW;
        if (!Intrinsics.LJFF(str, enumC1260930iux.getType())) {
            EnumC1260930iux enumC1260930iux2 = EnumC1260930iux.FOLLOW;
            if (!Intrinsics.LJFF(str, enumC1260930iux2.getType())) {
                EnumC1260930iux enumC1260930iux3 = EnumC1260930iux.ENTER_PROFILE;
                if (!Intrinsics.LJFF(str, enumC1260930iux3.getType())) {
                    EnumC1260930iux enumC1260930iux4 = EnumC1260930iux.PROFILE_FOLLOW;
                    if (!Intrinsics.LJFF(str, enumC1260930iux4.getType())) {
                        EnumC1260930iux enumC1260930iux5 = EnumC1260930iux.CLOSE;
                        if (!Intrinsics.LJFF(str, enumC1260930iux5.getType())) {
                            EnumC1260930iux enumC1260930iux6 = EnumC1260930iux.FOLLOW_CANCEL;
                            if (!Intrinsics.LJFF(str, enumC1260930iux6.getType())) {
                                EnumC1260930iux enumC1260930iux7 = EnumC1260930iux.PROFILE_FOLLOW_CANCEL;
                                if (!Intrinsics.LJFF(str, enumC1260930iux7.getType())) {
                                    EnumC1260930iux enumC1260930iux8 = EnumC1260930iux.DISLIKE;
                                    if (!Intrinsics.LJFF(str, enumC1260930iux8.getType())) {
                                        EnumC1260930iux enumC1260930iux9 = EnumC1260930iux.ENTER_CHAT;
                                        if (!Intrinsics.LJFF(str, enumC1260930iux9.getType())) {
                                            EnumC1260930iux enumC1260930iux10 = EnumC1260930iux.SHARE_POP_UP;
                                            if (!Intrinsics.LJFF(str, enumC1260930iux10.getType())) {
                                                EnumC1260930iux enumC1260930iux11 = EnumC1260930iux.PROFILE_VIDEO_FOLLOW;
                                                if (!Intrinsics.LJFF(str, enumC1260930iux11.getType())) {
                                                    return null;
                                                }
                                                return enumC1260930iux11;
                                            }
                                            return enumC1260930iux10;
                                        }
                                        return enumC1260930iux9;
                                    }
                                    return enumC1260930iux8;
                                }
                                return enumC1260930iux7;
                            }
                            return enumC1260930iux6;
                        }
                        return enumC1260930iux5;
                    }
                    return enumC1260930iux4;
                }
                return enumC1260930iux3;
            }
            return enumC1260930iux2;
        }
        return enumC1260930iux;
    }

    public static EnumC1260920iuw LJJJ(String str) {
        EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.CARD;
        if (!Intrinsics.LJFF(str, enumC1260920iuw.getType())) {
            EnumC1260920iuw enumC1260920iuw2 = EnumC1260920iuw.POP_UP;
            if (!Intrinsics.LJFF(str, enumC1260920iuw2.getType())) {
                EnumC1260920iuw enumC1260920iuw3 = EnumC1260920iuw.ITEM;
                if (!Intrinsics.LJFF(str, enumC1260920iuw3.getType())) {
                    EnumC1260920iuw enumC1260920iuw4 = EnumC1260920iuw.SHARE_LINK;
                    if (!Intrinsics.LJFF(str, enumC1260920iuw4.getType())) {
                        EnumC1260920iuw enumC1260920iuw5 = EnumC1260920iuw.LOGIN;
                        if (!Intrinsics.LJFF(str, enumC1260920iuw5.getType())) {
                            EnumC1260920iuw enumC1260920iuw6 = EnumC1260920iuw.PUSH;
                            if (!Intrinsics.LJFF(str, enumC1260920iuw6.getType())) {
                                EnumC1260920iuw enumC1260920iuw7 = EnumC1260920iuw.INBOX_NOTICE;
                                if (!Intrinsics.LJFF(str, enumC1260920iuw7.getType())) {
                                    EnumC1260920iuw enumC1260920iuw8 = EnumC1260920iuw.RELATION_LABEL;
                                    if (!Intrinsics.LJFF(str, enumC1260920iuw8.getType())) {
                                        EnumC1260920iuw enumC1260920iuw9 = EnumC1260920iuw.INBOX_ADD_PHONE_BANNER;
                                        if (!Intrinsics.LJFF(str, enumC1260920iuw9.getType())) {
                                            return null;
                                        }
                                        return enumC1260920iuw9;
                                    }
                                    return enumC1260920iuw8;
                                }
                                return enumC1260920iuw7;
                            }
                            return enumC1260920iuw6;
                        }
                        return enumC1260920iuw5;
                    }
                    return enumC1260920iuw4;
                }
                return enumC1260920iuw3;
            }
            return enumC1260920iuw2;
        }
        return enumC1260920iuw;
    }

    public static String LJJJJ(ExternalRecommendReasonStruct externalRecommendReasonStruct) {
        if (externalRecommendReasonStruct != null) {
            if (externalRecommendReasonStruct.hashedPhoneNumber != null && C1076010e6h.LIZJ.LJIIJ().LIZJ()) {
                return "contact";
            }
            if (externalRecommendReasonStruct.externalUsername != null) {
                return "facebook";
            }
            return "";
        }
        return "";
    }

    @Override // X.AbstractC1386140mAu
    /* JADX INFO: renamed from: LJJIJIL, reason: merged with bridge method [inline-methods] */
    public final void LJIJI(Aweme aweme) {
        MatchedFriendStruct matchedFriendStruct;
        ExternalRecommendReasonStruct externalRecommendReasonStruct;
        super.LJIJI(aweme);
        if (aweme != null) {
            if (C123100dR.LIZ(C727520SgI.LIZ(aweme))) {
                String strLIZ = C727520SgI.LIZ(aweme);
                if (strLIZ == null) {
                    strLIZ = this.LJJLJLI;
                }
                this.LJJLJLI = strLIZ;
            }
            if (C123100dR.LIZ(C727520SgI.LIZJ(aweme))) {
                String strLIZJ = C727520SgI.LIZJ(aweme);
                if (strLIZJ == null) {
                    strLIZJ = this.LJIJJ;
                }
                this.LJIJJ = strLIZJ;
            }
            String groupId = aweme.getGroupId();
            String strLJJJJ = "";
            if (groupId == null) {
                groupId = "";
            }
            this.LJJLIIIJLLLLLLLZ = groupId;
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            if (authorUid == null) {
                authorUid = "";
            }
            this.LJJLIIJ = authorUid;
            if (this.LJLI.length() == 0) {
                User author = aweme.getAuthor();
                if (author != null && (((matchedFriendStruct = author.getMatchedFriendStruct()) != null && (externalRecommendReasonStruct = matchedFriendStruct.externalRecommendReasonStruct) != null) || (externalRecommendReasonStruct = author.getExternalRecommendReasonStruct()) != null)) {
                    strLJJJJ = LJJJJ(externalRecommendReasonStruct);
                }
                this.LJLI = strLJJJJ;
            }
            if (C123100dR.LIZ(this.LJJLJLI) && C123100dR.LIZ(this.LJIJJ)) {
                C1365450ldX.LIZLLL(this, aweme.getAuthor());
            }
        }
        LJJJJLL();
    }

    public final void LJJIJLIJ(String str) {
        if (str == null) {
            str = "";
        }
        this.LIZLLL = str;
    }

    public final void LJJIL(String str) {
        if (str == null) {
            str = "";
        }
        this.LJJLL = str;
    }

    public final void LJJJIL(MatchedFriendStruct matchedFriendStruct) {
        int iIntValue;
        int iIntValue2;
        if (matchedFriendStruct == null) {
            return;
        }
        Integer num = matchedFriendStruct.awemeListVideoCoverSize;
        int i = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.LJLIIIL = iIntValue;
        Integer num2 = matchedFriendStruct.faceCoverNum;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = this.LJLIIL;
        }
        this.LJLIIL = iIntValue2;
        String str = matchedFriendStruct.videoNumType;
        if (str == null) {
            str = this.LJLILLLLZI;
        }
        this.LJLILLLLZI = str;
        String str2 = matchedFriendStruct.recType;
        if (str2 == null) {
            str2 = this.LJIJJ;
        }
        this.LJIJJ = str2;
        String str3 = matchedFriendStruct.labelType;
        if (str3 == null) {
            str3 = this.LLIFFJFJJ;
        }
        this.LLIFFJFJJ = str3;
        String str4 = matchedFriendStruct.friendRelationType;
        if (str4 == null) {
            str4 = this.LLI;
        }
        this.LLI = str4;
        String str5 = matchedFriendStruct.relationType;
        if (str5 == null) {
            str5 = this.LJJLJLI;
        }
        this.LJJLJLI = str5;
        int i2 = this.LJLIL;
        if (i2 != -1) {
            i = i2;
        } else if (C123100dR.LIZ(str)) {
            i = 1;
        }
        this.LJLIL = i;
        if (C123100dR.LIZ(matchedFriendStruct.socialInfo)) {
            User user = new User();
            user.setSocialInfo(matchedFriendStruct.socialInfo);
            C1365450ldX.LIZLLL(this, user);
        }
    }

    public final void LJJJJIZL(String str) {
        if (str == null) {
            str = "";
        }
        this.LJJZZIII = str;
    }

    public final void LJJJJJ(String str) {
        if (str == null) {
            str = "";
        }
        this.LJJLIIIJ = str;
    }

    public final void LJJJJJL(String str) {
        if (str == null) {
            str = "";
        }
        this.LJIJJ = str;
    }

    public final void LJJJJL(String str) {
        if (str == null) {
            str = "";
        }
        this.LJJLJLI = str;
    }

    public final void LJJJJLI(String str) {
        if (C296550Bjp.LIZ()) {
            if (str != null) {
                this.LJJLIL = str;
            }
        } else {
            if (str == null) {
                str = "";
            }
            this.LJJLIL = str;
        }
    }

    public final void LJJJJZ(EnumC1260920iuw enumC1260920iuw) {
        this.LJJLIIIJILLIZJL = enumC1260920iuw;
        LJJJJLL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0111, code lost:
    
        r1 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJZI(com.ss.android.ugc.aweme.profile.model.User r4) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1260910iuv.LJJJJZI(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final void LJJJLIIL(C1252610ihX c1252610ihX) {
        C1261000iv4 c1261000iv4;
        int iIntValue;
        String str;
        String enterFrom = c1252610ihX.getEnterFrom();
        String str2 = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        this.LIZLLL = enterFrom;
        String previousPage = c1252610ihX.getPreviousPage();
        if (previousPage == null) {
            previousPage = "";
        }
        this.LJJLIIIJ = previousPage;
        this.LJJLIIIJILLIZJL = c1252610ihX.getSceneType();
        String recType = c1252610ihX.getRecType();
        if (recType == null) {
            recType = "";
        }
        this.LJIJJ = recType;
        this.LJJLIIIJJIZ = c1252610ihX.getFollowType();
        String toUserId = c1252610ihX.getToUserId();
        if (toUserId == null) {
            toUserId = "";
        }
        this.LJJLIIIJL = toUserId;
        String groupId = c1252610ihX.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        this.LJJLIIIJLLLLLLLZ = groupId;
        String authorId = c1252610ihX.getAuthorId();
        if (authorId == null) {
            authorId = "";
        }
        this.LJJLIIJ = authorId;
        String reqId = c1252610ihX.getReqId();
        if (reqId == null) {
            reqId = "";
        }
        this.LJJLIL = reqId;
        String homepageUserId = c1252610ihX.getHomepageUserId();
        if (homepageUserId == null) {
            homepageUserId = "";
        }
        this.LJJLJ = homepageUserId;
        String friendTypeStr = c1252610ihX.getFriendTypeStr();
        if (friendTypeStr == null) {
            friendTypeStr = "";
        }
        this.LJJLJLI = friendTypeStr;
        String enterMethod = c1252610ihX.getEnterMethod();
        if (enterMethod == null) {
            enterMethod = "";
        }
        this.LJJLL = enterMethod;
        String position = c1252610ihX.getPosition();
        if (position == null) {
            position = "";
        }
        this.LJJZZIII = position;
        String nowType = c1252610ihX.getNowType();
        if (nowType == null) {
            nowType = "";
        }
        this.LJLLI = nowType;
        String strIsNowClear = c1252610ihX.isNowClear();
        if (strIsNowClear == null) {
            strIsNowClear = "";
        }
        this.LJLLJ = strIsNowClear;
        this.LJJIJLIJ = c1252610ihX.getSearchId();
        if (c1252610ihX.getSocialInfo() != null) {
            User user = new User();
            user.setSocialInfo(c1252610ihX.getSocialInfo());
            C1365450ldX.LIZLLL(this, user);
        }
        MatchedFriendStruct matchedFriendStruct = c1252610ihX.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            Integer num = matchedFriendStruct.awemeListSize;
            int iIntValue2 = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            this.LJLIIIL = iIntValue;
            Integer num2 = matchedFriendStruct.faceCoverNum;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            this.LJLIIL = iIntValue2;
            String str3 = matchedFriendStruct.videoNumType;
            if (str3 == null) {
                str = "";
            } else {
                str = str3;
            }
            this.LJLILLLLZI = str;
            this.LJLIL = C123100dR.LIZ(str3) ? 1 : 0;
            String str4 = matchedFriendStruct.labelType;
            if (str4 == null) {
                str4 = "";
            }
            this.LLIFFJFJJ = str4;
            String str5 = matchedFriendStruct.friendRelationType;
            if (str5 != null) {
                str2 = str5;
            }
            this.LLI = str2;
        }
        AbstractC1261010iv5 from = c1252610ihX.getFrom();
        if ((from instanceof C1261000iv4) && (c1261000iv4 = (C1261000iv4) from) != null) {
            String uid = c1261000iv4.getUid();
            int iterateCnt = c1261000iv4.getIterateCnt();
            boolean zIsRelatedRec = c1252610ihX.isRelatedRec();
            boolean zIsRelatedRec2 = c1252610ihX.isRelatedRec();
            int indexOfRecMore = c1261000iv4.getIndexOfRecMore();
            this.LJLJJI = zIsRelatedRec;
            this.LJLJL = uid;
            this.LJLJLJ = iterateCnt;
            this.LJLJJL = zIsRelatedRec2;
            this.LJLJJLL = indexOfRecMore;
        }
        AbstractC1261010iv5 from2 = c1252610ihX.getFrom();
        if ((from2 instanceof C1261030iv7) && from2 != null) {
            this.LJLJLLL = true;
        }
    }

    public final void LJJIJL(Aweme aweme, C1261860iwS c1261860iwS) {
        String uid;
        MatchedFriendStruct matchedFriendStruct;
        ExternalRecommendReasonStruct externalRecommendReasonStruct;
        super.LJIJI(aweme);
        LJIJI(aweme);
        String strLJJJJ = "";
        if (c1261860iwS == null || (uid = c1261860iwS.getUid()) == null) {
            uid = "";
        }
        this.LJJLIIJ = uid;
        if (this.LJLI.length() == 0) {
            if (c1261860iwS != null && (((matchedFriendStruct = c1261860iwS.getMatchedFriendStruct()) != null && (externalRecommendReasonStruct = matchedFriendStruct.externalRecommendReasonStruct) != null) || (externalRecommendReasonStruct = c1261860iwS.getExternalRecommendReasonStruct()) != null)) {
                strLJJJJ = LJJJJ(externalRecommendReasonStruct);
            }
            this.LJLI = strLJJJJ;
        }
        if (C123100dR.LIZ(this.LJJLJLI) && C123100dR.LIZ(this.LJIJJ)) {
            C1365450ldX.LIZLLL(this, c1261860iwS);
        }
    }

    public final void LJJJI(String str, boolean z) {
        if (str == null) {
            str = this.LIZLLL;
        }
        if (Intrinsics.LJFF(str, "find_friends_page") || Intrinsics.LJFF(str, "now_find_friends_page")) {
            this.LJLLILLLL = z ? 1 : 0;
        }
    }
}
