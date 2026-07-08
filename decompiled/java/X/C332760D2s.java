package X;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332760D2s {
    public final Bundle LIZ;
    public final C332730D2p LIZIZ;
    public final Map<String, String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332760D2s)) {
            return false;
        }
        C332760D2s c332760D2s = (C332760D2s) obj;
        return Intrinsics.LJFF(this.LIZ, c332760D2s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c332760D2s.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c332760D2s.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnestepCheckoutArgs(entryArgs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pdpLaunchArgs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initialSelectedSkuOptions=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332760D2s(Bundle bundle, C332730D2p c332730D2p, Map<String, String> map) {
        this.LIZ = bundle;
        this.LIZIZ = c332730D2p;
        this.LIZJ = map;
    }
}
