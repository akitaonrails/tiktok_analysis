package X;

import Y.AkS479S0100000_17;
import com.bytedance.android.live.wallet.data.api.IExchangeApi;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletFallbackSetting;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0g24, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150020g24 implements InterfaceC1150050g27 {
    public C1150000g22 LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final C11NZ<C1150000g22> LIZ() {
        if (LiveWalletFallbackSetting.INSTANCE.getExchangeKycFallback()) {
            return C11NZ.LJJJJZ(new C1150000g22());
        }
        C1150000g22 c1150000g22 = this.LIZ;
        if (c1150000g22 != null) {
            c1150000g22.LIZIZ = true;
            return C11NZ.LJJJJZ(c1150000g22);
        }
        C480460Ism.LIZ().getClass();
        return ((IExchangeApi) C480460Ism.LIZLLL(IExchangeApi.class)).checkExchangeKyc(this.LIZIZ, this.LIZJ).LJLJI(15L, TimeUnit.SECONDS).LJJJJZI(new AkS479S0100000_17(this, 6)).LJJL(new AkS479S0100000_17(this, 7));
    }

    public final void LIZIZ(int i, int i2, int i3) {
        this.LIZIZ = i;
        this.LIZJ = i3;
        this.LIZLLL = i2;
        LIZ().LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0g25
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("KycExchangeViewModel@1af.preload$1");
                C1C7U.LIZIZ("KycExchangeViewModel@1af.preload$1");
            }
        }, new C09JN() { // from class: X.0g26
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("KycExchangeViewModel@1af.preload$2");
                C1C7U.LIZIZ("KycExchangeViewModel@1af.preload$2");
            }
        });
    }
}
