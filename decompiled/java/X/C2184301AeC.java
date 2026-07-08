package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1AeC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184301AeC {
    public boolean LJ;
    public C1AWY LJI;
    public C1AWY LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();
    public final List<String> LIZJ = new ArrayList();
    public final List<String> LIZLLL = new ArrayList();
    public EnumC2184291AeB LJFF = EnumC2184291AeB.PARK;

    public final List<String> LIZ() {
        return (List) this.LJIILL.getValue();
    }

    public final List<String> LIZIZ() {
        return (List) this.LJIILJJIL.getValue();
    }

    public final List<String> LIZJ() {
        return (List) this.LJIILIIL.getValue();
    }

    public final List<String> LIZLLL() {
        return (List) this.LJIIL.getValue();
    }

    public C2184301AeC() {
        C1AWY c1awy = C1AWY.SINGLE;
        this.LJI = c1awy;
        this.LJII = c1awy;
        this.LJIIIIZZ = 200L;
        this.LJIIJJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1411));
        this.LJIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3917));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3916));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3915));
        this.LJIILL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3914));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RunnableBlockConfig(blockMode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", runnableBlockType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", threadBlockType=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", blockTime=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", bypassStaggeredRelease=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", runnableConfigForTypeAll=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", runnableConfigForTypeSingle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", threadConfigForTypeAll=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", threadConfigForTypeSingle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
