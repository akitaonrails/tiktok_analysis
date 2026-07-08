package X;

import Y.AfS188S0100000_19;
import Y.AkS481S0100000_19;
import com.ss.android.ugc.aweme.experiment.MixSearchExpConfig;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.SelfFollowRelationSearchCell;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247070iYb extends AbstractC1247090iYd {
    public int LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2837));

    @Override // X.AbstractC1906720ziY
    public final AbstractC329610Cw3<?> LJIIJJI() {
        return (AbstractC329610Cw3) this.LLJJ.getValue();
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        this.LLJIJIL.LIZ(this.LLJ.LJIL(((MixSearchExpConfig) C1247300iYy.LIZIZ.getValue()).remoteSearchDebounceMs, TimeUnit.MILLISECONDS).LJL(C11S5.LIZIZ).LJJJJZI(new AkS481S0100000_19(this, 5)).LJLIIIL(new AkS481S0100000_19(this, 6)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLI(C11IR.LL).LJJJJZI(new AkS481S0100000_19(this, 2)).LJJLL(new AfS188S0100000_19(this, 46), new AfS188S0100000_19(this, 47)));
        if (Intrinsics.LJFF(LJJ().getEnterFrom(), EnumC1247200iYo.FOLLOWING.getMobString())) {
            LJIILIIL(SelfFollowRelationSearchCell.class);
        } else {
            LJIILIIL(RelationSearchCell.class);
        }
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onDestroy() {
        this.LLJIJIL.LJ();
    }
}
