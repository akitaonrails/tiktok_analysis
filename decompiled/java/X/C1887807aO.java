package X;

import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07aO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1887807aO {
    public final RetryInfoComponent LIZ;
    public final int LIZIZ;

    public C1887807aO() {
        this(null, 3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1887807aO)) {
            return false;
        }
        C1887807aO c1887807aO = (C1887807aO) obj;
        return Intrinsics.LJFF(this.LIZ, c1887807aO.LIZ) && this.LIZIZ == c1887807aO.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RetryConfig(retryInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentRetryCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1887807aO(RetryInfoComponent retryInfoComponent, int i) {
        this.LIZ = retryInfoComponent;
        this.LIZIZ = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1887807aO(RetryInfoComponent retryInfoComponent, int i, int i2) {
        if ((i & 1) != 0) {
            RetryInfoComponent.Companion.getClass();
            retryInfoComponent = RetryInfoComponent.EMPTY$delegate.getValue();
        }
        this(retryInfoComponent, 0);
    }
}
