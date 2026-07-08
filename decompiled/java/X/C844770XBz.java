package X;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844770XBz {
    public final int LIZ;
    public final InterfaceC23070092e LIZIZ;
    public final Context LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final InterfaceC844950XCr LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final JSONObject LJIILIIL;
    public final Map<String, Object> LJIILJJIL;
    public final boolean LJIILL;
    public final C0XCP LJIILLIIL;
    public final C0XD5 LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public Account LJIJJLI;
    public final C0XDL LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final InterfaceC844540XBc LJJII;
    public final EnumC2207081BZq LJJIII;
    public final C820710WHl LJJIIJ;
    public final TelephonyManager LJJIIJZLJL;
    public boolean LJJIIZ;
    public SharedPreferences LJJIIZI;

    public final String LIZ() {
        return String.valueOf(this.LIZ);
    }

    public final long LIZIZ() {
        PackageInfo packageInfoLIZIZ;
        C0XCP c0xcp = this.LJIILLIIL;
        return (c0xcp.LJ != 0 || (packageInfoLIZIZ = c0xcp.LJI.LIZIZ(new Object[0])) == null) ? c0xcp.LJ : packageInfoLIZIZ.versionCode;
    }

    public final SharedPreferences LIZJ() {
        String strLIZIZ;
        if (this.LJJIIZI == null) {
            if (this.LJJIIZ) {
                strLIZIZ = this.LIZLLL;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append("_");
                sbLIZ.append(this.LIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LJJIIZI = C810670Vr7.LIZJ(this.LIZJ, 0, strLIZIZ);
        }
        return this.LJJIIZI;
    }

    public final long LIZLLL() {
        PackageInfo packageInfoLIZIZ;
        C0XCP c0xcp = this.LJIILLIIL;
        return (c0xcp.LIZLLL != 0 || (packageInfoLIZIZ = c0xcp.LJI.LIZIZ(new Object[0])) == null) ? c0xcp.LIZLLL : packageInfoLIZIZ.versionCode;
    }

    public final String LJ() {
        PackageInfo packageInfoLIZIZ;
        C0XCP c0xcp = this.LJIILLIIL;
        return (!TextUtils.isEmpty(c0xcp.LIZ) || (packageInfoLIZIZ = c0xcp.LJI.LIZIZ(new Object[0])) == null) ? c0xcp.LIZ : packageInfoLIZIZ.versionName;
    }

    public final long LJFF() {
        PackageInfo packageInfoLIZIZ;
        C0XCP c0xcp = this.LJIILLIIL;
        return (c0xcp.LIZJ != 0 || (packageInfoLIZIZ = c0xcp.LJI.LIZIZ(new Object[0])) == null) ? c0xcp.LIZJ : packageInfoLIZIZ.versionCode;
    }

    public C844770XBz(C0XC1 c0xc1) {
        String str;
        this.LIZJ = c0xc1.LJIIIIZZ;
        this.LIZ = c0xc1.LJI;
        InterfaceC23070092e interfaceC23070092e = c0xc1.LJII;
        this.LIZIZ = interfaceC23070092e == null ? new InterfaceC23070092e() { // from class: X.092X
            public static final String[] LIZ = {"GET", "POST"};

            @Override // X.InterfaceC23070092e
            public final String get(String str2, Map<String, String> map) {
                return LIZIZ(0, str2, (HashMap) map, null);
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00f0 A[Catch: all -> 0x00f3, TRY_ENTER, TryCatch #0 {all -> 0x00f3, blocks: (B:42:0x00d9, B:47:0x00f0, B:48:0x00f2), top: B:53:0x00d9 }] */
            @Override // X.InterfaceC23070092e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final byte[] LIZ(java.lang.String r10, java.util.Map r11, byte[] r12) {
                /*
                    Method dump skipped, instruction units count: 257
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C092X.LIZ(java.lang.String, java.util.Map, byte[]):byte[]");
            }

            @Override // X.InterfaceC23070092e
            public final String post(String str2, Map map, byte[] bArr) {
                return LIZIZ(1, str2, (HashMap) map, bArr);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(7:32|(1:34)(1:35)|(2:107|36)|(6:37|(1:39)(1:116)|45|88|60|(3:(2:105|63)|(3:97|67|70)|73)(2:74|75))|40|92|41) */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0101, code lost:
            
                r2 = th;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x014d A[Catch: all -> 0x0150, TRY_ENTER, TryCatch #0 {all -> 0x0150, blocks: (B:60:0x012b, B:74:0x014d, B:75:0x014f), top: B:88:0x012b }] */
            /* JADX WARN: Type inference failed for: r0v0 */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v19 */
            /* JADX WARN: Type inference failed for: r0v29 */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v40 */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v12 */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.io.BufferedReader] */
            /* JADX WARN: Type inference failed for: r3v4 */
            /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r3v8 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.lang.String LIZIZ(int r10, java.lang.String r11, java.util.HashMap<java.lang.String, java.lang.String> r12, byte[] r13) {
                /*
                    Method dump skipped, instruction units count: 361
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C092X.LIZIZ(int, java.lang.String, java.util.HashMap, byte[]):java.lang.String");
            }
        } : interfaceC23070092e;
        if (TextUtils.isEmpty(c0xc1.LJIIIZ)) {
            str = "applog_stats";
        } else {
            str = c0xc1.LJIIIZ;
        }
        this.LIZLLL = str;
        this.LJ = c0xc1.LJIIJ;
        this.LJFF = c0xc1.LJIILLIIL;
        this.LJI = c0xc1.LJIIZILJ;
        this.LJII = c0xc1.LJIJ;
        this.LJIIIIZZ = c0xc1.LJIJI;
        this.LJIIIZ = c0xc1.LJIJJ;
        this.LJIIJ = c0xc1.LJIJJLI;
        this.LJIIJJI = c0xc1.LJIL;
        this.LJIIL = c0xc1.LJJ;
        this.LJIILIIL = c0xc1.LJJI;
        this.LJIILJJIL = c0xc1.LJJIFFI;
        this.LJIL = c0xc1.LJ;
        this.LJJ = c0xc1.LJFF;
        this.LJJI = c0xc1.LIZLLL;
        this.LJIILL = c0xc1.LIZJ;
        this.LJJIFFI = c0xc1.LIZIZ;
        this.LJJII = c0xc1.LIZ;
        this.LJIILLIIL = new C0XCP(c0xc1);
        this.LJIJJLI = c0xc1.LJJII;
        this.LJIIZILJ = new C0XD5() { // from class: X.0XD0
        };
        this.LJIJ = c0xc1.LJJIII;
        this.LJIJI = c0xc1.LJJIIJ;
        this.LJIJJ = c0xc1.LJJIIJZLJL;
        this.LJJIII = c0xc1.LJJIIZ;
        C820710WHl c820710WHl = c0xc1.LJJIIZI;
        this.LJJIIJZLJL = c0xc1.LJJIJ;
        if (c820710WHl != null) {
            this.LJJIIJ = c820710WHl;
            c820710WHl.LIZ = this;
        } else {
            C820710WHl c820710WHl2 = new C820710WHl();
            this.LJJIIJ = c820710WHl2;
            c820710WHl2.LIZ = this;
        }
    }
}
