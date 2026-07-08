package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833390xoH extends C09AY implements Function1<C19319810iC, C19319810iC> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C1833380xoG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833390xoH(long j, C1833380xoG c1833380xoG) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = c1833380xoG;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C19319810iC invoke(C19319810iC c19319810iC) {
        boolean z;
        C19319810iC c19319810iC2 = c19319810iC;
        if (this.LL == 1) {
            z = true;
        } else {
            z = false;
        }
        return C19319810iC.LJJIJL(c19319810iC2, z, null, null, true, null, false, false, false, false, null, this.LLILLJJLI.LJIIJJI, 61430);
    }
}
