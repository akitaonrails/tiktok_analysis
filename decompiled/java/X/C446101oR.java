package X;

import com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask;

/* JADX INFO: renamed from: X.01oR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask", f = "OpenLivePreparationTask.kt", l = {152, 142}, m = "execute")
public final class C446101oR extends AbstractC23140094w {
    public InterfaceC383701eN LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ OpenLivePreparationTask LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446101oR(OpenLivePreparationTask openLivePreparationTask, InterfaceC1364105Vn<? super C446101oR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = openLivePreparationTask;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("OpenLivePreparationTask@f498.execute$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(this);
        C1C7U.LIZIZ("OpenLivePreparationTask@f498.execute$1");
        return objLIZ;
    }
}
