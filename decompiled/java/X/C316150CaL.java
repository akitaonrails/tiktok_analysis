package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316150CaL {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Function1<String, Unit> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoCardDescriptionProperties(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", followUp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", followUpLink=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onFollowUpLinkClick=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C316150CaL(String str, String str2, String str3, Function1<? super String, Unit> function1) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = function1;
    }
}
