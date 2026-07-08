package X;

import java.util.List;

/* JADX INFO: renamed from: X.0wRA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780620wRA {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<C1780640wRC> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Offer(offerToken=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", basePlanId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", offerId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", prices=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1780620wRA(String str, String str2, String str3, List<C1780640wRC> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
    }
}
