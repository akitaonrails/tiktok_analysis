package X;

import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.10sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19384910sh {
    public static final C01GW<Integer> LJFF = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(440));
    public final EnumC19384410sc LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public Integer LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append("{Limits: port(");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("), land(");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(")}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19384910sh(EnumC19384410sc enumC19384410sc, Integer num, Integer num2, int i) {
        enumC19384410sc = (i & 1) != 0 ? EnumC19384410sc.DEFAULT : enumC19384410sc;
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 8) != 0 ? null : num2;
        this.LIZ = enumC19384410sc;
        this.LIZIZ = null;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = null;
    }
}
