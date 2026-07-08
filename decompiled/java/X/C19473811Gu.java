package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [A, B] */
/* JADX INFO: renamed from: X.11Gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19473811Gu<A, B> extends C09AY implements Function1<C19474211Gy<A, B>, Unit> {
    public final /* synthetic */ Function2<A, B, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19473811Gu(Function2<? super A, ? super B, Unit> function2) {
        super(1);
        this.LL = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        C19474211Gy c19474211Gy = (C19474211Gy) obj;
        this.LL.invoke(c19474211Gy.LIZ, c19474211Gy.LIZIZ);
        return Unit.LIZ;
    }
}
