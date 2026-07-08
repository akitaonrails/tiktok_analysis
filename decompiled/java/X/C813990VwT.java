package X;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813990VwT {
    public static final C813990VwT LIZ = new C813990VwT();
    public static final C814020VwW LIZIZ = C814020VwW.LL;
    public static final C814000VwU LIZJ = C814000VwU.LL;
    public static final C814010VwV LIZLLL = C814010VwV.LL;
    public static NotificationManager LJ;
    public static int LJFF;
    public static int LJI;

    public static NotificationManager LIZIZ(Context context) {
        NotificationManager notificationManager = LJ;
        if (notificationManager == null) {
            NotificationManager notificationManager2 = (NotificationManager) C786410Ut5.H2(context, "notification");
            LJ = notificationManager2;
            return notificationManager2;
        }
        return notificationManager;
    }

    public static void LIZ(Context context, Set set, Set set2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushMsgManager.clearJustCanceledGroupsIfEmpty(groups_cnt: ");
        sbLIZ.append(set.size());
        sbLIZ.append(", ids_cnt:");
        sbLIZ.append(set2.size());
        sbLIZ.append(")……");
        C2188811AlT.LIZIZ(sbLIZ);
        if (!set.isEmpty()) {
            try {
                NotificationManager notificationManagerLIZIZ = LIZIZ(context);
                StatusBarNotification[] activeNotifications = notificationManagerLIZIZ.getActiveNotifications();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("PushMsgManager.clearJustCanceledGroupsIfEmpty(");
                    sbLIZ2.append(str);
                    sbLIZ2.append(')');
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (activeNotifications != null) {
                        int length = activeNotifications.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                StatusBarNotification statusBarNotification = activeNotifications[i];
                                if (!Intrinsics.LJFF(statusBarNotification.getNotification().getGroup(), str) || Intrinsics.LJFF(statusBarNotification.getTag(), "app_summary_tag") || set2.contains(Integer.valueOf(statusBarNotification.getId()))) {
                                    i++;
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("PushMsgManager.clearJustCanceledGroupsIfEmpty() - ");
                                    sbLIZ3.append(str);
                                    sbLIZ3.append(" not empty!");
                                    C2188811AlT.LIZIZ(sbLIZ3);
                                    break;
                                }
                            } else {
                                int length2 = activeNotifications.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length2) {
                                        StatusBarNotification statusBarNotification2 = activeNotifications[i2];
                                        if (Intrinsics.LJFF(statusBarNotification2.getNotification().getGroup(), str) && Intrinsics.LJFF(statusBarNotification2.getTag(), "app_summary_tag")) {
                                            notificationManagerLIZIZ.cancel(statusBarNotification2.getTag(), statusBarNotification2.getId());
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("PushMsgManager.clearJustCanceledGroupsIfEmpty() - cancel ");
                                            sbLIZ4.append(str);
                                            sbLIZ4.append(" summary.");
                                            C2188811AlT.LIZIZ(sbLIZ4);
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("PushMsgManager.clearJustCanceledGroupsIfEmpty() Exception!!! ");
                sbLIZ5.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ5);
            }
        }
    }
}
