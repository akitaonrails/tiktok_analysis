package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.17xn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21200117xn {
    public final int LIZ;
    public final int LIZIZ;
    public Function1<? super Integer, Unit> LIZJ;
    public boolean LIZLLL;
    public Long LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardShowTask(cardType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isWaitingData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21200117xn(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
