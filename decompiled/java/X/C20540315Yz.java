package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15Yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.serviceimp.sync.DataSyncEngineer", f = "DataSyncEngineer.kt", l = {137, 140, 143}, m = "retryWithBackoff")
public final class C20540315Yz extends AbstractC23140094w {
    public double LL;
    public Function1 LLILLJJLI;
    public C238400w2 LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C20539915Yv LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20540315Yz(C20539915Yv c20539915Yv, InterfaceC1364105Vn<? super C20540315Yz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c20539915Yv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DataSyncEngineer@9350.retryWithBackoff$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZ.LIZIZ(0, 0L, 0.0d, null, this);
        C1C7U.LIZIZ("DataSyncEngineer@9350.retryWithBackoff$1");
        return objLIZIZ;
    }
}
