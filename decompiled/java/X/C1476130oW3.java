package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* JADX INFO: renamed from: X.0oW3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476130oW3 {
    public static void LIZIZ(C1475600oVC c1475600oVC, DataLoaderHelper dataLoaderHelper) {
        dataLoaderHelper.LJJ.LIZJ(1);
        try {
            LIZ(c1475600oVC.LIZ, c1475600oVC.LIZJ, c1475600oVC.LJFF, null, c1475600oVC, dataLoaderHelper);
            dataLoaderHelper.LJJ.LJFF(1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dataLoaderHelper.LJJ.LJFF(1);
            throw th;
        }
    }

    public static void LIZ(String str, String str2, long j, C1476190oW9 c1476190oW9, C1475600oVC c1475600oVC, DataLoaderHelper dataLoaderHelper) {
        String str3;
        EnumC2281151EQn enumC2281151EQn;
        if (TextUtils.isEmpty(str)) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] key invalid.");
            return;
        }
        if (dataLoaderHelper.LJIIIIZZ != null && dataLoaderHelper.LIZIZ == 0) {
            if (!dataLoaderHelper.LIZLLL.LIZIZ(str) && !dataLoaderHelper.LIZJ.LIZIZ(str)) {
                if (TTVideoEngineLog.d()) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[preload] _addTask key=");
                    sbLIZ.append(str);
                    sbLIZ.append(", videoId=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", preloadSize=");
                    sbLIZ.append(j);
                    sbLIZ.append(", vidItem=");
                    sbLIZ.append((Object) null);
                    sbLIZ.append(", videoModelItem=");
                    sbLIZ.append(c1476190oW9);
                    sbLIZ.append(", urlItem=");
                    sbLIZ.append(c1475600oVC);
                    TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
                EnumC2281151EQn enumC2281151EQn2 = EnumC2281151EQn.Undefine;
                if (c1476190oW9 != null && (enumC2281151EQn = c1476190oW9.LIZIZ) != null) {
                    enumC2281151EQn2 = enumC2281151EQn;
                }
                int i3 = -1;
                String str4 = "unknown";
                if (c1475600oVC != null) {
                    if (!TextUtils.isEmpty(c1475600oVC.LIZLLL)) {
                        str4 = c1475600oVC.LIZLLL;
                    }
                    str3 = "";
                    if (TextUtils.isEmpty("")) {
                        str3 = null;
                    }
                } else if (c1476190oW9 != null) {
                    if (!TextUtils.isEmpty(c1476190oW9.LJI)) {
                        str4 = c1476190oW9.LJI;
                    }
                    if (!TextUtils.isEmpty(c1476190oW9.LJII)) {
                        str3 = c1476190oW9.LJII;
                    } else {
                        str3 = null;
                    }
                    int i4 = c1476190oW9.LJIIIIZZ;
                    if (i4 != -1) {
                        i3 = i4;
                    }
                } else {
                    str4 = null;
                    str3 = null;
                }
                C1471550oOf c1471550oOf = new C1471550oOf();
                c1471550oOf.LJ(str, enumC2281151EQn2, j);
                c1471550oOf.LIZ = str2;
                c1471550oOf.LJI = null;
                c1471550oOf.LJIIIZ = c1476190oW9;
                c1471550oOf.LJIIJ = c1475600oVC;
                c1471550oOf.LJIIL = str4;
                c1471550oOf.LJIILIIL = str3;
                c1471550oOf.LJIILJJIL = i3;
                if (c1475600oVC != null) {
                    c1471550oOf.LIZLLL = c1475600oVC.LJI;
                    c1471550oOf.LJIIIIZZ = c1475600oVC.LJ;
                    c1471550oOf.LJIILL = c1475600oVC.LJII;
                }
                if (c1476190oW9 != null) {
                    c1471550oOf.LIZIZ = c1476190oW9.LIZ;
                    c1471550oOf.LIZLLL = 0;
                    c1471550oOf.LJIIIIZZ = c1476190oW9.LJIIIZ;
                }
                if (dataLoaderHelper.LIZJ.LIZLLL(c1471550oOf)) {
                    dataLoaderHelper.LJIILJJIL();
                    return;
                } else {
                    c1471550oOf.LIZ(-1002);
                    return;
                }
            }
            int i5 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "[preload] add the same key task.");
            return;
        }
        int i6 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("DataLoaderHelper", "[preload] need load mdl first.");
    }
}
