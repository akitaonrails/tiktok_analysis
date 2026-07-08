package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19652311uj implements InterfaceC19653211us {
    public final EnumC19646311tl LIZ;
    public final C19653311ut LIZIZ;

    public C19652311uj() {
        this((EnumC19646311tl) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19652311uj)) {
            return false;
        }
        C19652311uj c19652311uj = (C19652311uj) obj;
        return this.LIZ == c19652311uj.LIZ && Intrinsics.LJFF(this.LIZIZ, c19652311uj.LIZIZ);
    }

    public final int hashCode() {
        EnumC19646311tl enumC19646311tl = this.LIZ;
        int iHashCode = (enumC19646311tl == null ? 0 : enumC19646311tl.hashCode()) * 31;
        C19653311ut c19653311ut = this.LIZIZ;
        return iHashCode + (c19653311ut != null ? c19653311ut.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Status(boxState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C19652311uj(EnumC19646311tl enumC19646311tl, int i) {
        this((i & 1) != 0 ? null : enumC19646311tl, (C19653311ut) null);
    }

    public C19652311uj(EnumC19646311tl enumC19646311tl, C19653311ut c19653311ut) {
        this.LIZ = enumC19646311tl;
        this.LIZIZ = c19653311ut;
    }
}
