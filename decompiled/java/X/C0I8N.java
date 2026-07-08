package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0I8N, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8N {
    public final C0I8J LIZ;
    public final Function0<Unit> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuoteReplyUiDataV2(unifyQuotedAndReplyPreview=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I8N(C0I8J c0i8j, Function0<Unit> function0) {
        this.LIZ = c0i8j;
        this.LIZIZ = function0;
    }
}
