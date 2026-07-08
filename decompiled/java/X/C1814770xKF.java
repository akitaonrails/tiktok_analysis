package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xKF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814770xKF extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ LiveBoardsPageDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814770xKF(LiveBoardsPageDialogFragment liveBoardsPageDialogFragment) {
        super(1);
        this.LL = liveBoardsPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.PR(bool.booleanValue());
        return Unit.LIZ;
    }
}
