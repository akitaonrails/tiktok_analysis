package X;

/* JADX INFO: renamed from: X.12wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19920312wr extends IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C19920312wr(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unpaired surrogate at index ");
        sbLIZ.append(i);
        sbLIZ.append(" of ");
        sbLIZ.append(i2);
        super(C2188811AlT.LIZIZ(sbLIZ));
    }
}
