package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedDMSharedTagTriggerV2;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694030RKf extends C09AY implements Function2<C03H5, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ FeedDMSharedTagTriggerV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C694030RKf(FeedDMSharedTagTriggerV2 feedDMSharedTagTriggerV2) {
        super(2);
        this.LL = feedDMSharedTagTriggerV2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Boolean> c291001Au) {
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            if (((Boolean) c291001Au2.LIZ).booleanValue()) {
                this.LL.LJIJJLI();
            }
            PriorityAbility priorityAbility = (PriorityAbility) this.LL.LLJILJIL.getValue();
            if (priorityAbility != null) {
                priorityAbility.VA2(true);
            }
        }
        return Unit.LIZ;
    }
}
