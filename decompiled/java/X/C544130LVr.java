package X;

/* JADX INFO: renamed from: X.0LVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProR2VTask", f = "EditorProR2VTask.kt", l = {336, 340}, m = "cancel")
public final class C544130LVr extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543980LVc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544130LVr(C543980LVc c543980LVc, InterfaceC1364105Vn<? super C544130LVr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543980LVc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProR2VTask@7046.cancel$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(this);
        C1C7U.LIZIZ("EditorProR2VTask@7046.cancel$1");
        return objLJIIJ;
    }
}
