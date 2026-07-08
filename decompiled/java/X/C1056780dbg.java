package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.api.SplashAdApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0dbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056780dbg {
    public static C0X52 LIZ(C1030870cvt c1030870cvt) {
        Long lValueOf;
        String curUserId;
        String strLJJIFFI;
        C0X52<String> c0x52Execute;
        C1494570ozn c1494570ozn;
        C2212201Bi6 c2212201Bi6;
        StringBuilder sb = new StringBuilder(5120);
        C2212311BiH c2212311BiHLIZIZ = C2212231Bi9.LIZIZ();
        c2212311BiHLIZIZ.LJIJI = true;
        try {
            sb.append("/api/ad/v2/ack/splash/");
            sb.append("?_unused=0");
            sb.append((CharSequence) C2212161Bi2.LJIIIIZZ());
            sb.append(c2212311BiHLIZIZ.toString());
            sb.append("&refresh_num=");
            sb.append(C2212141Bi0.LJIIIIZZ().LJIIJJI());
            if (C2212231Bi9.LJJIJIIJI != -1) {
                sb.append("&is_cold_start=");
                sb.append(C2212231Bi9.LJJIJIIJI);
            }
            sb.append("&dst_hertz=");
            sb.append(C2212231Bi9.LJJJJIZL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String string = sb.toString();
        String strLJIJJ = null;
        if (string == null) {
            return null;
        }
        SystemClock.elapsedRealtime();
        C2212191Bi5.LIZJ().getClass();
        List<C2212201Bi6> list = C2212061Bhs.LIZIZ().LIZ;
        if (list != null && (c2212201Bi6 = (C2212201Bi6) C13LP.LJJJLL(list)) != null) {
            lValueOf = Long.valueOf(c2212201Bi6.LLJI);
        } else {
            lValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append("&splashId=");
        sbLIZ.append(lValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1028550cs9 interfaceC1028550cs9LIZ = C1031100cwG.LIZ();
        if (interfaceC1028550cs9LIZ != null) {
            curUserId = interfaceC1028550cs9LIZ.getCurUserId();
        } else {
            curUserId = null;
        }
        if (!TextUtils.isEmpty(curUserId)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("&user_id=");
            sbLIZ2.append(curUserId);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        String strLIZ = C1489110oqz.LIZ("other");
        if (!TextUtils.isEmpty(strLIZ)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append("&ad_user_agent=");
            sbLIZ3.append(URLEncoder.encode(strLIZ));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append("&cmpl_enc=");
        InterfaceC1028550cs9 interfaceC1028550cs9LIZ2 = C1031100cwG.LIZ();
        if (interfaceC1028550cs9LIZ2 != null) {
            strLJJIFFI = interfaceC1028550cs9LIZ2.LJJIFFI();
        } else {
            strLJJIFFI = null;
        }
        sbLIZ4.append(strLJJIFFI);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
        SystemClock.elapsedRealtime();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(C0D80.LIZ);
        sbLIZ5.append(strLIZIZ2);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0X9S<String> c0x9sExecuteGet = ((SplashAdApi) C1056800dbi.LIZ.getValue()).executeGet(0, strLIZIZ3);
        if (c0x9sExecuteGet != null) {
            c0x52Execute = c0x9sExecuteGet.execute();
        } else {
            c0x52Execute = null;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (c1030870cvt != null) {
            Long lValueOf2 = Long.valueOf(jElapsedRealtime2 - jElapsedRealtime);
            Map<String, Long> map = c1030870cvt.LIZ;
            C1030850cvr.LIZ.getClass();
            map.put(C1030850cvr.LJI.LIZ, lValueOf2);
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("realtime_splash_request  ttnet retrofitMetrics detail time：");
        if (c0x52Execute != null && (c1494570ozn = c0x52Execute.LIZLLL) != null) {
            strLJIJJ = c1494570ozn.LJIJJ();
        }
        sbLIZ6.append(strLJIJJ);
        C2188811AlT.LIZIZ(sbLIZ6);
        return c0x52Execute;
    }
}
