package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xKT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814910xKT extends C09AY implements Function1<C1817550xOj, Unit> {
    public final /* synthetic */ BoardsDisplayView LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814910xKT(BoardsDisplayView boardsDisplayView) {
        super(1);
        this.LL = boardsDisplayView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1817550xOj c1817550xOj) {
        String str;
        HashMap<String, String> map;
        C1817550xOj c1817550xOj2 = c1817550xOj;
        BoardsDisplayViewModel viewModel = this.LL.getViewModel();
        if (c1817550xOj2 == null || (map = c1817550xOj2.LIZ) == null || (str = map.get("decoration_entrance")) == null) {
            str = "live_take_page";
        }
        viewModel.LLILZIL = str;
        return Unit.LIZ;
    }
}
