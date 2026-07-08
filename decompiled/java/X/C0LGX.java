package X;

/* JADX INFO: renamed from: X.0LGX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.NleRestoreTask", f = "NleRestoreTask.kt", l = {238, 255}, m = "beginTask")
public final class C0LGX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LGV LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LGX(C0LGV c0lgv, InterfaceC1364105Vn<? super C0LGX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lgv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NleRestoreTask@613.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("NleRestoreTask@613.beginTask$1");
        return objLJJJJJL;
    }
}
