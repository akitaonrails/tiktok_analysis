package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.143U, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C143U extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C143V LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C143U(C143V c143v, int i) {
        super(0);
        this.LL = c143v;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onProgress(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
