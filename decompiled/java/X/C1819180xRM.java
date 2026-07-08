package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageMultiGuestContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819180xRM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LiveBoardsPageMultiGuestContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819180xRM(LiveBoardsPageMultiGuestContentAssem liveBoardsPageMultiGuestContentAssem) {
        super(0);
        this.LL = liveBoardsPageMultiGuestContentAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.Go().setState(new C1816110xMP());
        return Unit.LIZ;
    }
}
