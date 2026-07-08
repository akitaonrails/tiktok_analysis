package X;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: renamed from: X.0ReO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700860ReO extends C09AY implements Function0<String> {
    public final /* synthetic */ C700790ReH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700860ReO(C700790ReH c700790ReH) {
        super(0);
        this.LL = c700790ReH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        List listLJJJJI;
        List listLJLLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current node ");
        C700970ReZ c700970ReZ = this.LL.node;
        String strLJJLIIIJ = null;
        sbLIZ.append(c700970ReZ != null ? c700970ReZ.LIZJ : null);
        sbLIZ.append(" --- children is ");
        C700970ReZ c700970ReZ2 = this.LL.node;
        if (c700970ReZ2 != null && (listLJJJJI = C13LP.LJJJJI(c700970ReZ2.LIZJ(AFwS243S0000000_11.get$arr$(13)))) != null && (listLJLLJ = C13LP.LJLLJ(listLJJJJI)) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(listLJLLJ, ",", null, null, 0, null, null, 62);
        }
        sbLIZ.append(strLJJLIIIJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
