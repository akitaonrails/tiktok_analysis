package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageMultiGuestContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819160xRK extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ LiveBoardsPageMultiGuestContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819160xRK(LiveBoardsPageMultiGuestContentAssem liveBoardsPageMultiGuestContentAssem) {
        super(1);
        this.LL = liveBoardsPageMultiGuestContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.Go().setState(new C1815170xKt(bool.booleanValue()));
        return Unit.LIZ;
    }
}
