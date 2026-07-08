package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.AbsVideoTagContainerTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694020RKe extends C09AY implements Function0<CategoryPriorityAbility> {
    public final /* synthetic */ AbsVideoTagContainerTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C694020RKe(AbsVideoTagContainerTrigger absVideoTagContainerTrigger) {
        super(0);
        this.LL = absVideoTagContainerTrigger;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final CategoryPriorityAbility invoke() {
        return C1558520qew.LIZ(C1558420qem.LIZIZ(this.LL), CategoryPriorityAbility.class, null);
    }
}
