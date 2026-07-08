package X;

/* JADX INFO: renamed from: X.0l9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346880l9a {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1346880l9a() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1346880l9a)) {
            return false;
        }
        C1346880l9a c1346880l9a = (C1346880l9a) obj;
        return this.LIZ == c1346880l9a.LIZ && this.LIZIZ == c1346880l9a.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarAreaState(showAvatar=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showArea=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1346880l9a(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
