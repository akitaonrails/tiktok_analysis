package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.062Z, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C062Z {
    public final String LIZ;
    public final String LIZIZ;
    public final Function0<Unit> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMCommonBannerData(noticeCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", jumpUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dismissAction=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C062Z(String str, String str2, Function0<Unit> function0) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = function0;
    }
}
