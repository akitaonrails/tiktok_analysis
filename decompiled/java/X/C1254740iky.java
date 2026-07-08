package X;

import Y.ACallableS424S0100000_19;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.profile.business.profile.tab.presenter.UserIdResponse;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0iky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254740iky extends C1260870iur<AbstractC666100QAu<UserIdResponse>, InterfaceC1254750ikz> {
    public final String LLILZ;

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        UserIdResponse userIdResponse;
        UserIdResponse userIdResponse2;
        T t = this.LL;
        String str = null;
        String str2 = (t == 0 || (userIdResponse2 = (UserIdResponse) t.getData()) == null) ? null : userIdResponse2.user_id;
        T t2 = this.LL;
        if (t2 != 0 && (userIdResponse = (UserIdResponse) t2.getData()) != null) {
            str = userIdResponse.sec_uid;
        }
        if (str2 == null || str == null) {
            return;
        }
        ((InterfaceC1254750ikz) this.LLILLJJLI).so2(str2, str);
    }

    public C1254740iky() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append("/aweme/v1/user/uniqueid/");
        this.LLILZ = C2188811AlT.LIZIZ(sbLIZ);
        LJIIJ(new AbstractC666100QAu<UserIdResponse>() { // from class: X.0ikx
            @Override // X.AbstractC666100QAu
            public final boolean checkParams(Object... objArr) {
                if (objArr.length == 1) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC666100QAu
            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                    return false;
                }
                String str = (String) objArr[0];
                Uri.Builder builderBuildUpon = UriProtector.parse(this.LL.LLILZ).buildUpon();
                builderBuildUpon.appendQueryParameter(FollowStatusChangeMethod.PARAM_UID, str);
                C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS424S0100000_19(builderBuildUpon, 12), 0);
                return true;
            }
        });
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        ((InterfaceC1254750ikz) this.LLILLJJLI).DB0();
    }
}
