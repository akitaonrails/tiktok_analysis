package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownCloseCountDownSetting;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.15B5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C15B5 implements C15BW {
    public final C20475815Ae LIZ;
    public final ViewGroup LIZIZ;
    public final ViewGroup LIZJ;
    public final C20476915Ap LIZLLL;
    public final boolean LJ;
    public final List<C15BU> LJFF;
    public int LJI;
    public GuestShowdownContent LJIIIIZZ;
    public C15BA LJIIJ;
    public List<GuestShowdownUser> LJII = new ArrayList();
    public final List<C20475515Ab> LJIIIZ = new ArrayList();

    public void LIZIZ() {
    }

    public abstract List LJFF(ViewGroup viewGroup, GuestShowdownContent guestShowdownContent);

    public abstract List LJII(GuestShowdownContent guestShowdownContent);

    public abstract String LJJ();

    public final C20477515Av LJIILL() {
        Context context = this.LIZIZ.getContext();
        C20441214yg.LJIIIZ(LJJ(), "createReadyStartAnimationGroupAndUpdateDataCenter");
        if (context == null) {
            C20441214yg.LJ(LJJ(), "createReadyStartAnimationGroupAndUpdateDataCenter context is null");
            return null;
        }
        C20476915Ap c20476915Ap = this.LIZLLL;
        String str = C15B8.LJIL;
        c20476915Ap.LJIIL(str);
        ArrayList arrayList = new ArrayList();
        boolean z = C15BC.LIZ;
        boolean z2 = !this.LJ;
        String str2 = z2 ? "multi_guest_guest_showdown_start_static.zip" : "guest_showdown_start_fullscreen.zip";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0OFE.LIZ("START", C497740JfY.LJIJI(2131852931));
        C15AO c15ao = new C15AO("tiktok_live_interaction_guest_showdown", str2, (Function2) null, linkedHashMap, (C20345814jI) null, 0L, z2, (C20345714jH) null, (List) null, (Map) null, 1908);
        C204746159s c204746159s = new C204746159s(c15ao);
        ViewGroup viewGroup = this.LIZJ;
        Integer numValueOf = Integer.valueOf(viewGroup != null ? viewGroup.getWidth() : 0);
        ViewGroup viewGroup2 = this.LIZJ;
        Pair pair = new Pair(numValueOf, Integer.valueOf(viewGroup2 != null ? viewGroup2.getHeight() : 0));
        if (((Number) pair.getFirst()).intValue() == 0 || ((Number) pair.getSecond()).intValue() == 0) {
            C20441214yg.LJ(LJJ(), "createReadyStartAnimationGroupAndUpdateDataCenter layoutContainer's size is zero");
            return null;
        }
        C20475815Ae c20475815Ae = this.LIZ;
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.LOTTIE;
        InterfaceC20476615Am interfaceC20476615AmLIZ = c20475815Ae.LIZ(str, enumC20476415Ak, new C20476115Ah(0, 0, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), 0.0f, 0.0f, 0.0f, C15BN.LIZIZ, 112), c204746159s, this.LJ ? EnumC20476715An.LAYOUT_CONTAINER : EnumC20476715An.NORMAL);
        arrayList.add(interfaceC20476615AmLIZ);
        if (this.LIZLLL.LJI(enumC20476415Ak, this.LIZJ, interfaceC20476615AmLIZ) == null) {
            C20441214yg.LJ(LJJ(), "createGeniusView is null");
            return null;
        }
        C15BE c15be = C15BE.LOTTIE;
        String geniusId = interfaceC20476615AmLIZ.getGeniusId();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(C15AL.LIZIZ(C15AG.LOTTIE, new C15A6(c15ao), 0L, 0L, 28));
        return new C20477515Av(c15be, true, false, arrayList, C2097608Jq.LJIIJ(new Pair(geniusId, new C15B1(arrayList2, this.LJ))), null, 204);
    }

    public final List<C20477515Av> LJIIZILJ() {
        ArrayList arrayList = new ArrayList();
        String str = C15BC.LJ;
        C20476115Ah c20476115Ah = new C20476115Ah(0, 0, this.LIZIZ.getMeasuredWidth(), this.LIZIZ.getMeasuredHeight(), 0.0f, 0.0f, 0.0f, C15BN.LJ, 112);
        String str2 = C15BC.LIZIZ;
        C20345814jI c20345814jILIZ = C20345914jJ.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0OFE.LIZ("Over", C497740JfY.LJIJI(2131852928));
        InterfaceC20476615Am interfaceC20476615AmLIZ = this.LIZ.LIZ(str, EnumC20476415Ak.LOTTIE, c20476115Ah, new C204746159s(new C15AO("tiktok_live_interaction_guest_showdown", str2, (Function2) null, (Map) linkedHashMap, c20345814jILIZ, 0L, false, (C20345714jH) null, (List) null, (Map) null, 2020)), EnumC20476715An.CANT_AUTO_CREATE);
        if (interfaceC20476615AmLIZ instanceof C20475415Aa) {
            arrayList.add(LJIILLIIL(Collections.singletonList(interfaceC20476615AmLIZ)));
            return arrayList;
        }
        C20441214yg.LJ(LJJ(), "createTimeUpAnimationGroup return as geniusModel isn't LottieGeniusModel");
        return arrayList;
    }

    public static C20477515Av LJIILLIIL(List list) {
        C15AO c15ao;
        C15BE c15be = C15BE.LOTTIE;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C20475415Aa c20475415Aa = (C20475415Aa) it3.next();
            C204746159s c204746159sLJI = c20475415Aa.LJI();
            if (c204746159sLJI != null && (c15ao = c204746159sLJI.LIZ) != null) {
                String str = c20475415Aa.LIZIZ;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(C15AL.LIZIZ(C15AG.LOTTIE, new C15A6(c15ao), 0L, 0L, 28));
                linkedHashMap.put(str, new C15B1(arrayList2, true));
            }
        }
        return new C20477515Av(c15be, true, false, arrayList, linkedHashMap, null, 192);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIJI(java.lang.Integer r2) {
        /*
            boolean r0 = X.C15BC.LIZ
            if (r2 == 0) goto L23
            int r1 = r2.intValue()
            r0 = 1
            if (r1 == r0) goto L23
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L19
            java.lang.String r0 = "ttlive_ic_guest_showdown_loser_emoji_2.png"
        L14:
            java.lang.String r0 = X.C15BC.LIZ(r0)
            return r0
        L19:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L23
            java.lang.String r0 = "ttlive_ic_guest_showdown_loser_emoji_3.png"
            goto L14
        L23:
            java.lang.String r0 = "ttlive_ic_guest_showdown_loser_emoji_1.png"
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B5.LJIJI(java.lang.Integer):java.lang.String");
    }

    public static String LJIJJ(EnumC204738159k enumC204738159k) {
        int i = C204740159m.LIZ[enumC204738159k.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return "";
            }
            return C497740JfY.LJIJI(2131852900);
        }
        return C497740JfY.LJIJI(2131852898);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJIL(webcast.data.multi_guest_play.GuestShowdownContent r10) {
        /*
            r8 = 0
            if (r10 != 0) goto L5
            return r8
        L5:
            int r1 = r10.playStatus
            r0 = 2
            if (r1 != r0) goto L30
            long r6 = r10.partyStartTime
            X.01FV r1 = X.C01HE.LJ()
            X.01FV r0 = X.C01FV.AUDIENCE
            if (r1 != r0) goto L2d
            long r4 = X.C01HA.LJIIIIZZ()
        L18:
            long r1 = X.C158B.LIZ()
            long r1 = r1 + r4
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L3b
            long r2 = -r4
            long r0 = X.C158B.LIZ()
            long r2 = r2 + r0
            long r2 = r2 - r6
        L28:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L3d
            return r8
        L2d:
            r4 = 0
            goto L18
        L30:
            r0 = 4
            if (r1 != r0) goto L3b
            long r2 = X.C158B.LIZ()
            long r0 = r10.punishmentStartTime
            long r2 = r2 - r0
            goto L28
        L3b:
            r2 = 0
        L3d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B5.LJIL(webcast.data.multi_guest_play.GuestShowdownContent):long");
    }

    public static boolean LJJI(GuestShowdownContent guestShowdownContent) {
        boolean z;
        List<Long> list = guestShowdownContent.contributors;
        boolean zLJIIIZ = PlayEntityUtilKt.LJIIIZ();
        boolean zLJFF = C930540aK4.LJFF();
        Iterator<Long> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Long next = it2.next();
            if (next.longValue() == C950220apo.LJFF()) {
                if (next != null) {
                    z = true;
                }
            }
        }
        z = false;
        if (zLJIIIZ || zLJFF || z) {
            return true;
        }
        return false;
    }

    @Override // X.C15BW
    public EnumC204738159k LIZ(Integer num) {
        if (num == null) {
            return null;
        }
        if (num.intValue() != 21 && num.intValue() != 22) {
            if (num.intValue() == 30) {
                return EnumC204738159k.RUNNING_STATE_WITHOUT_COUNT_DOWN;
            }
            if (num.intValue() == 40) {
                return EnumC204738159k.RUNNING_STATE_SHOW_TIME;
            }
            return EnumC204738159k.NOT_RUNNING_STATE;
        }
        return EnumC204738159k.RUNNING_STATE_WITH_COUNT_DOWN_ANIAMTION;
    }

    public List LJ(GuestShowdownContent guestShowdownContent) {
        String strLJJ = LJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GUEST_SHOWDOWN_STATUS_CALCULATING clear avatar runningPlayUsers:");
        sbLIZ.append(guestShowdownContent.runningPlayUsers.size());
        C20441214yg.LJIIIZ(strLJJ, C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        int iLIZ = C15BG.LIZ(guestShowdownContent);
        if (this.LJ) {
            LJIIIZ(guestShowdownContent);
        }
        if (this.LJI != iLIZ) {
            this.LIZLLL.LIZIZ(EnumC20476415Ak.AVATAR, EnumC20476415Ak.LOTTIE);
            List<C20477515Av> listLJIIZILJ = LJIIZILJ();
            LIZJ(this.LJI, iLIZ, true, listLJIIZILJ);
            arrayList.addAll(listLJIIZILJ);
        }
        return arrayList;
    }

    public final void LJIIIZ(GuestShowdownContent guestShowdownContent) {
        for (GuestShowdownUser guestShowdownUser : guestShowdownContent.runningPlayUsers) {
            C20476915Ap c20476915Ap = this.LIZLLL;
            C15BI c15bi = C15BS.LJJLI;
            String str = guestShowdownUser.linkmicId;
            c15bi.getClass();
            c20476915Ap.LJIIL(C15BI.LIZ(str));
        }
        ((ArrayList) this.LJIIIZ).clear();
    }

    public final Pair<Float, Float> LJJIFFI(C15BV c15bv) {
        float f = 100;
        return new Pair<>(Float.valueOf((c15bv.LIZ * this.LIZIZ.getMeasuredWidth()) / f), Float.valueOf((c15bv.LIZIZ * this.LIZIZ.getMeasuredHeight()) / f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1561430qjd LJIIJJI(int i, GuestShowdownContent guestShowdownContent) {
        GuestShowdownUser next;
        String str;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        float fLJJI = C497740JfY.LJJI(this.LIZIZ.getMeasuredHeight()) / 117;
        float f = 16 * fLJJI;
        if (f < 14.0f) {
            f = 14.0f;
        }
        float f2 = fLJJI * 11;
        if (f2 < 10.0f) {
            f2 = 10.0f;
        }
        C150E c150e = null;
        Object[] objArr = 0;
        if (i != 21) {
            int i2 = 22;
            if (i != 22) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            String strLJIJI = C497740JfY.LJIJI(2131852896);
            C150E c150e2 = new C150E(String.valueOf(R.attr.dty), null, 0.0f, 30);
            Iterator<GuestShowdownUser> it2 = guestShowdownContent.runningPlayUsers.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.userTag == 2) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            GuestShowdownUser guestShowdownUser = next;
            if (guestShowdownUser == null || (str = guestShowdownUser.nickname) == null) {
                str = "";
            }
            arrayList2.add(new C150F(strLJIJI, c150e2, str, 8));
            List<GuestShowdownUser> list = guestShowdownContent.runningPlayUsers;
            ArrayList arrayList3 = new ArrayList();
            for (GuestShowdownUser guestShowdownUser2 : list) {
                if (guestShowdownUser2.userTag == 3) {
                    arrayList3.add(guestShowdownUser2);
                }
            }
            int i3 = 0;
            for (Object obj : arrayList3) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    GuestShowdownUser guestShowdownUser3 = (GuestShowdownUser) obj;
                    String strLJIJI2 = C497740JfY.LJIJI(2131852897);
                    EnumC20439114yL enumC20439114yL = EnumC20439114yL.GECKO;
                    if (C15BG.LIZ(guestShowdownContent) == i2) {
                        numValueOf = Integer.valueOf(guestShowdownContent.runningStep);
                    } else {
                        numValueOf = null;
                    }
                    arrayList2.add(new C150F(strLJIJI2, new C150E(LJIJI(numValueOf), enumC20439114yL, 0.0f, 20), guestShowdownUser3.nickname, 8));
                    i3 = i4;
                    i2 = 22;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            arrayList.add(arrayList2);
        } else {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(new C150F(C497740JfY.LJIJI(2131852896), new C150E(String.valueOf(R.attr.dty), null, 0.0f, 30), "?", true));
            arrayList.add(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(new C150F(C497740JfY.LJIJI(2131852895), c150e, (String) (objArr == true ? 1 : 0), 14));
            arrayList.add(arrayList5);
        }
        return new C1561430qjd(arrayList, (int) f2, (int) f);
    }

    public final List LJIJJLI(Function0 function0, boolean z) {
        ArrayList arrayList = new ArrayList();
        C20441214yg.LJIIIZ(LJJ(), "createShowoffAndPunishAnimationGroup no winner");
        C20477515Av c20477515AvLIZJ = C15BO.LIZJ(Collections.singletonList(this.LIZ.LIZ(C15B8.LJJI, EnumC20476415Ak.TEXT, new C20476115Ah(0, 0, this.LIZIZ.getMeasuredWidth(), this.LIZIZ.getMeasuredHeight(), 0.0f, 0.0f, 0.0f, C15BN.LIZIZ, 112), new C150P(C497740JfY.LJIJI(2131852927), 20.0f, C20736316Cj.LIZIZ(R.attr.exs, this.LIZIZ.getContext()), R.style.a8t, null, 48), EnumC20476715An.NORMAL)));
        if (this.LJ && z) {
            c20477515AvLIZJ.LJII = new AwS581S0100000_2(function0, (Function0<Unit>) 712);
        }
        arrayList.add(c20477515AvLIZJ);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[LOOP:0: B:24:0x009c->B:26:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C20477515Av> LIZLLL(webcast.data.multi_guest_play.GuestShowdownContent r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B5.LIZLLL(webcast.data.multi_guest_play.GuestShowdownContent, java.lang.String, boolean):java.util.List");
    }

    public final InterfaceC20476615Am LJIIJ(PointF pointF, PointF pointF2, GuestShowdownUser guestShowdownUser) {
        C15BI c15bi = C15BS.LJJLI;
        String str = guestShowdownUser.linkmicId;
        c15bi.getClass();
        String strLIZ = C15BI.LIZ(str);
        String strLJJ = LJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createAvatarGeniusView currentPointF:");
        sbLIZ.append(pointF);
        sbLIZ.append(" targetPointF:");
        sbLIZ.append(pointF2);
        sbLIZ.append(" geniusId:");
        sbLIZ.append(strLIZ);
        C20441214yg.LJIIIZ(strLJJ, C2188811AlT.LIZIZ(sbLIZ));
        C20475815Ae c20475815Ae = this.LIZ;
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.AVATAR;
        int i = (int) pointF.x;
        int i2 = (int) pointF.y;
        int i3 = C15B8.LJIJI;
        int i4 = C15B8.LJIJI;
        C20476115Ah c20476115Ah = new C20476115Ah(i, i2, i4, i4, 0.0f, 0.0f, 0.0f, C15BN.LIZIZ, 112);
        boolean z = true;
        InterfaceC20476615Am interfaceC20476615AmLIZ = c20475815Ae.LIZ(strLIZ, enumC20476415Ak, c20476115Ah, new C15A0(z, z, C15BB.LIZJ(guestShowdownUser), guestShowdownUser.linkmicId, pointF, pointF2, null, 144), EnumC20476715An.NORMAL);
        if (interfaceC20476615AmLIZ instanceof C20475515Ab) {
            ((ArrayList) this.LJIIIZ).add(interfaceC20476615AmLIZ);
        }
        return interfaceC20476615AmLIZ;
    }

    public static void LIZJ(int i, int i2, boolean z, List list) {
        C20477615Aw c20477615AwLIZ;
        C20477515Av c20477515Av = (C20477515Av) C13LP.LJJJLL(list);
        if (c20477515Av != null) {
            if (i != i2) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C20477515Av c20477515Av2 = (C20477515Av) it2.next();
                    if (z) {
                        arrayList.addAll(C13LP.LLIIII(c20477515Av2.LJFF.keySet()));
                    }
                }
                List<C20477615Aw> list2 = C20477615Aw.LIZLLL;
                c20477615AwLIZ = C20477715Ax.LIZ(i2, arrayList);
            } else {
                c20477615AwLIZ = null;
            }
            c20477515Av.LJI = c20477615AwLIZ;
        }
    }

    public static C20477515Av LJIILJJIL(C15B5 c15b5, EnumC204738159k enumC204738159k, GuestShowdownContent guestShowdownContent, Boolean bool) {
        c15b5.getClass();
        if (MultiGuestGuestShowdownCloseCountDownSetting.INSTANCE.isEnable()) {
            return null;
        }
        InterfaceC20476615Am interfaceC20476615AmLJIIL = c15b5.LJIIL(enumC204738159k, 0L, guestShowdownContent, bool, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC20476615AmLJIIL);
        return new C20477515Av(null, false, true, arrayList, null, null, 225);
    }

    public static InterfaceC20476615Am LJIJ(C20475815Ae c20475815Ae, ViewGroup viewGroup, String str, EnumC20439114yL enumC20439114yL) {
        if (viewGroup == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.IMAGE;
        sbLIZ.append(enumC20476415Ak);
        sbLIZ.append("_bg");
        return c20475815Ae.LIZ(C2188811AlT.LIZIZ(sbLIZ), enumC20476415Ak, new C20476115Ah(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight(), 0.0f, 0.0f, 0.0f, C15BN.LIZ, 112), new C204752159y(enumC20439114yL, str, null, 0, 0, false, false, 124), EnumC20476715An.NORMAL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.Map] */
    public List<C20477515Av> LJI(ViewGroup viewGroup, GuestShowdownContent guestShowdownContent, String str, boolean z) {
        Pair pair;
        C15BV c15bv;
        Pair<Float, Float> pairLJJIFFI;
        Pair pair2;
        Map mapLJ;
        Collection collection;
        LinkedHashMap linkedHashMap;
        int measuredWidth;
        int measuredHeight;
        PointF pointF;
        Object next;
        ?? linkedHashMap2;
        Pair pair3;
        User user;
        C15BV c15bv2;
        C15BV c15bv3;
        int iLIZ = C15BG.LIZ(guestShowdownContent);
        ArrayList arrayList = new ArrayList();
        List<GuestShowdownUser> list = guestShowdownContent.runningPlayUsers;
        if (this.LJI != 21) {
            LIZIZ();
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (GuestShowdownUser guestShowdownUser : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    GuestShowdownUser guestShowdownUser2 = guestShowdownUser;
                    List<C15BV> list2 = C15BP.LIZ;
                    List listLIZ = C15BP.LIZ(list.size());
                    if (listLIZ == null) {
                        c15bv3 = new C15BV(0.0f, 0.0f);
                    } else if (i >= listLIZ.size()) {
                        c15bv3 = new C15BV(0.0f, 0.0f);
                    } else {
                        c15bv3 = (C15BV) ListProtector.get(listLIZ, i);
                    }
                    Pair<Float, Float> pairLJJIFFI2 = LJJIFFI(c15bv3);
                    C15BI c15bi = C15BS.LJJLI;
                    String str2 = guestShowdownUser2.linkmicId;
                    c15bi.getClass();
                    String strLIZ = C15BI.LIZ(str2);
                    String strLJJ = LJJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("createNoChampionAnimationGroup index:");
                    sbLIZ.append(i);
                    sbLIZ.append(" initList ");
                    sbLIZ.append(strLIZ);
                    C20441214yg.LJIIIZ(strLJJ, C2188811AlT.LIZIZ(sbLIZ));
                    arrayList2.add(LJIIJ(new PointF(pairLJJIFFI2.getFirst().floatValue(), pairLJJIFFI2.getSecond().floatValue()), new PointF(pairLJJIFFI2.getFirst().floatValue(), pairLJJIFFI2.getSecond().floatValue()), guestShowdownUser2));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C15BA c15ba = new C15BA(viewGroup);
            this.LJIIJ = c15ba;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof C20475515Ab) {
                    arrayList3.add(obj);
                }
            }
            ((ArrayList) c15ba.LIZIZ).clear();
            ((ArrayList) c15ba.LIZIZ).addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(new C20477515Av(C15BE.NONE, false, false, arrayList2, null, null, 224));
            return arrayList4;
        }
        List<GuestShowdownUser> list3 = this.LJII;
        if (C01Z9.LIZ(list3, list)) {
            String strLJJ2 = LJJ();
            StringBuilder sb = new StringBuilder("return as all the same lastPlayUsers:");
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator it2 = ((ArrayList) list3).iterator();
            while (it2.hasNext()) {
                arrayList5.add(((GuestShowdownUser) it2.next()).nickname);
            }
            sb.append(arrayList5);
            C20441214yg.LJIIIZ(strLJJ2, sb.toString());
            return C13BV.INSTANCE;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet(list3);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(list);
        ArrayList arrayList6 = new ArrayList(linkedHashSet);
        C500260Jjc.LJJJLIIL(arrayList6, new C5183020f((Set) linkedHashSet2, (Set<Integer>) 214));
        Pair pair4 = new Pair(Boolean.valueOf(!arrayList6.isEmpty()), arrayList6);
        if (((Boolean) pair4.getFirst()).booleanValue()) {
            String strLJJ3 = LJJ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isRemovedUser.size:");
            sbLIZ2.append(((List) pair4.getSecond()).size());
            C20441214yg.LJIIIZ(strLJJ3, C2188811AlT.LIZIZ(sbLIZ2));
            int i3 = 0;
            for (Object obj2 : (Iterable) pair4.getSecond()) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    GuestShowdownUser guestShowdownUser3 = (GuestShowdownUser) obj2;
                    C15BA c15ba2 = this.LJIIJ;
                    if (c15ba2 != null) {
                        ArrayList arrayList7 = new ArrayList();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("removeModel guestShowdownUser:");
                        sbLIZ3.append(guestShowdownUser3.userId);
                        sbLIZ3.append(" curSize:");
                        sbLIZ3.append(((ArrayList) c15ba2.LIZIZ).size());
                        C15BA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        List<C15BV> list4 = C15BP.LIZ;
                        List listLIZ2 = C15BP.LIZ(((ArrayList) c15ba2.LIZIZ).size());
                        int i5 = 0;
                        for (Object obj3 : (ArrayList) c15ba2.LIZIZ) {
                            int i6 = i5 + 1;
                            if (i5 >= 0) {
                                C20475515Ab c20475515Ab = (C20475515Ab) obj3;
                                if (listLIZ2 != null && (c15bv2 = (C15BV) ListProtector.get(listLIZ2, i5)) != null) {
                                    PointF pointFLIZJ = c15ba2.LIZJ(c15bv2);
                                    C15A0 c15a0LJI = c20475515Ab.LJI();
                                    if (c15a0LJI != null) {
                                        c15a0LJI.LJFF = pointFLIZJ;
                                    }
                                }
                                i5 = i6;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        Iterator it3 = ((ArrayList) c15ba2.LIZIZ).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                C15A0 c15a0LJI2 = ((C20475515Ab) next).LJI();
                                if (c15a0LJI2 != null && (user = c15a0LJI2.LIZJ) != null && user.getId() == guestShowdownUser3.userId) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C20475515Ab c20475515Ab2 = (C20475515Ab) next;
                        if (c20475515Ab2 == null) {
                            C15BA.LIZIZ("removeModel return as model is null!");
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(c15ba2.LIZIZ);
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.addAll(c15ba2.LIZIZ);
                            pair3 = new Pair(arrayList8, C15BO.LIZJ(arrayList9));
                        } else {
                            arrayList7.add(c20475515Ab2);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("removeModel model:");
                            sbLIZ4.append(c20475515Ab2);
                            C15BA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                            ArrayList arrayList10 = new ArrayList();
                            arrayList10.add(new C15AK(0L, 500L, null, C15AG.ALPHA, new C1782400wU2(0.0f, null), 5));
                            arrayList10.add(new C15AK(0L, 500L, null, C15AG.SCALE, new C15A2(new Pair(Float.valueOf(0.5f), Float.valueOf(0.5f)), null, 6, 0), 5));
                            ((ArrayList) c15ba2.LIZIZ).remove(c20475515Ab2);
                            linkedHashMap4.put(c20475515Ab2.LIZIZ, new C15B1(arrayList10, true));
                            List listLIZ3 = C15BP.LIZ(((ArrayList) c15ba2.LIZIZ).size());
                            if (listLIZ3 == null) {
                                linkedHashMap2 = C2097608Jq.LJ();
                            } else {
                                List<C20475515Ab> list5 = c15ba2.LIZIZ;
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("executeRelayoutAnimations sortedElements.size:");
                                ArrayList arrayList11 = (ArrayList) list5;
                                sbLIZ5.append(arrayList11.size());
                                C15BA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ5));
                                linkedHashMap2 = new LinkedHashMap();
                                int i7 = 0;
                                for (Object obj4 : arrayList11) {
                                    int i8 = i7 + 1;
                                    if (i7 >= 0) {
                                        C20475515Ab c20475515Ab3 = (C20475515Ab) obj4;
                                        PointF pointFLIZJ2 = c15ba2.LIZJ((C15BV) ListProtector.get(listLIZ3, i7));
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append("executeRelayoutAnimations index:");
                                        sbLIZ6.append(i7);
                                        sbLIZ6.append(" element:");
                                        sbLIZ6.append(c20475515Ab3);
                                        sbLIZ6.append(" newTargetPos:");
                                        sbLIZ6.append(pointFLIZJ2);
                                        C15BA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ6));
                                        C20476115Ah c20476115Ah = c20475515Ab3.LIZ;
                                        c20476115Ah.LIZ = (int) pointFLIZJ2.x;
                                        c20476115Ah.LIZIZ = (int) pointFLIZJ2.y;
                                        C15A0 c15a0LJI3 = c20475515Ab3.LJI();
                                        if (c15a0LJI3 != null) {
                                            c15a0LJI3.LJI = pointFLIZJ2;
                                        }
                                        C15AK c15ak = new C15AK(500L, 1000L, null, C15AG.TRANSLATE, new C1782410wU3(pointFLIZJ2.x, pointFLIZJ2.y, null, null), 4);
                                        arrayList7.add(c20475515Ab3);
                                        String str3 = c20475515Ab3.LIZIZ;
                                        C15B3 c15b3 = new C15B3();
                                        c15b3.LIZ(c15ak);
                                        linkedHashMap2.put(str3, c15b3.LIZJ());
                                        i7 = i8;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                            linkedHashMap4.putAll(linkedHashMap2);
                            List<C20475515Ab> list6 = c15ba2.LIZIZ;
                            ArrayList arrayList12 = new ArrayList(C15438062q.LJIJJ(list6, 10));
                            Iterator it4 = ((ArrayList) list6).iterator();
                            while (it4.hasNext()) {
                                arrayList12.add(((C20475515Ab) it4.next()).LJ(null, null));
                            }
                            ((ArrayList) c15ba2.LIZIZ).clear();
                            ((ArrayList) c15ba2.LIZIZ).addAll(arrayList12);
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("allAnimation.size:");
                            sbLIZ7.append(linkedHashMap4.size());
                            sbLIZ7.append(" translate animations.size:");
                            sbLIZ7.append(linkedHashMap2.size());
                            sbLIZ7.append(" afterRemoveSize:");
                            sbLIZ7.append(((ArrayList) c15ba2.LIZIZ).size());
                            C15BA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ7));
                            pair3 = new Pair(arrayList12, C15BO.LIZ(C15BE.DELETE, arrayList7, linkedHashMap4));
                        }
                        String strLJJ4 = LJJ();
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("removedUserList curRemoveUserIndex:");
                        sbLIZ8.append(i3);
                        C20441214yg.LJIIIZ(strLJJ4, C2188811AlT.LIZIZ(sbLIZ8));
                        ((ArrayList) this.LJIIIZ).clear();
                        ((ArrayList) this.LJIIIZ).addAll((Collection) pair3.getFirst());
                        arrayList.add(pair3.getSecond());
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        ArrayList arrayList13 = (ArrayList) list3;
        int size = arrayList13.size();
        C500260Jjc.LJJJLIIL(arrayList13, new AwS610S0100000_31(pair4, (Pair<Boolean, ? extends List<GuestShowdownUser>>) 565));
        String strLJJ5 = LJJ();
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("before remove size:");
        sbLIZ9.append(size);
        sbLIZ9.append(" after:");
        sbLIZ9.append(arrayList13.size());
        C20441214yg.LJIIIZ(strLJJ5, C2188811AlT.LIZIZ(sbLIZ9));
        if (arrayList13.size() < list.size()) {
            boolean z2 = true;
            int i9 = 0;
            for (Object obj5 : arrayList13) {
                int i10 = i9 + 1;
                if (i9 >= 0) {
                    if (!Intrinsics.LJFF(((GuestShowdownUser) obj5).linkmicId, ((GuestShowdownUser) ListProtector.get(list, i9)).linkmicId)) {
                        z2 = false;
                    }
                    i9 = i10;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            ArrayList arrayList14 = new ArrayList();
            if (z2) {
                int size2 = list.size();
                for (int size3 = arrayList13.size(); size3 < size2; size3++) {
                    arrayList14.add(ListProtector.get(list, size3));
                }
            }
            pair = new Pair(Boolean.valueOf(z2), arrayList14);
        } else {
            pair = new Pair(Boolean.FALSE, C13BV.INSTANCE);
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            List list7 = (List) pair.getSecond();
            String strLJJ6 = LJJ();
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("addedList size:");
            sbLIZ10.append(list7.size());
            C20441214yg.LJIIIZ(strLJJ6, C2188811AlT.LIZIZ(sbLIZ10));
            int i11 = 0;
            for (Object obj6 : list7) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    GuestShowdownUser guestShowdownUser4 = (GuestShowdownUser) obj6;
                    int size4 = arrayList13.size() + 1 + i11;
                    List listLIZ4 = C15BP.LIZ(size4);
                    if (listLIZ4 != null && (c15bv = (C15BV) C13LP.LJJLIIIJJI(listLIZ4)) != null && (pairLJJIFFI = LJJIFFI(c15bv)) != null) {
                        InterfaceC20476615Am interfaceC20476615AmLJIIJ = LJIIJ(new PointF(viewGroup.getMeasuredWidth(), pairLJJIFFI.getSecond().floatValue()), new PointF(pairLJJIFFI.getFirst().floatValue(), pairLJJIFFI.getSecond().floatValue()), guestShowdownUser4);
                        if (interfaceC20476615AmLJIIJ instanceof C20475515Ab) {
                            C15BA c15ba3 = this.LJIIJ;
                            if (c15ba3 != null) {
                                C20475515Ab c20475515Ab4 = (C20475515Ab) interfaceC20476615AmLJIIJ;
                                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                sbLIZ11.append("addAvatarGenius geniusModel");
                                sbLIZ11.append(c20475515Ab4);
                                C15BA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ11));
                                ((ArrayList) c15ba3.LIZIZ).add(c20475515Ab4);
                                int size5 = ((ArrayList) c15ba3.LIZIZ).size();
                                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                sbLIZ12.append("addElement size");
                                sbLIZ12.append(size5);
                                C15BA.LIZIZ(C2188811AlT.LIZIZ(sbLIZ12));
                                List listLIZ5 = C15BP.LIZ(size5);
                                if (listLIZ5 == null) {
                                    linkedHashMap = new LinkedHashMap();
                                } else {
                                    linkedHashMap = new LinkedHashMap();
                                    int i13 = 0;
                                    for (Object obj7 : (ArrayList) c15ba3.LIZIZ) {
                                        int i14 = i13 + 1;
                                        if (i13 >= 0) {
                                            C15A0 c15a0LJI4 = ((C20475515Ab) obj7).LJI();
                                            if (c15a0LJI4 != null) {
                                                c15a0LJI4.LJI = c15ba3.LIZJ((C15BV) ListProtector.get(listLIZ5, i13));
                                            }
                                            i13 = i14;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    C15BV c15bv4 = (C15BV) C13LP.LJJLIIIJJI(listLIZ5);
                                    float f = c15bv4.LIZ;
                                    ViewGroup viewGroup2 = c15ba3.LIZ;
                                    if (viewGroup2 != null) {
                                        measuredWidth = viewGroup2.getMeasuredWidth();
                                    } else {
                                        measuredWidth = 0;
                                    }
                                    float f2 = 100;
                                    Integer numValueOf = Integer.valueOf((int) ((f * measuredWidth) / f2));
                                    float f3 = c15bv4.LIZIZ;
                                    ViewGroup viewGroup3 = c15ba3.LIZ;
                                    if (viewGroup3 != null) {
                                        measuredHeight = viewGroup3.getMeasuredHeight();
                                    } else {
                                        measuredHeight = 0;
                                    }
                                    Pair pair5 = new Pair(numValueOf, Integer.valueOf((int) ((f3 * measuredHeight) / f2)));
                                    linkedHashMap.put(c20475515Ab4.LIZIZ, new C15AK(0L, 1000L, null, C15AG.TRANSLATE, new C1782410wU3(((Number) pair5.getFirst()).intValue(), ((Number) pair5.getSecond()).intValue(), Float.valueOf(c20475515Ab4.LIZ.LIZ), Float.valueOf(c20475515Ab4.LIZ.LIZIZ)), 4));
                                    C15A0 c15a0LJI5 = c20475515Ab4.LJI();
                                    if (c15a0LJI5 != null) {
                                        c15a0LJI5.LJ = true;
                                    }
                                    c15ba3.LIZ(c20475515Ab4, linkedHashMap, 1, 0L);
                                }
                                Iterator it5 = linkedHashMap.entrySet().iterator();
                                if (it5.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it5.next();
                                    long j = ((C15AK) entry.getValue()).LIZ + ((C15AK) entry.getValue()).LIZIZ;
                                    while (it5.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it5.next();
                                        long j2 = ((C15AK) entry2.getValue()).LIZ + ((C15AK) entry2.getValue()).LIZIZ;
                                        if (j < j2) {
                                            j = j2;
                                        }
                                    }
                                    List<C20475515Ab> list8 = c15ba3.LIZIZ;
                                    ArrayList<C20475515Ab> arrayList15 = new ArrayList();
                                    for (Object obj8 : (ArrayList) list8) {
                                        C15A0 c15a0LJI6 = ((C20475515Ab) obj8).LJI();
                                        if (c15a0LJI6 != null && !c15a0LJI6.LJ) {
                                            arrayList15.add(obj8);
                                        }
                                    }
                                    for (C20475515Ab c20475515Ab5 : arrayList15) {
                                        C15A0 c15a0LJI7 = c20475515Ab5.LJI();
                                        if (c15a0LJI7 != null) {
                                            c15a0LJI7.LJ = true;
                                            String str4 = c20475515Ab5.LIZIZ;
                                            C15AG c15ag = C15AG.TRANSLATE;
                                            PointF pointF2 = c15a0LJI7.LJI;
                                            linkedHashMap.put(str4, new C15AK(j, 1000L, null, c15ag, new C1782410wU3(pointF2.x, pointF2.y, Float.valueOf(c15a0LJI7.LJFF.x), Float.valueOf(c15a0LJI7.LJFF.y)), 4));
                                        }
                                    }
                                    for (C20475515Ab c20475515Ab6 : (ArrayList) c15ba3.LIZIZ) {
                                        C15A0 c15a0LJI8 = c20475515Ab6.LJI();
                                        if (c15a0LJI8 != null) {
                                            c15a0LJI8.LJ = false;
                                        }
                                        C15A0 c15a0LJI9 = c20475515Ab6.LJI();
                                        if (c15a0LJI9 != null && (pointF = c15a0LJI9.LJI) != null) {
                                            C15A0 c15a0LJI10 = c20475515Ab6.LJI();
                                            if (c15a0LJI10 != null) {
                                                c15a0LJI10.LJFF = pointF;
                                            }
                                            C20476115Ah c20476115Ah2 = c20475515Ab6.LIZ;
                                            c20476115Ah2.LIZ = (int) pointF.x;
                                            c20476115Ah2.LIZIZ = (int) pointF.y;
                                        }
                                    }
                                    List<C20475515Ab> list9 = c15ba3.LIZIZ;
                                    ArrayList arrayList16 = new ArrayList(C15438062q.LJIJJ(list9, 10));
                                    Iterator it6 = ((ArrayList) list9).iterator();
                                    while (it6.hasNext()) {
                                        arrayList16.add(((C20475515Ab) it6.next()).LJ(null, null));
                                    }
                                    ((ArrayList) c15ba3.LIZIZ).clear();
                                    ((ArrayList) c15ba3.LIZIZ).addAll(arrayList16);
                                    pair2 = new Pair(arrayList16, linkedHashMap);
                                    mapLJ = (Map) pair2.getSecond();
                                    if (mapLJ == null) {
                                    }
                                    linkedHashMap3.putAll(mapLJ);
                                    if (pair2 != null && (collection = (Collection) pair2.getFirst()) != null) {
                                        ((ArrayList) this.LJIIIZ).clear();
                                        ((ArrayList) this.LJIIIZ).addAll(collection);
                                    }
                                } else {
                                    throw new NoSuchElementException();
                                }
                            } else {
                                pair2 = null;
                            }
                            mapLJ = C2097608Jq.LJ();
                            linkedHashMap3.putAll(mapLJ);
                            if (pair2 != null) {
                                ((ArrayList) this.LJIIIZ).clear();
                                ((ArrayList) this.LJIIIZ).addAll(collection);
                            }
                        }
                        C15BE c15be = C15BE.MOVE;
                        ArrayList arrayList17 = new ArrayList();
                        arrayList17.addAll(this.LJIIIZ);
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            Object key = entry3.getKey();
                            Object value = entry3.getValue();
                            ArrayList arrayList18 = new ArrayList();
                            arrayList18.add(value);
                            linkedHashMap5.put(key, new C15B1(arrayList18, false));
                        }
                        arrayList.add(new C20477515Av(c15be, true, false, arrayList17, linkedHashMap5, null, 192));
                    } else {
                        String strLJJ7 = LJJ();
                        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                        sbLIZ13.append("afterAddedSize:");
                        sbLIZ13.append(size4);
                        sbLIZ13.append(" return as point is null");
                        C20441214yg.LJIIIZ(strLJJ7, C2188811AlT.LIZIZ(sbLIZ13));
                    }
                    i11 = i12;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        LIZJ(this.LJI, iLIZ, true, arrayList);
        String strLJJ8 = LJJ();
        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
        sbLIZ14.append("noChampionAnimationGroupList noChampionAnimationGroupList.size:");
        sbLIZ14.append(arrayList.size());
        sbLIZ14.append(" lastShowdownUserList.size:");
        sbLIZ14.append(((ArrayList) this.LJII).size());
        sbLIZ14.append(" curShowdownList.size:");
        sbLIZ14.append(guestShowdownContent.runningPlayUsers.size());
        C20441214yg.LJIIIZ(strLJJ8, C2188811AlT.LIZIZ(sbLIZ14));
        return arrayList;
    }

    public List<C20477515Av> LJIIIIZZ(ViewGroup viewGroup, GuestShowdownContent guestShowdownContent, String str, boolean z) {
        C20477515Av c20477515AvLJIILJJIL;
        C20477515Av c20477515AvLJIILJJIL2;
        ArrayList arrayList = new ArrayList();
        int iLIZ = C15BG.LIZ(guestShowdownContent);
        EnumC204738159k enumC204738159kLIZ = LIZ(Integer.valueOf(iLIZ));
        if (enumC204738159kLIZ != null && (c20477515AvLJIILJJIL2 = LJIILJJIL(this, enumC204738159kLIZ, guestShowdownContent, Boolean.FALSE)) != null) {
            arrayList.add(c20477515AvLJIILJJIL2);
        }
        int i = this.LJI;
        if (i != 10) {
            C20477615Aw c20477615AwLIZ = null;
            if (i != 40 && i != 50) {
                if (i != 0) {
                    C20441214yg.LJ(LJJ(), "curStatus is GUEST_SHOWDOWN_STATUS_READY but lastStatus is not unknown");
                }
                C20477515Av c20477515AvLJIILL = LJIILL();
                if (c20477515AvLJIILL != null) {
                    if (this.LJI != iLIZ) {
                        List<C20477615Aw> list = C20477615Aw.LIZLLL;
                        c20477615AwLIZ = C20477715Ax.LIZ(iLIZ, C13LP.LLIIII(c20477515AvLJIILL.LJFF.keySet()));
                    }
                    c20477515AvLJIILL.LJI = c20477615AwLIZ;
                    arrayList.add(c20477515AvLJIILL);
                }
            } else {
                C20477515Av c20477515AvLJIILL2 = LJIILL();
                if (c20477515AvLJIILL2 != null) {
                    if (this.LJI != iLIZ) {
                        List<C20477615Aw> list2 = C20477615Aw.LIZLLL;
                        c20477615AwLIZ = C20477715Ax.LIZ(iLIZ, C13LP.LLIIII(c20477515AvLJIILL2.LJFF.keySet()));
                    }
                    c20477515AvLJIILL2.LJI = c20477615AwLIZ;
                    Iterator<C15BU> it2 = this.LJFF.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(EnumC1153990g8T.CLEAR_QUEUE, new C20477515Av(null, false, false, null, null, null, 253));
                    }
                    arrayList.add(c20477515AvLJIILL2);
                }
            }
        } else {
            C20441214yg.LJIIIZ(LJJ(), "curStatus is GUEST_SHOWDOWN_STATUS_READY the same as all status");
        }
        EnumC204738159k enumC204738159kLIZ2 = LIZ(Integer.valueOf(iLIZ));
        if (enumC204738159kLIZ2 != null && (c20477515AvLJIILJJIL = LJIILJJIL(this, enumC204738159kLIZ2, guestShowdownContent, Boolean.TRUE)) != null) {
            arrayList.add(c20477515AvLJIILJJIL);
        }
        return arrayList;
    }

    public final InterfaceC20476615Am LJIIL(EnumC204738159k enumC204738159k, long j, GuestShowdownContent guestShowdownContent, Boolean bool, Boolean bool2) {
        int i;
        C204733159f c204733159f;
        int i2;
        C20475815Ae c20475815Ae = this.LIZ;
        String str = C15BC.LIZJ;
        InterfaceC20476615Am interfaceC20476615AmLIZIZ = c20475815Ae.LIZIZ(str);
        if (interfaceC20476615AmLIZIZ != null) {
            InterfaceC20477315At interfaceC20477315AtLIZ = interfaceC20476615AmLIZIZ.LIZ();
            if ((interfaceC20477315AtLIZ instanceof C204733159f) && (c204733159f = (C204733159f) interfaceC20477315AtLIZ) != null) {
                if (c204733159f.LIZ != enumC204738159k) {
                    c204733159f.LJ = LJIJJ(enumC204738159k);
                }
                c204733159f.LIZ = enumC204738159k;
                GuestShowdownConfig guestShowdownConfig = guestShowdownContent.playConfig;
                if (guestShowdownConfig != null) {
                    i2 = (int) guestShowdownConfig.duration;
                } else {
                    i2 = 0;
                }
                c204733159f.LIZIZ = i2;
                c204733159f.LJIIIZ = j;
                if (bool != null) {
                    c204733159f.LJIIJJI = bool.booleanValue();
                }
                if (bool2 != null) {
                    c204733159f.LJIIL = bool2.booleanValue();
                }
                c204733159f.LJIILIIL = new AwS575S0100000_31(this, 1609);
            }
            return interfaceC20476615AmLIZIZ;
        }
        float fLJJI = C497740JfY.LJJI(this.LIZIZ.getMeasuredHeight()) / 117;
        float f = 15 * fLJJI;
        if (f < 13.0f) {
            f = 13.0f;
        }
        float f2 = fLJJI * 11;
        if (f2 < 10.0f) {
            f2 = 10.0f;
        }
        C20475815Ae c20475815Ae2 = this.LIZ;
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.LABEL;
        C20476115Ah c20476115Ah = new C20476115Ah(0, 0, this.LIZIZ.getMeasuredWidth(), this.LIZIZ.getMeasuredHeight(), 0.0f, 0.0f, 0.0f, C15BN.LIZJ + 1.0f, 112);
        String strLJIJJ = LJIJJ(enumC204738159k);
        int iLIZLLL = C497740JfY.LIZLLL(R.attr.exr, this.LIZIZ.getContext());
        int i3 = (int) f;
        GuestShowdownConfig guestShowdownConfig2 = guestShowdownContent.playConfig;
        if (guestShowdownConfig2 != null) {
            i = (int) guestShowdownConfig2.duration;
        } else {
            i = 0;
        }
        return c20475815Ae2.LIZ(str, enumC20476415Ak, c20476115Ah, new C204733159f(enumC204738159k, i, -1, strLJIJJ, Integer.valueOf(iLIZLLL), Float.valueOf(f2), i3, null, j, false, !Intrinsics.LJFF(bool, Boolean.FALSE), Intrinsics.LJFF(bool2, Boolean.TRUE), new AwS575S0100000_31(this, 1610), 264), EnumC20476715An.NORMAL);
    }

    public C15B5(C20475815Ae c20475815Ae, ViewGroup viewGroup, ViewGroup viewGroup2, C20476915Ap c20476915Ap, boolean z, List list) {
        this.LIZ = c20475815Ae;
        this.LIZIZ = viewGroup;
        this.LIZJ = viewGroup2;
        this.LIZLLL = c20476915Ap;
        this.LJ = z;
        this.LJFF = list;
    }
}
