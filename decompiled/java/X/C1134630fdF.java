package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;

/* JADX INFO: renamed from: X.0fdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2", f = "TaskManagerV2.kt", l = {272}, m = "loadTasks")
public final class C1134630fdF extends AbstractC23140094w {
    public EnumC1134590fdB LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TaskManagerV2 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134630fdF(TaskManagerV2 taskManagerV2, InterfaceC1364105Vn<? super C1134630fdF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = taskManagerV2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskManagerV2@3e9c.loadTasks$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, 0, 0, null, null, false, this);
        C1C7U.LIZIZ("TaskManagerV2@3e9c.loadTasks$1");
        return objLIZ;
    }
}
