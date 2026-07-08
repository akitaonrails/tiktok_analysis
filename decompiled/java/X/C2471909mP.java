package X;

import Y.ACallableS58S1100000_3;
import Y.ARunnableS1S1400000_3;
import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.LruCache;
import android.webkit.MimeTypeMap;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09mP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2471909mP {
    public static final C2471909mP LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final C1663470tOD LIZJ;
    public static InterfaceC2401609b4 LIZLLL;
    public static InterfaceC2401109az LJ;
    public static final String[] LJFF;
    public static final String[] LJI;
    public static InterfaceC2472209mS LJII;
    public static final LruCache<String, String> LJIIIIZZ;
    public static final LruCache<String, String> LJIIIZ;
    public static final LruCache<String, Boolean> LJIIJ;
    public static final LruCache<String, Boolean> LJIIJJI;
    public static final Object LJIIL;
    public static final ConcurrentHashMap<String, C2472009mQ> LJIILIIL;
    public static final String LJIILJJIL;
    public static boolean LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static final byte[] LJIJ;
    public static final byte[] LJIJI;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C2471909mP.class, "application", "getApplication()Landroid/app/Application;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LIZ = new C2471909mP();
        LIZJ = new C1663470tOD(new C2472109mR());
        LJFF = new String[]{"png", "jpg", "jpeg", "bmp", "heif", "heic", "ico", "dng"};
        LJI = new String[]{"gif", "webp"};
        LJIIIIZZ = new LruCache<>(200);
        LJIIIZ = new LruCache<>(200);
        LJIIJ = new LruCache<>(200);
        LJIIJJI = new LruCache<>(50);
        LJIIL = new Object();
        LJIILIIL = new ConcurrentHashMap<>();
        LJIILJJIL = "MIME_TYPE_NULL_VALUE";
        LJIJ = new byte[]{82, 73, 70, 70};
        LJIJI = new byte[]{87, 69, 66, 80};
    }

    public static final boolean LJJIJ() {
        InterfaceC2401109az interfaceC2401109az = LJ;
        if (interfaceC2401109az != null) {
            return interfaceC2401109az.LIZ();
        }
        return true;
    }

    public static final void LJJIJL() {
        if (LIZ.LJII() == null) {
            throw new IllegalArgumentException("invalid application info to set AdapterAndroidRUtils.application");
        }
    }

    public final Application LJII() {
        return (Application) LIZJ.getValue(this, LIZIZ[0]);
    }

    public static final boolean LIZ(String str) {
        if (str != null) {
            for (String str2 : LJFF) {
                if (a0.LJJIIZI(str, str2, true)) {
                    return true;
                }
            }
            for (String str3 : LJI) {
                if (a0.LJJIIZI(str, str3, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final long LJIIIZ(String str) {
        LJJIJL();
        try {
            if (LJJIIZI(str)) {
                return C2400409as.LJII(LIZ.LJII(), UriProtector.parse(str));
            }
            return new C0VSJ(str).length();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static final String LJIIL(String str) {
        if (a0.LJJIIZI(str, "image", true)) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"image/"}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() > 1) {
                return (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
            }
            return "";
        }
        if (a0.LJJIIZI(str, "video", true)) {
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{"video/"}, 0, 6);
            if (listLJJLIIIJILLIZJL2.size() > 1) {
                return (String) ListProtector.get(listLJJLIIIJILLIZJL2, 1);
            }
            return "";
        }
        return "";
    }

    public static final Uri LJIILIIL(String str) {
        if (LJJIIZI(str)) {
            return UriProtector.parse(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file://");
        sbLIZ.append(str);
        return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Uri LJIILJJIL(String str) {
        if (LJJIIZI(str)) {
            return UriProtector.parse(str);
        }
        if (str.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(str);
            return UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ));
        }
        return Uri.fromFile(new C0VSJ(str));
    }

    public static final ExifInterface LJIILL(String str) {
        LJJIJL();
        try {
            if (LJJIIZI(str) && Build.VERSION.SDK_INT >= 24) {
                Application applicationLJII = LIZ.LJII();
                return new ExifInterface(C09NT.LIZLLL(applicationLJII.getContentResolver(), UriProtector.parse(str), "r").getFileDescriptor());
            }
            if (str == null) {
                return null;
            }
            return new ExifInterface(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("path:");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(Log.getStackTraceString(e));
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC2401609b4.LIZIZ();
            }
            InterfaceC2401609b4 interfaceC2401609b42 = LIZLLL;
            if (interfaceC2401609b42 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("path:");
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(Log.getStackTraceString(e));
                interfaceC2401609b42.LIZ(1, C2188811AlT.LIZIZ(sbLIZ2));
            }
            return null;
        }
    }

    public static final C2259261Dbo LJIILLIIL(String str) {
        String strLIZ;
        LJJIJL();
        try {
            if (LJJIIZI(str)) {
                strLIZ = C09N5.LIZ(LIZ.LJII(), UriProtector.parse(str));
            } else {
                strLIZ = str;
            }
            if (strLIZ == null) {
                return null;
            }
            return new C2259261Dbo(strLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("path:");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(Log.getStackTraceString(e));
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC2401609b4.LIZIZ();
            }
            InterfaceC2401609b4 interfaceC2401609b42 = LIZLLL;
            if (interfaceC2401609b42 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("path:");
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(Log.getStackTraceString(e));
                interfaceC2401609b42.LIZ(1, C2188811AlT.LIZIZ(sbLIZ2));
            }
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            InterfaceC2401609b4 interfaceC2401609b43 = LIZLLL;
            if (interfaceC2401609b43 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("path: ");
                sbLIZ3.append(str);
                sbLIZ3.append(", out of memory error");
                C2188811AlT.LIZIZ(sbLIZ3);
                interfaceC2401609b43.LIZIZ();
            }
            InterfaceC2401609b4 interfaceC2401609b44 = LIZLLL;
            if (interfaceC2401609b44 != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("path: ");
                sbLIZ4.append(str);
                sbLIZ4.append(", out of memory error");
                interfaceC2401609b44.LIZ(2, C2188811AlT.LIZIZ(sbLIZ4));
                return null;
            }
            return null;
        }
    }

    public static final C2259271Dbp LJIIZILJ(String str) {
        String strLIZ;
        Application applicationLJII = LIZ.LJII();
        InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
        LJJIJL();
        try {
            if (LJJIIZI(str)) {
                strLIZ = C09N5.LIZ(applicationLJII, UriProtector.parse(str));
            } else {
                strLIZ = str;
            }
            if (strLIZ != null) {
                return new C2259271Dbp(strLIZ);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("path:");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(Log.getStackTraceString(e));
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC2401609b4.LIZIZ();
            }
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("path:");
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(Log.getStackTraceString(e));
                interfaceC2401609b4.LIZ(1, C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("path: ");
                sbLIZ3.append(str);
                sbLIZ3.append(", out of memory error");
                C2188811AlT.LIZIZ(sbLIZ3);
                interfaceC2401609b4.LIZIZ();
            }
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("path: ");
                sbLIZ4.append(str);
                sbLIZ4.append(", out of memory error");
                interfaceC2401609b4.LIZ(2, C2188811AlT.LIZIZ(sbLIZ4));
                return null;
            }
            return null;
        }
    }

    public static final String LJIJ(MediaModel mediaModel) {
        if (mediaModel != null) {
            if (LJJIIZI(mediaModel.LJFF()) && mediaModel.relativePath != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C786410Ut5.W3().getPath());
                sbLIZ.append(File.separator);
                sbLIZ.append(mediaModel.relativePath);
                sbLIZ.append(mediaModel.fileName);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            String str = mediaModel.mediaPickerAbsolutePath;
            if (str != null) {
                return str;
            }
            return mediaModel.LJFF();
        }
        return "";
    }

    public static final String LJIJI(String str) {
        LJJIJL();
        if (str == null) {
            return "";
        }
        try {
            if (LJJIIZI(str)) {
                return LIZ.LJJIFFI(str);
            }
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(LJIJJLI(str, false));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final MediaMetadataRetriever LJJ(String str) {
        LJJIJL();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (LJJIIZI(str)) {
                mediaMetadataRetriever.setDataSource(LIZ.LJII(), UriProtector.parse(str));
                return mediaMetadataRetriever;
            }
            mediaMetadataRetriever.setDataSource(str);
            return mediaMetadataRetriever;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("path:");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(Log.getStackTraceString(e));
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC2401609b4.LIZIZ();
            }
            InterfaceC2401609b4 interfaceC2401609b42 = LIZLLL;
            if (interfaceC2401609b42 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("path:");
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(Log.getStackTraceString(e));
                interfaceC2401609b42.LIZ(3, C2188811AlT.LIZIZ(sbLIZ2));
            }
            return mediaMetadataRetriever;
        }
    }

    public static final boolean LJJIIJZLJL(MediaModel mediaModel) {
        if (mediaModel == null) {
            return false;
        }
        if (LIZ(LJIJJLI(mediaModel.LJFF(), false)) && LIZ(mediaModel.mimeType)) {
            return true;
        }
        return LJJIII(mediaModel.LJFF(), true, 4);
    }

    public static final boolean LJJIIZI(String str) {
        String scheme;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Uri uri = UriProtector.parse(str);
            if (uri != null) {
                scheme = uri.getScheme();
            } else {
                scheme = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("path:");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(Log.getStackTraceString(e));
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC2401609b4.LIZIZ();
            }
            InterfaceC2401609b4 interfaceC2401609b42 = LIZLLL;
            if (interfaceC2401609b42 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("path:");
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(Log.getStackTraceString(e));
                interfaceC2401609b42.LIZ(0, C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (Intrinsics.LJFF("content", scheme)) {
            return true;
        }
        return false;
    }

    public static void LJJIJIIJIL(boolean z) {
        if (LJIIZILJ != z) {
            LJIIZILJ = z;
            LJIIJ.evictAll();
        }
    }

    public static void LJJIJIL(boolean z) {
        LJIILL = z;
        LJIIIIZZ.evictAll();
        LJIIIZ.evictAll();
    }

    public final Pair<String, Long> LJI(String str) throws Throwable {
        Pair pair;
        if (LJII() == null) {
            return null;
        }
        try {
            String strLJ = new C2259271Dbp(str).LJ("UserComment");
            if (strLJ != null && strLJ.length() != 0) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJ, new String[]{";"}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() == 2) {
                    return new Pair<>(new String(Base64.decode((String) listLJJLIIIJILLIZJL.get(0), 0), Charsets.LIZJ), Long.valueOf(CastLongProtector.parseLong((String) listLJJLIIIJILLIZJL.get(1))));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Object c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Pair<String, Long> pair2 = (Pair) c098200Yq;
            if (pair2 != null) {
                return pair2;
            }
        }
        if (u.LJJIIJZLJL(str, "content://", false)) {
            try {
                Application applicationLJII = LJII();
                if (applicationLJII != null) {
                    InputStream inputStreamLJ = C09NT.LJ(applicationLJII.getContentResolver(), UriProtector.parse(str));
                    try {
                        byte[] bArr = new byte[256];
                        if (inputStreamLJ != null) {
                            inputStreamLJ.read(bArr);
                        }
                        String str2 = new String(bArr, Charsets.LIZJ);
                        C2107108Nh.LIZ(inputStreamLJ, null);
                        pair = new Pair(str2, LJIIJJI(UriProtector.parse(str)));
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
                                        C2107108Nh.LIZ(inputStreamLJ, th);
                                        throw th;
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
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                pair = new Pair(null, null);
            }
        } else if (!u.LJJIIJZLJL(str, "/data", false) && !u.LJJIIJZLJL(str, "/storage", false)) {
            pair = new Pair(null, null);
        } else {
            try {
                C0VSJ c0vsj = new C0VSJ(str);
                C0VSP c0vsp = new C0VSP(c0vsj);
                try {
                    byte[] bArr2 = new byte[256];
                    c0vsp.read(bArr2);
                    String str3 = new String(bArr2, Charsets.LIZJ);
                    C2107108Nh.LIZ(c0vsp, null);
                    pair = new Pair(str3, Long.valueOf(c0vsj.length()));
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th7) {
                            th = th7;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsp, th);
                                    throw th;
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        th = null;
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                pair = new Pair(null, null);
            }
        }
        Object first = pair.getFirst();
        Long l = (Long) pair.getSecond();
        if (first == null || l == null) {
            return null;
        }
        l.longValue();
        return new Pair<>(first, l);
    }

    public final Long LJIIJJI(Uri uri) throws Throwable {
        int columnIndex;
        if (LJII() == null) {
            return null;
        }
        Application applicationLJII = LJII();
        if (applicationLJII != null) {
            Cursor cursorLJJJ = C2204961BRm.LJJJ(applicationLJII.getContentResolver(), uri, new String[]{"_size"}, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKP+8apPdkhTNKA0V1tobsCMCkvB+WYk=", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst() && (columnIndex = cursorLJJJ.getColumnIndex("_size")) != -1) {
                        Long lValueOf = Long.valueOf(cursorLJJJ.getLong(columnIndex));
                        C2107108Nh.LIZ(cursorLJJJ, null);
                        return lValueOf;
                    }
                    C2107108Nh.LIZ(cursorLJJJ, null);
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
                            C2107108Nh.LIZ(cursorLJJJ, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            return null;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIFFI(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = X.C2471909mP.LJIILL
            java.lang.String r4 = ""
            if (r0 == 0) goto L29
            android.util.LruCache<java.lang.String, java.lang.String> r0 = X.C2471909mP.LJIIIZ
            java.lang.Object r3 = r0.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L11
            r3 = r4
        L11:
            boolean r0 = kotlin.text.a0.LJJJIL(r3)
            if (r0 != 0) goto L1f
            java.lang.String r0 = X.C2471909mP.LJIILJJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L2a
        L1f:
            android.util.LruCache<java.lang.String, java.lang.String> r0 = X.C2471909mP.LJIIIIZZ
            java.lang.Object r3 = r0.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L2a
        L29:
            r3 = r4
        L2a:
            boolean r0 = kotlin.text.a0.LJJJIL(r3)
            if (r0 == 0) goto L6f
            android.app.Application r2 = r5.LJII()     // Catch: java.lang.Exception -> L52
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.Exception -> L52
            java.lang.String[] r0 = X.C2400409as.LIZ     // Catch: java.lang.Exception -> L52
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = r0.getType(r1)     // Catch: java.lang.Exception -> L52
            if (r0 != 0) goto L50
            java.lang.String r3 = X.C2471909mP.LJIILJJIL     // Catch: java.lang.Exception -> L52
        L46:
            boolean r0 = X.C2471909mP.LJIILL     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L6f
            android.util.LruCache<java.lang.String, java.lang.String> r0 = X.C2471909mP.LJIIIIZZ     // Catch: java.lang.Exception -> L52
            r0.put(r6, r3)     // Catch: java.lang.Exception -> L52
            goto L6f
        L50:
            r3 = r0
            goto L46
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.09b4 r2 = X.C2471909mP.LIZLLL
            if (r2 == 0) goto L6f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "file path:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = -10
            r2.LIZ(r0, r1)
        L6f:
            java.lang.String r0 = X.C2471909mP.LJIILJJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L78
            return r4
        L78:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2471909mP.LJJIFFI(java.lang.String):java.lang.String");
    }

    public final C0VSJ LJJIJLIJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (!LJJIIZI(str)) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                return null;
            }
            return c0vsj;
        }
        String strLIZ = C09N5.LIZ(LJII(), UriProtector.parse(str));
        if (strLIZ != null) {
            C0VSJ c0vsj2 = new C0VSJ(strLIZ);
            if (c0vsj2.exists()) {
                return c0vsj2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0060 A[Catch: Exception -> 0x006e, TryCatch #2 {Exception -> 0x006e, blocks: (B:42:0x005b, B:44:0x0060, B:46:0x0065, B:48:0x006a), top: B:56:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0065 A[Catch: Exception -> 0x006e, TryCatch #2 {Exception -> 0x006e, blocks: (B:42:0x005b, B:44:0x0060, B:46:0x0065, B:48:0x006a), top: B:56:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a A[Catch: Exception -> 0x006e, TRY_LEAVE, TryCatch #2 {Exception -> 0x006e, blocks: (B:42:0x005b, B:44:0x0060, B:46:0x0065, B:48:0x006a), top: B:56:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.io.FileInputStream r9, java.io.FileOutputStream r10) throws java.lang.Throwable {
        /*
            r2 = 0
            r8 = 0
            java.nio.channels.FileChannel r3 = r9.getChannel()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            java.nio.channels.FileChannel r8 = r10.getChannel()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L30
            if (r3 == 0) goto L15
            r4 = 0
            long r6 = r3.size()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L30
            r3.transferTo(r4, r6, r8)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L30
        L15:
            r9.close()     // Catch: java.lang.Exception -> L27
            if (r3 == 0) goto L1d
            r3.close()     // Catch: java.lang.Exception -> L27
        L1d:
            r10.close()     // Catch: java.lang.Exception -> L27
            if (r8 == 0) goto L25
            r8.close()     // Catch: java.lang.Exception -> L27
        L25:
            r0 = 1
            return r0
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        L2c:
            r0 = move-exception
            r1 = r8
            r8 = r3
            goto L53
        L30:
            r0 = move-exception
            r1 = r8
            r8 = r3
            goto L39
        L34:
            r0 = move-exception
            r1 = r8
            goto L53
        L37:
            r0 = move-exception
            r1 = r8
        L39:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L52
            r9.close()     // Catch: java.lang.Exception -> L4d
            if (r8 == 0) goto L44
            r8.close()     // Catch: java.lang.Exception -> L4d
        L44:
            r10.close()     // Catch: java.lang.Exception -> L4d
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.lang.Exception -> L4d
            return r2
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L51:
            return r2
        L52:
            r0 = move-exception
        L53:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r0 = move-exception
            goto L53
        L59:
            if (r9 == 0) goto L5e
            r9.close()     // Catch: java.lang.Exception -> L6e
        L5e:
            if (r8 == 0) goto L63
            r8.close()     // Catch: java.lang.Exception -> L6e
        L63:
            if (r10 == 0) goto L68
            r10.close()     // Catch: java.lang.Exception -> L6e
        L68:
            if (r1 == 0) goto L73
            r1.close()     // Catch: java.lang.Exception -> L6e
            throw r0
        L6e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        L73:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2471909mP.LIZIZ(java.io.FileInputStream, java.io.FileOutputStream):boolean");
    }

    public static final boolean LIZJ(String str, String str2) throws Throwable {
        C0VSV c0vsv;
        C0VSV c0vsv2;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || !C2286708xd.LIZJ(str)) {
            return false;
        }
        FileInputStream fileInputStream = null;
        C0VSV c0vsv3 = null;
        C0VSV c0vsv4 = null;
        fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                FileInputStream fileInputStreamLJJI = LJJI(0, str);
                try {
                    C0VSV c0vsv5 = new C0VSV(str2);
                    if (fileInputStreamLJJI == null) {
                        try {
                            c0vsv5.close();
                            return false;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return false;
                        }
                    }
                    try {
                        LIZ.getClass();
                        boolean zLIZIZ = LIZIZ(fileInputStreamLJJI, c0vsv5);
                        try {
                            fileInputStreamLJJI.close();
                            c0vsv5.close();
                            return zLIZIZ;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return zLIZIZ;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        c0vsv3 = c0vsv5;
                        c0vsv2 = c0vsv3;
                        fileInputStream2 = fileInputStreamLJJI;
                        TryCatchGuardChecker.doCheck(e);
                        InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
                        if (interfaceC2401609b4 != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("path:");
                            sbLIZ.append(str);
                            sbLIZ.append(", ");
                            sbLIZ.append(Log.getStackTraceString(e));
                            C2188811AlT.LIZIZ(sbLIZ);
                            interfaceC2401609b4.LIZIZ();
                        }
                        InterfaceC2401609b4 interfaceC2401609b42 = LIZLLL;
                        if (interfaceC2401609b42 != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("path:");
                            sbLIZ2.append(str);
                            sbLIZ2.append(", ");
                            sbLIZ2.append(Log.getStackTraceString(e));
                            interfaceC2401609b42.LIZ(6, C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                return false;
                            }
                        }
                        if (c0vsv2 != null) {
                            c0vsv2.close();
                            return false;
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        c0vsv4 = c0vsv5;
                        c0vsv = c0vsv4;
                        fileInputStream = fileInputStreamLJJI;
                        TryCatchGuardChecker.doCheck(th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                throw th;
                            }
                        }
                        if (c0vsv != null) {
                            c0vsv.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    e = e6;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e7) {
            e = e7;
            c0vsv2 = null;
        } catch (Throwable th4) {
            th = th4;
            c0vsv = null;
        }
    }

    public static final Bitmap LIZLLL(String str, BitmapFactory.Options options) throws Throwable {
        Bitmap bitmap;
        ParcelFileDescriptor parcelFileDescriptorLIZLLL;
        boolean z;
        int i;
        LJJIJL();
        ParcelFileDescriptor parcelFileDescriptor = null;
        bitmapDecodeFileDescriptor = null;
        Bitmap bitmapDecodeFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        try {
            if (LJJIIZI(str)) {
                try {
                    parcelFileDescriptorLIZLLL = C09NT.LIZLLL(LIZ.LJII().getContentResolver(), Uri.parse(str), "r");
                } catch (Exception e) {
                    e = e;
                    bitmap = null;
                }
                try {
                    bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorLIZLLL.getFileDescriptor(), null, options);
                    parcelFileDescriptorLIZLLL.close();
                } catch (Exception e2) {
                    e = e2;
                    bitmap = bitmapDecodeFileDescriptor;
                    parcelFileDescriptor2 = parcelFileDescriptorLIZLLL;
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
                    if (interfaceC2401609b4 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("path:");
                        sbLIZ.append(str);
                        sbLIZ.append(", ");
                        sbLIZ.append(Log.getStackTraceString(e));
                        C2188811AlT.LIZIZ(sbLIZ);
                        interfaceC2401609b4.LIZIZ();
                    }
                    InterfaceC2401609b4 interfaceC2401609b42 = LIZLLL;
                    if (interfaceC2401609b42 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("path:");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(Log.getStackTraceString(e));
                        interfaceC2401609b42.LIZ(2, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (parcelFileDescriptor2 != null) {
                        parcelFileDescriptor2.close();
                    }
                    bitmapDecodeFileDescriptor = bitmap;
                } catch (Throwable th) {
                    th = th;
                    parcelFileDescriptor = parcelFileDescriptorLIZLLL;
                    TryCatchGuardChecker.doCheck(th);
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            } else {
                try {
                    bitmapDecodeFileDescriptor = BitmapFactory.decodeFile(str, options);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    InterfaceC2401609b4 interfaceC2401609b43 = LIZLLL;
                    if (interfaceC2401609b43 != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("path:");
                        sbLIZ3.append(str);
                        sbLIZ3.append(", ");
                        sbLIZ3.append(Log.getStackTraceString(e3));
                        C2188811AlT.LIZIZ(sbLIZ3);
                        interfaceC2401609b43.LIZIZ();
                    }
                    InterfaceC2401609b4 interfaceC2401609b44 = LIZLLL;
                    if (interfaceC2401609b44 != null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("path:");
                        sbLIZ4.append(str);
                        sbLIZ4.append(", ");
                        sbLIZ4.append(Log.getStackTraceString(e3));
                        interfaceC2401609b44.LIZ(2, C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
            }
            if (LJIILLIIL) {
                boolean z2 = true;
                if (options != null && options.inJustDecodeBounds) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (options != null) {
                        i = options.inSampleSize;
                    } else {
                        i = 0;
                    }
                    if (i <= 1) {
                        if (str != null && !a0.LJJJIL(str)) {
                            z2 = false;
                        }
                        if (!z2) {
                            C2471909mP c2471909mP = LIZ;
                            String str2 = options.outMimeType;
                            if (str2 == null) {
                                str2 = LJIILJJIL;
                            }
                            c2471909mP.getClass();
                            ConcurrentHashMap<String, C2472009mQ> concurrentHashMap = LJIILIIL;
                            if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 50) {
                                concurrentHashMap.clear();
                            }
                            concurrentHashMap.put(str, new C2472009mQ(options.outWidth, options.outHeight, str2));
                        }
                    }
                }
            }
            return bitmapDecodeFileDescriptor;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final void LJ(String str, BitmapFactory.Options options) throws Throwable {
        C2472009mQ c2472009mQ;
        String str2;
        if (LJIILLIIL) {
            LIZ.getClass();
            if (str != null && !a0.LJJJIL(str) && options.inJustDecodeBounds && (c2472009mQ = LJIILIIL.get(str)) != null) {
                options.inJustDecodeBounds = true;
                options.outWidth = c2472009mQ.LIZ;
                options.outHeight = c2472009mQ.LIZIZ;
                if (Intrinsics.LJFF(c2472009mQ.LIZJ, LJIILJJIL)) {
                    str2 = null;
                } else {
                    str2 = c2472009mQ.LIZJ;
                }
                options.outMimeType = str2;
                return;
            }
        }
        LIZLLL(str, options);
    }

    public static final Bitmap LJFF(int i, String str) throws Throwable {
        Pair pair;
        int i2;
        if (str == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        LJ(str, options);
        Pair pair2 = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        int iIntValue = ((Number) pair2.getFirst()).intValue();
        int iIntValue2 = ((Number) pair2.getSecond()).intValue();
        if (iIntValue <= 0 || iIntValue2 <= 0) {
            return null;
        }
        if (iIntValue >= iIntValue2) {
            Integer numValueOf = Integer.valueOf(i);
            int iLIZ = C814420VxA.LIZ((((double) iIntValue2) * ((double) i)) / ((double) iIntValue));
            if (iLIZ < 1) {
                iLIZ = 1;
            }
            pair = new Pair(numValueOf, Integer.valueOf(iLIZ));
        } else {
            int iLIZ2 = C814420VxA.LIZ((((double) iIntValue) * ((double) i)) / ((double) iIntValue2));
            if (iLIZ2 < 1) {
                iLIZ2 = 1;
            }
            pair = new Pair(Integer.valueOf(iLIZ2), Integer.valueOf(i));
        }
        int iIntValue3 = ((Number) pair.getFirst()).intValue();
        int iIntValue4 = ((Number) pair.getSecond()).intValue();
        LIZ.getClass();
        Pair pair3 = new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue5 = ((Number) pair3.getFirst()).intValue();
        int iIntValue6 = ((Number) pair3.getSecond()).intValue();
        if (iIntValue5 <= iIntValue4 && iIntValue6 <= iIntValue3) {
            i2 = 1;
        } else {
            int i3 = iIntValue5 / 2;
            int i4 = iIntValue6 / 2;
            i2 = 1;
            while (i3 / i2 >= iIntValue4 && i4 / i2 >= iIntValue3) {
                i2 *= 2;
            }
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = i2;
        options2.inPreferredConfig = Bitmap.Config.RGB_565;
        options2.inJustDecodeBounds = false;
        Bitmap bitmapLIZLLL = LIZLLL(str, options2);
        if (bitmapLIZLLL != null) {
            if (bitmapLIZLLL.getWidth() != iIntValue3 || bitmapLIZLLL.getHeight() != iIntValue4) {
                return Bitmap.createScaledBitmap(bitmapLIZLLL, iIntValue3, iIntValue4, true);
            }
            return bitmapLIZLLL;
        }
        return bitmapLIZLLL;
    }

    public static String LJIIIIZZ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(context).getAbsolutePath());
        sbLIZ.append("/tools/temMedia/");
        sbLIZ.append(str.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJIIJ(Context context, String str) {
        if (str != null && LJJIIZI(str)) {
            LIZ.getClass();
            String strLJIIIIZZ = LJIIIIZZ(context, str);
            if (LIZJ(str, strLJIIIIZZ)) {
                return strLJIIIIZZ;
            }
            InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("copy file failed path:");
                sbLIZ.append(strLJIIIIZZ);
                interfaceC2401609b4.LIZ(-1, C2188811AlT.LIZIZ(sbLIZ));
                return str;
            }
        }
        return str;
    }

    public static final String LJIJJ(String str, BitmapFactory.Options options) {
        boolean z;
        String str2;
        boolean z2 = false;
        String str3 = "";
        if (LJIILL) {
            if (str != null && !a0.LJJJIL(str)) {
                z = false;
            } else {
                z = true;
            }
            if (!z && (str2 = LJIIIZ.get(str)) != null) {
                str3 = str2;
            }
        }
        String str4 = LJIILJJIL;
        String str5 = null;
        if (Intrinsics.LJFF(str3, str4)) {
            return null;
        }
        if (!a0.LJJJIL(str3)) {
            return str3;
        }
        if (options == null) {
            try {
                options = new BitmapFactory.Options();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return str5;
            }
        }
        options.inJustDecodeBounds = true;
        LJ(str, options);
        if (LJIILL) {
            if (str == null || a0.LJJJIL(str)) {
                z2 = true;
            }
            if (!z2) {
                LruCache<String, String> lruCache = LJIIIZ;
                String str6 = options.outMimeType;
                if (str6 != null) {
                    str4 = str6;
                }
                lruCache.put(str, str4);
            }
        }
        str5 = options.outMimeType;
        return str5;
    }

    public static final String LJIJJLI(String str, boolean z) {
        String strSubstring;
        String strLJ;
        LJJIJL();
        String strLJIIL = null;
        if (LJJIIZI(str)) {
            String strLJJIFFI = LIZ.LJJIFFI(str);
            if (z) {
                if (a0.LJJIIZI(strLJJIFFI, "image", false)) {
                    strLJJIFFI = LJIJJ(str, null);
                    if (strLJJIFFI == null) {
                        strLJJIFFI = "";
                    }
                } else if (a0.LJJIIZI(strLJJIFFI, "video", false)) {
                    MediaMetadataRetriever mediaMetadataRetrieverLJJ = LJJ(str);
                    strLJJIFFI = C20144413ru.LJ(mediaMetadataRetrieverLJJ);
                    try {
                        mediaMetadataRetrieverLJJ.release();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (strLJJIFFI == null) {
                        strLJJIFFI = "";
                    }
                    if (LJIILL && (!a0.LJJJIL(strLJJIFFI))) {
                        LJIIIZ.put(str, strLJJIFFI);
                    }
                }
            }
            if (!TextUtils.isEmpty(strLJJIFFI)) {
                return LJIIL(strLJJIFFI);
            }
            InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
            if (interfaceC2401609b4 == null) {
                return "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file path:");
            sbLIZ.append(str);
            interfaceC2401609b4.LIZ(-10, C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
        if (str == null) {
            strSubstring = "";
        } else {
            try {
                strSubstring = str.substring(a0.LJJJJI(str, e3.d, 0, 6) + 1, str.length());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                InterfaceC2401609b4 interfaceC2401609b42 = LIZLLL;
                if (interfaceC2401609b42 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("path:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(Log.getStackTraceString(e2));
                    C2188811AlT.LIZIZ(sbLIZ2);
                    interfaceC2401609b42.LIZIZ();
                }
                InterfaceC2401609b4 interfaceC2401609b43 = LIZLLL;
                if (interfaceC2401609b43 != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("path:");
                    sbLIZ3.append(str);
                    sbLIZ3.append(", ");
                    sbLIZ3.append(Log.getStackTraceString(e2));
                    interfaceC2401609b43.LIZ(5, C2188811AlT.LIZIZ(sbLIZ3));
                }
                return "";
            }
        }
        if (z) {
            if (LIZ(strSubstring)) {
                strLJ = LJIJJ(str, null);
            } else {
                try {
                    strLJ = C20144413ru.LJ(LJJ(str));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    strLJ = null;
                }
            }
            if (strLJ != null) {
                strLJIIL = LJIIL(strLJ);
            }
            if (!TextUtils.isEmpty(strLJIIL)) {
                return strLJIIL;
            }
        }
        return strSubstring;
    }

    public static final FileInputStream LJJI(int i, String str) {
        LJJIJL();
        try {
            if (LJJIIZI(str)) {
                Application applicationLJII = LIZ.LJII();
                return new C0VSP(C09NT.LIZLLL(applicationLJII.getContentResolver(), UriProtector.parse(str), "r").getFileDescriptor());
            }
            return new C0VSP(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if ((e instanceof NullPointerException) && i <= 3) {
                return LJJI(i + 1, str);
            }
            InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
            if (interfaceC2401609b4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("path:");
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sbLIZ.append(Log.getStackTraceString(e));
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC2401609b4.LIZIZ();
            }
            InterfaceC2401609b4 interfaceC2401609b42 = LIZLLL;
            if (interfaceC2401609b42 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("path:");
                sbLIZ2.append(str);
                sbLIZ2.append(", ");
                sbLIZ2.append(Log.getStackTraceString(e));
                interfaceC2401609b42.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
            return null;
        }
    }

    public static boolean LJJIIJ(String str, boolean z) {
        String str2;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            sbLIZ.append(str2);
            sbLIZ.append('|');
            sbLIZ.append(true);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Object obj = LJIIL;
            synchronized (obj) {
                try {
                    LruCache<String, Boolean> lruCache = LJIIJJI;
                    Boolean bool = lruCache.get(strLIZIZ);
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    boolean zLJJII = LJJII(str, true, null);
                    synchronized (obj) {
                        try {
                            Boolean bool2 = lruCache.get(strLIZIZ);
                            if (bool2 != null) {
                                return bool2.booleanValue();
                            }
                            lruCache.put(strLIZIZ, Boolean.valueOf(zLJJII));
                            return zLJJII;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        return LJJII(str, true, null);
    }

    public static final boolean LJJII(String str, boolean z, BitmapFactory.Options options) {
        if (z) {
            return LIZ(LJIJJ(str, options));
        }
        return LIZ(LJIJJLI(str, false));
    }

    public static /* synthetic */ boolean LJJIII(String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return LJJII(str, z, null);
    }

    public static final boolean LJJIIZ(InterfaceC2286808xe interfaceC2286808xe, String str, boolean z) {
        Boolean bool;
        if (LJIIZILJ && (bool = LJIIJ.get(str)) != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (interfaceC2286808xe == null) {
                return zBooleanValue;
            }
            interfaceC2286808xe.LIZ(Boolean.valueOf(zBooleanValue));
            return false;
        }
        if (LJJIIZI(str)) {
            LJJIJL();
            if (interfaceC2286808xe == null) {
                try {
                    boolean zLJIIIZ = C2400409as.LJIIIZ(LIZ.LJII(), UriProtector.parse(str));
                    LJIIJ.put(str, Boolean.valueOf(zLJIIIZ));
                    return zLJIIIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC2401609b4 interfaceC2401609b4 = LIZLLL;
                    if (interfaceC2401609b4 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("path:");
                        sbLIZ.append(str);
                        sbLIZ.append(", ");
                        sbLIZ.append(Log.getStackTraceString(e));
                        C2188811AlT.LIZIZ(sbLIZ);
                        interfaceC2401609b4.LIZIZ();
                    }
                    InterfaceC2401609b4 interfaceC2401609b42 = LIZLLL;
                    if (interfaceC2401609b42 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("path:");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(Log.getStackTraceString(e));
                        interfaceC2401609b42.LIZ(9, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    return false;
                }
            }
            C013C c013c = new C013C();
            Uri uri = UriProtector.parse(str);
            C2472609mW c2472609mW = new C2472609mW();
            C15O7.LIZJ(new ACallableS58S1100000_3(uri, str, 5)).LJ(new C2501409rA(c013c, interfaceC2286808xe, 4), C15O7.LJIIIIZZ, c2472609mW.LIZ());
            if (!z) {
                C786410Ut5.LJLIIL(100L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS1S1400000_3(c013c, c2472609mW, str, uri, interfaceC2286808xe, 1));
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
    
        if (r7 != null) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LJJIJIIJI(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12, java.lang.String r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2471909mP.LJJIJIIJI(android.content.Context, java.lang.String, java.lang.String, boolean, java.lang.String, int):android.net.Uri");
    }
}
