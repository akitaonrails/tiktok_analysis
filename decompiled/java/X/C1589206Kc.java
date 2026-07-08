package X;

import com.bytedance.pumbaa.hybrid.governance.jsb.PnsJsbIframeAllowlistModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.06Kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1589206Kc {
    public static PnsJsbIframeAllowlistModel LIZIZ;
    public static final PnsJsbIframeAllowlistModel LIZ = new PnsJsbIframeAllowlistModel(new ArrayList(), new ArrayList());
    public static long LIZJ = System.currentTimeMillis();

    public static final PnsJsbIframeAllowlistModel LIZ() {
        if (LIZIZ == null || System.currentTimeMillis() - LIZJ > 300000) {
            PnsJsbIframeAllowlistModel pnsJsbIframeAllowlistModel = LIZIZ;
            if (pnsJsbIframeAllowlistModel == null) {
                pnsJsbIframeAllowlistModel = LIZ;
            }
            LIZIZ = (PnsJsbIframeAllowlistModel) C821960WMg.LIZ(PnsJsbIframeAllowlistModel.class, "pns_jsb_iframe_allowlist", pnsJsbIframeAllowlistModel);
            LIZJ = System.currentTimeMillis();
        }
        return LIZIZ;
    }
}
