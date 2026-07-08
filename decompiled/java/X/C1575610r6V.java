package X;

import android.view.View;
import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightToolbarIconBridgeAssem;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS36S0010000_24;

/* JADX INFO: renamed from: X.0r6V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575610r6V extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FeedSkylightToolbarIconBridgeAssem LL;
    public final /* synthetic */ C1581460rFw LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ List<View> LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1575610r6V(FeedSkylightToolbarIconBridgeAssem feedSkylightToolbarIconBridgeAssem, C1581460rFw c1581460rFw, boolean z, int i, List<View> list, long j) {
        super(0);
        this.LL = feedSkylightToolbarIconBridgeAssem;
        this.LLILLJJLI = c1581460rFw;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = list;
        this.LLILZLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility;
        ((Set) this.LL.LLJILLL.getValue()).remove(this.LLILLJJLI);
        if (!this.LLILLL && this.LLILZ == C1697810uHb.LJIIJ(this.LLILZIL) && this.LL.ko().getState().LLILLL.LIZ.LJ == this.LLILZLL && ((feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) this.LL.LLILZ.getValue()) == null || !feedRecommendSkylightDrawerAbility.yw0())) {
            this.LL.ko().setStateImmediate(new AwS36S0010000_24(27));
        }
        return Unit.LIZ;
    }
}
