package X;

import com.bytedance.android.live.PreviewBoardRenderDoneEvent;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.SmbLiveKickstarterSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import com.bytedance.android.livesdk.model.LastUsedLiveBoardsModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814570xJv extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ BoardsDisplayView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814570xJv(BoardsDisplayView boardsDisplayView) {
        super(1);
        this.LL = boardsDisplayView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        AbstractC1700910uMb value;
        DataChannel dataChannel;
        C05YD<AbstractC1700910uMb> c05yd = this.LL.getViewModel().LLILZ;
        if (c05yd != null) {
            value = c05yd.getValue();
        } else {
            value = null;
        }
        this.LL.LJIIIIZZ(value);
        if (SmbLiveKickstarterSetting.INSTANCE.isEnabled()) {
            BoardsDisplayViewModel viewModel = this.LL.getViewModel();
            viewModel.getClass();
            LastUsedLiveBoardsModel lastUsedLiveBoardsModelLIZIZ = C0KPJ.pf.LIZIZ();
            long j = lastUsedLiveBoardsModelLIZIZ.boardId;
            if ((!lastUsedLiveBoardsModelLIZIZ.needRestore || j == 0 || j == viewModel.LLIZLLLIL) && (dataChannel = this.LL.getDataChannel()) != null) {
                dataChannel.LC0(PreviewBoardRenderDoneEvent.class, Boolean.TRUE);
            }
        }
        return Unit.LIZ;
    }
}
