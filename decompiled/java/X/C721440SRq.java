package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ui.view.AdvancedStopAtOffsetAppBarBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721440SRq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C721460SRs LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C721440SRq(C721460SRs c721460SRs, int i, boolean z) {
        super(0);
        this.LL = c721460SRs;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinearLayoutManager linearLayoutManager;
        AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehaviorLIZ;
        AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehaviorLIZ2 = this.LL.LIZ();
        if (advancedStopAtOffsetAppBarBehaviorLIZ2 != null) {
            C721460SRs c721460SRs = this.LL;
            C1337800kuw c1337800kuw = c721460SRs.LIZ;
            C16GX c16gx = c721460SRs.LIZIZ;
            int iLIZJ = AdvancedStopAtOffsetAppBarBehavior.LIZJ(c16gx, this.LLILLJJLI);
            if (advancedStopAtOffsetAppBarBehaviorLIZ2.getTopAndBottomOffset() != iLIZJ) {
                advancedStopAtOffsetAppBarBehaviorLIZ2.getTopAndBottomOffset();
                advancedStopAtOffsetAppBarBehaviorLIZ2.setTopAndBottomOffset(iLIZJ);
                c1337800kuw.LIZLLL(c16gx);
                c16gx.invalidate();
            }
        }
        if (this.LLILLL && (advancedStopAtOffsetAppBarBehaviorLIZ = this.LL.LIZ()) != null) {
            advancedStopAtOffsetAppBarBehaviorLIZ.LJII(this.LLILLJJLI);
        }
        AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehaviorLIZ3 = this.LL.LIZ();
        if (advancedStopAtOffsetAppBarBehaviorLIZ3 != null) {
            advancedStopAtOffsetAppBarBehaviorLIZ3.LJIIZILJ = false;
            advancedStopAtOffsetAppBarBehaviorLIZ3.LJIJ = true;
        }
        RecyclerView.LayoutManager layoutManager = this.LL.LIZJ.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
        }
        C0SS5 c0ss5 = this.LL.LJ;
        if (c0ss5 != null) {
            c0ss5.LJI();
        }
        return Unit.LIZ;
    }
}
