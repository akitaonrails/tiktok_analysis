package X;

import java.util.List;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20044213bk implements InterfaceC1564810qp5, InterfaceC20044913br {
    public final int LIZ;
    public final long LIZIZ;
    public final C20044513bn LIZJ;
    public InterfaceC20044613bo LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public C20044413bm LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public final /* synthetic */ C20043913bh LJIIL;

    @Override // X.InterfaceC1564810qp5
    public final void LIZ() {
        this.LJIIIIZZ = true;
    }

    public final C20044413bm LIZLLL() {
        InterfaceC20044613bo interfaceC20044613bo = this.LIZLLL;
        if (interfaceC20044613bo == null) {
            C1691080u6k.LIZIZ("Should precompose before resolving nested prefetch states");
            throw new C2197108jB();
        }
        C259800zU c259800zU = new C259800zU();
        interfaceC20044613bo.LIZJ(new AwS609S0100000_30(c259800zU, (C259800zU<AbstractC20074713gf>) 291));
        List list = (List) c259800zU.element;
        if (list != null) {
            return new C20044413bm(this, list);
        }
        return null;
    }

    public final void LJ() {
        C1302050jzH.LIZ.getClass();
        long jLIZ = C1302050jzH.LIZ();
        long jLJFF = C1302080jzK.LJFF(jLIZ, this.LJIIJJI);
        long j = jLJFF >> 1;
        if ((((int) jLJFF) & 1) != 0) {
            j = j > 9223372036854L ? Long.MAX_VALUE : j < -9223372036854L ? Long.MIN_VALUE : j * ((long) 1000000);
        }
        this.LJIIJ = j;
        this.LJIIIZ -= j;
        this.LJIIJJI = jLIZ;
    }

    @Override // X.InterfaceC1564810qp5
    public final void cancel() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        InterfaceC20044613bo interfaceC20044613bo = this.LIZLLL;
        if (interfaceC20044613bo != null) {
            interfaceC20044613bo.dispose();
        }
        this.LIZLLL = null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HandleAndRequestImpl { index = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", constraints = ");
        sbLIZ.append((Object) C1682380tsi.LJIIJJI(this.LIZIZ));
        sbLIZ.append(", isComposed = ");
        sbLIZ.append(this.LIZLLL != null);
        sbLIZ.append(", isMeasured = ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isCanceled = ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0148 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:61:0x010c, B:63:0x0116, B:65:0x011e, B:67:0x0126, B:69:0x0136, B:70:0x0138, B:78:0x0169, B:71:0x013a, B:72:0x0140, B:74:0x0148, B:76:0x0158, B:77:0x015f), top: B:125:0x010c }] */
    @Override // X.InterfaceC20044913br
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(X.C20044713bp r18) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20044213bk.LIZIZ(X.13bp):boolean");
    }

    public final void LIZJ(long j) {
        if (!(!this.LJFF)) {
            C1691080u6k.LIZ("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (!(!this.LJ)) {
            C1691080u6k.LIZ("Request was already measured!");
        }
        this.LJ = true;
        InterfaceC20044613bo interfaceC20044613bo = this.LIZLLL;
        if (interfaceC20044613bo != null) {
            int iLIZIZ = interfaceC20044613bo.LIZIZ();
            for (int i = 0; i < iLIZIZ; i++) {
                interfaceC20044613bo.LIZLLL(i, j);
            }
            return;
        }
        C1691080u6k.LIZIZ("performComposition() must be called before performMeasure()");
        throw new C2197108jB();
    }

    public C20044213bk(C20043913bh c20043913bh, int i, long j, C20044513bn c20044513bn) {
        this.LJIIL = c20043913bh;
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = c20044513bn;
        C1302050jzH.LIZ.getClass();
        this.LJIIJJI = C1302050jzH.LIZ();
    }
}
