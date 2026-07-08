package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251091D8x extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2251071D8v LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2251091D8x(C2251071D8v c2251071D8v, Object obj, float f, int i) {
        super(0);
        this.LL = c2251071D8v;
        this.LLILLJJLI = obj;
        this.LLILLL = f;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIIL(this.LLILLJJLI, this.LLILLL, this.LLILZ, false);
        return Unit.LIZ;
    }
}
