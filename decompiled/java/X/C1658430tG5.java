package X;

import Y.AgS305S0100000_25;

/* JADX INFO: renamed from: X.0tG5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.component.BottomViewModelDelegate$special$$inlined$map$1$2", f = "BottomViewModelDelegate.kt", l = {223}, m = "emit")
public final class C1658430tG5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS305S0100000_25 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1658430tG5(AgS305S0100000_25 agS305S0100000_25, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS305S0100000_25;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomViewModelDelegate@8eb5.special$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("BottomViewModelDelegate@8eb5.special$$inlined$map$1$2$1");
        return objEmit;
    }
}
