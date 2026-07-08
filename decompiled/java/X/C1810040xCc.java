package X;

import com.bytedance.android.live.rank.impl.list.controller.RankPageController;

/* JADX INFO: renamed from: X.0xCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810040xCc implements InterfaceC1811830xFV {
    public final /* synthetic */ RankPageController LIZ;

    @Override // X.InterfaceC1811830xFV
    public final void LIZLLL() {
        InterfaceC1810050xCd interfaceC1810050xCd = this.LIZ.LLIZLLLIL;
        if (interfaceC1810050xCd != null) {
            interfaceC1810050xCd.X1();
        }
        C1085110eLN.LIZIZ();
    }

    public C1810040xCc(RankPageController rankPageController) {
        this.LIZ = rankPageController;
    }

    @Override // X.InterfaceC1811830xFV
    public final void LJJI(long j) {
        this.LIZ.LJFF(j / 1000);
    }
}
