package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1703706ln extends AbstractC1702506lb {
    public final C0Y8T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1703706ln) && Intrinsics.LJFF(this.LIZ, ((C1703706ln) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnCreateConversationEvent(conversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1703706ln(C0Y8T c0y8t) {
        this.LIZ = c0y8t;
    }
}
