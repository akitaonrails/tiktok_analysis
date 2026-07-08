package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.160O, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160O extends C09AY implements Function1<C160C, C160C> {
    public final /* synthetic */ C160Z LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160O(C160Z c160z) {
        super(1);
        this.LL = c160z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C160C invoke(C160C c160c) {
        return C160C.LIZ(c160c, null, this.LL, null, 5);
    }
}
