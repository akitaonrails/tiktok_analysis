package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0VDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VDQ extends C0VDO implements InterfaceC794170VDj {
    public InterfaceC792950V8r LIZIZ;
    public C0VSJ LIZJ;
    public final ConcurrentLinkedQueue<C794140VDg> LIZLLL = new ConcurrentLinkedQueue<>();
    public final C794140VDg LJ = new C794140VDg();

    @Override // X.C0VDO
    public final String LJFF() {
        return "monitor_log";
    }

    @Override // X.InterfaceC794170VDj
    public final List<String> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        C0VSJ c0vsj = this.LIZJ;
        if (c0vsj != null) {
            arrayList.add(c0vsj.getAbsolutePath());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c A[Catch: IOException -> 0x0140, TRY_LEAVE, TryCatch #4 {IOException -> 0x0140, blocks: (B:52:0x0137, B:54:0x013c), top: B:96:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.C0VDO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(X.C0VDC r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VDQ.LJI(X.0VDC):boolean");
    }
}
