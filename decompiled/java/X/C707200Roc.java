package X;

import com.ss.android.ugc.aweme.ad.feed.ad4ad.Ad4adBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Roc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707200Roc extends C09AY implements Function0<BottomBarPriorityAbility> {
    public final /* synthetic */ Ad4adBottomBarAssemTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C707200Roc(Ad4adBottomBarAssemTrigger ad4adBottomBarAssemTrigger) {
        super(0);
        this.LL = ad4adBottomBarAssemTrigger;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final BottomBarPriorityAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), BottomBarPriorityAbility.class, null);
    }
}
