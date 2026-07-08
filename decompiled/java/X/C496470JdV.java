package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0JdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496470JdV {
    public static final /* synthetic */ int LJ = 0;
    public final C495920Jcc LIZ;
    public final long LIZIZ = SystemClock.elapsedRealtime();
    public long LIZJ;
    public int LIZLLL;

    public final String LIZ() {
        C495920Jcc c495920Jcc = this.LIZ;
        C495950Jcf c495950Jcf = c495920Jcc.LIZJ;
        boolean z = c495950Jcf.LJI;
        boolean z2 = c495950Jcf.LJII;
        UserProfileEvent userProfileEvent = c495920Jcc.LJIIIIZZ;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        return z ? C489050JFv.LIZ(this.LIZ, iInteractService) : (userProfileEvent.isFromProgrammedLiveMenu || userProfileEvent.isFromProgrammedLiveFollowCard) ? !z2 ? "program_live_audience_c_anchor" : "program_live_audience_c_official_id" : ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1() ? !z2 ? "program_live_audience_c_audience" : "program_live_audience_c_official_id" : C489050JFv.LIZIZ(this.LIZ, iInteractService);
    }

    public C496470JdV(C495920Jcc c495920Jcc) {
        this.LIZ = c495920Jcc;
    }

    public static int LIZIZ(User user) {
        String str;
        if (user == null || user.getBadgeList() == null) {
            return 0;
        }
        List<BadgeStruct> badgeList = user.getBadgeList();
        if (badgeList == null) {
            badgeList = C13BV.INSTANCE;
        }
        int iLIZ = -1;
        for (BadgeStruct badgeStruct : badgeList) {
            if (badgeStruct.badgeScene == 8) {
                try {
                    CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
                    if (combineBadgeStruct != null && (str = combineBadgeStruct.str) != null) {
                        iLIZ = C0IZJ.LIZ(PatternProtector.compile("[^0-9]").matcher(str).replaceAll(""));
                    } else {
                        iLIZ = 0;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (iLIZ <= -1) {
            return -1;
        }
        return iLIZ;
    }

    public static String LIZJ(User user) {
        int i = C0JG8.LIZ[((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ND(user).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "anchor";
                }
                return "user";
            }
            return "guest";
        }
        return "user";
    }

    public static boolean LIZLLL(int i, List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((BadgeStruct) it2.next()).badgeScene == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(com.bytedance.ies.sdk.datachannel.DataChannel r20, X.C496120Jcw r21, X.C495920Jcc r22) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C496470JdV.LJ(com.bytedance.ies.sdk.datachannel.DataChannel, X.0Jcw, X.0Jcc):void");
    }
}
