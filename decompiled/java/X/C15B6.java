package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestShowdownShowPunishAnimationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS432S0200000_31;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.15B6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15B6 extends C15B5 {
    public final C20475815Ae LJIIJJI;
    public final ViewGroup LJIIL;
    public final ViewGroup LJIILIIL;
    public final C20476915Ap LJIILJJIL;
    public final boolean LJIILL;
    public final List<C15BU> LJIILLIIL;
    public final DataChannel LJIIZILJ;

    @Override // X.C15B5
    public final String LJJ() {
        return "Top1ModeAnimationGroupCalculator";
    }

    public static List LJJIJIIJIL(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((GuestShowdownUser) obj).userTag != 2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Pair LJJIJL(View view) {
        return new Pair(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
    }

    @Override // X.C15B5
    public final List LJII(GuestShowdownContent guestShowdownContent) {
        if (!this.LJIILL) {
            LJIIIZ(guestShowdownContent);
        }
        ArrayList arrayList = new ArrayList();
        int iLIZ = C15BG.LIZ(guestShowdownContent);
        int i = this.LJI;
        ArrayList arrayList2 = new ArrayList();
        C20476915Ap.LJ(this.LJIILJJIL);
        this.LJIILJJIL.LJIIL(C15BC.LJ);
        EnumC204738159k enumC204738159kLIZ = LIZ(Integer.valueOf(iLIZ));
        if (enumC204738159kLIZ == null) {
            enumC204738159kLIZ = EnumC204738159k.RUNNING_STATE_SHOW_TIME;
        }
        Boolean bool = Boolean.TRUE;
        InterfaceC20476615Am interfaceC20476615AmLJIIL = LJIIL(enumC204738159kLIZ, 0L, guestShowdownContent, null, bool);
        C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", "punish animation finish show board");
        this.LJIIJJI.LIZJ(interfaceC20476615AmLJIIL);
        arrayList2.add(C15BO.LIZJ(Collections.singletonList(interfaceC20476615AmLJIIL)));
        boolean z = false;
        if (i != 10) {
            if (i != 30) {
                if (i != 40) {
                    if (i != 21 && i != 22) {
                        LJJIIZI(guestShowdownContent, arrayList2, false);
                    }
                    this.LJIILJJIL.LIZIZ(EnumC20476415Ak.AVATAR);
                    LJJIIZI(guestShowdownContent, arrayList2, true);
                } else {
                    C20441214yg.LJ("Top1ModeAnimationGroupCalculator", "last status is punish period, the same status with current status");
                }
            } else {
                LJJIIZI(guestShowdownContent, arrayList2, true);
            }
        } else {
            this.LJIILJJIL.LIZIZ(EnumC20476415Ak.AVATAR);
            LJJIIZI(guestShowdownContent, arrayList2, true);
        }
        EnumC204738159k enumC204738159kLIZ2 = LIZ(Integer.valueOf(iLIZ));
        if (enumC204738159kLIZ2 == null) {
            enumC204738159kLIZ2 = EnumC204738159k.RUNNING_STATE_SHOW_TIME;
        }
        InterfaceC20476615Am interfaceC20476615AmLJIIL2 = LJIIL(enumC204738159kLIZ2, 0L, guestShowdownContent, bool, Boolean.FALSE);
        C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", "punish animation finish show board");
        this.LJIIJJI.LIZJ(interfaceC20476615AmLJIIL2);
        arrayList2.add(C15BO.LIZJ(Collections.singletonList(interfaceC20476615AmLJIIL2)));
        int i2 = this.LJI;
        if (i2 == 30) {
            z = true;
        }
        C15B5.LIZJ(i2, iLIZ, z, arrayList2);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public static float LJJIJIIJI(int i, int i2) {
        return C15BN.LIZIZ + C418440Gaw.LIZIZ(Integer.valueOf(i2 - i));
    }

    public static boolean LJJIJIL(List list, GuestShowdownUser guestShowdownUser) {
        boolean z;
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            z = false;
            if (it2.hasNext()) {
                next = it2.next();
                if (((C15BM) next).LIZIZ == guestShowdownUser.userId) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C15BM c15bm = (C15BM) next;
        if (c15bm != null && guestShowdownUser.userTag == c15bm.LIZ) {
            z = true;
        }
        boolean z2 = !z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSwitchRole guestShowdownUser:");
        sbLIZ.append(guestShowdownUser.nickname);
        sbLIZ.append(' ');
        sbLIZ.append(z2);
        C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", C2188811AlT.LIZIZ(sbLIZ));
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0267  */
    @Override // X.C15B5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJFF(android.view.ViewGroup r38, webcast.data.multi_guest_play.GuestShowdownContent r39) {
        /*
            Method dump skipped, instruction units count: 1373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B6.LJFF(android.view.ViewGroup, webcast.data.multi_guest_play.GuestShowdownContent):java.util.List");
    }

    public static C20476115Ah LJJIII(Rect rect, C15BH c15bh, int i) {
        return new C20476115Ah(rect.left, rect.top, rect.width(), rect.height(), 0.0f, 0.0f, 0.0f, LJJIJIIJI(c15bh.LIZJ, i), 112);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02f2, code lost:
    
        r13.add(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03b0, code lost:
    
        r1 = r6.indexOf(r13) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03b6, code lost:
    
        if (r1 < 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03b8, code lost:
    
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03bc, code lost:
    
        if (r1 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03c2, code lost:
    
        if (r14.contains(r1) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03c4, code lost:
    
        r2 = r14.indexOf(r1) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03ca, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r14, r2, r13);
        r10.add(new X.C15BH(X.C15BK.ADD, r13, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03d8, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r13.add(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C20477515Av> LJJIIZ(java.util.List<X.C15BM> r39, java.util.List<webcast.data.multi_guest_play.GuestShowdownUser> r40, webcast.data.multi_guest_play.GuestShowdownContent r41) {
        /*
            Method dump skipped, instruction units count: 2745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B6.LJJIIZ(java.util.List, java.util.List, webcast.data.multi_guest_play.GuestShowdownContent):java.util.List");
    }

    public final void LJJIIZI(GuestShowdownContent guestShowdownContent, List<C20477515Av> list, boolean z) {
        Integer numValueOf;
        GuestShowdownUser next;
        int i;
        int i2;
        C20477515Av c20477515AvLJIILLIIL;
        int i3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GUEST_SHOWDOWN_STATUS_PUNISHMENT_PERIOD runningPlayUsers:");
        sbLIZ.append(guestShowdownContent.runningPlayUsers.size());
        sbLIZ.append(" needAnimation:");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<GuestShowdownUser> it2 = guestShowdownContent.runningPlayUsers.iterator();
        while (true) {
            numValueOf = null;
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
        List<GuestShowdownUser> list2 = guestShowdownContent.runningPlayUsers;
        ArrayList arrayList = new ArrayList();
        for (GuestShowdownUser guestShowdownUser2 : list2) {
            if (guestShowdownUser2.userTag == 3) {
                arrayList.add(guestShowdownUser2);
            }
        }
        AwS432S0200000_31 awS432S0200000_31 = new AwS432S0200000_31(this, guestShowdownContent, 134);
        if (guestShowdownUser == null) {
            ((ArrayList) list).addAll(LJIJJLI(awS432S0200000_31, z));
            return;
        }
        C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", "createShowoffAndPunishAnimationGroup has winner");
        if (z && this.LJIILL) {
            int i4 = C15B8.LJIJI;
            InterfaceC20476615Am interfaceC20476615AmLIZIZ = C15BB.LIZIZ(this.LJIIJJI, this.LJIIL, C15BC.LIZ("ttlive_guest_showdown_bg_state_3.png"));
            if (interfaceC20476615AmLIZIZ != null) {
                ((ArrayList) list).add(new C20477515Av(C15BE.NONE, false, false, Collections.singletonList(interfaceC20476615AmLIZIZ), null, null, 232));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createShowChampionAnimationGroupList winner:");
            sbLIZ2.append(guestShowdownUser.nickname);
            C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", C2188811AlT.LIZIZ(sbLIZ2));
            int iLIZ = C439101nJ.LIZ(52);
            int measuredWidth = (this.LJIIL.getMeasuredWidth() - iLIZ) / 2;
            int measuredHeight = (this.LJIIL.getMeasuredHeight() - iLIZ) / 2;
            Rect rect = new Rect(measuredWidth, measuredHeight, measuredWidth + iLIZ, iLIZ + measuredHeight);
            C15BF c15bf = C15B7.LJJIIJ;
            String str = c15bf.LIZ;
            Rect rectLIZ = C15BB.LIZ(rect, c15bf);
            C20476115Ah c20476115Ah = new C20476115Ah(rectLIZ.left, rectLIZ.top, rectLIZ.width(), rectLIZ.height(), 0.0f, 0.0f, 0.0f, C15BN.LIZIZ, 112);
            C15AO c15aoLIZIZ = C15BC.LIZIZ(c15bf, guestShowdownUser.avatarThumb);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Ruben Gous", guestShowdownUser.nickname);
            c15aoLIZIZ.LIZLLL = linkedHashMap;
            InterfaceC20476615Am interfaceC20476615AmLIZ = this.LIZ.LIZ(str, EnumC20476415Ak.LOTTIE, c20476115Ah, new C204746159s(c15aoLIZIZ, C15BB.LIZJ(guestShowdownUser), false), EnumC20476715An.NORMAL);
            if (!(interfaceC20476615AmLIZ instanceof C20475415Aa)) {
                C20441214yg.LJ("Top1ModeAnimationGroupCalculator", "createTimeUpAnimationGroup return as geniusModel isn't LottieGeniusModel");
                c20477515AvLJIILLIIL = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(interfaceC20476615AmLIZ);
                c20477515AvLJIILLIIL = C15B5.LJIILLIIL(arrayList2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("showChampionAnimationGroup :");
            if (c20477515AvLJIILLIIL != null) {
                numValueOf = Integer.valueOf(c20477515AvLJIILLIIL.hashCode());
            }
            sbLIZ3.append(numValueOf);
            C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", C2188811AlT.LIZIZ(sbLIZ3));
            if (c20477515AvLJIILLIIL != null) {
                ((ArrayList) list).add(c20477515AvLJIILLIIL);
            }
            C20475815Ae c20475815Ae = this.LJIIJJI;
            C20476915Ap c20476915Ap = this.LJIILJJIL;
            ViewGroup viewGroup = this.LJIIL;
            int measuredWidth2 = viewGroup.getMeasuredWidth();
            int measuredHeight2 = this.LJIIL.getMeasuredHeight();
            int i5 = C15B8.LJIJJLI;
            int i6 = C15B8.LJIJJ;
            if (arrayList.size() >= 4) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            List<C20477515Av> listLJ = new C15B7(c20475815Ae, c20476915Ap, viewGroup, measuredWidth2, measuredHeight2, i5, i6, i3).LJ(guestShowdownUser, arrayList, awS432S0200000_31);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("createShowOffTranslateAnimationGroupList :");
            sbLIZ4.append(((ArrayList) listLJ).size());
            C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", C2188811AlT.LIZIZ(sbLIZ4));
            ((ArrayList) list).addAll(listLJ);
            return;
        }
        if (MultiGuestShowdownShowPunishAnimationSetting.INSTANCE.isEnable()) {
            C20475815Ae c20475815Ae2 = this.LJIIJJI;
            C20476915Ap c20476915Ap2 = this.LJIILJJIL;
            ViewGroup viewGroup2 = this.LJIIL;
            int measuredWidth3 = viewGroup2.getMeasuredWidth();
            int measuredHeight3 = this.LJIIL.getMeasuredHeight();
            int i7 = C15B8.LJIJJLI;
            int i8 = C15B8.LJIJJ;
            if (arrayList.size() >= 4) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            List<C20477515Av> listLJ2 = new C15B7(c20475815Ae2, c20476915Ap2, viewGroup2, measuredWidth3, measuredHeight3, i7, i8, i2).LJ(guestShowdownUser, arrayList, null);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("createShowOffTranslateAnimationGroupList :");
            sbLIZ5.append(((ArrayList) listLJ2).size());
            C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", C2188811AlT.LIZIZ(sbLIZ5));
            ((ArrayList) list).addAll(listLJ2);
            return;
        }
        C20475815Ae c20475815Ae3 = this.LJIIJJI;
        C20476915Ap c20476915Ap3 = this.LJIILJJIL;
        ViewGroup viewGroup3 = this.LJIIL;
        int measuredWidth4 = viewGroup3.getMeasuredWidth();
        int measuredHeight4 = this.LJIIL.getMeasuredHeight();
        int i9 = C15B8.LJIJJLI;
        int i10 = C15B8.LJIJJ;
        if (arrayList.size() >= 4) {
            i = 2;
        } else {
            i = 1;
        }
        C15B7 c15b7 = new C15B7(c20475815Ae3, c20476915Ap3, viewGroup3, measuredWidth4, measuredHeight4, i9, i10, i);
        ArrayList arrayList3 = new ArrayList();
        c15b7.LIZ(arrayList3, null);
        C20477515Av c20477515Av = (C20477515Av) C13LP.LJJJLL(c15b7.LIZLLL(arrayList, guestShowdownUser));
        if (c20477515Av != null) {
            arrayList3.add(C15BO.LIZJ(c20477515Av.LJ));
        }
        ((ArrayList) list).addAll(arrayList3);
    }

    @Override // X.C15B5
    public final List<C20477515Av> LJI(ViewGroup viewGroup, GuestShowdownContent guestShowdownContent, String str, boolean z) {
        int iLIZ = C15BG.LIZ(guestShowdownContent);
        List<C20477515Av> listLJI = super.LJI(viewGroup, guestShowdownContent, str, z);
        C15B5.LIZJ(this.LJI, iLIZ, true, listLJI);
        return listLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(X.C15BH r38, java.util.List r39, java.util.List r40, webcast.data.multi_guest_play.GuestShowdownContent r41) {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B6.LJJII(X.15BH, java.util.List, java.util.List, webcast.data.multi_guest_play.GuestShowdownContent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C15A1 LJJIJ(android.graphics.Rect r39, int r40, webcast.data.multi_guest_play.GuestShowdownUser r41, boolean r42, float r43) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B6.LJJIJ(android.graphics.Rect, int, webcast.data.multi_guest_play.GuestShowdownUser, boolean, float):X.15A1");
    }

    public final InterfaceC20476615Am LJJIIJ(GuestShowdownUser guestShowdownUser, C20476115Ah c20476115Ah, Rect rect, GuestShowdownContent guestShowdownContent, boolean z, boolean z2) {
        int width;
        C20475815Ae c20475815Ae = this.LJIIJJI;
        C15BI c15bi = C15BS.LJJLI;
        String str = guestShowdownUser.linkmicId;
        c15bi.getClass();
        String strLIZ = C15BI.LIZ(str);
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.AVATAR;
        int i = C15B8.LJIJI;
        User userLIZJ = C15BB.LIZJ(guestShowdownUser);
        String str2 = guestShowdownUser.linkmicId;
        if (z) {
            width = this.LJIIL.getWidth();
        } else {
            width = rect.left;
        }
        return c20475815Ae.LIZ(strLIZ, enumC20476415Ak, c20476115Ah, new C15A0(false, false, userLIZJ, str2, new PointF(width, rect.top), new PointF(rect.left, rect.top), LJJIJ(c20476115Ah.LIZIZ(), guestShowdownContent.runningStep, guestShowdownUser, z2, 0.0f), 275), EnumC20476715An.NORMAL);
    }

    public C15B6(C20475815Ae c20475815Ae, ViewGroup viewGroup, ViewGroup viewGroup2, C20476915Ap c20476915Ap, boolean z, List<C15BU> list, DataChannel dataChannel) {
        super(c20475815Ae, viewGroup, viewGroup2, c20476915Ap, z, list);
        this.LJIIJJI = c20475815Ae;
        this.LJIIL = viewGroup;
        this.LJIILIIL = viewGroup2;
        this.LJIILJJIL = c20476915Ap;
        this.LJIILL = z;
        this.LJIILLIIL = list;
        this.LJIIZILJ = dataChannel;
    }

    public final void LJJIJLIJ(Pair<Integer, Integer> pair, List<C15BM> list, GuestShowdownUser guestShowdownUser, int i, int i2, int i3, List<InterfaceC20476615Am> list2, Map<String, C15B1> map, boolean z) {
        Float fValueOf;
        C20476115Ah location;
        Rect rect = C1491140ouG.LIZ;
        Rect rectLIZ = C1491130ouF.LIZ(i2, i, pair);
        C15B6 c15b6 = this;
        C20475815Ae c20475815Ae = c15b6.LJIIJJI;
        C15BI c15bi = C15BS.LJJLI;
        String str = guestShowdownUser.linkmicId;
        c15bi.getClass();
        InterfaceC20476615Am interfaceC20476615AmLIZIZ = c20475815Ae.LIZIZ(C15BI.LIZ(str));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guestShowdownUser:");
        sbLIZ.append(guestShowdownUser.nickname);
        sbLIZ.append(" realUseIndex:");
        sbLIZ.append(i);
        sbLIZ.append(" changeZorder:");
        sbLIZ.append(z);
        sbLIZ.append(" zOrder:");
        if (interfaceC20476615AmLIZIZ != null && (location = interfaceC20476615AmLIZIZ.getLocation()) != null) {
            fValueOf = Float.valueOf(location.LJII);
        } else {
            fValueOf = null;
        }
        sbLIZ.append(fValueOf);
        C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC20476615AmLIZIZ instanceof C20475515Ab) {
            C20475515Ab c20475515Ab = (C20475515Ab) interfaceC20476615AmLIZIZ;
            float fWidth = rectLIZ.width() / c20475515Ab.LIZ.LIZJ;
            int iWidth = (rectLIZ.width() - c20475515Ab.LIZ.LIZJ) / 2;
            C15A0 c15a0LJI = c20475515Ab.LJI();
            if (c15a0LJI != null) {
                c15a0LJI.LJI = new PointF(rectLIZ.left, rectLIZ.top);
            }
            C20476115Ah c20476115Ah = c20475515Ab.LIZ;
            c20476115Ah.LIZ = rectLIZ.left;
            c20476115Ah.LIZIZ = rectLIZ.top;
            c20476115Ah.LIZJ = rectLIZ.width();
            c20475515Ab.LIZ.LIZLLL = rectLIZ.height();
            c20475515Ab.LIZ.LJII = LJJIJIIJI(i, i2);
            C15A0 c15a0LJI2 = c20475515Ab.LJI();
            if (c15a0LJI2 != null) {
                c15a0LJI2.LIZ = false;
                c15a0LJI2.LIZIZ = false;
            }
            C15A0 c15a0LJI3 = c20475515Ab.LJI();
            if (c15a0LJI3 != null) {
                c15b6 = c15b6;
                c15a0LJI3.LJII = c15b6.LJJIJ(c20475515Ab.LIZ.LIZIZ(), i3, guestShowdownUser, LJJIJIL(list, guestShowdownUser), 0.0f);
            }
            ArrayList arrayList = new ArrayList();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("remove showChampion guestShowdownUser:");
            sbLIZ2.append(guestShowdownUser.nickname);
            sbLIZ2.append(" realUseIndex:");
            sbLIZ2.append(i);
            sbLIZ2.append(" rect:");
            sbLIZ2.append(rectLIZ);
            sbLIZ2.append(" rect.width:");
            sbLIZ2.append(rectLIZ.width());
            sbLIZ2.append(" zOrder:");
            sbLIZ2.append(c20475515Ab.LIZ.LJII);
            C20441214yg.LJIIIZ("Top1ModeAnimationGroupCalculator", C2188811AlT.LIZIZ(sbLIZ2));
            arrayList.add(C15AL.LIZIZ(C15AG.TRANSLATE, new C1782410wU3(rectLIZ.left + iWidth, rectLIZ.top + iWidth, null, null), 0L, 0L, 28));
            arrayList.add(C15AL.LIZIZ(C15AG.SCALE, new C15A2(new Pair(Float.valueOf(fWidth), Float.valueOf(fWidth)), null, 6, 0), 0L, 0L, 28));
            if (z) {
                C15AG c15ag = C15AG.Z_ORDER;
                float f = c20475515Ab.LIZ.LJII;
                arrayList.add(C15AL.LIZIZ(c15ag, new C15A5(f, Float.valueOf(f)), 0L, 0L, 28));
            }
            C15B1 c15b1 = new C15B1(arrayList, false);
            c15b6.LJIIJJI.LIZJ(interfaceC20476615AmLIZIZ);
            ((ArrayList) list2).add(interfaceC20476615AmLIZIZ);
            map.put(c20475515Ab.LIZIZ, c15b1);
        }
    }
}
