package X;

/* JADX INFO: renamed from: X.0IC5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IC5 {
    public final boolean LIZ;
    public final EnumC873480YOk LIZIZ;

    public C0IC5() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IC5)) {
            return false;
        }
        C0IC5 c0ic5 = (C0IC5) obj;
        return this.LIZ == c0ic5.LIZ && this.LIZIZ == c0ic5.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessageOptions(disableAutoRetry=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", batchOrdering=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IC5(EnumC873480YOk enumC873480YOk, int i) {
        enumC873480YOk = (i & 2) != 0 ? EnumC873480YOk.PARALLEL : enumC873480YOk;
        this.LIZ = false;
        this.LIZIZ = enumC873480YOk;
    }
}
