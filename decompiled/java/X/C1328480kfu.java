package X;

import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: renamed from: X.0kfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1328480kfu implements Closeable {
    public static boolean LLJLIL;
    public final C1323050kX9<InterfaceC1327060kdc> LL;
    public final InterfaceC1320070kSL<FileInputStream> LLILLJJLI;
    public C1330000kiM LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public C1328000kf8 LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public Rect LLJILJILJ;
    public Map<String, String> LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public int LLJJJJ;
    public long LLJJJJJIL;
    public String LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;

    public C1328480kfu() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LJIILLIIL() {
        /*
            r1 = this;
            monitor-enter(r1)
            X.0kX9<X.0kdc> r0 = r1.LL     // Catch: java.lang.Throwable -> L13
            boolean r0 = X.C1323050kX9.LJIJJ(r0)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Le
            X.0kSL<java.io.FileInputStream> r0 = r1.LLILLJJLI     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Le
            goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1328480kfu.LJIILLIIL():boolean");
    }

    public final C1323050kX9<InterfaceC1327060kdc> LJFF() {
        return C1323050kX9.LJFF(this.LL);
    }

    public final InputStream LJII() {
        InterfaceC1320070kSL<FileInputStream> interfaceC1320070kSL = this.LLILLJJLI;
        if (interfaceC1320070kSL != null) {
            return interfaceC1320070kSL.get();
        }
        C1323050kX9 c1323050kX9LJFF = C1323050kX9.LJFF(this.LL);
        if (c1323050kX9LJFF == null) {
            return null;
        }
        try {
            C1325260kai c1325260kai = new C1325260kai((InterfaceC1327060kdc) c1323050kX9LJFF.get());
            C1323050kX9.LJII(c1323050kX9LJFF);
            return c1325260kai;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9LJFF);
            throw th;
        }
    }

    public final int LJIILL() {
        C1323050kX9<InterfaceC1327060kdc> c1323050kX9 = this.LL;
        return (c1323050kX9 == null || c1323050kX9.get() == null) ? this.LLJ : this.LL.get().size();
    }

    public final void LJIJJLI() throws Throwable {
        if (this.LLILZLL < 0 || this.LLIZ < 0) {
            LJIJJ();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1323050kX9.LJII(this.LL);
    }

    public final String LJI() {
        C1323050kX9<InterfaceC1327060kdc> c1323050kX9LJFF = LJFF();
        if (c1323050kX9LJFF == null) {
            return "";
        }
        int iMin = Math.min(LJIILL(), 10);
        byte[] bArr = new byte[iMin];
        try {
            InterfaceC1327060kdc interfaceC1327060kdc = c1323050kX9LJFF.get();
            if (interfaceC1327060kdc == null) {
                c1323050kX9LJFF.close();
                return "";
            }
            interfaceC1327060kdc.read(0, bArr, 0, iMin);
            c1323050kX9LJFF.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i = 0; i < iMin; i++) {
                sb.append(C786410Ut5.j4("%02X", new Object[]{Byte.valueOf(bArr[i])}));
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1323050kX9LJFF.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0215 A[Catch: Exception -> 0x027b, all -> 0x0416, TryCatch #24 {Exception -> 0x027b, blocks: (B:136:0x020f, B:138:0x0215, B:142:0x0224, B:144:0x0237, B:145:0x023b, B:147:0x023f, B:148:0x0245, B:161:0x026f), top: B:337:0x020f, outer: #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03ff  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:283:0x03f5 -> B:284:0x03f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:95:0x018a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1328480kfu.LJIJJ():void");
    }

    public C1328480kfu(C1323050kX9<InterfaceC1327060kdc> c1323050kX9) {
        this.LLILLL = C1330000kiM.LIZJ;
        this.LLILZ = -1;
        this.LLILZLL = -1;
        this.LLIZ = -1;
        this.LLIZLLLIL = 1;
        this.LLJ = -1;
        this.LLJIJIL = true;
        this.LLJJJJJIL = -1L;
        C1322350kW1.LIZIZ(C1323050kX9.LJIJJ(c1323050kX9));
        InterfaceC1327060kdc interfaceC1327060kdc = c1323050kX9.get();
        if (interfaceC1327060kdc instanceof C1327050kdb) {
            this.LL = c1323050kX9.clone();
            C1327050kdb c1327050kdb = (C1327050kdb) interfaceC1327060kdc;
            this.LLJILLL = c1327050kdb.LLILLJJLI;
            if (c1327050kdb.LLILLL) {
                this.LLJJIII = true;
                this.LLJJIJI = false;
                this.LLJJI = false;
                this.LLJJ = false;
                c1327050kdb.LLILLL = false;
            } else if (c1327050kdb.LLILZ) {
                this.LLJJIII = false;
                this.LLJJIJI = true;
                this.LLJJI = false;
                this.LLJJ = false;
                c1327050kdb.LLILZ = false;
            }
        } else {
            this.LL = C1323050kX9.LJIJJLI(new C1327050kdb(c1323050kX9.clone()));
        }
        this.LLILLJJLI = null;
    }

    public static C1328480kfu LIZ(C1328480kfu c1328480kfu) throws Throwable {
        C1328480kfu c1328480kfu2 = null;
        if (c1328480kfu != null) {
            InterfaceC1320070kSL<FileInputStream> interfaceC1320070kSL = c1328480kfu.LLILLJJLI;
            if (interfaceC1320070kSL != null) {
                c1328480kfu2 = new C1328480kfu(interfaceC1320070kSL, c1328480kfu.LLJ);
            } else {
                C1323050kX9 c1323050kX9LJFF = C1323050kX9.LJFF(c1328480kfu.LL);
                if (c1323050kX9LJFF != null) {
                    try {
                        c1328480kfu2 = new C1328480kfu(c1323050kX9LJFF);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1323050kX9.LJII(c1323050kX9LJFF);
                        throw th;
                    }
                }
                C1323050kX9.LJII(c1323050kX9LJFF);
                if (c1328480kfu2 != null) {
                }
            }
            c1328480kfu2.LIZLLL(c1328480kfu);
        }
        return c1328480kfu2;
    }

    public static void LIZIZ(C1328480kfu c1328480kfu) {
        if (c1328480kfu != null) {
            c1328480kfu.close();
        }
    }

    public static boolean LJIIZILJ(C1328480kfu c1328480kfu) {
        if (c1328480kfu != null && c1328480kfu.LJIILLIIL()) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(C1328480kfu c1328480kfu) throws Throwable {
        c1328480kfu.LJIJJLI();
        this.LLILLL = c1328480kfu.LLILLL;
        c1328480kfu.LJIJJLI();
        this.LLILZLL = c1328480kfu.LLILZLL;
        c1328480kfu.LJIJJLI();
        this.LLIZ = c1328480kfu.LLIZ;
        c1328480kfu.LJIJJLI();
        this.LLILZ = c1328480kfu.LLILZ;
        c1328480kfu.LJIJJLI();
        this.LLILZIL = c1328480kfu.LLILZIL;
        this.LLIZLLLIL = c1328480kfu.LLIZLLLIL;
        this.LLJ = c1328480kfu.LJIILL();
        this.LLJI = c1328480kfu.LLJI;
        c1328480kfu.LJIJJLI();
        this.LLJIJIL = c1328480kfu.LLJIJIL;
        this.LLJILJIL = c1328480kfu.LLJILJIL;
        this.LLJILJILJ = c1328480kfu.LLJILJILJ;
        this.LLJILLL = c1328480kfu.LLJILLL;
        this.LLJJ = c1328480kfu.LLJJ;
        this.LLJJI = c1328480kfu.LLJJI;
        this.LLJJIII = c1328480kfu.LLJJIII;
        this.LLJJIJI = c1328480kfu.LLJJIJI;
        this.LLJJJJLIIL = c1328480kfu.LLJJJJLIIL;
        this.LLJJL = c1328480kfu.LLJJL;
        this.LLJJLIIIJLLLLLLLZ = c1328480kfu.LLJJLIIIJLLLLLLLZ;
    }

    public C1328480kfu(InterfaceC1320070kSL<FileInputStream> interfaceC1320070kSL, int i) {
        this.LLILLL = C1330000kiM.LIZJ;
        this.LLILZ = -1;
        this.LLILZLL = -1;
        this.LLIZ = -1;
        this.LLIZLLLIL = 1;
        this.LLJ = -1;
        this.LLJIJIL = true;
        this.LLJJJJJIL = -1L;
        interfaceC1320070kSL.getClass();
        this.LL = null;
        this.LLILLJJLI = interfaceC1320070kSL;
        this.LLJ = i;
    }
}
