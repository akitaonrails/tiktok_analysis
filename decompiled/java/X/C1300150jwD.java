package X;

/* JADX INFO: renamed from: X.0jwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300150jwD {
    public static final void LIZ(C13IQ c13iq, Object obj) {
        if (c13iq.LIZIZ(obj)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Value cannot be cast to ");
        sbLIZ.append(c13iq.LIZLLL());
        throw new ClassCastException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T LIZIZ(C13IQ<T> c13iq, Object obj) {
        if (!c13iq.LIZIZ(obj)) {
            return null;
        }
        return obj;
    }
}
