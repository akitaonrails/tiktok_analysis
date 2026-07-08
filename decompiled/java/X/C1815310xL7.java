package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.vm.IntelligentBoardTemplatePreviewViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xL7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815310xL7 extends C09AY implements Function2<UIAssem, List<InterfaceC1891350zJl>, Unit> {
    public final /* synthetic */ LiveBoardsPageContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815310xL7(LiveBoardsPageContentAssem liveBoardsPageContentAssem) {
        super(2);
        this.LL = liveBoardsPageContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, List<InterfaceC1891350zJl> list) {
        if (!list.isEmpty()) {
            IntelligentBoardTemplatePreviewViewModel intelligentBoardTemplatePreviewViewModelLo = this.LL.Lo();
            if (!intelligentBoardTemplatePreviewViewModelLo.LLILZIL) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_rec_template_module");
                c474500IjALIZ.LJJII(intelligentBoardTemplatePreviewViewModelLo.vQ2().LL, "board_entrance");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                c474500IjALIZ.LJJII(intelligentBoardTemplatePreviewViewModelLo.vQ2().LLILZ, "room_id");
                c474500IjALIZ.LJJII("show", "action_type");
                c474500IjALIZ.LIZ();
                intelligentBoardTemplatePreviewViewModelLo.LLILZIL = true;
            }
        }
        return Unit.LIZ;
    }
}
