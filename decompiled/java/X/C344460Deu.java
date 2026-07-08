package X;

/* JADX INFO: renamed from: X.0Deu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.service.AddYoursSendNotiInviteBehavior", f = "AddYoursInviteBehavior.kt", l = {237}, m = "onSelected")
public final class C344460Deu extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C344450Det LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344460Deu(C344450Det c344450Det, InterfaceC1364105Vn<? super C344460Deu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c344450Det;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursSendNotiInviteBehavior@9640.onSelected$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnSelected = this.LLILLL.onSelected(null, null, null, this);
        C1C7U.LIZIZ("AddYoursSendNotiInviteBehavior@9640.onSelected$1");
        return objOnSelected;
    }
}
