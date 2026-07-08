package X;

/* JADX INFO: renamed from: X.0Nov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605470Nov {
    public static final boolean LIZ(C605530Np1 c605530Np1, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task:");
        sbLIZ.append(str);
        sbLIZ.append(":done");
        C605540Np2 c605540Np2 = c605530Np1.LIZ.get(C2188811AlT.LIZIZ(sbLIZ));
        if (c605540Np2 != null && c605540Np2.LIZIZ) {
            return true;
        }
        return false;
    }
}
