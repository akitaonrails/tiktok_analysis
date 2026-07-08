package com.bytedance.android.alog;

import X.C0VSJ;
import X.C2096908Jj;
import X.C2188811AlT;
import X.C797950VRx;
import X.C827540WdE;
import X.C827570WdH;
import X.EnumC827420Wd2;
import X.EnumC827430Wd3;
import X.EnumC827440Wd4;
import X.EnumC827450Wd5;
import X.EnumC827460Wd6;
import X.EnumC827470Wd7;
import X.InterfaceC827550WdF;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public class Alog {
    public static final int LJIIIIZZ = EnumC827470Wd7.SAFE.value;
    public static final int LJIIIZ = EnumC827460Wd6.RAW.value;
    public static final int LJIIJ = EnumC827440Wd4.DEFAULT.value;
    public static final int LJIIJJI = EnumC827430Wd3.ZSTD.value;
    public static final int LJIIL = EnumC827450Wd5.TEA_16.value;
    public static final int LJIILIIL = EnumC827420Wd2.EC_SECP256K1.value;
    public static volatile List<InterfaceC827550WdF> LJIILJJIL = null;
    public static final ArrayList<String> LJIILL = new ArrayList<>();
    public static boolean LJIILLIIL = false;
    public static int LJIIZILJ = 0;
    public int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public String LJFF;
    public final String LJI;
    public long LJII;

    public static native void nativeAsyncFlush(long j);

    public static native long nativeCreate(int i, boolean z, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, String str4, int i7, int i8, int i9, int i10, int i11, int i12, String str5, long j, boolean z2, int i13);

    public static native void nativeDestroy(long j);

    public static native long nativeGetLegacyFlushFuncAddr();

    public static native long nativeGetLegacyGetLogFileDirFuncAddr();

    public static native long nativeGetLegacyWriteFuncAddr();

    public static native long nativeGetNativeInitFuncAddr();

    public static native long nativeGetNativeWriteAsyncFuncAddr();

    public static native long nativeGetNativeWriteFuncAddr();

    public static native void nativeSetDefaultInstance(long j);

    public static native void nativeSetLevel(long j, int i);

    public static native void nativeSetSyslog(long j, boolean z);

    public static native void nativeSyncFlush(long j);

    public static native void nativeTimedSyncFlush(long j, int i);

    public static native void nativeWrite(long j, int i, String str, String str2);

    public static native void nativeWriteAsyncMsg(long j, int i, String str, String str2, long j2, long j3);

    public final void LIZIZ() {
        synchronized (this) {
            try {
                long j = this.LJII;
                if (j != 0) {
                    this.LIZ = 6;
                    nativeDestroy(j);
                    this.LJII = 0L;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ() {
        long j = this.LJII;
        if (j != 0) {
            nativeAsyncFlush(j);
        }
    }

    public final long LIZJ() {
        if (this.LJII != 0) {
            return nativeGetLegacyFlushFuncAddr();
        }
        return 0L;
    }

    public final long LIZLLL() {
        if (this.LJII != 0) {
            return nativeGetLegacyGetLogFileDirFuncAddr();
        }
        return 0L;
    }

    public final long LJ() {
        if (this.LJII != 0) {
            return nativeGetLegacyWriteFuncAddr();
        }
        return 0L;
    }

    public final long LJI() {
        if (this.LJII != 0) {
            return nativeGetNativeInitFuncAddr();
        }
        return 0L;
    }

    public final long LJII() {
        if (this.LJII != 0) {
            return nativeGetNativeWriteAsyncFuncAddr();
        }
        return 0L;
    }

    public final long LJIIIIZZ() {
        if (this.LJII != 0) {
            return nativeGetNativeWriteFuncAddr();
        }
        return 0L;
    }

    public final String LJIIIZ() {
        if (!LJIILLIIL) {
            return "not inited";
        }
        if (this.LJFF == null) {
            this.LJFF = C2096908Jj.LIZ();
        }
        String str = this.LJFF;
        if (str == null) {
            return "get process name failed";
        }
        String strReplace = str.replace(':', '-');
        C0VSJ c0vsj = new C0VSJ(this.LIZJ);
        if (!c0vsj.exists()) {
            return "cache dir not exists";
        }
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles == null) {
            return "cache dir is empty";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strReplace);
        sbLIZ.append("__");
        sbLIZ.append(this.LJI);
        sbLIZ.append(".alog.cache.guard");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("^");
        sbLIZ2.append(Pattern.quote(strReplace));
        sbLIZ2.append("__");
        sbLIZ2.append(Pattern.quote(this.LJI));
        sbLIZ2.append("__\\d{5}\\.alog\\.cache$");
        Pattern patternCompile = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ2));
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (File file : fileArrListFiles) {
            if (file.getName().equals(strLIZIZ)) {
                i++;
                if (file.length() >= 24576) {
                    i2++;
                }
            } else {
                String name = file.getName();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strReplace);
                sbLIZ3.append("__");
                sbLIZ3.append(this.LJI);
                sbLIZ3.append("__");
                if (name.startsWith(C2188811AlT.LIZIZ(sbLIZ3)) && patternCompile.matcher(file.getName()).find()) {
                    i3++;
                    if (file.length() >= this.LIZLLL) {
                        i4++;
                    }
                }
            }
        }
        if (i < 1) {
            return "cache guard not exists";
        }
        if (i2 < 1) {
            return "cache guard size insufficiently";
        }
        int i5 = this.LJ;
        if (i3 < i5) {
            return "cache block count insufficiently";
        }
        if (i4 < i5) {
            return "cache block size insufficiently";
        }
        C0VSJ c0vsj2 = new C0VSJ(this.LIZIZ);
        if (!c0vsj2.exists()) {
            return "log dir not exists";
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("^\\d{4}_\\d{2}_\\d{2}_\\d+__");
        sbLIZ4.append(Pattern.quote(strReplace));
        sbLIZ4.append("__");
        sbLIZ4.append(Pattern.quote(this.LJI));
        sbLIZ4.append("\\.alog\\.hot$");
        final Pattern patternCompile2 = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ4));
        File[] fileArrListFiles2 = c0vsj2.listFiles(new FilenameFilter() { // from class: X.0Wd9
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return patternCompile2.matcher(str2).find();
            }
        });
        return (fileArrListFiles2 == null || fileArrListFiles2.length == 0) ? "no log file for current process and instance" : "OK";
    }

    public final void LJIILIIL() {
        long j = this.LJII;
        if (j != 0) {
            nativeSyncFlush(j);
        }
    }

    public final void finalize() {
        try {
            super.finalize();
            LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZIZ();
            throw th;
        }
    }

    public static synchronized void LJIIJ(C827570WdH c827570WdH) {
        if (LJIILLIIL) {
            return;
        }
        try {
            Librarian.LJI(ALog.sConfig.LIZ, "alog");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LoadSoLancet.LIZJ("alog");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("alog");
            LoadSoLancet.LJ(jUptimeMillis, "alog");
            LoadSoLancet.LIZLLL(jUptimeMillis, "alog");
            LoadSoLancet.LIZIZ("alog");
        }
        LJIILLIIL = true;
    }

    public final void LJIIJJI(int i) {
        this.LIZ = i;
        long j = this.LJII;
        if (j != 0) {
            nativeSetLevel(j, i);
        }
    }

    public final void LJIIL(boolean z) {
        long j = this.LJII;
        if (j != 0) {
            nativeSetSyslog(j, z);
        }
    }

    public final void LJIILJJIL(int i) {
        long j = this.LJII;
        if (j != 0) {
            nativeTimedSyncFlush(j, i);
        }
    }

    public final File[] LJFF(long j, long j2) throws Throwable {
        if (this.LJFF == null) {
            String strLIZ = C2096908Jj.LIZ();
            this.LJFF = strLIZ;
            if (strLIZ == null) {
                return new File[0];
            }
        }
        return C797950VRx.LIZ(j, j2, this.LIZIZ, this.LJFF, this.LJI);
    }

    public final void LJIILL(int i, String str, String str2) {
        if (this.LJII != 0 && i >= this.LIZ && str != null && str2 != null) {
            if (LJIILJJIL != null) {
                C827540WdE c827540WdE = new C827540WdE(i, str, str2);
                Iterator it2 = ((CopyOnWriteArrayList) LJIILJJIL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC827550WdF) it2.next()).LIZ(c827540WdE);
                }
                nativeWrite(this.LJII, c827540WdE.LIZ, c827540WdE.LIZIZ, c827540WdE.LIZJ);
                return;
            }
            nativeWrite(this.LJII, i, str, str2);
        }
    }

    public final void LJIILLIIL(int i, long j, long j2, String str, String str2) {
        if (this.LJII != 0 && i >= this.LIZ && str != null && str2 != null) {
            if (LJIILJJIL != null) {
                C827540WdE c827540WdE = new C827540WdE(i, str, str2);
                Iterator it2 = ((CopyOnWriteArrayList) LJIILJJIL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC827550WdF) it2.next()).LIZ(c827540WdE);
                }
                nativeWriteAsyncMsg(this.LJII, c827540WdE.LIZ, c827540WdE.LIZIZ, c827540WdE.LIZJ, j, j2);
                return;
            }
            nativeWriteAsyncMsg(this.LJII, i, str, str2, j, j2);
        }
    }

    public Alog(Context context, int i, boolean z, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, String str4, int i7, int i8, int i9, int i10, int i11, int i12, String str5, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i5;
        this.LJ = i6 / i5;
        this.LJI = str;
        this.LJII = nativeCreate(i, z, str, str2, i2, i3, i4, str3, i5, i6, str4, i7, i8, i9, i10, i11, i12, str5, TimeZone.getDefault().getRawOffset() / LSPassThroughRecordSizeConfig.DEFAULT, z2, LJIIZILJ);
    }
}
