package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0zbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902470zbh extends AbstractC1585810rMx {
    public final String LL;

    public C1902470zbh(String str) {
        this.LL = str;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        String str;
        InterfaceC1602960roc interfaceC1602960rocLIZIZ;
        if (i == 1 && (str = C0NBD.LIZ) != null && (interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(this.LL)) != null) {
            interfaceC1602960rocLIZIZ.LIZ("inbox_session_id", str);
        }
    }
}
