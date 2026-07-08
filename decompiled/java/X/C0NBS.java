package X;

import android.os.HandlerThread;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NBS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NBS extends C09AY implements Function0<HandlerThread> {
    public static final C0NBS LL;

    static {
        boolean zLJI = MethodIDManager.LJI(196716);
        LL = new C0NBS();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C0NBS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HandlerThread invoke() {
        HandlerThread handlerThread = new HandlerThread("record_task_manager");
        handlerThread.start();
        return handlerThread;
    }
}
