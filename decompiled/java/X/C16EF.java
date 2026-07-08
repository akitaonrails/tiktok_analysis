package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.16EF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EF extends C09AY implements Function1<C16EB, C16EB> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16EF(boolean z) {
        super(1);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C16EB invoke(C16EB c16eb) {
        return C16EB.LIZ(c16eb, this.LL, false, 0, 0, 29);
    }
}
