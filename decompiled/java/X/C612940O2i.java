package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612940O2i extends C09AY implements Function2<C03H5, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ LiveBoardsPageDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612940O2i(LiveBoardsPageDialogFragment liveBoardsPageDialogFragment) {
        super(2);
        this.LL = liveBoardsPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Boolean> c291001Au) {
        if (Intrinsics.LJFF(c291001Au.LIZ(), Boolean.TRUE)) {
            this.LL.dismiss();
        }
        return Unit.LIZ;
    }
}
