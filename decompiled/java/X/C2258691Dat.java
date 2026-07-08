package X;

import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS649S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258691Dat implements InterfaceC2258661Daq, C0N87 {
    public final C0N23 LJ;
    public final C1305120k4E<String, InterfaceC2258651Dap> LJFF;
    public C0N87 LJI;

    public final void LIZ() {
        this.LJFF.LIZ(this, new AwS649S0100000_35(this, 23));
        LIZIZ();
    }

    public final void LIZIZ() {
        Iterator<InterfaceC2258651Dap> it2 = this.LJFF.LIZJ().iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(this.LJ, this);
        }
    }

    @Override // X.InterfaceC2258671Dar
    public final void LJIILLIIL() {
        Iterator it2 = ((ArrayList) this.LJFF.LIZJ()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2258711Dav) it2.next()).LJIIIIZZ(this.LJ);
        }
        this.LJFF.LJ(this);
    }

    @Override // X.InterfaceC2258661Daq
    public final void LJIIJ(C0N85 c0n85) {
        this.LJI = c0n85;
    }

    public C2258691Dat(C0N23 c0n23, C1305120k4E<String, InterfaceC2258651Dap> c1305120k4E) {
        this.LJ = c0n23;
        this.LJFF = c1305120k4E;
    }

    @Override // X.C0N87
    public final void LJFF(C0N23 c0n23, String str, Map map) {
        if (!Intrinsics.LJFF(c0n23, this.LJ)) {
            return;
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        C0N87 c0n87 = this.LJI;
        if (c0n87 != null) {
            c0n87.LJFF(c0n23, str, map);
        }
    }

    @Override // X.C0N87
    public final void LJI(C0N23 c0n23, String str, Map map) {
        C0N87 c0n87;
        if (Intrinsics.LJFF(c0n23, this.LJ) && (c0n87 = this.LJI) != null) {
            c0n87.LJI(c0n23, str, map);
        }
    }

    @Override // X.C0N87
    public final void LJII(C0N23 c0n23, String str, Map map) {
        C0N87 c0n87;
        if (Intrinsics.LJFF(c0n23, this.LJ) && (c0n87 = this.LJI) != null) {
            c0n87.LJII(c0n23, str, map);
        }
    }

    @Override // X.C0N87
    public final void LJIIZILJ(C0N23 c0n23, String str, Map map) {
        if (!Intrinsics.LJFF(c0n23, this.LJ)) {
            return;
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        C0N87 c0n87 = this.LJI;
        if (c0n87 != null) {
            c0n87.LJIIZILJ(c0n23, str, map);
        }
    }
}
