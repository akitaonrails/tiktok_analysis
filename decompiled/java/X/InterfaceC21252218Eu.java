package X;

import android.app.Activity;
import android.app.Application;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.18Eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC21252218Eu extends Application.ActivityLifecycleCallbacks {
    Set<Activity> LIZIZ();

    ConcurrentHashMap<Long, Long> LJJIJL(long j, long j2);

    long LJJJJL();

    void LJJJLZIJ(InterfaceC20146913sJ interfaceC20146913sJ);

    @InterfaceC1294060jmO
    Activity getTopActivity();

    boolean isAppBackground();
}
