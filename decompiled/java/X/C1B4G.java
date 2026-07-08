package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;

/* JADX INFO: renamed from: X.1B4G, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivity", f = "SystemShareActivity.kt", l = {1376}, m = "handleVersionScopeCheck")
public final class C1B4G extends AbstractC23140094w {
    public C1402840mbq LL;
    public SystemShareActivity LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SystemShareActivity LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B4G(SystemShareActivity systemShareActivity, InterfaceC1364105Vn<? super C1B4G> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = systemShareActivity;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemShareActivity@a089.handleVersionScopeCheck$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLLLZZIL = this.LLILZ.LLLZZIL(null, this);
        C1C7U.LIZIZ("SystemShareActivity@a089.handleVersionScopeCheck$1");
        return objLLLZZIL;
    }
}
