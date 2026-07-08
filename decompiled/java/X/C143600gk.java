package X;

/* JADX INFO: renamed from: X.00gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C143600gk {
    public final int LIZ;
    public final EnumC0338009w LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C143600gk)) {
            return false;
        }
        C143600gk c143600gk = (C143600gk) obj;
        return this.LIZ == c143600gk.LIZ && this.LIZIZ == c143600gk.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceBoxTrackOutput(resultCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", transResult=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C143600gk(int i, EnumC0338009w enumC0338009w) {
        this.LIZ = i;
        this.LIZIZ = enumC0338009w;
    }
}
