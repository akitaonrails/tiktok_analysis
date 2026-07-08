package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09p7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2488709p7 {
    public static final C2488709p7 LIZ = new C2488709p7();

    static {
        new LinkedBlockingQueue();
    }

    public static C0VSJ LIZIZ(String str) {
        return new C0VSJ(new C0VSJ(str).getParent(), "file_map.json");
    }

    public static int LJI(String str) {
        Integer numValueOf;
        ExifInterface exifInterfaceLJIILL = C2471909mP.LJIILL(str);
        if (exifInterfaceLJIILL != null && (numValueOf = Integer.valueOf(C2204961BRm.LJLILLLLZI(exifInterfaceLJIILL, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlYpjLkifG5r0pAvcLaGCudzptAs/6/wOX", null)))) != null) {
            if (numValueOf.intValue() == 6) {
                return 90;
            }
            if (numValueOf.intValue() == 3) {
                return 180;
            }
            if (numValueOf.intValue() == 8) {
                return 270;
            }
            return 0;
        }
        return 0;
    }

    public static String LJIIIIZZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("_edit_temp");
        sbLIZ.append(".jpeg");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(long j, String str) {
        Object c098200Yq;
        if (C2471909mP.LJJIIZI(str)) {
            try {
                if (C2471909mP.LJJIIZI(str)) {
                    try {
                        c098200Yq = UriProtector.parse(str);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    String strLIZ = C09N5.LIZ(C786410Ut5.M3(C1BWL.LIZ()), (Uri) c098200Yq);
                    return C08F1.LIZIZ(strLIZ) + '_' + j + '_' + new C0VSJ(strLIZ).getName();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C08F1.LIZIZ(str));
                sbLIZ.append('_');
                sbLIZ.append(j);
                sbLIZ.append('.');
                sbLIZ.append(C2471909mP.LJIJJLI(str, false));
                return C2188811AlT.LIZIZ(sbLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C08F1.LIZIZ(str));
                sbLIZ2.append('_');
                sbLIZ2.append(j);
                sbLIZ2.append('.');
                sbLIZ2.append(C2471909mP.LJIJJLI(str, false));
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return new C0VSJ(str).getName();
    }

    public static float LIZLLL(float f, float f2) {
        if (C1441960ncw.LIZ()) {
            return f2;
        }
        if (C1450870nrJ.LJIILJJIL <= 0.45f) {
            if (f2 >= 0.5294118f && f2 > f) {
                return f2;
            }
            return f;
        }
        if (f2 > f && f2 > C1450870nrJ.LIZJ()) {
            return f2;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0131, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0021, B:11:0x0028, B:12:0x0036, B:15:0x003c, B:20:0x0052, B:21:0x0061, B:23:0x006e, B:25:0x0078, B:27:0x0090, B:29:0x0097, B:30:0x00b6, B:33:0x00bc, B:35:0x00ef, B:37:0x00f5, B:40:0x00ff, B:42:0x0105, B:44:0x010c, B:46:0x012c, B:7:0x0016, B:5:0x000d), top: B:52:0x0001, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJIILL(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2488709p7.LJIILL(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, java.lang.String):void");
    }

    public static RectF LIZ(float f, Rect rect, Rect rect2) {
        return new RectF(rect.left + ((rect2.left - r1) * f), rect.top + ((rect2.top - r1) * f), rect.right + ((rect2.right - r1) * f), rect.bottom + (f * (rect2.bottom - r2)));
    }

    public static int LJFF(float f, float f2, int i) {
        if (f2 == f) {
            return 0;
        }
        return (int) Math.ceil((i * ((1.0f / f) - (1.0f / f2))) / 2.0f);
    }

    public static String LJII(MediaModel mediaModel, int i, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(mediaModel.LJFF());
            sbLIZ.append('#');
            sbLIZ.append(i);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return mediaModel.LJFF();
    }

    public static int LJIIJJI(Bitmap.CompressFormat compressFormat, Bitmap bitmap, C0VSJ c0vsj) throws Throwable {
        if (bitmap.isRecycled()) {
            return -1;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(c0vsj));
            Throwable th = null;
            try {
                if (!bitmap.compress(compressFormat, 90, bufferedOutputStream)) {
                    c0vsj.delete();
                    C2107108Nh.LIZ(bufferedOutputStream, null);
                    return -2;
                }
                bufferedOutputStream.flush();
                C2107108Nh.LIZ(bufferedOutputStream, null);
                return 0;
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(bufferedOutputStream, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            c0vsj.delete();
            return -3;
        }
    }

    public static boolean LJIIL(Bitmap bitmap, String str, String str2) throws Throwable {
        C0VSV c0vsv;
        if (bitmap.isRecycled() || !Intrinsics.LJFF("mounted", C786410Ut5.X3())) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0vsj);
        sbLIZ.append('/');
        sbLIZ.append(str2);
        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (u.LJIIZILJ(c0vsj2.getPath(), ".raw", false)) {
            return TEImageInterface.convertBitmapWithRgba(bitmap, c0vsj2.getPath(), 0).booleanValue();
        }
        if (!c0vsj2.exists()) {
            try {
                c0vsj2.createNewFile();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJI("saveBitmapToSD createNewFile error", e);
                return false;
            }
        }
        C0VSV c0vsv2 = null;
        try {
            try {
                c0vsv = new C0VSV(c0vsj2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, c0vsv);
            c0vsv.flush();
            try {
                c0vsv.close();
                return true;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C201955140j.LJI("saveBitmapToSD close stream error", e3);
                return true;
            }
        } catch (Exception e4) {
            e = e4;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("saveBitmapToSD compress error", e);
            try {
                c0vsv2.close();
                return false;
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
                C201955140j.LJI("saveBitmapToSD close stream error", e5);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(th);
            try {
                c0vsv2.close();
                throw th;
            } catch (Exception e6) {
                TryCatchGuardChecker.doCheck(e6);
                C201955140j.LJI("saveBitmapToSD close stream error", e6);
                throw th;
            }
        }
    }

    public static Pair LJ(int i, int i2, int i3, int i4) {
        if (i2 > i4 || i > i3) {
            if (i2 - i4 > i - i3) {
                i = (int) (i4 * (i / i2));
                i2 = i4;
            } else {
                i2 = (int) (i3 / (i / i2));
                i = i3;
            }
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void LJIIIZ(File file, C2488309p3 c2488309p3, final ArrayList arrayList, Function1 function1) {
        Set setKeySet;
        if (arrayList == null) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList2 = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (((Boolean) C2489509pF.LIZ.getValue()).booleanValue()) {
            Map mapLIZ = C08SO.LIZ(new C08SN<MediaModel, String>() { // from class: X.0985
                @Override // X.C08SN
                public final Iterator<MediaModel> LIZ() {
                    return arrayList.iterator();
                }

                @Override // X.C08SN
                public final String LIZIZ(MediaModel mediaModel) {
                    return mediaModel.LJFF();
                }
            });
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapLIZ.entrySet()) {
                if (((Number) entry.getValue()).intValue() > 1) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            setKeySet = linkedHashMap.keySet();
        } else {
            setKeySet = C08CX.INSTANCE;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C23238098q(true ^ setKeySet.isEmpty(), c2488309p3, arrayList, file, setKeySet, arrayList2, concurrentHashMap, copyOnWriteArrayList, function1, jCurrentTimeMillis, null), 2);
    }

    public static String LJIILIIL(String str, String str2, MediaModel mediaModel, int[] iArr) {
        boolean zLIZJ;
        if (str != null) {
            if (iArr == null) {
                iArr = C2475309mx.LIZJ(str);
            }
            if (iArr != null) {
                if (LJI(str) % 180 == 90) {
                    mediaModel.width = iArr[1];
                    mediaModel.height = iArr[0];
                } else {
                    mediaModel.width = iArr[0];
                    mediaModel.height = iArr[1];
                }
            }
            int i = mediaModel.width;
            int i2 = mediaModel.height;
            if (iArr != null) {
                double d = i2;
                double d2 = i;
                double d3 = d2 * 2.4d;
                if (d > d3) {
                    C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "image_upload_crop size height > 2.4 width crop image");
                    i2 = (int) d3;
                    zLIZJ = C2347109Hp.LIZJ(str, str2, i, i2, 1, Bitmap.CompressFormat.JPEG);
                } else {
                    double d4 = d * 2.4d;
                    if (d2 > d4) {
                        C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "image_upload_crop size width > 2.4 height crop image");
                        i = (int) d4;
                        zLIZJ = C2347109Hp.LIZJ(str, str2, i, i2, 1, Bitmap.CompressFormat.JPEG);
                    }
                }
                if (zLIZJ) {
                    mediaModel.width = i;
                    mediaModel.height = i2;
                    return str2;
                }
            }
        }
        return str;
    }

    public static void LJIILJJIL(C2488709p7 c2488709p7, String str, String str2, MediaModel mediaModel) {
        Bitmap bitmapLIZLLL;
        c2488709p7.getClass();
        if (str != null) {
            int iLIZLLL = C2477909nN.LIZLLL(str);
            if (iLIZLLL % 180 == 90) {
                C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("image_upload_crop has degree ");
                sbLIZ.append(iLIZLLL);
                C201955140j.LJIILJJIL(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
                int[] iArrLIZJ = C2475309mx.LIZJ(str);
                try {
                    Bitmap bitmapLIZ = C2475309mx.LIZ(iArrLIZJ[0], iArrLIZJ[1], str);
                    if (bitmapLIZ != null && (bitmapLIZLLL = C2475309mx.LIZLLL(bitmapLIZ, iLIZLLL)) != null) {
                        C2475309mx.LJFF(100, Bitmap.CompressFormat.JPEG, bitmapLIZLLL, new C0VSJ(str2));
                        bitmapLIZLLL.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZLLL);
                        mediaModel.width = iArrLIZJ[1];
                        mediaModel.height = iArrLIZJ[0];
                    }
                } catch (OutOfMemoryError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final boolean LJIIJ(MediaModel mediaModel, String str, CopyOnWriteArrayList<String> copyOnWriteArrayList, ConcurrentHashMap<String, MediaModel> concurrentHashMap, String str2) {
        ConcurrentHashMap<String, C0L23> concurrentHashMap2;
        System.currentTimeMillis();
        if (!C574070MfN.LJ(mediaModel, str)) {
            return false;
        }
        copyOnWriteArrayList.add(str);
        if (mediaModel.height <= 0 || mediaModel.width <= 0) {
            int[] iArrLIZJ = C2475309mx.LIZJ(str);
            if (iArrLIZJ == null) {
                C201955140j.LJ("photo mode - get size null");
            } else {
                mediaModel.width = iArrLIZJ[0];
                mediaModel.height = iArrLIZJ[1];
            }
        }
        try {
            LJIILIIL(str, str, mediaModel, null);
            LJIILJJIL(this, str, str, mediaModel);
            LJIILL(mediaModel, str);
            if (C2489309pD.LIZ() && !Intrinsics.LJFF(mediaModel.LJFF(), str)) {
                C01GW c01gw = C0L22.LIZ;
                C0L23 c0l23LIZIZ = C0L22.LIZIZ(mediaModel.LJFF());
                if (c0l23LIZIZ != null && (concurrentHashMap2 = C0L22.LIZIZ) != null) {
                    concurrentHashMap2.put(str, c0l23LIZIZ);
                }
            }
            MediaModel mediaModel2 = new MediaModel(mediaModel.id);
            mediaModel2.LJIILL(str);
            mediaModel2.aigcInfo = mediaModel.aigcInfo;
            mediaModel2.width = mediaModel.width;
            mediaModel2.height = mediaModel.height;
            mediaModel2.slotId = mediaModel.slotId;
            concurrentHashMap.put(str2, mediaModel2);
            return true;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
