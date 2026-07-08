package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x5M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@InterfaceC1294060jmO
public final class C1805540x5M {
    public final C1806860x7U LIZ;
    public final LiveData<EnumC1805450x5D> LIZIZ;
    public final LiveData<C1806690x7D> LIZJ;
    public final LiveData<Integer> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1805540x5M)) {
            return false;
        }
        C1805540x5M c1805540x5M = (C1805540x5M) obj;
        return Intrinsics.LJFF(this.LIZ, c1805540x5M.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1805540x5M.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1805540x5M.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1805540x5M.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        LiveData<EnumC1805450x5D> liveData = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (liveData == null ? 0 : liveData.hashCode())) * 31) + this.LIZJ.hashCode()) * 31;
        LiveData<Integer> liveData2 = this.LIZLLL;
        return iHashCode2 + (liveData2 != null ? liveData2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletLegacyParams(kycCashbackVM=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", supplementaryNoticeToShow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", kycLiveData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", kycMaxAmountUsdLiveData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1805540x5M(C1806860x7U c1806860x7U, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, MutableLiveData mutableLiveData3) {
        this.LIZ = c1806860x7U;
        this.LIZIZ = mutableLiveData;
        this.LIZJ = mutableLiveData2;
        this.LIZLLL = mutableLiveData3;
    }
}
