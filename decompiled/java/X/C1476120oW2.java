package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oW2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476120oW2 {
    public static boolean LIZLLL(DataLoaderHelper dataLoaderHelper) {
        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = dataLoaderHelper.LJIIIZ;
        if (aVMDLDataLoaderConfigure != null && !TextUtils.isEmpty(aVMDLDataLoaderConfigure.mPrecisePreloadConfigStr)) {
            try {
                if (JSONObjectProtectorUtils.getInt(new JSONObject(dataLoaderHelper.LJIIIZ.mPrecisePreloadConfigStr), "enable") > 0) {
                    return true;
                }
                return false;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    public final void LIZIZ(DataLoaderHelper dataLoaderHelper) {
        if (dataLoaderHelper.LJIIIIZZ == null) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] need load mdl first.");
            return;
        }
        C1471550oOf c1471550oOfLIZ = dataLoaderHelper.LIZJ.LIZ();
        if (c1471550oOfLIZ != null && dataLoaderHelper.LIZLLL.LIZLLL(c1471550oOfLIZ)) {
            dataLoaderHelper.LIZJ.LJFF();
            if (c1471550oOfLIZ.LIZIZ == null && c1471550oOfLIZ.LJIIJ == null) {
                LIZJ(c1471550oOfLIZ, dataLoaderHelper);
            } else {
                LIZ(c1471550oOfLIZ, dataLoaderHelper);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1471550oOf r29, com.ss.ttvideoengine.DataLoaderHelper r30) {
        /*
            Method dump skipped, instruction units count: 1167
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1476120oW2.LIZ(X.0oOf, com.ss.ttvideoengine.DataLoaderHelper):void");
    }

    public final void LIZJ(C1471550oOf c1471550oOf, DataLoaderHelper dataLoaderHelper) {
        String strLIZJ;
        String strLJFF;
        C1468800oKE c1468800oKELIZ;
        if (c1471550oOf.LJI != null && ((CopyOnWriteArrayList) c1471550oOf.LJIILLIIL).size() == 1) {
            ListProtector.remove(c1471550oOf.LJIILLIIL, 0);
        }
        HashMap map = new HashMap();
        if (c1471550oOf.LJI == null) {
            if (dataLoaderHelper.LIZ != null && TextUtils.isEmpty(c1471550oOf.LJII)) {
                strLIZJ = dataLoaderHelper.LIZ.LIZJ(map, c1471550oOf.LIZ, c1471550oOf.LJ);
                strLJFF = dataLoaderHelper.LIZ.LJFF(c1471550oOf.LIZ, c1471550oOf.LJ);
                c1471550oOf.LJI.getClass();
                c1471550oOf.LJII = C790040Uyw.LIZ(strLIZJ);
            } else {
                strLIZJ = null;
                strLJFF = null;
            }
            C1468070oJ3.LIZ().getClass();
            String strLIZ = C790040Uyw.LIZ(strLIZJ);
            synchronized (C1476380oWS.class) {
                try {
                    c1468800oKELIZ = dataLoaderHelper.LJIIJJI.LIZ(c1471550oOf.LIZ, strLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c1468800oKELIZ != null && !c1468800oKELIZ.LIZJ) {
                c1471550oOf.LIZIZ = c1468800oKELIZ.LIZ;
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("DataLoaderHelper", C786410Ut5.j4("[preload] get videoModel , videoId = %s", new Object[]{c1471550oOf.LIZ}));
                LIZ(c1471550oOf, dataLoaderHelper);
                return;
            }
            if (c1471550oOf.LJI == null) {
                return;
            }
            VideoInfoFetcher videoInfoFetcher = new VideoInfoFetcher(dataLoaderHelper.LJIIJ);
            c1471550oOf.LJFF = videoInfoFetcher;
            videoInfoFetcher.LJII = new C1471290oOF(c1471550oOf);
            VideoInfoFetcher videoInfoFetcher2 = c1471550oOf.LJFF;
            c1471550oOf.LJI.getClass();
            videoInfoFetcher2.LJIIIZ = null;
            VideoInfoFetcher videoInfoFetcher3 = c1471550oOf.LJFF;
            c1471550oOf.LJI.getClass();
            videoInfoFetcher3.LJIIL = null;
            c1471550oOf.LJFF.LJIIIZ(true);
            VideoInfoFetcher videoInfoFetcher4 = c1471550oOf.LJFF;
            c1471550oOf.LJI.getClass();
            c1471550oOf.LJI.getClass();
            c1471550oOf.LJI.getClass();
            videoInfoFetcher4.LJII(0, strLIZ, strLJFF, null);
            return;
        }
        throw null;
    }
}
