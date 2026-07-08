package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;

/* JADX INFO: renamed from: X.0ida, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250160ida {
    public static ProfileUser LIZIZ;
    public static ProfileUser LIZJ;
    public static ProfileUser LIZLLL;
    public static final C1250160ida LIZ = new C1250160ida();
    public static final Keva LJ = Keva.getRepo("profile_page_model_file");
    public static volatile Object LJFF = new Object();

    static {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0Yzd
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String uid;
                String nickname;
                String uid2;
                String nickname2;
                String uid3 = null;
                if (!z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type: ");
                    sbLIZ.append(i);
                    sbLIZ.append(" failed, nickname:");
                    if (user != null) {
                        nickname2 = user.getNickname();
                    } else {
                        nickname2 = null;
                    }
                    sbLIZ.append(nickname2);
                    sbLIZ.append(" , uid:");
                    if (user != null) {
                        uid3 = user.getUid();
                    }
                    sbLIZ.append(uid3);
                    C1720106oR.LJI("Profile.ProfilePageModelStore", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                if (i == 4) {
                    int i3 = C2187451AjH.LIZ;
                    C1720106oR.LJI("Profile.ProfilePageModelStore", "account login end cancel");
                    return;
                }
                if (i == 3) {
                    Keva keva = C1250160ida.LJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("profile_page_model_");
                    if (user != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    sbLIZ2.append(uid);
                    keva.erase(C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("account logout nickname: ");
                    if (user != null) {
                        nickname = user.getNickname();
                    } else {
                        nickname = null;
                    }
                    sbLIZ3.append(nickname);
                    sbLIZ3.append(", uid:");
                    if (user != null) {
                        uid2 = user.getUid();
                    } else {
                        uid2 = null;
                    }
                    sbLIZ3.append(uid2);
                    C1720106oR.LJI("Profile.ProfilePageModelStore", C2188811AlT.LIZIZ(sbLIZ3));
                    C1250160ida.LIZIZ = null;
                    return;
                }
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("type: ");
                sbLIZ4.append(i);
                sbLIZ4.append(", re load profile user, curAccount: ");
                sbLIZ4.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getNickname());
                sbLIZ4.append(", uid:");
                sbLIZ4.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid());
                C1720106oR.LJI("Profile.ProfilePageModelStore", C2188811AlT.LIZIZ(sbLIZ4));
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C892400Yze(null), 3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[Catch: all -> 0x0146, TryCatch #0 {all -> 0x0146, blocks: (B:6:0x000b, B:8:0x0014, B:10:0x001f, B:11:0x0040, B:13:0x004f, B:15:0x0053, B:16:0x005d, B:21:0x0071, B:24:0x0079, B:28:0x009f, B:29:0x00a9, B:31:0x00b7, B:33:0x00bb, B:35:0x00bf, B:37:0x00c3, B:39:0x00cb, B:41:0x00cf, B:43:0x00d7, B:44:0x00d9, B:46:0x00e1, B:47:0x0102, B:48:0x0104, B:19:0x0066, B:23:0x0075, B:27:0x007e), top: B:70:0x000b, outer: #3, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1250160ida.LIZ(java.lang.String, boolean):void");
    }

    public static ProfileUser LIZIZ(String str, boolean z) {
        ProfileUser profileUser;
        if (z && (profileUser = LIZLLL) != null) {
            return profileUser;
        }
        LIZ(str, false);
        if (z) {
            LIZLLL = LIZJ;
        }
        return LIZJ;
    }

    public static void LIZJ(ProfileUser profileUser, boolean z) {
        if (profileUser == null) {
            return;
        }
        synchronized (LJFF) {
            try {
                LIZIZ = profileUser;
                if (z) {
                    try {
                        Keva keva = LJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("profile_page_model_");
                        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        String strLIZIZ2 = C1250210idf.LIZIZ(profileUser);
                        if (strLIZIZ2 == null) {
                            strLIZIZ2 = "";
                        }
                        keva.storeString(strLIZIZ, strLIZIZ2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        int i = C2187451AjH.LIZ;
                        C1720106oR.LIZIZ("Profile.ProfilePageModelStore", "updatePageModel exception: ", th.getCause());
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
