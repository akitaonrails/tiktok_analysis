package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0622, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0622 {
    public final Boolean LIZ;
    public final Boolean LIZIZ;

    public AnonymousClass0622() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0622)) {
            return false;
        }
        AnonymousClass0622 anonymousClass0622 = (AnonymousClass0622) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0622.LIZ) && Intrinsics.LJFF(this.LIZIZ, anonymousClass0622.LIZIZ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.LIZIZ;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotSwitchUpdate(enableSuggestedReply=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableAutoReply=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0622(Boolean bool, Boolean bool2, int i) {
        bool = (i & 1) != 0 ? null : bool;
        bool2 = (i & 2) != 0 ? null : bool2;
        this.LIZ = bool;
        this.LIZIZ = bool2;
    }
}
