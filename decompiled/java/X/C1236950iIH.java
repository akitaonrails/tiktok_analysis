package X;

import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLinkVerifyFragment;

/* JADX INFO: renamed from: X.0iIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236950iIH extends C1236960iII {
    public final /* synthetic */ EmailLinkVerifyFragment LL;

    @Override // X.InterfaceC1237230iIj
    public final void LIZLLL() {
        if (this.LL.isViewValid()) {
            this.LL.fT().setEnabled(true);
            this.LL.fT().setText(this.LL.getString(2131829385));
        }
    }

    @Override // X.InterfaceC1237230iIj
    public final void onStart() {
        if (this.LL.isViewValid()) {
            this.LL.fT().setEnabled(false);
        }
    }

    public C1236950iIH(EmailLinkVerifyFragment emailLinkVerifyFragment) {
        this.LL = emailLinkVerifyFragment;
    }

    @Override // X.C1236960iII, X.InterfaceC1237230iIj
    public final void LJJI(long j) {
        if (this.LL.isViewValid()) {
            if (this.LL.fT().isEnabled()) {
                this.LL.fT().setEnabled(false);
            }
            this.LL.fT().setText(this.LL.getString(2131833844, Integer.valueOf((int) (j / 1000))));
        }
    }
}
