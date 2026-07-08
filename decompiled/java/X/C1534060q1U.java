package X;

import java.io.InputStream;

/* JADX INFO: renamed from: X.0q1U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1534060q1U extends AbstractC1535150q3F<InputStream, byte[]> {
    public final boolean LIZLLL;

    @Override // X.InterfaceC1535220q3M
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.AbstractC1535150q3F
    public final void LJ() {
    }

    @Override // X.InterfaceC1535220q3M
    public final String getName() {
        return "Stream2Bytes";
    }

    @Override // X.InterfaceC1535220q3M
    public final boolean LIZ() {
        return !this.LIZLLL;
    }

    @Override // X.InterfaceC1535220q3M
    public final EnumC1528510psX LIZJ() {
        return this.LIZLLL ? EnumC1528510psX.WAIT_FOR_RESULT : EnumC1528510psX.REGISTER_CALLBACK;
    }

    public C1534060q1U(boolean z) {
        super(InputStream.class, byte[].class);
        this.LIZLLL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00fa: INVOKE (r0 I:X.0q13), (r8 I:X.0q3P) VIRTUAL call: X.0q13.LJIILIIL(X.0q3P):void A[Catch: all -> 0x012d, MD:(X.0q3P):void (m)] (LINE:67109114), block:B:40:0x00da */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0113: IGET (r0 I:Type) = (r1 I:X.0q1k) A[Catch: all -> 0x0120, TRY_ENTER] (LINE:67109139) X.0q1k.LIZLLL java.lang.Object, block:B:41:0x0113 */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0131: IGET (r0 I:Type) = (r1 I:X.0q1k) A[Catch: all -> 0x013e, TRY_ENTER] (LINE:67109169) X.0q1k.LIZLLL java.lang.Object, block:B:49:0x0131 */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0110: INVOKE (r2 I:kotlin.jvm.functions.Function1), (r12 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function1.invoke(java.lang.Object):java.lang.Object A[Catch: all -> 0x012d, MD:(P1):R (m), TRY_LEAVE] (LINE:67109136), block:B:40:0x00da */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:3:0x0007, B:5:0x0013, B:7:0x0018, B:18:0x003f, B:20:0x0054, B:21:0x005d, B:23:0x0066, B:26:0x007b, B:28:0x008a, B:29:0x008e, B:31:0x00aa, B:32:0x00ae, B:9:0x001c, B:11:0x0020, B:13:0x0024, B:15:0x002b, B:17:0x0031), top: B:56:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0q1k] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0q1k] */
    @Override // X.AbstractC1535150q3F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.AbstractC1534220q1k<java.io.InputStream> r19, X.C1533790q13 r20, java.util.List<? extends java.lang.Class<?>> r21, kotlin.jvm.functions.Function1<? super X.AbstractC1534220q1k<byte[]>, kotlin.Unit> r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1534060q1U.LJFF(X.0q1k, X.0q13, java.util.List, kotlin.jvm.functions.Function1):void");
    }
}
