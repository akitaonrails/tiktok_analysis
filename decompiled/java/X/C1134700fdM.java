package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fdM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1134700fdM extends C2217421BqW implements Function1<Long, Unit> {
    public C1134700fdM(TaskManagerV2 taskManagerV2) {
        super(1, taskManagerV2, TaskManagerV2.class, "onDateSwitch", "onDateSwitch(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        this.receiver.getClass();
        TaskManagerV2.LJIILIIL(jLongValue);
        return Unit.LIZ;
    }
}
