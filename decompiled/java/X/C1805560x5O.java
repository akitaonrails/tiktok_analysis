package X;

import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.WalletStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x5O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805560x5O {
    public final int LIZ;
    public final int LIZIZ;
    public final WalletStruct LIZJ;
    public final ExchangeDisplayInfo LIZLLL;
    public final BalanceStruct LJ;
    public final IWalletExchange LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805560x5O)) {
            return false;
        }
        C1805560x5O c1805560x5O = (C1805560x5O) obj;
        return this.LIZ == c1805560x5O.LIZ && this.LIZIZ == c1805560x5O.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1805560x5O.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1805560x5O.LIZLLL) && Intrinsics.LJFF(this.LJ, c1805560x5O.LJ) && Intrinsics.LJFF(this.LJFF, c1805560x5O.LJFF);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        WalletStruct walletStruct = this.LIZJ;
        int iHashCode = (i + (walletStruct == null ? 0 : walletStruct.hashCode())) * 31;
        ExchangeDisplayInfo exchangeDisplayInfo = this.LIZLLL;
        int iHashCode2 = (iHashCode + (exchangeDisplayInfo == null ? 0 : exchangeDisplayInfo.hashCode())) * 31;
        BalanceStruct balanceStruct = this.LJ;
        return ((iHashCode2 + (balanceStruct != null ? balanceStruct.hashCode() : 0)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExchangeBannerInputData(exchangeType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", balanceType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", walletStruct=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", exchangeDisplayInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ugBalanceStruct=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", walletExchange=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1805560x5O(int i, int i2, WalletStruct walletStruct, ExchangeDisplayInfo exchangeDisplayInfo, BalanceStruct balanceStruct, IWalletExchange iWalletExchange) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = walletStruct;
        this.LIZLLL = exchangeDisplayInfo;
        this.LJ = balanceStruct;
        this.LJFF = iWalletExchange;
    }
}
