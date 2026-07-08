package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.13bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20044313bl implements InterfaceC1564790qp3 {
    public final List<InterfaceC20044913br> LIZ = new ArrayList();
    public final /* synthetic */ C20044113bj LIZIZ;

    public C20044313bl(C20044113bj c20044113bj) {
        this.LIZIZ = c20044113bj;
    }

    @Override // X.InterfaceC1564790qp3
    public final void LIZ(int i) {
        long j = C20045113bt.LIZ;
        C20044113bj c20044113bj = this.LIZIZ;
        C20043913bh c20043913bh = c20044113bj.LIZLLL;
        if (c20043913bh != null) {
            ((ArrayList) this.LIZ).add(new C20044213bk(c20043913bh, i, j, c20044113bj.LIZJ));
        }
    }
}
