package X;

/* JADX INFO: renamed from: X.0LT9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VTask", f = "I2VTask.kt", l = {329, 332, 340}, m = "directFinishTask")
public final class C0LT9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543210LSd LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LT9(C543210LSd c543210LSd, InterfaceC1364105Vn<? super C0LT9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543210LSd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VTask@a318.directFinishTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJLI = this.LLILLJJLI.LJJJJLI(this);
        C1C7U.LIZIZ("I2VTask@a318.directFinishTask$1");
        return objLJJJJLI;
    }
}
