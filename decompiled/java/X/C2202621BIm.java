package X;

import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.login.LoginClient;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1BIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202621BIm {
    public static LoginClient.Result LIZ(LoginClient.Request request, String str) {
        return new LoginClient.Result(request, EnumC2202671BIr.CANCEL, null, str, null);
    }

    public static LoginClient.Result LIZIZ(LoginClient.Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
        return new LoginClient.Result(request, EnumC2202671BIr.SUCCESS, accessToken, authenticationToken, null, null);
    }

    public static LoginClient.Result LIZJ(LoginClient.Request request, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        return new LoginClient.Result(request, EnumC2202671BIr.ERROR, null, TextUtils.join(": ", arrayList), str3);
    }
}
