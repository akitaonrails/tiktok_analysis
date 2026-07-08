package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;

/* JADX INFO: renamed from: X.0fdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2", f = "TaskManagerV2.kt", l = {248}, m = "taskReport")
public final class C1134650fdH extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TaskManagerV2 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134650fdH(TaskManagerV2 taskManagerV2, InterfaceC1364105Vn<? super C1134650fdH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = taskManagerV2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskManagerV2@3e9c.taskReport$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIJJLI = this.LLILLJJLI.LJIJJLI(null, 0L, this);
        C1C7U.LIZIZ("TaskManagerV2@3e9c.taskReport$1");
        return objLJIJJLI;
    }
}
