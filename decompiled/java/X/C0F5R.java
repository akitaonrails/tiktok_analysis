package X;

import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F5R, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5R {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Stack<C0F58> LIZJ = new Stack<>();

    public final void LIZ(C0F58 c0f58) {
        if (!this.LIZJ.isEmpty()) {
            C0F58 c0f58Pop = this.LIZJ.pop();
            if (c0f58Pop != c0f58) {
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pop MISMATCH: expected ");
                sbLIZ.append(c0f58.getValue());
                sbLIZ.append(" but got ");
                sbLIZ.append(c0f58Pop.getValue());
                sbLIZ.append(", stack may be out of sync");
                C201955140j.LIZLLL(c563650M8t, "CaptionSubPageStack", C2188811AlT.LIZIZ(sbLIZ));
            }
            C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pop target:");
            sbLIZ2.append(c0f58.getValue());
            sbLIZ2.append(" top:");
            sbLIZ2.append(c0f58Pop.getValue());
            sbLIZ2.append(" remainSize: ");
            sbLIZ2.append(this.LIZJ.size());
            C201955140j.LIZLLL(c563650M8t2, "CaptionSubPageStack", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LIZJ.isEmpty()) {
            this.LIZIZ.invoke();
        }
    }

    public final void LIZIZ(C0F58 c0f58) {
        if ((!this.LIZJ.isEmpty()) && this.LIZJ.peek() == c0f58) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("push target:");
            sbLIZ.append(c0f58.getValue());
            sbLIZ.append(" return, abort duplicate page");
            C201955140j.LIZLLL(c563650M8t, "CaptionSubPageStack", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LIZJ.push(c0f58);
        C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("push ");
        sbLIZ2.append(c0f58.getValue());
        C201955140j.LIZLLL(c563650M8t2, "CaptionSubPageStack", C2188811AlT.LIZIZ(sbLIZ2));
        this.LIZ.invoke();
    }

    public C0F5R(AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52) {
        this.LIZ = awS549S0100000_5;
        this.LIZIZ = awS549S0100000_52;
    }
}
