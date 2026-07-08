package X;

import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;

/* JADX INFO: renamed from: X.0cF4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem", f = "QuickShareButtonAssem.kt", l = {752, 764}, m = "pickIMContact")
public final class C1004320cF4 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ QuickShareButtonAssem LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004320cF4(QuickShareButtonAssem quickShareButtonAssem, InterfaceC1364105Vn<? super C1004320cF4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = quickShareButtonAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickShareButtonAssem@fab9.pickIMContact$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objQp = this.LLILLJJLI.Qp(null, null, this);
        C1C7U.LIZIZ("QuickShareButtonAssem@fab9.pickIMContact$1");
        return objQp;
    }
}
