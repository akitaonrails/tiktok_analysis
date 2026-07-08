package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.exp.model.ExtCacheRootPathConfigExp;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470280oMc {
    public static int LIZ(C0NKA c0nka) {
        ExtCacheRootPathConfigExp extCacheRootPathConfigExp;
        Map<String, Integer> config;
        if (c0nka != null && !TextUtils.isEmpty(c0nka.getCacheDir()) && (extCacheRootPathConfigExp = (ExtCacheRootPathConfigExp) C1474810oTv.LLJILJIL.getValue()) != null && (config = extCacheRootPathConfigExp.getConfig()) != null && config.containsKey(c0nka.getCacheDir()) && 1 == config.get(c0nka.getCacheDir()).intValue()) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1470240oMY LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        JSONObject jSONObject;
        C1470240oMY c1470240oMY;
        C1470240oMY c1470240oMY2 = null;
        if (simVideoUrlModel == null) {
            return null;
        }
        if (simVideoUrlModel.getDashVideoModelMap() != null) {
            Map<String, Object> dashVideoModelMap = simVideoUrlModel.getDashVideoModelMap();
            if (dashVideoModelMap != null && !dashVideoModelMap.isEmpty()) {
                try {
                    Object obj = dashVideoModelMap.get("enable_video_dash_reconstruct");
                    if (obj == null) {
                        obj = 0;
                    }
                    if (Intrinsics.LJFF(obj, 1)) {
                        C1470240oMY c1470240oMY3 = new C1470240oMY();
                        try {
                            c1470240oMY3.LJJIJIL(dashVideoModelMap);
                            return c1470240oMY3;
                        } catch (Throwable th) {
                            th = th;
                            c1470240oMY2 = c1470240oMY3;
                        }
                    } else {
                        C1473400oRe c1473400oRe = new C1473400oRe();
                        c1473400oRe.LIZJ(new JSONObject(dashVideoModelMap));
                        C1470240oMY c1470240oMY4 = new C1470240oMY();
                        c1470240oMY4.LJJIJLIJ(c1473400oRe);
                        try {
                            c1470240oMY = c1470240oMY4;
                            if (C1474810oTv.LJIJJLI()) {
                                C1470290oMd.LIZ(c1473400oRe);
                                return c1470240oMY4;
                            }
                            return c1470240oMY;
                        } catch (Throwable th2) {
                            th = th2;
                            c1470240oMY2 = c1470240oMY4;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                TryCatchGuardChecker.doCheck(th);
                return c1470240oMY2;
            }
            return null;
        }
        if (!TextUtils.isEmpty(simVideoUrlModel.getDashVideoModelStr())) {
            String dashVideoModelStr = simVideoUrlModel.getDashVideoModelStr();
            if (!TextUtils.isEmpty(dashVideoModelStr)) {
                try {
                    jSONObject = new JSONObject(dashVideoModelStr);
                } catch (Throwable th4) {
                    th = th4;
                    dashVideoModelStr = null;
                }
                try {
                } catch (Throwable th5) {
                    th = th5;
                    TryCatchGuardChecker.doCheck(th);
                    c1470240oMY = dashVideoModelStr;
                }
                if (jSONObject.optInt("enable_video_dash_reconstruct", 0) == 1) {
                    C1470240oMY c1470240oMY5 = new C1470240oMY();
                    c1470240oMY5.LJJIJIIJIL(jSONObject);
                    return c1470240oMY5;
                }
                C1473400oRe c1473400oRe2 = new C1473400oRe();
                c1473400oRe2.LIZJ(new JSONObject(dashVideoModelStr));
                C1470240oMY c1470240oMY6 = new C1470240oMY();
                c1470240oMY6.LJJIJLIJ(c1473400oRe2);
                c1470240oMY = c1470240oMY6;
                if (C1474810oTv.LJIJJLI()) {
                    C1470290oMd.LIZ(c1473400oRe2);
                    return c1470240oMY6;
                }
                return c1470240oMY;
            }
        }
        return null;
    }

    public static void LIZJ(InterfaceC1467050oHP interfaceC1467050oHP) {
        String str;
        if (!C1481110oe5.LIZ) {
            return;
        }
        String strLJJII = interfaceC1467050oHP.LJJII(2);
        interfaceC1467050oHP.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildVideoModel: portrait_profile_labels, iVideoModel type: ");
        if (interfaceC1467050oHP instanceof C1470240oMY) {
            str = "VideoModel";
        } else {
            str = "BareVideoModel";
        }
        sbLIZ.append(str);
        sbLIZ.append(", videoId=");
        sbLIZ.append(strLJJII);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
