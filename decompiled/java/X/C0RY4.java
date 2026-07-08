package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RY4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RY4 extends C09AY implements Function0<String> {
    public final /* synthetic */ C0RY5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RY4(C0RY5 c0ry5) {
        super(0);
        this.LL = c0ry5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostTag MakerRuntime onSelected => rootKey: ");
        C700970ReZ c700970ReZIn = this.LL.LLILLJJLI.In();
        sbLIZ.append(c700970ReZIn != null ? c700970ReZIn.LIZJ : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
