package X;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenManager;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0WKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821590WKv {
    public static void LIZ(AuthenticationToken authenticationToken) {
        C821610WKx c821610WKx = AuthenticationTokenManager.LIZLLL;
        AuthenticationTokenManager authenticationTokenManager = AuthenticationTokenManager.LJ;
        if (authenticationTokenManager == null) {
            synchronized (c821610WKx) {
                try {
                    authenticationTokenManager = AuthenticationTokenManager.LJ;
                    if (authenticationTokenManager == null) {
                        authenticationTokenManager = new AuthenticationTokenManager(LocalBroadcastManager.LIZ(FacebookSdk.LIZJ()), new C821600WKw());
                        AuthenticationTokenManager.LJ = authenticationTokenManager;
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        AuthenticationToken authenticationToken2 = authenticationTokenManager.LIZJ;
        authenticationTokenManager.LIZJ = authenticationToken;
        if (authenticationToken != null) {
            C821600WKw c821600WKw = authenticationTokenManager.LIZIZ;
            c821600WKw.getClass();
            try {
                c821600WKw.LIZ.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", C786410Ut5.J3(authenticationToken.LIZ())).apply();
            } catch (JSONException th) {
            }
        } else {
            authenticationTokenManager.LIZIZ.LIZ.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            C786410Ut5.B2(FacebookSdk.LIZJ());
        }
        if (authenticationToken2 == null) {
            if (authenticationToken == null) {
                return;
            }
        } else if (Intrinsics.LJFF(authenticationToken2, authenticationToken)) {
            return;
        }
        Intent intent = new Intent(FacebookSdk.LIZJ(), (Class<?>) AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken);
        authenticationTokenManager.LIZ.LIZJ(intent);
    }
}
