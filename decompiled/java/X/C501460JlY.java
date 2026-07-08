package X;

import com.bytedance.android.live.network.response.RequestError;

/* JADX INFO: renamed from: X.0JlY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501460JlY {
    public static void LIZ(int i, RequestError requestError, String str, String str2) throws C477520Io2 {
        if (requestError == null) {
            requestError = new RequestError();
            requestError.prompts = C497740JfY.LJIJI(2131854910);
        }
        C477520Io2 c477520Io2 = new C477520Io2(i, requestError.url, str2);
        c477520Io2.setErrorMsg(requestError.message);
        c477520Io2.setPrompt(requestError.prompts);
        c477520Io2.setAlert(requestError.alert);
        c477520Io2.setExtra(str);
        throw c477520Io2;
    }
}
