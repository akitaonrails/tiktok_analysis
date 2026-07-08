package X;

import com.ss.android.ugc.aweme.im.protocal.IMAccountsProtocol;

/* JADX INFO: renamed from: X.0iQP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.protocal.IMAccountsProtocol", f = "IMAccountsProtocol.kt", l = {80}, m = "runLocalSearch")
public final class C1241990iQP extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ IMAccountsProtocol LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241990iQP(IMAccountsProtocol iMAccountsProtocol, InterfaceC1364105Vn<? super C1241990iQP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = iMAccountsProtocol;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAccountsProtocol@1ad4.runLocalSearch$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILZIL.LJIILJJIL(null, null, this);
        C1C7U.LIZIZ("IMAccountsProtocol@1ad4.runLocalSearch$1");
        return objLJIILJJIL;
    }
}
