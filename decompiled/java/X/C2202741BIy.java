package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202741BIy {
    public static final C1BJ7 LJFF = new C1BJ7();
    public static C2202741BIy LJI;
    public final LocalBroadcastManager LIZ;
    public final C2202761BJa LIZIZ;
    public AccessToken LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public Date LJ = new Date(0);

    public final void LIZ() {
        final AccessToken accessToken = this.LIZJ;
        if (accessToken != null && this.LIZLLL.compareAndSet(false, true)) {
            this.LJ = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final C2202791BJd c2202791BJd = new C2202791BJd();
            GraphRequest[] graphRequestArr = new GraphRequest[2];
            C0WV8 c0wv8 = new C0WV8() { // from class: X.0WVL
                @Override // X.C0WV8
                public final void LIZIZ(C0WVK c0wvk) {
                    JSONArray jSONArrayOptJSONArray;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    Set set = hashSet;
                    Set set2 = hashSet2;
                    Set set3 = hashSet3;
                    JSONObject jSONObject = c0wvk.LIZLLL;
                    if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
                        atomicBoolean2.set(true);
                        int length = jSONArrayOptJSONArray.length();
                        if (length > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                                if (jSONObjectOptJSONObject != null) {
                                    String strOptString = jSONObjectOptJSONObject.optString("permission");
                                    String strOptString2 = jSONObjectOptJSONObject.optString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                                    if (!C0W7Q.LJIILL(strOptString) && !C0W7Q.LJIILL(strOptString2)) {
                                        String lowerCase = strOptString2.toLowerCase(Locale.US);
                                        int iHashCode = lowerCase.hashCode();
                                        if (iHashCode != -1309235419) {
                                            if (iHashCode != 280295099) {
                                                if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                                    set2.add(strOptString);
                                                }
                                            } else if (lowerCase.equals("granted")) {
                                                set.add(strOptString);
                                            }
                                        } else if (lowerCase.equals("expired")) {
                                            set3.add(strOptString);
                                        }
                                    }
                                }
                                if (i2 < length) {
                                    i = i2;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            };
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fields", "permission,status", bundle);
            String str = GraphRequest.LJIIIIZZ;
            GraphRequest graphRequestLJFF = C1BJA.LJFF(accessToken, "me/permissions", c0wv8);
            graphRequestLJFF.LIZLLL = bundle;
            C0WV6 c0wv6 = C0WV6.GET;
            graphRequestLJFF.LJIIIZ(c0wv6);
            graphRequestArr[0] = graphRequestLJFF;
            C0WV8 c0wv82 = new C0WV8() { // from class: X.1BJ1
                @Override // X.C0WV8
                public final void LIZIZ(C0WVK c0wvk) {
                    C2202791BJd c2202791BJd2 = c2202791BJd;
                    JSONObject jSONObject = c0wvk.LIZLLL;
                    if (jSONObject != null) {
                        c2202791BJd2.LIZ = jSONObject.optString("access_token");
                        c2202791BJd2.LIZIZ = jSONObject.optInt("expires_at");
                        c2202791BJd2.LIZJ = jSONObject.optInt("expires_in");
                        c2202791BJd2.LIZLLL = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                        c2202791BJd2.LJ = jSONObject.optString("graph_domain", null);
                    }
                }
            };
            String str2 = accessToken.graphDomain;
            if (str2 == null) {
                str2 = "facebook";
            }
            InterfaceC2202951BJt interfaceC2202951BJt = Intrinsics.LJFF(str2, "instagram") ? new InterfaceC2202951BJt() { // from class: X.1BJw
                @Override // X.InterfaceC2202951BJt
                public final String LIZ() {
                    return "refresh_access_token";
                }

                @Override // X.InterfaceC2202951BJt
                public final String LIZIZ() {
                    return "ig_refresh_token";
                }
            } : new InterfaceC2202951BJt() { // from class: X.1BJp
                @Override // X.InterfaceC2202951BJt
                public final String LIZ() {
                    return "oauth/access_token";
                }

                @Override // X.InterfaceC2202951BJt
                public final String LIZIZ() {
                    return "fb_extend_sso_token";
                }
            };
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("grant_type", interfaceC2202951BJt.LIZIZ(), bundle2);
            C786410Ut5.LJJJI("client_id", accessToken.applicationId, bundle2);
            C786410Ut5.LJJJI("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain", bundle2);
            GraphRequest graphRequestLJFF2 = C1BJA.LJFF(accessToken, interfaceC2202951BJt.LIZ(), c0wv82);
            graphRequestLJFF2.LIZLLL = bundle2;
            graphRequestLJFF2.LJIIIZ(c0wv6);
            graphRequestArr[1] = graphRequestLJFF2;
            C1BJ9 c1bj9 = new C1BJ9(graphRequestArr);
            C1BK9 c1bk9 = new C1BK9() { // from class: X.1BIz
                @Override // X.C1BK9
                public final void LIZIZ() throws Throwable {
                    C2202791BJd c2202791BJd2 = c2202791BJd;
                    AccessToken accessToken2 = accessToken;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    Set<String> set = hashSet;
                    Set<String> set2 = hashSet2;
                    Set<String> set3 = hashSet3;
                    C2202741BIy c2202741BIy = this;
                    String str3 = c2202791BJd2.LIZ;
                    int i = c2202791BJd2.LIZIZ;
                    Long l = c2202791BJd2.LIZLLL;
                    String str4 = c2202791BJd2.LJ;
                    try {
                        C1BJ7 c1bj7 = C2202741BIy.LJFF;
                        if (c1bj7.LIZ().LIZJ != null) {
                            AccessToken accessToken3 = c1bj7.LIZ().LIZJ;
                            if ((accessToken3 == null ? null : accessToken3.userId) == accessToken2.userId) {
                                if (!atomicBoolean2.get() && str3 == null && i == 0) {
                                    c2202741BIy.LIZLLL.set(false);
                                    return;
                                }
                                Date date = accessToken2.expires;
                                if (c2202791BJd2.LIZIZ != 0) {
                                    date = new Date(((long) c2202791BJd2.LIZIZ) * 1000);
                                } else if (c2202791BJd2.LIZJ != 0) {
                                    date = new Date((((long) c2202791BJd2.LIZJ) * 1000) + new Date().getTime());
                                }
                                if (str3 == null) {
                                    str3 = accessToken2.token;
                                }
                                String str5 = accessToken2.applicationId;
                                String str6 = accessToken2.userId;
                                if (!atomicBoolean2.get()) {
                                    set = accessToken2.permissions;
                                }
                                if (!atomicBoolean2.get()) {
                                    set2 = accessToken2.declinedPermissions;
                                }
                                if (!atomicBoolean2.get()) {
                                    set3 = accessToken2.expiredPermissions;
                                }
                                C1BJ0 c1bj0 = accessToken2.source;
                                Date date2 = new Date();
                                Date date3 = l != null ? new Date(l.longValue() * 1000) : accessToken2.dataAccessExpirationTime;
                                if (str4 == null) {
                                    str4 = accessToken2.graphDomain;
                                }
                                c1bj7.LIZ().LIZJ(new AccessToken(str3, str5, str6, set, set2, set3, c1bj0, date, date2, date3, str4), true);
                            }
                        }
                        c2202741BIy.LIZLLL.set(false);
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                c2202741BIy.LIZLLL.set(false);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
            };
            if (!((ArrayList) c1bj9.LLILLL).contains(c1bk9)) {
                ((ArrayList) c1bj9.LLILLL).add(c1bk9);
            }
            C0W7K.LIZJ(c1bj9);
            C0WP3.LIZLLL(new C1BJ8(c1bj9), FacebookSdk.LJ(), new Void[0]);
        }
    }

    public C2202741BIy(LocalBroadcastManager localBroadcastManager, C2202761BJa c2202761BJa) {
        this.LIZ = localBroadcastManager;
        this.LIZIZ = c2202761BJa;
    }

    public final void LIZIZ(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(FacebookSdk.LIZJ(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.LIZ.LIZJ(intent);
    }

    public final void LIZJ(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.LIZJ;
        this.LIZJ = accessToken;
        this.LIZLLL.set(false);
        this.LJ = new Date(0L);
        if (z) {
            if (accessToken != null) {
                C2202761BJa c2202761BJa = this.LIZIZ;
                c2202761BJa.getClass();
                try {
                    c2202761BJa.LIZ.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", C786410Ut5.J3(accessToken.LIZ())).apply();
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                this.LIZIZ.LIZ.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                C786410Ut5.B2(FacebookSdk.LIZJ());
            }
        }
        if (accessToken2 == null) {
            if (accessToken == null) {
                return;
            }
        } else if (Intrinsics.LJFF(accessToken2, accessToken)) {
            return;
        }
        LIZIZ(accessToken2, accessToken);
        Context contextLIZJ = FacebookSdk.LIZJ();
        AccessToken.Companion.getClass();
        AccessToken accessTokenLIZIZ = C2202721BIw.LIZIZ();
        AlarmManager alarmManager = (AlarmManager) C786410Ut5.H2(contextLIZJ, "alarm");
        if (!C2202721BIw.LIZJ() || accessTokenLIZIZ == null || accessTokenLIZIZ.expires == null || alarmManager == null) {
            return;
        }
        Intent intent = new Intent(contextLIZJ, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        try {
            alarmManager.set(1, accessTokenLIZIZ.expires.getTime(), PendingIntent.getBroadcast(contextLIZJ, 0, intent, 67108864));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
