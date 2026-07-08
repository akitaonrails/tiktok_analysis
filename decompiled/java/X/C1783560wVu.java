package X;

import Y.AgS307S0100000_27;

/* JADX INFO: renamed from: X.0wVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel$onKeywordValueChanged$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ContactSelectViewModel.kt", l = {223}, m = "emit")
public final class C1783560wVu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS307S0100000_27 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783560wVu(AgS307S0100000_27 agS307S0100000_27, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS307S0100000_27;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactSelectViewModel@2c62.onKeywordValueChanged$2$invokeSuspend$$inlined$filterIsInstance$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("ContactSelectViewModel@2c62.onKeywordValueChanged$2$invokeSuspend$$inlined$filterIsInstance$1$2$1");
        return objEmit;
    }
}
