package X;

import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.common.jato.scheduler.SchedulerNativeHolder;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Vlw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807460Vlw {
    public static C807460Vlw LIZIZ;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    public final void LIZ(int i, Context context) {
        boolean z;
        if (!this.LIZ.compareAndSet(false, true)) {
            return;
        }
        synchronized (SchedulerNativeHolder.class) {
            if (!SchedulerNativeHolder.LIZ && C2104908Ml.LIZIZ()) {
                SchedulerNativeHolder.LIZ = true;
            }
            z = SchedulerNativeHolder.LIZ;
        }
        if (z) {
            int i2 = context.getApplicationInfo().targetSdkVersion;
            ByteHook.init(new C0V4J().LIZ());
            if (DeviceInfoUtils.LIZLLL() || DeviceInfoUtils.LJ()) {
                i |= 1088;
            }
            SchedulerNativeHolder.nativeInit(i2, i, context);
        }
    }
}
