package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nRN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434790nRN extends AbstractC1434920nRa {
    public final C1433530nPL LIZJ;
    public final String LIZLLL;
    public final InterfaceC1434300nQa LJ;
    public volatile C1D80 LJFF;
    public AbstractC1433570nPP LJI;
    public final C01GW LJII;
    public final C1434960nRe LJIIIIZZ;
    public volatile boolean LJIIIZ;

    public final void LIZ() {
        this.LJIIIZ = false;
        C1D82 c1d82 = new C1D82(new AwS566S0100000_22(this, 1149), EnumC1434770nRL.COMPILE);
        c1d82.LJIIJ = C1433780nPk.LIZ;
        C1D82 c1d822 = new C1D82(AFwS210S0000000_22.get$arr$(561), EnumC1434770nRL.SAVE_LOCAL);
        C1440550naf c1440550naf = new C1440550naf("TTEPWavePublisher", (C1D82[]) Arrays.copyOf(new C1D82[]{c1d82}, 1));
        c1440550naf.LIZIZ = this.LIZJ.LIZIZ;
        ArrayList arrayList = (ArrayList) c1440550naf.LIZLLL;
        arrayList.add(this.LJIIIIZZ);
        arrayList.add(new C1434970nRf(this.LIZJ.LIZ));
        arrayList.add(new C1404570med(this.LIZJ.LIZIZ));
        if (!C1428470nHB.LJJZZI(this.LJIIIIZZ.LIZ)) {
            arrayList.add(new C2221281Bwk(C297810Blr.LIZ() ? this.LJIIIIZZ.LIZ.getOutputFile() : this.LJIIIIZZ.LIZ.getParallelUploadOutputFile(), this.LIZLLL));
        }
        arrayList.add(this.LJ);
        arrayList.add(this.LJII.getValue());
        c1440550naf.LJFF = EnableParallelPublishSchedulerV2Exp.LIZ().enable;
        c1440550naf.LJ = C1435270nS9.LIZ();
        this.LJ.LJFF();
        c1440550naf.LJII = new C1435280nSA(C1434840nRS.LIZLLL(this.LIZJ));
        this.LJ.LJFF();
        c1440550naf.LJIIIIZZ = new C1435280nSA(C1434840nRS.LJ());
        this.LJ.LJFF();
        c1440550naf.LJIIIZ = new C1435280nSA(C1434840nRS.LIZJ());
        this.LJFF = c1440550naf.LIZ();
        C1D80 c1d80 = this.LJFF;
        if (c1d80 == null) {
            c1d80 = null;
        }
        C575070Mgz.LIZ(c1d80, new AwS601S0100000_22(this, 926));
        c1d822.LIZ(c1d82);
    }

    public final void LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isTTEPSave", String.valueOf(this.LIZJ.LIZ.isTTEPSave));
        C1AF0.LJI(new Throwable(), "TTEP record task is null", linkedHashMap);
    }

    @Override // X.InterfaceC1433580nPQ
    public final void reStart() {
        C1D80 c1d80 = this.LJFF;
        if (c1d80 == null) {
            c1d80 = null;
        }
        if (c1d80.LIZJ() instanceof C1D8S) {
            LIZ();
        }
        ((C1405220mfg) this.LJII.getValue()).LIZLLL(EnumC1404590mef.TTEP);
        C1D80 c1d802 = this.LJFF;
        (c1d802 != null ? c1d802 : null).LJII();
    }

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIILL(C1433230nOr c1433230nOr) {
        if (this.LJFF != null) {
            C1D80 c1d80 = this.LJFF;
            if (c1d80 == null) {
                c1d80 = null;
            }
            c1d80.LIZIZ(c1433230nOr);
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIIZILJ(AbstractC1433570nPP abstractC1433570nPP) {
        this.LJI = abstractC1433570nPP;
        if (this.LIZJ.LJI != null) {
            try {
                LIZ();
                ((C1405220mfg) this.LJII.getValue()).LIZLLL(EnumC1404590mef.TTEP);
                C1D80 c1d80 = this.LJFF;
                if (c1d80 == null) {
                    c1d80 = null;
                }
                c1d80.LJII();
                return;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                LIZIZ();
                return;
            }
        }
        LIZIZ();
    }

    public C1434790nRN(C1433530nPL c1433530nPL, String str, C1434310nQb c1434310nQb) {
        super(c1434310nQb);
        this.LIZJ = c1433530nPL;
        this.LIZLLL = str;
        this.LJ = c1434310nQb;
        this.LJII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1150));
        this.LJIIIIZZ = new C1434960nRe((VideoPublishEditModel) c1433530nPL.LIZ.editModel);
    }
}
