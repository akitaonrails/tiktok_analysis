package X;

/* JADX INFO: renamed from: X.0T8W, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T8W {
    public static final String LIZ(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(th.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
