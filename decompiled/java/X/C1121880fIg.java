package X;

import com.bytedance.android.live.broadcast.api.SMBDecorationBoardsPermissionChannel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.widget.LiveBoardsDisplayViewWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121880fIg extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ LiveBoardsDisplayViewWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1121880fIg(LiveBoardsDisplayViewWidget liveBoardsDisplayViewWidget) {
        super(1);
        this.LL = liveBoardsDisplayViewWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        LiveBoardsDisplayViewWidget liveBoardsDisplayViewWidget;
        DataChannel dataChannel;
        if (bool.booleanValue() && (dataChannel = (liveBoardsDisplayViewWidget = this.LL).dataChannel) != null) {
            dataChannel.EQ2(liveBoardsDisplayViewWidget, SMBDecorationBoardsPermissionChannel.class, liveBoardsDisplayViewWidget.LLILZIL);
        }
        return Unit.LIZ;
    }
}
