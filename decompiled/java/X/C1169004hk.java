package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1169004hk implements Serializable {
    public final List<String> badges;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1169004hk) && Intrinsics.LJFF(this.badges, ((C1169004hk) obj).badges);
    }

    public int hashCode() {
        return this.badges.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpBadgesState(badges=");
        sbLIZ.append(this.badges);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1169004hk(List<String> list) {
        this.badges = list;
    }
}
