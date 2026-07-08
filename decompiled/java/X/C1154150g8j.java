package X;

/* JADX INFO: renamed from: X.0g8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154150g8j {
    public String LIZ;
    public final C13BV LIZIZ = C13BV.INSTANCE;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SyncMessage[key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isRepeatable=");
        sbLIZ.append(false);
        sbLIZ.append(", incompatibleKeys=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
