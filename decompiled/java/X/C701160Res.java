package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Res, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701160Res extends C09AY implements Function0<String> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C700970ReZ LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701160Res(long j, C700970ReZ c700970ReZ, long j2) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = c700970ReZ;
        this.LLILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(" --- ");
        sbLIZ.append(this.LLILLJJLI.LIZJ);
        sbLIZ.append(" --- doExecuteExchangeWithAssem end, duration: ");
        sbLIZ.append(this.LL - this.LLILLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
