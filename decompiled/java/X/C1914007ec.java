package X;

/* JADX INFO: renamed from: X.07ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1914007ec implements InterfaceC426790GoP {
    public final int LIZ;

    public C1914007ec() {
        this((Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1914007ec) && this.LIZ == ((C1914007ec) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Dot(dotSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1914007ec(Object obj) {
        this(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
    }

    public C1914007ec(int i) {
        this.LIZ = i;
    }
}
