package X;

import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;

/* JADX INFO: renamed from: X.0cBB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM", f = "RecUserAfterAuthPopupVM.kt", l = {118, 121}, m = "isAuthSyncSuccess")
public final class C1001910cBB extends AbstractC23140094w {
    public AnonymousClass0957 LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ RecUserAfterAuthPopupVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001910cBB(RecUserAfterAuthPopupVM recUserAfterAuthPopupVM, InterfaceC1364105Vn<? super C1001910cBB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = recUserAfterAuthPopupVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecUserAfterAuthPopupVM@d40f.isAuthSyncSuccess$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(null, null, this);
        C1C7U.LIZIZ("RecUserAfterAuthPopupVM@d40f.isAuthSyncSuccess$1");
        return objVQ2;
    }
}
