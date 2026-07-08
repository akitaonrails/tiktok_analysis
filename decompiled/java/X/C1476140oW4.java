package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0oW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476140oW4 {
    public static void LIZ(C1471550oOf c1471550oOf) {
        if (c1471550oOf.LJIIJJI) {
            return;
        }
        c1471550oOf.LJIIJJI = true;
        if (c1471550oOf.LIZJ() != null) {
            c1471550oOf.LIZJ().LIZ(new C1475490oV1(5));
        }
    }

    public static void LIZIZ(DataLoaderHelper dataLoaderHelper) {
        ArrayList arrayList = new ArrayList();
        if (dataLoaderHelper.LIZLLL.LIZJ() > 0) {
            while (true) {
                C1471550oOf c1471550oOfLJFF = dataLoaderHelper.LIZLLL.LJFF();
                if (c1471550oOfLJFF == null) {
                    break;
                }
                if (c1471550oOfLJFF.LIZLLL >= 10000) {
                    arrayList.add(c1471550oOfLJFF);
                } else {
                    VideoInfoFetcher videoInfoFetcher = c1471550oOfLJFF.LJFF;
                    if (videoInfoFetcher != null) {
                        videoInfoFetcher.LJI();
                    }
                    LIZ(c1471550oOfLJFF);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                dataLoaderHelper.LIZLLL.LIZLLL((C1471550oOf) ListProtector.get(arrayList, i));
            }
            arrayList.clear();
        }
        if (dataLoaderHelper.LIZJ.LIZJ() > 0) {
            while (true) {
                C1471550oOf c1471550oOfLJFF2 = dataLoaderHelper.LIZJ.LJFF();
                if (c1471550oOfLJFF2 == null) {
                    break;
                }
                if (c1471550oOfLJFF2.LIZLLL >= 10000) {
                    arrayList.add(c1471550oOfLJFF2);
                } else {
                    VideoInfoFetcher videoInfoFetcher2 = c1471550oOfLJFF2.LJFF;
                    if (videoInfoFetcher2 != null) {
                        videoInfoFetcher2.LJI();
                    }
                    LIZ(c1471550oOfLJFF2);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                dataLoaderHelper.LIZJ.LIZLLL((C1471550oOf) ListProtector.get(arrayList, i2));
            }
            arrayList.clear();
        }
        if (dataLoaderHelper.LJ.LIZJ() > 0) {
            boolean z = false;
            while (true) {
                C1471550oOf c1471550oOfLJFF3 = dataLoaderHelper.LJ.LJFF();
                if (c1471550oOfLJFF3 == null) {
                    break;
                }
                if (c1471550oOfLJFF3.LIZLLL >= 10000) {
                    arrayList.add(c1471550oOfLJFF3);
                } else {
                    LIZ(c1471550oOfLJFF3);
                    z = true;
                }
            }
            if (z) {
                dataLoaderHelper.LJIIIIZZ.cancelAll();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                dataLoaderHelper.LJ.LIZLLL((C1471550oOf) ListProtector.get(arrayList, i3));
            }
            arrayList.clear();
        }
    }

    public static void LIZJ(String str, DataLoaderHelper dataLoaderHelper) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (dataLoaderHelper.LJIIIIZZ != null && dataLoaderHelper.LIZIZ == 0) {
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                C1471550oOf c1471550oOfLJI = dataLoaderHelper.LIZJ.LJI(str);
                if (c1471550oOfLJI != null) {
                    LIZ(c1471550oOfLJI);
                } else {
                    C1471550oOf c1471550oOfLJI2 = dataLoaderHelper.LIZLLL.LJI(str);
                    if (c1471550oOfLJI2 != null) {
                        VideoInfoFetcher videoInfoFetcher = c1471550oOfLJI2.LJFF;
                        if (videoInfoFetcher != null) {
                            videoInfoFetcher.LJI();
                        }
                        LIZ(c1471550oOfLJI2);
                    } else {
                        C1471550oOf c1471550oOfLJI3 = dataLoaderHelper.LJ.LJI(str);
                        if (c1471550oOfLJI3 != null) {
                            dataLoaderHelper.LJIIIIZZ.cancel(str);
                            LIZ(c1471550oOfLJI3);
                        }
                    }
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[preload] cancel preload task. key = ");
                sbLIZ.append(str);
                C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            dataLoaderHelper.LJJ.LJFF(1);
            return;
        }
        int i2 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("DataLoaderHelper", "need start mdl first");
    }
}
