package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701100Rem extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C700970ReZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701100Rem(long j, C700970ReZ c700970ReZ) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = c700970ReZ;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" --- ");
        sbLIZ.append(this.LLILLJJLI.LIZJ);
        sbLIZ.append(" --- doExecuteExchangeWithAssem start --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
