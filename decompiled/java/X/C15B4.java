package X;

import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.text.u;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.15B4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15B4 extends C15B5 {
    public final C20475815Ae LJIIJJI;
    public final ViewGroup LJIIL;
    public final ViewGroup LJIILIIL;
    public final C20476915Ap LJIILJJIL;
    public final boolean LJIILL;
    public final List<C15BU> LJIILLIIL;
    public final DataChannel LJIIZILJ;
    public final Map<String, C1294720jnS> LJIJ;

    @Override // X.C15B5
    public final void LIZIZ() {
        int i = 1;
        do {
            C20476915Ap c20476915Ap = this.LJIILJJIL;
            C15AM.LJJLJLI.getClass();
            c20476915Ap.LJIIL(C15AN.LIZ(i));
            i++;
        } while (i < 4);
    }

    @Override // X.C15B5
    public final String LJJ() {
        return "Top3ModeAnimationGroupCalculator";
    }

    @Override // X.C15B5, X.C15BW
    public final EnumC204738159k LIZ(Integer num) {
        if (num == null) {
            return null;
        }
        if (num.intValue() != 21 && num.intValue() != 22) {
            if (num.intValue() == 30) {
                return EnumC204738159k.RUNNING_STATE_WITHOUT_COUNT_DOWN;
            }
            if (num.intValue() == 40) {
                return EnumC204738159k.RUNNING_STATE_WITHOUT_COUNT_DOWN;
            }
            return EnumC204738159k.NOT_RUNNING_STATE;
        }
        return EnumC204738159k.RUNNING_STATE_WITH_COUNT_DOWN_ANIAMTION;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    @Override // X.C15B5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJ(webcast.data.multi_guest_play.GuestShowdownContent r24) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B4.LJ(webcast.data.multi_guest_play.GuestShowdownContent):java.util.List");
    }

    @Override // X.C15B5
    public final List LJII(GuestShowdownContent guestShowdownContent) {
        boolean z;
        GuestShowdownUser next;
        boolean z2;
        C20476915Ap.LJ(this.LJIILJJIL);
        this.LJIILJJIL.LJIIL(C15BC.LJ);
        int iLIZ = C15BG.LIZ(guestShowdownContent);
        ArrayList arrayList = new ArrayList();
        Iterator<GuestShowdownUser> it2 = guestShowdownContent.runningPlayUsers.iterator();
        while (true) {
            z = true;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.rank == 1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AwS432S0200000_31 awS432S0200000_31 = new AwS432S0200000_31(this, guestShowdownContent, 135);
        int i = this.LJI;
        if (i == 40) {
            C20441214yg.LJ("Top3ModeAnimationGroupCalculator", "last status is punish period, the same status with current status");
        } else if (next != null) {
            arrayList.addAll(LJJII(guestShowdownContent, awS432S0200000_31));
        } else {
            if (i != 10 && i != 22 && i != 21 && i != 30) {
                z2 = false;
            } else {
                z2 = true;
            }
            arrayList.addAll(LJIJJLI(awS432S0200000_31, z2));
        }
        EnumC204738159k enumC204738159kLIZ = LIZ(Integer.valueOf(iLIZ));
        if (enumC204738159kLIZ == null) {
            enumC204738159kLIZ = EnumC204738159k.RUNNING_STATE_SHOW_TIME;
        }
        InterfaceC20476615Am interfaceC20476615AmLJIIL = LJIIL(enumC204738159kLIZ, 0L, guestShowdownContent, Boolean.TRUE, Boolean.FALSE);
        C20441214yg.LJIIIZ("Top3ModeAnimationGroupCalculator", "punish animation finish show board");
        this.LJIIJJI.LIZJ(interfaceC20476615AmLJIIL);
        int i2 = this.LJI;
        int iLIZ2 = C15BG.LIZ(guestShowdownContent);
        if (this.LJI != 30) {
            z = false;
        }
        C15B5.LIZJ(i2, iLIZ2, z, arrayList);
        arrayList.add(C15BO.LIZJ(Collections.singletonList(interfaceC20476615AmLJIIL)));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIJZLJL(String str) {
        C1294720jnS c1294720jnS;
        File fileLJII = C1143780fs0.LJII("tiktok_live_interaction_guest_showdown", str);
        C1294720jnS c1294720jnS2 = null;
        if (fileLJII != null) {
            try {
                if (u.LJIIZILJ(str, ".zip", false)) {
                    c1294720jnS = (C1294720jnS) C1294250jmh.LJIILJJIL(null, new ZipInputStream(new C0VSP(fileLJII)), str).LIZ;
                } else {
                    c1294720jnS = C1294250jmh.LJFF(new C0VSP(fileLJII), str).LIZ;
                }
                c1294720jnS2 = c1294720jnS;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getLottieCompositionFromGecko error: ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("Top3ModeAnimationGroupCalculator", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.LJIJ.put(str, c1294720jnS2);
    }

    public static int LJJIII(List list, GuestShowdownUser guestShowdownUser) {
        int i = -1;
        if (guestShowdownUser != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                GuestShowdownUser guestShowdownUser2 = (GuestShowdownUser) it2.next();
                if (guestShowdownUser2.userId == guestShowdownUser.userId) {
                    i = guestShowdownUser2.rank;
                }
            }
        }
        return i;
    }

    public static GuestShowdownUser LJJIIJ(int i, List list) {
        GuestShowdownUser guestShowdownUser = null;
        if (list.isEmpty()) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            GuestShowdownUser guestShowdownUser2 = (GuestShowdownUser) it2.next();
            if (guestShowdownUser2.rank == i) {
                guestShowdownUser = guestShowdownUser2;
            }
        }
        return guestShowdownUser;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a3  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    @Override // X.C15B5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJFF(android.view.ViewGroup r51, webcast.data.multi_guest_play.GuestShowdownContent r52) {
        /*
            Method dump skipped, instruction units count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B4.LJFF(android.view.ViewGroup, webcast.data.multi_guest_play.GuestShowdownContent):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C15B5
    public final C1561430qjd LJIIJJI(int i, GuestShowdownContent guestShowdownContent) {
        ArrayList arrayList = new ArrayList();
        float fLJJI = C497740JfY.LJJI(this.LJIIL.getMeasuredHeight()) / 117;
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
            if (i != 22) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            List<GuestShowdownUser> list = guestShowdownContent.runningPlayUsers;
            GuestShowdownUser[] guestShowdownUserArr = new GuestShowdownUser[3];
            int i2 = 0;
            int i3 = 0;
            do {
                guestShowdownUserArr[i3] = null;
                i3++;
            } while (i3 < 3);
            for (GuestShowdownUser guestShowdownUser : list) {
                int i4 = guestShowdownUser.rank;
                if (1 <= i4 && i4 < 4) {
                    guestShowdownUserArr[i4 - 1] = guestShowdownUser;
                }
            }
            for (Object obj : C13LQ.LJJLL(guestShowdownUserArr)) {
                int i5 = i2 + 1;
                if (i2 >= 0) {
                    GuestShowdownUser guestShowdownUser2 = (GuestShowdownUser) obj;
                    if (guestShowdownUser2 != null) {
                        int i6 = C15B8.LJIJI;
                        String strLIZ = C0KVU.LIZ(C15BB.LIZJ(guestShowdownUser2));
                        String strLJIJI = C497740JfY.LJIJI(2131852899);
                        C150E c150e2 = new C150E(String.valueOf(R.attr.dkg), null, 0.0f, 30);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C1850730yGF.LJI(i5));
                        sbLIZ.append(' ');
                        sbLIZ.append(strLIZ);
                        arrayList2.add(new C150F(strLJIJI, c150e2, C2188811AlT.LIZIZ(sbLIZ), 8));
                    }
                    i2 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            arrayList.add(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new C150F(C497740JfY.LJIJI(2131852896), new C150E(String.valueOf(R.attr.dty), null, 0.0f, 30), "?", true));
            arrayList.add(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(new C150F(C497740JfY.LJIJI(2131852895), c150e, (String) (objArr == true ? 1 : 0), 14));
            arrayList.add(arrayList4);
        }
        return new C1561430qjd(arrayList, (int) f2, (int) f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C20477515Av> LJJII(webcast.data.multi_guest_play.GuestShowdownContent r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51) {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B4.LJJII(webcast.data.multi_guest_play.GuestShowdownContent, kotlin.jvm.functions.Function0):java.util.List");
    }

    @Override // X.C15B5
    public final List<C20477515Av> LJIIIIZZ(ViewGroup viewGroup, GuestShowdownContent guestShowdownContent, String str, boolean z) {
        LJJIIJZLJL("guest_showdown_top3_champion_firework.zip");
        LJJIIJZLJL("guest_showdown_top3_champion_wave.zip");
        return super.LJIIIIZZ(viewGroup, guestShowdownContent, str, z);
    }

    public C15B4(C20475815Ae c20475815Ae, ViewGroup viewGroup, ViewGroup viewGroup2, C20476915Ap c20476915Ap, boolean z, List<C15BU> list, DataChannel dataChannel) {
        super(c20475815Ae, viewGroup, viewGroup2, c20476915Ap, z, list);
        this.LJIIJJI = c20475815Ae;
        this.LJIIL = viewGroup;
        this.LJIILIIL = viewGroup2;
        this.LJIILJJIL = c20476915Ap;
        this.LJIILL = z;
        this.LJIILLIIL = list;
        this.LJIIZILJ = dataChannel;
        this.LJIJ = new LinkedHashMap();
    }
}
