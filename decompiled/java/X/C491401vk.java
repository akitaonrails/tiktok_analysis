package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C491401vk extends AbstractC401801hI {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C491401vk) && Intrinsics.LJFF(this.LIZ, ((C491401vk) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchEffectCategoryError(category=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C491401vk(String str) {
        this.LIZ = str;
    }
}
