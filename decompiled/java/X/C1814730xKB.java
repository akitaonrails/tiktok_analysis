package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xKB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814730xKB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LiveBoardsPageDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814730xKB(LiveBoardsPageDialogFragment liveBoardsPageDialogFragment) {
        super(0);
        this.LL = liveBoardsPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveBoardsPageViewModel liveBoardsPageViewModelNR = this.LL.NR();
        C1814370xJb c1814370xJb = liveBoardsPageViewModelNR.LLIZLLLIL;
        if (c1814370xJb != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveBoardsPageViewModelNR), C0PEM.LIZJ, null, new C1814580xJw(c1814370xJb, liveBoardsPageViewModelNR, null), 2);
        }
        return Unit.LIZ;
    }
}
