package X;

import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;

/* JADX INFO: renamed from: X.0ZMA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager", f = "LightInteractionManager.kt", l = {431}, m = "getCommonResourceAsync")
public final class C0ZMA extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ LightInteractionManager LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZMA(LightInteractionManager lightInteractionManager, InterfaceC1364105Vn<? super C0ZMA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = lightInteractionManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LightInteractionManager@4bc5.getCommonResourceAsync$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJZ = this.LLILZLL.LJJZ(null, this);
        C1C7U.LIZIZ("LightInteractionManager@4bc5.getCommonResourceAsync$1");
        return objLJJZ;
    }
}
