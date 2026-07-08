package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;

/* JADX INFO: renamed from: X.0cHB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheck", f = "SmartCheck.kt", l = {65, 67, 78}, m = "check")
public final class C1005630cHB extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public ISmartCheckService LLIZ;
    public boolean LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C1005620cHA LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005630cHB(C1005620cHA c1005620cHA, InterfaceC1364105Vn<? super C1005630cHB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c1005620cHA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartCheck@835f.check$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLJI.LIZ(null, false, null, null, null, null, null, this);
        C1C7U.LIZIZ("SmartCheck@835f.check$1");
        return objLIZ;
    }
}
