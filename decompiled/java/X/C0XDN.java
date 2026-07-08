package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0XDN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XDN {
    public static InterfaceC2210571BfT LIZ;
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();

    public static void LIZ(String str, String str2) {
        C0XDP c0xdp = C0XDP.L1;
        if (c0xdp != null && !C2093608Ic.LJ(str) && !C2093608Ic.LJ(str2)) {
            C0XCI c0xci = C0XCJ.LIZIZ;
            if (c0xci.LIZJ()) {
                C0XCH c0xch = c0xci.LJI;
                c0xch.getClass();
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    int i = C0XDQ.LIZ[c0xdp.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            ((ConcurrentHashMap) c0xch.LIZLLL).put(str, str2);
                            return;
                        }
                        return;
                    }
                    ((ConcurrentHashMap) c0xch.LJ).put(str, str2);
                }
            }
        }
    }

    public static void LIZJ(Map map, boolean z) {
        int iIntValue;
        if (map != null) {
            LIZLLL(map, z, C0XDP.L0);
            C844470XAv.LIZ.getClass();
            Long.valueOf(C844470XAv.LJ()).intValue();
            try {
                iIntValue = 0;
                for (String str : C844470XAv.LJFF().split("\\.")) {
                    try {
                        iIntValue = CastIntegerProtector.valueOf(str).intValue() + (iIntValue * 100);
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        map.put("version_code", String.valueOf(iIntValue));
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                iIntValue = 0;
            }
            map.put("version_code", String.valueOf(iIntValue));
        }
    }

    public static void LIZIZ(StringBuilder sb, boolean z, C0XDP c0xdp) {
        if (LIZ != null && sb != null) {
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            Uri uri = UriProtector.parse(string);
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            Uri.Builder builderBuildUpon = uri.buildUpon();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LIZLLL(linkedHashMap, z, c0xdp);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!queryParameterNames.contains(str) && !TextUtils.isEmpty(str2)) {
                    builderBuildUpon.appendQueryParameter(str, (String) entry.getValue());
                }
            }
            sb.delete(0, sb.length());
            sb.append(builderBuildUpon.build().toString());
        }
    }

    public static void LIZLLL(Map<String, String> map, boolean z, C0XDP c0xdp) {
        InterfaceC2210571BfT interfaceC2210571BfT = LIZ;
        if (interfaceC2210571BfT == null) {
            return;
        }
        Context context = interfaceC2210571BfT.getContext();
        C0XCI c0xci = C0XCJ.LIZIZ;
        if (c0xci.LIZJ()) {
            c0xci.LJI.LIZIZ(context, z, map, c0xdp);
        }
    }
}
