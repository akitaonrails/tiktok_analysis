package X;

import android.os.Trace;
import androidx.compose.runtime.s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import e0.s0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS465S0200000_30;
import kotlin.jvm.internal.Intrinsics;
import p1.b;

/* JADX INFO: renamed from: X.13ZC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZC implements InterfaceC1680500tpg {
    public final InterfaceC20032213Zo<?> LIZIZ;
    public final C13Z1 LIZJ;
    public final C13ZI LIZLLL;
    public final Set<InterfaceC20035313aJ> LJ;
    public final C13Z8 LJFF;
    public final C13Z8 LJI;
    public final C13Y2 LJII;
    public C13ZM LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int[] LJIILJJIL;
    public C13ZX LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public C20029713Yp<C13D2> LJIJJLI;
    public boolean LJIL;
    public boolean LJJI;
    public int LJJII;
    public int LJJIII;
    public boolean LJJIIJ;
    public final C20030413Yw LJJIIJZLJL;
    public final ArrayList LJJIIZ;
    public boolean LJJIIZI;
    public C13ZD LJJIJ;
    public C13ZI LJJIJIIJI;
    public C13ZE LJJIJIIJIL;
    public boolean LJJIJIL;
    public C13D2 LJJIJL;
    public C13Z8 LJJIJLIJ;
    public final C13ZH LJJIL;
    public C13Z7 LJJIZ;
    public C20034713aD LJJJ;
    public boolean LJJJI;
    public int LJJJIL;
    public C20034613aC LJJJJ;
    public final ArrayList LJIIIIZZ = new ArrayList();
    public final C20034513aB LJIILIIL = new C20034513aB();
    public final List<C20035013aG> LJIJ = new ArrayList();
    public final C20034513aB LJIJI = new C20034513aB();
    public C13D2 LJIJJ = C19971913Cj.LLILZIL;
    public final C20034513aB LJJ = new C20034513aB();
    public int LJJIFFI = -1;

    @Override // X.InterfaceC1680500tpg
    public final void LJ() {
        LJJJJL(false);
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJFF() {
        this.LJIILLIIL = true;
        this.LJJIIJ = true;
        this.LIZLLL.LJ();
        this.LJJIJIIJI.LJ();
        C13ZE c13ze = this.LJJIJIIJIL;
        C13ZI c13zi = c13ze.LIZ;
        c13ze.LJ = c13zi.LLJI;
        c13ze.LJFF = c13zi.LLJIJIL;
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJIIIZ() {
        LJJJJL(true);
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJJIII() {
        LJL(125, 2, null, null);
        this.LJIIZILJ = true;
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJJIJL() {
        LJJJJL(false);
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJJIJLIJ() {
        LJJJJL(false);
    }

    public final void LJJJI() {
        this.LJIIIZ = null;
        this.LJIIJ = 0;
        this.LJIIJJI = 0;
        this.LJJJIL = 0;
        this.LJIIZILJ = false;
        C13ZH c13zh = this.LJJIL;
        c13zh.LIZJ = false;
        c13zh.LIZLLL.LIZIZ = 0;
        c13zh.LJFF = 0;
        this.LJJIIZ.clear();
        this.LJIILJJIL = null;
        this.LJIILL = null;
    }

    public final void LJJJJLI() {
        LJJJJL(false);
        C20030013Ys c20030013YsLJJLI = LJJLI();
        if (c20030013YsLJJLI != null) {
            int i = c20030013YsLJJLI.LIZ;
            if ((i & 1) != 0) {
                c20030013YsLJJLI.LIZ = i | 2;
            }
        }
    }

    public final void LJJJJLL() {
        LJJJJL(false);
        LJJJJL(false);
        this.LJIL = this.LJJ.LIZ() != 0;
        this.LJJIJL = null;
    }

    public final void LJJJJZ() {
        LJJJJL(false);
        LJJJJL(false);
        this.LJIL = this.LJJ.LIZ() != 0;
        this.LJJIJL = null;
    }

    public final void LJJJLIIL() {
        LJJJJL(false);
        this.LIZJ.LIZJ();
        LJJJJL(false);
        C13ZH c13zh = this.LJJIL;
        if (c13zh.LIZJ) {
            c13zh.LIZLLL(false);
            c13zh.LIZLLL(false);
            c13zh.LIZIZ.LIZ.LIZJ(C20034213a8.LIZJ);
            c13zh.LIZJ = false;
        }
        C13ZH c13zh2 = this.LJJIL;
        c13zh2.LIZIZ();
        if (c13zh2.LIZLLL.LIZIZ != 0) {
            s.LIZJ("Missed recording an endGroup()");
        }
        if (!this.LJIIIIZZ.isEmpty()) {
            s.LIZJ("Start/end imbalance");
        }
        LJJJI();
        this.LJJIJ.LIZJ();
        this.LJIL = this.LJJ.LIZ() != 0;
    }

    public final void LJLI() {
        LJL(-127, 0, null, null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJLJJI() {
        this.LJIIL = 0;
        this.LJJIJ = this.LIZLLL.LJFF();
        LJL(100, 0, null, null);
        this.LIZJ.LJIILLIIL();
        this.LJIJJ = this.LIZJ.LJI();
        this.LJJ.LIZIZ(this.LJIL ? 1 : 0);
        this.LJIL = LJJIIJ(this.LJIJJ);
        this.LJJIJL = null;
        if (!this.LJIILLIIL) {
            this.LJIILLIIL = this.LIZJ.LJ();
        }
        if (!this.LJJIIJ) {
            this.LJJIIJ = this.LIZJ.LJFF();
        }
        Set<InterfaceC1680530tpj> set = (Set) C19973413Cy.LIZ(this.LJIJJ, b.LIZ);
        if (set != null) {
            set.add(LJJIJIL());
            this.LIZJ.LJIILIIL(set);
        }
        LJL(this.LIZJ.LJII(), 0, null, null);
    }

    @Override // X.InterfaceC1680500tpg
    public final boolean LIZ() {
        C20030013Ys c20030013YsLJJLI;
        return (this.LJJJI || this.LJJI || this.LJIL || (c20030013YsLJJLI = LJJLI()) == null || (c20030013YsLJJLI.LIZ & 8) != 0) ? false : true;
    }

    @Override // X.InterfaceC1680500tpg
    public final void LIZJ() {
        if (this.LJIIJJI != 0) {
            s.LIZJ("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.LJJJI) {
            return;
        }
        C20030013Ys c20030013YsLJJLI = LJJLI();
        if (c20030013YsLJJLI != null) {
            int i = c20030013YsLJJLI.LIZ;
            if ((i & 128) == 0) {
                c20030013YsLJJLI.LIZ = i | 16;
            }
        }
        if (((ArrayList) this.LJIJ).isEmpty()) {
            LJJZZIII();
        } else {
            LJJLIIIJLJLI();
        }
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJIILJJIL() {
        if (!this.LJIIZILJ) {
            s.LIZJ("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.LJIIZILJ = false;
        if (!(!this.LJJJI)) {
            s.LIZJ("useNode() called while inserting");
        }
        C13ZD c13zd = this.LJJIJ;
        Object objLJIIJJI = c13zd.LJIIJJI(c13zd.LJIIIIZZ);
        C13ZH c13zh = this.LJJIL;
        c13zh.LIZJ();
        c13zh.LJII.add(objLJIIJJI);
        if (this.LJJI && (objLJIIJJI instanceof InterfaceC20035413aK)) {
            C13ZH c13zh2 = this.LJJIL;
            c13zh2.LIZIZ();
            C13Z8 c13z8 = c13zh2.LIZIZ;
            c13z8.getClass();
            c13z8.LIZ.LIZJ(new C13ZK() { // from class: X.13a7
                @Override // X.C13ZK
                public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                    interfaceC20032213Zo.LJII();
                }
            });
        }
    }

    @Override // X.InterfaceC1680500tpg
    public final C13Z0 LJIILLIIL() {
        C20034813aE c20034813aE;
        C20029913Yr c20029913Yr;
        LJLIIIL(206, s.LJ);
        if (this.LJJJI) {
            C13ZE.LJIJJ(this.LJJIJIIJIL);
        }
        Object objLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        C20030313Yv c20030313Yv = null;
        if (!(objLJJLIIIJILLIZJL instanceof C20034813aE) || (c20034813aE = (C20034813aE) objLJJLIIIJILLIZJL) == null) {
            int i = this.LJJJIL;
            boolean z = this.LJIILLIIL;
            boolean z2 = this.LJJIIJ;
            C13Y2 c13y2 = this.LJII;
            if ((c13y2 instanceof C20029913Yr) && (c20029913Yr = (C20029913Yr) c13y2) != null) {
                c20030313Yv = c20029913Yr.LLJJIJI;
            }
            c20034813aE = new C20034813aE(new C13Z0(this, i, z, z2, c20030313Yv));
            LJLL(c20034813aE);
        }
        ((C13FE) c20034813aE.LL.LJFF).setValue(LJJJIL());
        LJJJJL(false);
        return c20034813aE.LL;
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJIL() {
        if (this.LJJI && this.LJJIJ.LJIIIIZZ == this.LJJIFFI) {
            this.LJJIFFI = -1;
            this.LJJI = false;
        }
        LJJJJL(false);
    }

    @Override // X.InterfaceC1680500tpg
    public final Object LJJ() {
        if (this.LJJJI) {
            if (!(!this.LJIIZILJ)) {
                s.LIZJ("A call to createNode(), emitNode() or useNode() expected");
            }
            InterfaceC1680500tpg.LIZ.getClass();
            return C1680510tph.LIZIZ;
        }
        Object objLJIIJ = this.LJJIJ.LJIIJ();
        if (!this.LJJI || (objLJIIJ instanceof InterfaceC20036013aQ)) {
            return objLJIIJ instanceof C20034913aF ? ((C20034913aF) objLJIIJ).LIZ : objLJIIJ;
        }
        InterfaceC1680500tpg.LIZ.getClass();
        return C1680510tph.LIZIZ;
    }

    @Override // X.InterfaceC1680500tpg
    public final CoroutineContext LJJIJ() {
        return this.LIZJ.LJIIIIZZ();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0tpj, X.13aC] */
    @Override // X.InterfaceC1680500tpg
    public final InterfaceC1680530tpj LJJIJIL() {
        C20034613aC c20034613aC = this.LJJJJ;
        if (c20034613aC != null) {
            return c20034613aC;
        }
        final C13Y2 c13y2 = this.LJII;
        ?? r1 = new InterfaceC1680530tpj(c13y2) { // from class: X.13aC
            public final InterfaceC20036713aX LL;

            public final int hashCode() {
                return this.LL.hashCode() * 31;
            }

            {
                this.LL = c13y2;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof C20034613aC) && Intrinsics.LJFF(this.LL, ((C20034613aC) obj).LL)) {
                    return true;
                }
                return false;
            }
        };
        this.LJJJJ = r1;
        return r1;
    }

    public final C13D2 LJJJIL() {
        C13D2 c13d2 = this.LJJIJL;
        return c13d2 != null ? c13d2 : LJJJJ(this.LJJIJ.LJIIIIZZ);
    }

    public final void LJJJJI() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.LIZJ.LJIIZILJ(this);
            this.LJJIIZ.clear();
            ((ArrayList) this.LJIJ).clear();
            this.LJFF.LIZ.LIZ();
            this.LJIJJLI = null;
            this.LIZIZ.clear();
            Trace.endSection();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Trace.endSection();
            throw th;
        }
    }

    public final void LJJJJJL() {
        this.LJJI = this.LJJIFFI >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20030013Ys LJJJJZI() {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJJJZI():X.13Ys");
    }

    public final void LJJJZ() {
        C13ZI c13zi = new C13ZI();
        if (this.LJJIIJ) {
            c13zi.LJ();
        }
        if (this.LIZJ.LIZLLL()) {
            c13zi.LLJIJIL = new C20029713Yp<>(6);
        }
        this.LJJIJIIJI = c13zi;
        C13ZE c13zeLJIIIIZZ = c13zi.LJIIIIZZ();
        c13zeLJIIIIZZ.LIZLLL(true);
        this.LJJIJIIJIL = c13zeLJIIIIZZ;
    }

    public final int LJJL() {
        return this.LJJJI ? -this.LJJIJIIJIL.LJIJJLI : this.LJJIJ.LJIIIIZZ;
    }

    public final C20030013Ys LJJLI() {
        ArrayList arrayList = this.LJJIIZ;
        if (this.LJJII == 0 && (!arrayList.isEmpty())) {
            return (C20030013Ys) ListProtector.get(arrayList, arrayList.size() - 1);
        }
        return null;
    }

    public final Object LJJLIIIJILLIZJL() {
        if (this.LJJJI) {
            if (!(!this.LJIIZILJ)) {
                s.LIZJ("A call to createNode(), emitNode() or useNode() expected");
            }
            InterfaceC1680500tpg.LIZ.getClass();
            return C1680510tph.LIZIZ;
        }
        Object objLJIIJ = this.LJJIJ.LJIIJ();
        if (!this.LJJI || (objLJIIJ instanceof InterfaceC20036013aQ)) {
            return objLJIIJ;
        }
        InterfaceC1680500tpg.LIZ.getClass();
        return C1680510tph.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJLJLI() {
        /*
            Method dump skipped, instruction units count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJLIIIJLJLI():void");
    }

    public final void LJJLIIIJLLLLLLLZ() {
        LJJLJ(this.LJJIJ.LJI);
        C13ZH c13zh = this.LJJIL;
        c13zh.LIZLLL(false);
        c13zh.LJ();
        c13zh.LIZIZ.LIZ.LIZJ(new C13ZK() { // from class: X.13a3
            @Override // X.C13ZK
            public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                s.LJIIIIZZ(c13ze, c13zg);
            }
        });
        int i = c13zh.LJFF;
        C13ZD c13zd = c13zh.LIZ.LJJIJ;
        c13zh.LJFF = i + C13ZA.LIZ(c13zd.LJI, c13zd.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZI() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJZZI():void");
    }

    public final void LJJZZIII() {
        C13ZD c13zd = this.LJJIJ;
        int i = c13zd.LJIIIIZZ;
        this.LJIIJJI = i >= 0 ? c13zd.LIZIZ[(i * 5) + 1] & 67108863 : 0;
        c13zd.LJIIZILJ();
    }

    public final void LJLIIL() {
        LJL(125, 1, null, null);
        this.LJIIZILJ = true;
    }

    @Override // X.InterfaceC1680500tpg
    public final C20030013Ys LJI() {
        return LJJLI();
    }

    @Override // X.InterfaceC1680500tpg
    public final C13D2 LJJIFFI() {
        return LJJJIL();
    }

    public final void LJJIZ() {
        LJJJI();
        this.LJIIIIZZ.clear();
        this.LJIILIIL.LIZIZ = 0;
        this.LJIJI.LIZIZ = 0;
        this.LJJ.LIZIZ = 0;
        this.LJIJJLI = null;
        C20034713aD c20034713aD = this.LJJJ;
        c20034713aD.LIZIZ.LIZ();
        c20034713aD.LIZ.LIZ();
        this.LJJJIL = 0;
        this.LJJII = 0;
        this.LJIIZILJ = false;
        this.LJJJI = false;
        this.LJJI = false;
        this.LJJIIZI = false;
        this.LJJIFFI = -1;
        C13ZD c13zd = this.LJJIJ;
        if (!c13zd.LJFF) {
            c13zd.LIZJ();
        }
        if (this.LJJIJIIJIL.LJIL) {
            return;
        }
        LJJJZ();
    }

    public final boolean LJJLIIIIJ() {
        C20030013Ys c20030013YsLJJLI;
        return (LIZ() && !this.LJIL && ((c20030013YsLJJLI = LJJLI()) == null || (c20030013YsLJJLI.LIZ & 4) == 0)) ? false : true;
    }

    @Override // X.InterfaceC1680500tpg
    public final InterfaceC20032213Zo<?> LJIIJJI() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1680500tpg
    public final int LJIILIIL() {
        return this.LJJJIL;
    }

    @Override // X.InterfaceC1680500tpg
    public final boolean LJJIIZ() {
        return this.LJJJI;
    }

    @Override // X.InterfaceC1680500tpg
    public final void LIZLLL(InterfaceC1675110tgz interfaceC1675110tgz) {
        C20030013Ys c20030013Ys;
        if ((interfaceC1675110tgz instanceof C20030013Ys) && (c20030013Ys = (C20030013Ys) interfaceC1675110tgz) != null) {
            c20030013Ys.LIZ |= 1;
        }
    }

    @Override // X.InterfaceC1680500tpg
    public final boolean LJII(Object obj) {
        if (LJJLIIIJILLIZJL() != obj) {
            LJLL(obj);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJIIIIZZ(boolean z) {
        if (this.LJIIJJI != 0) {
            s.LIZJ("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (!this.LJJJI) {
            if (!z) {
                LJJZZIII();
                return;
            }
            C13ZD c13zd = this.LJJIJ;
            int i = c13zd.LJI;
            int i2 = c13zd.LJII;
            C13ZH c13zh = this.LJJIL;
            c13zh.LIZLLL(false);
            c13zh.LIZIZ.LIZ.LIZJ(new C13ZK() { // from class: X.13Zz
                @Override // X.C13ZK
                public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                    s.LJ(c13ze, c13zg);
                }
            });
            s.LIZ(i, i2, this.LJIJ);
            this.LJJIJ.LJIIZILJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    @Override // X.InterfaceC1680500tpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C13ZC LJIIJ(int r5) {
        /*
            r4 = this;
            r4.LJJIIJZLJL(r5)
            boolean r0 = r4.LJJJI
            if (r0 == 0) goto L23
            X.13Ys r1 = new X.13Ys
            X.13Y2 r0 = r4.LJII
            X.13Yr r0 = (X.C20029913Yr) r0
            r1.<init>(r0)
            java.util.ArrayList r0 = r4.LJJIIZ
            r0.add(r1)
            r4.LJLL(r1)
            int r0 = r4.LJJIII
            r1.LJ = r0
            int r0 = r1.LIZ
            r0 = r0 & (-17)
            r1.LIZ = r0
        L22:
            return r4
        L23:
            java.util.List<X.13aG> r1 = r4.LJIJ
            X.13ZD r0 = r4.LJJIJ
            int r0 = r0.LJIIIIZZ
            int r0 = androidx.compose.runtime.s.LJI(r0, r1)
            if (r0 < 0) goto L97
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.remove(r1, r0)
        L33:
            X.13ZD r0 = r4.LJJIJ
            java.lang.Object r3 = r0.LJIIJ()
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L94
            X.13Ys r3 = new X.13Ys
            X.13Y2 r0 = r4.LJII
            X.13Yr r0 = (X.C20029913Yr) r0
            r3.<init>(r0)
            r4.LJLL(r3)
        L52:
            r2 = 0
            if (r1 != 0) goto L5f
            int r1 = r3.LIZ
            r0 = r1 & 64
            if (r0 == 0) goto L8d
            r0 = r1 & (-65)
            r3.LIZ = r0
        L5f:
            int r0 = r3.LIZ
            r0 = r0 | 8
            r3.LIZ = r0
        L65:
            java.util.ArrayList r0 = r4.LJJIIZ
            r0.add(r3)
            int r0 = r4.LJJIII
            r3.LJ = r0
            int r0 = r3.LIZ
            r1 = r0 & (-17)
            r3.LIZ = r1
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L22
            r0 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            r0 = r0 | 512(0x200, float:7.17E-43)
            r3.LIZ = r0
            X.13ZH r0 = r4.LJJIL
            X.13Z8 r0 = r0.LIZIZ
            X.13ZP r1 = r0.LIZ
            X.13Zr r0 = new X.C13ZK() { // from class: X.13Zr
                static {
                    /*
                        X.13Zr r0 = new X.13Zr
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.13Zr) X.13Zr.LIZJ X.13Zr
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20032513Zr.<clinit>():void");
                }

                {
                    /*
                        r2 = this;
                        r1 = 1
                        r0 = 0
                        r2.<init>(r0, r1, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20032513Zr.<init>():void");
                }

                @Override // X.C13ZK
                public final void LIZ(X.C20031413Zg r2, X.InterfaceC20032213Zo r3, X.C13ZE r4, X.C13ZG r5) {
                    /*
                        r1 = this;
                        r0 = 0
                        java.lang.Object r0 = r2.LIZIZ(r0)
                        X.13Ys r0 = (X.C20030013Ys) r0
                        X.C13ZG.LJIIIZ(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20032513Zr.LIZ(X.13Zg, X.13Zo, X.13ZE, X.13ZG):void");
                }
            }
            r1.LIZJ(r0)
            X.C20031913Zl.LIZ(r1, r2, r3)
            return r4
        L8d:
            int r0 = r3.LIZ
            r0 = r0 & (-9)
            r3.LIZ = r0
            goto L65
        L94:
            X.13Ys r3 = (X.C20030013Ys) r3
            goto L52
        L97:
            r1 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJIIJ(int):X.13ZC");
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJIILL(Object obj) {
        if (!this.LJJJI && this.LJJIJ.LJFF() == 207 && !Intrinsics.LJFF(this.LJJIJ.LJ(), obj) && this.LJJIFFI < 0) {
            this.LJJIFFI = this.LJJIJ.LJI;
            this.LJJI = true;
        }
        LJL(207, 0, null, obj);
    }

    @Override // X.InterfaceC1680500tpg
    public final boolean LJIIZILJ(boolean z) {
        Object objLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if ((objLJJLIIIJILLIZJL instanceof Boolean) && z == ((Boolean) objLJJLIIIJILLIZJL).booleanValue()) {
            return false;
        }
        LJLL(Boolean.valueOf(z));
        return true;
    }

    @Override // X.InterfaceC1680500tpg
    public final boolean LJIJ(float f) {
        Object objLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if ((objLJJLIIIJILLIZJL instanceof Float) && f == ((Number) objLJJLIIIJILLIZJL).floatValue()) {
            return false;
        }
        LJLL(Float.valueOf(f));
        return true;
    }

    @Override // X.InterfaceC1680500tpg
    public final boolean LJIJI(int i) {
        Object objLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if ((objLJJLIIIJILLIZJL instanceof Integer) && i == ((Number) objLJJLIIIJILLIZJL).intValue()) {
            return false;
        }
        LJLL(Integer.valueOf(i));
        return true;
    }

    @Override // X.InterfaceC1680500tpg
    public final boolean LJIJJ(long j) {
        Object objLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if ((objLJJLIIIJILLIZJL instanceof Long) && j == ((Number) objLJJLIIIJILLIZJL).longValue()) {
            return false;
        }
        LJLL(Long.valueOf(j));
        return true;
    }

    @Override // X.InterfaceC1680500tpg
    public final <T> void LJJI(Function0<? extends T> function0) {
        if (!this.LJIIZILJ) {
            s.LIZJ("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.LJIIZILJ = false;
        if (!this.LJJJI) {
            s.LIZJ("createNode() can only be called when inserting");
        }
        int i = this.LJIILIIL.LIZ[r0.LIZIZ - 1];
        C13ZE c13ze = this.LJJIJIIJIL;
        C13Z7 c13z7LIZIZ = c13ze.LIZIZ(c13ze.LJIJJLI);
        this.LJIIJJI++;
        C20034713aD c20034713aD = this.LJJJ;
        C13ZP c13zp = c20034713aD.LIZ;
        c13zp.LIZJ(new C13ZK() { // from class: X.13Zf
            @Override // X.C13ZK
            public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze2, C13ZG c13zg) {
                Object objInvoke = ((Function0) c20031413Zg.LIZIZ(0)).invoke();
                C13Z7 c13z7 = (C13Z7) c20031413Zg.LIZIZ(1);
                int iLIZ = c20031413Zg.LIZ(0);
                int iLJIIJ = c13z7.LIZ;
                if (iLJIIJ < 0) {
                    iLJIIJ += c13ze2.LJIIJ();
                }
                c13ze2.LJJJJJL(iLJIIJ, objInvoke);
                interfaceC20032213Zo.LJ(iLIZ, objInvoke);
                interfaceC20032213Zo.LJIIIIZZ(objInvoke);
            }
        });
        C20031913Zl.LIZ(c13zp, 0, function0);
        c13zp.LIZJ[c13zp.LIZLLL - c13zp.LIZ[c13zp.LIZIZ - 1].LIZ] = i;
        C20031913Zl.LIZ(c13zp, 1, c13z7LIZIZ);
        C13ZP c13zp2 = c20034713aD.LIZIZ;
        c13zp2.LIZJ(new C13ZK() { // from class: X.13Zk
            @Override // X.C13ZK
            public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze2, C13ZG c13zg) {
                C13Z7 c13z7 = (C13Z7) c20031413Zg.LIZIZ(0);
                int iLIZ = c20031413Zg.LIZ(0);
                interfaceC20032213Zo.LJFF();
                int iLJIIJ = c13z7.LIZ;
                if (iLJIIJ < 0) {
                    iLJIIJ += c13ze2.LJIIJ();
                }
                interfaceC20032213Zo.LIZJ(iLIZ, c13ze2.LJJIFFI(iLJIIJ));
            }
        });
        c13zp2.LIZJ[c13zp2.LIZLLL - c13zp2.LIZ[c13zp2.LIZIZ - 1].LIZ] = i;
        C20031913Zl.LIZ(c13zp2, 0, c13z7LIZIZ);
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJJII(Function0<Unit> function0) {
        C13ZP c13zp = this.LJJIL.LIZIZ.LIZ;
        c13zp.LIZJ(new C13ZK() { // from class: X.13a5
            @Override // X.C13ZK
            public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                c13zg.LJIIIIZZ((Function0) c20031413Zg.LIZIZ(0));
            }
        });
        C20031913Zl.LIZ(c13zp, 0, function0);
    }

    @Override // X.InterfaceC1680500tpg
    public final boolean LJJIIJ(Object obj) {
        if (!Intrinsics.LJFF(LJJLIIIJILLIZJL(), obj)) {
            LJLL(obj);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJJIIJZLJL(int i) {
        int i2;
        if (this.LJIIIZ != null) {
            LJL(i, 0, null, null);
            return;
        }
        if (!(!this.LJIIZILJ)) {
            s.LIZJ("A call to createNode(), emitNode() or useNode() expected");
        }
        this.LJJJIL = this.LJIIL ^ Integer.rotateLeft(Integer.rotateLeft(this.LJJJIL, 3) ^ i, 3);
        this.LJIIL++;
        C13ZD c13zd = this.LJJIJ;
        if (this.LJJJI) {
            c13zd.LJIIJ++;
            C13ZE c13ze = this.LJJIJIIJIL;
            InterfaceC1680500tpg.LIZ.getClass();
            c13ze.LJJJI(i, C1680510tph.LIZIZ);
            LJJJLZIJ(false, null);
            return;
        }
        if (c13zd.LJFF() != i || ((i2 = c13zd.LJI) < c13zd.LJII && (c13zd.LIZIZ[(i2 * 5) + 1] & 536870912) != 0)) {
            if (c13zd.LJIIJ <= 0 && c13zd.LJI != c13zd.LJII) {
                int i3 = this.LJIIJ;
                int i4 = c13zd.LJI;
                LJJLIIIJLLLLLLLZ();
                this.LJJIL.LJFF(i3, c13zd.LJIILLIIL());
                s.LIZ(i4, c13zd.LJI, this.LJIJ);
            }
            c13zd.LJIIJ++;
            this.LJJJI = true;
            this.LJJIJL = null;
            if (this.LJJIJIIJIL.LJIL) {
                C13ZE c13zeLJIIIIZZ = this.LJJIJIIJI.LJIIIIZZ();
                this.LJJIJIIJIL = c13zeLJIIIIZZ;
                c13zeLJIIIIZZ.LJJIJIL();
                this.LJJIJIL = false;
                this.LJJIJL = null;
            }
            C13ZE c13ze2 = this.LJJIJIIJIL;
            c13ze2.LIZJ();
            int i5 = c13ze2.LJIJI;
            InterfaceC1680500tpg.LIZ.getClass();
            c13ze2.LJJJI(i, C1680510tph.LIZIZ);
            this.LJJIZ = c13ze2.LIZIZ(i5);
            LJJJLZIJ(false, null);
            return;
        }
        c13zd.LJIJ();
        LJJJLZIJ(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    @Override // X.InterfaceC1680500tpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.InterfaceC20035313aJ
            if (r0 == 0) goto L71
            X.13aF r3 = new X.13aF
            r6 = r8
            X.13aJ r6 = (X.InterfaceC20035313aJ) r6
            boolean r0 = r7.LJJJI
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L32
            X.13ZE r1 = r7.LJJIJIIJIL
            int r5 = r1.LJIJI
            int r0 = r1.LJIJJLI
            int r0 = r0 + 1
            if (r5 <= r0) goto L50
            int r5 = r5 - r2
            int r0 = r1.LJJIII(r5)
        L1e:
            r2 = r5
            r5 = r0
            X.13ZE r1 = r7.LJJIJIIJIL
            int r0 = r1.LJIJJLI
            if (r5 == r0) goto L2d
            if (r5 < 0) goto L2d
            int r0 = r1.LJJIII(r5)
            goto L1e
        L2d:
            X.13Z7 r0 = r1.LIZIZ(r2)
            goto L56
        L32:
            X.13ZD r1 = r7.LJJIJ
            int r5 = r1.LJI
            int r0 = r1.LJIIIIZZ
            int r0 = r0 + 1
            if (r5 <= r0) goto L50
            int r5 = r5 - r2
            int r0 = r1.LJIILJJIL(r5)
        L41:
            r2 = r5
            r5 = r0
            X.13ZD r1 = r7.LJJIJ
            int r0 = r1.LJIIIIZZ
            if (r5 == r0) goto L52
            if (r5 < 0) goto L52
            int r0 = r1.LJIILJJIL(r5)
            goto L41
        L50:
            r0 = 0
            goto L56
        L52:
            X.13Z7 r0 = r1.LIZ(r2)
        L56:
            r3.<init>(r6, r0)
            boolean r0 = r7.LJJJI
            if (r0 == 0) goto L6b
            X.13ZH r0 = r7.LJJIL
            X.13Z8 r0 = r0.LIZIZ
            X.13ZP r1 = r0.LIZ
            X.13Zw r0 = new X.C13ZK() { // from class: X.13Zw
                static {
                    /*
                        X.13Zw r0 = new X.13Zw
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.13Zw) X.13Zw.LIZJ X.13Zw
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20033013Zw.<clinit>():void");
                }

                {
                    /*
                        r2 = this;
                        r1 = 1
                        r0 = 0
                        r2.<init>(r0, r1, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20033013Zw.<init>():void");
                }

                @Override // X.C13ZK
                public final void LIZ(X.C20031413Zg r2, X.InterfaceC20032213Zo r3, X.C13ZE r4, X.C13ZG r5) {
                    /*
                        r1 = this;
                        r0 = 0
                        java.lang.Object r0 = r2.LIZIZ(r0)
                        X.13aF r0 = (X.C20034913aF) r0
                        r5.LJII(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20033013Zw.LIZ(X.13Zg, X.13Zo, X.13ZE, X.13ZG):void");
                }
            }
            r1.LIZJ(r0)
            X.C20031913Zl.LIZ(r1, r4, r3)
        L6b:
            java.util.Set<X.13aJ> r0 = r7.LJ
            r0.add(r8)
            r8 = r3
        L71:
            r7.LJLL(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJIJIIJI(java.lang.Object):void");
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJJIJIIJIL(int i) {
        LJL(i, 0, null, null);
    }

    @Override // X.InterfaceC1680500tpg
    public final Object LJJIL(C13DN c13dn) {
        return C19973413Cy.LIZ(LJJJIL(), c13dn);
    }

    public final C13D2 LJJJJ(int i) {
        C13D2 c13d2LIZIZ;
        if (this.LJJJI && this.LJJIJIL) {
            int iLJJIII = this.LJJIJIIJIL.LJIJJLI;
            while (iLJJIII > 0) {
                C13ZE c13ze = this.LJJIJIIJIL;
                if (c13ze.LIZIZ[c13ze.LJIILIIL(iLJJIII) * 5] == 202 && Intrinsics.LJFF(this.LJJIJIIJIL.LJIILJJIL(iLJJIII), s.LIZJ)) {
                    C13D2 c13d2 = (C13D2) this.LJJIJIIJIL.LJIIL(iLJJIII);
                    this.LJJIJL = c13d2;
                    return c13d2;
                }
                iLJJIII = this.LJJIJIIJIL.LJJIII(iLJJIII);
            }
        }
        if (this.LJJIJ.LIZJ > 0) {
            while (i > 0) {
                C13ZD c13zd = this.LJJIJ;
                if (c13zd.LIZIZ[i * 5] == 202 && Intrinsics.LJFF(c13zd.LJII(i), s.LIZJ)) {
                    C20029713Yp<C13D2> c20029713Yp = this.LJIJJLI;
                    if (c20029713Yp == null || (c13d2LIZIZ = c20029713Yp.LIZIZ(i)) == null) {
                        C13ZD c13zd2 = this.LJJIJ;
                        c13d2LIZIZ = (C13D2) c13zd2.LIZIZ(i, c13zd2.LIZIZ);
                    }
                    this.LJJIJL = c13d2LIZIZ;
                    return c13d2LIZIZ;
                }
                i = this.LJJIJ.LJIILJJIL(i);
            }
        }
        C13D2 c13d22 = this.LJIJJ;
        this.LJJIJL = c13d22;
        return c13d22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0241  */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJL(boolean r32) {
        /*
            Method dump skipped, instruction units count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJJJL(boolean):void");
    }

    public final void LJJJLL(int i) {
        if (i < 0) {
            int i2 = -i;
            C13ZE c13ze = this.LJJIJIIJIL;
            while (true) {
                int i3 = c13ze.LJIJJLI;
                if (i3 > i2) {
                    LJJJJL(c13ze.LJIJI(i3));
                } else {
                    return;
                }
            }
        } else {
            if (this.LJJJI) {
                C13ZE c13ze2 = this.LJJIJIIJIL;
                while (this.LJJJI) {
                    LJJJJL(c13ze2.LJIJI(c13ze2.LJIJJLI));
                }
            }
            C13ZD c13zd = this.LJJIJ;
            while (true) {
                int i4 = c13zd.LJIIIIZZ;
                if (i4 > i) {
                    LJJJJL(c13zd.LJIIIZ(i4));
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0225, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0226, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022a, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022c, code lost:
    
        r24.LJJIJ = r7;
        r24.LJIILJJIL = r22;
        r24.LJIJJLI = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0234, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0235, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0236, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023c, code lost:
    
        r13.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x023f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0240, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0241, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0245, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0247, code lost:
    
        r5.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        if (r7 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        r2 = r7.LIZ;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        if ((!r2.LLIZ) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        androidx.compose.runtime.s.LIZJ("use active SlotWriter to create an anchor location instead");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r2.LLILLJJLI > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        X.C13D4.LIZ("Parameter index is out of range");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
    
        r5 = r2.LLJ;
        r1 = X.C13ZA.LJ(r5, 0, r2.LLILLJJLI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r1 >= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        r2 = new X.C13Z7(0);
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r5, -(r1 + 1), r2);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        r2 = (X.C13Z7) com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r1);
        r3 = r3;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        if (r2 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:
    
        r2 = r0.LJ;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f4, code lost:
    
        r6 = new java.util.ArrayList();
        r5 = r3.LJFF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        androidx.compose.runtime.s.LIZIZ(r5, r6, r3.LIZJ(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
    
        r5.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        if ((!r6.isEmpty()) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
    
        r5 = r24.LJJIL.LIZIZ;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
    
        if ((!r6.isEmpty()) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
    
        r13 = r5.LIZ;
        r13.LIZJ(X.C20031713Zj.LIZJ);
        X.C20031913Zl.LIZIZ(r13, 1, r6, 0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0132, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r14.LIZLLL, r24.LIZLLL) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
    
        r5 = r24.LIZLLL.LIZJ(r4);
        LJLJL(r5, LJLLI(r5) + r6.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0146, code lost:
    
        r1 = r24.LJJIL;
        r6 = r24.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014a, code lost:
    
        r4 = r1.LIZIZ.LIZ;
        r4.LIZJ(X.C13ZL.LIZJ);
        r5 = r4.LJFF;
        r13 = r4.LIZ;
        r5 = r5 - r13[r4.LIZIZ - 1].LIZIZ;
        r4 = r4.LJ;
        r4[r5] = r7;
        r4[r5 + 1] = r6;
        r4[r5 + 3] = r14;
        r4[r5 + 2] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0170, code lost:
    
        r13 = r3.LJFF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0174, code lost:
    
        r7 = r24.LJJIJ;
        r22 = r24.LJIILJJIL;
        r6 = r24.LJIJJLI;
        r24.LJIILJJIL = null;
        r24.LJIJJLI = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0181, code lost:
    
        r24.LJJIJ = r13;
        r2 = r3.LIZJ(r2);
        r13.LJIILL(r2);
        r24.LJJIL.LJFF = r2;
        r5 = new X.C13Z8();
        r4 = r24.LJJIL;
        r3 = r4.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0197, code lost:
    
        r4.LIZIZ = r5;
        r2 = r4.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019c, code lost:
    
        r4.LJ = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b6, code lost:
    
        LJJLIIIJL(r0.LIZJ, r14.LIZJ, java.lang.Integer.valueOf(r13.LJI), r0.LJFF, new kotlin.jvm.internal.AwS431S0200000_30(r24, r14, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c3, code lost:
    
        r4.LJ = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c5, code lost:
    
        r4.LIZIZ = r3;
        r1 = r24.LJJIL.LIZIZ;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d2, code lost:
    
        if (r5.LIZ.LIZIZ == 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d4, code lost:
    
        r2 = r1.LIZ;
        r2.LIZJ(X.C20032013Zm.LIZJ);
        X.C20031913Zl.LIZIZ(r2, 0, r5, 1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e0, code lost:
    
        r24.LJJIJ = r7;
        r24.LJIILJJIL = r22;
        r24.LJIJJLI = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e8, code lost:
    
        r13.LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0203, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0205, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0207, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0209, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0211, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0212, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0216, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0218, code lost:
    
        r4.LJ = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x021a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x021b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021c, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0220, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0222, code lost:
    
        r4.LIZIZ = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0224, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.13ZK[]] */
    /* JADX WARN: Type inference failed for: r13v2, types: [X.13ZD] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13ZI] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.13Z8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13ZH] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13Z1] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.13Yp<X.13D2>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13Z6] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.13ZD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJ(java.util.List<kotlin.Pair<X.C13Z3, X.C13Z3>> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJLIIIJ(java.util.List):void");
    }

    public final int LJJLIIIJJI(int i) {
        int iLJIILJJIL = this.LJJIJ.LJIILJJIL(i) + 1;
        int i2 = 0;
        while (iLJIILJJIL < i) {
            C13ZD c13zd = this.LJJIJ;
            if ((c13zd.LIZIZ[(iLJIILJJIL * 5) + 1] & 536870912) == 0) {
                i2++;
            }
            iLJIILJJIL += c13zd.LJIIIIZZ(iLJIILJJIL);
        }
        return i2;
    }

    public final boolean LJJLIIIJJIZ(C19991913Kb c19991913Kb) {
        if (!this.LJFF.LIZIZ()) {
            s.LIZJ("Expected applyChanges() to have been called");
        }
        if (c19991913Kb.LJ <= 0 && !(!((ArrayList) this.LJIJ).isEmpty())) {
            return false;
        }
        try {
            LJJJJIZL(c19991913Kb, null);
            if (this.LJFF.LIZ.LIZIZ == 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public final void LJJLIIJ(C13D2 c13d2) {
        C20029713Yp<C13D2> c20029713Yp = this.LJIJJLI;
        if (c20029713Yp == null) {
            c20029713Yp = new C20029713Yp<>(6);
            this.LJIJJLI = c20029713Yp;
        }
        c20029713Yp.LJII(this.LJJIJ.LJI, c13d2);
    }

    public final void LJJLJ(int i) {
        boolean zLJIIIZ = this.LJJIJ.LJIIIZ(i);
        if (zLJIIIZ) {
            this.LJJIL.LIZJ();
            C13ZH c13zh = this.LJJIL;
            Object objLJIIJJI = this.LJJIJ.LJIIJJI(i);
            c13zh.LIZJ();
            c13zh.LJII.add(objLJIIJJI);
        }
        LJJZ(this, i, i, zLJIIIZ, 0);
        this.LJJIL.LIZJ();
        if (zLJIIIZ) {
            this.LJJIL.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIL(X.C13DO<?> r10) {
        /*
            r9 = this;
            X.13D2 r4 = r9.LJJJIL()
            X.0yeB r1 = androidx.compose.runtime.s.LIZIZ
            r0 = 201(0xc9, float:2.82E-43)
            r9.LJLIIIL(r0, r1)
            java.lang.Object r1 = r9.LJJ()
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L95
            r1 = 0
        L1d:
            X.13Cz<T> r7 = r10.LIZ
            X.13Cx r6 = r7.LIZIZ(r10, r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r1)
            r5 = 1
            r8 = r0 ^ 1
            if (r8 == 0) goto L2f
            r9.LJJIJIIJI(r6)
        L2f:
            boolean r0 = r9.LJJJI
            r3 = 0
            if (r0 == 0) goto L58
            boolean r0 = r10.LJII
            if (r0 != 0) goto L3e
            boolean r0 = r4.containsKey(r7)
            if (r0 != 0) goto L42
        L3e:
            X.13Cj r4 = r4.LJIJI(r7, r6)
        L42:
            r9.LJJIJIL = r5
        L44:
            r5 = 0
        L45:
            X.13aB r1 = r9.LJJ
            boolean r0 = r9.LJIL
            r1.LIZIZ(r0)
            r9.LJIL = r5
            r9.LJJIJL = r4
            X.0yeB r1 = androidx.compose.runtime.s.LIZJ
            r0 = 202(0xca, float:2.83E-43)
            r9.LJL(r0, r3, r1, r4)
            return
        L58:
            X.13ZD r2 = r9.LJJIJ
            int r1 = r2.LJI
            int[] r0 = r2.LIZIZ
            java.lang.Object r1 = r2.LIZIZ(r1, r0)
            X.13D2 r1 = (X.C13D2) r1
            boolean r0 = r9.LIZ()
            if (r0 == 0) goto L6c
            if (r8 == 0) goto L78
        L6c:
            boolean r0 = r10.LJII
            if (r0 != 0) goto L90
            boolean r0 = r4.containsKey(r7)
            if (r0 == 0) goto L90
            if (r8 != 0) goto L8b
        L78:
            boolean r0 = r9.LJIL
            if (r0 != 0) goto L8b
        L7c:
            r4 = r1
        L7d:
            boolean r0 = r9.LJJI
            if (r0 != 0) goto L83
            if (r1 == r4) goto L44
        L83:
            boolean r0 = r9.LJJJI
            if (r0 != 0) goto L45
            r9.LJJLIIJ(r4)
            goto L45
        L8b:
            boolean r0 = r9.LJIL
            if (r0 == 0) goto L7c
            goto L7d
        L90:
            X.13Cj r4 = r4.LJIJI(r7, r6)
            goto L7d
        L95:
            X.13Cx r1 = (X.InterfaceC19973313Cx) r1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJLIL(X.13DO):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJLILLLLZI(C13DO<?>[] c13doArr) {
        C13D2 c13d2LJLJLLL;
        C13D2 c13d2LJJJIL = LJJJIL();
        LJLIIIL(201, s.LIZIZ);
        boolean z = true;
        if (this.LJJJI) {
            c13d2LJLJLLL = LJLJLLL(c13d2LJJJIL, C19973413Cy.LIZIZ(c13doArr, c13d2LJJJIL, C19971913Cj.LLILZIL));
            this.LJJIJIL = true;
        } else {
            C13ZD c13zd = this.LJJIJ;
            C13D2 c13d2 = (C13D2) c13zd.LJI(c13zd.LJI, 0);
            C13ZD c13zd2 = this.LJJIJ;
            C13D2 c13d22 = (C13D2) c13zd2.LJI(c13zd2.LJI, 1);
            C13D2 c13d2LIZIZ = C19973413Cy.LIZIZ(c13doArr, c13d2LJJJIL, c13d22);
            if (LIZ() && !this.LJJI && Intrinsics.LJFF(c13d22, c13d2LIZIZ)) {
                this.LJIIJJI += this.LJJIJ.LJIILLIIL();
                c13d2LJLJLLL = c13d2;
            } else {
                c13d2LJLJLLL = LJLJLLL(c13d2LJJJIL, c13d2LIZIZ);
                if (this.LJJI || !Intrinsics.LJFF(c13d2LJLJLLL, c13d2)) {
                    if (!this.LJJJI) {
                        LJJLIIJ(c13d2LJLJLLL);
                    }
                }
                this.LJJ.LIZIZ(this.LJIL ? 1 : 0);
                this.LJIL = z;
                this.LJJIJL = c13d2LJLJLLL;
                LJL(202, 0, s.LIZJ, c13d2LJLJLLL);
            }
        }
        z = false;
        this.LJJ.LIZIZ(this.LJIL ? 1 : 0);
        this.LJIL = z;
        this.LJJIJL = c13d2LJLJLLL;
        LJL(202, 0, s.LIZJ, c13d2LJLJLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJLL(X.C19991913Kb<java.lang.Object, java.lang.Object> r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.Object[] r12 = r0.LIZIZ
            java.lang.Object[] r11 = r0.LIZJ
            long[] r10 = r0.LIZ
            int r0 = r10.length
            int r9 = r0 + (-2)
            r13 = r16
            if (r9 < 0) goto L60
            r8 = 0
        L10:
            r5 = r10[r8]
            long r0 = ~r5
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r5
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r3
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L5b
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r7 = 0
        L2a:
            if (r7 >= r14) goto L59
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L55
            int r0 = r8 << 3
            int r0 = r0 + r7
            r4 = r12[r0]
            r3 = r11[r0]
            X.13Ys r4 = (X.C20030013Ys) r4
            X.13Z7 r0 = r4.LIZJ
            if (r0 == 0) goto L55
            int r2 = r0.LIZ
            java.util.List<X.13aG> r1 = r13.LJIJ
            X.13Yx r0 = X.C20030513Yx.LIZ
            if (r3 != r0) goto L4b
            r3 = 0
        L4b:
            X.13aG r0 = new X.13aG
            r0.<init>(r4, r2, r3)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
        L55:
            long r5 = r5 >> r15
            int r7 = r7 + 1
            goto L2a
        L59:
            if (r14 != r15) goto L60
        L5b:
            if (r8 == r9) goto L60
            int r8 = r8 + 1
            goto L10
        L60:
            java.util.List<X.13aG> r1 = r13.LJIJ
            Y.AComparatorS49S0000000_30 r0 = androidx.compose.runtime.s.LJFF
            X.C08XD.LJJ(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJLJJLL(X.13Kb):void");
    }

    public final void LJLL(Object obj) {
        if (this.LJJJI) {
            this.LJJIJIIJIL.LJJJJI(obj);
            return;
        }
        C13ZD c13zd = this.LJJIJ;
        if (c13zd.LJIILIIL) {
            int iLIZJ = (c13zd.LJIIJJI - C13ZA.LIZJ(c13zd.LJIIIIZZ, c13zd.LIZIZ)) - 1;
            C13ZH c13zh = this.LJJIL;
            if (c13zh.LIZ.LJJIJ.LJIIIIZZ - c13zh.LJFF < 0) {
                C13ZD c13zd2 = this.LJJIJ;
                C13Z7 c13z7LIZ = c13zd2.LIZ(c13zd2.LJIIIIZZ);
                C13ZP c13zp = c13zh.LIZIZ.LIZ;
                c13zp.LIZJ(new C13ZK() { // from class: X.13ZU
                    @Override // X.C13ZK
                    public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                        int iLJIIJ;
                        int iLJIIJJI;
                        Object objLIZIZ = c20031413Zg.LIZIZ(0);
                        C13Z7 c13z7 = (C13Z7) c20031413Zg.LIZIZ(1);
                        int iLIZ = c20031413Zg.LIZ(0);
                        if (objLIZIZ instanceof C20034913aF) {
                            c13zg.LJII((C20034913aF) objLIZIZ);
                        }
                        int iLJIIJ2 = c13z7.LIZ;
                        if (iLJIIJ2 < 0) {
                            iLJIIJ2 += c13ze.LJIIJ();
                        }
                        int iLJFF = c13ze.LJFF(c13ze.LJJIJLIJ(iLJIIJ2, iLIZ));
                        Object[] objArr = c13ze.LIZJ;
                        Object obj2 = objArr[iLJFF];
                        objArr[iLJFF] = objLIZIZ;
                        if (obj2 instanceof C20034913aF) {
                            int iLJIIJJI2 = c13ze.LJIIJJI() - c13ze.LJJIJLIJ(iLJIIJ2, iLIZ);
                            C20034913aF c20034913aF = (C20034913aF) obj2;
                            C13Z7 c13z72 = c20034913aF.LIZIZ;
                            if (c13z72 != null && c13z72.LIZ()) {
                                iLJIIJ = c13z72.LIZ;
                                if (iLJIIJ < 0) {
                                    iLJIIJ += c13ze.LJIIJ();
                                }
                                iLJIIJJI = c13ze.LJIIJJI() - c13ze.LJJIL(iLJIIJ);
                            } else {
                                iLJIIJ = -1;
                                iLJIIJJI = -1;
                            }
                            c13zg.LJFF(iLJIIJJI2, iLJIIJ, iLJIIJJI, c20034913aF);
                            return;
                        }
                        if (!(obj2 instanceof C20030013Ys)) {
                            return;
                        }
                        ((C20030013Ys) obj2).LIZJ();
                    }
                });
                C20031913Zl.LIZIZ(c13zp, 0, obj, 1, c13z7LIZ);
                c13zp.LIZJ[c13zp.LIZLLL - c13zp.LIZ[c13zp.LIZIZ - 1].LIZ] = iLIZJ;
                return;
            }
            c13zh.LIZLLL(true);
            C13ZP c13zp2 = c13zh.LIZIZ.LIZ;
            c13zp2.LIZJ(new C13ZK() { // from class: X.13ZZ
                @Override // X.C13ZK
                public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                    Object objLIZIZ = c20031413Zg.LIZIZ(0);
                    int iLIZ = c20031413Zg.LIZ(0);
                    if (objLIZIZ instanceof C20034913aF) {
                        c13zg.LJII((C20034913aF) objLIZIZ);
                    }
                    int iLJFF = c13ze.LJFF(c13ze.LJJIJLIJ(c13ze.LJIJI, iLIZ));
                    Object[] objArr = c13ze.LIZJ;
                    Object obj2 = objArr[iLJFF];
                    objArr[iLJFF] = objLIZIZ;
                    if (obj2 instanceof C20034913aF) {
                        c13zg.LJFF(c13ze.LJIIJJI() - c13ze.LJJIJLIJ(c13ze.LJIJI, iLIZ), -1, -1, obj2);
                    } else {
                        if (!(obj2 instanceof C20030013Ys)) {
                            return;
                        }
                        ((C20030013Ys) obj2).LIZJ();
                    }
                }
            });
            C20031913Zl.LIZ(c13zp2, 0, obj);
            c13zp2.LIZJ[c13zp2.LIZLLL - c13zp2.LIZ[c13zp2.LIZIZ - 1].LIZ] = iLIZJ;
            return;
        }
        C13ZH c13zh2 = this.LJJIL;
        C13Z7 c13z7LIZ2 = c13zd.LIZ(c13zd.LJIIIIZZ);
        C13ZP c13zp3 = c13zh2.LIZIZ.LIZ;
        c13zp3.LIZJ(new C13ZK() { // from class: X.13ZW
            @Override // X.C13ZK
            public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                C13Z7 c13z7 = (C13Z7) c20031413Zg.LIZIZ(0);
                Object objLIZIZ = c20031413Zg.LIZIZ(1);
                if (objLIZIZ instanceof C20034913aF) {
                    c13zg.LJII((C20034913aF) objLIZIZ);
                }
                if (c13ze.LJIILIIL != 0) {
                    s.LIZJ("Can only append a slot if not current inserting");
                }
                int i = c13ze.LJIIIIZZ;
                int i2 = c13ze.LJIIIZ;
                int iLJIIJ = c13z7.LIZ;
                if (iLJIIJ < 0) {
                    iLJIIJ += c13ze.LJIIJ();
                }
                int iLJ = c13ze.LJ(c13ze.LJIILIIL(iLJIIJ + 1), c13ze.LIZIZ);
                c13ze.LJIIIIZZ = iLJ;
                c13ze.LJIIIZ = iLJ;
                c13ze.LJIJ(1, iLJIIJ);
                if (i >= iLJ) {
                    i++;
                    i2++;
                }
                c13ze.LIZJ[iLJ] = objLIZIZ;
                c13ze.LJIIIIZZ = i;
                c13ze.LJIIIZ = i2;
            }
        });
        C20031913Zl.LIZIZ(c13zp3, 0, c13z7LIZ2, 1, obj);
    }

    public final int LJLLI(int i) {
        int i2;
        if (i < 0) {
            C13ZX c13zx = this.LJIILL;
            if (c13zx == null || c13zx.LIZ(i) < 0) {
                return 0;
            }
            int iLIZ = c13zx.LIZ(i);
            if (iLIZ >= 0) {
                return c13zx.LIZJ[iLIZ];
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot find value for key ");
            sbLIZ.append(i);
            throw new NoSuchElementException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int[] iArr = this.LJIILJJIL;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.LJJIJ.LJIIL(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C13Z3 LJJLJLI(X.C13ZC r14, int r15) {
        /*
            X.13ZD r1 = r14.LJJIJ
            int[] r0 = r1.LIZIZ
            r4 = r15
            int r3 = r4 * 5
            r2 = r0[r3]
            java.lang.Object r1 = r1.LJII(r4)
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r7 = 0
            if (r2 != r0) goto Lac
            boolean r0 = r1 instanceof X.C20035813aO
            if (r0 == 0) goto Lac
            X.13ZD r0 = r14.LJJIJ
            int[] r1 = r0.LIZIZ
            r2 = 1
            int r0 = r3 + 1
            r1 = r1[r0]
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            r5 = 0
            if (r1 == 0) goto L79
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            LJJLL(r4, r14, r15)
            boolean r0 = r15.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L79
        L35:
            X.13ZD r0 = r14.LJJIJ
            java.lang.Object r8 = r0.LJII(r4)
            X.13aO r8 = (X.C20035813aO) r8
            X.13ZD r0 = r14.LJJIJ
            java.lang.Object r9 = r0.LJI(r4, r5)
            X.13ZD r0 = r14.LJJIJ
            X.13Z7 r12 = r0.LIZ(r4)
            X.13ZD r0 = r14.LJJIJ
            int r7 = r0.LJIIIIZZ(r4)
            int r7 = r7 + r4
            java.util.List<X.13aG> r3 = r14.LJIJ
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r2 = androidx.compose.runtime.s.LJI(r4, r3)
            if (r2 >= 0) goto L60
            int r0 = r2 + 1
            int r2 = -r0
        L60:
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r2 >= r0) goto L7b
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)
            X.13aG r1 = (X.C20035013aG) r1
            int r0 = r1.LIZIZ
            if (r0 >= r7) goto L7b
            r6.add(r1)
            int r2 = r2 + 1
            goto L60
        L79:
            r15 = r7
            goto L35
        L7b:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r6.size()
            r13.<init>(r0)
            int r3 = r6.size()
        L88:
            if (r5 >= r3) goto L9f
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r5)
            X.13aG r0 = (X.C20035013aG) r0
            X.13Ys r2 = r0.LIZ
            java.lang.Object r1 = r0.LIZJ
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            r13.add(r0)
            int r5 = r5 + 1
            goto L88
        L9f:
            X.13Z3 r7 = new X.13Z3
            X.13Y2 r10 = r14.LJII
            X.13ZI r11 = r14.LIZLLL
            X.13D2 r14 = r14.LJJJJ(r4)
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
        Lac:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJLJLI(X.13ZC, int):X.13Z3");
    }

    @Override // X.InterfaceC1680500tpg
    public final <V, T> void LIZIZ(V v, Function2<? super T, ? super V, Unit> function2) {
        if (this.LJJJI) {
            C13ZP c13zp = this.LJJJ.LIZ;
            c13zp.LIZJ(new C13ZK() { // from class: X.13Zs
                @Override // X.C13ZK
                public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                    interfaceC20032213Zo.LIZIZ(c20031413Zg.LIZIZ(0), (Function2) c20031413Zg.LIZIZ(1));
                }
            });
            C20031913Zl.LIZ(c13zp, 0, v);
            C19719512Dh.LJ(2, function2);
            C20031913Zl.LIZ(c13zp, 1, function2);
            return;
        }
        C13ZH c13zh = this.LJJIL;
        c13zh.LIZIZ();
        C13ZP c13zp2 = c13zh.LIZIZ.LIZ;
        c13zp2.LIZJ(new C13ZK() { // from class: X.13Zs
            @Override // X.C13ZK
            public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                interfaceC20032213Zo.LIZIZ(c20031413Zg.LIZIZ(0), (Function2) c20031413Zg.LIZIZ(1));
            }
        });
        C19719512Dh.LJ(2, function2);
        C20031913Zl.LIZIZ(c13zp2, 0, v, 1, function2);
    }

    @Override // X.InterfaceC1680500tpg
    public final void LJIIL(int i, Object obj) {
        LJL(i, 0, obj, null);
    }

    @Override // X.InterfaceC1680500tpg
    public final boolean LJIJJLI(int i, boolean z) {
        if (((i & 1) == 0 && (this.LJJJI || this.LJJI)) || z || !LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1680500tpg
    public final Object LJJIIZI(Object obj, Object obj2) {
        Object objLJIILIIL;
        C13ZD c13zd = this.LJJIJ;
        int i = c13zd.LJI;
        if (i < c13zd.LJII) {
            objLJIILIIL = c13zd.LJIILIIL(i, c13zd.LIZIZ);
        } else {
            objLJIILIIL = null;
        }
        Object objLJII = s.LJII(objLJIILIIL, obj, obj2);
        if (objLJII == null) {
            return new C20034413aA(obj, obj2);
        }
        return objLJII;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #1 {all -> 0x00a7, blocks: (B:12:0x0044, B:14:0x004c, B:15:0x005b, B:18:0x0061, B:20:0x006e, B:21:0x0082), top: B:45:0x0044, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJIZL(X.C19991913Kb r10, X.C19719212De r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJJJIZL(X.13Kb, X.12De):void");
    }

    public final void LJJJJJ(int i, int i2) {
        if (i > 0 && i != i2) {
            LJJJJJ(this.LJJIJ.LJIILJJIL(i), i2);
            if (this.LJJIJ.LJIIIZ(i)) {
                C13ZH c13zh = this.LJJIL;
                Object objLJIIJJI = this.LJJIJ.LJIIJJI(i);
                c13zh.LIZJ();
                c13zh.LJII.add(objLJIIJJI);
            }
        }
    }

    public final void LJJJLZIJ(boolean z, C13ZM c13zm) {
        this.LJIIIIZZ.add(this.LJIIIZ);
        this.LJIIIZ = c13zm;
        this.LJIILIIL.LIZIZ(this.LJIIJJI);
        this.LJIILIIL.LIZIZ(this.LJIIL);
        this.LJIILIIL.LIZIZ(this.LJIIJ);
        if (z) {
            this.LJIIJ = 0;
        }
        this.LJIIJJI = 0;
        this.LJIIL = 0;
    }

    public final void LJLIIIL(int i, C1865570yeB c1865570yeB) {
        LJL(i, 0, c1865570yeB, null);
    }

    public final void LJLJI(Object obj, boolean z) {
        if (z) {
            C13ZD c13zd = this.LJJIJ;
            if (c13zd.LJIIJ <= 0) {
                if ((c13zd.LIZIZ[(c13zd.LJI * 5) + 1] & 1073741824) == 0) {
                    C13D4.LIZ("Expected a node group");
                }
                c13zd.LJIJ();
                return;
            }
            return;
        }
        if (obj != null && this.LJJIJ.LJ() != obj) {
            C13ZH c13zh = this.LJJIL;
            c13zh.LIZLLL(false);
            C13ZP c13zp = c13zh.LIZIZ.LIZ;
            c13zp.LIZJ(new C13ZK() { // from class: X.13Zy
                @Override // X.C13ZK
                public final void LIZ(C20031413Zg c20031413Zg, InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
                    c13ze.LJJJJIZL(c20031413Zg.LIZIZ(0));
                }
            });
            C20031913Zl.LIZ(c13zp, 0, obj);
        }
        this.LJJIJ.LJIJ();
    }

    public final boolean LJLJJL(C20030013Ys c20030013Ys, Object obj) {
        C13Z7 c13z7 = c20030013Ys.LIZJ;
        if (c13z7 == null) {
            return false;
        }
        int iLIZJ = this.LJJIJ.LIZ.LIZJ(c13z7);
        if (!this.LJJIIZI || iLIZJ < this.LJJIJ.LJI) {
            return false;
        }
        List<C20035013aG> list = this.LJIJ;
        int iLJI = s.LJI(iLIZJ, list);
        if (iLJI < 0) {
            int i = -(iLJI + 1);
            if (!(obj instanceof InterfaceC20029213Yk)) {
                obj = null;
            }
            ListProtector.add(list, i, new C20035013aG(c20030013Ys, iLIZJ, obj));
            return true;
        }
        C20035013aG c20035013aG = (C20035013aG) ListProtector.get(list, iLJI);
        if (obj instanceof InterfaceC20029213Yk) {
            Object obj2 = c20035013aG.LIZJ;
            if (obj2 == null) {
                c20035013aG.LIZJ = obj;
                return true;
            }
            if (obj2 instanceof C19994113Kx) {
                ((C19994113Kx) obj2).LIZLLL(obj);
                return true;
            }
            int i2 = C13X4.LIZ;
            C19994113Kx c19994113Kx = new C19994113Kx(2);
            c19994113Kx.LJIIJ(obj2);
            c19994113Kx.LJIIJ(obj);
            c20035013aG.LIZJ = c19994113Kx;
            return true;
        }
        c20035013aG.LIZJ = null;
        return true;
    }

    public final void LJLJL(int i, int i2) {
        if (LJLLI(i) != i2) {
            if (i < 0) {
                C13ZX c13zx = this.LJIILL;
                if (c13zx == null) {
                    c13zx = new C13ZX();
                    this.LJIILL = c13zx;
                }
                c13zx.LJFF(i, i2);
                return;
            }
            int[] iArr = this.LJIILJJIL;
            if (iArr == null) {
                int i3 = this.LJJIJ.LIZJ;
                iArr = new int[i3];
                Arrays.fill(iArr, 0, i3, -1);
                this.LJIILJJIL = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final void LJLJLJ(int i, int i2) {
        int iLJLLI = LJLLI(i);
        if (iLJLLI != i2) {
            int i3 = i2 - iLJLLI;
            int size = this.LJIIIIZZ.size() - 1;
            while (i != -1) {
                int iLJLLI2 = LJLLI(i) + i3;
                LJLJL(i, iLJLLI2);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        C13ZM c13zm = (C13ZM) ListProtector.get(this.LJIIIIZZ, i4);
                        if (c13zm != null && c13zm.LIZIZ(i, iLJLLI2)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.LJJIJ.LJIIIIZZ;
                } else if (!this.LJJIJ.LJIIIZ(i)) {
                    i = this.LJJIJ.LJIILJJIL(i);
                } else {
                    return;
                }
            }
        }
    }

    public final C13D2 LJLJLLL(C13D2 c13d2, C13D2 c13d22) {
        C13D3<AbstractC19973513Cz<Object>, InterfaceC19973313Cx<Object>> c13d3Builder = c13d2.builder();
        c13d3Builder.putAll(c13d22);
        C19971913Cj c19971913CjBuild = c13d3Builder.build();
        LJLIIIL(204, s.LIZLLL);
        LJJLIIIJILLIZJL();
        LJLL(c19971913CjBuild);
        LJJLIIIJILLIZJL();
        LJLL(c13d22);
        LJJJJL(false);
        return c19971913CjBuild;
    }

    public static final void LJJLL(int i, C13ZC c13zc, List list) {
        int iLJIIIIZZ = c13zc.LJJIJ.LJIIIIZZ(i) + i;
        int iLJIIIIZZ2 = i + 1;
        while (iLJIIIIZZ2 < iLJIIIIZZ) {
            int i2 = c13zc.LJJIJ.LIZIZ[(iLJIIIIZZ2 * 5) + 1];
            if ((134217728 & i2) != 0) {
                C13Z3 c13z3LJJLJLI = LJJLJLI(c13zc, iLJIIIIZZ2);
                if (c13z3LJJLJLI != null) {
                    ((ArrayList) list).add(c13z3LJJLJLI);
                }
            } else if ((i2 & 67108864) != 0) {
                LJJLL(iLJIIIIZZ2, c13zc, list);
            }
            iLJIIIIZZ2 += c13zc.LJJIJ.LJIIIIZZ(iLJIIIIZZ2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIL(int r7, int r8, int r9) {
        /*
            r6 = this;
            X.13ZD r5 = r6.LJJIJ
            if (r7 == r8) goto L76
            if (r7 == r9) goto Lf
            if (r8 == r9) goto Lf
            int r0 = r5.LJIILJJIL(r7)
            if (r0 != r8) goto L23
            r9 = r8
        Lf:
            if (r7 <= 0) goto L78
            if (r7 == r9) goto L78
            boolean r0 = r5.LJIIIZ(r7)
            if (r0 == 0) goto L1e
            X.13ZH r0 = r6.LJJIL
            r0.LIZ()
        L1e:
            int r7 = r5.LJIILJJIL(r7)
            goto Lf
        L23:
            int r0 = r5.LJIILJJIL(r8)
            if (r0 == r7) goto L76
            int r1 = r5.LJIILJJIL(r7)
            int r0 = r5.LJIILJJIL(r8)
            if (r1 != r0) goto L38
            int r9 = r5.LJIILJJIL(r7)
            goto Lf
        L38:
            r4 = 0
            r0 = r7
            r3 = 0
        L3b:
            if (r0 <= 0) goto L46
            if (r0 == r9) goto L46
            int r0 = r5.LJIILJJIL(r0)
            int r3 = r3 + 1
            goto L3b
        L46:
            r0 = r8
            r2 = 0
        L48:
            if (r0 <= 0) goto L53
            if (r0 == r9) goto L53
            int r0 = r5.LJIILJJIL(r0)
            int r2 = r2 + 1
            goto L48
        L53:
            int r1 = r3 - r2
            r9 = r7
            r0 = 0
        L57:
            if (r0 >= r1) goto L60
            int r9 = r5.LJIILJJIL(r9)
            int r0 = r0 + 1
            goto L57
        L60:
            int r2 = r2 - r3
            r0 = r8
        L62:
            if (r4 >= r2) goto L6b
            int r0 = r5.LJIILJJIL(r0)
            int r4 = r4 + 1
            goto L62
        L6b:
            if (r9 == r0) goto Lf
            int r9 = r5.LJIILJJIL(r9)
            int r0 = r5.LJIILJJIL(r0)
            goto L6b
        L76:
            r9 = r7
            goto Lf
        L78:
            r6.LJJJJJ(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJLIL(int, int, int):void");
    }

    public static final void LJJJ(C13ZC c13zc, C20035813aO c20035813aO, C13D2 c13d2, Object obj) {
        boolean z;
        c13zc.LJIIL(126665345, c20035813aO);
        c13zc.LJJLIIIJILLIZJL();
        c13zc.LJLL(obj);
        int i = c13zc.LJJJIL;
        try {
            c13zc.LJJJIL = 126665345;
            if (c13zc.LJJJI) {
                C13ZE.LJIJJ(c13zc.LJJIJIIJIL);
            }
            if (!c13zc.LJJJI && !Intrinsics.LJFF(c13zc.LJJIJ.LJ(), c13d2)) {
                z = true;
                c13zc.LJJLIIJ(c13d2);
            } else {
                z = false;
            }
            c13zc.LJL(202, 0, s.LIZJ, c13d2);
            c13zc.LJJIJL = null;
            boolean z2 = c13zc.LJIL;
            c13zc.LJIL = z;
            C19719212De c19719212De = new C19719212De(316014703, new AwS465S0200000_30(c20035813aO, (C20035813aO<Object>) obj, (Object) 0), true);
            C19719512Dh.LJ(2, c19719212De);
            c19719212De.invoke(c13zc, 1);
            c13zc.LJIL = z2;
            c13zc.LJJJJL(false);
            c13zc.LJJIJL = null;
            c13zc.LJJJIL = i;
            c13zc.LJJJJL(false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c13zc.LJJJJL(false);
            c13zc.LJJIJL = null;
            c13zc.LJJJIL = i;
            c13zc.LJJJJL(false);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL(int r22, int r23, java.lang.Object r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJL(int, int, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJJZ(X.C13ZC r12, int r13, int r14, boolean r15, int r16) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJZ(X.13ZC, int, int, boolean, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #0 {all -> 0x0047, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:9:0x002a, B:8:0x0026, B:14:0x0034, B:15:0x0038, B:17:0x003e), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> R LJJLIIIJL(X.C13Y2 r7, X.C13Y2 r8, java.lang.Integer r9, java.util.List<? extends kotlin.Pair<X.C20030013Ys, ? extends java.lang.Object>> r10, kotlin.jvm.functions.Function0<? extends R> r11) {
        /*
            r6 = this;
            boolean r4 = r6.LJJIIZI
            int r3 = r6.LJIIJ
            r0 = 1
            r6.LJJIIZI = r0     // Catch: java.lang.Throwable -> L47
            r5 = 0
            r6.LJIIJ = r5     // Catch: java.lang.Throwable -> L47
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L47
        Le:
            if (r5 >= r2) goto L2d
            java.lang.Object r0 = r10.get(r5)     // Catch: java.lang.Throwable -> L47
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r0.getFirst()     // Catch: java.lang.Throwable -> L47
            X.13Ys r1 = (X.C20030013Ys) r1     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.getSecond()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L26
            r6.LJLJJL(r1, r0)     // Catch: java.lang.Throwable -> L47
            goto L2a
        L26:
            r0 = 0
            r6.LJLJJL(r1, r0)     // Catch: java.lang.Throwable -> L47
        L2a:
            int r5 = r5 + 1
            goto Le
        L2d:
            if (r7 == 0) goto L3e
            if (r9 == 0) goto L32
            goto L34
        L32:
            r0 = -1
            goto L38
        L34:
            int r0 = r9.intValue()     // Catch: java.lang.Throwable -> L47
        L38:
            java.lang.Object r0 = r7.LJIILLIIL(r8, r0, r11)     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L42
        L3e:
            java.lang.Object r0 = r11.invoke()     // Catch: java.lang.Throwable -> L47
        L42:
            r6.LJJIIZI = r4
            r6.LJIIJ = r3
            return r0
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L47
            r6.LJJIIZI = r4
            r6.LJIIJ = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZC.LJJLIIIJL(X.13Y2, X.13Y2, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.13Yw] */
    public C13ZC(C20037713ah c20037713ah, C13Z1 c13z1, C13ZI c13zi, s0 s0Var, C13Z8 c13z8, C13Z8 c13z82, C13Y2 c13y2) {
        boolean z;
        this.LIZIZ = c20037713ah;
        this.LIZJ = c13z1;
        this.LIZLLL = c13zi;
        this.LJ = s0Var;
        this.LJFF = c13z8;
        this.LJI = c13z82;
        this.LJII = c13y2;
        if (!c13z1.LJFF() && !c13z1.LIZLLL()) {
            z = false;
        } else {
            z = true;
        }
        this.LJJIIJ = z;
        this.LJJIIJZLJL = new InterfaceC20028613Ye() { // from class: X.13Yw
            @Override // X.InterfaceC20028613Ye
            public final void LIZ() {
                C13ZC c13zc = this.LIZ;
                c13zc.LJJII--;
            }

            @Override // X.InterfaceC20028613Ye
            public final void start() {
                this.LIZ.LJJII++;
            }
        };
        this.LJJIIZ = new ArrayList();
        C13ZD c13zdLJFF = c13zi.LJFF();
        c13zdLJFF.LIZJ();
        this.LJJIJ = c13zdLJFF;
        C13ZI c13zi2 = new C13ZI();
        if (c13z1.LJFF()) {
            c13zi2.LJ();
        }
        if (c13z1.LIZLLL()) {
            c13zi2.LLJIJIL = new C20029713Yp<>(6);
        }
        this.LJJIJIIJI = c13zi2;
        C13ZE c13zeLJIIIIZZ = c13zi2.LJIIIIZZ();
        c13zeLJIIIIZZ.LIZLLL(true);
        this.LJJIJIIJIL = c13zeLJIIIIZZ;
        this.LJJIL = new C13ZH(this, c13z8);
        C13ZD c13zdLJFF2 = this.LJJIJIIJI.LJFF();
        try {
            C13Z7 c13z7LIZ = c13zdLJFF2.LIZ(0);
            c13zdLJFF2.LIZJ();
            this.LJJIZ = c13z7LIZ;
            this.LJJJ = new C20034713aD();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c13zdLJFF2.LIZJ();
            throw th;
        }
    }
}
