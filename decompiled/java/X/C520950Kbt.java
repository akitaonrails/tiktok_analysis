package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.fansclub.LiveReverseFanClubSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0Kbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520950Kbt {
    public final Handler LIZ;
    public C521100Kc8 LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final List<AbstractC498530Jgp<? extends AbstractC521080Kc6>> LJ;
    public final CopyOnWriteArrayList<AbstractC498550Jgr<? extends AbstractC521080Kc6>> LJFF;
    public int LJI;
    public C09AY LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;

    public C520950Kbt() {
        this(false, 15);
    }

    public static boolean LJFF(int i) {
        return i == 1 || i == 0 || i == 3 || i == 4 || i == 6 || i == 7 || i == 8 || i == 9 || i == 10 || i == 11;
    }

    public final void LIZLLL() {
        ((ArrayList) this.LJ).clear();
        for (AbstractC498550Jgr<? extends AbstractC521080Kc6> abstractC498550Jgr : this.LJFF) {
            if (abstractC498550Jgr != null) {
                abstractC498550Jgr.LJFF();
            }
        }
        this.LJFF.clear();
        Handler handler = this.LIZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJII = null;
    }

    public static boolean LJII(BadgeStruct badgeStruct) {
        if (badgeStruct != null) {
            if (badgeStruct.badgeScene == 8 || badgeStruct.badgeScene == 10 || badgeStruct.badgeScene == 14 || badgeStruct.badgeScene == 16) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LIZJ(int i) {
        if (i != 0 && i != 4) {
            if (i != 1 && i != 3) {
                if (i != 6 && i != 7 && i != 8 && i != 9 && i != 10 && i != 11) {
                    return false;
                }
            } else {
                int i2 = this.LJIIIIZZ;
                this.LJIIIIZZ = i2 + 1;
                if (i2 >= this.LJIIIZ) {
                    return false;
                }
            }
        }
        return true;
    }

    public /* synthetic */ C520950Kbt(boolean z, int i) {
        this(null, null, false, (i & 8) != 0 ? false : z);
    }

    public static boolean LJ(boolean z, BadgeStruct badgeStruct) {
        if (!C1114740f7A.LIZ(z) && badgeStruct != null && (badgeStruct.badgeScene == 4 || badgeStruct.badgeScene == 7)) {
            return false;
        }
        if (!Intrinsics.LJFF(InterfaceC1093910eZZ.LLLLLLZZ.LIZ(), Boolean.TRUE) || !LiveReverseFanClubSetting.INSTANCE.getValue() || z || badgeStruct == null || badgeStruct.badgeScene != 10) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(List list, boolean z) {
        String str;
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            int size = 0;
            if (z) {
                CopyOnWriteArrayList<AbstractC498550Jgr<? extends AbstractC521080Kc6>> copyOnWriteArrayList = this.LJFF;
                if (copyOnWriteArrayList != null) {
                    size = copyOnWriteArrayList.size();
                }
                str = "pendingbadges";
            } else {
                if (list != null) {
                    size = list.size();
                }
                str = "badgelist";
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                new JSONObject().put("position", str);
                jSONObject2.put("badge_size", size);
                jSONObject2.put("position", str);
                jSONObject.put("error_stack", Log.getStackTraceString(new Throwable()));
                jSONObject.put("badge_size", size);
                jSONObject.put("position", str);
                C1CC2.LJI("ttlive_badge_manager_update_badge_data", new JSONObject(), jSONObject2, jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJI(int i, BadgeStruct badgeStruct, User user) {
        String str;
        boolean z;
        Object obj;
        String str2;
        String str3;
        String str4;
        int i2;
        Integer numTL1;
        String str5;
        int i3 = badgeStruct.badgeScene;
        String str6 = "active_user_rank";
        String str7 = "";
        if (i3 != 4) {
            if (i3 == 6) {
                str = "active_user_rank";
            } else if (i3 != 8) {
                if (i3 != 10) {
                    if (i3 != 15) {
                        str = "";
                    } else {
                        str = "active_user_rank_top_buyers";
                    }
                } else {
                    str = "fans_club_level";
                }
            } else {
                str = "user_level";
            }
        } else {
            str = "subscription";
        }
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 4) {
                    str6 = "";
                }
            } else {
                str6 = "comment_area";
            }
        } else {
            str6 = "profile_card";
        }
        if (!Intrinsics.LJFF(str, "")) {
            if (user.getLiveRoomId() != 0) {
                z = true;
            } else {
                z = false;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_badge_privilege_show");
            c474500IjALIZ.LJIIIIZZ();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            String str8 = "anchor";
            if (C500260Jjc.LJIJ(dataChannelGlobal)) {
                obj = "anchor";
            } else {
                obj = "user";
            }
            c474500IjALIZ.LJJII(obj, "user_type");
            if (!z) {
                str8 = "user";
            }
            c474500IjALIZ.LJJII(str8, "to_user_type");
            c474500IjALIZ.LJJII("badge", "privilege_type");
            c474500IjALIZ.LJJII(str, "privilege_scenario");
            c474500IjALIZ.LJJII(str6, "show_place");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII(Long.valueOf(user.getId()), "to_user_id");
            c474500IjALIZ.LJJII(Integer.valueOf(C0IUA.LIZJ), "online_user");
            PrivilegeLogExtra privilegeLogExtra = badgeStruct.logExtra;
            Long lEr1 = null;
            if (privilegeLogExtra == null || (str2 = privilegeLogExtra.privilege_id) == null) {
                str2 = "";
            }
            c474500IjALIZ.LJJII(str2, "privilege_id");
            PrivilegeLogExtra privilegeLogExtra2 = badgeStruct.logExtra;
            if (privilegeLogExtra2 == null || (str3 = privilegeLogExtra2.privilege_order_id) == null) {
                str3 = "";
            }
            c474500IjALIZ.LJJII(str3, "privilege_order_id");
            PrivilegeLogExtra privilegeLogExtra3 = badgeStruct.logExtra;
            if (privilegeLogExtra3 == null || (str4 = privilegeLogExtra3.privilege_version) == null) {
                str4 = "";
            }
            c474500IjALIZ.LJJII(str4, "privilege_version_id");
            PrivilegeLogExtra privilegeLogExtra4 = badgeStruct.logExtra;
            if (privilegeLogExtra4 != null && (str5 = privilegeLogExtra4.data_version) != null) {
                str7 = str5;
            }
            c474500IjALIZ.LJJII(str7, "data_version_id");
            if ((((int) badgeStruct.greyedByClient) & 8) == 8) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_inactive");
            if (badgeStruct.badgeScene == 10) {
                boolean zLJIJ = C500260Jjc.LJIJ(dataChannelGlobal);
                IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
                if (iPublicScreenService != null) {
                    numTL1 = iPublicScreenService.TL1();
                } else {
                    numTL1 = null;
                }
                IPublicScreenService iPublicScreenService2 = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
                if (iPublicScreenService2 != null) {
                    lEr1 = iPublicScreenService2.er1();
                }
                if (i != 0) {
                    z2 = false;
                }
                C191100oP.LIZ(c474500IjALIZ, badgeStruct, zLJIJ, z, numTL1, lEr1, z2);
            }
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
                return;
            }
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJIIIIZZ();
            w wVar = w.LIZ;
            wVar.getClass();
            c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZ.LJJII(wVar.LIZJ(), "live_type");
            c474500IjALIZ.LIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public final void LIZ(AbstractC498530Jgp<? extends AbstractC521080Kc6> abstractC498530Jgp, boolean z, boolean z2) {
        if (z) {
            ((ArrayList) this.LJ).clear();
        }
        if (abstractC498530Jgp != null && !((ArrayList) this.LJ).contains(abstractC498530Jgp)) {
            ArrayList arrayList = (ArrayList) this.LJ;
            arrayList.add(abstractC498530Jgp);
            C08XD.LJJ(arrayList, new Comparator() { // from class: X.0KVb
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    AbstractC498530Jgp abstractC498530Jgp2 = (AbstractC498530Jgp) obj;
                    AbstractC498530Jgp abstractC498530Jgp3 = (AbstractC498530Jgp) obj2;
                    if (abstractC498530Jgp2.LIZLLL() < abstractC498530Jgp3.LIZLLL()) {
                        return -1;
                    }
                    if (abstractC498530Jgp2.LIZLLL() > abstractC498530Jgp3.LIZLLL()) {
                        return 1;
                    }
                    return 0;
                }
            });
            ?? r1 = this.LJII;
            if (r1 != 0) {
                r1.invoke(Boolean.valueOf(z2));
            }
        }
    }

    public C520950Kbt(Handler handler, C521100Kc8 c521100Kc8, boolean z, boolean z2) {
        this.LIZ = handler;
        this.LIZIZ = c521100Kc8;
        this.LIZJ = z;
        this.LIZLLL = z2;
        if (handler == null) {
            this.LIZ = new BPEAHandler(Looper.getMainLooper());
        }
        this.LJ = new ArrayList();
        this.LJFF = new CopyOnWriteArrayList<>();
        this.LJI = 10;
        this.LJIIIZ = 3;
    }

    public final void LJIIL(AbstractC498550Jgr<? extends AbstractC521080Kc6> abstractC498550Jgr, Function0<Unit> function0, boolean z, boolean z2) {
        LIZIZ(null, true);
        this.LJFF.remove(abstractC498550Jgr);
        LIZ(abstractC498550Jgr, z, z2);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void LJIIIZ(boolean z, Context context, List<BadgeStruct> list, Function0<Unit> function0, Function1<? super BadgeStruct, Unit> function1, int i, User user, Function0<Unit> function02, boolean z2) {
        boolean z3;
        LIZIZ(list, false);
        if (list != null && !list.isEmpty() && context != null) {
            ArrayList arrayList = new ArrayList();
            if (LJFF(i)) {
                ArrayList arrayList2 = new ArrayList();
                for (BadgeStruct badgeStruct : list) {
                    BadgeStruct badgeStruct2 = badgeStruct;
                    if (badgeStruct2 != null && badgeStruct2.combineBadgeStruct != null && LJ(z, badgeStruct2)) {
                        arrayList2.add(badgeStruct);
                    }
                }
                arrayList.addAll(arrayList2);
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (BadgeStruct badgeStruct3 : list) {
                    if (LJ(z, badgeStruct3)) {
                        arrayList3.add(badgeStruct3);
                    }
                }
                arrayList.addAll(arrayList3);
            }
            if (!arrayList.isEmpty()) {
                int i2 = 0;
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        BadgeStruct badgeStruct4 = (BadgeStruct) obj;
                        if (z2) {
                            this.LJIIIIZZ = 0;
                        }
                        if (i2 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        LJIIIIZZ(z, context, badgeStruct4, function0, function1, i, user, z3, function02, z2);
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        ((ArrayList) this.LJ).clear();
        this.LJFF.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(boolean r30, android.content.Context r31, com.bytedance.android.live.base.model.user.BadgeStruct r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function1<? super com.bytedance.android.live.base.model.user.BadgeStruct, kotlin.Unit> r34, int r35, com.bytedance.android.live.base.model.user.User r36, boolean r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520950Kbt.LJIIIIZZ(boolean, android.content.Context, com.bytedance.android.live.base.model.user.BadgeStruct, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, com.bytedance.android.live.base.model.user.User, boolean, kotlin.jvm.functions.Function0, boolean):void");
    }
}
