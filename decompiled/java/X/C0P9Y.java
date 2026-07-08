package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0P9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P9Y {
    public final C19EG LIZ;
    public final Fragment LIZIZ;
    public final RecyclerView LIZJ;
    public final ActivityCardThemeViewModel LIZLLL;
    public final Function2<GlobalDoodleConfig, RecyclerView, Unit> LJ;
    public final Function0<Unit> LJFF;
    public GlobalDoodleConfig LJI;
    public volatile Boolean LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1229));

    public C0P9Y(C19EG c19eg, Fragment fragment, RecyclerView recyclerView, ActivityCardThemeViewModel activityCardThemeViewModel, C640180P9c c640180P9c, AwS554S0100000_10 awS554S0100000_10) {
        this.LIZ = c19eg;
        this.LIZIZ = fragment;
        this.LIZJ = recyclerView;
        this.LIZLLL = activityCardThemeViewModel;
        this.LJ = c640180P9c;
        this.LJFF = awS554S0100000_10;
    }
}
