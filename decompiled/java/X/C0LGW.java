package X;

/* JADX INFO: renamed from: X.0LGW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.NleRestoreTask", f = "NleRestoreTask.kt", l = {78, 79, 86, 97, 108, 115, 116, 127, 152, 170, 189, 190}, m = "run")
public final class C0LGW extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C259800zU LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0LGV LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LGW(C0LGV c0lgv, InterfaceC1364105Vn<? super C0LGW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c0lgv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NleRestoreTask@613.run$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLIZ.LJFF(null, this);
        C1C7U.LIZIZ("NleRestoreTask@613.run$1");
        return objLJFF;
    }
}
