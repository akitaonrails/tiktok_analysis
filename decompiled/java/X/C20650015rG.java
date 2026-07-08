package X;

import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15rG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20650015rG {
    public final String LIZ;
    public final EnumC20654715s1 LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(441));

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OutreachTriggerData(outreachKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", outreachType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", triggerId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mustShow=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", forbidCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20650015rG(String str, EnumC20654715s1 enumC20654715s1, String str2, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = enumC20654715s1;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
