package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS438S0200000_2;
import kotlin.jvm.internal.AwS472S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20074613ge extends AbstractC20055313dX implements InterfaceC20056213dg {
    public EnumC1684030tvN LLJJIII;
    public Function1<? super C20066813fO, Boolean> LLJJIJI;
    public boolean LLJJIJIIJIL;
    public InterfaceC595010NVj LLJJIJIL;
    public C095E<AbstractC1394705d3> LLJJJ;
    public C0NW8 LLJJJIL;
    public boolean LLJJJJ;
    public InterfaceC20079413hQ LLJJJJJIL;

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ void LJJIIZ() {
    }

    @Override // X.InterfaceC20056213dg
    public final /* synthetic */ boolean LJL() {
        return false;
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        this.LLJJJJ = false;
        LLJJJ();
    }

    public abstract Object LLJJJIL(C1394205cy c1394205cy, C1394305cz c1394305cz);

    public abstract void LLJJJJ(long j);

    public abstract void LLJJJJJIL(long j);

    public abstract boolean LLJJJJLIIL();

    @Override // X.InterfaceC20056213dg
    public final void LLIIIILZ() {
        InterfaceC20079413hQ interfaceC20079413hQ = this.LLJJJJJIL;
        if (interfaceC20079413hQ != null) {
            interfaceC20079413hQ.LLIIIILZ();
        }
    }

    public final void LLJJJ() {
        C0NW8 c0nw8 = this.LLJJJIL;
        if (c0nw8 != null) {
            InterfaceC595010NVj interfaceC595010NVj = this.LLJJIJIL;
            if (interfaceC595010NVj != null) {
                interfaceC595010NVj.LIZJ(new C0NV6(c0nw8));
            }
            this.LLJJJIL = null;
        }
    }

    @Override // X.InterfaceC20056213dg
    public final void LJJJJZ() {
        LLIIIILZ();
    }

    @Override // X.InterfaceC20056213dg
    public final long LJJLIIIJ() {
        return C20082213hs.LIZ;
    }

    @Override // X.AbstractC20055413dY
    public void LLILZLL() {
        LLIIIILZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LLJJIJI(X.AbstractC20074613ge r6, X.InterfaceC1364105Vn r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof X.C20075113gj
            if (r0 == 0) goto L4d
            r5 = r7
            X.13gj r5 = (X.C20075113gj) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r5.LLILZ = r2
        L15:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L53
            X.13ge r6 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L27:
            r0 = 0
            r6.LLJJJIL = r0
        L2a:
            r0 = 0
            r6.LLJJJJJIL(r0)
            kotlin.Unit r4 = kotlin.Unit.LIZ
            return r4
        L32:
            X.C155000ia.LIZIZ(r1)
            X.0NW8 r2 = r6.LLJJJIL
            if (r2 == 0) goto L2a
            X.0NVj r1 = r6.LLJJIJIL
            if (r1 == 0) goto L27
            X.0NV6 r0 = new X.0NV6
            r0.<init>(r2)
            r5.LL = r6
            r5.LLILZ = r3
            java.lang.Object r0 = r1.LIZ(r0, r5)
            if (r0 != r4) goto L27
            return r4
        L4d:
            X.13gj r5 = new X.13gj
            r5.<init>(r6, r7)
            goto L15
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20074613ge.LLJJIJI(X.13ge, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0NNS, X.0NW8] */
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
    public static final java.lang.Object LLJJIJIIJIL(X.AbstractC20074613ge r7, X.C1394805d4 r8, X.InterfaceC1364105Vn r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof X.C20074913gh
            if (r0 == 0) goto L74
            r6 = r9
            X.13gh r6 = (X.C20074913gh) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L15:
            java.lang.Object r2 = r6.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 == r3) goto L55
            if (r0 != r4) goto L7a
            X.0NW8 r1 = r6.LLILLL
            X.05d4 r8 = r6.LLILLJJLI
            X.13ge r7 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L2e:
            r7.LLJJJIL = r1
            long r0 = r8.LIZ
            r7.LLJJJJ(r0)
            kotlin.Unit r5 = kotlin.Unit.LIZ
            return r5
        L38:
            X.C155000ia.LIZIZ(r2)
            X.0NW8 r2 = r7.LLJJJIL
            if (r2 == 0) goto L5c
            X.0NVj r1 = r7.LLJJIJIL
            if (r1 == 0) goto L5c
            X.0NV6 r0 = new X.0NV6
            r0.<init>(r2)
            r6.LL = r7
            r6.LLILLJJLI = r8
            r6.LLILZLL = r3
            java.lang.Object r0 = r1.LIZ(r0, r6)
            if (r0 != r5) goto L5c
            return r5
        L55:
            X.05d4 r8 = r6.LLILLJJLI
            X.13ge r7 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L5c:
            X.0NW8 r1 = new X.0NW8
            r1.<init>()
            X.0NVj r0 = r7.LLJJIJIL
            if (r0 == 0) goto L2e
            r6.LL = r7
            r6.LLILLJJLI = r8
            r6.LLILLL = r1
            r6.LLILZLL = r4
            java.lang.Object r0 = r0.LIZ(r1, r6)
            if (r0 != r5) goto L2e
            return r5
        L74:
            X.13gh r6 = new X.13gh
            r6.<init>(r7, r9)
            goto L15
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20074613ge.LLJJIJIIJIL(X.13ge, X.05d4, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LLJJIJIL(X.AbstractC20074613ge r6, X.C1394905d5 r7, X.InterfaceC1364105Vn r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof X.C20075013gi
            if (r0 == 0) goto L51
            r5 = r8
            X.13gi r5 = (X.C20075013gi) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L15:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L57
            X.05d5 r7 = r5.LLILLJJLI
            X.13ge r6 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L29:
            r0 = 0
            r6.LLJJJIL = r0
        L2c:
            long r0 = r7.LIZ
            r6.LLJJJJJIL(r0)
            kotlin.Unit r4 = kotlin.Unit.LIZ
            return r4
        L34:
            X.C155000ia.LIZIZ(r1)
            X.0NW8 r2 = r6.LLJJJIL
            if (r2 == 0) goto L2c
            X.0NVj r1 = r6.LLJJIJIL
            if (r1 == 0) goto L29
            X.0NV7 r0 = new X.0NV7
            r0.<init>(r2)
            r5.LL = r6
            r5.LLILLJJLI = r7
            r5.LLILZIL = r3
            java.lang.Object r0 = r1.LIZ(r0, r5)
            if (r0 != r4) goto L29
            return r4
        L51:
            X.13gi r5 = new X.13gi
            r5.<init>(r6, r8)
            goto L15
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20074613ge.LLJJIJIL(X.13ge, X.05d5, X.05Vn):java.lang.Object");
    }

    public void LJJJZ(C20067313fT c20067313fT, EnumC20065813fE enumC20065813fE, long j) {
        if (this.LLJJIJIIJIL && this.LLJJJJJIL == null) {
            PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: X.05d1
                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    C1395205d8 c1395205d8 = new C1395205d8();
                    Object objLJ = C2296808zG.LJ(new C1394405d0(this.LL, interfaceC1369205Xm, new AwS472S0200000_2(this.LL, c1395205d8, 1), new AwS211S0300000_2(c1395205d8, interfaceC1369205Xm, this.LL, 16), new AwS546S0100000_2(this.LL, 1048), new AwS546S0100000_2(this.LL, 1049), new AwS438S0200000_2(this.LL, c1395205d8, 23), null), interfaceC1364105Vn);
                    if (objLJ == C099R.LJFF()) {
                        return objLJ;
                    }
                    return Unit.LIZ;
                }
            };
            C20067313fT c20067313fT2 = C1679720toQ.LIZ;
            C20065413fA c20065413fA = new C20065413fA(null, null, null, pointerInputEventHandler);
            LLJJ(c20065413fA);
            this.LLJJJJJIL = c20065413fA;
        }
        InterfaceC20079413hQ interfaceC20079413hQ = this.LLJJJJJIL;
        if (interfaceC20079413hQ != null) {
            interfaceC20079413hQ.LJJJZ(c20067313fT, enumC20065813fE, j);
        }
    }

    public AbstractC20074613ge(Function1<? super C20066813fO, Boolean> function1, boolean z, InterfaceC595010NVj interfaceC595010NVj, EnumC1684030tvN enumC1684030tvN) {
        this.LLJJIII = enumC1684030tvN;
        this.LLJJIJI = function1;
        this.LLJJIJIIJIL = z;
        this.LLJJIJIL = interfaceC595010NVj;
        new AwS581S0100000_2(this, 493);
    }

    public final void LLJJL(Function1<? super C20066813fO, Boolean> function1, boolean z, InterfaceC595010NVj interfaceC595010NVj, EnumC1684030tvN enumC1684030tvN, boolean z2) {
        this.LLJJIJI = function1;
        if (this.LLJJIJIIJIL != z) {
            this.LLJJIJIIJIL = z;
            if (!z) {
                LLJJJ();
                InterfaceC20079413hQ interfaceC20079413hQ = this.LLJJJJJIL;
                if (interfaceC20079413hQ != null) {
                    LLJJI(interfaceC20079413hQ);
                }
                this.LLJJJJJIL = null;
            }
            z2 = true;
        }
        if (!Intrinsics.LJFF(this.LLJJIJIL, interfaceC595010NVj)) {
            LLJJJ();
            this.LLJJIJIL = interfaceC595010NVj;
        }
        if (this.LLJJIII != enumC1684030tvN) {
            this.LLJJIII = enumC1684030tvN;
        } else if (!z2) {
            return;
        }
        InterfaceC20079413hQ interfaceC20079413hQ2 = this.LLJJJJJIL;
        if (interfaceC20079413hQ2 != null) {
            interfaceC20079413hQ2.LJLLLL();
        }
    }
}
