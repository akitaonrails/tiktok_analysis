package X;

import Y.ARunnableS105S0100000_5;
import Y.ARunnableS24S0110000_5;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS24S0202000_5;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Drd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352350Drd {
    public final InterfaceC1455860nzM LIZ;
    public final VEEditorAutoStartStopArbiter LIZIZ;
    public final int LIZJ;
    public final Function0<Boolean> LIZLLL;
    public final Function0<Boolean> LJ;
    public final Function2<AbstractC1456460o0K, Runnable, Unit> LJFF;
    public final Function0<Boolean> LJI;
    public final ArrayList<Integer> LJII = new ArrayList<>();
    public final Map<String, ArrayList<NLEFilter>> LJIIIIZZ = new LinkedHashMap();
    public boolean LJIIIZ;
    public ARunnableS105S0100000_5 LJIIJ;
    public Integer LJIIJJI;

    public final void LIZ() {
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audio fadeout || addAudioFadeoutFiltersAndReleaseEngine in Thread: ");
        sbLIZ.append(C786410Ut5.u3().getName());
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIZ = true;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.LIZIZ;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.LLIZLLLIL = true;
        }
        this.LJII.clear();
        ((LinkedHashMap) this.LJIIIIZZ).clear();
        long j = this.LIZJ;
        InterfaceC1452170ntP interfaceC1452170ntPLIZJ = LIZJ();
        if (interfaceC1452170ntPLIZJ != null) {
            long jLIZIZ = LIZIZ(interfaceC1452170ntPLIZJ) - interfaceC1452170ntPLIZJ.LLL();
            if (jLIZIZ < this.LIZJ) {
                j = jLIZIZ;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("audio fadeout || delayedReleaseTime: ");
        sbLIZ2.append(j);
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC1452170ntP interfaceC1452170ntPLIZJ2 = LIZJ();
        if (interfaceC1452170ntPLIZJ2 != null) {
            int iLLL = interfaceC1452170ntPLIZJ2.LLL();
            C391360FWc.LIZLLL("", interfaceC1452170ntPLIZJ2, new AwS24S0202000_5(iLLL, this.LIZJ + iLLL < LIZIZ(interfaceC1452170ntPLIZJ2) ? this.LIZJ + iLLL : LIZIZ(interfaceC1452170ntPLIZJ2), this, interfaceC1452170ntPLIZJ2, 1));
        }
        ARunnableS105S0100000_5 aRunnableS105S0100000_5 = new ARunnableS105S0100000_5(this, 2);
        this.LJIIJ = aRunnableS105S0100000_5;
        C0CNO.LIZJ(j, aRunnableS105S0100000_5);
    }

    public final InterfaceC1452170ntP LIZJ() {
        return this.LIZ.g().getValue();
    }

    public final int LIZIZ(InterfaceC1452170ntP interfaceC1452170ntP) {
        if (this.LJI.invoke().booleanValue()) {
            Integer num = this.LJIIJJI;
            if (num != null) {
                return num.intValue();
            }
            Integer numValueOf = Integer.valueOf(interfaceC1452170ntP.getDuration());
            this.LJIIJJI = numValueOf;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            return 0;
        }
        return interfaceC1452170ntP.getDuration();
    }

    public final void LIZLLL(boolean z) {
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audio fadeout || resetAudioFadeout in Thread: ");
        sbLIZ.append(C786410Ut5.u3().getName());
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIJ = null;
        this.LJIIIZ = false;
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.LIZIZ;
        if (vEEditorAutoStartStopArbiter != null) {
            vEEditorAutoStartStopArbiter.LLIZLLLIL = false;
        }
        InterfaceC1452170ntP interfaceC1452170ntPLIZJ = LIZJ();
        if (interfaceC1452170ntPLIZJ != null) {
            C391360FWc.LIZLLL("", interfaceC1452170ntPLIZJ, new AwS584S0100000_5(this, 16));
        }
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter2 = this.LIZIZ;
        if (vEEditorAutoStartStopArbiter2 != null) {
            vEEditorAutoStartStopArbiter2.LIZIZ();
        }
        this.LJII.clear();
        ((LinkedHashMap) this.LJIIIIZZ).clear();
        this.LJFF.invoke(C1456500o0O.LIZIZ, new ARunnableS24S0110000_5(this, z, 0));
    }

    public C352350Drd(C1455870nzN c1455870nzN, VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter, int i, Function0 function0, AwS566S0100000_22 awS566S0100000_22, Function2 function2, AwS566S0100000_22 awS566S0100000_222) {
        this.LIZ = c1455870nzN;
        this.LIZIZ = vEEditorAutoStartStopArbiter;
        this.LIZJ = i;
        this.LIZLLL = function0;
        this.LJ = awS566S0100000_22;
        this.LJFF = function2;
        this.LJI = awS566S0100000_222;
    }
}
