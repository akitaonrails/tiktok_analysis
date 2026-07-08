package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0VoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC808910VoH {
    boolean checkThirdPushConfig(String str, Context context);

    boolean isPushAvailable(Context context, int i);

    void registerPush(Context context, int i);

    boolean requestNotificationPermission(int i);

    boolean requestSystemNotificationPermission(String str, int i, InterfaceC809680VpW interfaceC809680VpW);

    void setAlias(Context context, String str, int i);

    void trackPush(Context context, int i, Object obj);

    void unregisterPush(Context context, int i);
}
