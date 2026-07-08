package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIntegralOptSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.15B7, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15B7 {
    public static final int LJIJJLI = C439101nJ.LIZ(4);
    public static final int LJIL = C439101nJ.LIZ(26);
    public static final int LJJ = C439101nJ.LIZ(18);
    public static final int LJJI = C439101nJ.LIZ(22);
    public static final String LJJIFFI;
    public static final String LJJII;
    public static final String LJJIII;
    public static final C15BF LJJIIJ;
    public static final C15BF LJJIIJZLJL;
    public final C20475815Ae LIZ;
    public final C20476915Ap LIZIZ;
    public final ViewGroup LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1618));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1619));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1612));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1615));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1611));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1617));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1614));
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1616));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1613));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1622));
    public final C01GW LJIJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1620));
    public final C01GW LJIJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1621));
    public final String LJIJJ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.TEXT;
        sbLIZ.append(enumC20476415Ak);
        sbLIZ.append("_punish_loser");
        LJJIFFI = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(enumC20476415Ak);
        sbLIZ2.append("_punish_winner");
        LJJII = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        EnumC20476415Ak enumC20476415Ak2 = EnumC20476415Ak.LOTTIE;
        sbLIZ3.append(enumC20476415Ak2);
        sbLIZ3.append("_punish_winner");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        LJJIII = strLIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(enumC20476415Ak2);
        sbLIZ4.append("_showoff_winner");
        LJJIIJ = new C15BF(C2188811AlT.LIZIZ(sbLIZ4), "guest_showdown_showoff_show_champion.zip", new Pair(871, 349), new Pair(192, 192), Collections.singletonList("avatar_1.png"), (C20345814jI) null, 96);
        LJJIIJZLJL = new C15BF(strLIZIZ, "multi_guest_guest_showdown_punish_winner_avatar.zip", (Pair<Integer, Integer>) new Pair(312, 312), (Pair<Integer, Integer>) new Pair(144, 144), (List<String>) Collections.singletonList("avatar_2.png"), new C20345814jI(-1, new Pair(Float.valueOf(0.0f), Float.valueOf(1.0f))), new C20345714jH(EnumC20439114yL.GECKO, C1143780fs0.LJIIJ("tiktok_live_interaction_guest_showdown", "guest_showdown_punish_winner_avatar.png"), new Pair(312, 312), new Pair(146, 146)));
    }

    public final float LJII() {
        return ((Number) this.LJIIJ.getValue()).floatValue();
    }

    public final int LJIIJ() {
        return ((Number) this.LJIIIZ.getValue()).intValue();
    }

    public final float LJIIJJI() {
        return ((Number) this.LJIJI.getValue()).floatValue();
    }

    public static C204746159s LIZJ(C20345814jI c20345814jI) {
        return new C204746159s(new C15AO("tiktok_live_interaction_guest_showdown", "multi_guest_guest_showdown_emoji_3.zip", (Function2) null, (Map) null, c20345814jI, 0L, false, new C20345714jH(EnumC20439114yL.GECKO, C15BC.LIZ("ttlive_ic_guest_showdown_loser_emoji_3.png"), null, null), (List) null, (Map) null, 1772));
    }

    public static String LJIIIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC20476415Ak.TEXT);
        sbLIZ.append("_lose");
        sbLIZ.append(i + 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIL(String str) {
        C20441214yg.LIZIZ("SequentialAnimatorHelper", str);
    }

    public final String LJIIIIZZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(List<C20477515Av> list, Function0<Unit> function0) {
        int i = C15B8.LJIJI;
        InterfaceC20476615Am interfaceC20476615AmLIZIZ = C15BB.LIZIZ(this.LIZ, this.LIZJ, C15BC.LIZ("ttlive_guest_showdown_bg_state_5.png"));
        if (interfaceC20476615AmLIZIZ != null) {
            LJIIL("add ttlive_guest_showdown_bg_state_5");
            ((ArrayList) list).add(new C20477515Av(C15BE.NONE, false, false, Collections.singletonList(interfaceC20476615AmLIZIZ), null, new AwS397S0200000_31(this, (C15B7) function0, (Function0<Unit>) 137), 104));
        }
    }

    public final List LIZLLL(List list, GuestShowdownUser guestShowdownUser) {
        Rect rect;
        int i;
        EnumC20439114yL enumC20439114yL;
        float size;
        int i2;
        int i3;
        Float fValueOf;
        int i4;
        int i5;
        C20476115Ah location;
        int i6 = this.LJII;
        for (int i7 = 0; i7 < i6; i7++) {
            this.LIZIZ.LJIIL(LJIIIIZZ(i7));
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = (ArrayList) list;
        if (arrayList2.isEmpty()) {
            float f = 2;
            rect = new Rect((int) ((this.LIZLLL - LJII()) / f), (int) LJIIJJI(), (int) (((this.LIZLLL - LJII()) / f) + LJII()), (int) (LJIIJJI() + LJII()));
        } else {
            rect = new Rect((int) ((Number) this.LJIJ.getValue()).floatValue(), (int) LJIIJJI(), (int) (((Number) this.LJIJ.getValue()).floatValue() + LJII()), (int) (LJIIJJI() + LJII()));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createPunishShowAnimationGroups winnerAvatarRect:");
        sbLIZ.append(rect);
        LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        int i8 = C15B8.LJIJI;
        C15BF c15bf = LJJIIJZLJL;
        Rect rectLIZ = C15BB.LIZ(rect, c15bf);
        boolean z = C15BC.LIZ;
        InterfaceC20476615Am interfaceC20476615AmLIZ = this.LIZ.LIZ(LJJIII, EnumC20476415Ak.LOTTIE, new C20476115Ah(rectLIZ.left, rectLIZ.top, rectLIZ.width(), rectLIZ.height(), 0.0f, 0.0f, 0.0f, C15BN.LIZIZ, 112), new C204746159s(C15BC.LIZIZ(c15bf, guestShowdownUser.avatarThumb), C15BB.LIZJ(guestShowdownUser), false), EnumC20476715An.NORMAL);
        LJIIL("show winner avatar lottie");
        arrayList.add(interfaceC20476615AmLIZ);
        String geniusId = interfaceC20476615AmLIZ.getGeniusId();
        C15B3 c15b3 = new C15B3();
        c15b3.LIZ(C15AL.LIZIZ(C15AG.NONE, new C15BY(), 0L, 0L, 28));
        linkedHashMap.put(geniusId, c15b3.LIZJ());
        C20475815Ae c20475815Ae = this.LIZ;
        String str = LJJII;
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.TEXT;
        int i9 = rect.left;
        int i10 = LJIJJLI;
        C20476115Ah c20476115Ah = new C20476115Ah(i9 - i10, rect.bottom, rect.width() + (i10 * 2), C439101nJ.LIZ(24), 0.0f, 0.0f, 0.0f, 0.0f, 240);
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.eqx, this.LIZJ.getContext());
        String strLIZ = C341701Uh.LIZ(C497740JfY.LJIJI(2131852938), C1850730yGF.LIZLLL(guestShowdownUser.score, MultiGuestIntegralOptSetting.INSTANCE.isOpt()).toUpperCase(Locale.ROOT));
        MultiGuestIconResourceOptSetting multiGuestIconResourceOptSetting = MultiGuestIconResourceOptSetting.INSTANCE;
        if (multiGuestIconResourceOptSetting.isEnable()) {
            i = R.raw.icon_color_polygon_circle;
        } else {
            i = R.drawable.emi;
        }
        String strValueOf = String.valueOf(i);
        if (multiGuestIconResourceOptSetting.isEnable()) {
            enumC20439114yL = EnumC20439114yL.RAW_TYPE;
        } else {
            enumC20439114yL = EnumC20439114yL.RES_TYPE;
        }
        InterfaceC20476615Am interfaceC20476615AmLIZ2 = c20475815Ae.LIZ(str, enumC20476415Ak, c20476115Ah, new C150P(strLIZ, 16.0f, iLIZIZ, R.style.a99, new C150E(strValueOf, enumC20439114yL, 16.0f, 24), 32), EnumC20476715An.NORMAL);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C15AL.LIZIZ(C15AG.ALPHA, new C1782400wU2(1.0f, Float.valueOf(0.0f)), 0L, 0L, 28));
        C15B1 c15b1 = new C15B1(arrayList3, false);
        arrayList.add(interfaceC20476615AmLIZ2);
        linkedHashMap.put(interfaceC20476615AmLIZ2.getGeniusId(), c15b1);
        LJIIL("add winner score");
        Object it2 = new C13EL(list).iterator();
        int i11 = 0;
        while (true) {
            C13EM c13em = (C13EM) it2;
            if (c13em.hasNext()) {
                Object next = c13em.next();
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    GuestShowdownUser guestShowdownUser2 = (GuestShowdownUser) next;
                    float fFloatValue = ((Number) this.LJIIL.getValue()).floatValue() - (i11 * ((Number) this.LJIILLIIL.getValue()).floatValue());
                    float fFloatValue2 = ((Number) this.LJIILJJIL.getValue()).floatValue();
                    C20475815Ae c20475815Ae2 = this.LIZ;
                    C15BI c15bi = C15BS.LJJLI;
                    String str2 = guestShowdownUser2.linkmicId;
                    c15bi.getClass();
                    String strLIZ2 = C15BI.LIZ(str2);
                    EnumC20476415Ak enumC20476415Ak2 = EnumC20476415Ak.AVATAR;
                    C20476115Ah c20476115Ah2 = new C20476115Ah((int) (fFloatValue - LJII()), (int) fFloatValue2, (int) LJII(), (int) LJII(), 1.0f, 1.0f, 1.0f, C15BN.LIZIZ + C418440Gaw.LIZIZ(Integer.valueOf(i11)));
                    boolean z2 = false;
                    int i13 = C15B8.LJIJI;
                    InterfaceC20476615Am interfaceC20476615AmLIZ3 = c20475815Ae2.LIZ(strLIZ2, enumC20476415Ak2, c20476115Ah2, new C15A0(z2, z2, C15BB.LIZJ(guestShowdownUser2), guestShowdownUser2.linkmicId, new PointF(fFloatValue - LJII(), fFloatValue2), new PointF(fFloatValue - LJII(), fFloatValue2), null, 19), EnumC20476715An.NORMAL);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("createPunishShowAnimationGroups loserforEach index:");
                    sbLIZ2.append(i11);
                    sbLIZ2.append(" avatarActualSize:");
                    sbLIZ2.append(LJII());
                    sbLIZ2.append(" guestShowdownUser:");
                    sbLIZ2.append(guestShowdownUser2.nickname);
                    LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                    if (i11 == 0) {
                        InterfaceC20476615Am interfaceC20476615AmLIZIZ = this.LIZ.LIZIZ(LJIIIIZZ(i11));
                        int i14 = this.LJII;
                        Rect rectLIZIZ = interfaceC20476615AmLIZ3.getLocation().LIZIZ();
                        if (this.LJII > 1) {
                            i2 = LJJ;
                        } else {
                            i2 = LJJI;
                        }
                        InterfaceC20476615Am interfaceC20476615AmLIZIZ2 = LIZIZ(0, i14, rectLIZIZ, i2, C20345914jJ.LIZ());
                        if (interfaceC20476615AmLIZIZ == null) {
                            fValueOf = null;
                        } else {
                            if (this.LJII > 1) {
                                i3 = LJJ;
                            } else {
                                i3 = LJJI;
                            }
                            fValueOf = Float.valueOf(i3 / interfaceC20476615AmLIZIZ.getLocation().LIZJ);
                        }
                        C15B3 c15b32 = new C15B3();
                        if (fValueOf == null) {
                            i5 = 0;
                        } else {
                            if (interfaceC20476615AmLIZIZ != null && (location = interfaceC20476615AmLIZIZ.getLocation()) != null) {
                                i4 = location.LIZJ;
                            } else {
                                i4 = 0;
                            }
                            i5 = (i4 - interfaceC20476615AmLIZIZ2.getLocation().LIZJ) / 2;
                        }
                        float f2 = i5;
                        c15b32.LIZ(C15AL.LIZIZ(C15AG.TRANSLATE, new C1782410wU3(interfaceC20476615AmLIZIZ2.getLocation().LIZ - f2, interfaceC20476615AmLIZIZ2.getLocation().LIZIZ - f2, null, null), 0L, 0L, 28));
                        if (fValueOf != null) {
                            c15b32.LIZ(C15AL.LIZIZ(C15AG.SCALE, new C15A2(new Pair(fValueOf, fValueOf), null, 6, 0), 0L, 0L, 28));
                        }
                        C15B1 c15b1LIZJ = c15b32.LIZJ();
                        arrayList.add(interfaceC20476615AmLIZIZ2);
                        linkedHashMap.put(interfaceC20476615AmLIZIZ2.getGeniusId(), c15b1LIZJ);
                    }
                    C15B3 c15b33 = new C15B3();
                    c15b33.LIZ(C15AL.LIZIZ(C15AG.ALPHA, new C1782400wU2(interfaceC20476615AmLIZ3.getLocation().LJ, null), 0L, 0L, 28));
                    c15b33.LIZ(C15AL.LIZIZ(C15AG.SIZE, new C15A3(new Pair(Integer.valueOf(interfaceC20476615AmLIZ3.getLocation().LIZJ), Integer.valueOf(interfaceC20476615AmLIZ3.getLocation().LIZLLL))), 0L, 0L, 28));
                    c15b33.LIZ(C15AL.LIZIZ(C15AG.TRANSLATE, new C1782410wU3(interfaceC20476615AmLIZ3.getLocation().LIZ, interfaceC20476615AmLIZ3.getLocation().LIZIZ, null, null), 0L, 0L, 28));
                    C15B1 c15b1LIZJ2 = c15b33.LIZJ();
                    arrayList.add(interfaceC20476615AmLIZ3);
                    linkedHashMap.put(interfaceC20476615AmLIZ3.getGeniusId(), c15b1LIZJ2);
                    i11 = i12;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                if (!arrayList2.isEmpty()) {
                    if (arrayList2.size() == 0) {
                        size = 0.0f;
                    } else {
                        size = ((arrayList2.size() - 1) * ((Number) this.LJIILLIIL.getValue()).floatValue()) + LJII();
                    }
                    Pair pair = new Pair(Integer.valueOf((int) (((Number) this.LJIIL.getValue()).floatValue() - size)), Integer.valueOf((int) ((Number) this.LJIIL.getValue()).floatValue()));
                    C20475815Ae c20475815Ae3 = this.LIZ;
                    String str3 = LJJIFFI;
                    EnumC20476415Ak enumC20476415Ak3 = EnumC20476415Ak.TEXT;
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    int i15 = LJIJJLI;
                    InterfaceC20476615Am interfaceC20476615AmLIZ4 = c20475815Ae3.LIZ(str3, enumC20476415Ak3, new C20476115Ah(iIntValue - i15, (int) (((Number) this.LJIILJJIL.getValue()).floatValue() + LJII() + C439101nJ.LIZ(5)), ((int) size) + (i15 * 2), C439101nJ.LIZ(20), 0.0f, 0.0f, 0.0f, 0.0f, 240), new C150P(C497740JfY.LJIJI(2131852897), 16.0f, C20736316Cj.LIZIZ(R.attr.exp, this.LIZJ.getContext()), R.style.a93, null, 48), EnumC20476715An.NORMAL);
                    arrayList.add(interfaceC20476615AmLIZ4);
                    String geniusId2 = interfaceC20476615AmLIZ4.getGeniusId();
                    C15B3 c15b34 = new C15B3();
                    c15b34.LIZ(C15AL.LIZIZ(C15AG.ALPHA, new C1782400wU2(1.0f, null), 0L, 0L, 28));
                    linkedHashMap.put(geniusId2, c15b34.LIZJ());
                }
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new C20477515Av(C15BE.MOVE, true, false, arrayList, linkedHashMap, null, 204));
                return arrayList4;
            }
        }
    }

    public final List<C20477515Av> LJ(GuestShowdownUser guestShowdownUser, List<GuestShowdownUser> list, Function0<Unit> function0) {
        int i;
        boolean z;
        int size;
        C20475615Ac c20475615Ac;
        float f;
        Object obj;
        float f2;
        long j;
        ArrayList arrayList = new ArrayList();
        int i2 = C15B8.LJIJI;
        InterfaceC20476615Am interfaceC20476615AmLIZIZ = C15BB.LIZIZ(this.LIZ, this.LIZJ, C15BC.LIZ("ttlive_guest_showdown_bg_state_4.png"));
        if (interfaceC20476615AmLIZIZ != null) {
            LJIIL("add ttlive_guest_showdown_bg_state_4");
            arrayList.add(new C20477515Av(C15BE.NONE, false, false, Collections.singletonList(interfaceC20476615AmLIZIZ), null, null, 232));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) list;
        int i3 = 0;
        for (Object obj2 : arrayList3) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                GuestShowdownUser guestShowdownUser2 = (GuestShowdownUser) obj2;
                int iIntValue = (int) (((Number) this.LJIIIIZZ.getValue()).intValue() + ((this.LJI + this.LJFF) * i3));
                int iLJIIJ = LJIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("createAvatarShowAnimationGroup index:");
                sbLIZ.append(i3);
                sbLIZ.append(" guestShowdownUser:");
                sbLIZ.append(guestShowdownUser2.nickname);
                sbLIZ.append(" x:");
                sbLIZ.append(iIntValue);
                sbLIZ.append(" y:");
                sbLIZ.append(iLJIIJ);
                LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                int i5 = this.LJFF;
                float fLIZIZ = C15BN.LIZIZ + C418440Gaw.LIZIZ(Integer.valueOf((arrayList3.size() - i3) - 1));
                if (i3 < this.LJII) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.3f;
                }
                C20476115Ah c20476115Ah = new C20476115Ah(iIntValue, iLJIIJ, i5, i5, f2, 0.0f, 0.0f, fLIZIZ, 96);
                C20475815Ae c20475815Ae = this.LIZ;
                C15BI c15bi = C15BS.LJJLI;
                String str = guestShowdownUser2.linkmicId;
                c15bi.getClass();
                String strLIZ = C15BI.LIZ(str);
                EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.AVATAR;
                boolean z2 = false;
                int i6 = C15B8.LJIJI;
                float f3 = iIntValue;
                float f4 = iLJIIJ;
                InterfaceC20476615Am interfaceC20476615AmLIZ = c20475815Ae.LIZ(strLIZ, enumC20476415Ak, c20476115Ah, new C15A0(z2, z2, C15BB.LIZJ(guestShowdownUser2), guestShowdownUser2.linkmicId, new PointF(f3, f4), new PointF(f3, f4), null, 147), EnumC20476715An.NORMAL);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(C15AL.LIZIZ(C15AG.SCALE, new C15A2(new Pair(Float.valueOf(c20476115Ah.LJFF), Float.valueOf(c20476115Ah.LJI)), new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f)), 4, 0), 0L, 0L, 28));
                C15B1 c15b1 = new C15B1(arrayList4, false);
                arrayList2.add(interfaceC20476615AmLIZ);
                linkedHashMap.put(interfaceC20476615AmLIZ.getGeniusId(), c15b1);
                if (i3 < this.LJII) {
                    C20345814jI c20345814jI = C20345814jI.LIZJ;
                    C204746159s c204746159sLIZJ = LIZJ(c20345814jI);
                    InterfaceC20476615Am interfaceC20476615AmLIZIZ2 = LIZIZ(i3, arrayList3.size(), c20476115Ah.LIZIZ(), LJIL, c20345814jI);
                    ArrayList arrayList5 = new ArrayList();
                    C15AG c15ag = C15AG.LOTTIE;
                    Iterator it2 = arrayList4.iterator();
                    if (it2.hasNext()) {
                        C15AK c15ak = (C15AK) it2.next();
                        long j2 = c15ak.LIZ + c15ak.LIZIZ;
                        while (true) {
                            j = j2;
                            while (it2.hasNext()) {
                                C15AK c15ak2 = (C15AK) it2.next();
                                j2 = c15ak2.LIZ + c15ak2.LIZIZ;
                                if (j < j2) {
                                    break;
                                }
                            }
                        }
                        C15AO c15ao = c204746159sLIZJ.LIZ;
                        arrayList5.add(C15AL.LIZIZ(c15ag, new C15A6(new C15AO(c15ao.LIZ, c15ao.LIZIZ, (Function2) null, (Map) null, (C20345814jI) null, 0L, false, (C20345714jH) null, (List) null, (Map) null, 2044)), j, 0L, 24));
                        C15B1 c15b12 = new C15B1(arrayList5, false);
                        arrayList2.add(interfaceC20476615AmLIZIZ2);
                        linkedHashMap.put(interfaceC20476615AmLIZIZ2.getGeniusId(), c15b12);
                        LJIIL("createAvatarShowAnimationGroup index:" + i3 + " add emoji");
                        InterfaceC20476615Am interfaceC20476615AmLIZ2 = this.LIZ.LIZ(LJIIIZ(i3), EnumC20476415Ak.TEXT, new C20476115Ah(iIntValue - C439101nJ.LIZ(3), iLJIIJ + this.LJFF + C439101nJ.LIZ(6), this.LJFF + C439101nJ.LIZ(6), C439101nJ.LIZ(20), 0.0f, 0.0f, 0.0f, 0.0f, 240), new C150P(guestShowdownUser2.nickname, 14.0f, C20736316Cj.LIZIZ(R.attr.exp, this.LIZJ.getContext()), R.style.a9c, null, 48), EnumC20476715An.NORMAL);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(C15AL.LIZIZ(C15AG.ALPHA, new C1782400wU2(1.0f, null), 0L, 100L, 20));
                        C15B1 c15b13 = new C15B1(arrayList6, false);
                        arrayList2.add(interfaceC20476615AmLIZ2);
                        linkedHashMap.put(interfaceC20476615AmLIZ2.getGeniusId(), c15b13);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("createAvatarShowAnimationGroup index:");
                        sbLIZ2.append(i3);
                        sbLIZ2.append(" add text");
                        LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C15A1 c15a1 = null;
        C20477515Av c20477515Av = new C20477515Av(C15BE.MOVE, true, false, arrayList2, linkedHashMap, null, 204);
        arrayList.add(c20477515Av);
        ArrayList arrayList7 = new ArrayList();
        int size2 = arrayList3.size() / this.LJII;
        int size3 = arrayList3.size() % this.LJII;
        int i7 = 1;
        if (size3 > 0) {
            i = 1;
        } else {
            i = 0;
        }
        int i8 = (size2 + i) - 1;
        if (i8 < 1) {
            LJIIL("createFullTranslateAnimationGroups return as roundSize is smaller than 1");
            obj = C13BV.INSTANCE;
        } else {
            int i9 = 0;
            do {
                if (i9 == i8 - 1) {
                    z = true;
                } else {
                    z = false;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayList arrayList8 = new ArrayList();
                int size4 = this.LJII;
                if (size4 > i7 && z) {
                    size4 = arrayList3.size() - ((i9 + 1) * this.LJII);
                }
                int i10 = 0;
                for (Object obj3 : arrayList3) {
                    int i11 = i10 + 1;
                    if (i10 >= 0) {
                        GuestShowdownUser guestShowdownUser3 = (GuestShowdownUser) obj3;
                        int i12 = this.LIZLLL;
                        int i13 = this.LJII;
                        int i14 = this.LJFF;
                        int i15 = this.LJI;
                        PointF pointF = new PointF((((i12 - ((i14 * i13) + ((i13 - 1) * i15))) / 2) + ((i14 + i15) * i10)) - ((((i14 * i13) + ((i13 - 1) * i15)) + i15) * i9), LJIIJ());
                        float f5 = pointF.x;
                        int i16 = this.LJFF * size4;
                        int i17 = this.LJI;
                        PointF pointF2 = new PointF(f5 - ((i16 + ((size4 - 1) * i17)) + i17), pointF.y);
                        int i18 = this.LJFF;
                        float fLIZIZ2 = C15BN.LIZIZ + C418440Gaw.LIZIZ(Integer.valueOf((arrayList3.size() - i10) - 1));
                        C15BI c15bi2 = C15BS.LJJLI;
                        String str2 = guestShowdownUser3.linkmicId;
                        c15bi2.getClass();
                        String strLIZ2 = C15BI.LIZ(str2);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("createAvatarGeniusView currentPointF:");
                        sbLIZ3.append(pointF);
                        sbLIZ3.append(" targetPointF:");
                        sbLIZ3.append(pointF2);
                        sbLIZ3.append(" geniusId:");
                        sbLIZ3.append(strLIZ2);
                        LJIIL(C2188811AlT.LIZIZ(sbLIZ3));
                        C20475815Ae c20475815Ae2 = this.LIZ;
                        EnumC20476415Ak enumC20476415Ak2 = EnumC20476415Ak.AVATAR;
                        C20476115Ah c20476115Ah2 = new C20476115Ah((int) pointF2.x, (int) pointF2.y, i18, i18, 0.0f, 0.0f, 0.0f, fLIZIZ2, 112);
                        boolean z3 = false;
                        int i19 = C15B8.LJIJI;
                        InterfaceC20476615Am interfaceC20476615AmLIZ3 = c20475815Ae2.LIZ(strLIZ2, enumC20476415Ak2, c20476115Ah2, new C15A0(z3, z3, C15BB.LIZJ(guestShowdownUser3), guestShowdownUser3.linkmicId, pointF, pointF2, c15a1, 403), EnumC20476715An.NORMAL);
                        C15AK c15ak3 = new C15AK(0L, 0L, null, C15AG.TRANSLATE, new C1782410wU3(pointF2.x, pointF2.y, Float.valueOf(pointF.x), Float.valueOf(pointF.y)), 7);
                        if (LJI(i9, i10, this, list, z)) {
                            f = 1.0f;
                        } else {
                            f = 0.3f;
                        }
                        interfaceC20476615AmLIZ3.getLocation().LJ = f;
                        C15AG c15ag2 = C15AG.ALPHA;
                        linkedHashMap2.put(interfaceC20476615AmLIZ3.getGeniusId(), new C15B1(C1697810uHb.LJIIJJI(c15ak3, new C15AK(0L, 0L, null, c15ag2, new C1782400wU2(f, null), 7)), false));
                        long j3 = c15ak3.LIZIZ + c15ak3.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("round");
                        sbLIZ4.append(i9);
                        sbLIZ4.append(" groupSize:");
                        sbLIZ4.append(this.LJII);
                        sbLIZ4.append(" index:");
                        sbLIZ4.append(i10);
                        sbLIZ4.append(" isIndexWillShow:");
                        sbLIZ4.append(LJI(i9, i10, this, list, z));
                        sbLIZ4.append(" startPoint:");
                        sbLIZ4.append(pointF);
                        sbLIZ4.append(" targetPoint:");
                        sbLIZ4.append(pointF2);
                        sbLIZ4.append(" targetAlpha:");
                        sbLIZ4.append(f);
                        sbLIZ4.append(" animationFinishDuration:");
                        sbLIZ4.append(j3);
                        LJIIL(C2188811AlT.LIZIZ(sbLIZ4));
                        arrayList8.add(interfaceC20476615AmLIZ3);
                        if (LJI(i9, i10, this, list, z)) {
                            InterfaceC20476615Am interfaceC20476615AmLIZ4 = this.LIZ.LIZ(LJIIIZ(i10 - LJFF(z, list, this, i9)), EnumC20476415Ak.TEXT, new C20476115Ah(((int) (((Number) this.LJIIIIZZ.getValue()).intValue() + ((this.LJI + this.LJFF) * (i10 - LJFF(z, list, this, i9))))) - C439101nJ.LIZ(3), LJIIJ() + this.LJFF + C439101nJ.LIZ(6), this.LJFF + C439101nJ.LIZ(6), C439101nJ.LIZ(20), 1.0f, 0.0f, 0.0f, 0.0f, 224), new C150P(((GuestShowdownUser) ListProtector.get(list, i10)).nickname, 14.0f, C20736316Cj.LIZIZ(R.attr.exp, this.LIZJ.getContext()), 0, null, 56), EnumC20476715An.NORMAL);
                            arrayList8.add(interfaceC20476615AmLIZ4);
                            linkedHashMap2.put(interfaceC20476615AmLIZ4.getGeniusId(), new C15B1(C1697810uHb.LJIILJJIL(new C15AK(0L, 100L, null, c15ag2, new C1782400wU2(0.0f, Float.valueOf(1.0f)), 5)), z));
                        }
                        i10 = i11;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                arrayList7.add(new C20477515Av(C15BE.TRANSITION, true, false, arrayList8, linkedHashMap2, null, 204));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                ArrayList arrayList9 = new ArrayList();
                int i20 = this.LJII;
                int i21 = 0;
                while (i21 < i20) {
                    if (z) {
                        size = arrayList3.size() - this.LJII;
                    } else {
                        size = (i9 + 1) * this.LJII;
                    }
                    int i22 = size + i21;
                    int iIntValue2 = (int) (((Number) this.LJIIIIZZ.getValue()).intValue() + ((this.LJI + this.LJFF) * i21));
                    int iLJIIJ2 = LJIIJ();
                    C20345814jI c20345814jI2 = C20345814jI.LIZJ;
                    C204746159s c204746159sLIZJ2 = LIZJ(c20345814jI2);
                    int size5 = arrayList3.size();
                    int i23 = this.LJFF;
                    int i24 = i21;
                    InterfaceC20476615Am interfaceC20476615AmLIZIZ3 = LIZIZ(i21, size5, new Rect(iIntValue2, iLJIIJ2, iIntValue2 + i23, i23 + iLJIIJ2), LJIL, c20345814jI2);
                    C15AG c15ag3 = C15AG.LOTTIE;
                    C15AO c15ao2 = c204746159sLIZJ2.LIZ;
                    C15AK c15akLIZIZ = C15AL.LIZIZ(c15ag3, new C15A6(new C15AO(c15ao2.LIZ, c15ao2.LIZIZ, (Function2) null, (Map) null, (C20345814jI) null, 0L, false, (C20345714jH) null, (List) null, (Map) null, 2044)), 0L, 0L, 28);
                    arrayList9.add(interfaceC20476615AmLIZIZ3);
                    linkedHashMap3.put(interfaceC20476615AmLIZIZ3.getGeniusId(), new C15B1(Collections.singletonList(c15akLIZIZ), false));
                    if (i22 < arrayList3.size()) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("createFullTranslateAnimationGroups round:");
                        sbLIZ5.append(i9);
                        sbLIZ5.append(" realIndex:");
                        sbLIZ5.append(i22);
                        sbLIZ5.append(" update text");
                        LJIIL(C2188811AlT.LIZIZ(sbLIZ5));
                        InterfaceC20476615Am interfaceC20476615AmLIZIZ4 = this.LIZ.LIZIZ(LJIIIZ(i24));
                        if ((interfaceC20476615AmLIZIZ4 instanceof C20475615Ac) && (c20475615Ac = (C20475615Ac) interfaceC20476615AmLIZIZ4) != null) {
                            C150P c150pLJI = c20475615Ac.LJI();
                            if (c150pLJI != null) {
                                c150pLJI.LIZ = ((GuestShowdownUser) ListProtector.get(list, i22)).nickname;
                            }
                            arrayList9.add(c20475615Ac);
                            linkedHashMap3.put(c20475615Ac.LIZJ, new C15B1(Collections.singletonList(C15AL.LIZ(new C1782400wU2(1.0f, Float.valueOf(0.0f)), 0L, null, 14)), false));
                        }
                    }
                    i21 = i24 + 1;
                }
                arrayList7.add(C15BO.LIZ(C15BE.LOTTIE, arrayList9, linkedHashMap3));
                i9++;
                i7 = 1;
            } while (i9 < i8);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("createFullTranslateAnimationGroups: animationGroupList:");
            sbLIZ6.append(arrayList7.size());
            sbLIZ6.append(" loserList.size:");
            sbLIZ6.append(arrayList3.size());
            sbLIZ6.append(" roundSize:");
            sbLIZ6.append(i8);
            sbLIZ6.append(' ');
            LJIIL(C2188811AlT.LIZIZ(sbLIZ6));
            obj = arrayList7;
        }
        arrayList.addAll(obj);
        LIZ(arrayList, function0);
        arrayList.addAll(LIZLLL(list, guestShowdownUser));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("createShowOffTranslateAnimationGroupList avatarShowAnimationGroup:");
        sbLIZ7.append(c20477515Av);
        sbLIZ7.append(" list.size:");
        sbLIZ7.append(arrayList.size());
        LJIIL(C2188811AlT.LIZIZ(sbLIZ7));
        return arrayList;
    }

    public static final int LJFF(boolean z, List<GuestShowdownUser> list, C15B7 c15b7, int i) {
        if (z) {
            return ((ArrayList) list).size() - c15b7.LJII;
        }
        return (i + 1) * c15b7.LJII;
    }

    public static final boolean LJI(int i, int i2, C15B7 c15b7, List list, boolean z) {
        if (i2 >= LJFF(z, list, c15b7, i) && i2 < LJFF(z, list, c15b7, i) + c15b7.LJII) {
            return true;
        }
        return false;
    }

    public final InterfaceC20476615Am LIZIZ(int i, int i2, Rect rect, int i3, C20345814jI c20345814jI) {
        return this.LIZ.LIZ(LJIIIIZZ(i), EnumC20476415Ak.LOTTIE, new C20476115Ah(rect.right - (i3 - C439101nJ.LIZ(8)), rect.bottom - (i3 - C439101nJ.LIZ(4)), i3, i3, 0.0f, 0.0f, 0.0f, C15BN.LIZIZ + C418440Gaw.LIZIZ(Integer.valueOf(i2 + i + 1)), 112), LIZJ(c20345814jI), EnumC20476715An.NORMAL);
    }

    public C15B7(C20475815Ae c20475815Ae, C20476915Ap c20476915Ap, ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        this.LIZ = c20475815Ae;
        this.LIZIZ = c20476915Ap;
        this.LIZJ = viewGroup;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = i4;
        this.LJII = i5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC20476415Ak.LOTTIE);
        sbLIZ.append("_emoji_showoff");
        this.LJIJJ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
