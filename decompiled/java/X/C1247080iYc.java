package X;

import Y.AfS188S0100000_19;
import Y.AkS468S0100000_3;
import Y.AkS481S0100000_19;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mixsearch.IMixSearchService;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.SelfFollowRelationSearchCell;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247080iYc extends AbstractC1247090iYd {
    public final IMixSearchService LLJILLL = (IMixSearchService) PluggableExtentionKt.pluggableSpi$default(IMixSearchService.class, false, false, false, 14, null);
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2836));

    @Override // X.AbstractC1906720ziY
    public final AbstractC329610Cw3<?> LJIIJJI() {
        return (AbstractC329610Cw3) this.LLJJ.getValue();
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        this.LLJIJIL.LIZ(this.LLJ.LJJJJZI(new AkS481S0100000_19(this, 3)).LJLIIIL(new AkS468S0100000_3(this, 8)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS481S0100000_19(this, 4)).LJJLL(new AfS188S0100000_19(this, 48), new AfS188S0100000_19(this, 49)));
        if (Intrinsics.LJFF(LJJ().getEnterFrom(), EnumC1247200iYo.FOLLOWING.getMobString())) {
            LJIILIIL(SelfFollowRelationSearchCell.class);
        } else {
            LJIILIIL(RelationSearchCell.class);
        }
        IMixSearchService iMixSearchService = this.LLJILLL;
        if (iMixSearchService != null) {
            iMixSearchService.LIZ();
        }
    }

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onDestroy() {
        this.LLJIJIL.LJ();
        IMixSearchService iMixSearchService = this.LLJILLL;
        if (iMixSearchService != null) {
            iMixSearchService.LIZIZ();
        }
    }
}
