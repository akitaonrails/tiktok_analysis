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
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221081BwQ implements InterfaceC2220701Bvo {
    public static final /* synthetic */ int LJIILL = 0;
    public final C1304160k2g LIZ;
    public long LIZIZ;
    public long LIZJ;
    public C09KX LJFF;
    public C09KV LJI;
    public final ReentrantLock LJIIL;
    public final Condition LJIILIIL;
    public final ReentrantLock[] LJIILJJIL;
    public String LIZLLL = "";
    public String LJ = "";
    public final C054G LJII = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final ConcurrentHashMap<Integer, C2221191Bwb> LJIIIIZZ = new ConcurrentHashMap<>();
    public final AtomicInteger LJIIIZ = new AtomicInteger(3);
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public final AtomicInteger LJIIJJI = new AtomicInteger(0);

    @Override // X.InterfaceC1304090k2Z
    public final void onPause() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onResume() {
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onExit() throws Throwable {
        Object c098200Yq;
        this.LJIIJ.set(true);
        C09AE c09ae = (C09AE) this.LJII.LL.get(C09AE.LJJLJ);
        if (c09ae != null) {
            C23118094a.LJFF(c09ae);
        }
        long jNanoTime = System.nanoTime();
        C23250099c.LJ(C23271099x.INSTANCE, new C445001oG(800000000L, jNanoTime, c09ae, null));
        long jNanoTime2 = 800000000 - (System.nanoTime() - jNanoTime);
        if (jNanoTime2 > 0) {
            this.LJIIL.lock();
            while (this.LJIIJJI.get() > 0 && jNanoTime2 > 0) {
                try {
                    try {
                        jNanoTime2 = this.LJIILIIL.awaitNanos(jNanoTime2);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LJIIL.unlock();
                    throw th;
                }
            }
            this.LJIIL.unlock();
        }
        Set<Map.Entry<Integer, C2221191Bwb>> setEntrySet = this.LJIIIIZZ.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        for (Pair pair : arrayList) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            C2221191Bwb c2221191Bwb = (C2221191Bwb) pair.getSecond();
            try {
                if (this.LJIIIIZZ.remove(Integer.valueOf(iIntValue), c2221191Bwb)) {
                    ReentrantLock reentrantLockLJLIIIL = LJLIIIL(c2221191Bwb.LIZIZ);
                    reentrantLockLJLIIIL.lock();
                    try {
                        c2221191Bwb.LJI.lock();
                        try {
                            c2221191Bwb.LIZ.close();
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } finally {
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            try {
                                thM5exceptionOrNullimpl.getMessage();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c2221191Bwb.LJI.unlock();
                            }
                        }
                        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                        }
                        c2221191Bwb.LJI.unlock();
                        reentrantLockLJLIIIL.unlock();
                        C189200o6.m1boximpl(c098200Yq);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        reentrantLockLJLIIIL.unlock();
                        throw th3;
                    }
                } else {
                    continue;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.getMessage();
            }
        }
        this.LJIIJJI.get();
        this.LJIIIIZZ.size();
    }

    @Override // X.InterfaceC1304090k2Z
    public final void onStart() {
        C2353409Ka c2353409Ka = this.LIZ.LJIIIZ;
        this.LIZLLL = c2353409Ka.LIZ.path;
        this.LJ = c2353409Ka.LIZIZ.path;
        String str = c2353409Ka.LJ.path;
        LJJZZIII(new C0VSJ(this.LIZLLL));
        LJJZZIII(new C0VSJ(this.LJ));
        LJJZZIII(new C0VSJ(str));
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

    public C2221081BwQ(C1304160k2g c1304160k2g) {
        this.LIZ = c1304160k2g;
        int i = 0;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LJIIL = reentrantLock;
        this.LJIILIIL = reentrantLock.newCondition();
        ReentrantLock[] reentrantLockArr = new ReentrantLock[64];
        do {
            reentrantLockArr[i] = new ReentrantLock();
            i++;
        } while (i < 64);
        this.LJIILJJIL = reentrantLockArr;
    }

    public static String LJJZZI(File file) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            return file.getCanonicalPath();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String absolutePath = file.getAbsolutePath();
            if (absolutePath.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                char c = File.separatorChar;
                if (c != '/') {
                    absolutePath = u.LJJI(absolutePath, '/', c, false);
                }
                if (absolutePath.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && absolutePath.charAt(0) == c) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                List listLJJLIIIJ = a0.LJJLIIIJ(absolutePath, new char[]{c}, false, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJJLIIIJ) {
                    String str = (String) obj;
                    if (str.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && !Intrinsics.LJFF(str, e3.d)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        arrayList.add(obj);
                    }
                }
                C13E8 c13e8 = new C13E8(arrayList.size());
                for (Object obj2 : arrayList) {
                    if (Intrinsics.LJFF(obj2, "..")) {
                        if ((!c13e8.isEmpty()) && !Intrinsics.LJFF(c13e8.last(), "..")) {
                            c13e8.removeLast();
                        } else if (!z3) {
                            c13e8.addLast("..");
                        }
                    } else {
                        c13e8.addLast(obj2);
                    }
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(c13e8, String.valueOf(c), null, null, 0, null, null, 62);
                if (z3) {
                    return c + strLJJLIIIJ;
                }
                return strLJJLIIIJ;
            }
            return absolutePath;
        }
    }

    public static final void LJJZZIII(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJLI(java.io.File r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJLI(java.io.File):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.CharSequence, java.lang.String] */
    public static final Pair<EnumC2221151BwX, String> LJLIIL(String str) {
        C259800zU c259800zU = new C259800zU();
        ?? LJLJJLL = a0.LJLJJLL(a0.LJLIIIL(str).toString(), '/', '\\');
        c259800zU.element = LJLJJLL;
        ?? ReplaceFirst = new Regex("^ttfile:/+").replaceFirst(LJLJJLL, "ttfile://");
        c259800zU.element = ReplaceFirst;
        ?? ReplaceFirst2 = new Regex("^ttpluginfile:/+").replaceFirst(ReplaceFirst, "ttpluginfile://");
        c259800zU.element = ReplaceFirst2;
        String lowerCase = ReplaceFirst2.toLowerCase(Locale.ROOT);
        if (u.LJJIIJZLJL(lowerCase, "ttpluginfile://", false)) {
            return new Pair<>(EnumC2221151BwX.PLUGIN, c259800zU.element);
        }
        String strLJLIL = LJLIL(lowerCase, "user", c259800zU);
        if (strLJLIL != null) {
            return new Pair<>(EnumC2221151BwX.USER, strLJLIL);
        }
        String strLJLIL2 = LJLIL(lowerCase, "temp", c259800zU);
        if (strLJLIL2 != null) {
            return new Pair<>(EnumC2221151BwX.TEMP, strLJLIL2);
        }
        String strLJLIL3 = LJLIL(lowerCase, "arch", c259800zU);
        if (strLJLIL3 != null) {
            return new Pair<>(EnumC2221151BwX.ARCH, strLJLIL3);
        }
        return new Pair<>(EnumC2221151BwX.PKG, c259800zU.element);
    }

    public static EnumC2221121BwU LJLJLJ(EnumC2221151BwX enumC2221151BwX) {
        int i = C2221161BwY.LIZ[enumC2221151BwX.ordinal()];
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

    public static final String LJLJLLL(C2220221Bv2 c2220221Bv2) {
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
        if (LJLJI(str, false).exists()) {
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return C2220251Bv5.LIZJ(null, null);
            }
            return LJLJL(thM5exceptionOrNullimpl, null);
        }
        throw new FileNotFoundException(str.concat(" not found"));
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJI(int i) {
        Object c098200Yq;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!this.LJIIJ.get()) {
            this.LJIIJJI.incrementAndGet();
            try {
                if (!this.LJIIJ.get()) {
                    C2221191Bwb c2221191BwbRemove = this.LJIIIIZZ.remove(Integer.valueOf(i));
                    if (c2221191BwbRemove == null) {
                        c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.BAD_FD, "");
                    } else {
                        ReentrantLock reentrantLockLJLIIIL = LJLIIIL(c2221191BwbRemove.LIZIZ);
                        reentrantLockLJLIIIL.lock();
                        try {
                            c2221191BwbRemove.LJI.lock();
                            try {
                                c2221191BwbRemove.LIZ.close();
                                c2221191BwbRemove.LJI.unlock();
                                reentrantLockLJLIIIL.unlock();
                                c098200Yq = C2220251Bv5.LIZJ(null, null);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c2221191BwbRemove.LJI.unlock();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            reentrantLockLJLIIIL.unlock();
                            throw th3;
                        }
                    }
                    this.LJIIL.lock();
                    try {
                        if (this.LJIIJJI.decrementAndGet() == 0) {
                            this.LJIILIIL.signalAll();
                        }
                        this.LJIIL.unlock();
                        C189200o6.m2constructorimpl(c098200Yq);
                    } finally {
                    }
                } else {
                    throw new IllegalStateException("FileService closed");
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                this.LJIIL.lock();
                try {
                    if (this.LJIIJJI.decrementAndGet() == 0) {
                        this.LJIILIIL.signalAll();
                    }
                    this.LJIIL.unlock();
                    throw th4;
                } finally {
                }
            }
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        } else {
            throw new IllegalStateException("FileService closed");
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJL(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJIJ(int r8) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJIJ(int):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJIIJ(String str) {
        Object c098200Yq;
        Object objLJJLL;
        try {
            File fileLJLJI = LJLJI(str, false);
            if (!fileLJLJI.exists()) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
            } else if (!fileLJLJI.isDirectory()) {
                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NOT_DIR, str);
            } else {
                C1849450yEB c1849450yEB = new C1849450yEB(0L, fileLJLJI.lastModified(), str, true);
                String[] list = fileLJLJI.list();
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
            c098200Yq = LJLJL(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJI(Function0<Unit> function0) {
        C23250099c.LIZLLL(this.LJII, null, null, new C827960Wdu(this, function0, null), 3);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJLL(AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS408S0100000_34(this, 3), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJLIIIIJ(String str) {
        if (str != null && str.length() != 0) {
            if (u.LJJIIJZLJL(str, "data:", false)) {
                return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("url", str)));
            }
            if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
                try {
                    return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("url", Uri.fromFile(LJLJI(str, false)).toString())));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return LJLJL(th, null);
                }
            }
            return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("url", str)));
        }
        return C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "empty url");
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJLIIIJ(String str) {
        Object c098200Yq;
        File fileLJLJI;
        try {
            fileLJLJI = LJLJI(str, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (fileLJLJI.exists()) {
            C09KY.LIZ.getClass();
            c098200Yq = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("stats", C09KY.LIZ(fileLJLJI))));
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return (C2220221Bv2) c098200Yq;
            }
            return LJLJL(thM5exceptionOrNullimpl, null);
        }
        throw new FileNotFoundException("not found");
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJLIIIJJIZ(String str) {
        Object c098200Yq;
        try {
            File fileLJLJI = LJLJI(str, true);
            ReentrantLock reentrantLockLJLIIIL = LJLIIIL(LJJZZI(fileLJLJI));
            reentrantLockLJLIIIL.lock();
            try {
                if (!fileLJLJI.exists()) {
                    c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
                } else if (fileLJLJI.isDirectory()) {
                    c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.IS_DIR, str);
                } else if (!fileLJLJI.delete()) {
                    c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "delete fail");
                } else {
                    c098200Yq = C2220251Bv5.LIZJ(null, null);
                }
                reentrantLockLJLIIIL.unlock();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLockLJLIIIL.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJL(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    public final int LJL(String str) {
        return (int) ((((long) str.hashCode()) & 4294967295L) % (4294967295L & ((long) this.LJIILJJIL.length)));
    }

    public final ReentrantLock LJLIIIL(String str) {
        return this.LJIILJJIL[LJL(str)];
    }

    public static final File LJLJJI(File file, String str) throws IOException {
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
    public static final java.lang.String LJLJJLL(java.lang.String r7, byte[] r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJLJJLL(java.lang.String, byte[]):java.lang.String");
    }

    public static final C2220221Bv2 LJLJL(Throwable th, EnumC2221121BwU enumC2221121BwU) {
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
                    } else if (th instanceof IllegalStateException) {
                        enumC2221121BwU = EnumC2221121BwU.IO_ERROR;
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
            File fileLJLJI = LJLJI(str, true);
            ReentrantLock reentrantLockLJLIIIL = LJLIIIL(LJJZZI(fileLJLJI));
            reentrantLockLJLIIIL.lock();
            try {
                if (!fileLJLJI.exists()) {
                    c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
                } else if (!fileLJLJI.isDirectory()) {
                    c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.NOT_DIR, str);
                } else {
                    if (!z) {
                        String[] list = fileLJLJI.list();
                        if (list != null && list.length != 0) {
                            c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.DIR_NOT_EMPTY, "Directory not empty: " + str);
                        } else {
                            zLJIIZILJ = fileLJLJI.delete();
                        }
                    } else {
                        zLJIIZILJ = C08QA.LJIIZILJ(fileLJLJI);
                    }
                    if (!zLJIIZILJ) {
                        c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.IO_ERROR, "delete fail");
                    } else {
                        c098200Yq = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("success", Boolean.TRUE)));
                    }
                }
                reentrantLockLJLIIIL.unlock();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLockLJLIIIL.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJL(thM5exceptionOrNullimpl, null);
        }
        C2220221Bv2 c2220221Bv2 = (C2220221Bv2) c098200Yq;
        boolean z2 = c2220221Bv2.LIZIZ.LIZ;
        return c2220221Bv2;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5 A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:6:0x0037, B:8:0x003d, B:9:0x0045, B:11:0x004b, B:12:0x005f, B:14:0x0065, B:15:0x006d, B:17:0x0077, B:18:0x008d, B:20:0x0093, B:22:0x009a, B:24:0x00a0, B:26:0x00a6, B:27:0x00ad, B:29:0x00b3, B:31:0x00b9, B:33:0x00bf, B:39:0x00e5, B:34:0x00d2, B:36:0x00d8, B:38:0x00de, B:40:0x00f0, B:42:0x00f4, B:43:0x00f8), top: B:116:0x0037, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dc A[Catch: all -> 0x021a, TryCatch #6 {all -> 0x021a, blocks: (B:62:0x0168, B:64:0x016e, B:65:0x0184, B:67:0x018a, B:69:0x0191, B:71:0x0197, B:73:0x019d, B:74:0x01a4, B:76:0x01aa, B:78:0x01b0, B:80:0x01b6, B:86:0x01dc, B:81:0x01c9, B:83:0x01cf, B:85:0x01d5, B:87:0x01e6, B:89:0x01ea, B:90:0x01ee, B:98:0x0216), top: B:120:0x0127 }] */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LIZJ(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LIZJ(java.lang.String, java.lang.String):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJ(String str, Function1<? super C2220221Bv2, Unit> function1) {
        LJLJJL(new AObjectS96S1100000_34(this, str, 7), function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJIIIZ(int r8, long r9) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJIIIZ(int, long):X.1Bv2");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01cd A[Catch: all -> 0x01f6, TryCatch #2 {all -> 0x01f6, blocks: (B:77:0x0150, B:79:0x0156, B:85:0x0164, B:87:0x016a, B:89:0x0170, B:91:0x0176, B:93:0x017c, B:94:0x0183, B:96:0x0189, B:98:0x018f, B:99:0x0196, B:101:0x019c, B:104:0x01a3, B:107:0x01ad, B:110:0x01b2, B:111:0x01c3, B:112:0x01c8, B:113:0x01c9, B:115:0x01cd, B:116:0x01d1, B:84:0x0161), top: B:138:0x0150, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116 A[Catch: all -> 0x0132, TryCatch #1 {all -> 0x0132, blocks: (B:29:0x0099, B:31:0x009f, B:37:0x00ad, B:39:0x00b3, B:41:0x00b9, B:43:0x00bf, B:45:0x00c5, B:46:0x00cc, B:48:0x00d2, B:50:0x00d8, B:51:0x00df, B:53:0x00e5, B:56:0x00ec, B:59:0x00f6, B:62:0x00fb, B:63:0x010c, B:64:0x0111, B:65:0x0112, B:67:0x0116, B:68:0x011a, B:36:0x00aa), top: B:137:0x0099, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJIILLIIL(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJIILLIIL(java.lang.String, java.lang.String):X.1Bv2");
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
            kotlin.Pair r0 = LJLIIL(r8)     // Catch: java.lang.Throwable -> La5
            java.lang.Object r3 = r0.getFirst()     // Catch: java.lang.Throwable -> La5
            X.1BwX r3 = (X.EnumC2221151BwX) r3     // Catch: java.lang.Throwable -> La5
            X.1BwX r0 = X.EnumC2221151BwX.USER     // Catch: java.lang.Throwable -> La5
            r2 = 2
            r5 = 1
            if (r3 == r0) goto L53
            X.1BwX r0 = X.EnumC2221151BwX.TEMP     // Catch: java.lang.Throwable -> La5
            if (r3 == r0) goto L53
            X.1BwX r0 = X.EnumC2221151BwX.ARCH     // Catch: java.lang.Throwable -> La5
            if (r3 == r0) goto L53
            int[] r1 = X.C2221161BwY.LIZ     // Catch: java.lang.Throwable -> La5
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
            X.1Bwa r0 = X.EnumC2221181Bwa.LL     // Catch: java.lang.Throwable -> La5
            java.io.File r4 = r7.LJLILLLLZI(r8, r0)     // Catch: java.lang.Throwable -> La5
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
            X.1Bv2 r2 = LJLJL(r1, r0)
        Lbc:
            X.1Bv2 r2 = (X.C2220221Bv2) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJIJI(java.lang.String, java.lang.String):X.1Bv2");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJIJJ(java.lang.String r14, boolean r15) {
        /*
            r13 = this;
            java.lang.String r4 = "mkdir failed: "
            java.lang.String r6 = "file exists at "
            r12 = 1
            r11 = r14
            java.io.File r5 = r13.LJLJI(r11, r12)     // Catch: java.lang.Throwable -> La5
            java.lang.String r0 = LJJZZI(r5)     // Catch: java.lang.Throwable -> La5
            java.util.concurrent.locks.ReentrantLock r3 = r13.LJLIIIL(r0)     // Catch: java.lang.Throwable -> La5
            r3.lock()     // Catch: java.lang.Throwable -> La5
            java.io.File r1 = r5.getParentFile()     // Catch: java.lang.Throwable -> L9d
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L36
            X.1BwU r2 = X.EnumC2221121BwU.ALREADY_EXISTS     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L9d
            r0.append(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9d
            X.1Bv2 r0 = X.C2220251Bv5.LIZ(r2, r0)     // Catch: java.lang.Throwable -> L9d
            goto L96
        L36:
            if (r15 == 0) goto L3d
            boolean r0 = r5.mkdirs()     // Catch: java.lang.Throwable -> L9d
            goto L41
        L3d:
            boolean r0 = r5.mkdir()     // Catch: java.lang.Throwable -> L9d
        L41:
            if (r0 != 0) goto L7a
            if (r1 == 0) goto L46
            goto L51
        L46:
            if (r15 != 0) goto L4b
            X.1BwU r2 = X.EnumC2221121BwU.NO_SUCH_FILE     // Catch: java.lang.Throwable -> L9d
            goto L65
        L4b:
            if (r1 == 0) goto L4e
            goto L57
        L4e:
            X.1BwU r2 = X.EnumC2221121BwU.IO_ERROR     // Catch: java.lang.Throwable -> L9d
            goto L65
        L51:
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L9d
            if (r0 != r12) goto L46
        L57:
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L9d
            if (r0 != r12) goto L4e
            boolean r0 = r1.canWrite()     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto L4e
            X.1BwU r2 = X.EnumC2221121BwU.PERMISSION_DENIED     // Catch: java.lang.Throwable -> L9d
        L65:
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L9d
            r0.append(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9d
            X.1Bv2 r0 = X.C2220251Bv5.LIZ(r2, r0)     // Catch: java.lang.Throwable -> L9d
            goto L96
        L7a:
            X.0yEB r6 = new X.0yEB     // Catch: java.lang.Throwable -> L9d
            r7 = 0
            long r9 = r5.lastModified()     // Catch: java.lang.Throwable -> L9d
            r6.<init>(r7, r9, r11, r12)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "success"
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L9d
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L9d
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L9d
            java.util.Map r0 = X.C2097908Jt.LIZJ(r0)     // Catch: java.lang.Throwable -> L9d
            X.1Bv2 r0 = X.C2220251Bv5.LIZJ(r6, r0)     // Catch: java.lang.Throwable -> L9d
        L96:
            r3.unlock()     // Catch: java.lang.Throwable -> La5
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> La5
            goto Lb1
        L9d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9d
            r3.unlock()     // Catch: java.lang.Throwable -> La5
            throw r0     // Catch: java.lang.Throwable -> La5
        La5:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        Lb1:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r1 == 0) goto Lbc
            r0 = 0
            X.1Bv2 r0 = LJLJL(r1, r0)
        Lbc:
            X.1Bv2 r0 = (X.C2220221Bv2) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJIJJ(java.lang.String, boolean):X.1Bv2");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJIL(java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJIL(java.lang.String, java.lang.String):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJII(String str, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS96S1100000_34(this, str, 4), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJIJIIJIL(String str, Function1<? super C2220221Bv2, Unit> function1) {
        LJLJJL(new AObjectS96S1100000_34(this, str, 5), function1);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJIL(String str, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS96S1100000_34(this, str, 1), aObjectS89S0101000_34);
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
            java.io.File r1 = r4.LJLJI(r7, r0)     // Catch: java.lang.Throwable -> L2e
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
            X.1Bv2 r0 = LJLJL(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJJJJ(long, java.lang.String):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJJI(String str, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS96S1100000_34(this, str, 9), aObjectS89S0101000_34);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0236  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJJJJZI(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJJJJZI(java.lang.String, java.lang.String):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJL(int i, C2220441BvO c2220441BvO) {
        LJLJJL(new AObjectS103S0101000_34(this, i, 1), c2220441BvO);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJLI(int i, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS103S0101000_34(this, i, 4), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJLIIIJILLIZJL(String str, String str2) {
        return LJIJJLI(str, str2, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144 A[Catch: all -> 0x028d, TryCatch #4 {all -> 0x028d, blocks: (B:50:0x0138, B:52:0x0144, B:54:0x014d, B:56:0x0154, B:60:0x015b, B:111:0x0279), top: B:134:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d A[Catch: all -> 0x028d, TryCatch #4 {all -> 0x028d, blocks: (B:50:0x0138, B:52:0x0144, B:54:0x014d, B:56:0x0154, B:60:0x015b, B:111:0x0279), top: B:134:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de A[Catch: all -> 0x0280, TryCatch #0 {all -> 0x0280, blocks: (B:61:0x016a, B:63:0x0170, B:65:0x0176, B:66:0x017e, B:68:0x0184, B:70:0x0188, B:71:0x0190, B:73:0x0194, B:75:0x019a, B:76:0x01a2, B:78:0x01a6, B:80:0x01ac, B:82:0x01b2, B:84:0x01b8, B:86:0x01be, B:88:0x01c4, B:90:0x01ca, B:91:0x01d4, B:92:0x01de, B:94:0x01e2, B:96:0x01e6, B:98:0x01ef, B:99:0x01f4, B:101:0x01f8, B:102:0x01ff, B:107:0x0221, B:109:0x0227, B:110:0x022b, B:106:0x0216, B:104:0x020d), top: B:127:0x016a, inners: #2 }] */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJJLIIIJL(java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJJLIIIJL(java.lang.String, java.lang.String):X.1Bv2");
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
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJJZ(X.09NU, X.1BwP):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fb, code lost:
    
        if (r6 != X.EnumC2221151BwX.ARCH) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0167, code lost:
    
        throw new java.lang.IllegalAccessException("permission denied");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6 == X.EnumC2221151BwX.TEMP) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File LJLILLLLZI(java.lang.String r9, X.EnumC2221181Bwa r10) throws java.lang.IllegalAccessException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJLILLLLZI(java.lang.String, X.1Bwa):java.io.File");
    }

    public final File LJLJI(String str, boolean z) {
        EnumC2221181Bwa enumC2221181Bwa;
        if (z) {
            enumC2221181Bwa = EnumC2221181Bwa.LLILLJJLI;
        } else {
            enumC2221181Bwa = EnumC2221181Bwa.LL;
        }
        return LJLILLLLZI(str, enumC2221181Bwa);
    }

    public final <T> void LJLJJL(Function0<? extends T> function0, Function1<? super T, Unit> function1) {
        C23250099c.LIZLLL(this.LJII, null, null, new C827970Wdv(this, function1, function0, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LJLIL(String str, String str2, C259800zU c259800zU) {
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
        LJLJJL(new AObjectS82S1200000_34(this, str, bArr, 0), aObjectS89S0101000_34);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x0121, TryCatch #2 {all -> 0x0121, blocks: (B:8:0x0029, B:10:0x0030, B:12:0x0036, B:14:0x003c, B:16:0x0042, B:18:0x0048, B:21:0x0054, B:23:0x005a, B:27:0x006d, B:29:0x0073, B:30:0x0077, B:31:0x007a, B:33:0x0080, B:35:0x009b, B:52:0x00c8, B:53:0x00cb, B:49:0x00bc, B:51:0x00c4, B:26:0x006a, B:66:0x00ff, B:68:0x0103, B:69:0x0107), top: B:91:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJIIL(java.lang.String r16, byte[] r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJIIL(java.lang.String, byte[], boolean):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJIILJJIL(String str, String str2, Function1<? super C2220221Bv2, Unit> function1) {
        LJLJJL(new AObjectS26S2100000_34(this, str, str2, 8), function1);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJIILL(String str, String str2, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS26S2100000_34(this, str, str2, 1), aObjectS89S0101000_34);
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
            File fileLJLJI = LJLJI(str, false);
            if (!fileLJLJI.exists()) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, str);
            }
            if (fileLJLJI.isDirectory()) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.IS_DIR, str);
            }
            if (!fileLJLJI.canRead()) {
                return C2220251Bv5.LIZ(EnumC2221121BwU.PERMISSION_DENIED, "permission denied");
            }
            C0VSP c0vsp = new C0VSP(fileLJLJI);
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
                                                                c098200Yq = LJLJL(thM5exceptionOrNullimpl, EnumC2221121BwU.BROTLI_DECOMPRESS_FAIL);
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
        LJLJJL(new AObjectS9S1100100_34(this, str, j, 1), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJIJ(String str, String str2, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS26S2100000_34(this, str, str2, 4), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJIJIIJI(String str, String str2, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS26S2100000_34(this, str, str2, 7), aObjectS89S0101000_34);
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x01e0  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJJIJIL(int r14, byte[] r15, java.lang.Integer r16) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJJIJIL(int, byte[], java.lang.Integer):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJ(String str, String str2, AObjectS15S1101000_34 aObjectS15S1101000_34) {
        LJLJJL(new AObjectS26S2100000_34(this, str, str2, 10), aObjectS15S1101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final C2220221Bv2 LJJJJIZL(int i, int i2, Integer num) {
        Object c098200Yq;
        int i3;
        byte[] bArrCopyOf;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!this.LJIIJ.get()) {
            this.LJIIJJI.incrementAndGet();
            try {
                if (!this.LJIIJ.get()) {
                    if (i2 == 0) {
                        c098200Yq = C2220251Bv5.LIZJ(null, C2097608Jq.LJIIIIZZ(new Pair("data", new byte[0]), new Pair("bytesRead", 0)));
                    } else if (i2 < 0) {
                        c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.LENGTH_OUT_OF_RANGE, "length=" + i2);
                    } else {
                        long j = i2;
                        long j2 = this.LIZJ;
                        if (j > j2) {
                            c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "single read > " + (j2 / ((long) 1048576)) + "MB (" + i2 + " B)");
                        } else {
                            C2221191Bwb c2221191Bwb = this.LJIIIIZZ.get(Integer.valueOf(i));
                            if (c2221191Bwb != null) {
                                ReentrantLock reentrantLockLJLIIIL = LJLIIIL(c2221191Bwb.LIZIZ);
                                reentrantLockLJLIIIL.lock();
                                try {
                                    c2221191Bwb.LJI.lock();
                                    try {
                                        if (this.LJIIIIZZ.get(Integer.valueOf(i)) == c2221191Bwb) {
                                            if (!c2221191Bwb.LIZLLL) {
                                                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.FLAG_PERMISSION_DENIED, "fd=" + i + " not readable");
                                            } else if (num != null && num.intValue() < 0) {
                                                c098200Yq = C2220251Bv5.LIZ(EnumC2221121BwU.POSITION_OUT_OF_RANGE, "position=" + num);
                                            } else {
                                                byte[] bArr = new byte[i2];
                                                if (num == null) {
                                                    i3 = c2221191Bwb.LIZ.read(bArr);
                                                } else {
                                                    long filePointer = c2221191Bwb.LIZ.getFilePointer();
                                                    try {
                                                        c2221191Bwb.LIZ.seek(num.intValue());
                                                        i3 = c2221191Bwb.LIZ.read(bArr);
                                                        c2221191Bwb.LIZ.seek(filePointer);
                                                    } catch (Throwable th2) {
                                                        TryCatchGuardChecker.doCheck(th2);
                                                        c2221191Bwb.LIZ.seek(filePointer);
                                                        throw th2;
                                                    }
                                                }
                                                if (i3 <= 0) {
                                                    bArrCopyOf = new byte[0];
                                                } else {
                                                    bArrCopyOf = Arrays.copyOf(bArr, i3);
                                                }
                                                c098200Yq = C2220251Bv5.LIZJ(null, C2097608Jq.LJIIIIZZ(new Pair("data", bArrCopyOf), new Pair("bytesRead", Integer.valueOf(bArrCopyOf.length))));
                                            }
                                            c2221191Bwb.LJI.unlock();
                                            reentrantLockLJLIIIL.unlock();
                                        } else {
                                            throw new IllegalArgumentException("bad fd");
                                        }
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                        c2221191Bwb.LJI.unlock();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    reentrantLockLJLIIIL.unlock();
                                    throw th4;
                                }
                            } else {
                                throw new IllegalArgumentException("bad fd");
                            }
                        }
                    }
                    this.LJIIL.lock();
                    try {
                        if (this.LJIIJJI.decrementAndGet() == 0) {
                            this.LJIILIIL.signalAll();
                        }
                        this.LJIIL.unlock();
                        C189200o6.m2constructorimpl(c098200Yq);
                    } finally {
                    }
                } else {
                    throw new IllegalStateException("FileService closed");
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                this.LJIIL.lock();
                try {
                    if (this.LJIIJJI.decrementAndGet() == 0) {
                        this.LJIILIIL.signalAll();
                    }
                    this.LJIIL.unlock();
                    throw th5;
                } finally {
                }
            }
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        } else {
            throw new IllegalStateException("FileService closed");
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = LJLJL(thM5exceptionOrNullimpl, null);
        }
        return (C2220221Bv2) c098200Yq;
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJJJL(String str, boolean z, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS11S1110000_34(this, str, z, 0), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJJLL(final String str, final String str2, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new Function0() { // from class: X.1BwS
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i;
                C2221081BwQ c2221081BwQ = this.LL;
                String str3 = str;
                String str4 = str2;
                c2221081BwQ.getClass();
                try {
                    try {
                        if (C2221081BwQ.LJLIIL(str4).getFirst() == EnumC2221151BwX.TEMP) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.PERMISSION_DENIED, "permission denied");
                        }
                        File fileLJLJI = c2221081BwQ.LJLJI(str3, false);
                        File fileLJLJI2 = c2221081BwQ.LJLJI(str4, true);
                        if (!fileLJLJI.exists()) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, "no such file or directory " + str3);
                        }
                        if (fileLJLJI.isDirectory()) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.OPERATION_NOT_PERMITTED, "operation not permitted");
                        }
                        if (!fileLJLJI.canRead()) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.PERMISSION_DENIED, "permission denied");
                        }
                        long j = c2221081BwQ.LIZIZ;
                        if (j <= 0) {
                            j = 104857600;
                        }
                        long length = fileLJLJI.length();
                        if (length > j) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.STORAGE_EXCEEDED, "zip too large (" + length + " B > " + j + " B)");
                        }
                        if (!C2221081BwQ.LJLI(fileLJLJI)) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.UNZIP_OPEN_FAIL, "unzip open file fail");
                        }
                        if (fileLJLJI2.exists() && !fileLJLJI2.isDirectory()) {
                            return C2220251Bv5.LIZ(EnumC2221121BwU.NOT_DIR, "not a directory");
                        }
                        C2221081BwQ.LJJZZIII(fileLJLJI2);
                        File canonicalFile = fileLJLJI2.getCanonicalFile();
                        C0VSP c0vsp = new C0VSP(fileLJLJI);
                        try {
                            ZipInputStream zipInputStream = new ZipInputStream(c0vsp);
                            try {
                                i = 0;
                                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                                    try {
                                        String name = nextEntry.getName();
                                        File fileLJLJJI = C2221081BwQ.LJLJJI(canonicalFile, name);
                                        if (nextEntry.isDirectory() || u.LJIIZILJ(name, "/", false)) {
                                            C2221081BwQ.LJJZZIII(fileLJLJJI);
                                        } else {
                                            File parentFile = fileLJLJJI.getParentFile();
                                            if (parentFile == null) {
                                                throw new SecurityException("no parent for " + name);
                                            }
                                            C2221081BwQ.LJJZZIII(parentFile);
                                            if (!u.LJJIIJZLJL(parentFile.getCanonicalFile().getPath(), canonicalFile.getPath(), false)) {
                                                zipInputStream.closeEntry();
                                                throw new SecurityException("parent path escape for " + name);
                                            }
                                            C0VSV c0vsv = new C0VSV(fileLJLJJI);
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
                        return C2221081BwQ.LJLJL(th13, null);
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
        LJLJJL(new AObjectS5S0101100_34(this, i, j, 1), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJLIIL(String str, boolean z, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS11S1110000_34(this, str, z, 2), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJLIIIJJI(String str, String str2, AObjectS89S0101000_34 aObjectS89S0101000_34) {
        LJLJJL(new AObjectS26S2100000_34(this, str, str2, 5), aObjectS89S0101000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LIZLLL(String str, String str2, Function1 function1, boolean z) {
        LJLJJL(new AObjectS3S2110000_34(this, str, str2, z, 1), function1);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJII(int i, byte[] bArr, Integer num, AObjectS81S0201000_34 aObjectS81S0201000_34) {
        LJLJJL(new AObjectS33S0301000_34(this, i, bArr, num, 1), aObjectS81S0201000_34);
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
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJIIIIZZ(java.lang.String, java.lang.String, java.util.List, boolean):X.1Bv2");
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
        LJLJJL(new AObjectS16S0202000_34(this, i, i2, num, 0), aObjectS81S0201000_34);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJJJL(String str, byte[] bArr, boolean z, Function1<? super C2220221Bv2, Unit> function1) {
        LJLJJL(new AObjectS8S1210000_34(this, str, bArr, z, 1), function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0210  */
    @Override // X.InterfaceC2220701Bvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220221Bv2 LJJJZ(int r29, int r30, java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221081BwQ.LJJJZ(int, int, java.lang.String, java.lang.String):X.1Bv2");
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJIIZ(String str, List<C2221071BwP> list, boolean z, String str2, Function1<? super C2220221Bv2, Unit> function1) {
        LJLJJL(new AObjectS3S2210000_34(this, str, list, z, str2, 1), function1);
    }

    @Override // X.InterfaceC2220701Bvo
    public final void LJJIL(int i, int i2, String str, String str2, Function1 function1) {
        LJLJJL(new AObjectS0S2102000_34(this, str, i, i2, str2, 1), function1);
    }
}
