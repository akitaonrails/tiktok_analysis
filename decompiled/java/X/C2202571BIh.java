package X;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202571BIh {
    public static void LIZ() {
        String str;
        C2202721BIw c2202721BIw = AccessToken.Companion;
        c2202721BIw.getClass();
        AccessToken accessTokenLIZIZ = C2202721BIw.LIZIZ();
        if (accessTokenLIZIZ == null) {
            return;
        }
        if (!C2202721BIw.LIZJ()) {
            C2202701BIu.LIZLLL.LIZ().LIZ(null, true);
            return;
        }
        String str2 = accessTokenLIZIZ.token;
        InterfaceC2202881BJm interfaceC2202881BJm = new InterfaceC2202881BJm() { // from class: X.1BIs
            @Override // X.InterfaceC2202881BJm
            public final void LIZ(C1BJO c1bjo) {
            }

            @Override // X.InterfaceC2202881BJm
            public final void LIZIZ(JSONObject jSONObject) {
                String strOptString;
                Uri uri;
                Uri uri2 = null;
                if (jSONObject != null && (strOptString = jSONObject.optString(FollowStatusChangeMethod.PARAM_UID)) != null) {
                    String strOptString2 = jSONObject.optString("link");
                    String strOptString3 = jSONObject.optString("profile_picture", null);
                    String strOptString4 = jSONObject.optString("first_name");
                    String strOptString5 = jSONObject.optString("middle_name");
                    String strOptString6 = jSONObject.optString("last_name");
                    String strOptString7 = jSONObject.optString("name");
                    if (strOptString2 != null) {
                        uri = Uri.parse(strOptString2);
                    } else {
                        uri = null;
                    }
                    if (strOptString3 != null) {
                        uri2 = Uri.parse(strOptString3);
                    }
                    Profile profile = new Profile(uri, uri2, strOptString, strOptString4, strOptString5, strOptString6, strOptString7);
                    Profile.Companion.getClass();
                    C2202701BIu.LIZLLL.LIZ().LIZ(profile, true);
                }
            }
        };
        JSONObject jSONObject = C20338814iA.LIZ.get(str2);
        if (jSONObject != null) {
            interfaceC2202881BJm.LIZIZ(jSONObject);
            return;
        }
        C1BJ3 c1bj3 = new C1BJ3(interfaceC2202881BJm, str2);
        Bundle bundle = new Bundle();
        c2202721BIw.getClass();
        AccessToken accessTokenLIZIZ2 = C2202721BIw.LIZIZ();
        if (accessTokenLIZIZ2 == null || (str = accessTokenLIZIZ2.graphDomain) == null) {
            str = "facebook";
        }
        C786410Ut5.LJJJI("fields", Intrinsics.LJFF(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name", bundle);
        C786410Ut5.LJJJI("access_token", str2, bundle);
        GraphRequest graphRequest = new GraphRequest(null, "me", null, null, new C1BK3(), 32);
        graphRequest.LIZLLL = bundle;
        graphRequest.LJIIIZ(C0WV6.GET);
        synchronized (FacebookSdk.LIZ) {
        }
        FacebookSdk.LJIIIIZZ();
        graphRequest.LJFF = c1bj3;
        graphRequest.LIZLLL();
    }
}
