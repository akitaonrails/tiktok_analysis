package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.IntelligentBoardSaveAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.LiveIntelligentBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814240xJO extends C09AY implements Function1<C443120HZe<? extends Board, ? extends Bitmap, ? extends Integer>, Unit> {
    public final /* synthetic */ IntelligentBoardSaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814240xJO(IntelligentBoardSaveAssem intelligentBoardSaveAssem) {
        super(1);
        this.LL = intelligentBoardSaveAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C443120HZe<? extends Board, ? extends Bitmap, ? extends Integer> c443120HZe) {
        InterfaceC1814530xJr boardsDisplayStateManager;
        C443120HZe<? extends Board, ? extends Bitmap, ? extends Integer> c443120HZe2 = c443120HZe;
        Board first = c443120HZe2.getFirst();
        Bitmap second = c443120HZe2.getSecond();
        int iIntValue = c443120HZe2.getThird().intValue();
        if (this.LL.getContext() != null) {
            LiveIntelligentBoardUpsertViewModel liveIntelligentBoardUpsertViewModelHo = this.LL.Ho();
            InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
            if (effectBoardService != null) {
                effectBoardService.LJ();
            }
            IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
            if (iEffectService != null && (boardsDisplayStateManager = iEffectService.getBoardsDisplayStateManager()) != null) {
                boardsDisplayStateManager.LIZIZ(first, new C1814120xJC(liveIntelligentBoardUpsertViewModelHo, first, second, iIntValue));
            }
        }
        return Unit.LIZ;
    }
}
