package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.tiktok.kmp.nuj.IKMPNewUserJourneyService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.10Qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19244710Qr implements InterfaceC591620NIi {
    public static int LIZIZ;
    public static final C19244710Qr LIZ = new C19244710Qr();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1299));

    @Override // X.InterfaceC591620NIi
    public final void LJFF() {
        LIZIZ = 1;
    }

    public static int LJIIJJI() {
        Integer numLIZLLL;
        C1602860roS.LIZ.getClass();
        if (!C1602860roS.LJ()) {
            return 0;
        }
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
        if (iNewUserDebugService == null || (numLIZLLL = iNewUserDebugService.LIZLLL()) == null || numLIZLLL.intValue() == 0) {
            return ((Number) LIZJ.getValue()).intValue();
        }
        int iIntValue = numLIZLLL.intValue();
        INewUserDebugService iNewUserDebugService2 = (INewUserDebugService) PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
        if (iNewUserDebugService2 != null) {
            iNewUserDebugService2.LJ(iIntValue, true);
        }
        return numLIZLLL.intValue();
    }

    @Override // X.InterfaceC591620NIi
    public final boolean LIZ() {
        return ((Boolean) AnonymousClass0751.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC591620NIi
    public final boolean LIZJ() {
        C0CBW c0cbw = C0CBW.LIZ;
        if (C0CBW.LIZIZ()) {
            return false;
        }
        C19245110Qv.LIZ.getClass();
        return C19245110Qv.LIZIZ();
    }

    @Override // X.InterfaceC591620NIi
    public final boolean LIZLLL() {
        C19240410Pa.LIZ.getClass();
        return C19240410Pa.LIZLLL() || C073Z.LIZIZ();
    }

    @Override // X.InterfaceC591620NIi
    public final boolean LJIIIZ() {
        C19245110Qv.LIZ.getClass();
        return C19245110Qv.LIZ();
    }

    @Override // X.InterfaceC591620NIi
    public final Map<String, Integer> LJ() {
        if (LJIIJJI() == 31) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("after_did", 0);
            linkedHashMap.put("after_login", 1);
            linkedHashMap.put("pre_is", 2);
            linkedHashMap.put("before_swipeup", 3);
            linkedHashMap.put("before_swipeup_marked", 4);
            linkedHashMap.put("cold_initial", 5);
            return linkedHashMap;
        }
        if (LJIIJJI() == 32) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("after_did", 0);
            linkedHashMap2.put("after_login", 1);
            linkedHashMap2.put("cold_initial", 2);
            linkedHashMap2.put("pre_is", 3);
            linkedHashMap2.put("before_swipeup", 4);
            linkedHashMap2.put("before_swipeup_marked", 5);
            return linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("cold_initial", 0);
        linkedHashMap3.put("after_did", 1);
        linkedHashMap3.put("after_login", 2);
        linkedHashMap3.put("pre_is", 3);
        linkedHashMap3.put("before_swipeup", 4);
        linkedHashMap3.put("before_swipeup_marked", 5);
        return linkedHashMap3;
    }

    @Override // X.InterfaceC591620NIi
    public final boolean LJI() {
        if (!C282080B3u.LIZ()) {
            return C19240710Pd.LIZIZ;
        }
        IKMPNewUserJourneyService iKMPNewUserJourneyService = (IKMPNewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(IKMPNewUserJourneyService.class, false, false, false, 14, null);
        if (iKMPNewUserJourneyService == null) {
            return false;
        }
        iKMPNewUserJourneyService.LIZ();
        return C19245010Qu.LIZJ;
    }

    @Override // X.InterfaceC591620NIi
    public final boolean LJII() {
        return C073Z.LIZIZ();
    }

    @Override // X.InterfaceC591620NIi
    public final Map<Integer, Integer> LJIIJ() {
        return LJIIJJI() == 31 ? C2097608Jq.LJIIJ(new Pair(0, 1), new Pair(2, 2), new Pair(6, 3), new Pair(4, 4), new Pair(5, 5), new Pair(1, 6), new Pair(3, 7)) : LJIIJJI() == 32 ? C2097608Jq.LJIIJ(new Pair(0, 1), new Pair(2, 2), new Pair(1, 3), new Pair(6, 4), new Pair(4, 5), new Pair(5, 6), new Pair(3, 7)) : C2097608Jq.LJIIJ(new Pair(0, 1), new Pair(1, 2), new Pair(2, 3), new Pair(3, 4), new Pair(6, 5), new Pair(4, 6), new Pair(5, 7));
    }

    @Override // X.InterfaceC591620NIi
    public final C0TFT LJIIIIZZ() {
        return C0TFT.LIZ;
    }

    @Override // X.InterfaceC591620NIi
    public final int LIZIZ(int i) {
        int i2;
        C1602860roS.LIZ.getClass();
        if (!C1602860roS.LJ() || i != 1) {
            return 0;
        }
        switch (LJIIJJI()) {
            case 31:
            case 32:
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                i2 = 31;
                break;
            default:
                i2 = 0;
                break;
        }
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
        if (iNewUserDebugService != null) {
            iNewUserDebugService.LJ(i2, false);
        }
        return i2;
    }
}
