package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Hx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457630Hx3 extends C09AY implements Function1<C457640Hx4, C457640Hx4> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457630Hx3(int i, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C457640Hx4 invoke(C457640Hx4 c457640Hx4) {
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        c457640Hx4.getClass();
        return new C457640Hx4(i, i2);
    }
}
