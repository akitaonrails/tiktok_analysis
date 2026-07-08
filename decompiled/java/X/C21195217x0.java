package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PinCardConfig;

/* JADX INFO: renamed from: X.17x0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21195217x0 {
    public static final /* synthetic */ int LIZ = 0;

    public static LynxCardInfo LIZ(OecInitData oecInitData) {
        LynxCardInfo lynxCardInfo;
        String str;
        if (oecInitData != null && (lynxCardInfo = oecInitData.lynxCardInfo) != null && (str = lynxCardInfo.lynxCardSchema) != null && str.length() > 0) {
            return lynxCardInfo;
        }
        return null;
    }

    public static boolean LIZIZ(PinCardConfig pinCardConfig) {
        if (pinCardConfig != null && pinCardConfig.realCardType == 3 && pinCardConfig.realPopCardId > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(OecInitData oecInitData) {
        LynxCardInfo lynxCardInfo;
        String str;
        if (oecInitData != null && (lynxCardInfo = oecInitData.lynxCardInfo) != null && (str = lynxCardInfo.lynxCardSchema) != null && str.length() > 0) {
            return true;
        }
        return false;
    }
}
