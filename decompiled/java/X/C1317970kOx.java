package X;

/* JADX INFO: renamed from: X.0kOx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317970kOx extends IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C1317970kOx(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unpaired surrogate at index ");
        sbLIZ.append(i);
        sbLIZ.append(" of ");
        sbLIZ.append(i2);
        super(C2188811AlT.LIZIZ(sbLIZ));
    }
}
