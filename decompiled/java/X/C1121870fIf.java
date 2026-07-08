package X;

import com.bytedance.android.live.broadcast.api.SMBDecorationBoardsPermissionChannel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.widget.LiveBoardsDisplayViewWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.smb.SMBDecorationPermissions;
import webcast.api.smb.SMBGoLivePageResponse;

/* JADX INFO: renamed from: X.0fIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121870fIf extends C09AY implements Function1<C470590Icr<SMBGoLivePageResponse.Data>, Unit> {
    public final /* synthetic */ LiveBoardsDisplayViewWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1121870fIf(LiveBoardsDisplayViewWidget liveBoardsDisplayViewWidget) {
        super(1);
        this.LL = liveBoardsDisplayViewWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C470590Icr<SMBGoLivePageResponse.Data> c470590Icr) {
        SMBDecorationPermissions sMBDecorationPermissions;
        LiveBoardsDisplayViewWidget liveBoardsDisplayViewWidget;
        BoardsDisplayView boardsDisplayView;
        C470590Icr<SMBGoLivePageResponse.Data> c470590Icr2 = c470590Icr;
        LiveBoardsDisplayViewWidget liveBoardsDisplayViewWidget2 = this.LL;
        DataChannel dataChannel = liveBoardsDisplayViewWidget2.dataChannel;
        if (dataChannel != null) {
            dataChannel.GQ2(liveBoardsDisplayViewWidget2, SMBDecorationBoardsPermissionChannel.class, liveBoardsDisplayViewWidget2.LLILZIL);
        }
        SMBGoLivePageResponse.Data data = c470590Icr2.data;
        if (data != null && (sMBDecorationPermissions = data.decorationPermissions) != null && sMBDecorationPermissions.hasDecorationPermission && (boardsDisplayView = (liveBoardsDisplayViewWidget = this.LL).LLILZ) != null) {
            boardsDisplayView.LJFF(liveBoardsDisplayViewWidget.widgetCallback.getFragment(), this.LL.dataChannel, "anchor_preview");
        }
        return Unit.LIZ;
    }
}
