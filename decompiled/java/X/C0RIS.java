package X;

import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.biz.BizBottomAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RIS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RIS extends C09AY implements Function0<RootCellCommonAbility> {
    public final /* synthetic */ BizBottomAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RIS(BizBottomAreaComponent bizBottomAreaComponent) {
        super(0);
        this.LL = bizBottomAreaComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final RootCellCommonAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), RootCellCommonAbility.class, null);
    }
}
