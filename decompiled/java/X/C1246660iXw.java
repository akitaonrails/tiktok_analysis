package X;

/* JADX INFO: renamed from: X.0iXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246660iXw {
    public final int LIZ;
    public final int LIZIZ;

    public C1246660iXw() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1246660iXw)) {
            return false;
        }
        C1246660iXw c1246660iXw = (C1246660iXw) obj;
        return this.LIZ == c1246660iXw.LIZ && this.LIZIZ == c1246660iXw.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceCallNotificationSettingsData(inAppStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", outAppStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1246660iXw(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
