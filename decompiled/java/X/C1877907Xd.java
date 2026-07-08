package X;

import com.tiktok.strategycenterengineimpl.action.IPSPFeatureAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1877907Xd {
    public final IPSPFeatureAction LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1877907Xd) && Intrinsics.LJFF(this.LIZ, ((C1877907Xd) obj).LIZ);
    }

    public final int hashCode() {
        IPSPFeatureAction iPSPFeatureAction = this.LIZ;
        if (iPSPFeatureAction == null) {
            return 0;
        }
        return iPSPFeatureAction.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeatureCenterInfo(featureCenterStoreValueActionCallback=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1877907Xd(IPSPFeatureAction iPSPFeatureAction) {
        this.LIZ = iPSPFeatureAction;
    }
}
