package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13RH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13RH {
    public static boolean LIZ;
    public static InterfaceC1633730scF LIZLLL;
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(3));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(2));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(4));

    public static String LIZJ() {
        return (String) LIZJ.getValue();
    }

    public static String LIZ(String str) {
        if (str == null) {
            return null;
        }
        if (a0.LJJJIL(str)) {
            return "";
        }
        if (LIZ) {
            ConcurrentHashMap<String, String> concurrentHashMap = LIZIZ;
            String strLIZIZ = concurrentHashMap.get(str);
            if (strLIZIZ == null && (strLIZIZ = LIZIZ(str)) != null) {
                concurrentHashMap.put(str, strLIZIZ);
            }
            return strLIZIZ;
        }
        return LIZIZ(str);
    }

    public static String LIZIZ(String str) {
        Object c098200Yq;
        boolean z;
        int i;
        try {
            if (C13RI.LIZ) {
                return C0WVS.LIZ(str, (byte[]) LJFF.getValue());
            }
            byte[] bArrLIZ = C759350TqX.LIZ(str);
            C01GW c01gw = LJ;
            return C20009113Qr.LIZ(C20224114Bj.LIZ(bArrLIZ, (byte[]) c01gw.getValue(), (byte[]) c01gw.getValue(), EnumC20223914Bh.PKCS7Padding), EnumC20009313Qt.Utf8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                if (C13RI.LIZ) {
                    byte[] bArrLIZ2 = C759350TqX.LIZ(str);
                    C01GW c01gw2 = LJ;
                    c098200Yq = C20009113Qr.LIZ(C20224114Bj.LIZ(bArrLIZ2, (byte[]) c01gw2.getValue(), (byte[]) c01gw2.getValue(), EnumC20223914Bh.PKCS7Padding), EnumC20009313Qt.Utf8);
                } else {
                    c098200Yq = C0WVS.LIZ(str, (byte[]) LJFF.getValue());
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            if (str2 != null && !a0.LJJJIL(str2)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return str2;
            }
            C13SS c13ss = C13SS.LIZ;
            String str3 = "decrypt failed!, content: " + str + ", platformVersion: " + LIZJ();
            c13ss.getClass();
            C13SS.LIZIZ("EffectPlatformAES", str3, e);
            if (C13RI.LIZ) {
                i = 3;
            } else {
                i = 2;
            }
            InterfaceC1633730scF interfaceC1633730scF = LIZLLL;
            if (interfaceC1633730scF != null) {
                String message = e.getMessage();
                String strLIZJ = LIZJ();
                Pair[] pairArr = new Pair[6];
                if (str == null) {
                    str = "";
                }
                pairArr[0] = new Pair("content", str);
                if (message == null) {
                    message = "";
                }
                pairArr[1] = new Pair("error_msg", message);
                pairArr[2] = new Pair("stack_trace", "");
                pairArr[3] = new Pair("effect_platform_type", Integer.valueOf(i));
                if (strLIZJ == null) {
                    strLIZJ = "";
                }
                pairArr[4] = new Pair("platform_sdk_version", strLIZJ);
                pairArr[5] = new Pair("is_third_party_business", 0);
                interfaceC1633730scF.monitorStatusRate("effectplatform_decrypt_fail", 1, C2097608Jq.LJIIJ(pairArr));
            }
            return null;
        }
    }
}
