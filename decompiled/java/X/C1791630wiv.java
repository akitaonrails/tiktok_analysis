package X;

import com.bytedance.globalpayment.iap.model.AbsIapPricingPhase;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0wiv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791630wiv {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<C1791640wiw> LIZLLL;
    public final List<String> LJ;
    public String LJFF = "";

    public final Long LIZ() {
        int size = this.LIZLLL.size();
        if (size > 0) {
            return Long.valueOf(((AbsIapPricingPhase) ListProtector.get(this.LIZLLL, size - 1)).mPriceAmountMicros);
        }
        return 0L;
    }

    public C1791630wiv(String str, String str2, String str3, String str4, List<C1791640wiw> list, List<String> list2) {
        this.LIZ = str2;
        this.LIZIZ = str3;
        this.LIZJ = str4 == null ? "" : str4;
        this.LIZLLL = list;
        this.LJ = list2;
    }
}
