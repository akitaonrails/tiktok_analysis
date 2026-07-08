package X;

import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.FullyCustomizedBoardItemEditContainerDialog;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01XN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01XN extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ BoardItem LL;
    public final /* synthetic */ FullyCustomizedBoardItemEditContainerDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01XN(BoardItem boardItem, FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog) {
        super(1);
        this.LL = boardItem;
        this.LLILLJJLI = fullyCustomizedBoardItemEditContainerDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        C062P<InterfaceC111300bX> c062p2 = c062p;
        BoardItem boardItem = this.LL;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog = this.LLILLJJLI;
        int i = fullyCustomizedBoardItemEditContainerDialog.LLILLL;
        String str = fullyCustomizedBoardItemEditContainerDialog.LLILZ;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog2 = this.LLILLJJLI;
        c062p2.LIZ = new C01DP(boardItem, spannableStringBuilder, i, str, new C01DR(currentUserId, fullyCustomizedBoardItemEditContainerDialog2.LLILZ), fullyCustomizedBoardItemEditContainerDialog2.LLIZ, this.LL.editorMode, fullyCustomizedBoardItemEditContainerDialog2.LLJ, fullyCustomizedBoardItemEditContainerDialog2.LLJI);
        c062p2.LIZIZ = "FullCustomizedBoardHierarchyData";
        return Unit.LIZ;
    }
}
