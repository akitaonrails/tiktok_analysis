package X;

import java.util.Map;

/* JADX INFO: renamed from: X.04w8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1258204w8 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicCardEvent(businessType='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', scene='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', businessId='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', event='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("', params=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1258204w8(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = map;
    }
}
