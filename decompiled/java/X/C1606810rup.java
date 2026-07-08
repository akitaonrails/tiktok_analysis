package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606810rup extends AbstractC1606860ruu {
    public final Boolean LLILZ;
    public final InterfaceC1398730mVD LLILZIL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoneStory(isMine=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", storyAvatarEntry=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        Boolean bool = this.LLILZ;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    @Override // X.AbstractC1606860ruu
    public final InterfaceC1398730mVD LIZ() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1606860ruu
    public final Boolean LIZIZ() {
        return this.LLILZ;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1606810rup) && Intrinsics.LJFF(((C1606810rup) obj).LLILZ, this.LLILZ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1606810rup(Boolean bool, InterfaceC1398730mVD interfaceC1398730mVD) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("none_");
        sbLIZ.append(bool);
        super(C2188811AlT.LIZIZ(sbLIZ), bool, null);
        this.LLILZ = bool;
        this.LLILZIL = interfaceC1398730mVD;
    }
}
