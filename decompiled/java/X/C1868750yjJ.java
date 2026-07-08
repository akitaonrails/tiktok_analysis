package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868750yjJ extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1868750yjJ(C20649615rC c20649615rC) {
        super(1);
        this.LL = c20649615rC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.invoke(Boolean.valueOf(bool.booleanValue()));
        return Unit.LIZ;
    }
}
