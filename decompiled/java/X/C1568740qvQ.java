package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.assems.LiveMainFragmentAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568740qvQ extends C09AY implements Function0<HomeTabAbility> {
    public final /* synthetic */ LiveMainFragmentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568740qvQ(LiveMainFragmentAssem liveMainFragmentAssem) {
        super(0);
        this.LL = liveMainFragmentAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HomeTabAbility invoke() {
        MainActivityScope mainActivityScopeLIZLLL = C0S4U.LIZLLL(this.LL);
        if (mainActivityScopeLIZLLL != null) {
            return C0DMM.LIZ(mainActivityScopeLIZLLL);
        }
        return null;
    }
}
