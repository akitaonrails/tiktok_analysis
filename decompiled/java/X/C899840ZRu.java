package X;

/* JADX INFO: renamed from: X.0ZRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899840ZRu {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C899840ZRu)) {
            return false;
        }
        C899840ZRu c899840ZRu = (C899840ZRu) obj;
        return Float.compare(this.LIZ, c899840ZRu.LIZ) == 0 && Float.compare(this.LIZIZ, c899840ZRu.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranscribeUIConfig(waveformBottomDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", transcriptTopDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C899840ZRu(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
