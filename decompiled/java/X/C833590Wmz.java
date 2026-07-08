package X;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: X.0Wmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833590Wmz implements InterfaceC832870Wlp {
    public final Status LL;
    public final GoogleSignInAccount LLILLJJLI;

    public C833590Wmz(GoogleSignInAccount googleSignInAccount, Status status) {
        this.LLILLJJLI = googleSignInAccount;
        this.LL = status;
    }

    @Override // X.InterfaceC832870Wlp
    public final Status getStatus() {
        return this.LL;
    }
}
