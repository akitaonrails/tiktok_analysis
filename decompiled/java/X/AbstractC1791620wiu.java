package X;

import com.bytedance.globalpayment.iap.model.AbsIapPricingPhase;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0wiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1791620wiu {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public C1791650wix LJ;
    public List<C1791630wiv> LJFF;
    public C1792610wkV LJI;

    public final String LIZ() {
        C1791650wix c1791650wix = this.LJ;
        if (c1791650wix != null) {
            return c1791650wix.mPrice;
        }
        List<C1791630wiv> list = this.LJFF;
        if (list == null || ((ArrayList) list).size() <= 0) {
            return "";
        }
        C1791630wiv c1791630wiv = (C1791630wiv) ListProtector.get(this.LJFF, ((ArrayList) this.LJFF).size() - 1);
        int size = c1791630wiv.LIZLLL.size();
        String str = size > 0 ? ((AbsIapPricingPhase) ListProtector.get(c1791630wiv.LIZLLL, size - 1)).mPrice : "";
        for (C1791630wiv c1791630wiv2 : (ArrayList) this.LJFF) {
            if (c1791630wiv2.LIZLLL.size() == 1) {
                int size2 = c1791630wiv2.LIZLLL.size();
                return size2 > 0 ? ((AbsIapPricingPhase) ListProtector.get(c1791630wiv2.LIZLLL, size2 - 1)).mPrice : "";
            }
        }
        return str;
    }

    public final long LIZIZ() {
        C1791650wix c1791650wix = this.LJ;
        if (c1791650wix != null) {
            return c1791650wix.mPriceAmountMicros;
        }
        List<C1791630wiv> list = this.LJFF;
        if (list == null || ((ArrayList) list).size() <= 0) {
            return 0L;
        }
        long jLongValue = ((C1791630wiv) ListProtector.get(this.LJFF, ((ArrayList) this.LJFF).size() - 1)).LIZ().longValue();
        for (C1791630wiv c1791630wiv : (ArrayList) this.LJFF) {
            if (c1791630wiv.LIZLLL.size() == 1) {
                return c1791630wiv.LIZ().longValue();
            }
        }
        return jLongValue;
    }

    public final String LIZJ() {
        C1791650wix c1791650wix = this.LJ;
        if (c1791650wix != null) {
            return c1791650wix.mPriceCurrencyCode;
        }
        List<C1791630wiv> list = this.LJFF;
        if (list == null || ((ArrayList) list).size() <= 0) {
            return "";
        }
        C1791630wiv c1791630wiv = (C1791630wiv) ListProtector.get(this.LJFF, ((ArrayList) this.LJFF).size() - 1);
        int size = c1791630wiv.LIZLLL.size();
        String str = size > 0 ? ((AbsIapPricingPhase) ListProtector.get(c1791630wiv.LIZLLL, size - 1)).mPriceCurrencyCode : "";
        for (C1791630wiv c1791630wiv2 : (ArrayList) this.LJFF) {
            if (c1791630wiv2.LIZLLL.size() == 1) {
                int size2 = c1791630wiv2.LIZLLL.size();
                return size2 > 0 ? ((AbsIapPricingPhase) ListProtector.get(c1791630wiv2.LIZLLL, size2 - 1)).mPriceCurrencyCode : "";
            }
        }
        return str;
    }
}
