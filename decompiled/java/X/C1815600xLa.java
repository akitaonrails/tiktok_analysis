package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.IntelligentBoardTemplateForYouSheet;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815600xLa extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ IntelligentBoardTemplateForYouSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815600xLa(IntelligentBoardTemplateForYouSheet intelligentBoardTemplateForYouSheet) {
        super(1);
        this.LL = intelligentBoardTemplateForYouSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            IntelligentBoardTemplateForYouSheet intelligentBoardTemplateForYouSheet = this.LL;
            intelligentBoardTemplateForYouSheet.LLLFFI = false;
            intelligentBoardTemplateForYouSheet.close(1);
        } else {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_rec_template_exceed_limit_toast");
            c474500IjALIZ.LJJII(this.LL.LLJZIJLIL, "board_entrance");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }
}
