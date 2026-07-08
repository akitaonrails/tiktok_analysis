package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.vm.IntelligentBoardTemplatePreviewViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.IntelligentBoardTemplateForYouSheet;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xLW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815560xLW extends C09AY implements Function1<InterfaceC497601wk, Unit> {
    public final /* synthetic */ C00IK LL;
    public final /* synthetic */ InterfaceC1891350zJl LLILLJJLI;
    public final /* synthetic */ IntelligentBoardTemplatePreviewViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815560xLW(C00IK c00ik, InterfaceC1891350zJl interfaceC1891350zJl, IntelligentBoardTemplatePreviewViewModel intelligentBoardTemplatePreviewViewModel) {
        super(1);
        this.LL = c00ik;
        this.LLILLJJLI = interfaceC1891350zJl;
        this.LLILLL = intelligentBoardTemplatePreviewViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC497601wk interfaceC497601wk) {
        long jIndexOf;
        RecommendBoardInfo recommendBoardInfo;
        FragmentManager fragmentManager;
        if (this.LL.LL.contains(this.LLILLJJLI)) {
            long j = 0;
            if (this.LL.LL.indexOf(this.LLILLJJLI) > 0) {
                jIndexOf = this.LL.LL.indexOf(this.LLILLJJLI) - 1;
            } else {
                jIndexOf = 0;
            }
            DataChannel dataChannel = this.LLILLL.LL;
            Board board = null;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                IntelligentBoardTemplatePreviewViewModel intelligentBoardTemplatePreviewViewModel = this.LLILLL;
                C1815580xLY c1815580xLY = IntelligentBoardTemplateForYouSheet.LLLII;
                String str = intelligentBoardTemplatePreviewViewModel.vQ2().LL;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = intelligentBoardTemplatePreviewViewModel.vQ2().LLILZ;
                if (str3 != null) {
                    str2 = str3;
                }
                DataChannel dataChannel2 = intelligentBoardTemplatePreviewViewModel.LL;
                long j2 = (intelligentBoardTemplatePreviewViewModel.LLIZ - ((long) 3)) + jIndexOf;
                c1815580xLY.getClass();
                IntelligentBoardTemplateForYouSheet intelligentBoardTemplateForYouSheet = new IntelligentBoardTemplateForYouSheet();
                intelligentBoardTemplateForYouSheet.LLJZIJLIL = str;
                intelligentBoardTemplateForYouSheet.LLL = str2;
                intelligentBoardTemplateForYouSheet.LLLF = dataChannel2;
                intelligentBoardTemplateForYouSheet.LLLFF = j2;
                C19322110iZ.LJFF(fragmentManager, intelligentBoardTemplateForYouSheet, "IntelligentBoardTemplateForYouSheet", null, 0);
            }
            IntelligentBoardTemplatePreviewViewModel intelligentBoardTemplatePreviewViewModel2 = this.LLILLL;
            InterfaceC1891350zJl interfaceC1891350zJl = this.LLILLJJLI;
            intelligentBoardTemplatePreviewViewModel2.getClass();
            if (interfaceC1891350zJl instanceof C1157010gDL) {
                board = ((C1157010gDL) interfaceC1891350zJl).LL;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_rec_template_module");
            c474500IjALIZ.LJJII(intelligentBoardTemplatePreviewViewModel2.vQ2().LL, "board_entrance");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(intelligentBoardTemplatePreviewViewModel2.vQ2().LLILZ, "room_id");
            c474500IjALIZ.LJJII("click", "action_type");
            if (board != null && (recommendBoardInfo = board.recommendBoardInfo) != null) {
                j = recommendBoardInfo.recommendBoardId;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j), "clicked_rec_template_id");
            c474500IjALIZ.LJJII(Long.valueOf(jIndexOf), "clicked_rec_template_index");
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }
}
