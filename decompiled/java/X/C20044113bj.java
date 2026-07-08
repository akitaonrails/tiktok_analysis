package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20044113bj {
    public final InterfaceC20044013bi LIZ;
    public final Function1<InterfaceC1564790qp3, Unit> LIZIZ;
    public final C20044513bn LIZJ;
    public C20043913bh LIZLLL;

    public C20044113bj() {
        this(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20044113bj(InterfaceC20044013bi interfaceC20044013bi, Function1<? super InterfaceC1564790qp3, Unit> function1) {
        this.LIZ = interfaceC20044013bi;
        this.LIZIZ = function1;
        this.LIZJ = new C20044513bn();
    }

    public final InterfaceC1564810qp5 LIZ(int i, long j) {
        C20043913bh c20043913bh = this.LIZLLL;
        if (c20043913bh != null) {
            C20044213bk c20044213bk = new C20044213bk(c20043913bh, i, j, this.LIZJ);
            c20043913bh.LIZJ.LIZ(c20044213bk);
            return c20044213bk;
        }
        return new InterfaceC1564810qp5() { // from class: X.13bs
            @Override // X.InterfaceC1564810qp5
            public final void LIZ() {
            }

            @Override // X.InterfaceC1564810qp5
            public final void cancel() {
            }
        };
    }
}
