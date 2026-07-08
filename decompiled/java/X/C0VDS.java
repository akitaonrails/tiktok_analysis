package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VDS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VDS extends C0VDO implements InterfaceC794170VDj {
    public C0VSJ LIZIZ;

    @Override // X.C0VDO
    public final String LJFF() {
        return "permission";
    }

    @Override // X.InterfaceC794170VDj
    public final List<String> LIZIZ() {
        ArrayList arrayList = new ArrayList(1);
        C0VSJ c0vsj = this.LIZIZ;
        if (c0vsj != null) {
            arrayList.add(c0vsj.getAbsolutePath());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00f2: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:16777458), block:B:36:0x00f2 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100 A[Catch: IOException -> 0x0104, TRY_LEAVE, TryCatch #4 {IOException -> 0x0104, blocks: (B:41:0x00fb, B:43:0x0100), top: B:61:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.OutputStreamWriter] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.BufferedWriter] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r6v1 */
    @Override // X.C0VDO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(X.C0VDC r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VDS.LJI(X.0VDC):boolean");
    }
}
