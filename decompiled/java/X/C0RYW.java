package X;

import com.ss.android.ugc.aweme.feed.assem.addiction.AntiAddictionToastAssemTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RYW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RYW extends C09AY implements Function0<BottomBarPriorityAbility> {
    public final /* synthetic */ AntiAddictionToastAssemTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RYW(AntiAddictionToastAssemTrigger antiAddictionToastAssemTrigger) {
        super(0);
        this.LL = antiAddictionToastAssemTrigger;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final BottomBarPriorityAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), BottomBarPriorityAbility.class, null);
    }
}
