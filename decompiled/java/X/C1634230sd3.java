package X;

/* JADX INFO: renamed from: X.0sd3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634230sd3 {
    public final Integer LIZ;
    public final String LIZIZ;

    public C1634230sd3() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoStickerDownloadInfo(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1634230sd3(Integer num, String str) {
        this.LIZ = num;
        this.LIZIZ = str;
    }
}
