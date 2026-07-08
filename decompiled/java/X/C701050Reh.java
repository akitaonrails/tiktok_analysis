package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Reh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701050Reh extends C09AY implements Function0<String> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C700970ReZ LLILLJJLI;
    public final /* synthetic */ C238400w2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701050Reh(C238400w2 c238400w2, C700970ReZ c700970ReZ, C238400w2 c238400w22) {
        super(0);
        this.LL = c238400w2;
        this.LLILLJJLI = c700970ReZ;
        this.LLILLL = c238400w22;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL.element);
        sbLIZ.append(" --- ");
        sbLIZ.append(this.LLILLJJLI.LIZJ);
        sbLIZ.append(" --- doExecuteTransformInternal end, duration: ");
        sbLIZ.append(this.LL.element - this.LLILLL.element);
        sbLIZ.append(" --- ");
        sbLIZ.append(C786410Ut5.u3().getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
