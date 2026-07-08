package X;

import com.ss.android.ugc.aweme.experiment.FollowAddRedDotShowSceneExp;

/* JADX INFO: renamed from: X.0Nsj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607830Nsj {
    public static final C607830Nsj LIZ = new C607830Nsj();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C592440NLm());
    public static volatile C607840Nsk LIZJ;
    public static C607820Nsi LIZLLL;

    public final void LIZ() {
        if ((((Number) C296100Bj6.LIZ.getValue()).intValue() & 2) == 0 && ((Boolean) FollowAddRedDotShowSceneExp.LIZJ.getValue()).booleanValue() && LIZLLL == null) {
            C607820Nsi c607820Nsi = new C607820Nsi(this);
            LIZLLL = c607820Nsi;
            C1076010e6h.LIZJ.LIZIZ().LJFF().observeForever(c607820Nsi);
        }
    }
}
