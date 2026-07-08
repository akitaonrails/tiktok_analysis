package X;

import com.bytedance.forest.model.RequestParams;

/* JADX INFO: renamed from: X.06I2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.res.StreakSharePanelResProvider", f = "StreakSharePanelResProvider.kt", l = {167}, m = "fetchRes")
public final class C06I2 extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public Object LLILLL;
    public RequestParams LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1583706Hz LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06I2(C1583706Hz c1583706Hz, InterfaceC1364105Vn<? super C06I2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1583706Hz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakSharePanelResProvider@14bc.fetchRes$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILZLL.LJIIIIZZ(0, this);
        C1C7U.LIZIZ("StreakSharePanelResProvider@14bc.fetchRes$1");
        return objLJIIIIZZ;
    }
}
