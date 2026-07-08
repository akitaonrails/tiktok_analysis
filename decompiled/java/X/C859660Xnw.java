package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xnw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.edit.TwitterPresenter", f = "TwitterPresenter.kt", l = {148, 152, 156}, m = "executeNetworkCall")
public final class C859660Xnw<T> extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0YZL LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859660Xnw(C0YZL c0yzl, InterfaceC1364105Vn<? super C859660Xnw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0yzl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwitterPresenter@7a3a.executeNetworkCall$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, this);
        C1C7U.LIZIZ("TwitterPresenter@7a3a.executeNetworkCall$1");
        return objLIZ;
    }
}
