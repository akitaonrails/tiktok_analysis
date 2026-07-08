package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C350301Xp<T> extends AbstractC401801hI<T> {
    public final C0U74<T> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C350301Xp) && Intrinsics.LJFF(this.LIZ, ((C350301Xp) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecentEffectList(effectPanel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C350301Xp(C0U74<T> c0u74) {
        this.LIZ = c0u74;
    }
}
