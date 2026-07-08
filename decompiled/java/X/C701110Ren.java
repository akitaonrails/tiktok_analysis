package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ren, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701110Ren extends C09AY implements Function0<String> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C700970ReZ LLILLJJLI;
    public final /* synthetic */ C238400w2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701110Ren(C238400w2 c238400w2, C700970ReZ c700970ReZ, C238400w2 c238400w22) {
        super(0);
        this.LL = c238400w2;
        this.LLILLJJLI = c700970ReZ;
        this.LLILLL = c238400w22;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("timing: ");
        sbLIZ.append(this.LL.element);
        sbLIZ.append(" --- ");
        sbLIZ.append(this.LLILLJJLI.LIZJ);
        sbLIZ.append(" --- doExecuteShrinkInternal end, duration: ");
        sbLIZ.append(this.LL.element - this.LLILLL.element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
