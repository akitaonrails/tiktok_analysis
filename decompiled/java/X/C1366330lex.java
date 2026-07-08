package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366330lex implements InterfaceC1369040ljK {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1366330lex)) {
            return false;
        }
        C1366330lex c1366330lex = (C1366330lex) obj;
        return Intrinsics.LJFF(this.LIZ, c1366330lex.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1366330lex.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendButton(onClickSend=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onClickMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1366330lex(AwS565S0100000_21 awS565S0100000_21, AwS565S0100000_21 awS565S0100000_212) {
        this.LIZ = awS565S0100000_21;
        this.LIZIZ = awS565S0100000_212;
    }
}
