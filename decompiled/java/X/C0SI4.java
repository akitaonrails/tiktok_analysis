package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SI4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SI4 extends C09AY implements Function0<Object> {
    public final /* synthetic */ C718770SHj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SI4(C718770SHj c718770SHj) {
        super(0);
        this.LL = c718770SHj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer numLIZJ = C1308910kAL.LIZJ(this.LL.LJJJJ(), this.LL.LLJ.getContext());
        C0HD1 c0hd1 = new C0HD1(numLIZJ != null ? numLIZJ.intValue() : 0, (Object) null, 6);
        c0hd1.LLILZ = new C718980SIe(this.LL);
        return c0hd1;
    }
}
