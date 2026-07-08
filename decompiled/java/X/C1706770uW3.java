package X;

import com.bytedance.android.live.ClickDecorationItemEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uW3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706770uW3 extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ BoardsDisplayView LL;
    public final /* synthetic */ BoardItem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706770uW3(BoardsDisplayView boardsDisplayView, BoardItem boardItem) {
        super(1);
        this.LL = boardsDisplayView;
        this.LLILLJJLI = boardItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        DataChannel dataChannel = this.LL.getDataChannel();
        if (dataChannel != null) {
            dataChannel.LC0(ClickDecorationItemEvent.class, this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
