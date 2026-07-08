package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageMultiGuestContentAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xRJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819150xRJ extends C09AY implements Function2<UIAssem, EnumC1815680xLi, Unit> {
    public final /* synthetic */ RecyclerView LL;
    public final /* synthetic */ LiveBoardsPageMultiGuestContentAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819150xRJ(RecyclerView recyclerView, LiveBoardsPageMultiGuestContentAssem liveBoardsPageMultiGuestContentAssem) {
        super(2);
        this.LL = recyclerView;
        this.LLILLJJLI = liveBoardsPageMultiGuestContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, EnumC1815680xLi enumC1815680xLi) {
        int i = C1819140xRI.LIZ[enumC1815680xLi.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C12ES.LJIILL(0, this.LL);
                LiveBoardsPageMultiGuestContentAssem liveBoardsPageMultiGuestContentAssem = this.LLILLJJLI;
                if (!liveBoardsPageMultiGuestContentAssem.LLJIJIL) {
                    liveBoardsPageMultiGuestContentAssem.LLJIJIL = true;
                    ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).pO();
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            C439101nJ.LJI(this.LL);
        }
        return Unit.LIZ;
    }
}
