package X;

/* JADX INFO: renamed from: X.0EYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366480EYk {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C366480EYk)) {
            return false;
        }
        C366480EYk c366480EYk = (C366480EYk) obj;
        return this.LIZ == c366480EYk.LIZ && this.LIZIZ == c366480EYk.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricStickerEffectPanelConfig(isEditorPro=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", canDeSelect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C366480EYk(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
