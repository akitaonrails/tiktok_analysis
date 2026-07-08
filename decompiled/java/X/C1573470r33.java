package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS38S0000100_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r33, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573470r33 {
    public final String LIZ;
    public final SeriesProfileTabViewModel LIZIZ;
    public final boolean LIZJ = false;
    public View LIZLLL;
    public long LJ;
    public final WeakReference<Fragment> LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C1155660gBA c1155660gBA) {
        long jLongValue;
        Long lLJIILIIL;
        String str = c1155660gBA.LIZ;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        boolean zLJFF = Intrinsics.LJFF(c1155660gBA.LIZIZ, Boolean.TRUE);
        if (jLongValue == ((C1572990r2H) this.LIZIZ.getState()).LL && zLJFF == ((C1572990r2H) this.LIZIZ.getState()).LLILLJJLI) {
            return;
        }
        this.LJ = jLongValue;
        if (this.LIZJ) {
            SeriesProfileTabViewModel seriesProfileTabViewModel = this.LIZIZ;
            seriesProfileTabViewModel.getClass();
            seriesProfileTabViewModel.setState(new AwS38S0000100_24(jLongValue, 1));
            SeriesProfileTabViewModel seriesProfileTabViewModel2 = this.LIZIZ;
            seriesProfileTabViewModel2.getClass();
            seriesProfileTabViewModel2.setState(new AwS36S0010000_24(zLJFF, 29));
            return;
        }
        SeriesProfileTabViewModel seriesProfileTabViewModel3 = this.LIZIZ;
        seriesProfileTabViewModel3.getClass();
        seriesProfileTabViewModel3.setState(new AwS38S0000100_24(jLongValue, 1));
        seriesProfileTabViewModel3.LLILLJJLI.clear();
        seriesProfileTabViewModel3.manualListRefresh();
        SeriesProfileTabViewModel seriesProfileTabViewModel4 = this.LIZIZ;
        seriesProfileTabViewModel4.getClass();
        seriesProfileTabViewModel4.setState(new AwS36S0010000_24(zLJFF, 29));
    }

    public C1573470r33(Fragment fragment, String str, SeriesProfileTabViewModel seriesProfileTabViewModel) {
        this.LIZ = str;
        this.LIZIZ = seriesProfileTabViewModel;
        this.LJFF = new WeakReference<>(fragment);
    }
}
