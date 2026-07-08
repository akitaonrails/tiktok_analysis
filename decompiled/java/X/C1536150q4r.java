package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536150q4r extends C09AY implements Function1<C1536070q4j, Unit> {
    public final /* synthetic */ C259800zU<C1536070q4j> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536150q4r(C259800zU<C1536070q4j> c259800zU) {
        super(1);
        this.LL = c259800zU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1536070q4j c1536070q4j) {
        this.LL.element = c1536070q4j;
        return Unit.LIZ;
    }
}
