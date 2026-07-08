package X;

import android.content.Intent;
import android.net.Uri;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.Profile;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202701BIu {
    public static final C1BJR LIZLLL = new C1BJR();
    public static volatile C2202701BIu LJ;
    public final LocalBroadcastManager LIZ;
    public final C2202771BJb LIZIZ;
    public Profile LIZJ;

    public C2202701BIu(LocalBroadcastManager localBroadcastManager, C2202771BJb c2202771BJb) {
        this.LIZ = localBroadcastManager;
        this.LIZIZ = c2202771BJb;
    }

    public final void LIZ(Profile profile, boolean z) {
        Profile profile2 = this.LIZJ;
        this.LIZJ = profile;
        if (z) {
            if (profile != null) {
                C2202771BJb c2202771BJb = this.LIZIZ;
                c2202771BJb.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(FollowStatusChangeMethod.PARAM_UID, profile.id);
                    jSONObject.put("first_name", profile.firstName);
                    jSONObject.put("middle_name", profile.middleName);
                    jSONObject.put("last_name", profile.lastName);
                    jSONObject.put("name", profile.name);
                    Uri uri = profile.linkUri;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = profile.pictureUri;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                    c2202771BJb.LIZ.edit().putString("com.facebook.ProfileManager.CachedProfile", C786410Ut5.J3(jSONObject)).apply();
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                this.LIZIZ.LIZ.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (profile2 == null) {
            if (profile == null) {
                return;
            }
        } else if (Intrinsics.LJFF(profile2, profile)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
        this.LIZ.LIZJ(intent);
    }
}
