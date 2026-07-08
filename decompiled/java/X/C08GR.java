package X;

import android.util.Base64;
import com.bytedance.pns.crypto2.DeCrypto;
import com.bytedance.pns.crypto2.fallback.DeFallbackCrypto;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.Charsets;
import org.json.JSONException;

/* JADX INFO: renamed from: X.08GR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GR {
    public static final C08GR LIZ = new C08GR();

    public static String LIZIZ(boolean z) throws JSONException {
        Object c098200Yq;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            DeCrypto.LIZ.getClass();
            String strLIZIZ = DeCrypto.LIZIZ(z);
            if (strLIZIZ != null) {
                c098200Yq = new C08GS(2, strLIZIZ, null, null).toString();
            } else {
                c098200Yq = null;
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
        String str = (String) c098200Yq;
        if (str != null) {
            C092I.LIZJ(4, z ? 1 : 0, System.currentTimeMillis() - jCurrentTimeMillis);
            return str;
        }
        C092I.LIZJ(6, z ? 1 : 0, System.currentTimeMillis() - jCurrentTimeMillis);
        return null;
    }

    public static String LIZ(C08GR c08gr, String str, C08GV c08gv) throws JSONException {
        boolean z;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        C08GS c08gs;
        C08GW c08gw;
        c08gr.getClass();
        if (str == null) {
            return null;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        LIZ.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            c098200Yq = DeCrypto.LIZ.LIZ(str, false);
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
        try {
            int i = C08GU.LIZ[c08gv.ordinal()];
            if (i == 1) {
                c08gw = new C08GW() { // from class: X.08GO
                    @Override // X.C08GW
                    public final String decrypt(String str3) {
                        byte[] bArrDecode = Base64.decode(str3.getBytes(Charsets.UTF_8), 2);
                        int length = bArrDecode.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            bArrDecode[i2] = (byte) (bArrDecode[i2] ^ 5);
                        }
                        return new String(bArrDecode, Charsets.UTF_8);
                    }

                    @Override // X.C08GW
                    public final String LIZ(String str3, boolean z4) {
                        byte[] bytes = str3.getBytes(Charsets.UTF_8);
                        int length = bytes.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            bytes[i2] = (byte) (bytes[i2] ^ 5);
                        }
                        return Base64.encodeToString(bytes, 2);
                    }
                };
            } else if (i != 2) {
                c08gw = null;
            } else {
                c08gw = C839950WxF.LIZ;
            }
            if (c08gw == null) {
                c098200Yq2 = null;
            } else {
                c098200Yq2 = c08gw.LIZ(str, false);
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        String str3 = (String) c098200Yq2;
        if (str2 != null) {
            C092I.LIZJ(2, 0, System.currentTimeMillis() - jCurrentTimeMillis);
            if (str3 == null) {
                z2 = false;
            }
            if (!z2) {
                c08gv = null;
            }
            c08gs = new C08GS(2, str2, c08gv, str3);
        } else {
            try {
                c098200Yq3 = DeFallbackCrypto.LIZ.LIZ(str, false);
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq3 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                c098200Yq3 = null;
            }
            String str4 = (String) c098200Yq3;
            if (str4 != null) {
                C092I.LIZJ(1, 0, System.currentTimeMillis() - jCurrentTimeMillis);
                if (str3 != null) {
                    z3 = true;
                }
                if (!z3) {
                    c08gv = null;
                }
                c08gs = new C08GS(1, str4, c08gv, str3);
            } else {
                C092I.LIZJ(-1, 0, System.currentTimeMillis() - jCurrentTimeMillis);
                c08gs = null;
            }
        }
        if (c08gs == null) {
            return null;
        }
        return c08gs.toString();
    }
}
