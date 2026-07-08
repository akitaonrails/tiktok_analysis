package X;

import com.ss.android.ugc.aweme.model.PurchaseOption;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0s4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1613010s4p implements Serializable {
    public static final int $stable = 8;
    public final String enterFrom;
    public final int firstUnpurchasedSeqId;
    public final String groupId;
    public final C1612560s46 iapETParams;
    public final Integer index;
    public final Boolean isAutoDisplay;
    public final PurchaseOption purchaseOption;
    public final EnumC1612690s4J sourceWay;

    public final Boolean isAutoDisplay() {
        return this.isAutoDisplay;
    }

    public C1613010s4p(int i, PurchaseOption purchaseOption, Integer num, Boolean bool, String str, EnumC1612690s4J enumC1612690s4J, String str2, C1612560s46 c1612560s46) {
        this.firstUnpurchasedSeqId = i;
        this.purchaseOption = purchaseOption;
        this.index = num;
        this.isAutoDisplay = bool;
        this.groupId = str;
        this.sourceWay = enumC1612690s4J;
        this.enterFrom = str2;
        this.iapETParams = c1612560s46;
    }
}
