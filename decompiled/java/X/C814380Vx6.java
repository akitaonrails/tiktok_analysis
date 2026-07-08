package X;

/* JADX INFO: renamed from: X.0Vx6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814380Vx6<T> {
    public static final /* synthetic */ int LIZLLL = 0;
    public final int LIZ;
    public final String LIZIZ;
    public final T LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SDKCallResult(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C814380Vx6(int i, String str, T t) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = t;
    }
}
