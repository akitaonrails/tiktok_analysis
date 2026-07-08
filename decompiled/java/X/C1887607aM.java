package X;

import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07aM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1887607aM {
    public final Function1<C869590Y9l, Boolean> LIZ;
    public final RetryInfoComponent LIZIZ;

    public C1887607aM() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1887607aM)) {
            return false;
        }
        C1887607aM c1887607aM = (C1887607aM) obj;
        return Intrinsics.LJFF(this.LIZ, c1887607aM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1887607aM.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamComponentConfig(isStreamingTriggerMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultRetryInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1887607aM(RetryInfoComponent retryInfoComponent, int i) {
        AFwS231S0000000_3 aFwS231S0000000_3;
        if ((i & 1) != 0) {
            aFwS231S0000000_3 = AFwS231S0000000_3.get$arr$(44);
        } else {
            aFwS231S0000000_3 = null;
        }
        if ((i & 2) != 0) {
            RetryInfoComponent.Companion.getClass();
            retryInfoComponent = RetryInfoComponent.EMPTY$delegate.getValue();
        }
        this.LIZ = aFwS231S0000000_3;
        this.LIZIZ = retryInfoComponent;
    }
}
