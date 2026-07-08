package X;

import X.AbstractC999780c7k;

/* JADX INFO: renamed from: X.0c7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C999770c7j<T extends AbstractC999780c7k> extends AbstractC1024610cln {
    public final T LL;

    /* JADX WARN: Multi-variable type inference failed */
    public C999770c7j(AbstractC999780c7k abstractC999780c7k) {
        this.LL = abstractC999780c7k;
    }

    @Override // X.AbstractC1537870q7d
    public void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        T t = this.LL;
        t.LIZLLL = interfaceC1541990qEH.e1();
        if (t.LJII == 1) {
            t.LJ = false;
            t.LJII = 0;
        } else {
            t.LJ = true;
            t.LJFF = false;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        this.LL.LJII = 0;
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        T t = this.LL;
        t.LIZLLL(2);
        t.LJ = false;
        if (t.LJI == 0) {
            t.LJI = 1;
        }
        t.LJII = 1;
    }
}
