package X;

import com.bytedance.android.live.base.model.user.SubscribeBadge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515650KKd {
    public SubscribeBadge LIZ;
    public String LIZIZ;

    public C515650KKd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C515650KKd)) {
            return false;
        }
        C515650KKd c515650KKd = (C515650KKd) obj;
        return Intrinsics.LJFF(this.LIZ, c515650KKd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c515650KKd.LIZIZ);
    }

    public final int hashCode() {
        SubscribeBadge subscribeBadge = this.LIZ;
        return ((subscribeBadge == null ? 0 : subscribeBadge.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedCheckOrderResult(subscribeBadge=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", toastMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C515650KKd(int i) {
        this.LIZ = null;
        this.LIZIZ = "";
    }
}
