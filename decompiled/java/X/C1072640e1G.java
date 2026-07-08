package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072640e1G {
    public static final C1072640e1G LIZ = new C1072640e1G();

    public static boolean LIZIZ() {
        return ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getSocialData().getEnablePermissionPopup();
    }

    public static InterfaceC1072760e1S LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return new InterfaceC1072760e1S() { // from class: X.0e1L
                        @Override // X.InterfaceC1072760e1S
                        public final int LIZ() {
                            return 0;
                        }

                        @Override // X.InterfaceC1072760e1S
                        public final boolean LIZJ(C19EG c19eg) {
                            return false;
                        }

                        @Override // X.InterfaceC1072760e1S
                        public final Pair<Boolean, Boolean> LIZIZ() {
                            Boolean bool = Boolean.TRUE;
                            return new Pair<>(bool, bool);
                        }
                    };
                }
                return new InterfaceC1072760e1S() { // from class: X.0e1k
                    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(486));

                    @Override // X.InterfaceC1072760e1S
                    public final int LIZ() {
                        return 3;
                    }

                    @Override // X.InterfaceC1072760e1S
                    public final Pair<Boolean, Boolean> LIZIZ() {
                        return new Pair<>(Boolean.valueOf(C1072930e1j.LJ() || C1072930e1j.LIZLLL()), Boolean.FALSE);
                    }

                    @Override // X.InterfaceC1072760e1S
                    public final boolean LIZJ(C19EG c19eg) {
                        if (C1072930e1j.LIZJ() || ((Number) this.LIZ.getValue()).intValue() != 3 || !C0XQ7.LJFF().isLogin() || C10EU.LJIIIZ()) {
                            return false;
                        }
                        long jLJIJ = ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIJ();
                        if (jLJIJ == 0) {
                            jLJIJ = C1072930e1j.LIZIZ.getLong("key_first_launch_time", 0L);
                        }
                        if (jLJIJ == 0 || System.currentTimeMillis() - jLJIJ < TimeUnit.DAYS.toMillis(C1072930e1j.LIZIZ.getLong("key_rec_friends_frequency", 30L))) {
                            return false;
                        }
                        return true;
                    }
                };
            }
            return new InterfaceC1072760e1S() { // from class: X.0e1H
                @Override // X.InterfaceC1072760e1S
                public final int LIZ() {
                    return 2;
                }

                @Override // X.InterfaceC1072760e1S
                public final Pair<Boolean, Boolean> LIZIZ() {
                    List<SocialPlatformSetting> socialPlatformSettings;
                    SocialDataStruct socialData = C0XQ7.LJFF().getCurUser().getSocialData();
                    if (socialData != null && (socialPlatformSettings = socialData.getSocialPlatformSettings()) != null) {
                        for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                            if (socialPlatformSetting.getSocialPlatform() == 2) {
                                return new Pair<>(Boolean.valueOf(!socialPlatformSetting.getSyncStatus() && socialPlatformSetting.getDisplayConsentPage()), Boolean.valueOf(socialPlatformSetting.getSyncStatus()));
                            }
                        }
                    }
                    Boolean bool = Boolean.TRUE;
                    return new Pair<>(bool, bool);
                }

                @Override // X.InterfaceC1072760e1S
                public final boolean LIZJ(C19EG c19eg) {
                    if (!SocialMonoFreqControlService.LIZIZ().LIZ(C1E7L.AUTH_FB)) {
                        return false;
                    }
                    C1072640e1G.LIZ.getClass();
                    int iLIZLLL = C1072640e1G.LIZLLL(2);
                    if ((iLIZLLL != 4 && iLIZLLL != 6) || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || C10EU.LJIIIZ()) {
                        return false;
                    }
                    C0XQ7.LJ();
                    if (!Intrinsics.LJFF(C0XQ7.LIZ.LJIIL().getLatestLoginMethodName(), "facebook") || !C0XPA.LIZLLL.LIZ("facebook") || C1076010e6h.LIZJ.LJII().LJIIIIZZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()).length() == 0 || !C1072640e1G.LJFF(2)) {
                        return false;
                    }
                    return true;
                }
            };
        }
        return new InterfaceC1072760e1S() { // from class: X.0e1I
            @Override // X.InterfaceC1072760e1S
            public final int LIZ() {
                return 1;
            }

            @Override // X.InterfaceC1072760e1S
            public final Pair<Boolean, Boolean> LIZIZ() {
                List<SocialPlatformSetting> socialPlatformSettings;
                SocialDataStruct socialData = C0XQ7.LJFF().getCurUser().getSocialData();
                if (socialData != null && (socialPlatformSettings = socialData.getSocialPlatformSettings()) != null) {
                    for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                        if (socialPlatformSetting.getSocialPlatform() == 1) {
                            return new Pair<>(Boolean.valueOf(!C1072630e1F.LIZ.LIZJ()), Boolean.valueOf(socialPlatformSetting.getSyncStatus()));
                        }
                    }
                }
                Boolean bool = Boolean.TRUE;
                return new Pair<>(bool, bool);
            }

            @Override // X.InterfaceC1072760e1S
            public final boolean LIZJ(C19EG c19eg) {
                C1072640e1G.LIZ.getClass();
                int iLIZLLL = C1072640e1G.LIZLLL(1);
                if ((iLIZLLL != 4 && iLIZLLL != 6) || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || C0XQ7.LIZJ().isLoginActivity(c19eg) || C10EU.LJIIIZ() || !C1072640e1G.LJFF(1)) {
                    return false;
                }
                C19741112Lp.LIZ.getClass();
                if (!C19741112Lp.LJI(c19eg, "android.permission.READ_CONTACTS", false)) {
                    return true;
                }
                return false;
            }
        };
    }

    public static C11O8 LIZJ(final EnumC1074240e3q enumC1074240e3q) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0daY
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<List<Integer>> c09aj) throws Throwable {
                C1C7U.LIZ("SocialFriendsHelper@b1e6.getContactModel$1");
                C23250099c.LJ(C23271099x.INSTANCE, new C1056070daX(enumC1074240e3q, c09aj, null));
                C1C7U.LIZIZ("SocialFriendsHelper@b1e6.getContactModel$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public static int LIZLLL(int i) {
        List<SocialPlatformSetting> socialPlatformSettings;
        SocialDataStruct socialData = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getSocialData();
        if (socialData != null && (socialPlatformSettings = socialData.getSocialPlatformSettings()) != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == i) {
                    return socialPlatformSetting.getOnBoardingRecStrategy();
                }
            }
            return 0;
        }
        return 0;
    }

    public static boolean LJFF(int i) {
        String str = C1072670e1J.LIZIZ;
        C1072670e1J c1072670e1JLIZ = C1072680e1K.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("go_through_social_recommend_flow");
        sbLIZ.append(i);
        boolean z = c1072670e1JLIZ.LIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        C1072670e1J c1072670e1JLIZ2 = C1072680e1K.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("go_through_time_ms");
        sbLIZ2.append(i);
        long j = c1072670e1JLIZ2.LIZ.getLong(C2188811AlT.LIZIZ(sbLIZ2), -1L);
        if (z && System.currentTimeMillis() <= j + 2592000000L) {
            return false;
        }
        return true;
    }

    public static C11O8 LJII(final boolean z) {
        final int i;
        C1071780dzs c1071780dzs = C1071780dzs.LIZ;
        C1072570e19 c1072570e19 = C1072570e19.LIZ;
        C1071780dzs.LIZIZ(c1071780dzs, "login_onboarding", "user", "facebook", "login", "uid", "auto", c1072570e19.LIZLLL(), 320);
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser()) {
            i = 2;
        } else {
            i = 3;
        }
        c1072570e19.LJFF(true);
        FriendApi.LIZ.getClass();
        return C1239330iM7.LIZ().LIZ(2, Boolean.TRUE, Boolean.FALSE, false, false).LJJJ(new InterfaceC1487280oo2() { // from class: X.0e1M
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C1072640e1G c1072640e1G = C1072640e1G.LIZ;
                int i2 = i;
                c1072640e1G.getClass();
                return C1072640e1G.LJIIIIZZ(i2);
            }
        }, false).LJJIJIIJIL(new C09JN() { // from class: X.0daK
            @Override // X.C09JN
            public final void accept(Object obj) {
                Activity activityLJFF;
                C1C7U.LIZ("SocialFriendsHelper@b1e6.syncAndGetFacebookRecommendFriends$2");
                List list = (List) obj;
                if (z && list.contains(2) && (activityLJFF = C2214201BlK.LJFF()) != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
                    c1389890mGx.LJIIIZ(2131850538);
                    c1389890mGx.LIZ(true);
                    c1389890mGx.LJIIJJI();
                }
                new C2008507tr("login_onboarding", "login", true, "facebook").LIZLLL(null);
                C1C7U.LIZIZ("SocialFriendsHelper@b1e6.syncAndGetFacebookRecommendFriends$2");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.0daO
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z2;
                C23112093u c23112093u;
                C1C7U.LIZ("SocialFriendsHelper@b1e6.syncAndGetFacebookRecommendFriends$3");
                Throwable th = (Throwable) obj;
                if ((th instanceof C0XIR) && (c23112093u = (C23112093u) th) != null && c23112093u.getErrorCode() == 3002047) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                new C2008507tr("login_onboarding", "login", "facebook", false, z2).LIZLLL(null);
                C1C7U.LIZIZ("SocialFriendsHelper@b1e6.syncAndGetFacebookRecommendFriends$3");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public static C11O8 LJIIIIZZ(final int i) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0daI
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<List<Integer>> c09aj) throws Throwable {
                C1C7U.LIZ("SocialFriendsHelper@b1e6.syncFacebook$1");
                C23250099c.LJ(C23271099x.INSTANCE, new C1055910daH(i, c09aj, null));
                C1C7U.LIZIZ("SocialFriendsHelper@b1e6.syncFacebook$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public static C11NZ LJIIIZ(boolean z) {
        C11O8 c11o8LJII;
        EnumC1074240e3q enumC1074240e3q;
        int i;
        if (z) {
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser()) {
                i = 2;
            } else {
                i = 3;
            }
            c11o8LJII = LJIIIIZZ(i);
        } else {
            c11o8LJII = LJII(false);
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser()) {
            enumC1074240e3q = EnumC1074240e3q.SIGN_UP;
        } else {
            enumC1074240e3q = EnumC1074240e3q.LOGIN;
        }
        return C11NZ.LJLLILLLL(c11o8LJII, LIZJ(enumC1074240e3q), new InterfaceC500500Jk0() { // from class: X.0e1t
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return C1697810uHb.LJIIJJI(C13LP.LJJJJZI((List) obj), C13LP.LJJJJZI((List) obj2));
            }
        });
    }

    public static void LJ(int i, int i2) {
        String str = C1072670e1J.LIZIZ;
        C1072680e1K.LIZ().LIZ(i, i2);
    }

    public static C11NZ LJI(List list, boolean z) {
        EnumC1074240e3q enumC1074240e3q;
        int i = 2;
        if (z) {
            if (list.size() > 1) {
                return LJIIIZ(true);
            }
            int iIntValue = ((Number) C13LP.LJJJJZI(list)).intValue();
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.08Pp
                        @Override // X.InterfaceC1478005qU
                        public final void subscribe(C09AJ<List<Integer>> c09aj) {
                            C1C7U.LIZ("SocialFriendsHelper@b1e6.getSocialRecommendFriends$1");
                            c09aj.onError(new Exception("social platform not support!"));
                            C1C7U.LIZIZ("SocialFriendsHelper@b1e6.getSocialRecommendFriends$1");
                        }
                    });
                }
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser()) {
                    i = 3;
                }
                return LJIIIIZZ(i);
            }
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser()) {
                enumC1074240e3q = EnumC1074240e3q.SIGN_UP;
            } else {
                enumC1074240e3q = EnumC1074240e3q.LOGIN;
            }
            return LIZJ(enumC1074240e3q);
        }
        if (list.size() > 1) {
            return LJIIIZ(false);
        }
        int iIntValue2 = ((Number) C13LP.LJJJJZI(list)).intValue();
        if (iIntValue2 != 1) {
            if (iIntValue2 != 2) {
                return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.08Pq
                    @Override // X.InterfaceC1478005qU
                    public final void subscribe(C09AJ<List<Integer>> c09aj) {
                        C1C7U.LIZ("SocialFriendsHelper@b1e6.syncAndGetSocialRecommendFriends$1");
                        c09aj.onError(new Exception("social platform not support!"));
                        C1C7U.LIZIZ("SocialFriendsHelper@b1e6.syncAndGetSocialRecommendFriends$1");
                    }
                });
            }
            return LJII(true);
        }
        C1072630e1F.LIZ.LJFF(true);
        FriendApi.LIZ.getClass();
        return C1239330iM7.LIZ().LIZ(1, Boolean.TRUE, Boolean.FALSE, false, false).LJJJ(new InterfaceC1487280oo2() { // from class: X.0dy4
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                EnumC1074240e3q enumC1074240e3q2;
                C1072640e1G.LIZ.getClass();
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isNewUser()) {
                    enumC1074240e3q2 = EnumC1074240e3q.SIGN_UP;
                } else {
                    enumC1074240e3q2 = EnumC1074240e3q.LOGIN;
                }
                return C1072640e1G.LIZJ(enumC1074240e3q2);
            }
        }, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }
}
