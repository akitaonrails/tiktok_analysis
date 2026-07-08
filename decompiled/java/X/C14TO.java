package X;

import com.ss.android.ugc.aweme.tako.experiment.TakoHideEntranceByActiveLevelModel;

/* JADX INFO: renamed from: X.14TO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14TO {
    public static final C14TO LIZ = new C14TO();
    public static final TakoHideEntranceByActiveLevelModel LIZIZ = new TakoHideEntranceByActiveLevelModel(0, null, 3, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C14TQ());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C14TR());
    public static final C01GW LJ = C452501pT.LIZIZ(new C14TS());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C14TP());

    public static boolean LIZ(String str) {
        int iLJJJJ;
        TakoHideEntranceByActiveLevelModel takoHideEntranceByActiveLevelModel = (TakoHideEntranceByActiveLevelModel) LIZJ.getValue();
        if (takoHideEntranceByActiveLevelModel == null || takoHideEntranceByActiveLevelModel.hide.isEmpty() || takoHideEntranceByActiveLevelModel.level == -1 || (iLJJJJ = C14TF.LIZIZ.LJJJJ()) == -1 || ((1 << iLJJJJ) & takoHideEntranceByActiveLevelModel.level) == 0) {
            return false;
        }
        if (!takoHideEntranceByActiveLevelModel.hide.contains(str) && !takoHideEntranceByActiveLevelModel.hide.contains("all")) {
            return false;
        }
        return true;
    }
}
