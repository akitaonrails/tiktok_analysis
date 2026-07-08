package X;

import com.ss.android.ugc.aweme.pns.consent.core.network.LightConsentRecord;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ywO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876860ywO {
    public final String LIZ;
    public final EnumC1876780ywG LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final Function1<LightConsentRecord, Boolean> LJFF;
    public final String LJI;

    public C1876860ywO() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConsentRecord(entityKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", businessFlow=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", collectionPointId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", forceUpdateWithConsistencyStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", shouldProceedWhenUpdate=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1876860ywO(String str, EnumC1876780ywG enumC1876780ywG, String str2, String str3, Function1 function1, String str4, int i) {
        str3 = (i & 8) != 0 ? "" : str3;
        function1 = (i & 32) != 0 ? null : function1;
        str4 = (i & 64) != 0 ? null : str4;
        this.LIZ = str;
        this.LIZIZ = enumC1876780ywG;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = false;
        this.LJFF = function1;
        this.LJI = str4;
    }
}
