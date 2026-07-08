package X;

import java.util.List;

/* JADX INFO: renamed from: X.0swS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646260swS {
    public static final String[] LIZLLL;
    public static final List<String> LJ;
    public final InterfaceC1645180sui LIZ;
    public final InterfaceC1647420syK LIZIZ;
    public final InterfaceC1646290swV LIZJ;

    static {
        LIZLLL = C525810Kjj.LIZ() ? new String[]{EnumC1647570syZ.LIVE.getTag(), EnumC1647570syZ.TEMPLATES.getTag()} : new String[]{EnumC1647570syZ.RECORD_NOW.getTag(), EnumC1647570syZ.LIVE.getTag(), EnumC1647570syZ.TEMPLATES.getTag()};
        LJ = C525810Kjj.LIZ() ? C1697810uHb.LJIIJJI(EnumC1647570syZ.RECORD_NOW.getTag(), "RecordShoot15s", "RecordShoot60s", "RecordShoot180s", "RecordShoot600s") : C1697810uHb.LJIIJJI("RecordShoot15s", "RecordShoot60s", "RecordShoot180s", "RecordShoot600s");
    }

    public final void LIZ(C1646490swp c1646490swp) {
        InterfaceC1644770su3 interfaceC1644770su3LIZJ;
        InterfaceC1644770su3 interfaceC1644770su3LIZJ2;
        String str = c1646490swp.LJ;
        if (str == null) {
            str = "";
        }
        if (C13LQ.LJIILLIIL(str, LIZLLL)) {
            InterfaceC1646290swV interfaceC1646290swV = this.LIZJ;
            if (interfaceC1646290swV != null) {
                interfaceC1646290swV.GR0(true);
            }
            InterfaceC1647420syK interfaceC1647420syK = this.LIZIZ;
            if (interfaceC1647420syK != null) {
                C385670FAf<InterfaceC1644770su3> c385670FAfTn2 = interfaceC1647420syK.tn2();
                if (c385670FAfTn2 != null && (interfaceC1644770su3LIZJ2 = c385670FAfTn2.LIZJ()) != null) {
                    interfaceC1644770su3LIZJ2.nr1();
                    return;
                }
                return;
            }
            InterfaceC1645180sui interfaceC1645180sui = this.LIZ;
            if (interfaceC1645180sui == null) {
                return;
            }
            interfaceC1645180sui.nr1();
            return;
        }
        InterfaceC1646290swV interfaceC1646290swV2 = this.LIZJ;
        if (interfaceC1646290swV2 != null) {
            interfaceC1646290swV2.GR0(false);
        }
        InterfaceC1647420syK interfaceC1647420syK2 = this.LIZIZ;
        if (interfaceC1647420syK2 != null) {
            C385670FAf<InterfaceC1644770su3> c385670FAfTn22 = interfaceC1647420syK2.tn2();
            if (c385670FAfTn22 == null || (interfaceC1644770su3LIZJ = c385670FAfTn22.LIZJ()) == null) {
                return;
            }
            interfaceC1644770su3LIZJ.aC();
            return;
        }
        InterfaceC1645180sui interfaceC1645180sui2 = this.LIZ;
        if (interfaceC1645180sui2 == null) {
            return;
        }
        interfaceC1645180sui2.aC();
    }

    public C1646260swS(InterfaceC1645180sui interfaceC1645180sui, InterfaceC1647420syK interfaceC1647420syK, InterfaceC1646290swV interfaceC1646290swV) {
        this.LIZ = interfaceC1645180sui;
        this.LIZIZ = interfaceC1647420syK;
        this.LIZJ = interfaceC1646290swV;
    }
}
