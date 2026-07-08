package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01mQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C433601mQ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(User user) {
        Long lValueOf;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        c930480aJy.getClass();
        if (C930480aJy.LJIJI(userLJIJJLI)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("live_anchor_c_");
            sbLIZ.append(LIZLLL(user));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        if (C930480aJy.LJIJJ(lValueOf)) {
            return "live_audience_c_anchor";
        }
        return "live_audience_c_audience";
    }

    public static String LIZLLL(User user) {
        if (user != null) {
            C930480aJy.LIZ.getClass();
            if (C930480aJy.LJIJI(user)) {
                return "anchor";
            }
            if (C930540aK4.LJJII(user)) {
                return "guest";
            }
            C930540aK4.LJIL(user);
            return "audience";
        }
        return "audience";
    }

    public static C11JF LJ(InterfaceC434201mW interfaceC434201mW) {
        return (C11JF) C784440Upu.LIZ().LJ(C257100z3.class).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIL(new InterfaceC19483011Ki() { // from class: X.01mS
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (((C257100z3) obj).LIZ != null) {
                    return true;
                }
                return false;
            }
        }).LJJIL(new C517401zw(interfaceC434201mW, 1)).LJJLL(new C516201zk(interfaceC434201mW, 255), new C09JN() { // from class: X.00RH
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FollowUtil@2770.observeFollowStateChangeEvent$4");
                Throwable th = (Throwable) obj;
                if (th != null) {
                    C20441214yg.LJFF("FollowUtil", "observeFollowStateChangeEvent failed:", th);
                }
                C1C7U.LIZIZ("FollowUtil@2770.observeFollowStateChangeEvent$4");
            }
        });
    }

    public static void LIZ(final User user, final long j, C11NJ c11nj, final String str, final Long l) {
        try {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                Long lValueOf = Long.valueOf(room.getId());
                if (lValueOf != null && lValueOf.longValue() != 0) {
                    C930480aJy c930480aJy = C930480aJy.LIZ;
                    InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                    C1099430eiT c1099430eiT = new C1099430eiT();
                    c1099430eiT.LIZIZ(j);
                    c1099430eiT.LJ(lValueOf.longValue());
                    InterfaceC420801kM interfaceC420801kMLJJLL = interfaceC500940JkiUser.LIZ(c1099430eiT.LIZJ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.01mN
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            HashMap<String, String> map;
                            C1C7U.LIZ("FollowUtil@2770.doFollow$3");
                            FollowPair followPair = (FollowPair) obj;
                            C784440Upu.LIZ().LIZIZ(new C257100z3(followPair));
                            User user2 = user;
                            if (user2 != null) {
                                long j2 = j;
                                String str2 = str;
                                Long l2 = l;
                                C930480aJy c930480aJy2 = C930480aJy.LIZ;
                                User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
                                c930480aJy2.getClass();
                                HashMap<String, String> map2 = null;
                                if (C930480aJy.LJIJI(userLJIJJLI)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("live_anchor_c_");
                                    sbLIZ.append(C433601mQ.LIZLLL(user2));
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    Long lValueOf2 = Long.valueOf(j2);
                                    if (followPair != null) {
                                        map2 = followPair.LJFF;
                                    }
                                    C0JGT.LIZ(strLIZIZ, lValueOf2, map2, str2, null, null, null, null, null, null, null, null, null, null, null, null, 63504);
                                } else if (C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI())) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("live_guest_c_");
                                    sbLIZ2.append(C433601mQ.LIZLLL(user2));
                                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                    Long lValueOf3 = Long.valueOf(j2);
                                    if (followPair != null) {
                                        map = followPair.LJFF;
                                    } else {
                                        map = null;
                                    }
                                    if (!Intrinsics.LJFF(str2, "multiguest_liveshow_ranking")) {
                                        l2 = null;
                                    }
                                    C0JGT.LIZ(strLIZIZ2, lValueOf3, map, str2, null, l2, null, null, null, null, null, null, null, null, null, null, 63504);
                                } else if (C930540aK4.LJIL(UserService.getInstance().user().LJIJJLI())) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("live_audience_c_");
                                    sbLIZ3.append(C433601mQ.LIZLLL(user2));
                                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                                    Long lValueOf4 = Long.valueOf(j2);
                                    if (followPair != null) {
                                        map2 = followPair.LJFF;
                                    }
                                    C0JGT.LIZ(strLIZIZ3, lValueOf4, map2, str2, null, l2, null, null, null, null, null, null, null, null, null, null, 63504);
                                }
                            }
                            C1C7U.LIZIZ("FollowUtil@2770.doFollow$3");
                        }
                    }, new C09JN() { // from class: X.01mM
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("FollowUtil@2770.doFollow$4");
                            Throwable th = (Throwable) obj;
                            if (th instanceof C501470JlZ) {
                                C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
                            } else {
                                C766270U4b.LIZLLL(2131853482);
                            }
                            C1C7U.LIZIZ("FollowUtil@2770.doFollow$4");
                        }
                    });
                    c930480aJy.getClass();
                    c11nj.LIZ(interfaceC420801kMLJJLL);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(final User user, String str, String str2, Function0 function0, Function1 function1, String str3, int i) {
        final Function0 function02 = function0;
        final String str4 = str2;
        final String str5 = str;
        final String str6 = null;
        if ((i & 4) != 0) {
            str5 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            function02 = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        if ((i & 64) == 0) {
            str6 = str3;
        }
        try {
            long id = ((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)).getId();
            long id2 = 0;
            if (id != 0) {
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                C1099430eiT c1099430eiT = new C1099430eiT();
                if (user != null) {
                    id2 = user.getId();
                }
                c1099430eiT.LIZIZ(id2);
                c1099430eiT.LJ(id);
                interfaceC500940JkiUser.LIZ(c1099430eiT.LIZJ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.01mP
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        Long lValueOf;
                        String strLIZIZ;
                        Long lValueOf2;
                        Long lValueOf3;
                        C1C7U.LIZ("FollowUtil@2770.doFollow$1");
                        FollowPair followPair = (FollowPair) obj;
                        C930480aJy c930480aJy = C930480aJy.LIZ;
                        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
                        c930480aJy.getClass();
                        HashMap<String, String> map = null;
                        if (C930480aJy.LJIJI(userLJIJJLI)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("live_anchor_c_");
                            sbLIZ.append(C433601mQ.LIZLLL(user));
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            User user2 = user;
                            if (user2 != null) {
                                lValueOf = Long.valueOf(user2.getId());
                            } else {
                                lValueOf = null;
                            }
                            if (C930480aJy.LJIJJ(lValueOf)) {
                                strLIZIZ = "live_audience_c_anchor";
                            } else {
                                strLIZIZ = "live_audience_c_audience";
                            }
                        }
                        String str7 = str5;
                        User user3 = user;
                        String str8 = str4;
                        String str9 = str6;
                        if (str7 != null && str7.length() != 0) {
                            if (user3 != null) {
                                lValueOf3 = Long.valueOf(user3.getId());
                            } else {
                                lValueOf3 = null;
                            }
                            if (followPair != null) {
                                map = followPair.LJFF;
                            }
                            C0JGT.LIZ(strLIZIZ, lValueOf3, map, str7, null, null, null, null, null, null, null, null, null, null, str8, str9, 14352);
                        } else {
                            if (user3 != null) {
                                lValueOf2 = Long.valueOf(user3.getId());
                            } else {
                                lValueOf2 = null;
                            }
                            if (followPair != null) {
                                map = followPair.LJFF;
                            }
                            C0JGT.LIZ(strLIZIZ, lValueOf2, map, null, null, null, null, null, null, null, null, null, null, null, str8, str9, 14360);
                        }
                        C784440Upu.LIZ().LIZIZ(new C257100z3(followPair));
                        Function0<Unit> function03 = function02;
                        if (function03 != null) {
                            function03.invoke();
                        }
                        C1C7U.LIZIZ("FollowUtil@2770.doFollow$1");
                    }
                }, new C516201zk(function1, 254));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
