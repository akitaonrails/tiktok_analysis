package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815710xLl extends C09AY implements Function2<C03H5, EnumC1815680xLi, Unit> {
    public final /* synthetic */ LiveBoardsPageDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815710xLl(LiveBoardsPageDialogFragment liveBoardsPageDialogFragment) {
        super(2);
        this.LL = liveBoardsPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, EnumC1815680xLi enumC1815680xLi) {
        if (enumC1815680xLi == EnumC1815680xLi.MULTI_GUEST) {
            this.LL.OR();
        }
        return Unit.LIZ;
    }
}
