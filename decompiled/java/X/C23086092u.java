package X;

/* JADX INFO: renamed from: X.092u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.storage.monitor.CreativeStorageMonitor", f = "CreativeStorageMonitor.kt", l = {39}, m = "monitorStorageSize")
public final class C23086092u extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C23085092t LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23086092u(C23085092t c23085092t, InterfaceC1364105Vn<? super C23086092u> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c23085092t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreativeStorageMonitor@b7e4.monitorStorageSize$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("CreativeStorageMonitor@b7e4.monitorStorageSize$1");
        return objLIZ;
    }
}
