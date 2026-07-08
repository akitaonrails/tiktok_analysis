package X;

import Y.AgS103S1100000_14;

/* JADX INFO: renamed from: X.0Yx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.actions.NotifyActionKt$updateNotifyState$1$invokeSuspend$$inlined$map$1$2", f = "NotifyAction.kt", l = {223}, m = "emit")
public final class C890800Yx4 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS103S1100000_14 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C890800Yx4(AgS103S1100000_14 agS103S1100000_14, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS103S1100000_14;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NotifyActionKt@caa8.updateNotifyState$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("NotifyActionKt@caa8.updateNotifyState$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
