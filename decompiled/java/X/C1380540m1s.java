package X;

import java.util.List;

/* JADX INFO: renamed from: X.0m1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380540m1s {
    public final InterfaceC1380640m22 LIZ;
    public final C1380650m23 LIZIZ;
    public final C1380520m1q LIZJ;

    public C1380540m1s() {
        this(null, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1380540m1s(C1380550m1t c1380550m1t, int i) {
        C1380650m23 c1380650m23;
        c1380550m1t = (i & 1) != 0 ? null : c1380550m1t;
        if ((i & 2) != 0) {
            c1380650m23 = new C1380510m1p() { // from class: X.0m23
            };
        } else {
            c1380650m23 = 0;
        }
        C1380520m1q c1380520m1q = (i & 4) != 0 ? new C1380520m1q() : null;
        this.LIZ = c1380550m1t;
        this.LIZIZ = c1380650m23;
        this.LIZJ = c1380520m1q;
    }

    public final void LIZ(List<? extends InterfaceC1380530m1r> list, EnumC1380570m1v enumC1380570m1v) {
        int i = C1380580m1w.LIZ[enumC1380570m1v.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LIZJ.LIZ(list);
                return;
            }
            throw new C1954807lC();
        }
        LIZ(list);
    }
}
