package X;

import com.bytedance.forest.chain.fetchers.GeckoFetcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534120q1a extends AbstractC1534540q2G {
    public final File LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;

    @Override // X.InterfaceC1535220q3M
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1535220q3M
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC1535220q3M
    public final String getName() {
        return "GeckoProvider";
    }

    @Override // X.InterfaceC1535220q3M
    public final EnumC1528510psX LIZJ() {
        return EnumC1528510psX.WAIT_FOR_RESULT;
    }

    @Override // X.AbstractC1534540q2G
    public final void LJII(C1533790q13 c1533790q13, Function1<? super AbstractC1534220q1k<?>, Unit> function1) {
        Long lValueOf;
        Long l;
        File file = this.LIZLLL;
        if (file != null && LJIIJ(file, c1533790q13.LIZ) && (c1533790q13.LIZ.LJJJJLI.LJII || this.LIZLLL.isFile())) {
            C1528490psV c1528490psV = new C1528490psV(this.LIZLLL);
            LIZLLL().LIZ.LIZIZ = Long.valueOf(c1533790q13.LJIIIZ);
            String absolutePath = this.LIZLLL.getAbsolutePath();
            LIZLLL().LIZ.LJFF = absolutePath;
            c1533790q13.LJIIJJI = absolutePath;
            c1533790q13.LJI = this.LJFF;
            c1528490psV.LIZIZ = new InterfaceC1535380q3c() { // from class: X.0q2C
                @Override // X.InterfaceC1535380q3c
                public final boolean isValid() {
                    Object c098200Yq;
                    try {
                        c098200Yq = Boolean.valueOf(this.LIZ.LIZLLL.exists());
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    return Intrinsics.LJFF(c098200Yq, Boolean.TRUE);
                }
            };
            function1.invoke(c1528490psV);
        } else if (this.LJ && this.LIZLLL == null) {
            C1533510q0b c1533510q0b = c1533790q13.LIZ.LJJJJLI;
            String str = c1533510q0b.LIZ;
            String str2 = c1533510q0b.LIZIZ;
            String str3 = c1533510q0b.LIZJ;
            C086F.LIZ.getClass();
            if (C086F.LIZ()) {
                lValueOf = Long.valueOf(System.currentTimeMillis());
                l = 200L;
            } else {
                lValueOf = null;
                l = null;
            }
            LJ().LIZLLL("compress");
            String strLIZLLL = C1550600qSA.LIZLLL(str, l, true, str2);
            LJ().LIZJ("compress");
            c1533790q13.LJII = true;
            if (strLIZLLL != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZLLL);
                sbLIZ.append(File.separator);
                sbLIZ.append(a0.LJJJJZ("/", str3));
                final C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.exists() && LJIIJ(c0vsj, c1533790q13.LIZ)) {
                    C1528490psV c1528490psV2 = new C1528490psV(c0vsj);
                    LIZLLL().LIZ.LIZIZ = Long.valueOf(c1533790q13.LJIIIZ);
                    String absolutePath2 = c0vsj.getAbsolutePath();
                    LIZLLL().LIZ.LJFF = absolutePath2;
                    c1533790q13.LJIIJJI = absolutePath2;
                    c1533790q13.LJI = this.LJFF;
                    c1528490psV2.LIZIZ = new InterfaceC1535380q3c() { // from class: X.0q2A
                        @Override // X.InterfaceC1535380q3c
                        public final boolean isValid() {
                            Object c098200Yq;
                            try {
                                c098200Yq = Boolean.valueOf(c0vsj.exists());
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            return Intrinsics.LJFF(c098200Yq, Boolean.TRUE);
                        }
                    };
                    function1.invoke(c1528490psV2);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("get file after compressed, but not valid, ");
                    sbLIZ2.append(strLIZLLL);
                    LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                    function1.invoke(null);
                }
            } else if (lValueOf != null && l != null && System.currentTimeMillis() - lValueOf.longValue() > l.longValue()) {
                c1533790q13.LJIIIIZZ = true;
                LJIIIIZZ("gecko compress timeout");
                function1.invoke(null);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("gecko compressed, no valid filepath found: ");
                sbLIZ3.append(str3);
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
                function1.invoke(null);
            }
        } else {
            if (this.LIZLLL != null) {
                LJIIIIZZ("file is corrupted");
            }
            function1.invoke(null);
        }
        if (this.LJI) {
            C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
            C1533510q0b c1533510q0b2 = c1533490q0Z.LJJJJLI;
            C1534270q1p c1534270q1p = GeckoFetcher.Companion;
            boolean z = this.LJ;
            String str4 = c1533510q0b2.LIZIZ;
            boolean z2 = c1533510q0b2.LIZLLL;
            String str5 = c1533510q0b2.LIZJ;
            boolean z3 = this.LJII;
            c1534270q1p.getClass();
            C1534270q1p.LIZ(z, str4, c1533490q0Z, z2, str5, z3);
        }
    }

    public final boolean LJIIJ(File file, C1533490q0Z c1533490q0Z) {
        Object c098200Yq;
        C0VSP c0vsp;
        if (c1533490q0Z.LJJJJLI.LJFF) {
            try {
                c0vsp = new C0VSP(file);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (c0vsp.available() == 0) {
                LJIIIIZZ("file available size is 0");
                c0vsp.close();
                LJ().LIZJ("load");
                LJ().LIZJ("total");
                return false;
            }
            c0vsp.close();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error occurs when checking file ");
                sbLIZ.append(file.getAbsolutePath());
                sbLIZ.append(", ");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        }
        LJ().LIZJ("load");
        LJ().LIZJ("total");
        return true;
    }

    public C1534120q1a(C0VSJ c0vsj, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZLLL = c0vsj;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = z4;
    }
}
