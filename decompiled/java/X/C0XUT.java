package X;

import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import java.util.Date;

/* JADX INFO: renamed from: X.0XUT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XUT extends BaseLoginMethod {
    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public final boolean isHistoryLogin() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.model.BaseLoginMethod
    public final String findPlatform() {
        return getLoginMethodName().name();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0XUT(String str, CommonUserInfo commonUserInfo, Long l, int i) {
        LoginMethodName loginMethodName;
        Long l2 = l;
        CommonUserInfo commonUserInfoLIZ = commonUserInfo;
        if ((i & 2) != 0) {
            loginMethodName = LoginMethodName.PASSKEY;
        } else {
            loginMethodName = null;
        }
        if ((i & 4) != 0) {
            CommonUserInfo.Companion.getClass();
            commonUserInfoLIZ = C0XTZ.LIZ();
        }
        this(str, loginMethodName, commonUserInfoLIZ, (i & 8) != 0 ? -1L : l2, (i & 16) != 0 ? -1L : null, null, null, null);
    }

    public C0XUT(String str, LoginMethodName loginMethodName, CommonUserInfo commonUserInfo, Long l, Long l2, String str2, String str3, String str4) {
        super(str, loginMethodName, commonUserInfo, new Date(System.currentTimeMillis() + 31536000000L), l, l2, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, str2, str3, str4);
    }
}
