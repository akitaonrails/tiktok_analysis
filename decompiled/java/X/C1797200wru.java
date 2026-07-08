package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797200wru extends Exception {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final Exception LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final List<Long> LLJILJIL;
    public final int LLJILJILJ;

    public final C1797200wru copy(int i, int i2, int i3, String str, String str2, String str3, Exception exc, String str4, String str5, int i4, int i5, List<Long> list) {
        return new C1797200wru(i, i2, i3, str, str2, str3, exc, str4, str5, i4, i5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1797200wru)) {
            return false;
        }
        C1797200wru c1797200wru = (C1797200wru) obj;
        return this.LL == c1797200wru.LL && this.LLILLJJLI == c1797200wru.LLILLJJLI && this.LLILLL == c1797200wru.LLILLL && Intrinsics.LJFF(this.LLILZ, c1797200wru.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1797200wru.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1797200wru.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1797200wru.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1797200wru.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1797200wru.LLJ) && this.LLJI == c1797200wru.LLJI && this.LLJIJIL == c1797200wru.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1797200wru.LLJILJIL);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI) * 31) + this.LLJIJIL) * 31) + this.LLJILJIL.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "PayErrorInfo(action=" + this.LL + ", errorCode=" + this.LLILLJJLI + ", detailCode=" + this.LLILLL + ", mappedErrorCode=" + this.LLILZ + ", mappedErrorMessage=" + this.LLILZIL + ", serviceName=" + this.LLILZLL + ", exception=" + this.LLIZ + ", productId=" + this.LLIZLLLIL + ", orderId=" + this.LLJ + ", checkOrderRetryCount=" + this.LLJI + ", internalCode=" + this.LLJIJIL + ", internalPaymentLatency=" + this.LLJILJIL + ')';
    }

    public final long getCashierShownTime() {
        if (this.LLJILJIL.size() != this.LLJILJILJ) {
            return 0L;
        }
        return ((Number) ListProtector.get(this.LLJILJIL, EnumC1794780wo0.CASHIER_RESUME.getIndex())).longValue();
    }

    public final long getFailureLatency() {
        if (this.LLJILJIL.size() != this.LLJILJILJ) {
            return 0L;
        }
        return ((Number) ListProtector.get(this.LLJILJIL, EnumC1794780wo0.PURCHASE_COMPLETED.getIndex())).longValue() - ((Number) ListProtector.get(this.LLJILJIL, EnumC1794780wo0.CASHIER_RESUME.getIndex())).longValue();
    }

    public final int getAction() {
        return this.LL;
    }

    public final int getCheckOrderRetryCount() {
        return this.LLJI;
    }

    public final int getDetailCode() {
        return this.LLILLL;
    }

    public final int getErrorCode() {
        return this.LLILLJJLI;
    }

    public final Exception getException() {
        return this.LLIZ;
    }

    public final int getInternalCode() {
        return this.LLJIJIL;
    }

    public final List<Long> getInternalPaymentLatency() {
        return this.LLJILJIL;
    }

    public final String getMappedErrorCode() {
        return this.LLILZ;
    }

    public final String getMappedErrorMessage() {
        return this.LLILZIL;
    }

    public final String getOrderId() {
        return this.LLJ;
    }

    public final List<Long> getPaymentLatency() {
        return this.LLJILJIL;
    }

    public final String getProductId() {
        return this.LLIZLLLIL;
    }

    public final String getServiceName() {
        return this.LLILZLL;
    }

    public C1797200wru(int i, int i2, int i3, String str, String str2, String str3, Exception exc, String str4, String str5, int i4, int i5, List<Long> list) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = exc;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = i4;
        this.LLJIJIL = i5;
        this.LLJILJIL = list;
        this.LLJILJILJ = 5;
    }

    public C1797200wru(int i, int i2, int i3, String str, String str2, String str3, Exception exc, String str4, String str5, int i4, int i5, List list, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, str3, exc, (i6 & 128) != 0 ? "" : str4, (i6 & 256) == 0 ? str5 : "", (i6 & 512) != 0 ? 0 : i4, (i6 & 1024) != 0 ? -1 : i5, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list);
    }
}
