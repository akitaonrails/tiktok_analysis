package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08Zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1294060jmO
public final class C2137908Zd implements InterfaceC2138008Ze {
    public static final C2137908Zd LIZJ = new C2137908Zd();
    public final /* synthetic */ C2138108Zf LIZIZ = InterfaceC2138008Ze.LIZ;

    public static byte[] LJ(String str) {
        if (u.LJJIIJZLJL(str, "content://", false)) {
            Uri uri = UriProtector.parse(str);
            return C2106108Mx.LJ(C09N1.LJFF(C1948707kD.LIZ().getApplicationContext(), uri), C2400409as.LJII(C1948707kD.LIZ().getApplicationContext(), uri), str);
        }
        C0VSJ c0vsj = new C0VSJ(str);
        return C2106108Mx.LJ(new C0VSP(c0vsj), c0vsj.length(), c0vsj.getName());
    }

    public final void LIZ(Closeable closeable) {
        this.LIZIZ.getClass();
        C2106108Mx.LIZ(closeable);
    }

    public final File LIZIZ(String str) {
        this.LIZIZ.getClass();
        return C2106108Mx.LIZJ(str, false);
    }

    public final File LIZJ(String str) {
        this.LIZIZ.getClass();
        return C2106108Mx.LIZJ(str, true);
    }

    public final void LIZLLL(String str) {
        this.LIZIZ.getClass();
        C2106108Mx.LJFF(str);
    }

    public final boolean LJFF(String str) {
        this.LIZIZ.getClass();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new C0VSJ(str).exists();
    }

    public final String LJIIIIZZ(String str) throws Throwable {
        C0VSP c0vsp;
        this.LIZIZ.getClass();
        C0VSP c0vsp2 = null;
        try {
            try {
                c0vsp = new C0VSP(str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String hexString = Integer.toHexString((((((c0vsp.read() << 8) ^ c0vsp.read()) << 8) ^ c0vsp.read()) << 8) ^ c0vsp.read());
            try {
                c0vsp.close();
                return hexString;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return hexString;
            }
        } catch (Exception e3) {
            e = e3;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    return "";
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return "";
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(th);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    throw th;
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static String LJII(C0VSJ c0vsj, String str) {
        try {
            return C2106108Mx.LIZLLL(new C0VSP(c0vsj), str);
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x003e: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:33554494), block:B:22:0x003e */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJI(android.content.Context r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            r5 = this;
            X.08Zf r0 = r5.LIZIZ
            r0.getClass()
            r4 = 0
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L43
            java.io.InputStream r3 = r0.open(r7)     // Catch: java.io.IOException -> L2d java.lang.Throwable -> L43
            int r0 = r3.available()     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L3d
            byte[] r2 = new byte[r0]     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L3d
            r3.read(r2)     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L3d
            r3.close()     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L3d
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L3d
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L3d
            r1.<init>(r2, r0)     // Catch: java.io.IOException -> L2b java.lang.Throwable -> L3d
            r3.close()     // Catch: java.io.IOException -> L25
            goto L2a
        L25:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r1
        L2a:
            return r1
        L2b:
            r0 = move-exception
            goto L2f
        L2d:
            r0 = move-exception
            r3 = r4
        L2f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L3c
            r3.close()     // Catch: java.io.IOException -> L38
            return r4
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3c:
            return r4
        L3d:
            r1 = move-exception
            r4 = r3
        L3f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r1 = move-exception
            goto L3f
        L45:
            if (r4 == 0) goto L4f
            r4.close()     // Catch: java.io.IOException -> L4b
            throw r1
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2137908Zd.LJI(android.content.Context, java.lang.String):java.lang.String");
    }

    public final boolean LJIIIZ(String str, String str2) {
        this.LIZIZ.getClass();
        C0VSJ c0vsj = new C0VSJ(str);
        C0VSJ c0vsj2 = new C0VSJ(str2);
        if (!c0vsj.exists()) {
            return false;
        }
        return c0vsj.renameTo(c0vsj2);
    }
}
