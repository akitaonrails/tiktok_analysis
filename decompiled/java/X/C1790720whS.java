package X;

import com.bytedance.android.live.rank.impl.list.controller.RankRootController;

/* JADX INFO: renamed from: X.0whS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790720whS implements InterfaceC1811830xFV {
    public final /* synthetic */ RankRootController LIZ;

    @Override // X.InterfaceC1811830xFV
    public final void LIZLLL() {
    }

    public C1790720whS(RankRootController rankRootController) {
        this.LIZ = rankRootController;
    }

    @Override // X.InterfaceC1811830xFV
    public final void LJJI(long j) {
        InterfaceC1790880whi interfaceC1790880whi = this.LIZ.LLILZ;
        if (interfaceC1790880whi != null) {
            interfaceC1790880whi.YE(j / 1000);
        }
    }
}
