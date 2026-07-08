package X;

import Y.AObjectS0S2102000_34;
import Y.AObjectS103S0101000_34;
import Y.AObjectS11S1110000_34;
import Y.AObjectS15S1101000_34;
import Y.AObjectS16S0202000_34;
import Y.AObjectS26S2100000_34;
import Y.AObjectS33S0301000_34;
import Y.AObjectS3S2110000_34;
import Y.AObjectS3S2210000_34;
import Y.AObjectS408S0100000_34;
import Y.AObjectS5S0101100_34;
import Y.AObjectS81S0201000_34;
import Y.AObjectS82S1200000_34;
import Y.AObjectS89S0101000_34;
import Y.AObjectS8S1210000_34;
import Y.AObjectS96S1100000_34;
import Y.AObjectS9S1100100_34;
import android.net.Uri;
import android.util.Base64;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1BwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221091BwR implements InterfaceC2220701Bvo {
    public final C1304160k2g LIZ;
    public long LIZIZ;
    public long LIZJ;
    public C09KX LJFF;
    public C09KV LJI;
    public String LIZLLL = "";
    public String LJ = "";
    public final C054G LJII = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final ConcurrentHashMap<Integer, C2221201Bwc> LJIIIIZZ = new ConcurrentHashMap<>();
    public final AtomicInteger LJIIIZ = new AtomicInteger(3);

    @Override // X.InterfaceC1304090k2Z
    public final void onPause() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onResume() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onExit() {
        C09AE c09ae = (C09AE) this.LJII.LL.get(C09AE.LJJLJ);
        if (c09ae != null) {
            C23118094a.LJFF(c09ae);
        }
        for (Map.Entry<Integer, C2221201Bwc> entry : this.LJIIIIZZ.entrySet()) {
            entry.getKey().intValue();
            try {
                entry.getValue().LIZ.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
            }
        }
        this.LJIIIIZZ.clear();
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onStart() {
        C2353409Ka c2353409Ka = this.LIZ.LJIIIZ;
        this.LIZLLL = c2353409Ka.LIZ.path;
        this.LJ = c2353409Ka.LIZIZ.path;
        String str = c2353409Ka.LJ.path;
        LJJZZI(new C0VSJ(this.LIZLLL));
        LJJZZI(new C0VSJ(this.LJ));
        LJJZZI(new C0VSJ(str));
        C09KY c09ky = C09KY.LIZ;
        C1304160k2g c1304160k2g = this.LIZ;
        c09ky.getClass();
        this.LJFF = C09KY.LJFF(c1304160k2g);
        this.LJI = new C09KV(this.LIZ);
        IClientAdapterService iClientAdapterServiceLIZIZ = this.LIZ.LIZIZ();
        this.LIZIZ = iClientAdapterServiceLIZIZ != null ? iClientAdapterServiceLIZIZ.getFileSizeLimit() : 104857600L;
        IClientAdapterService iClientAdapterServiceLIZIZ2 = this.LIZ.LIZIZ();
        this.LIZJ = iClientAdapterServiceLIZIZ2 != null ? iClientAdapterServiceLIZIZ2.getReadSizeLimit() : 104857600L;
    }

    public C2221091BwR(C1304160k2g c1304160k2g) {
        this.LIZ = c1304160k2g;
    }

    public static final void LJJZZI(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJZZIII(java.io.File r7) {
        /*
            boolean r0 = r7.exists()
            r6 = 0
            if (r0 == 0) goto L4d
            boolean r0 = r7.isFile()
            if (r0 == 0) goto L4d
            long r3 = r7.length()
            r1 = 4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L4d
            X.0VSP r5 = new X.0VSP     // Catch: java.lang.Throwable -> L49
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L49
            r1 = 4
            r4 = 0
            byte[] r3 = new byte[r1]     // Catch: java.lang.Throwable -> L39
            int r0 = r5.read(r3)     // Catch: java.lang.Throwable -> L39
            if (r0 != r1) goto L34
            r1 = r3[r6]     // Catch: java.lang.Throwable -> L39
            r0 = 80
            if (r1 != r0) goto L34
            r2 = 1
            r1 = r3[r2]     // Catch: java.lang.Throwable -> L39
            r0 = 75
            if (r1 != r0) goto L34
            goto L35
        L34:
            r2 = 0
        L35:
            X.C2107108Nh.LIZ(r5, r4)     // Catch: java.lang.Throwable -> L49
            return r2
        L39:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L41
            throw r1     // Catch: java.lang.Throwable -> L3e
        L3e:
            r0 = move-exception
            r4 = r1
            goto L42
        L41:
            r0 = move-exception
        L42:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L41
            X.C2107108Nh.LIZ(r5, r4)     // Catch: java.lang.Throwable -> L49
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJJZZIII(java.io.File):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.CharSequence, java.lang.String] */
    public static final Pair<EnumC2221141BwW, String> LJL(String str) {
        C259800zU c259800zU = new C259800zU();
        ?? LJLJJLL = a0.LJLJJLL(a0.LJLIIIL(str).toString(), '/', '\\');
        c259800zU.element = LJLJJLL;
        ?? ReplaceFirst = new Regex("^ttfile:/+").replaceFirst(LJLJJLL, "ttfile://");
        c259800zU.element = ReplaceFirst;
        ?? ReplaceFirst2 = new Regex("^ttpluginfile:/+").replaceFirst(ReplaceFirst, "ttpluginfile://");
        c259800zU.element = ReplaceFirst2;
        String lowerCase = ReplaceFirst2.toLowerCase(Locale.ROOT);
        if (u.LJJIIJZLJL(lowerCase, "ttpluginfile://", false)) {
            return new Pair<>(EnumC2221141BwW.PLUGIN, c259800zU.element);
        }
        String strLJLI = LJLI(lowerCase, "user", c259800zU);
        if (strLJLI != null) {
            return new Pair<>(EnumC2221141BwW.USER, strLJLI);
        }
        String strLJLI2 = LJLI(lowerCase, "temp", c259800zU);
        if (strLJLI2 != null) {
            return new Pair<>(EnumC2221141BwW.TEMP, strLJLI2);
        }
        String strLJLI3 = LJLI(lowerCase, "arch", c259800zU);
        if (strLJLI3 != null) {
            return new Pair<>(EnumC2221141BwW.ARCH, strLJLI3);
        }
        return new Pair<>(EnumC2221141BwW.PKG, c259800zU.element);
    }

    public static EnumC2221121BwU LJLJJL(EnumC2221141BwW enumC2221141BwW) {
        int i = C2221131BwV.LIZ[enumC2221141BwW.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new C1954807lC();
                        }
                    } else {
                        return EnumC2221121BwU.USER_PATH_PERMISSION_DENIED;
                    }
                } else {
                    return EnumC2221121BwU.ILLEGAL_OP_ON_PKG_DIR;
                }
            } else {
                return EnumC2221121BwU.USER_PATH_PERMISSION_DENIED;
            }
        }
        return EnumC2221121BwU.PATH_PERMISSION_DENIED;
    }

    public static final String LJLJJLL(C2220221Bv2 c2220221Bv2) {
        String msg;
        C2220241Bv4 c2220241Bv4 = c2220221Bv2.LIZIZ.LIZJ;
        if (c2220241Bv4 == null || (msg = c2220241Bv4.LIZIZ) == null) {
            msg = EnumC2221121BwU.SYSTEM_ERROR.getMsg();
        }
        return "readZipEntry:fail " + msg;
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LIZ(String str) {
        Object c098200Yq;
        if (a0.LJJJIL(str)) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "Invalid argument");
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (LJLIIL(str, false).exists()) {
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return C2220251Bv5.LIZJ(null, null);
            }
            return LJLJJI(thM5exceptionOrNullimpl, null);
        }
        throw new FileNotFoundException(str.concat(" not found"));
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJI(int i) {
        Object c098200Yq;
        C2221201Bwc c2221201BwcRemove = this.LJIIIIZZ.remove(Integer.valueOf(i));
        if (c2221201BwcRemove == null) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.BAD_FD, "");
        }
        try {
            c2221201BwcRemove.LJFF.lock();
            try {
                c2221201BwcRemove.LIZ.close();
                c2221201BwcRemove.LJFF.unlock();
                c098200Yq = C2220251Bv5.LIZJ(null, null);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c2221201BwcRemove.LJFF.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJIJ(int i) {
        Object c098200Yq;
        Boolean bool;
        try {
            C2221201Bwc c2221201Bwc = this.LJIIIIZZ.get(Integer.valueOf(i));
            if (c2221201Bwc != null) {
                c2221201Bwc.LJFF.lock();
                try {
                    if (this.LJIIIIZZ.get(Integer.valueOf(i)) == c2221201Bwc) {
                        C0VSJ c0vsj = new C0VSJ(c2221201Bwc.LIZIZ);
                        if (!c0vsj.exists()) {
                            c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, "not found");
                        } else {
                            C09KY.LIZ.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(C09KY.LIZ(c0vsj));
                            Object obj = linkedHashMap.get("__amgMinigameIsDirectory");
                            if (obj instanceof Boolean) {
                                bool = (Boolean) obj;
                            } else {
                                bool = null;
                            }
                            if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
                                linkedHashMap.put("size", Long.valueOf(c2221201Bwc.LIZ.length()));
                            }
                            c098200Yq = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("stats", linkedHashMap)));
                        }
                        c2221201Bwc.LJFF.unlock();
                        C189200o6.m2constructorimpl(c098200Yq);
                    } else {
                        throw new IllegalArgumentException("bad fd");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c2221201Bwc.LJFF.unlock();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("bad fd");
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJIIJ(String str) {
        Object c098200Yq;
        Object objLJJLL;
        try {
            File fileLJLIIL = LJLIIL(str, false);
            if (!fileLJLIIL.exists()) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
            } else if (!fileLJLIIL.isDirectory()) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NOT_DIR, str);
            } else {
                C1849450yEB c1849450yEB = new C1849450yEB(0L, fileLJLIIL.lastModified(), str, true);
                String[] list = fileLJLIIL.list();
                if (list == null || (objLJJLL = C13LQ.LJJLL(list)) == null) {
                    objLJJLL = C13BV.INSTANCE;
                }
                c098200Yq = C2220251Bv5.LIZJ(c1849450yEB, C2097908Jt.LIZJ(new Pair("files", objLJJLL)));
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJI(Function0<Unit> function0) {
        C23250099c.LIZLLL(this.LJII, null, null, new C479601tq(function0, null), 3);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJLL(AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS408S0100000_34(this, 4), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJLIIIIJ(String str) {
        if (str != null && str.length() != 0) {
            if (u.LJJIIJZLJL(str, "data:", false)) {
                return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("url", str)));
            }
            if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
                try {
                    return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("url", Uri.fromFile(LJLIIL(str, false)).toString())));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return LJLJJI(th, null);
                }
            }
            return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("url", str)));
        }
        return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "empty url");
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJLIIIJ(String str) {
        Object c098200Yq;
        File fileLJLIIL;
        try {
            fileLJLIIL = LJLIIL(str, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (fileLJLIIL.exists()) {
            C09KY.LIZ.getClass();
            c098200Yq = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("stats", C09KY.LIZ(fileLJLIIL))));
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return (C2220221Bv2) c098200Yq;
            }
            return LJLJJI(thM5exceptionOrNullimpl, null);
        }
        throw new FileNotFoundException("not found");
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJLIIIJJIZ(String str) {
        Object c098200Yq;
        try {
            File fileLJLIIL = LJLIIL(str, true);
            if (!fileLJLIIL.exists()) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
            } else if (fileLJLIIL.isDirectory()) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.IS_DIR, str);
            } else if (!fileLJLIIL.delete()) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "delete fail");
            } else {
                c098200Yq = C2220251Bv5.LIZJ(null, null);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    public static final File LJLIL(File file, String str) throws IOException {
        if (!a0.LJJJIL(str) && !a0.LJJLIIIJJIZ(str, '/') && !a0.LJJLIIIJJIZ(str, '\\') && !a0.LJJIJ(str, '\\') && !a0.LJJIJ(str, ':') && !a0.LJJIIZI(str.toLowerCase(Locale.ROOT), "%2e", false)) {
            File canonicalFile = file.getCanonicalFile();
            File canonicalFile2 = new C0VSJ(canonicalFile, str).getCanonicalFile();
            String path = canonicalFile.getPath();
            String str2 = File.separator;
            if (!u.LJIIZILJ(path, str2, false)) {
                path = path + str2;
            }
            if (!Intrinsics.LJFF(canonicalFile2.getPath(), canonicalFile.getPath()) && !u.LJJIIJZLJL(canonicalFile2.getPath(), path, false)) {
                throw new SecurityException("Path escape attempt: ".concat(str));
            }
            return canonicalFile2;
        }
        throw new SecurityException("invalid zip entry name: ".concat(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r1.equals("binary") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r1.equals("latin1") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r1.equals("utf16le") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r1.equals("") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        if (r1.equals("json") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (r1.equals("ucs2") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r1.equals("utf8") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
    
        return new java.lang.String(r8, kotlin.text.Charsets.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d2, code lost:
    
        return new java.lang.String(r8, java.nio.charset.Charset.forName("UTF-16LE"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        return new java.lang.String(r8, kotlin.text.Charsets.UTF_8);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJLJI(java.lang.String r7, byte[] r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJLJI(java.lang.String, byte[]):java.lang.String");
    }

    public static final C2220221Bv2 LJLJJI(Throwable th, EnumC2221121BwU enumC2221121BwU) {
        if (enumC2221121BwU == null) {
            if (!(th instanceof SecurityException) && !(th instanceof C08NN) && !(th instanceof IllegalAccessException)) {
                if (th instanceof FileNotFoundException) {
                    enumC2221121BwU = EnumC2221121BwU.NO_SUCH_FILE;
                } else if (th instanceof IllegalArgumentException) {
                    String message = th.getMessage();
                    if (message != null && a0.LJJIIZI(message, "bad fd", true)) {
                        enumC2221121BwU = EnumC2221121BwU.BAD_FD;
                    } else {
                        enumC2221121BwU = EnumC2221121BwU.INVALID_ARG;
                    }
                } else if (!(th instanceof IndexOutOfBoundsException) && !(th instanceof StringIndexOutOfBoundsException)) {
                    if (th instanceof ZipException) {
                        enumC2221121BwU = EnumC2221121BwU.UNZIP_FAIL;
                    } else if (th instanceof IOException) {
                        String message2 = th.getMessage();
                        if (message2 != null && a0.LJJIIZI(message2, "Directory not empty", true)) {
                            enumC2221121BwU = EnumC2221121BwU.DIR_NOT_EMPTY;
                        } else {
                            enumC2221121BwU = EnumC2221121BwU.IO_ERROR;
                        }
                    } else {
                        enumC2221121BwU = EnumC2221121BwU.SYSTEM_ERROR;
                    }
                } else {
                    enumC2221121BwU = EnumC2221121BwU.OFFSET_OUT_OF_RANGE;
                }
            } else {
                enumC2221121BwU = EnumC2221121BwU.PERMISSION_DENIED;
            }
        }
        String message3 = th.getMessage();
        if (message3 == null) {
            message3 = "";
        }
        return C2220251Bv5.LIZ(enumC2221121BwU, message3);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LIZIZ(String str, boolean z) {
        Object c098200Yq;
        boolean zLJIIZILJ;
        try {
            File fileLJLIIL = LJLIIL(str, true);
            if (!fileLJLIIL.exists()) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
            } else if (!fileLJLIIL.isDirectory()) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NOT_DIR, str);
            } else {
                if (!z) {
                    String[] list = fileLJLIIL.list();
                    if (list != null && list.length != 0) {
                        c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.DIR_NOT_EMPTY, "Directory not empty: " + str);
                    } else {
                        zLJIIZILJ = fileLJLIIL.delete();
                    }
                } else {
                    zLJIIZILJ = C08QA.LJIIZILJ(fileLJLIIL);
                }
                if (!zLJIIZILJ) {
                    c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "delete fail");
                } else {
                    c098200Yq = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("success", Boolean.TRUE)));
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LIZJ(String str, String str2) {
        Object c098200Yq;
        File fileLJLIIL;
        String path;
        try {
            fileLJLIIL = LJLIIL(str, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (fileLJLIIL.isDirectory()) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.IS_DIR, str);
        }
        if (!fileLJLIIL.exists()) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, "no such file or directory " + str);
        }
        if (!fileLJLIIL.canRead()) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.PERMISSION_DENIED, "permission denied");
        }
        File fileLJLIIL2 = LJLIIL(str2, true);
        File parentFile = fileLJLIIL2.getParentFile();
        if (parentFile != null) {
            if (!parentFile.exists() || !parentFile.isDirectory()) {
                parentFile.mkdirs();
            }
            if (parentFile.exists() && parentFile.isDirectory()) {
                if (!parentFile.canWrite()) {
                    return C2220251Bv5.LIZ(EnumC2221121BwU.PERMISSION_DENIED, "permission denied (parent not writable)");
                }
                if (fileLJLIIL2.exists()) {
                    if (fileLJLIIL2.isDirectory()) {
                        return C2220251Bv5.LIZ(EnumC2221121BwU.IS_DIR, str2);
                    }
                    if (!fileLJLIIL2.canRead()) {
                        return C2220251Bv5.LIZ(EnumC2221121BwU.PERMISSION_DENIED, "permission denied (dest not readable)");
                    }
                    if (!fileLJLIIL2.canWrite()) {
                        return C2220251Bv5.LIZ(EnumC2221121BwU.PERMISSION_DENIED, "permission denied (dest not writable)");
                    }
                }
                C08QA.LJIILLIIL(fileLJLIIL, fileLJLIIL2, true, 4);
                c098200Yq = C2220251Bv5.LIZJ(null, null);
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
                }
                return (C2220221Bv2) c098200Yq;
            }
        }
        EnumC2221121BwU enumC2221121BwU = EnumC2221121BwU.NO_SUCH_FILE;
        if (parentFile != null) {
            path = parentFile.getPath();
        } else {
            path = null;
        }
        return C2220251Bv5.LIZ(enumC2221121BwU, "no such file or directory " + path);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJ(String str, Function1<? super C2220221Bv2, Unit> function1) {
        LJLILLLLZI(new AObjectS96S1100000_34(this, str, 2), function1);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJIIIZ(int i, long j) {
        Object c098200Yq;
        if (j < 0) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.LENGTH_OUT_OF_RANGE, "length=" + j);
        }
        try {
            C2221201Bwc c2221201Bwc = this.LJIIIIZZ.get(Integer.valueOf(i));
            if (c2221201Bwc != null) {
                c2221201Bwc.LJFF.lock();
                try {
                    if (this.LJIIIIZZ.get(Integer.valueOf(i)) == c2221201Bwc) {
                        if (!c2221201Bwc.LIZLLL) {
                            c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.FLAG_PERMISSION_DENIED, "fd=" + i + " not writable");
                        } else {
                            c2221201Bwc.LIZ.setLength(j);
                            c098200Yq = C2220251Bv5.LIZJ(null, null);
                        }
                        c2221201Bwc.LJFF.unlock();
                        C189200o6.m2constructorimpl(c098200Yq);
                    } else {
                        throw new IllegalArgumentException("bad fd");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c2221201Bwc.LJFF.unlock();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("bad fd");
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5 A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0018, B:9:0x001e, B:11:0x0025, B:13:0x002f, B:17:0x004e, B:21:0x005f, B:23:0x006d, B:25:0x0076, B:27:0x0082, B:33:0x0090, B:35:0x0096, B:37:0x009c, B:39:0x00a2, B:41:0x00a8, B:43:0x00af, B:45:0x00b5, B:46:0x00b8, B:48:0x00be, B:51:0x00c5, B:54:0x00cf, B:57:0x00d4, B:58:0x00ea, B:59:0x00f1, B:60:0x00f2, B:62:0x00f6, B:63:0x00fa, B:32:0x008d, B:20:0x0056), top: B:73:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0018, B:9:0x001e, B:11:0x0025, B:13:0x002f, B:17:0x004e, B:21:0x005f, B:23:0x006d, B:25:0x0076, B:27:0x0082, B:33:0x0090, B:35:0x0096, B:37:0x009c, B:39:0x00a2, B:41:0x00a8, B:43:0x00af, B:45:0x00b5, B:46:0x00b8, B:48:0x00be, B:51:0x00c5, B:54:0x00cf, B:57:0x00d4, B:58:0x00ea, B:59:0x00f1, B:60:0x00f2, B:62:0x00f6, B:63:0x00fa, B:32:0x008d, B:20:0x0056), top: B:73:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0018, B:9:0x001e, B:11:0x0025, B:13:0x002f, B:17:0x004e, B:21:0x005f, B:23:0x006d, B:25:0x0076, B:27:0x0082, B:33:0x0090, B:35:0x0096, B:37:0x009c, B:39:0x00a2, B:41:0x00a8, B:43:0x00af, B:45:0x00b5, B:46:0x00b8, B:48:0x00be, B:51:0x00c5, B:54:0x00cf, B:57:0x00d4, B:58:0x00ea, B:59:0x00f1, B:60:0x00f2, B:62:0x00f6, B:63:0x00fa, B:32:0x008d, B:20:0x0056), top: B:73:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6 A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0018, B:9:0x001e, B:11:0x0025, B:13:0x002f, B:17:0x004e, B:21:0x005f, B:23:0x006d, B:25:0x0076, B:27:0x0082, B:33:0x0090, B:35:0x0096, B:37:0x009c, B:39:0x00a2, B:41:0x00a8, B:43:0x00af, B:45:0x00b5, B:46:0x00b8, B:48:0x00be, B:51:0x00c5, B:54:0x00cf, B:57:0x00d4, B:58:0x00ea, B:59:0x00f1, B:60:0x00f2, B:62:0x00f6, B:63:0x00fa, B:32:0x008d, B:20:0x0056), top: B:73:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJIILLIIL(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJIILLIIL(java.lang.String, java.lang.String):X.1Bv2");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJIJI(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            X.09KY r0 = X.C09KY.LIZ     // Catch: java.lang.Throwable -> La5
            r0.getClass()     // Catch: java.lang.Throwable -> La5
            java.lang.String r6 = X.C09KY.LIZLLL(r9)     // Catch: java.lang.Throwable -> La5
            if (r6 != 0) goto L18
            X.1BwU r1 = X.EnumC2221121BwU.INVALID_ARG     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = "digestAlgorithm"
            X.1Bv2 r2 = X.C2220251Bv5.LIZ(r1, r0)     // Catch: java.lang.Throwable -> La5
        L13:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> La5
            goto Lb1
        L18:
            kotlin.Pair r0 = LJL(r8)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r3 = r0.getFirst()     // Catch: java.lang.Throwable -> La5
            X.1BwW r3 = (X.EnumC2221141BwW) r3     // Catch: java.lang.Throwable -> La5
            X.1BwW r0 = X.EnumC2221141BwW.USER     // Catch: java.lang.Throwable -> La5
            r2 = 2
            r5 = 1
            if (r3 == r0) goto L53
            X.1BwW r0 = X.EnumC2221141BwW.TEMP     // Catch: java.lang.Throwable -> La5
            if (r3 == r0) goto L53
            X.1BwW r0 = X.EnumC2221141BwW.ARCH     // Catch: java.lang.Throwable -> La5
            if (r3 == r0) goto L53
            int[] r1 = X.C2221131BwV.LIZ     // Catch: java.lang.Throwable -> La5
            int r0 = r3.ordinal()     // Catch: java.lang.Throwable -> La5
            r1 = r1[r0]     // Catch: java.lang.Throwable -> La5
            if (r1 == r5) goto L49
            if (r1 == r2) goto L49
            r0 = 3
            if (r1 == r0) goto L4c
            r0 = 4
            if (r1 == r0) goto L46
            r0 = 5
            if (r1 == r0) goto L49
            goto L9f
        L46:
            X.1BwU r0 = X.EnumC2221121BwU.USER_PATH_PERMISSION_DENIED     // Catch: java.lang.Throwable -> La5
            goto L4e
        L49:
            X.1BwU r0 = X.EnumC2221121BwU.PERMISSION_DENIED     // Catch: java.lang.Throwable -> La5
            goto L4e
        L4c:
            X.1BwU r0 = X.EnumC2221121BwU.ILLEGAL_OP_ON_PKG_DIR     // Catch: java.lang.Throwable -> La5
        L4e:
            X.1Bv2 r2 = X.C2220251Bv5.LIZ(r0, r8)     // Catch: java.lang.Throwable -> La5
            goto L13
        L53:
            X.1BwZ r0 = X.EnumC2221171BwZ.LL     // Catch: java.lang.Throwable -> La5
            java.io.File r4 = r7.LJLIIIL(r8, r0)     // Catch: java.lang.Throwable -> La5
            boolean r0 = r4.exists()     // Catch: java.lang.Throwable -> La5
            if (r0 != 0) goto L66
            X.1BwU r0 = X.EnumC2221121BwU.NO_SUCH_FILE     // Catch: java.lang.Throwable -> La5
            X.1Bv2 r2 = X.C2220251Bv5.LIZ(r0, r8)     // Catch: java.lang.Throwable -> La5
            goto L13
        L66:
            boolean r0 = r4.isDirectory()     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L73
            X.1BwU r0 = X.EnumC2221121BwU.OPERATION_NOT_PERMITTED     // Catch: java.lang.Throwable -> La5
            X.1Bv2 r2 = X.C2220251Bv5.LIZ(r0, r8)     // Catch: java.lang.Throwable -> La5
            goto L13
        L73:
            kotlin.Pair[] r3 = new kotlin.Pair[r2]     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "size"
            long r0 = r4.length()     // Catch: java.lang.Throwable -> La5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> La5
            kotlin.Pair r1 = new kotlin.Pair     // Catch: java.lang.Throwable -> La5
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> La5
            r0 = 0
            r3[r0] = r1     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "digest"
            java.lang.String r1 = X.C09KY.LIZJ(r4, r6)     // Catch: java.lang.Throwable -> La5
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> La5
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> La5
            r3[r5] = r0     // Catch: java.lang.Throwable -> La5
            java.util.LinkedHashMap r1 = X.C2097608Jq.LJII(r3)     // Catch: java.lang.Throwable -> La5
            r0 = 0
            X.1Bv2 r2 = X.C2220251Bv5.LIZJ(r0, r1)     // Catch: java.lang.Throwable -> La5
            goto L13
        L9f:
            X.07lC r0 = new X.07lC     // Catch: java.lang.Throwable -> La5
            r0.<init>()     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> La5
        La5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        Lb1:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r1 == 0) goto Lbc
            r0 = 0
            X.1Bv2 r2 = LJLJJI(r1, r0)
        Lbc:
            X.1Bv2 r2 = (X.C2220221Bv2) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJIJI(java.lang.String, java.lang.String):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJIJJ(String str, boolean z) {
        Object c098200Yq;
        File fileLJLIIL;
        File parentFile;
        boolean zMkdir;
        EnumC2221121BwU enumC2221121BwU;
        try {
            fileLJLIIL = LJLIIL(str, true);
            parentFile = fileLJLIIL.getParentFile();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (fileLJLIIL.exists()) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.ALREADY_EXISTS, "file exists at " + fileLJLIIL.getAbsolutePath());
        }
        if (z) {
            zMkdir = fileLJLIIL.mkdirs();
        } else {
            zMkdir = fileLJLIIL.mkdir();
        }
        if (!zMkdir) {
            if (parentFile == null || !parentFile.exists()) {
                if (!z) {
                    enumC2221121BwU = EnumC2221121BwU.NO_SUCH_FILE;
                } else {
                    if (parentFile != null) {
                        if (!parentFile.exists() && !parentFile.canWrite()) {
                            enumC2221121BwU = EnumC2221121BwU.PERMISSION_DENIED;
                        }
                    }
                }
            } else {
                enumC2221121BwU = !parentFile.exists() ? EnumC2221121BwU.IO_ERROR : EnumC2221121BwU.IO_ERROR;
            }
            return C2220251Bv5.LIZ(enumC2221121BwU, "mkdir failed: " + fileLJLIIL.getAbsolutePath());
        }
        c098200Yq = C2220251Bv5.LIZJ(new C1849450yEB(0L, fileLJLIIL.lastModified(), str, true), C2097908Jt.LIZJ(new Pair("success", Boolean.TRUE)));
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJIL(String str, String str2) {
        Object c098200Yq;
        File fileLJLIIL;
        String path;
        if (a0.LJJJIL(str)) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "Invalid argument");
        }
        try {
            fileLJLIIL = LJLIIL(str, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (fileLJLIIL.exists() && fileLJLIIL.isDirectory()) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.IS_DIR, str);
        }
        File parentFile = fileLJLIIL.getParentFile();
        if (parentFile != null && parentFile.exists() && parentFile.isDirectory()) {
            Charset charset = Charsets.UTF_8;
            long length = str2.getBytes(charset).length;
            if (length > this.LIZIZ) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "file too large (" + length + " B > 100 MB)");
            }
            C09BH.LJIIIZ(fileLJLIIL, str2, charset);
            c098200Yq = C2220251Bv5.LIZJ(new C1849450yEB(fileLJLIIL.length(), fileLJLIIL.lastModified(), str, false), C2097908Jt.LIZJ(new Pair("success", Boolean.TRUE)));
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
            }
            return (C2220221Bv2) c098200Yq;
        }
        EnumC2221121BwU enumC2221121BwU = EnumC2221121BwU.NO_SUCH_FILE;
        if (parentFile != null) {
            path = parentFile.getPath();
        } else {
            path = null;
        }
        return C2220251Bv5.LIZ(enumC2221121BwU, "no such file or directory " + path);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJII(String str, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS96S1100000_34(this, str, 3), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJIJIIJIL(String str, Function1<? super C2220221Bv2, Unit> function1) {
        LJLILLLLZI(new AObjectS96S1100000_34(this, str, 0), function1);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJIL(String str, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS96S1100000_34(this, str, 8), aObjectS89S0101000_34);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJJJJ(long r5, java.lang.String r7) {
        /*
            r4 = this;
            r3 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2e
            r0 = 1
            java.io.File r1 = r4.LJLIIL(r7, r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "rw"
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L2e
            r2.setLength(r5)     // Catch: java.lang.Throwable -> L19
            X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Throwable -> L2e
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L2e
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L2e
            goto L3a
        L19:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0 = move-exception
            goto L22
        L20:
            r0 = move-exception
            r1 = r3
        L22:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r0 = move-exception
            goto L22
        L28:
            X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r1 = move-exception
            goto L2f
        L2e:
            r1 = move-exception
        L2f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L3a:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r0 != 0) goto L45
            X.1Bv2 r0 = X.C2220251Bv5.LIZJ(r3, r3)
            return r0
        L45:
            X.1Bv2 r0 = LJLJJI(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJJJJ(long, java.lang.String):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJJI(String str, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS96S1100000_34(this, str, 6), aObjectS89S0101000_34);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJJJJZI(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJJJJZI(java.lang.String, java.lang.String):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJL(int i, C2220441BvO c2220441BvO) {
        LJLILLLLZI(new AObjectS103S0101000_34(this, i, 3), c2220441BvO);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJLI(int i, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS103S0101000_34(this, i, 0), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJLIIIJILLIZJL(String str, String str2) {
        return LJIJJLI(str, str2, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144 A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:50:0x0138, B:52:0x0144, B:54:0x014d, B:56:0x0154, B:60:0x015b, B:62:0x0165, B:64:0x016b, B:66:0x0172, B:68:0x0178, B:70:0x017c, B:72:0x0183, B:74:0x0187, B:76:0x018d, B:78:0x0194, B:80:0x0198, B:82:0x019e, B:84:0x01a4, B:86:0x01aa, B:88:0x01b0, B:90:0x01b6, B:92:0x01bc, B:94:0x01c5, B:96:0x01ce, B:98:0x01d2, B:100:0x01d6, B:102:0x01e5, B:103:0x01ea, B:105:0x01ee, B:106:0x01f5, B:111:0x0213, B:113:0x0219, B:114:0x021d, B:110:0x0208, B:108:0x01ff), top: B:122:0x0138, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:50:0x0138, B:52:0x0144, B:54:0x014d, B:56:0x0154, B:60:0x015b, B:62:0x0165, B:64:0x016b, B:66:0x0172, B:68:0x0178, B:70:0x017c, B:72:0x0183, B:74:0x0187, B:76:0x018d, B:78:0x0194, B:80:0x0198, B:82:0x019e, B:84:0x01a4, B:86:0x01aa, B:88:0x01b0, B:90:0x01b6, B:92:0x01bc, B:94:0x01c5, B:96:0x01ce, B:98:0x01d2, B:100:0x01d6, B:102:0x01e5, B:103:0x01ea, B:105:0x01ee, B:106:0x01f5, B:111:0x0213, B:113:0x0219, B:114:0x021d, B:110:0x0208, B:108:0x01ff), top: B:122:0x0138, inners: #1 }] */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJJLIIIJL(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJJLIIIJL(java.lang.String, java.lang.String):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJLIIIJLLLLLLLZ(String str, byte[] bArr) {
        return LJIIL(str, bArr, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Type inference failed for: r8v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map LJJZ(X.C09NU r13, X.C2221071BwP r14) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJJZ(X.09NU, X.1BwP):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fb, code lost:
    
        if (r6 != X.EnumC2221141BwW.ARCH) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0167, code lost:
    
        throw new java.lang.IllegalAccessException("permission denied");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6 == X.EnumC2221141BwW.TEMP) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File LJLIIIL(java.lang.String r9, X.EnumC2221171BwZ r10) throws java.lang.IllegalAccessException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJLIIIL(java.lang.String, X.1BwZ):java.io.File");
    }

    public final File LJLIIL(String str, boolean z) {
        EnumC2221171BwZ enumC2221171BwZ;
        if (z) {
            enumC2221171BwZ = EnumC2221171BwZ.LLILLJJLI;
        } else {
            enumC2221171BwZ = EnumC2221171BwZ.LL;
        }
        return LJLIIIL(str, enumC2221171BwZ);
    }

    public final <T> void LJLILLLLZI(Function0<? extends T> function0, Function1<? super T, Unit> function1) {
        C23250099c.LIZLLL(this.LJII, null, null, new C479401to(null, function0, function1), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LJLI(String str, String str2, C259800zU c259800zU) {
        String strConcat = "ttfile://".concat(str2);
        if (!Intrinsics.LJFF(str, strConcat)) {
            if (u.LJJIIJZLJL(str, strConcat + "/", false)) {
                return a0.LJLJJLL(((String) c259800zU.element).substring(strConcat.length()), '/');
            }
            if (!Intrinsics.LJFF(str, str2)) {
                if (u.LJJIIJZLJL(str, str2.concat("/"), false)) {
                    return a0.LJLJJLL(((String) c259800zU.element).substring(str2.length()), '/');
                }
                return null;
            }
            return "";
        }
        return "";
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJIIJ(String str, byte[] bArr, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS82S1200000_34(this, str, bArr, 1), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJIIL(String str, byte[] bArr, boolean z) {
        Object c098200Yq;
        String path;
        long length;
        if (a0.LJJJIL(str)) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "Invalid argument");
        }
        try {
            File fileLJLIIL = LJLIIL(str, true);
            if (fileLJLIIL.exists() && fileLJLIIL.isDirectory()) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.IS_DIR, str);
            }
            File parentFile = fileLJLIIL.getParentFile();
            if (parentFile != null && parentFile.exists() && parentFile.isDirectory()) {
                if (z) {
                    if (!fileLJLIIL.exists()) {
                        return C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, "no such file or directory, open ".concat(str));
                    }
                    length = fileLJLIIL.length() + ((long) bArr.length);
                } else {
                    length = bArr.length;
                }
                if (length > this.LIZIZ) {
                    return C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "file too large (" + length + " B > 100 MB)");
                }
                if (z && fileLJLIIL.exists()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileLJLIIL, true);
                    try {
                        fileOutputStream.write(bArr);
                        C2107108Nh.LIZ(fileOutputStream, null);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                th = null;
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(fileOutputStream, th);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } else {
                    C09BH.LJIIIIZZ(fileLJLIIL, bArr);
                }
                c098200Yq = C2220251Bv5.LIZJ(new C1849450yEB(fileLJLIIL.length(), fileLJLIIL.lastModified(), str, false), C2097908Jt.LIZJ(new Pair("success", Boolean.TRUE)));
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                EnumC2221121BwU enumC2221121BwU = EnumC2221121BwU.NO_SUCH_FILE;
                if (parentFile != null) {
                    path = parentFile.getPath();
                } else {
                    path = null;
                }
                return C2220251Bv5.LIZ(enumC2221121BwU, "no such file or directory " + path);
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJIILJJIL(String str, String str2, Function1<? super C2220221Bv2, Unit> function1) {
        LJLILLLLZI(new AObjectS26S2100000_34(this, str, str2, 6), function1);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJIILL(String str, String str2, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS26S2100000_34(this, str, str2, 2), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJIJJLI(String str, String str2, boolean z) {
        Object c098200Yq;
        if (a0.LJJJIL(str)) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "empty path");
        }
        if (!Intrinsics.LJFF(a0.LJLIIIL(str2).toString().toLowerCase(Locale.ROOT), "br")) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "compression must be br");
        }
        try {
            File fileLJLIIL = LJLIIL(str, false);
            if (!fileLJLIIL.exists()) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
            }
            if (fileLJLIIL.isDirectory()) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.IS_DIR, str);
            }
            if (!fileLJLIIL.canRead()) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.PERMISSION_DENIED, "permission denied");
            }
            C0VSP c0vsp = new C0VSP(fileLJLIIL);
            Throwable th = null;
            try {
                1MiW r8 = new 1MiW(c0vsp);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[131072];
                    long j = 0;
                    while (true) {
                        int i = r8.read(bArr);
                        if (i > 0) {
                            j += (long) i;
                            long j2 = this.LIZIZ;
                            if (j > j2) {
                                C2220221Bv2 c2220221Bv2LIZ = C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "decompressed > " + (j2 / ((long) 1048576)) + "MB (" + j + " B)");
                                C2107108Nh.LIZ(r8, null);
                                C2107108Nh.LIZ(c0vsp, null);
                                return c2220221Bv2LIZ;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (z) {
                                c098200Yq = C2220251Bv5.LIZJ(null, C2097608Jq.LJIIIIZZ(new Pair("data", byteArray), new Pair("encoding", "arraybuffer"), new Pair("length", Integer.valueOf(byteArray.length))));
                            } else {
                                c098200Yq = C2220251Bv5.LIZJ(null, C2097608Jq.LJIIIIZZ(new Pair("data", Base64.encodeToString(byteArray, 2)), new Pair("encoding", "base64"), new Pair("length", Integer.valueOf(byteArray.length))));
                            }
                            C2107108Nh.LIZ(r8, null);
                            C2107108Nh.LIZ(c0vsp, null);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        C2107108Nh.LIZ(r8, th);
                                        throw th;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                throw th;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                while (true) {
                                                    try {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        try {
                                                            C2107108Nh.LIZ(c0vsp, th);
                                                            throw th;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            TryCatchGuardChecker.doCheck(th);
                                                            c098200Yq = new C098200Yq(th);
                                                            C189200o6.m2constructorimpl(c098200Yq);
                                                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                                            if (thM5exceptionOrNullimpl != null) {
                                                                c098200Yq = LJLJJI(thM5exceptionOrNullimpl, EnumC2221121BwU.BROTLI_DECOMPRESS_FAIL);
                                                            }
                                                            return (C2220221Bv2) c098200Yq;
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        th = null;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
            }
        } catch (Throwable th12) {
            th = th12;
        }
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJI(long j, String str, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS9S1100100_34(this, str, j, 0), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJIJ(String str, String str2, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS26S2100000_34(this, str, str2, 9), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJIJIIJI(String str, String str2, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS26S2100000_34(this, str, str2, 11), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJIJIL(int i, byte[] bArr, Integer num) {
        Object c098200Yq;
        try {
            C2221201Bwc c2221201Bwc = this.LJIIIIZZ.get(Integer.valueOf(i));
            if (c2221201Bwc != null) {
                c2221201Bwc.LJFF.lock();
                try {
                    if (this.LJIIIIZZ.get(Integer.valueOf(i)) == c2221201Bwc) {
                        if (!c2221201Bwc.LIZLLL) {
                            c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.FLAG_PERMISSION_DENIED, "fd=" + i + " not writable");
                        } else if (num != null && num.intValue() < 0) {
                            c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.POSITION_OUT_OF_RANGE, "position=" + num);
                        } else if (num != null) {
                            long filePointer = c2221201Bwc.LIZ.getFilePointer();
                            try {
                                c2221201Bwc.LIZ.seek(num.intValue());
                                long jMax = Math.max(c2221201Bwc.LIZ.length(), c2221201Bwc.LIZ.getFilePointer() + ((long) bArr.length));
                                long j = this.LIZIZ;
                                if (jMax > j) {
                                    c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "file too large (" + jMax + " B > " + j + " B)");
                                    c2221201Bwc.LIZ.seek(filePointer);
                                } else {
                                    c2221201Bwc.LIZ.write(bArr);
                                    c2221201Bwc.LIZ.seek(filePointer);
                                    c098200Yq = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("bytesWritten", Integer.valueOf(bArr.length))));
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c2221201Bwc.LIZ.seek(filePointer);
                                throw th;
                            }
                        } else {
                            if (c2221201Bwc.LJ) {
                                RandomAccessFile randomAccessFile = c2221201Bwc.LIZ;
                                randomAccessFile.seek(randomAccessFile.length());
                            }
                            long jMax2 = Math.max(c2221201Bwc.LIZ.length(), c2221201Bwc.LIZ.getFilePointer() + ((long) bArr.length));
                            long j2 = this.LIZIZ;
                            if (jMax2 > j2) {
                                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "file too large (" + jMax2 + " B > " + j2 + " B)");
                            } else {
                                c2221201Bwc.LIZ.write(bArr);
                                c098200Yq = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("bytesWritten", Integer.valueOf(bArr.length))));
                            }
                        }
                        c2221201Bwc.LJFF.unlock();
                        C189200o6.m2constructorimpl(c098200Yq);
                    } else {
                        throw new IllegalArgumentException("bad fd");
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c2221201Bwc.LJFF.unlock();
                    throw th2;
                }
            } else {
                throw new IllegalArgumentException("bad fd");
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJ(String str, String str2, AObjectS15S1101000_34 aObjectS15S1101000_34) {
        LJLILLLLZI(new AObjectS26S2100000_34(this, str, str2, 0), aObjectS15S1101000_34);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJJJJIZL(int r14, int r15, java.lang.Integer r16) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJJJJIZL(int, int, java.lang.Integer):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJJJL(String str, boolean z, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS11S1110000_34(this, str, z, 3), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJJLL(final String str, final String str2, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new Function0() { // from class: X.1BwT
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i;
                C2221091BwR c2221091BwR = this.LL;
                String str3 = str;
                String str4 = str2;
                c2221091BwR.getClass();
                try {
                    try {
                        if (C2221091BwR.LJL(str4).getFirst() == EnumC2221141BwW.TEMP) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.PERMISSION_DENIED, "permission denied");
                        }
                        File fileLJLIIL = c2221091BwR.LJLIIL(str3, false);
                        File fileLJLIIL2 = c2221091BwR.LJLIIL(str4, true);
                        if (!fileLJLIIL.exists()) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, "no such file or directory " + str3);
                        }
                        if (fileLJLIIL.isDirectory()) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.OPERATION_NOT_PERMITTED, "operation not permitted");
                        }
                        if (!fileLJLIIL.canRead()) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.PERMISSION_DENIED, "permission denied");
                        }
                        long j = c2221091BwR.LIZIZ;
                        if (j <= 0) {
                            j = 104857600;
                        }
                        long length = fileLJLIIL.length();
                        if (length > j) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "zip too large (" + length + " B > " + j + " B)");
                        }
                        if (!C2221091BwR.LJJZZIII(fileLJLIIL)) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.UNZIP_OPEN_FAIL, "unzip open file fail");
                        }
                        if (fileLJLIIL2.exists() && !fileLJLIIL2.isDirectory()) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.NOT_DIR, "not a directory");
                        }
                        C2221091BwR.LJJZZI(fileLJLIIL2);
                        File canonicalFile = fileLJLIIL2.getCanonicalFile();
                        C0VSP c0vsp = new C0VSP(fileLJLIIL);
                        try {
                            ZipInputStream zipInputStream = new ZipInputStream(c0vsp);
                            try {
                                i = 0;
                                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                                    try {
                                        String name = nextEntry.getName();
                                        File fileLJLIL = C2221091BwR.LJLIL(canonicalFile, name);
                                        if (nextEntry.isDirectory() || u.LJIIZILJ(name, "/", false)) {
                                            C2221091BwR.LJJZZI(fileLJLIL);
                                        } else {
                                            File parentFile = fileLJLIL.getParentFile();
                                            if (parentFile == null) {
                                                throw new SecurityException("no parent for " + name);
                                            }
                                            C2221091BwR.LJJZZI(parentFile);
                                            if (!u.LJJIIJZLJL(parentFile.getCanonicalFile().getPath(), canonicalFile.getPath(), false)) {
                                                zipInputStream.closeEntry();
                                                throw new SecurityException("parent path escape for " + name);
                                            }
                                            C0VSV c0vsv = new C0VSV(fileLJLIL);
                                            try {
                                                byte[] bArr = new byte[8192];
                                                while (true) {
                                                    int i2 = zipInputStream.read(bArr);
                                                    if (i2 <= 0) {
                                                        break;
                                                    }
                                                    c0vsv.write(bArr, 0, i2);
                                                }
                                                C2107108Nh.LIZ(c0vsv, null);
                                                i++;
                                            } catch (Throwable th) {
                                                th = th;
                                                try {
                                                    try {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        th = null;
                                                        TryCatchGuardChecker.doCheck(th);
                                                        C2107108Nh.LIZ(c0vsv, th);
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                        }
                                        zipInputStream.closeEntry();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = null;
                                                TryCatchGuardChecker.doCheck(th);
                                                try {
                                                    C2107108Nh.LIZ(zipInputStream, th);
                                                    throw th;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    try {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            TryCatchGuardChecker.doCheck(th);
                                                            C2107108Nh.LIZ(c0vsp, th);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        th = null;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            TryCatchGuardChecker.doCheck(th);
                                            C2107108Nh.LIZ(zipInputStream, th);
                                            throw th;
                                        }
                                    }
                                }
                                try {
                                    C2107108Nh.LIZ(zipInputStream, null);
                                    try {
                                        C2107108Nh.LIZ(c0vsp, null);
                                        return i == 0 ? C2220251Bv5.LIZ(EnumC2221121BwU.UNZIP_OPEN_FAIL, "unzip open file fail") : C2220251Bv5.LIZJ(null, null);
                                    } catch (ZipException e) {
                                        e = e;
                                        TryCatchGuardChecker.doCheck(e);
                                        Pair pair = i == 0 ? new Pair(EnumC2221121BwU.UNZIP_OPEN_FAIL, "unzip open file fail") : new Pair(EnumC2221121BwU.UNZIP_ENTRY_FAIL, "unzip entry fail");
                                        return C2220251Bv5.LIZ((EnumC2221121BwU) pair.getFirst(), (String) pair.getSecond());
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                        }
                    } catch (Throwable th13) {
                        TryCatchGuardChecker.doCheck(th13);
                        return C2221091BwR.LJLJJI(th13, null);
                    }
                } catch (ZipException e2) {
                    e = e2;
                    i = 0;
                }
            }
        }, aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJJZ(int i, long j, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS5S0101100_34(this, i, j, 0), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJLIIL(String str, boolean z, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS11S1110000_34(this, str, z, 1), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJLIIIJJI(String str, String str2, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLILLLLZI(new AObjectS26S2100000_34(this, str, str2, 3), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LIZLLL(String str, String str2, Function1 function1, boolean z) {
        LJLILLLLZI(new AObjectS3S2110000_34(this, str, str2, z, 0), function1);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJII(int i, byte[] bArr, Integer num, AObjectS81S0201000_34 aObjectS81S0201000_34) {
        LJLILLLLZI(new AObjectS33S0301000_34(this, i, bArr, num, 0), aObjectS81S0201000_34);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJIIIIZZ(java.lang.String r8, java.lang.String r9, java.util.List r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221091BwR.LJIIIIZZ(java.lang.String, java.lang.String, java.util.List, boolean):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJIIZILJ(int i, int i2, String str, Charset charset) {
        byte[] bArr;
        C2220221Bv2 c2220221Bv2LJJJZ = LJJJZ(i, i2, str, "binary");
        C2220231Bv3 c2220231Bv3 = c2220221Bv2LJJJZ.LIZIZ;
        if (!c2220231Bv3.LIZ) {
            return c2220221Bv2LJJJZ;
        }
        Map<String, Object> map = c2220231Bv3.LIZLLL;
        Object obj = null;
        if (map != null) {
            obj = map.get("data");
        }
        if ((obj instanceof byte[]) && (bArr = (byte[]) obj) != null) {
            return C2220251Bv5.LIZJ(c2220221Bv2LJJJZ.LIZIZ.LIZIZ, C2097908Jt.LIZJ(new Pair("data", new String(bArr, charset))));
        }
        return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJJJ(int i, int i2, Integer num, AObjectS81S0201000_34 aObjectS81S0201000_34) {
        LJLILLLLZI(new AObjectS16S0202000_34(this, i, i2, num, 1), aObjectS81S0201000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJJL(String str, byte[] bArr, boolean z, Function1<? super C2220221Bv2, Unit> function1) {
        LJLILLLLZI(new AObjectS8S1210000_34(this, str, bArr, z, 0), function1);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJJZ(int i, int i2, String str, String str2) {
        int iMin;
        C2220221Bv2 c2220221Bv2LIZ;
        if (a0.LJJJIL(str)) {
            return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "Invalid argument");
        }
        try {
            File fileLJLIIL = LJLIIL(str, false);
            if (fileLJLIIL.isDirectory()) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.IS_DIR, str);
            }
            if (!fileLJLIIL.exists()) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileLJLIIL, "r");
            try {
                int length = (int) randomAccessFile.length();
                if (i < 0) {
                    C2220221Bv2 c2220221Bv2LIZ2 = C2220251Bv5.LIZ(EnumC2221121BwU.POSITION_OUT_OF_RANGE, "path=" + str + ", position=" + i + ", fileLen=" + length);
                    C2107108Nh.LIZ(randomAccessFile, null);
                    return c2220221Bv2LIZ2;
                }
                if (i > length) {
                    if (i2 >= 0) {
                        c2220221Bv2LIZ = C2220251Bv5.LIZJ(new C1849450yEB(0L, fileLJLIIL.lastModified(), str, false), C2097608Jq.LJIIIIZZ(new Pair("data", new byte[0]), new Pair("length", 0), new Pair("position", Integer.valueOf(i)), new Pair("encoding", str2)));
                    } else {
                        c2220221Bv2LIZ = C2220251Bv5.LIZ(EnumC2221121BwU.POSITION_OUT_OF_RANGE, "path=" + str + ", position=" + i + ", fileLen=" + length);
                    }
                    C2107108Nh.LIZ(randomAccessFile, null);
                    return c2220221Bv2LIZ;
                }
                if (i2 < -1) {
                    C2220221Bv2 c2220221Bv2LIZ3 = C2220251Bv5.LIZ(EnumC2221121BwU.LENGTH_OUT_OF_RANGE, "path=" + str + ", position=" + i + ", length=" + i2 + ", fileLen=" + length);
                    C2107108Nh.LIZ(randomAccessFile, null);
                    return c2220221Bv2LIZ3;
                }
                if (i2 == 0) {
                    iMin = 0;
                } else if (i2 < 0) {
                    iMin = length - i;
                } else {
                    iMin = Math.min(i2, length - i);
                }
                long j = iMin;
                long j2 = this.LIZJ;
                if (j > j2) {
                    C2220221Bv2 c2220221Bv2LIZ4 = C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "single read > " + (j2 / ((long) 1048576)) + "MB (" + iMin + " B)");
                    C2107108Nh.LIZ(randomAccessFile, null);
                    return c2220221Bv2LIZ4;
                }
                if (iMin != 0 && i != length) {
                    byte[] bArr = new byte[iMin];
                    randomAccessFile.seek(i);
                    randomAccessFile.readFully(bArr);
                    C2220221Bv2 c2220221Bv2LIZJ = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("data", bArr)));
                    C2107108Nh.LIZ(randomAccessFile, null);
                    return c2220221Bv2LIZJ;
                }
                C2220221Bv2 c2220221Bv2LIZJ2 = C2220251Bv5.LIZJ(new C1849450yEB(0L, fileLJLIIL.lastModified(), str, false), C2097608Jq.LJIIIIZZ(new Pair("data", new byte[0]), new Pair("length", 0), new Pair("position", Integer.valueOf(i)), new Pair("encoding", str2)));
                C2107108Nh.LIZ(randomAccessFile, null);
                return c2220221Bv2LIZJ2;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    C2107108Nh.LIZ(randomAccessFile, th);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    TryCatchGuardChecker.doCheck(th);
                                    Object c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                                    if (thM5exceptionOrNullimpl != null) {
                                        c098200Yq = LJLJJI(thM5exceptionOrNullimpl, null);
                                    }
                                    return (C2220221Bv2) c098200Yq;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = null;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJIIZ(String str, List<C2221071BwP> list, boolean z, String str2, Function1<? super C2220221Bv2, Unit> function1) {
        LJLILLLLZI(new AObjectS3S2210000_34(this, str, list, z, str2, 0), function1);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJIL(int i, int i2, String str, String str2, Function1 function1) {
        LJLILLLLZI(new AObjectS0S2102000_34(this, str, i, i2, str2, 0), function1);
    }
}
