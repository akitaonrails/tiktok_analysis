package X;

import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Daw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258721Daw extends AbstractC21592019eo implements C0N86 {
    public final C0N23 LJIIIIZZ;
    public final C1305120k4E<String, InterfaceC2258681Das> LJIIIZ;
    public final C1305120k4E<String, InterfaceC2258681Das> LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public C0N86 LJIILIIL;
    public WeakReference<InterfaceC2258681Das> LJIILJJIL;

    @Override // X.C0N86
    public final void LIZ(String str, String str2) {
    }

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
        Iterator it3 = ((ArrayList) this.LJIIJ.LIZJ()).iterator();
        while (it3.hasNext()) {
            ((InterfaceC2258851Db9) it3.next()).LIZLLL(this.LJIIIIZZ);
        }
        this.LJIIIZ.LJ(this);
        this.LJIIJ.LJ(this);
    }

    public final void LJIJJLI() {
        this.LJIIIZ.LIZ(this, new C2258791Db3(this));
        this.LJIIJ.LIZ(this, new C2258801Db4(this));
        LJJIFFI("", "Init");
    }

    public final InterfaceC2258681Das LJIL() {
        WeakReference<InterfaceC2258681Das> weakReference = this.LJIILJJIL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final InterfaceC2258681Das LJJ() {
        InterfaceC2258681Das next;
        Iterator<InterfaceC2258681Das> it2 = this.LJIIJ.LIZJ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(this.LJIIJJI, next.getEventType())) {
                break;
            }
        }
        return next;
    }

    public final InterfaceC2258681Das LJJI() {
        Object obj;
        List<InterfaceC2258681Das> listLIZJ = this.LJIIIZ.LIZJ();
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC2258681Das> it2 = listLIZJ.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC2258681Das next = it2.next();
            if (Intrinsics.LJFF(this.LJIIL, next.getEventType())) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (Intrinsics.LJFF(((InterfaceC2258821Db6) next2).LJIIZILJ(), this.LJIIIIZZ.LIZIZ())) {
                obj = next2;
                break;
            }
        }
        return (InterfaceC2258681Das) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // X.AbstractC21592019eo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            r2 = this;
            java.lang.String r1 = r2.LJIJ()
            java.lang.String r0 = r2.LJIIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L26
            X.1Das r0 = r2.LJJI()
            if (r0 == 0) goto L3a
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
        L17:
            r2.LJIILJJIL = r1
            X.04TF r0 = com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules r0 = X.C04TF.LIZ()
            r0.isDebug()
            return
        L26:
            java.lang.String r0 = r2.LJIIJJI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3a
            X.1Das r0 = r2.LJJ()
            if (r0 == 0) goto L3a
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            goto L17
        L3a:
            r1 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258721Daw.LJI():void");
    }

    @Override // X.InterfaceC2258821Db6
    public final String LJIIZILJ() {
        String strLJIIZILJ;
        InterfaceC2258681Das interfaceC2258681DasLJIL = LJIL();
        return (interfaceC2258681DasLJIL == null || (strLJIIZILJ = interfaceC2258681DasLJIL.LJIIZILJ()) == null) ? "undefined" : strLJIIZILJ;
    }

    @Override // X.InterfaceC2258811Db5
    public final String LJIJ() {
        return LJIJI().getFirst();
    }

    @Override // X.InterfaceC2258821Db6
    public final long LLLJL() {
        InterfaceC2258681Das interfaceC2258681DasLJIL = LJIL();
        if (interfaceC2258681DasLJIL != null) {
            return interfaceC2258681DasLJIL.LLLJL();
        }
        return -10002L;
    }

    @Override // X.InterfaceC2258821Db6
    public final boolean isPlaying() {
        InterfaceC2258681Das interfaceC2258681DasLJIL = LJIL();
        if (interfaceC2258681DasLJIL != null) {
            return interfaceC2258681DasLJIL.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC2258811Db5
    public final C0N23 LJIIIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC2258811Db5
    public final C0N86 LJIIJJI() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC2258821Db6
    public final long LJII(String str) {
        InterfaceC2258681Das interfaceC2258681DasLJIL = LJIL();
        if (interfaceC2258681DasLJIL != null) {
            return interfaceC2258681DasLJIL.LJII(str);
        }
        return -10002L;
    }

    @Override // X.InterfaceC2258811Db5
    public final void LJIIL(C0N85 c0n85) {
        this.LJIILIIL = c0n85;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
    
        if (LJJI() == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e4, code lost:
    
        com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules.LIZ.getClass();
        X.C04TF.LIZ().isDebug();
        LJIJJ(new kotlin.Pair<>(r5.LJIIL, LJIJI().getSecond()));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258721Daw.LJJIFFI(java.lang.String, java.lang.String):void");
    }

    @Override // X.C0N86
    public final void LIZLLL(C0N23 c0n23, String str, Map map) {
        C0N86 c0n86;
        if (Intrinsics.LJFF(c0n23, this.LJIIIIZZ) && (c0n86 = this.LJIILIIL) != null) {
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
        C0N86 c0n86 = this.LJIILIIL;
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
        C0N86 c0n86 = this.LJIILIIL;
        if (c0n86 != null) {
            c0n86.LJIILL(c0n23, str, map);
        }
        this.LJ.LIZ.set(str);
    }

    public C2258721Daw(C0N23 c0n23, C0N29 c0n29, C1305120k4E<String, InterfaceC2258681Das> c1305120k4E, C1305120k4E<String, InterfaceC2258681Das> c1305120k4E2) {
        this.LJIIIIZZ = c0n23;
        this.LJIIIZ = c1305120k4E;
        this.LJIIJ = c1305120k4E2;
        this.LJIIJJI = c0n29.LIZIZ;
        this.LJIIL = c0n29.LIZ;
    }
}
