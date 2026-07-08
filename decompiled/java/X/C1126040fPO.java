package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: renamed from: X.0fPO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1126040fPO extends AbstractC293401Bs<Gift> {
    public final Gift LJJI;

    @Override // X.AbstractC1126600fQI
    public final String LIZJ() {
        return ((Gift) this.LIZIZ).describe;
    }

    @Override // X.AbstractC1126600fQI
    public long LJI() {
        return ((Gift) this.LIZIZ).id;
    }

    @Override // X.AbstractC1126600fQI
    public final ImageModel LJII() {
        return ((Gift) this.LIZIZ).image;
    }

    @Override // X.AbstractC1126600fQI
    public final ImageModel LJIIIIZZ() {
        return ((Gift) this.LIZIZ).leftLogo;
    }

    @Override // X.AbstractC1126600fQI
    public final String LJIIIZ() {
        return ((Gift) this.LIZIZ).name;
    }

    @Override // X.AbstractC293401Bs
    public final int LJJIIJZLJL() {
        return ((Gift) this.LIZIZ).diamondCount;
    }

    @Override // X.AbstractC1126600fQI
    public final boolean LJJIIJ() {
        return (((Gift) this.LIZIZ).type == 1 || LJIJJLI() || !(!GiftManager.inst().canSendGiftFree() ? ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LIZJ(((Gift) this.LIZIZ).diamondCount) : true)) ? false : true;
    }

    public C1126040fPO(Gift gift) {
        super(1, gift);
        this.LJJI = gift;
    }
}
