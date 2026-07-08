package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontFamily;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS17S0001000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13rV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20141913rV implements InterfaceC1697590uHF {
    public static volatile Context LIZJ;
    public static final ConcurrentHashMap<String, Boolean> LJFF;
    public static final boolean LJI;
    public static volatile int LJII;
    public static volatile float LJIIIIZZ;
    public static volatile float LJIIIZ;
    public static final ConcurrentHashMap<String, C20142413ra> LJIIJ;
    public static final ConcurrentHashMap<C1267404xc, C20142513rb> LJIIJJI;
    public static final CopyOnWriteArraySet<String> LJIIL;
    public static volatile String LJIILIIL;
    public static final C01GW LJIILJJIL;
    public static final C20141913rV LIZ = new C20141913rV();
    public static final String[] LIZIZ = {"/system/etc/font_fallback.xml", "/product/etc/font_fallback.xml", "/system/etc/fonts.xml", "/product/etc/fonts_customization.xml"};
    public static final ConcurrentHashMap<String, String> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, Integer> LJ = new ConcurrentHashMap<>();

    public static int LJIILLIIL(int i) {
        if (i < 400) {
            return 400;
        }
        if (i < 550) {
            return 500;
        }
        if (i < 650) {
            return 600;
        }
        if (i < 750) {
            return OppoPermissionPopupMaskDelayExp.DEFAULT;
        }
        return 900;
    }

    @Override // X.InterfaceC1697590uHF
    public final void clear() {
        LIZJ = null;
        LJIIJ.clear();
        LJIIJJI.clear();
    }

    static {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = new ConcurrentHashMap<>();
        Boolean bool = Boolean.FALSE;
        concurrentHashMap.put("font/TikTokSans-VF.otf", bool);
        concurrentHashMap.put("font/TikTok-Display-Regular.otf", bool);
        concurrentHashMap.put("font/TikTok-Display-Bold.otf", bool);
        concurrentHashMap.put("font/TikTok-Display-Medium.otf", bool);
        concurrentHashMap.put("font/TikTok-Text-Regular.otf", bool);
        concurrentHashMap.put("font/TikTok-Text-Bold.otf", bool);
        concurrentHashMap.put("font/TikTok-Text-Medium.otf", bool);
        LJFF = concurrentHashMap;
        LJI = true;
        LJIIIIZZ = 17.0f;
        LJIIIZ = 28.0f;
        LJIIJ = new ConcurrentHashMap<>();
        LJIIJJI = new ConcurrentHashMap<>();
        LJIIL = new CopyOnWriteArraySet<>();
        LJIILJJIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1783));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d A[Catch: all -> 0x00a7, TryCatch #1 {all -> 0x00a7, blocks: (B:10:0x001f, B:15:0x0030, B:17:0x0036, B:24:0x004d, B:26:0x0055, B:29:0x0067, B:33:0x0070, B:36:0x0077, B:42:0x008d, B:39:0x0080, B:41:0x0088), top: B:68:0x001f, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIILJJIL() {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20141913rV.LJIILJJIL():java.lang.String");
    }

    @Override // X.InterfaceC1697590uHF
    public final void LJFF() {
        LJIIIIZZ = 12.0f;
        LJIIIZ = 36.0f;
    }

    @Override // X.InterfaceC1697590uHF
    public final boolean isInitialized() {
        return LIZJ != null;
    }

    @Override // X.InterfaceC1697590uHF
    public final int LJ() {
        return LJII;
    }

    public static Typeface LJI(FontFamily fontFamily) {
        Object c098200Yq;
        Object c098200Yq2;
        String str = LJIILIIL;
        Object obj = null;
        if (str != null) {
            try {
                c098200Yq = new Typeface.CustomFallbackBuilder(fontFamily).setSystemFallback(str).build();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (Typeface) obj;
        }
        for (String str2 : (String[]) LJIILJJIL.getValue()) {
            try {
                c098200Yq2 = new Typeface.CustomFallbackBuilder(fontFamily).setSystemFallback(str2).build();
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            Typeface typeface = (Typeface) c098200Yq2;
            if (typeface != null) {
                if (LJIILIIL == null) {
                    LJIILIIL = str2;
                    Intrinsics.LJFF(str2, "sans-serif");
                }
                return typeface;
            }
        }
        return null;
    }

    public static ByteBuffer LJIIJJI(String str) {
        Object c098200Yq;
        Object obj = null;
        try {
            Context context = LIZJ;
            if (context == null) {
                c098200Yq = null;
            } else if (u.LJJIIJZLJL(str, "font/", false)) {
                c098200Yq = LJIIIZ(context, str);
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        c098200Yq = channel.map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                        C2107108Nh.LIZ(channel, null);
                        C2107108Nh.LIZ(randomAccessFile, null);
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
                                        C2107108Nh.LIZ(channel, th);
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th = null;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                    } catch (Throwable th6) {
                        th = th6;
                        th = null;
                    }
                    try {
                        throw th;
                    } catch (Throwable th7) {
                        th = th7;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(randomAccessFile, th);
                                throw th;
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th9) {
            TryCatchGuardChecker.doCheck(th9);
            c098200Yq = new C098200Yq(th9);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (ByteBuffer) obj;
    }

    public static String LJIIL(Object obj) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object[] objArr;
        Iterable iterableLJIIJ;
        Method method;
        String str;
        if (obj != null) {
            Object objInvoke = obj.getClass().getMethod("getAliases", new Class[0]).invoke(obj, new Object[0]);
            if (!(objInvoke instanceof List) || (iterableLJIIJ = (Iterable) objInvoke) == null) {
                return null;
            }
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                Method declaredMethod = Class.forName("android.graphics.fonts.SystemFonts").getDeclaredMethod("getAliases", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke2 = declaredMethod.invoke(null, new Object[0]);
                if ((objInvoke2 instanceof Object[]) && (objArr = (Object[]) objInvoke2) != null && (iterableLJIIJ = C13LQ.LJIIJ(objArr)) != null) {
                }
            }
            return null;
        }
        Class<?> cls = Class.forName("android.text.FontConfig$Alias");
        Method method2 = cls.getMethod("getName", new Class[0]);
        if (Build.VERSION.SDK_INT >= 31) {
            method = cls.getMethod("getOriginal", new Class[0]);
        } else {
            method = cls.getMethod("getToName", new Class[0]);
        }
        for (Object obj2 : iterableLJIIJ) {
            if (obj2 != null) {
                Object objInvoke3 = method2.invoke(obj2, new Object[0]);
                if ((objInvoke3 instanceof String) && objInvoke3 != null && Intrinsics.LJFF(objInvoke3, "sans-serif")) {
                    Object objInvoke4 = method.invoke(obj2, new Object[0]);
                    if ((objInvoke4 instanceof String) && (str = (String) objInvoke4) != null && (!a0.LJJJIL(str)) && !Intrinsics.LJFF(str, "sans-serif")) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public static String LJIILIIL(Object obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        List list;
        String str;
        if (Build.VERSION.SDK_INT >= 34 && obj != null) {
            Object objInvoke = obj.getClass().getMethod("getNamedFamilyLists", new Class[0]).invoke(obj, new Object[0]);
            if (!(objInvoke instanceof List) || (list = (List) objInvoke) == null || list.isEmpty()) {
                return null;
            }
            Method method = Class.forName("android.text.FontConfig$NamedFamilyList").getMethod("getName", new Class[0]);
            for (Object obj2 : list) {
                if (obj2 != null) {
                    Object objInvoke2 = method.invoke(obj2, new Object[0]);
                    if ((objInvoke2 instanceof String) && (str = (String) objInvoke2) != null && Intrinsics.LJFF(str, "sans-serif")) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public static boolean LJIILL(String str) {
        Context context;
        Resources resources;
        AssetManager assets;
        String[] list;
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LJFF;
        Boolean bool = concurrentHashMap.get(str);
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        if (str.length() < 5) {
            return false;
        }
        if (LJI) {
            CopyOnWriteArraySet<String> copyOnWriteArraySet = LJIIL;
            if (copyOnWriteArraySet.isEmpty() && (context = LIZJ) != null && (resources = context.getResources()) != null && (assets = resources.getAssets()) != null && (list = assets.list("font")) != null) {
                C19719612Di.LJJII(copyOnWriteArraySet, list);
            }
            if (!copyOnWriteArraySet.contains(str.substring(5))) {
                return false;
            }
            concurrentHashMap.put(str, Boolean.TRUE);
        }
        return true;
    }

    @Override // X.InterfaceC1697590uHF
    public final Typeface LIZ(String str) {
        if (TextUtils.isEmpty(str) || LIZJ == null || !LJIILL(str)) {
            return null;
        }
        String str2 = LIZLLL.get(str);
        if (str2 != null) {
            str = str2;
        }
        C20142013rW c20142013rWLJIIJ = LJIIJ(str, false);
        if (c20142013rWLJIIJ == null) {
            return null;
        }
        return c20142013rWLJIIJ.LIZIZ;
    }

    @Override // X.InterfaceC1697590uHF
    public final void LIZIZ(List<String> list) {
        for (String str : list) {
            LIZ.getClass();
            String str2 = LIZLLL.get(str);
            if (str2 != null) {
                str = str2;
            }
            LJIIJ(str, false);
        }
    }

    @Override // X.InterfaceC1697590uHF
    public final void LIZJ(int i) {
        if (LJII == i) {
            return;
        }
        LJII = i;
        C19719612Di.LJJIII(LJIIJJI.keySet(), new AwS17S0001000_2(i, 16), true);
    }

    @Override // X.InterfaceC1697590uHF
    public final void init(Context context) {
        LIZJ = C786410Ut5.N3(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:30:0x008d, B:32:0x0095, B:37:0x00ab, B:36:0x00a6, B:33:0x009e), top: B:53:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:30:0x008d, B:32:0x0095, B:37:0x00ab, B:36:0x00a6, B:33:0x009e), top: B:53:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:30:0x008d, B:32:0x0095, B:37:0x00ab, B:36:0x00a6, B:33:0x009e), top: B:53:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20142013rW LJIIIIZZ(java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20141913rV.LJIIIIZZ(java.lang.String, boolean):X.13rW");
    }

    public static ByteBuffer LJIIIZ(Context context, String str) throws Throwable {
        ByteBuffer byteBufferAllocateDirect;
        Throwable th = null;
        try {
            AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(str);
            try {
                C0VSP c0vsp = new C0VSP(assetFileDescriptorOpenFd.getFileDescriptor());
                try {
                    FileChannel channel = c0vsp.getChannel();
                    try {
                        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
                        C2107108Nh.LIZ(channel, null);
                        C2107108Nh.LIZ(c0vsp, null);
                        C2107108Nh.LIZ(assetFileDescriptorOpenFd, null);
                        return map;
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
                                        C2107108Nh.LIZ(channel, th);
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
            } catch (Throwable th10) {
                th = th10;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th11) {
                        th = th11;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(assetFileDescriptorOpenFd, th);
                                throw th;
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        }
                    }
                } catch (Throwable th13) {
                    th = th13;
                    th = null;
                }
            }
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                int iAvailable = inputStreamOpen.available();
                if (iAvailable > 0) {
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(iAvailable);
                    ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpen);
                    while (byteBufferAllocateDirect.hasRemaining() && readableByteChannelNewChannel.read(byteBufferAllocateDirect) >= 0) {
                        try {
                        } catch (Throwable th14) {
                            th = th14;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    throw th;
                                } catch (Throwable th15) {
                                    th = th15;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            C2107108Nh.LIZ(readableByteChannelNewChannel, th);
                                            throw th;
                                        } catch (Throwable th16) {
                                            th = th16;
                                        }
                                    }
                                }
                            } catch (Throwable th17) {
                                th = th17;
                                th = null;
                            }
                        }
                    }
                    C2107108Nh.LIZ(readableByteChannelNewChannel, null);
                    byteBufferAllocateDirect.rewind();
                } else {
                    byte[] bArrLIZIZ = C2106208My.LIZIZ(inputStreamOpen);
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArrLIZIZ.length);
                    byteBufferAllocateDirect.put(bArrLIZIZ);
                    byteBufferAllocateDirect.rewind();
                }
                C2107108Nh.LIZ(inputStreamOpen, null);
                return byteBufferAllocateDirect;
            } catch (Throwable th18) {
                try {
                    TryCatchGuardChecker.doCheck(th18);
                } catch (Throwable th19) {
                    th = th19;
                }
                try {
                    throw th18;
                } catch (Throwable th20) {
                    th = th20;
                    th = th18;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(inputStreamOpen, th);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20142013rW LJIIJ(final java.lang.String r5, final boolean r6) {
        /*
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.13ra> r3 = X.C20141913rV.LJIIJ
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r4 < r0) goto L29
            X.13rZ r0 = new X.13rZ
            r0.<init>()
            java.lang.Object r1 = r3.computeIfAbsent(r5, r0)
            if (r1 != 0) goto L21
            X.13ra r1 = new X.13ra
            X.13rV r0 = X.C20141913rV.LIZ
            r0.getClass()
            X.13rW r0 = LJIIIIZZ(r5, r6)
            r1.<init>(r0)
        L21:
            X.13ra r1 = (X.C20142413ra) r1
            X.13rW r2 = r1.LIZ
            r0 = 0
            if (r2 != 0) goto L45
            return r0
        L29:
            java.lang.Object r1 = r3.get(r5)
            if (r1 != 0) goto L21
            X.13ra r1 = new X.13ra
            X.13rV r0 = X.C20141913rV.LIZ
            r0.getClass()
            X.13rW r0 = LJIIIIZZ(r5, r6)
            r1.<init>(r0)
            java.lang.Object r0 = r3.putIfAbsent(r5, r1)
            if (r0 == 0) goto L21
            r1 = r0
            goto L21
        L45:
            if (r6 == 0) goto L70
            java.nio.ByteBuffer r0 = r2.LIZJ
            if (r0 != 0) goto L70
            r0 = 29
            if (r4 >= r0) goto L5c
            r0 = 26
            if (r4 < r0) goto L70
            X.07oW r0 = X.C1975407oW.LIZ
            r0.getClass()
            boolean r0 = X.C1975407oW.LJI
            if (r0 == 0) goto L70
        L5c:
            X.00zU r1 = new X.00zU
            r1.<init>()
            X.13rX r0 = new X.13rX
            r0.<init>()
            r3.compute(r5, r0)
            T r0 = r1.element
            X.13rW r0 = (X.C20142013rW) r0
            if (r0 == 0) goto L70
            return r0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20141913rV.LJIIJ(java.lang.String, boolean):X.13rW");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ae A[PHI: r16
      0x01ae: PHI (r16v2 float) = (r16v1 float), (r16v1 float), (r16v3 float) binds: [B:109:0x01a9, B:104:0x019a, B:99:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0237 A[PHI: r1
      0x0237: PHI (r1v7 X.13rb) = (r1v6 X.13rb), (r1v8 X.13rb) binds: [B:127:0x0221, B:129:0x0235] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017f  */
    @Override // X.InterfaceC1697590uHF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface LIZLLL(android.graphics.fonts.FontVariationAxis[] r23, int r24, final boolean r25) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20141913rV.LIZLLL(android.graphics.fonts.FontVariationAxis[], int, boolean):android.graphics.Typeface");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface LJII(X.C20142013rW r5, android.graphics.fonts.FontVariationAxis[] r6, int r7, boolean r8) {
        /*
            java.nio.ByteBuffer r2 = r5.LIZJ
            r4 = 1000(0x3e8, float:1.401E-42)
            r3 = 0
            if (r2 == 0) goto L5c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L5e
            X.13rV r0 = X.C20141913rV.LIZ
            r0.getClass()
            android.graphics.fonts.Font$Builder r0 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L43
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L43
            android.graphics.fonts.Font$Builder r1 = r0.setFontVariationSettings(r6)     // Catch: java.lang.Throwable -> L43
            if (r7 <= r4) goto L20
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L21
        L20:
            r0 = r7
        L21:
            android.graphics.fonts.Font$Builder r1 = r1.setWeight(r0)     // Catch: java.lang.Throwable -> L43
            if (r8 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            android.graphics.fonts.Font$Builder r0 = r1.setSlant(r0)     // Catch: java.lang.Throwable -> L43
            android.graphics.fonts.Font r1 = r0.build()     // Catch: java.lang.Throwable -> L43
            android.graphics.fonts.FontFamily$Builder r0 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L43
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L43
            android.graphics.fonts.FontFamily r0 = r0.build()     // Catch: java.lang.Throwable -> L43
            android.graphics.Typeface r1 = LJI(r0)     // Catch: java.lang.Throwable -> L43
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L43
            goto L4f
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L4f:
            X.C189200o6.m5exceptionOrNullimpl(r1)
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L59
            r1 = r3
        L59:
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            goto L6b
        L5c:
            r1 = r3
            goto L6b
        L5e:
            X.07oW r0 = X.C1975407oW.LIZ
            r0.getClass()
            boolean r0 = X.C1975407oW.LJI
            if (r0 == 0) goto L5c
            android.graphics.Typeface r1 = X.C1975407oW.LIZ(r2, r6, r7, r8)
        L6b:
            if (r1 != 0) goto Lad
            android.content.Context r0 = X.C20141913rV.LIZJ
            if (r0 == 0) goto Lac
            android.graphics.Typeface$Builder r2 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L94
            android.content.res.AssetManager r1 = r0.getAssets()     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = r5.LIZ     // Catch: java.lang.Throwable -> L94
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L94
            android.graphics.Typeface$Builder r0 = r2.setFontVariationSettings(r6)     // Catch: java.lang.Throwable -> L94
            if (r7 <= r4) goto L84
            r7 = 1000(0x3e8, float:1.401E-42)
        L84:
            android.graphics.Typeface$Builder r0 = r0.setWeight(r7)     // Catch: java.lang.Throwable -> L94
            android.graphics.Typeface$Builder r0 = r0.setItalic(r8)     // Catch: java.lang.Throwable -> L94
            android.graphics.Typeface r1 = r0.build()     // Catch: java.lang.Throwable -> L94
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L94
            goto La0
        L94:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        La0:
            X.C189200o6.m5exceptionOrNullimpl(r1)
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto Laa
            r3 = r1
        Laa:
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
        Lac:
            return r3
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20141913rV.LJII(X.13rW, android.graphics.fonts.FontVariationAxis[], int, boolean):android.graphics.Typeface");
    }
}
