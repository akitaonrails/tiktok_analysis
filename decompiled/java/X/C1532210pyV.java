package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532210pyV implements InterfaceC1532430pyr {
    public final boolean LIZ;
    public final boolean LIZIZ;

    @Override // X.InterfaceC1532520pz0
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1532520pz0
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1532520pz0
    public final String getName() {
        return "gecko_update";
    }

    @Override // X.InterfaceC1532520pz0
    public final EnumC1528520psY LIZLLL() {
        return EnumC1528520psY.REGISTER_CALLBACK;
    }

    @Override // X.InterfaceC1532430pyr
    public final boolean LIZJ(C1532300pye c1532300pye) {
        C1532710pzJ c1532710pzJ = c1532300pye.LJ;
        if (!c1532710pzJ.LJI) {
            if (c1532710pzJ.LJIJJLI || c1532710pzJ.LJIL) {
                return true;
            }
            return false;
        }
        return false;
    }

    public /* synthetic */ C1532210pyV(boolean z, int i) {
        this((i & 1) != 0 ? false : z, false);
    }

    @Override // X.InterfaceC1532520pz0
    public final void LJ(Function1 function1, Object obj) {
        C1532460pyu.LIZ(this, (C1532550pz3) obj, function1);
    }

    public C1532210pyV(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    @Override // X.InterfaceC1532430pyr
    public final void LIZIZ(final C08AB c08ab, final C1532710pzJ c1532710pzJ, final C1532470pyv c1532470pyv, final C1532170pyR c1532170pyR, final Function1<? super C1532340pyi, Unit> function1) {
        boolean z = c1532710pzJ.LJIILL;
        C1529350ptt c1529350ptt = c1532710pzJ.LJJIIJ;
        if (c1529350ptt == null) {
            c1532470pyv.LIZIZ(2, "gecko model is missing");
            function1.invoke(null);
            return;
        }
        if (z) {
            c1532470pyv.LIZIZ(1, "only local, do not update");
            function1.invoke(null);
            return;
        }
        c1529350ptt.LJ = true;
        final String str = c1529350ptt.LIZ;
        String str2 = c1529350ptt.LIZIZ;
        final String str3 = c1529350ptt.LIZJ;
        InterfaceC1533340q0K interfaceC1533340q0K = new InterfaceC1533340q0K() { // from class: X.0pyW
            public boolean LIZ;

            /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[PHI: r5
              0x0049: PHI (r5v3 X.0VSJ) = (r5v0 X.0VSJ), (r5v4 X.0VSJ) binds: [B:22:0x007a, B:13:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
            @Override // X.InterfaceC1533340q0K
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(java.lang.String r11) {
                /*
                    r10 = this;
                    boolean r0 = r10.LIZ
                    if (r0 == 0) goto L5
                    return
                L5:
                    r2 = 1
                    r10.LIZ = r2
                    X.0pze r4 = X.C1532920pze.LIZJ
                    kotlin.jvm.internal.AwS172S1100000_23 r3 = new kotlin.jvm.internal.AwS172S1100000_23
                    X.0pzJ r1 = r1
                    r0 = 0
                    r3.<init>(r1, r11, r0)
                    r4.LIZJ(r3)
                    X.0q0H r3 = X.C1533310q0H.LIZ
                    X.0pzJ r1 = r1
                    java.lang.String r0 = r2
                    r3.getClass()
                    kotlin.Pair r4 = X.C1533310q0H.LIZIZ(r1, r0, r11)
                    if (r4 != 0) goto L31
                    java.lang.String r1 = r2
                    X.0pzG r0 = X.C1532680pzG.LIZ
                    r0.getClass()
                    boolean r0 = X.C1532680pzG.LJIIJ
                    kotlin.Pair r4 = X.C1550600qSA.LJII(r1, r11, r0)
                L31:
                    r3 = 0
                    if (r4 == 0) goto L7f
                    java.lang.Object r1 = r4.getFirst()
                    java.io.File r1 = (java.io.File) r1
                    if (r1 == 0) goto L79
                    java.lang.String r0 = r7
                    X.0VSJ r5 = new X.0VSJ
                    r5.<init>(r1, r0)
                    boolean r0 = r5.exists()
                    if (r0 == 0) goto L79
                L49:
                    java.lang.Object r0 = r4.getSecond()
                    java.lang.Number r0 = (java.lang.Number) r0
                    long r6 = r0.longValue()
                L53:
                    r8 = 0
                    if (r5 == 0) goto L7f
                    boolean r0 = r5.exists()
                    if (r0 != r2) goto L7f
                    X.0pyR r1 = r3
                    r1.LIZJ = r8
                    java.lang.String r0 = "gecko_update"
                    r1.LIZIZ = r0
                    X.0pwn r0 = new X.0pwn
                    r4 = r0
                    r9 = r8
                    r4.<init>(r5, r6, r8, r9)
                    X.08AB r1 = r4
                    X.0pzJ r2 = r1
                    X.0pyv r3 = r5
                    X.0pyR r4 = r3
                    kotlin.jvm.functions.Function1<X.0pyi, kotlin.Unit> r5 = r6
                    r0.LIZIZ(r1, r2, r3, r4, r5)
                    return
                L79:
                    r5 = r3
                    if (r4 != 0) goto L49
                    r6 = 0
                    goto L53
                L7f:
                    X.0pyv r2 = r5
                    r1 = 6
                    java.lang.String r0 = "update gecko success, but file not exists"
                    r2.LIZIZ(r1, r0)
                    kotlin.jvm.functions.Function1<X.0pyi, kotlin.Unit> r0 = r6
                    r0.invoke(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1532220pyW.LIZIZ(java.lang.String):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[PHI: r5
              0x007a: PHI (r5v3 X.0VSJ) = (r5v0 X.0VSJ), (r5v4 X.0VSJ) binds: [B:22:0x00ab, B:13:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
            @Override // X.InterfaceC1533340q0K
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r11, java.lang.Throwable r12) {
                /*
                    Method dump skipped, instruction units count: 208
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1532220pyW.LIZ(java.lang.String, java.lang.Throwable):void");
            }
        };
        C1533310q0H c1533310q0H = C1533310q0H.LIZ;
        C1532950pzh c1532950pzh = c1532710pzJ.LJJIFFI;
        boolean z2 = this.LIZ;
        boolean z3 = this.LIZIZ;
        c1533310q0H.getClass();
        C1533310q0H.LIZ(c1532950pzh, false, str, str2, c1532710pzJ, interfaceC1533340q0K, z2, z3);
    }
}
