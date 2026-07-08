package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738460Sxw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC738140SxQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C738460Sxw(AbstractC738140SxQ abstractC738140SxQ) {
        super(0);
        this.LL = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onParentSet();
        return Unit.LIZ;
    }
}
