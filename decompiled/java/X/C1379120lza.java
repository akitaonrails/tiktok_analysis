package X;

import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.longpress.ILPPCustomLogic;
import com.ss.android.ugc.aweme.longpress.LPPProtocol;
import com.ss.android.ugc.aweme.longpress.LongPressComponent;
import com.ss.android.ugc.aweme.longpress.LongPressStructure;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379120lza {
    public static final C1379120lza LIZ = new C1379120lza();
    public static final LPPProtocol LIZIZ;
    public static final Keva LIZJ;
    public static LPPProtocol LIZLLL;
    public static final C01GW LJ;

    static {
        ILPPCustomLogic iLPPCustomLogic = (ILPPCustomLogic) PluggableExtentionKt.pluggableSpi$default(ILPPCustomLogic.class, false, false, false, 14, null);
        if (iLPPCustomLogic != null) {
            iLPPCustomLogic.LIZ();
        }
        LIZIZ = null;
        LIZJ = Keva.getRepo("long_press_pane_debug");
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0lzb
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                C1379120lza.LIZ.getClass();
                C1379120lza.LIZLLL = null;
            }
        });
        LJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(608));
    }

    public static LPPProtocol LIZ() {
        LPPProtocol lPPProtocol;
        if (LIZLLL == null) {
            try {
                lPPProtocol = (LPPProtocol) C0C64.LJIILLIIL().LJJIIJ(true, "long_press_panel_config", 31744, LPPProtocol.class, LIZIZ, 2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                lPPProtocol = null;
            }
            LIZLLL = lPPProtocol;
        }
        return LIZLLL;
    }

    public static boolean LIZIZ(String str) {
        return Intrinsics.LJFF(str, "long_press");
    }

    public static boolean LIZJ(Aweme aweme, String str) {
        Map<String, ? extends Map<String, LongPressStructure>> map;
        Map<String, LongPressComponent> map2;
        String str2;
        Map map3;
        LongPressStructure longPressStructure;
        List<String> list;
        ILPPCustomLogic iLPPCustomLogic = (ILPPCustomLogic) PluggableExtentionKt.pluggableSpi$default(ILPPCustomLogic.class, false, false, false, 14, null);
        if (iLPPCustomLogic != null) {
            if (iLPPCustomLogic.LIZIZ(aweme)) {
                return false;
            }
        } else if (!((Boolean) C276910AtF.LIZ.getValue()).booleanValue() && !C0N1V.LIZ(aweme)) {
            return false;
        }
        LPPProtocol lPPProtocolLIZ = LIZ();
        if (lPPProtocolLIZ == null || (map = lPPProtocolLIZ.originScenes) == null || map.isEmpty() || (map2 = lPPProtocolLIZ.componentMap) == null || map2.isEmpty() || (str2 = lPPProtocolLIZ.rootKey) == null || str2.length() == 0 || (map3 = (Map) ((HashMap) lPPProtocolLIZ.LIZ.getValue()).get(str)) == null || map3.isEmpty() || (longPressStructure = (LongPressStructure) map3.get(lPPProtocolLIZ.rootKey)) == null || (list = longPressStructure.children) == null || list.isEmpty()) {
            return false;
        }
        if (iLPPCustomLogic != null) {
            iLPPCustomLogic.LIZJ();
        } else if (((InterfaceC1616630sAf) LJ.getValue()).LJIIJ().isPad() == 1) {
            return false;
        }
        if (!C0T6L.LIZLLL()) {
            return true;
        }
        return LIZJ.getBoolean("lpp_switch", true);
    }

    public static boolean LIZLLL(SharePackage sharePackage, String str) {
        Bundle bundle;
        if (sharePackage == null || (bundle = sharePackage.extras) == null || !bundle.getBoolean("use_common_share", false)) {
            return false;
        }
        return LIZJ(C621180OYa.LIZ.LJJIJIL(sharePackage), str);
    }
}
