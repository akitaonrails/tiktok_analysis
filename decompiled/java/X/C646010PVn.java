package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0PVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646010PVn extends RuntimeException {
    public final int insertPosition;
    public final int listSize;

    /* JADX WARN: Illegal instructions before constructor call */
    public C646010PVn(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("decide to insert position:");
        sbLIZ.append(i);
        sbLIZ.append(",but listSize limit:");
        sbLIZ.append(i2);
        sbLIZ.append(e3.d);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.insertPosition = i;
        this.listSize = i2;
    }
}
