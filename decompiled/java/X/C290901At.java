package X;

import android.view.View;
import com.bytedance.android.live.GetDecorationBoardBitmapEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.IntelligentBoardSaveAssem;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01At, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C290901At extends C09AY implements Function0<Unit> {
    public final /* synthetic */ IntelligentBoardSaveAssem LL;
    public final /* synthetic */ Board LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C290901At(IntelligentBoardSaveAssem intelligentBoardSaveAssem, Board board, int i) {
        super(0);
        this.LL = intelligentBoardSaveAssem;
        this.LLILLJJLI = board;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        View viewLJJIJL = this.LL.LJJIJL();
        final IntelligentBoardSaveAssem intelligentBoardSaveAssem = this.LL;
        final Board board = this.LLILLJJLI;
        final int i = this.LLILLL;
        HandlerHook.viewPostDelay(viewLJJIJL, new Runnable() { // from class: X.01Aw
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("IntelligentBoardSaveAssem@bc4f.completeDecorationToolUpsert$3$1");
                try {
                    IntelligentBoardSaveAssem intelligentBoardSaveAssem2 = intelligentBoardSaveAssem;
                    C291101Av c291101Av = new C291101Av(intelligentBoardSaveAssem2, board, i);
                    DataChannel dataChannel = intelligentBoardSaveAssem2.Go().LLILLJJLI;
                    if (dataChannel != null) {
                        dataChannel.LC0(GetDecorationBoardBitmapEvent.class, c291101Av);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("IntelligentBoardSaveAssem@bc4f.completeDecorationToolUpsert$3$1");
            }
        }, 500L);
        return Unit.LIZ;
    }
}
