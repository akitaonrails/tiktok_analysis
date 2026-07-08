package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.recuser.IRecUserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0izv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264010izv {
    public static final C1264010izv LIZ = new C1264010izv();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(801));
    public static final InterfaceC1056430db7 LIZJ = ((IRecUserService) ServiceManager.get().getService(IRecUserService.class)).LJIILL();
    public static final int LIZLLL = R.raw.icon_phone_book_fill;
    public static final int LJ;
    public static final HashMap<String, Integer> LJFF;
    public static final Regex LJI;

    static {
        Integer numValueOf = Integer.valueOf(R.raw.icon_link_fill);
        Integer numValueOf2 = Integer.valueOf(R.raw.icon_two_person_large_fill);
        LJ = R.raw.icon_two_person_large_fill;
        LJFF = C2097608Jq.LJI(new Pair("pymk", numValueOf2), new Pair("from_your_contacts", Integer.valueOf(R.raw.icon_phone_book_fill)), new Pair("relationshiplabel_contacts_and_fb", numValueOf2), new Pair("follows_you", Integer.valueOf(R.raw.icon_follower)), new Pair("linkLabelRedesign_videos_relationshipLabel_text", numValueOf), new Pair("linkLabelRedesign_videos_relationshipLabel_text2", numValueOf), new Pair("linkLabelRedesign_photos_relationshipLabel_text", numValueOf), new Pair("linkLabelRedesign_photos_relationshipLabel_text2", numValueOf), new Pair("linkLabelRedesign_generic_relationshipLabel_text4", numValueOf));
        LJI = new Regex("\\{(\\d+|[a-zA-Z_]+)\\}");
    }

    public static Integer LIZ(String str) {
        return LJFF.get(str);
    }

    public static C1264020izw LIZIZ(MatchedFriendStruct matchedFriendStruct) {
        String str;
        String strLJI;
        Integer numValueOf;
        String str2;
        if (matchedFriendStruct != null) {
            str = matchedFriendStruct.recommendReason;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            if (matchedFriendStruct != null) {
                strLJI = matchedFriendStruct.recommendReason;
                str2 = matchedFriendStruct.recommendReasonStarling;
            } else {
                strLJI = null;
                str2 = null;
            }
            numValueOf = LIZ(str2);
        } else {
            strLJI = C20642515q3.LJI(2131845714);
            numValueOf = Integer.valueOf(LJ);
        }
        if (strLJI == null) {
            strLJI = "";
        }
        return new C1264020izw(new C1153800g8A(strLJI, C13BV.INSTANCE), null, numValueOf);
    }

    public static C1264020izw LIZJ(MatchedFriendStruct matchedFriendStruct) {
        String str;
        String str2;
        String str3;
        ExternalRecommendReasonStruct externalRecommendReasonStruct = matchedFriendStruct.externalRecommendReasonStruct;
        if (externalRecommendReasonStruct != null) {
            str = externalRecommendReasonStruct.reason;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            ExternalRecommendReasonStruct externalRecommendReasonStruct2 = matchedFriendStruct.externalRecommendReasonStruct;
            if (externalRecommendReasonStruct2 != null) {
                str2 = externalRecommendReasonStruct2.reason;
                str3 = externalRecommendReasonStruct2.reasonStarling;
            } else {
                str2 = null;
                str3 = null;
            }
            Integer numLIZ = LIZ(str3);
            if (str2 == null) {
                str2 = "";
            }
            return new C1264020izw(new C1153800g8A(str2, C13BV.INSTANCE), null, numLIZ);
        }
        return LIZIZ(null);
    }

    public static List LIZLLL(MatchedFriendStruct matchedFriendStruct) {
        List<MutualUser> list;
        String nickname;
        ArrayList arrayList = new ArrayList();
        MutualStruct mutualStruct = matchedFriendStruct.mMutualStruct;
        if (mutualStruct != null && (list = mutualStruct.userList) != null) {
            for (MutualUser mutualUser : list) {
                if (mutualUser != null && (nickname = mutualUser.getNickname()) != null) {
                    arrayList.add(nickname);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1264020izw LJIIJ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r6) {
        /*
            java.lang.String r5 = r6.recommendReason
            r1 = 2131845714(0x7f116252, float:1.9324857E38)
            if (r5 == 0) goto L13
            int r0 = r5.length()
            if (r0 != 0) goto L17
            java.lang.String r5 = X.C20642515q3.LJI(r1)
            if (r5 != 0) goto L17
        L13:
            java.lang.String r5 = X.C20642515q3.LJI(r1)
        L17:
            java.lang.String r1 = r6.recommendReasonStarling
            if (r1 == 0) goto L3c
            X.0izv r0 = X.C1264010izv.LIZ
            r0.getClass()
            java.lang.Integer r0 = LIZ(r1)
            if (r0 == 0) goto L3c
            int r4 = r0.intValue()
        L2a:
            X.0izw r3 = new X.0izw
            X.0g8A r2 = new X.0g8A
            X.13BV r0 = X.C13BV.INSTANCE
            r2.<init>(r5, r0)
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.<init>(r2, r1, r0)
            return r3
        L3c:
            int r4 = X.C1264010izv.LJ
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1264010izv.LJIIJ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct):X.0izw");
    }

    public static C1264020izw LJ(MatchedFriendStruct matchedFriendStruct, C10KJ c10kj) {
        boolean z;
        String strLJI;
        Integer numLIZ;
        EnumC1056390db3 reason;
        C1056400db4 c1056400db4;
        ArrayList arrayList = new ArrayList();
        String str = matchedFriendStruct.recommendReason;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            strLJI = C20642515q3.LJI(2131834977);
            numLIZ = Integer.valueOf(LIZLLL);
        } else {
            strLJI = matchedFriendStruct.recommendReason;
            if (strLJI == null) {
                strLJI = "";
            }
            numLIZ = LIZ(matchedFriendStruct.recommendReasonStarling);
        }
        EnumC1056390db3 enumC1056390db3 = null;
        if (c10kj.LIZ == EnumC1264040izy.NOW_POST) {
            strLJI = C20642515q3.LJI(2131834977);
            numLIZ = Integer.valueOf(LIZLLL);
        } else {
            try {
                String strLJI2 = C20642515q3.LJI(2131845976);
                Integer numValueOf = Integer.valueOf(LJ);
                ExternalRecommendReasonStruct externalRecommendReasonStruct = matchedFriendStruct.externalRecommendReasonStruct;
                if (externalRecommendReasonStruct != null) {
                    String str2 = externalRecommendReasonStruct.hashedPhoneNumber;
                    if (C123100dR.LIZ(str2) && str2 != null) {
                        arrayList.add(LIZJ.LIZIZ(str2));
                    }
                }
                if (!arrayList.isEmpty()) {
                    new C1056470dbB(matchedFriendStruct.recType, C1264060j00.LIZ(c10kj), EnumC1070410dxf.CONTACT, true, enumC1056390db3, 32).LIZLLL(null);
                    strLJI = strLJI2;
                    numLIZ = numValueOf;
                } else {
                    throw new Exception("no contact fetched");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                arrayList.clear();
                String str3 = matchedFriendStruct.recType;
                String strLIZ = C1264060j00.LIZ(c10kj);
                EnumC1070410dxf enumC1070410dxf = EnumC1070410dxf.CONTACT;
                boolean z2 = false;
                if (!(e instanceof C1056400db4) || (c1056400db4 = (C1056400db4) e) == null || (reason = c1056400db4.getReason()) == null) {
                    reason = EnumC1056390db3.UNKNOWN;
                }
                new C1056470dbB(str3, strLIZ, enumC1070410dxf, z2, reason, 32).LIZLLL(null);
            }
        }
        return new C1264020izw(new C1153800g8A(strLJI, arrayList), null, numLIZ);
    }

    public static C1264020izw LJFF(MatchedFriendStruct matchedFriendStruct, C10KJ c10kj) {
        boolean z;
        String strLJI;
        Integer numLIZ;
        EnumC1056390db3 reason;
        C1056400db4 c1056400db4;
        String str;
        ArrayList arrayList = new ArrayList();
        String str2 = matchedFriendStruct.recommendReason;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            strLJI = C20642515q3.LJI(2131845714);
            numLIZ = Integer.valueOf(LJ);
        } else {
            strLJI = matchedFriendStruct.recommendReason;
            if (strLJI == null) {
                strLJI = "";
            }
            numLIZ = LIZ(matchedFriendStruct.recommendReasonStarling);
        }
        EnumC1056390db3 enumC1056390db3 = null;
        if (c10kj.LIZ == EnumC1264040izy.NOW_POST) {
            strLJI = C20642515q3.LJI(2131845714);
            numLIZ = Integer.valueOf(LJ);
        } else {
            try {
                String strLJI2 = C20642515q3.LJI(2131845976);
                Integer numValueOf = Integer.valueOf(LJ);
                ExternalRecommendReasonStruct externalRecommendReasonStruct = matchedFriendStruct.externalRecommendReasonStruct;
                if (externalRecommendReasonStruct != null && (str = externalRecommendReasonStruct.externalUsername) != null) {
                    arrayList.add(str);
                }
                if (!arrayList.isEmpty()) {
                    new C1056470dbB(matchedFriendStruct.recType, C1264060j00.LIZ(c10kj), EnumC1070410dxf.FACEBOOK, true, enumC1056390db3, 32).LIZLLL(null);
                    strLJI = strLJI2;
                    numLIZ = numValueOf;
                } else {
                    throw new Exception("no fb friend fetched");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                arrayList.clear();
                String str3 = matchedFriendStruct.recType;
                String strLIZ = C1264060j00.LIZ(c10kj);
                EnumC1070410dxf enumC1070410dxf = EnumC1070410dxf.FACEBOOK;
                boolean z2 = false;
                if (!(e instanceof C1056400db4) || (c1056400db4 = (C1056400db4) e) == null || (reason = c1056400db4.getReason()) == null) {
                    reason = EnumC1056390db3.UNKNOWN;
                }
                new C1056470dbB(str3, strLIZ, enumC1070410dxf, z2, reason, 32).LIZLLL(null);
            }
        }
        return new C1264020izw(new C1153800g8A(strLJI, arrayList), null, numLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1264020izw LJI(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r12, X.C10KJ r13) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1264010izv.LJI(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct, X.10KJ):X.0izw");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1264020izw LJII(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r12, X.C10KJ r13) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1264010izv.LJII(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct, X.10KJ):X.0izw");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1264020izw LJIIIIZZ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r12, X.C10KJ r13) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1264010izv.LJIIIIZZ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct, X.10KJ):X.0izw");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1264020izw LJIIIZ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r12, X.C10KJ r13) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1264010izv.LJIIIZ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct, X.10KJ):X.0izw");
    }
}
