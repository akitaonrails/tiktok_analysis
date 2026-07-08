package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.06Sn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1611106Sn extends AbstractC1585810rMx {
    public final long LL = 1000;
    public AnonymousClass0956 LLILLJJLI;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1 && i != 2) {
                return;
            }
            AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLILLJJLI = null;
            return;
        }
        AnonymousClass0956 anonymousClass09562 = this.LLILLJJLI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLILLJJLI = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1611006Sm(this, null), 3);
    }
}
