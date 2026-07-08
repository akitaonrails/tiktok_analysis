package X;

/* JADX INFO: renamed from: X.012W, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C012W implements C164B {
    public final boolean LIZ;

    public C012W() {
        this(false);
    }

    @Override // X.C164B
    public final boolean a5() {
        return false;
    }

    @Override // X.C164B
    public final String b5() {
        return null;
    }

    @Override // X.C164B
    public final Integer c5() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C012W) && this.LIZ == ((C012W) obj).LIZ;
    }

    @Override // X.C164B
    public final String getVariant() {
        return null;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoTextTranslationCacheValue(hasRequestedRealtime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C012W(boolean z) {
        this.LIZ = z;
    }
}
