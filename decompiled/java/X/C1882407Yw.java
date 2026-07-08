package X;

/* JADX INFO: renamed from: X.07Yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1882407Yw extends AbstractC1882307Yv {
    public final EnumC942670add LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1882407Yw) && this.LIZ == ((C1882407Yw) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolContent(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1882407Yw(EnumC942670add enumC942670add) {
        this.LIZ = enumC942670add;
    }
}
