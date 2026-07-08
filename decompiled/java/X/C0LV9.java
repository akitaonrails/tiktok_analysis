package X;

import com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput;

/* JADX INFO: renamed from: X.0LV9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerProgressTask", f = "AICreationServerProgressTask.kt", l = {116, 131}, m = "beginTask")
public final class C0LV9 extends AbstractC23140094w {
    public GeneralI2VServerProgressTaskInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LV4 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LV9(C0LV4 c0lv4, InterfaceC1364105Vn<? super C0LV9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lv4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerProgressTask@fd9e.beginTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILLL.LJJJLIIL(null, this);
        C1C7U.LIZIZ("AICreationServerProgressTask@fd9e.beginTask$1");
        return objLJJJLIIL;
    }
}
