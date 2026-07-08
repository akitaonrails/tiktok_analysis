package X;

import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;

/* JADX INFO: renamed from: X.10Lx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19232310Lx extends C728670Si9<C19232510Lz, InterfaceC19232410Ly> implements InterfaceC1526205yG {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1526205yG
    public final void onSuccess() {
        V v = this.LLILLJJLI;
        if (v != 0) {
            M m = this.LL;
            if (((AbstractC728630Si5) m).LLILLJJLI == 0) {
                ((InterfaceC19232410Ly) v).LJJLIIIJ(new Exception());
            } else {
                ((InterfaceC19232410Ly) v).LJJJJJL((QRCodeInfo) ((AbstractC728630Si5) m).LLILLJJLI);
            }
        }
    }

    @Override // X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        V v = this.LLILLJJLI;
        if (v != 0) {
            ((InterfaceC19232410Ly) v).LJJLIIIJ(exc);
        }
    }

    public C19232310Lx(C19232510Lz c19232510Lz, C20697315yt c20697315yt) {
        super(c19232510Lz, c20697315yt);
        c19232510Lz.LIZ(this);
    }
}
