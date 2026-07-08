package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0u1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687880u1a extends C09AY implements InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ SignupViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C05P0 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687880u1a(List list, boolean z, SignupViewModel signupViewModel, boolean z2, boolean z3, C05P0 c05p0) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = signupViewModel;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = c05p0;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        int i;
        boolean z;
        String strLIZIZ;
        String strLIZIZ2;
        String strLIZIZ3;
        int i2;
        String strLIZIZ4;
        String strLIZIZ5;
        int i3;
        int i4;
        int iIntValue = num.intValue();
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            if (interfaceC1680500tpg2.LJJIIJ(interfaceC1669590tY5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i = iIntValue2 | i4;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg2.LJIJI(iIntValue)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i |= i3;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg2.LJIJJLI(i & 1, z)) {
            C1687890u1b c1687890u1b = (C1687890u1b) ListProtector.get(this.LL, iIntValue);
            interfaceC1680500tpg2.LJJIIJZLJL(1824383814);
            if (c1687890u1b instanceof C19314510hL) {
                interfaceC1680500tpg2.LJJIIJZLJL(1824301384);
                if (this.LLILLJJLI) {
                    interfaceC1680500tpg2.LJJIIJZLJL(1824337840);
                    strLIZIZ5 = (String) this.LLILLL.LLJLL.getValue();
                    if (strLIZIZ5 == null) {
                        strLIZIZ5 = C0MBB.LIZIZ(2131845262, interfaceC1680500tpg2);
                    }
                    interfaceC1680500tpg2.LJ();
                } else {
                    interfaceC1680500tpg2.LJJIIJZLJL(1824535217);
                    strLIZIZ5 = (String) this.LLILLL.LLJLILLLLZIIL.getValue();
                    if (strLIZIZ5 == null) {
                        strLIZIZ5 = C0MBB.LIZIZ(2131845262, interfaceC1680500tpg2);
                    }
                    interfaceC1680500tpg2.LJ();
                }
                C1687820u1U.LIZLLL(strLIZIZ5, this.LLILZ, interfaceC1680500tpg2, 0);
                interfaceC1680500tpg2.LJ();
            } else if (c1687890u1b instanceof C19314410hK) {
                interfaceC1680500tpg2.LJJIIJZLJL(1825009207);
                if (this.LLILLJJLI) {
                    i2 = 2131845257;
                } else {
                    i2 = 2131845256;
                }
                String strLIZIZ6 = C0MBB.LIZIZ(i2, interfaceC1680500tpg2);
                interfaceC1680500tpg2.LJJIIJZLJL(-1742231202);
                if (C19286010ck.LIZLLL()) {
                    strLIZIZ4 = "";
                } else {
                    strLIZIZ4 = C0MBB.LIZIZ(2131845255, interfaceC1680500tpg2);
                }
                interfaceC1680500tpg2.LJ();
                C1687820u1U.LJ(strLIZIZ6, strLIZIZ4, this.LLILZ, C19286010ck.LIZLLL(), this.LLILZIL, ((C1668650tWZ) this.LLILZLL.getValue()).LL, interfaceC1680500tpg2, 0);
                interfaceC1680500tpg2.LJ();
            } else if (c1687890u1b instanceof C19314710hN) {
                interfaceC1680500tpg2.LJJIIJZLJL(1826211418);
                C1687820u1U.LJ(C0MBB.LIZIZ(2131822795, interfaceC1680500tpg2), C0MBB.LIZIZ(2131822796, interfaceC1680500tpg2), this.LLILZ, false, this.LLILZIL, ((C1668650tWZ) this.LLILZLL.getValue()).LL, interfaceC1680500tpg2, 3072);
                interfaceC1680500tpg2.LJ();
            } else if (c1687890u1b instanceof C19314610hM) {
                interfaceC1680500tpg2.LJJIIJZLJL(1826856838);
                if (this.LLILLJJLI) {
                    interfaceC1680500tpg2.LJJIIJZLJL(1826886846);
                    strLIZIZ3 = (String) this.LLILLL.LLJLL.getValue();
                    if (strLIZIZ3 == null) {
                        strLIZIZ3 = C0MBB.LIZIZ(2131829351, interfaceC1680500tpg2);
                    }
                    interfaceC1680500tpg2.LJ();
                } else {
                    interfaceC1680500tpg2.LJJIIJZLJL(1827038374);
                    strLIZIZ3 = (String) this.LLILLL.LLJLILLLLZIIL.getValue();
                    if (strLIZIZ3 == null) {
                        strLIZIZ3 = C0MBB.LIZIZ(2131829310, interfaceC1680500tpg2);
                    }
                    interfaceC1680500tpg2.LJ();
                }
                C1687820u1U.LJ(strLIZIZ3, "", this.LLILZ, true, this.LLILZIL, ((C1668650tWZ) this.LLILZLL.getValue()).LL, interfaceC1680500tpg2, 3120);
                interfaceC1680500tpg2.LJ();
            } else if (c1687890u1b instanceof C19314810hO) {
                interfaceC1680500tpg2.LJJIIJZLJL(1827710206);
                if (this.LLILLJJLI) {
                    interfaceC1680500tpg2.LJJIIJZLJL(1827731038);
                    strLIZIZ = (String) this.LLILLL.LLJLL.getValue();
                    if (strLIZIZ == null) {
                        strLIZIZ = C0MBB.LIZIZ(2131829351, interfaceC1680500tpg2);
                    }
                    interfaceC1680500tpg2.LJ();
                } else {
                    interfaceC1680500tpg2.LJJIIJZLJL(1827882566);
                    strLIZIZ = (String) this.LLILLL.LLJLILLLLZIIL.getValue();
                    if (strLIZIZ == null) {
                        strLIZIZ = C0MBB.LIZIZ(2131829310, interfaceC1680500tpg2);
                    }
                    interfaceC1680500tpg2.LJ();
                }
                if (this.LLILLJJLI) {
                    interfaceC1680500tpg2.LJJIIJZLJL(1828080098);
                    strLIZIZ2 = C0MBB.LIZIZ(2131829348, interfaceC1680500tpg2);
                    interfaceC1680500tpg2.LJ();
                } else {
                    interfaceC1680500tpg2.LJJIIJZLJL(1828195945);
                    strLIZIZ2 = C0MBB.LIZIZ(2131829307, interfaceC1680500tpg2);
                    interfaceC1680500tpg2.LJ();
                }
                C1687820u1U.LJ(strLIZIZ, strLIZIZ2, this.LLILZ, false, this.LLILZIL, ((C1668650tWZ) this.LLILZLL.getValue()).LL, interfaceC1680500tpg2, 3072);
                interfaceC1680500tpg2.LJ();
            } else if (c1687890u1b instanceof C1688260u2C) {
                interfaceC1680500tpg2.LJJIIJZLJL(1828820843);
                C1669520tXy.LIZIZ(this.LLILLL, null, interfaceC1680500tpg2, 0, 2);
                interfaceC1680500tpg2.LJ();
            } else if (c1687890u1b instanceof C1687910u1d) {
                interfaceC1680500tpg2.LJJIIJZLJL(1828932567);
                C1687910u1d c1687910u1d = (C1687910u1d) c1687890u1b;
                C1687820u1U.LJII(c1687910u1d.LJIIJ, c1687910u1d.LJIIJJI, interfaceC1680500tpg2, 0);
                interfaceC1680500tpg2.LJ();
            } else if (c1687890u1b instanceof C1687920u1e) {
                interfaceC1680500tpg2.LJJIIJZLJL(1829060070);
                C1687820u1U.LJI(this.LLILZ, false, ((C1687920u1e) c1687890u1b).LJIIJ, interfaceC1680500tpg2, 48);
                interfaceC1680500tpg2.LJ();
            } else if (c1687890u1b instanceof C1687930u1f) {
                interfaceC1680500tpg2.LJJIIJZLJL(1829368551);
                C1687820u1U.LJI(this.LLILZ, true, ((C1687930u1f) c1687890u1b).LJIIJ, interfaceC1680500tpg2, 48);
                interfaceC1680500tpg2.LJ();
            } else if (c1687890u1b instanceof C1687900u1c) {
                interfaceC1680500tpg2.LJJIIJZLJL(1829670026);
                C1687820u1U.LIZJ(((C1687900u1c) c1687890u1b).LJIIJ, interfaceC1680500tpg2, 0);
                interfaceC1680500tpg2.LJ();
            } else {
                interfaceC1680500tpg2.LJJIIJZLJL(1829788880);
                C1674130tfP.LIZIZ(c1687890u1b.LJFF, new C1668880tWw(c1687890u1b.LIZ), C0MBB.LIZIZ(c1687890u1b.LIZJ, interfaceC1680500tpg2), this.LLILZIL, c1687890u1b.LJIIIIZZ, c1687890u1b.LIZLLL, c1687890u1b.LJ, c1687890u1b.LJI, c1687890u1b.LJII, this.LLILLL.OQ2(), interfaceC1680500tpg2, 0, 0);
                interfaceC1680500tpg2.LJ();
            }
            interfaceC1680500tpg2.LJ();
        } else {
            interfaceC1680500tpg2.LIZJ();
        }
        return Unit.LIZ;
    }
}
