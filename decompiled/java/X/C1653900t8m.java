package X;

import Y.AgS208S0200000_25;

/* JADX INFO: renamed from: X.0t8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.tabs.TabRepository$special$$inlined$map$1$2", f = "TabRepository.kt", l = {223}, m = "emit")
public final class C1653900t8m extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS208S0200000_25 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1653900t8m(AgS208S0200000_25 agS208S0200000_25, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS208S0200000_25;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabRepository@4123.special$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("TabRepository@4123.special$$inlined$map$1$2$1");
        return objEmit;
    }
}
