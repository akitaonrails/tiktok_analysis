package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0heX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212310heX {
    public final String LIZ = null;
    public final List<String> LIZIZ;
    public final Function1<C2189211Am7, Unit> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MsgWaitData(callerTag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", waitKeyList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", triggerBlock=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1212310heX(List list, Function1 function1) {
        this.LIZIZ = list;
        this.LIZJ = function1;
    }
}
