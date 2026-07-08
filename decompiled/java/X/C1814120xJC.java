package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.LiveIntelligentBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814120xJC extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ LiveIntelligentBoardUpsertViewModel LL;
    public final /* synthetic */ Board LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814120xJC(LiveIntelligentBoardUpsertViewModel liveIntelligentBoardUpsertViewModel, Board board, Bitmap bitmap, int i) {
        super(1);
        this.LL = liveIntelligentBoardUpsertViewModel;
        this.LLILLJJLI = board;
        this.LLILLL = bitmap;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        this.LL.setState(new C1814110xJB(this.LLILLJJLI, this.LLILLL, this.LLILZ));
        return Unit.LIZ;
    }
}
