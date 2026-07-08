package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ReW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700940ReW extends C09AY implements Function0<String> {
    public final /* synthetic */ C700970ReZ LL;
    public final /* synthetic */ C700950ReX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700940ReW(C700970ReZ c700970ReZ, C700950ReX c700950ReX) {
        super(0);
        this.LL = c700970ReZ;
        this.LLILLJJLI = c700950ReX;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" --- nodeKey: ");
        sbLIZ.append(this.LL.LIZJ);
        sbLIZ.append(" --- calculateFunnelComponents --- nextResult: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
