package X;

/* JADX INFO: renamed from: X.0LVY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditI2VServerTask", f = "EditI2VServerTask.kt", l = {108, 122}, m = "beginTask")
public final class C0LVY extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LVQ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVY(C0LVQ c0lvq, InterfaceC1364105Vn<? super C0LVY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lvq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditI2VServerTask@cf5c.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("EditI2VServerTask@cf5c.beginTask$1");
        return objLJJJJJL;
    }
}
