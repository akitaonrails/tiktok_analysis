package X;

import com.bytedance.android.livesdk.iap.AbsIapPricing;
import java.util.List;

/* JADX INFO: renamed from: X.0KSW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KSW {
    public final String LIZ;
    public final List<AbsIapPricing> LIZIZ;

    public final String LIZ() {
        String str;
        AbsIapPricing absIapPricing = (AbsIapPricing) C13LP.LJJLIIIJL(this.LIZIZ);
        return (absIapPricing == null || (str = absIapPricing.price) == null) ? "" : str;
    }

    public final String LIZIZ() {
        String str;
        AbsIapPricing absIapPricing = (AbsIapPricing) C13LP.LJJJLL(this.LIZIZ);
        return (absIapPricing == null || (str = absIapPricing.price) == null) ? "" : str;
    }

    public C0KSW(String str, List list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
