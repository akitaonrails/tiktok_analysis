package X;

import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RLC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RLC extends C09AY implements Function2<InteractRightAreaComponent, C731160SmA, Unit> {
    public C0RLC() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InteractRightAreaComponent interactRightAreaComponent, C731160SmA c731160SmA) {
        VideoItemParams item;
        DataCenter dataCenter;
        InteractRightAreaComponent interactRightAreaComponent2 = interactRightAreaComponent;
        C731160SmA c731160SmA2 = c731160SmA;
        if (c731160SmA2.LIZ != -1.0f && (item = interactRightAreaComponent2.yp().getItem()) != null && (dataCenter = item.dataCenter) != null) {
            dataCenter.zQ2(c731160SmA2, "right_item_resize");
        }
        return Unit.LIZ;
    }
}
