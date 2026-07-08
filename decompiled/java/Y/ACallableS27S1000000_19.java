package Y;

import X.AbstractC19852312lt;
import X.C09UZ;
import X.C1254710ikv;
import X.C1260090itb;
import X.C15O7;
import X.C1720106oR;
import X.C1C7U;
import X.C2187451AjH;
import com.ss.android.ugc.aweme.account.api.UserSettingsApi;
import com.ss.android.ugc.aweme.account.api.UserSettingsResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncServiceImpl;
import java.util.concurrent.Callable;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
public class ACallableS27S1000000_19 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS27S1000000_19 aCallableS27S1000000_19) {
        AbstractC19852312lt abstractC19852312ltAbsent;
        String str;
        C1C7U.LIZ("ProfileNameSyncServiceImpl@fa01.getSuggestedUsername$1");
        C15O7<UserSettingsResponse> c15o7UserSettings = ((UserSettingsApi.Api) UserSettingsApi.LIZ.getValue()).userSettings(2, aCallableS27S1000000_19.s0);
        c15o7UserSettings.LJIJJLI();
        if (c15o7UserSettings.LJIIL() != null && C09UZ.LIZLLL(c15o7UserSettings)) {
            if (u.LJIJI("success", c15o7UserSettings.LJIIL().message, true) && c15o7UserSettings.LJIIL().data != null) {
                UserSettingsResponse.UserSettingsData userSettingsData = c15o7UserSettings.LJIIL().data;
                if (userSettingsData != null && (str = userSettingsData.syncNickname2Username) != null) {
                    abstractC19852312ltAbsent = AbstractC19852312lt.of(str);
                } else {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZ("ProfileNameSyncServiceImpl", "empty response");
                    abstractC19852312ltAbsent = AbstractC19852312lt.absent();
                }
            } else {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LIZ("ProfileNameSyncServiceImpl", "task result failed ");
                abstractC19852312ltAbsent = AbstractC19852312lt.absent();
            }
        } else {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZ("ProfileNameSyncServiceImpl", "invalid bolt task ");
            abstractC19852312ltAbsent = AbstractC19852312lt.absent();
        }
        C1C7U.LIZIZ("ProfileNameSyncServiceImpl@fa01.getSuggestedUsername$1");
        return abstractC19852312ltAbsent;
    }

    public static final Object call$1(ACallableS27S1000000_19 aCallableS27S1000000_19) {
        String str = aCallableS27S1000000_19.s0;
        C1C7U.LIZ("ProfileManager@11df.queryUser$1L");
        User userLIZ = C1254710ikv.LIZ(str, true, null);
        C1C7U.LIZIZ("ProfileManager@11df.queryUser$1L");
        return userLIZ;
    }

    public static final Object call$2(ACallableS27S1000000_19 aCallableS27S1000000_19) {
        String str = aCallableS27S1000000_19.s0;
        C1C7U.LIZ("ProfileManager@11df.queryUserResponse$1L");
        String str2 = C1254710ikv.LIZ;
        Object objApiExecuteGetJSONObject = C1260090itb.LIZIZ.apiExecuteGetJSONObject(str, UserResponse.class, "", true, null, null);
        C1C7U.LIZIZ("ProfileManager@11df.queryUserResponse$1L");
        return objApiExecuteGetJSONObject;
    }

    public ACallableS27S1000000_19(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public ACallableS27S1000000_19(String str, ProfileNameSyncServiceImpl profileNameSyncServiceImpl, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
