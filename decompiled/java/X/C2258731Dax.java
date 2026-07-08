package X;

import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258731Dax extends AbstractC21592019eo implements C0N86 {
    public final C0N23 LJIIIIZZ;
    public final C1305120k4E<String, InterfaceC2258681Das> LJIIIZ;
    public C0N86 LJIIJ;
    public final ConcurrentHashMap<String, WeakReference<InterfaceC2258821Db6>> LJIIJJI = new ConcurrentHashMap<>();

    @Override // X.C0N86
    public final void LIZIZ(String str, String str2) {
    }

    @Override // X.C0N86
    public final void LJIIIIZZ(String str, String str2) {
    }

    @Override // X.InterfaceC2258671Dar
    public final void LJIILLIIL() {
        Iterator it2 = ((ArrayList) this.LJIIIZ.LIZJ()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2258851Db9) it2.next()).LIZLLL(this.LJIIIIZZ);
        }
        this.LJIIIZ.LJ(this);
    }

    public final void LJIJJLI() {
        this.LJIIIZ.LIZ(this, new C2258781Db2(this));
        LJJ("", "Init");
    }

    public final InterfaceC2258821Db6 LJIL() {
        InterfaceC2258821Db6 interfaceC2258821Db6;
        WeakReference<InterfaceC2258821Db6> weakReference = this.LJIIJJI.get(LJIJ());
        if (weakReference == null || (interfaceC2258821Db6 = weakReference.get()) == null) {
            Iterator<T> it2 = this.LJIIJJI.values().iterator();
            while (it2.hasNext()) {
                interfaceC2258821Db6 = (InterfaceC2258821Db6) ((Reference) it2.next()).get();
                if (interfaceC2258821Db6 != null) {
                }
            }
            return null;
        }
        return interfaceC2258821Db6;
    }

    @Override // X.InterfaceC2258821Db6
    public final String LJIIZILJ() {
        String strLJIIZILJ;
        InterfaceC2258821Db6 interfaceC2258821Db6LJIL = LJIL();
        return (interfaceC2258821Db6LJIL == null || (strLJIIZILJ = interfaceC2258821Db6LJIL.LJIIZILJ()) == null) ? "undefined" : strLJIIZILJ;
    }

    @Override // X.InterfaceC2258811Db5
    public final String LJIJ() {
        return LJIJI().getFirst();
    }

    @Override // X.InterfaceC2258821Db6
    public final long LLLJL() {
        InterfaceC2258821Db6 interfaceC2258821Db6LJIL = LJIL();
        if (interfaceC2258821Db6LJIL != null) {
            return interfaceC2258821Db6LJIL.LLLJL();
        }
        return -10002L;
    }

    @Override // X.InterfaceC2258821Db6
    public final boolean isPlaying() {
        InterfaceC2258821Db6 interfaceC2258821Db6LJIL = LJIL();
        if (interfaceC2258821Db6LJIL != null) {
            return interfaceC2258821Db6LJIL.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC2258811Db5
    public final C0N23 LJIIIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC2258811Db5
    public final C0N86 LJIIJJI() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC2258821Db6
    public final long LJII(String str) {
        InterfaceC2258821Db6 interfaceC2258821Db6LJIL = LJIL();
        if (interfaceC2258821Db6LJIL != null) {
            return interfaceC2258821Db6LJIL.LJII(str);
        }
        return -10002L;
    }

    @Override // X.InterfaceC2258811Db5
    public final void LJIIL(C0N85 c0n85) {
        this.LJIIJ = c0n85;
    }

    public C2258731Dax(C0N23 c0n23, C1305120k4E<String, InterfaceC2258681Das> c1305120k4E) {
        this.LJIIIIZZ = c0n23;
        this.LJIIIZ = c1305120k4E;
    }

    @Override // X.C0N86
    public final void LIZ(String str, String str2) {
        LJIJJ(new Pair<>(str, str2));
    }

    public final void LJJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Feed_Standard_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIJJI.clear();
        List<InterfaceC2258681Das> listLIZJ = this.LJIIIZ.LIZJ();
        ConcurrentHashMap<String, WeakReference<InterfaceC2258821Db6>> concurrentHashMap = this.LJIIJJI;
        for (InterfaceC2258681Das interfaceC2258681Das : (ArrayList) listLIZJ) {
            Pair pair = new Pair(interfaceC2258681Das.getEventType(), new WeakReference(interfaceC2258681Das));
            concurrentHashMap.put((String) pair.getFirst(), (WeakReference<InterfaceC2258821Db6>) pair.getSecond());
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().LIZ();
        Iterator it2 = ((ArrayList) this.LJIIIZ.LIZJ()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2258851Db9) it2.next()).LJIIIIZZ(this.LJIIIIZZ, this);
        }
    }

    @Override // X.C0N86
    public final void LIZLLL(C0N23 c0n23, String str, Map map) {
        C0N86 c0n86;
        if (Intrinsics.LJFF(c0n23, this.LJIIIIZZ) && (c0n86 = this.LJIIJ) != null) {
            c0n86.LIZLLL(c0n23, str, map);
        }
    }

    @Override // X.C0N86
    public final void LJIILIIL(C0N23 c0n23, String str, Map map) {
        if (!Intrinsics.LJFF(c0n23, this.LJIIIIZZ)) {
            return;
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        LJIJJ(new Pair<>(str, c0n23.LIZIZ()));
        this.LJ.LIZ.set("LOOP_PLAY_INITIAL_VALUE");
        C0N86 c0n86 = this.LJIIJ;
        if (c0n86 != null) {
            c0n86.LJIILIIL(c0n23, str, map);
        }
    }

    @Override // X.C0N86
    public final void LJIILL(C0N23 c0n23, String str, Map map) {
        if (!Intrinsics.LJFF(c0n23, this.LJIIIIZZ)) {
            return;
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        C0N86 c0n86 = this.LJIIJ;
        if (c0n86 != null) {
            c0n86.LJIILL(c0n23, str, map);
        }
        this.LJ.LIZ.set(str);
    }
}
