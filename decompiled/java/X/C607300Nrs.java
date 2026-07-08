package X;

import com.ss.android.ugc.aweme.feed.component.ReachBottomCacheComponent;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0Nrs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607300Nrs extends C09AY implements Function0<ILoadMoreAbility> {
    public final /* synthetic */ ReachBottomCacheComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607300Nrs(ReachBottomCacheComponent reachBottomCacheComponent) {
        super(0);
        this.LL = reachBottomCacheComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ILoadMoreAbility invoke() {
        C01GW c01gwLIZIZ;
        ReachBottomCacheComponent reachBottomCacheComponent = this.LL;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) reachBottomCacheComponent, 1808), null);
            C1566140qrE.LIZJ(reachBottomCacheComponent, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS127S0110000_9(false, (InterfaceC1565950qqv) reachBottomCacheComponent, 19));
        }
        IFeedFragmentAbility iFeedFragmentAbility = (IFeedFragmentAbility) c01gwLIZIZ.getValue();
        if (iFeedFragmentAbility != null) {
            return iFeedFragmentAbility.Ew0();
        }
        return null;
    }
}
