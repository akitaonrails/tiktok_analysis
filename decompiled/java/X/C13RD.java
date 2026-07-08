package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.model.FetchModelType;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.13RD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13RD {
    public static final /* synthetic */ int LJJJZ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final HashMap<String, String> LJIIL;
    public final EffectConfiguration.UnZipSolution LJIILIIL;
    public final C20000913Nn LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final C13R7 LJIJI;
    public final C13SQ LJIJJ;
    public final InterfaceC1633730scF LJIJJLI;
    public final InterfaceExecutorC740550T3d LJIL;
    public final int LJJ;
    public final InterfaceC19997313Md LJJI;
    public InterfaceC20004513Ox LJJIFFI;
    public final String LJJII;
    public final String LJJIII;
    public C20001113Np LJJIIJ;
    public final String LJJIIJZLJL;
    public final List<String> LJJIIZ;
    public final Object LJJIIZI;
    public final FetchModelType LJJIJ;
    public final String LJJIJIIJI;
    public final EnumC19364410pO LJJIJIIJIL;
    public final String LJJIJIL;
    public final String LJJIJL;
    public final long LJJIJLIJ;
    public final boolean LJJIL;
    public final boolean LJJIZ;
    public final int LJJJ;
    public final C13MG LJJJI;
    public final C19996113Lr LJJJIL;
    public final Integer LJJJJ;
    public final boolean LJJJJI;
    public final String[] LJJJJIZL;
    public final InterfaceC19370610qO LJJJJJ;
    public final boolean LJJJJJL;
    public final boolean LJJJJL;
    public final boolean LJJJJLI;
    public final boolean LJJJJLL;
    public final boolean LJJJJZ;
    public final boolean LJJJJZI;
    public final int LJJJLIIL;
    public final C13RB LJJJLL;
    public final boolean LJJJLZIJ;

    public C13RD(C13RF c13rf) {
        boolean z;
        C13NB c13nb;
        this.LIZ = c13rf.LIZ;
        this.LIZIZ = c13rf.LIZIZ;
        this.LIZJ = c13rf.LIZJ;
        this.LIZLLL = c13rf.LIZLLL;
        String str = c13rf.LJIIIZ;
        this.LJ = str == null ? "online" : str;
        String str2 = c13rf.LJIIJ;
        this.LJFF = str2 == null ? "android" : str2;
        this.LJI = c13rf.LJIIJJI;
        String str3 = c13rf.LJIIL;
        str3 = str3 == null ? "" : str3;
        this.LJII = str3;
        String str4 = c13rf.LJIILIIL;
        this.LJIIIIZZ = str4 != null ? str4 : "";
        this.LJIIIZ = c13rf.LJ;
        String str5 = c13rf.LJFF;
        this.LJIIJ = str5 == null ? CardStruct.IStatusCode.DEFAULT : str5;
        this.LJIIJJI = c13rf.LJIJ;
        this.LJIIL = c13rf.LJJI;
        this.LJIILIIL = c13rf.LJJIII;
        this.LJIILJJIL = c13rf.LJJIIJZLJL;
        this.LJIILL = c13rf.LJIILL;
        this.LJIILLIIL = c13rf.LJIILLIIL;
        this.LJIIZILJ = c13rf.LJIIZILJ;
        this.LJIJ = c13rf.LJJIFFI;
        C13R7 c13r7 = c13rf.LJII;
        this.LJIJI = c13r7 == null ? null : c13r7;
        InterfaceExecutorC740550T3d c13qj = c13rf.LJIJI;
        c13qj = c13qj == null ? new C13QJ() : c13qj;
        this.LJIL = c13qj;
        int i = c13rf.LJJIL;
        this.LJJ = i;
        this.LJJII = c13rf.LJJ;
        this.LJJIII = c13rf.LJIL;
        C20002513Od c20002513Od = new C20002513Od();
        c20002513Od.LIZIZ = i;
        c20002513Od.LIZ = c13qj;
        this.LJJIIJ = c20002513Od.LIZ();
        this.LJJIIJZLJL = c13rf.LJJII;
        this.LJJIIZ = c13rf.LJJIIJ;
        this.LJJIIZI = c13rf.LJJIIZI;
        this.LJJIJ = c13rf.LJJIJ;
        this.LJJIJIIJI = c13rf.LJJIJIIJI;
        this.LJJIJIIJIL = c13rf.LJJIJIIJIL;
        String strLIZIZ = c13rf.LJIILJJIL;
        if (strLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append(C13SB.LIZ);
            sbLIZ.append("algorithm");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LJJIJIL = strLIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str3);
        sbLIZ2.append(C13SB.LIZ);
        sbLIZ2.append("materialResource");
        this.LJJIJL = C2188811AlT.LIZIZ(sbLIZ2);
        this.LJJIJLIJ = c13rf.LJJIJL;
        this.LJJIL = c13rf.LJJIJLIJ;
        this.LJJIZ = c13rf.LJJJJI;
        this.LJJJ = c13rf.LJJJJIZL;
        this.LJJJI = C13MG.LIZ;
        this.LJJJIL = new C19996113Lr();
        this.LJJJJ = c13rf.LJJIJIL;
        this.LJJJJI = c13rf.LJJIZ;
        this.LJJJJIZL = c13rf.LJJJ;
        this.LJJJJJ = c13rf.LJJJI;
        this.LJJJJJL = c13rf.LJJJIL;
        boolean z2 = c13rf.LJJJJ;
        this.LJJJJL = z2;
        this.LJJJJLI = c13rf.LJJJJJ;
        this.LJJJJLL = c13rf.LJJIIZ;
        this.LJJJJZ = c13rf.LJJJJJL;
        this.LJJJJZI = c13rf.LJJJJL;
        this.LJJJLIIL = c13rf.LJJJJLI;
        this.LJJJLL = c13rf.LJJJJZ;
        this.LJJJLZIJ = c13rf.LJJJJLL;
        Object obj = c13rf.LJJIIZI;
        if (obj != null && (c13nb = c13rf.LJI) != null) {
            this.LJIJJ = new C13SQ(obj, c13rf.LJJIL, c13nb);
        }
        InterfaceC19997313Md interfaceC19997313Md = c13rf.LJIJJ;
        this.LJJI = interfaceC19997313Md == null ? new C19997213Mc(this) : interfaceC19997313Md;
        this.LJIJJLI = c13rf.LJIJJLI;
        this.LJJIFFI = c13rf.LJIIIIZZ;
        if (!C13O0.LIZ && !z2) {
            z = false;
        } else {
            z = true;
        }
        C13O0.LIZ = z;
        C20006413Pq.LIZ = C20006413Pq.LIZ || c13rf.LJJJJJL;
    }
}
