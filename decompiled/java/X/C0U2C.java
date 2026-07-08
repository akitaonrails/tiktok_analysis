package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0U2C, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U2C extends C09AY implements Function1<C0U22, Boolean> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U2C(long j, long j2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C0U22 c0u22) {
        boolean z;
        C0U22 c0u222 = c0u22;
        if (c0u222.LIZ == this.LL && c0u222.LJIIIIZZ() == this.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
