package X;

/* JADX INFO: renamed from: X.0LAH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.UpdateDraftBaseTask", f = "UpdateDraftBaseTask.kt", l = {40, 46, 77}, m = "execute")
public final class C0LAH extends AbstractC23140094w {
    public C0LSZ LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LAI LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LAH(C0LAI c0lai, InterfaceC1364105Vn<? super C0LAH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lai;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateDraftBaseTask@2718.execute$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("UpdateDraftBaseTask@2718.execute$1");
        return objLIZ;
    }
}
