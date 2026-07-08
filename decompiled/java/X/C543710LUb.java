package X;

import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput;

/* JADX INFO: renamed from: X.0LUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerTask", f = "AICreationServerTask.kt", l = {135, 149}, m = "beginTask")
public final class C543710LUb extends AbstractC23140094w {
    public I2VServerTaskInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LUW LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543710LUb(C0LUW c0luw, InterfaceC1364105Vn<? super C543710LUb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0luw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerTask@593.beginTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILLL.LJJJLIIL(null, this);
        C1C7U.LIZIZ("AICreationServerTask@593.beginTask$1");
        return objLJJJLIIL;
    }
}
