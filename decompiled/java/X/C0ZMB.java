package X;

import com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager;

/* JADX INFO: renamed from: X.0ZMB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionManager", f = "LightInteractionManager.kt", l = {506}, m = "getAllCommonResource$im_lightinteract_impl_release")
public final class C0ZMB extends AbstractC23140094w {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ LightInteractionManager LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZMB(LightInteractionManager lightInteractionManager, InterfaceC1364105Vn<? super C0ZMB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = lightInteractionManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LightInteractionManager@4bc5.getAllCommonResource$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJLL = this.LLILZIL.LJJLL(this);
        C1C7U.LIZIZ("LightInteractionManager@4bc5.getAllCommonResource$1");
        return objLJJLL;
    }
}
