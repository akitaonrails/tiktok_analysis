package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0idb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250170idb {
    public static final C1250170idb LIZ = new C1250170idb();

    public static C1245150iVV LIZ(float f, String str) {
        boolean z;
        Aweme aweme;
        User curUser;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (aweme = C1245100iVQ.LIZ.get(str)) == null || (curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser()) == null) {
            return null;
        }
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        curUser.setProfileBackgroundMediaType(2);
        curUser.setProfileBackgroundAweme(aweme);
        curUser.setProfileBackgroundOffsetRatio(fLIZLLL);
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJIL(curUser);
        try {
            C1251850igJ c1251850igJ = C1251850igJ.LIZ;
            C1250160ida.LIZ.getClass();
            ProfileUser profileUser = C1250160ida.LIZIZ;
            AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(711);
            c1251850igJ.getClass();
            ProfileUser profileUserLJIILIIL = C1251850igJ.LJIILIIL(curUser, profileUser, true, aFwS257S0000000_19);
            if (profileUserLJIILIIL != null) {
                C1250160ida.LIZ.getClass();
                C1250160ida.LIZJ(profileUserLJIILIIL, false);
                return new C1245150iVV(curUser, profileUserLJIILIIL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            C1251850igJ.LIZ.getClass();
            n nVar = C1251850igJ.LIZJ;
            c1250680ieQ.getClass();
            C1250680ieQ.LJ(nVar, e);
        }
        return null;
    }
}
