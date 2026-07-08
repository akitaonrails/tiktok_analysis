package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808970VoN {
    public static final C808960VoM LIZ;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            LIZ = new C808960VoM() { // from class: X.0Vqt
                public List<NotificationChannel> LIZIZ;

                @Override // X.C808960VoM, X.InterfaceC808980VoO
                public final JSONArray LIZJ(Context context) {
                    List<NotificationChannel> listLJ = LJ(context);
                    JSONArray jSONArray = new JSONArray();
                    if (listLJ != null) {
                        Iterator<NotificationChannel> it2 = listLJ.iterator();
                        while (it2.hasNext()) {
                            try {
                                jSONArray.put(new C810540Vqu(it2.next()).LIZ());
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                    return jSONArray;
                }

                public final List<NotificationChannel> LJ(Context context) {
                    List<NotificationChannel> list = this.LIZIZ;
                    if (list == null || list.isEmpty()) {
                        try {
                            this.LIZIZ = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannels();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            this.LIZIZ = Collections.emptyList();
                        }
                    }
                    return this.LIZIZ;
                }

                public static boolean LJFF(List<NotificationChannel> list, Map<String, C810540Vqu> map) {
                    if (list.size() != map.size()) {
                        return false;
                    }
                    for (NotificationChannel notificationChannel : list) {
                        C810540Vqu c810540Vqu = map.get(notificationChannel.getId());
                        if (c810540Vqu == null || c810540Vqu.LJ != notificationChannel.getImportance() || c810540Vqu.LJI != notificationChannel.getLockscreenVisibility() || c810540Vqu.LJFF != notificationChannel.canBypassDnd() || c810540Vqu.LJII != notificationChannel.shouldShowLights() || c810540Vqu.LJIIIIZZ != notificationChannel.shouldVibrate()) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap] */
                /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
                @Override // X.C808960VoM, X.InterfaceC808980VoO
                public final boolean LIZ(int i, Context context) {
                    List<NotificationChannel> listLJ;
                    String strLJJII;
                    ?? map;
                    if (super.LIZ(i, context)) {
                        return true;
                    }
                    try {
                        listLJ = LJ(context);
                        strLJJII = ((LocalFrequencySettings) C0WFE.LIZ(context, LocalFrequencySettings.class)).LJJII();
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (TextUtils.isEmpty(strLJJII)) {
                        if (listLJ != null && !listLJ.isEmpty()) {
                            return true;
                        }
                        return false;
                    }
                    JSONArray jSONArray = new JSONArray(strLJJII);
                    if (jSONArray.length() == 0) {
                        map = Collections.emptyMap();
                    } else {
                        map = new HashMap(jSONArray.length());
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                            map.put(jSONObjectOptJSONObject.optString(FollowStatusChangeMethod.PARAM_UID), new C810540Vqu(jSONObjectOptJSONObject));
                        }
                    }
                    return true ^ LJFF(listLJ, map);
                }

                @Override // X.C808960VoM, X.InterfaceC808980VoO
                public final void LIZIZ(Context context, C810540Vqu c810540Vqu) {
                    if (this.LIZ == null) {
                        this.LIZ = (NotificationManager) C786410Ut5.H2(context, "notification");
                    }
                    NotificationManager notificationManager = this.LIZ;
                    if (notificationManager == null || TextUtils.isEmpty(c810540Vqu.LIZJ) || TextUtils.isEmpty(c810540Vqu.LIZLLL) || notificationManager.getNotificationChannel(c810540Vqu.LIZJ) != null) {
                        return;
                    }
                    int i = c810540Vqu.LJ;
                    if (i < 0 || i > 5) {
                        i = 3;
                    }
                    NotificationChannel notificationChannel = new NotificationChannel(c810540Vqu.LIZJ, c810540Vqu.LIZLLL, i);
                    notificationChannel.setShowBadge(c810540Vqu.LJIIIZ);
                    notificationChannel.setDescription(c810540Vqu.LIZ);
                    notificationChannel.enableVibration(c810540Vqu.LJIIIIZZ);
                    notificationChannel.setBypassDnd(c810540Vqu.LJFF);
                    notificationChannel.enableLights(c810540Vqu.LJII);
                    notificationChannel.setLockscreenVisibility(c810540Vqu.LJI);
                    notificationManager.createNotificationChannel(notificationChannel);
                }

                @Override // X.C808960VoM, X.InterfaceC808980VoO
                public final void LIZLLL(Context context, C810540Vqu c810540Vqu) {
                    if (this.LIZ == null) {
                        this.LIZ = (NotificationManager) C786410Ut5.H2(context, "notification");
                    }
                    NotificationManager notificationManager = this.LIZ;
                    if (notificationManager == null || TextUtils.isEmpty(c810540Vqu.LIZJ) || notificationManager.getNotificationChannel(c810540Vqu.LIZJ) == null) {
                        return;
                    }
                    notificationManager.deleteNotificationChannel(c810540Vqu.LIZJ);
                }
            };
        } else {
            LIZ = new C808960VoM();
        }
    }
}
