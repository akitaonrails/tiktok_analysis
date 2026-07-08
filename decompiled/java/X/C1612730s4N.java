package X;

import com.ss.android.ugc.aweme.model.PurchaseOption;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s4N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612730s4N implements Serializable {
    public static final int $stable = 8;
    public final int anchorNumber;
    public final EnumC1612760s4Q entrySource;
    public final Integer firstUnpurchasedSeqId;
    public final boolean hasIntroVideo;
    public final boolean isAd;
    public final boolean multiAnchor;
    public final Set<Long> optimisticallyUnlockedVideoIds;
    public final Integer preselectIndex;
    public final List<PurchaseOption> purchaseOptions;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1612730s4N)) {
            return false;
        }
        C1612730s4N c1612730s4N = (C1612730s4N) obj;
        return this.entrySource == c1612730s4N.entrySource && this.isAd == c1612730s4N.isAd && Intrinsics.LJFF(this.purchaseOptions, c1612730s4N.purchaseOptions) && Intrinsics.LJFF(this.firstUnpurchasedSeqId, c1612730s4N.firstUnpurchasedSeqId) && this.anchorNumber == c1612730s4N.anchorNumber && this.multiAnchor == c1612730s4N.multiAnchor && this.hasIntroVideo == c1612730s4N.hasIntroVideo && Intrinsics.LJFF(this.preselectIndex, c1612730s4N.preselectIndex) && Intrinsics.LJFF(this.optimisticallyUnlockedVideoIds, c1612730s4N.optimisticallyUnlockedVideoIds);
    }

    public final boolean isAd() {
        return this.isAd;
    }

    public C1612730s4N(EnumC1612760s4Q enumC1612760s4Q, boolean z, List<PurchaseOption> list, Integer num, int i, boolean z2, boolean z3, Integer num2, Set<Long> set) {
        this.entrySource = enumC1612760s4Q;
        this.isAd = z;
        this.purchaseOptions = list;
        this.firstUnpurchasedSeqId = num;
        this.anchorNumber = i;
        this.multiAnchor = z2;
        this.hasIntroVideo = z3;
        this.preselectIndex = num2;
        this.optimisticallyUnlockedVideoIds = set;
    }
}
