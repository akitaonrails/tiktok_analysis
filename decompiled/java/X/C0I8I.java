package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0I8I, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8I {
    public final String LIZ;
    public final C0I8O LIZIZ;
    public final Function0<Unit> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuoteReplyUiData(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", media=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0I8I(String str, Function0 function0) {
        this(str, C0I8W.LIZ, function0);
    }

    public C0I8I(String str, C0I8O c0i8o, Function0<Unit> function0) {
        this.LIZ = str;
        this.LIZIZ = c0i8o;
        this.LIZJ = function0;
    }
}
