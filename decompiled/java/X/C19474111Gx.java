package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [A] */
/* JADX INFO: renamed from: X.11Gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19474111Gx<A> extends C09AY implements Function1<C11H9<A>, Unit> {
    public final /* synthetic */ Function1<A, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19474111Gx(Function1<? super A, Unit> function1) {
        super(1);
        this.LL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.LL.invoke(((C11H9) obj).LIZ);
        return Unit.LIZ;
    }
}
