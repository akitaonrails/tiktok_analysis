package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.friends.model.SchoolMutualStruct;
import com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0izu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264000izu {
    public static final String LIZIZ(String str) {
        return new Regex("\\{\\d+\\}").replace(str, "%s");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x010f, code lost:
    
        if (r1.equals("3-14") == false) goto L83;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1264020izw LIZ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r3, X.C10KJ r4) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1264000izu.LIZ(com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct, X.10KJ):X.0izw");
    }

    public static final C1264020izw LIZJ(MatchedFriendStruct matchedFriendStruct, C10KJ c10kj) {
        C1264050izz c1264050izz;
        boolean z;
        boolean z2;
        String str;
        Integer numValueOf;
        Integer numValueOf2;
        String str2;
        Integer numValueOf3;
        List<Object> list;
        List<Object> list2;
        C1264020izw c1264020izwLJIIJ;
        List<MutualUser> list3;
        C1246110iX3 c1246110iX3LIZIZ;
        SchoolMutualStruct schoolMutualStruct;
        String str3;
        String str4;
        String strLIZIZ = "";
        Integer numValueOf4 = null;
        if (C1245620iWG.LIZ() && (schoolMutualStruct = matchedFriendStruct.schoolMutualStruct) != null && (str3 = schoolMutualStruct.anchor) != null && str3.length() != 0) {
            SchoolMutualStruct schoolMutualStruct2 = matchedFriendStruct.schoolMutualStruct;
            if (schoolMutualStruct2 != null && (str4 = schoolMutualStruct2.anchor) != null) {
                strLIZIZ = str4;
            }
            return new C1264020izw(new C1153800g8A(strLIZIZ, C13BV.INSTANCE), null, null);
        }
        if (C0AJN.LIZIZ) {
            C1264020izw c1264020izwLIZ = LIZ(matchedFriendStruct, c10kj);
            try {
                if (C304890BxH.LIZ() == 2 && Intrinsics.LJFF(matchedFriendStruct.isRecMore(), Boolean.TRUE)) {
                    C1264010izv.LIZ.getClass();
                    C1153800g8A c1153800g8A = new C1153800g8A(a0.LJLIIIL(C1264010izv.LJI.replace(C20642515q3.LJI(2131830727), "")).toString(), C13BV.INSTANCE);
                    if (c10kj.LIZIZ) {
                        c1246110iX3LIZIZ = C1246100iX2.LIZIZ(matchedFriendStruct);
                    } else {
                        c1246110iX3LIZIZ = null;
                    }
                    c1264020izwLJIIJ = new C1264020izw(c1153800g8A, c1246110iX3LIZIZ, null);
                } else {
                    MutualStruct mutualStruct = matchedFriendStruct.mMutualStruct;
                    if (mutualStruct != null && (list3 = mutualStruct.userList) != null && !list3.isEmpty()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("");
                        sbLIZ.append("Reached 2nd degree relationship branch");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C1264010izv.LIZ.getClass();
                        c1264020izwLJIIJ = C1264010izv.LJI(matchedFriendStruct, c10kj);
                    } else {
                        ExternalRecommendReasonStruct externalRecommendReasonStruct = matchedFriendStruct.externalRecommendReasonStruct;
                        if (externalRecommendReasonStruct != null) {
                            if (externalRecommendReasonStruct.externalUsername != null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("");
                                sbLIZ2.append("Reached 1-2 Facebook branch");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                C1264010izv.LIZ.getClass();
                                c1264020izwLJIIJ = C1264010izv.LJFF(matchedFriendStruct, c10kj);
                            } else if (externalRecommendReasonStruct.hashedPhoneNumber != null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("");
                                sbLIZ3.append("Reached 1-1 Contact branch");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                C1264010izv.LIZ.getClass();
                                c1264020izwLJIIJ = C1264010izv.LJ(matchedFriendStruct, c10kj);
                            } else {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("");
                                sbLIZ4.append("Reached external default branch");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                                C1264010izv.LIZ.getClass();
                                c1264020izwLJIIJ = C1264010izv.LIZJ(matchedFriendStruct);
                            }
                        } else {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("");
                            sbLIZ5.append("Reached pure text label data branch");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                            C1264010izv.LIZ.getClass();
                            c1264020izwLJIIJ = C1264010izv.LJIIJ(matchedFriendStruct);
                        }
                    }
                }
                c1264050izz = new C1264050izz(c1264020izwLJIIJ, strLIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZIZ);
                sbLIZ6.append("Reached catch exception branch");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
                C1264010izv.LIZ.getClass();
                c1264050izz = new C1264050izz(C1264010izv.LIZIZ(matchedFriendStruct), strLIZIZ2);
            }
            C1264020izw c1264020izw = c1264050izz.LIZ;
            String str5 = c1264050izz.LIZIZ;
            boolean z3 = !Intrinsics.LJFF(c1264020izwLIZ.LIZ, c1264020izw.LIZ);
            boolean z4 = !Intrinsics.LJFF(c1264020izwLIZ.LIZIZ, c1264020izw.LIZIZ);
            String str6 = matchedFriendStruct.recType;
            if (matchedFriendStruct.mMutualStruct != null) {
                z = true;
            } else {
                z = false;
            }
            if (matchedFriendStruct.externalRecommendReasonStruct != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!Intrinsics.LJFF(c1264020izwLIZ.LIZ, c1264020izw.LIZ) || !Intrinsics.LJFF(c1264020izwLIZ.LIZIZ, c1264020izw.LIZIZ)) {
                C1264010izv.LIZ.getClass();
                C1910890zpH c1910890zpH = (C1910890zpH) C1264010izv.LIZIZ.getValue();
                StringBuilder sb = new StringBuilder();
                C2327709Ad.LJ(sb, "original label is ", c1264020izwLIZ, "\n");
                C2327709Ad.LJ(sb, "refactored label is ", c1264020izw, "\n");
                C2327709Ad.LJ(sb, "textInfo changed is ", Boolean.valueOf(z3), "\n");
                C2327709Ad.LJ(sb, "avatarInfo changed is ", Boolean.valueOf(z4), "\n");
                C2327709Ad.LJFF(sb, "recType is ", str6, "\n");
                C2327709Ad.LJ(sb, "has MutualStruct is ", Boolean.valueOf(z), "\n");
                C2327709Ad.LJ(sb, "has ExternalRecommendReasonStruct is ", Boolean.valueOf(z2), "\n");
                String[] strArr = new String[3];
                strArr[0] = "originalLabel.textInfo?.formatString is ";
                C1153800g8A c1153800g8A2 = c1264020izwLIZ.LIZ;
                if (c1153800g8A2 != null) {
                    str = c1153800g8A2.LIZ;
                } else {
                    str = null;
                }
                strArr[1] = str;
                strArr[2] = "\n";
                C2327709Ad.LJFF(sb, strArr);
                Object[] objArr = new Object[3];
                objArr[0] = "originalLabel.avatarInfo?.srcList?.size is ";
                C1246110iX3 c1246110iX3 = c1264020izwLIZ.LIZIZ;
                if (c1246110iX3 != null && (list2 = c1246110iX3.LIZ) != null) {
                    numValueOf = Integer.valueOf(list2.size());
                } else {
                    numValueOf = null;
                }
                objArr[1] = numValueOf;
                objArr[2] = "\n";
                C2327709Ad.LJ(sb, objArr);
                Object[] objArr2 = new Object[3];
                objArr2[0] = "originalLabel.avatarInfo?.total is ";
                C1246110iX3 c1246110iX32 = c1264020izwLIZ.LIZIZ;
                if (c1246110iX32 != null) {
                    numValueOf2 = Integer.valueOf(c1246110iX32.LIZIZ);
                } else {
                    numValueOf2 = null;
                }
                objArr2[1] = numValueOf2;
                objArr2[2] = "\n";
                C2327709Ad.LJ(sb, objArr2);
                String[] strArr2 = new String[3];
                strArr2[0] = "refactoredLabel.textInfo?.formatString is ";
                C1153800g8A c1153800g8A3 = c1264020izw.LIZ;
                if (c1153800g8A3 != null) {
                    str2 = c1153800g8A3.LIZ;
                } else {
                    str2 = null;
                }
                strArr2[1] = str2;
                strArr2[2] = "\n";
                C2327709Ad.LJFF(sb, strArr2);
                Object[] objArr3 = new Object[3];
                objArr3[0] = "refactoredLabel.avatarInfo?.srcList?.size is ";
                C1246110iX3 c1246110iX33 = c1264020izw.LIZIZ;
                if (c1246110iX33 != null && (list = c1246110iX33.LIZ) != null) {
                    numValueOf3 = Integer.valueOf(list.size());
                } else {
                    numValueOf3 = null;
                }
                objArr3[1] = numValueOf3;
                objArr3[2] = "\n";
                C2327709Ad.LJ(sb, objArr3);
                Object[] objArr4 = new Object[3];
                objArr4[0] = "refactoredLabel.avatarInfo?.total is ";
                C1246110iX3 c1246110iX34 = c1264020izw.LIZIZ;
                if (c1246110iX34 != null) {
                    numValueOf4 = Integer.valueOf(c1246110iX34.LIZIZ);
                }
                objArr4[1] = numValueOf4;
                objArr4[2] = "\n";
                C2327709Ad.LJ(sb, objArr4);
                C2327709Ad.LJFF(sb, "newLabelBranchInfo is ", str5, ".\n");
                c1910890zpH.LJII("relation_label_refactor", sb.toString());
            }
            return c1264020izw;
        }
        return LIZ(matchedFriendStruct, c10kj);
    }
}
