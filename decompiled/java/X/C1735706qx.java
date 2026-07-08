package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1735706qx {
    public final BusinessChatLandingMsgVM LIZ;
    public final C909290Zln LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;

    public final String LIZ(String str) {
        try {
            JSONObject bizInfoExtraMap = this.LIZIZ.getBizInfoExtraMap();
            if (bizInfoExtraMap != null) {
                String strOptString = bizInfoExtraMap.optString(str);
                if (strOptString != null) {
                    return strOptString;
                }
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String singleChatFromUserId = this.LIZIZ.getSingleChatFromUserId();
            if (singleChatFromUserId == null) {
                return "";
            }
            return singleChatFromUserId;
        }
    }

    public C1735706qx(BusinessChatLandingMsgVM businessChatLandingMsgVM, C909290Zln c909290Zln, int i) {
        this.LIZ = businessChatLandingMsgVM;
        this.LIZIZ = c909290Zln;
        this.LIZJ = i;
    }
}
