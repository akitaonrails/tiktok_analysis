package X;

import com.ss.android.ugc.nearby.inittask.InitNearbyTask;

/* JADX INFO: renamed from: X.0NRZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.nearby.inittask.InitNearbyTask", f = "InitNearbyTask.kt", l = {176}, m = "doPreloadRequest")
public final class C0NRZ extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InitNearbyTask LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NRZ(InitNearbyTask initNearbyTask, InterfaceC1364105Vn<? super C0NRZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = initNearbyTask;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InitNearbyTask@bca5.doPreloadRequest$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, null, this);
        C1C7U.LIZIZ("InitNearbyTask@bca5.doPreloadRequest$1");
        return objLIZ;
    }
}
