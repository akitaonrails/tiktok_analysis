package X;

import com.bytedance.android.livesdk.gift.model.GiftConfigInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0flJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139630flJ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0fmg, X.0fmp] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static C1140480fmg LIZ(GiftMessage giftMessage, InterfaceC1140970fnT interfaceC1140970fnT, List list, List list2, C0T6Z c0t6z, int i) {
        int i2;
        double dPow;
        if ((i & 4) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            list = C13BV.INSTANCE;
        }
        String str = null;
        if ((i & 16) != 0) {
            list2 = null;
        }
        Map<? extends String, ? extends String> mapLJ = c0t6z;
        if ((i & 32) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        ?? r4 = new AbstractC1140560fmo<C1140370fmV, C1140480fmg>() { // from class: X.0fmg
            {
                new C1140370fmV();
            }
        };
        REQ req = r4.LIZ;
        ((AbstractC1140160fmA) req).LJIIIZ = list;
        ((AbstractC1140160fmA) req).LJIIIIZZ = new C1140640fmw(interfaceC1140970fnT, i2, false, 4);
        ((C1140370fmV) req).LJIIJ = list2;
        Map<Integer, String> map = C1138350fjF.LIZ;
        float f = 1.0f;
        if (giftMessage != null && giftMessage.fromUser.getId() == UserService.getInstance().user().getCurrentUserId()) {
            GiftConfigInfo.RoleConfig roleConfig = C1133150far.LIZ;
            if (roleConfig != null) {
                str = roleConfig.gifter;
            }
            int iLIZ = C1133150far.LIZ(str);
            if (iLIZ != -1 && iLIZ != 0) {
                dPow = Math.pow(10.0d, ((double) iLIZ) / 20.0d);
                f = (float) dPow;
            }
        } else {
            GiftConfigInfo.RoleConfig roleConfig2 = C1133150far.LIZ;
            if (roleConfig2 != null) {
                str = roleConfig2.viewer;
            }
            int iLIZ2 = C1133150far.LIZ(str);
            if (iLIZ2 != -1 && iLIZ2 != 0) {
                dPow = Math.pow(10.0d, ((double) iLIZ2) / 20.0d);
                f = (float) dPow;
            }
        }
        REQ req2 = r4.LIZ;
        ((C1140370fmV) req2).LJIIJJI = f;
        if (mapLJ != null) {
            req2.LJI.putAll(mapLJ);
        }
        return r4;
    }
}
