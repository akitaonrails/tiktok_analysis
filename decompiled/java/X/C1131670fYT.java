package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;

/* JADX INFO: renamed from: X.0fYT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131670fYT implements InterfaceC1134290fch {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C1144350fsv LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ InterfaceC1131100fXY LIZLLL;
    public final /* synthetic */ C1131110fXZ LJ;
    public final /* synthetic */ boolean LJFF;

    @Override // X.InterfaceC1134290fch
    public final void LIZ() {
        ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJIFFI(null, this.LIZ, Boolean.TRUE, this.LIZIZ, Long.valueOf(this.LIZJ));
        this.LIZLLL.LJJJJLI(EnumC1131060fXU.BACKPACK_SEND_SCENE_FREE_GIFT);
        this.LJ.LJJIFFI(this.LIZLLL, this.LJFF);
    }

    @Override // X.InterfaceC1134290fch
    public final void LIZIZ(boolean z) {
        if (z) {
            ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJIFFI(null, this.LIZ, Boolean.TRUE, this.LIZIZ, Long.valueOf(this.LIZJ));
        }
        InterfaceC1125350fOH interfaceC1125350fOHLJII = this.LIZLLL.LJII();
        if (interfaceC1125350fOHLJII != null) {
            interfaceC1125350fOHLJII.LIZ(new Exception("pre claim reward failed"));
        }
    }

    @Override // X.InterfaceC1134290fch
    public final void LIZJ(Throwable th) {
        ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJIFFI(th, this.LIZ, Boolean.TRUE, this.LIZIZ, Long.valueOf(this.LIZJ));
        InterfaceC1125350fOH interfaceC1125350fOHLJII = this.LIZLLL.LJII();
        if (interfaceC1125350fOHLJII != null) {
            interfaceC1125350fOHLJII.LIZ(new Exception("pre claim reward failed"));
        }
    }

    public C1131670fYT(String str, C1144350fsv c1144350fsv, long j, InterfaceC1131100fXY interfaceC1131100fXY, C1131110fXZ c1131110fXZ, boolean z) {
        this.LIZ = str;
        this.LIZIZ = c1144350fsv;
        this.LIZJ = j;
        this.LIZLLL = interfaceC1131100fXY;
        this.LJ = c1131110fXZ;
        this.LJFF = z;
    }
}
