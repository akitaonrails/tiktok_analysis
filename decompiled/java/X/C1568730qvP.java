package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.assems.LiveMainFragmentAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qvP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568730qvP extends C09AY implements Function0<C486610J6l> {
    public final /* synthetic */ LiveMainFragmentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568730qvP(LiveMainFragmentAssem liveMainFragmentAssem) {
        super(0);
        this.LL = liveMainFragmentAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C486610J6l invoke() {
        return new C486610J6l((HomeTabAbility) this.LL.LLJ.getValue());
    }
}
