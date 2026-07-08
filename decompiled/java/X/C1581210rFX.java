package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581210rFX implements Comparable<C1581210rFX> {
    public final C1576580r84<?> LL;
    public final C2238881Ck2<?> LLILLJJLI;
    public final Runnable LLILLL;
    public float LLILZ;

    public C1581210rFX() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1581210rFX)) {
            return false;
        }
        C1581210rFX c1581210rFX = (C1581210rFX) obj;
        return Intrinsics.LJFF(this.LL, c1581210rFX.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1581210rFX.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1581210rFX.LLILLL) && Float.compare(this.LLILZ, c1581210rFX.LLILZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskWrapper(scene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", task=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + Float.floatToIntBits(this.LLILZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1581210rFX c1581210rFX) {
        return Float.compare(c1581210rFX.LLILZ, this.LLILZ);
    }

    public C1581210rFX(C1576580r84 c1576580r84, C2238881Ck2 c2238881Ck2, Runnable runnable) {
        this.LL = c1576580r84;
        this.LLILLJJLI = c2238881Ck2;
        this.LLILLL = runnable;
        this.LLILZ = 0.0f;
    }
}
