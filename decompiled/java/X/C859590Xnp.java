package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Xnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.edit.TwitterPresenter$bindTwitter$2$response$2", f = "TwitterPresenter.kt", l = {}, m = "invokeSuspend")
public final class C859590Xnp extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YZL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859590Xnp(C0YZL c0yzl, InterfaceC1364105Vn<? super C859590Xnp> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c0yzl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859590Xnp(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwitterPresenter@7a3a.bindTwitter$2$response$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ("Failed to store data to TikTok server", "send_token_to_sever");
        this.LL.LLILLJJLI.Kv0(null, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TwitterPresenter@7a3a.bindTwitter$2$response$2");
        return unit;
    }
}
