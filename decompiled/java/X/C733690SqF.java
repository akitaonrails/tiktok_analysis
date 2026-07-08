package X;

import com.ss.android.ugc.feed.platform.cell.clean.CellCleanComponent;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733690SqF extends C09AY implements Function0<IPlayButtonAbility> {
    public final /* synthetic */ CellCleanComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733690SqF(CellCleanComponent cellCleanComponent) {
        super(0);
        this.LL = cellCleanComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IPlayButtonAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IPlayButtonAbility.class, null);
    }
}
