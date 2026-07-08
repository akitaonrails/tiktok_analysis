package X;

import com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork;

/* JADX INFO: renamed from: X.10IH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork", f = "BaseOfflinePushWork.kt", l = {114, 128, 135}, m = "doWorkBody")
public final class C10IH extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ BaseOfflinePushWork LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10IH(BaseOfflinePushWork baseOfflinePushWork, InterfaceC1364105Vn<? super C10IH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = baseOfflinePushWork;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseOfflinePushWork@c3a9.doWorkBody$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILZ.LJIIIZ(this);
        C1C7U.LIZIZ("BaseOfflinePushWork@c3a9.doWorkBody$1");
        return objLJIIIZ;
    }
}
