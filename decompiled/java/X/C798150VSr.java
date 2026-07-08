package X;

import android.app.ActivityManager;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798150VSr extends C09AY implements Function0<Long> {
    public C798150VSr() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long j;
        ActivityManager activityManager;
        Context context = C798140VSq.LIZ;
        Object objH2 = context != null ? C786410Ut5.H2(context, "activity") : null;
        if (!(objH2 instanceof ActivityManager) || (activityManager = (ActivityManager) objH2) == null) {
            j = -1;
        } else {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97RCju5PUjCoUY24IAm6eVlTzjCSXpXiOLeqXMMkywYMdKCFGTY+P247ijOY", null));
            j = memoryInfo.totalMem;
        }
        return Long.valueOf(j);
    }
}
