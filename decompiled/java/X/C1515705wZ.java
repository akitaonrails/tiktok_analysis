package X;

import Y.AgS283S0100000_2;

/* JADX INFO: renamed from: X.05wZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.titlebar.viewmodel.GroupTitleBarViewModel$observerTypingStatus$1$invokeSuspend$$inlined$map$1$2", f = "GroupTitleBarViewModel.kt", l = {223}, m = "emit")
public final class C1515705wZ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS283S0100000_2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515705wZ(AgS283S0100000_2 agS283S0100000_2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS283S0100000_2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupTitleBarViewModel@b55f.observerTypingStatus$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("GroupTitleBarViewModel@b55f.observerTypingStatus$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
