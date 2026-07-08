package X;

import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693330RHn extends C09AY implements Function0<Long> {
    public final /* synthetic */ InteractRightAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693330RHn(InteractRightAreaComponent interactRightAreaComponent) {
        super(0);
        this.LL = interactRightAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return this.LL.jm().LJI.invoke();
    }
}
