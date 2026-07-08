package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.0QSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670650QSh {
    public static Function0<Unit> LIZJ;
    public static boolean LJ;
    public static JobSupport LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;
    public static final C670650QSh LIZ = new C670650QSh();
    public static C670640QSg LIZIZ = new C670640QSg();
    public static long LIZLLL = -1;

    static {
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        c1dfkLIZ.LIZIZ(null);
        LJFF = c1dfkLIZ;
        LJI = C452501pT.LIZIZ(new C670670QSj());
        LJII = C452501pT.LIZIZ(new C670660QSi());
    }

    public static long LIZJ() {
        INetwork iNetwork = (INetwork) LJI.getValue();
        return iNetwork != null ? iNetwork.LIZIZ() : System.currentTimeMillis();
    }

    public static boolean LIZ(C19EG c19eg) {
        FeedPanelStateViewModel feedPanelStateViewModel = (FeedPanelStateViewModel) ViewModelProviders.of(c19eg).get(FeedPanelStateViewModel.class);
        boolean z = C740400T2o.LIZ;
        C740390T2n.LIZ();
        boolean z2 = !z;
        Boolean value = feedPanelStateViewModel.LLILLJJLI.getValue();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(value, bool) && !z2 && !Intrinsics.LJFF(((FeedPanelStateViewModel) ViewModelProviders.of(c19eg).get(FeedPanelStateViewModel.class)).LLJILJILJ.getValue(), bool) && !Intrinsics.LJFF(((FeedPanelStateViewModel) ViewModelProviders.of(c19eg).get(FeedPanelStateViewModel.class)).LLIZLLLIL.getValue(), bool) && !Intrinsics.LJFF(((FeedPanelStateViewModel) ViewModelProviders.of(c19eg).get(FeedPanelStateViewModel.class)).LLJJIJIIJIL.getValue(), bool)) {
            return true;
        }
        return false;
    }

    public static String LIZIZ(C670650QSh c670650QSh, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        c670650QSh.getClass();
        if (z) {
            LIZIZ = C670640QSg.LIZ(LIZIZ, null, null, null, "", false, 0L, 0L, null, 130559);
        }
        C670640QSg c670640QSg = LIZIZ;
        if (c670640QSg.LJIIJ) {
            return "";
        }
        if (z2) {
            LIZIZ = C670640QSg.LIZ(c670640QSg, null, null, null, null, true, 0L, 0L, null, 130047);
        }
        if (LIZIZ.LJIIIZ.length() > 0) {
            return LIZIZ.LJIIIZ;
        }
        if (LIZJ() - LIZIZ.LJIILIIL < ((long) C0QS0.LIZIZ().carryingHotWordsExpiredTime) * 1000) {
            C670640QSg c670640QSg2 = LIZIZ;
            LIZIZ = C670640QSg.LIZ(c670640QSg2, null, null, null, c670640QSg2.LJIIIIZZ, false, 0L, 0L, null, 130559);
        }
        return LIZIZ.LJIIIZ;
    }
}
