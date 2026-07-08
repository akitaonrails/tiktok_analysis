package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AZ0 extends C09AY implements Function1<C1276580jKC, Boolean> {
    public final /* synthetic */ C1276580jKC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AZ0(C1276580jKC c1276580jKC) {
        super(1);
        this.LL = c1276580jKC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C1276580jKC c1276580jKC) {
        return Boolean.valueOf(Intrinsics.LJFF(c1276580jKC.LIZIZ, this.LL.LIZIZ));
    }
}
