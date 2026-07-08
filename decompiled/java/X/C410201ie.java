package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C410201ie extends C09AY implements Function1<C410401ig, C410401ig> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C410201ie(boolean z) {
        super(1);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C410401ig invoke(C410401ig c410401ig) {
        return C410401ig.LIZ(c410401ig, false, true, new C291001Au(Boolean.valueOf(this.LL)), null, 9);
    }
}
