package X;

/* JADX INFO: renamed from: X.0LVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProR2VTask", f = "EditorProR2VTask.kt", l = {106, 116, 125}, m = "beginTask")
public final class C544200LVy extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543980LVc LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544200LVy(C543980LVc c543980LVc, InterfaceC1364105Vn<? super C544200LVy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543980LVc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProR2VTask@7046.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, null, this);
        C1C7U.LIZIZ("EditorProR2VTask@7046.beginTask$1");
        return objLJJJJJL;
    }
}
