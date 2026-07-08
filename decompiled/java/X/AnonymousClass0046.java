package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0046, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0046 {
    public final Map<String, String> LIZ;

    public AnonymousClass0046() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0046) && Intrinsics.LJFF(this.LIZ, ((AnonymousClass0046) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditFundraiserPageViewState(queryParameters=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ AnonymousClass0046(int i) {
        this((Map<String, String>) C2097608Jq.LJ());
    }

    public AnonymousClass0046(Map<String, String> map) {
        this.LIZ = map;
    }
}
