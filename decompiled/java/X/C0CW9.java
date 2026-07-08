package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;

/* JADX INFO: renamed from: X.0CW9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel", f = "MessageViewModel.kt", l = {932, 941, 957, 966}, m = "recoverMiddlePageSug")
public final class C0CW9 extends AbstractC23140094w {
    public C118300cf LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MessageViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CW9(MessageViewModel messageViewModel, InterfaceC1364105Vn<? super C0CW9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = messageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.recoverMiddlePageSug$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILLL.ZQ2(this);
        C1C7U.LIZIZ("MessageViewModel@9229.recoverMiddlePageSug$1");
        return objZQ2;
    }
}
