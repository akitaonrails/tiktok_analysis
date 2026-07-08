package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.rank.LiveOnlineAudienceEnigmaAvatarSetting;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceRefreshScope;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Map;

/* JADX INFO: renamed from: X.0esb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105710esb {
    public static long LIZ = 2000;
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final /* synthetic */ int LIZLLL = 0;

    static {
        OnlineAudienceRefreshScope onlineAudienceRefreshScope = OnlineAudienceRefreshScope.INSTANCE;
        LIZIZ = onlineAudienceRefreshScope.getValue().maxInterval * 1000;
        LIZJ = onlineAudienceRefreshScope.getValue().minInterval * 1000;
    }

    public static long LIZIZ(Map map) {
        long j;
        String str;
        if (map != null) {
            boolean zContainsKey = map.containsKey("usercount_release_interval");
            if (map != null && (str = (String) map.get("usercount_release_interval")) != null) {
                j = CastLongProtector.parseLong(str);
            } else {
                j = 0;
            }
            if (zContainsKey) {
                long j2 = LIZJ;
                if (j >= j2) {
                    j2 = j;
                }
                long j3 = LIZIZ;
                if (j > j3) {
                    j = j3;
                } else {
                    j = j2;
                }
            }
            if (j > 0) {
                LIZ = j;
            }
        }
        return LIZ;
    }

    public static boolean LIZ(User user, User user2) {
        boolean z;
        boolean z2;
        User.EnigmaInfo enigmaInfo;
        User.EnigmaInfo enigmaInfo2;
        if (!LiveOnlineAudienceEnigmaAvatarSetting.INSTANCE.getValue()) {
            return false;
        }
        if (user != null && (enigmaInfo2 = user.enigmaInfo) != null) {
            z = enigmaInfo2.isEnigmaMaskOn;
        } else {
            z = false;
        }
        if (user2 != null && (enigmaInfo = user2.enigmaInfo) != null) {
            z2 = enigmaInfo.isEnigmaMaskOn;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return false;
        }
        return true;
    }
}
