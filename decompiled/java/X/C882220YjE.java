package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882220YjE implements InterfaceC882230YjF {
    public final Integer LL;

    public C882220YjE() {
        this(null);
    }

    public final C882220YjE copy(Integer num) {
        return new C882220YjE(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C882220YjE) && Intrinsics.LJFF(this.LL, ((C882220YjE) obj).LL);
    }

    public int hashCode() {
        Integer num = this.LL;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconAvatar(iconRes=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getIconRes() {
        return this.LL;
    }

    public C882220YjE(Integer num) {
        this.LL = num;
    }
}
