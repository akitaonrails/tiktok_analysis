package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01QK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01QK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ LiveBoardsWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01QK(boolean z, LiveBoardsWidget liveBoardsWidget) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = liveBoardsWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL) {
            C766270U4b.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLILLJJLI.contentView.getContext(), C497740JfY.LJIJI(2131851417));
        } else {
            C766270U4b.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLILLJJLI.contentView.getContext(), C497740JfY.LJIJI(2131851418));
        }
        return Unit.LIZ;
    }
}
