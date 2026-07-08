package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815060xKi extends C09AY implements Function1<C1815950xM9, Unit> {
    public final /* synthetic */ LiveBoardsPageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815060xKi(LiveBoardsPageViewModel liveBoardsPageViewModel) {
        super(1);
        this.LL = liveBoardsPageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1815950xM9 c1815950xM9) {
        String strValueOf;
        C1815950xM9 c1815950xM92 = c1815950xM9;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_my_decoration_create_btn_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(this.LL.zQ2().LLILZ, "room_id");
        c474500IjALIZ.LJJII(this.LL.zQ2().LL, "decoration_entrance");
        if (c1815950xM92.LLILLL == 0) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            strValueOf = String.valueOf(this.LL.AQ2());
        }
        c474500IjALIZ.LJJII(strValueOf, "board_sets_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(c1815950xM92.LLILZIL), "board_sets_approved_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(c1815950xM92.LLILZLL), "board_sets_rejected_cnt");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
