package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0kas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325360kas {
    public static volatile C1325360kas LIZIZ;
    public final Map<String, Pair<Bitmap, Integer>> LIZ = new ConcurrentHashMap();

    public static C1325360kas LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C1325360kas.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1325360kas();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZLLL() {
        Iterator it2 = ((ConcurrentHashMap) this.LIZ).entrySet().iterator();
        long jIntValue = 0;
        while (it2.hasNext()) {
            jIntValue += (long) ((Integer) ((Pair) ((Map.Entry) it2.next()).getValue()).second).intValue();
        }
        if (jIntValue > 12582912) {
            ((ConcurrentHashMap) this.LIZ).clear();
        }
    }

    public static String LIZ(Video video) {
        UrlModel originCover;
        if (video == null || (originCover = video.getOriginCover()) == null || originCover.getUrlList() == null || originCover.getUrlList().isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(originCover.getUrlList(), 0);
    }

    public final void LIZJ(Video video, boolean z) {
        File fileLIZLLL;
        C1325710kbR c1325710kbRLIZ;
        EnumC1320950kTl enumC1320950kTl;
        try {
            final String strLIZ = LIZ(video);
            if (TextUtils.isEmpty(strLIZ)) {
                return;
            }
            Uri uri = UriProtector.parse(strLIZ);
            InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
            if (interfaceC1325460kb2LIZJ != null) {
                fileLIZLLL = interfaceC1325460kb2LIZJ.LIZLLL(uri);
            } else {
                fileLIZLLL = null;
            }
            if (!z && fileLIZLLL != null && fileLIZLLL.exists()) {
                Uri uri2 = C1325880kbi.LIZ;
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(Uri.fromFile(fileLIZLLL));
                c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.MEDIUM;
                c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
                enumC1320950kTl = EnumC1320950kTl.DISK_CACHE;
            } else {
                C1325700kbQ c1325700kbQLIZLLL2 = C1325700kbQ.LIZLLL(uri);
                c1325700kbQLIZLLL2.LJIIL = EnumC1331380kka.MEDIUM;
                c1325710kbRLIZ = c1325700kbQLIZLLL2.LIZ();
                enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
            }
            ArrayList arrayList = new ArrayList(1);
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            c1325540kbALIZ.getClass();
            arrayList.add(new C1320160kSU(c1325540kbALIZ, c1325710kbRLIZ, enumC1320950kTl));
            final C1320930kTj c1320930kTj = new C1320930kTj(new C1320750kTR(arrayList));
            c1320930kTj.LIZJ(new AbstractC447090Hg3() { // from class: X.0kat
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                }

                @Override // X.AbstractC447090Hg3
                public final void LJI(Bitmap bitmap) {
                    int allocationByteCount;
                    try {
                        if (c1320930kTj.LIZ() && bitmap != null && !bitmap.isRecycled() && bitmap.getConfig() != null) {
                            this.LIZJ.LIZLLL();
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
                            Map<String, Pair<Bitmap, Integer>> map = this.LIZJ.LIZ;
                            String str = strLIZ;
                            if (bitmapCreateBitmap == null) {
                                allocationByteCount = 0;
                            } else {
                                allocationByteCount = bitmapCreateBitmap.getAllocationByteCount();
                            }
                            ((ConcurrentHashMap) map).put(str, new Pair(bitmapCreateBitmap, Integer.valueOf(allocationByteCount)));
                        }
                    } finally {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                    c1320930kTj.close();
                }
            }, C823050WQl.LIZLLL());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
