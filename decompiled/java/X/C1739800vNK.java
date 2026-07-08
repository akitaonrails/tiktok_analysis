package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0vNK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739800vNK {
    public static final C1739800vNK LIZ = new C1739800vNK();

    public static long LIZ(PanelVoucherInfo panelVoucherInfo) {
        String str;
        Long lLJIILIIL;
        if (panelVoucherInfo != null && (str = panelVoucherInfo.voucherId) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null && lLJIILIIL.longValue() > 0) {
            return lLJIILIIL.longValue();
        }
        return -1L;
    }

    public static void LIZIZ(Context context, String str, String str2, String str3) {
        if (context != null && str != null && str.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("enter_from", str2);
            linkedHashMap.put("source_page_type", "video");
            linkedHashMap.put("previous_page", "video");
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("source_content_id", str3);
            try {
                SmartRouter.buildRoute(context, UriProtector.parse(str).buildUpon().appendQueryParameter("track_params", C1741890vQh.LJIIIIZZ(linkedHashMap)).build().toString()).open();
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
