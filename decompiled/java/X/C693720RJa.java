package X;

import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS26S0001000_11;

/* JADX INFO: renamed from: X.0RJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693720RJa extends C09AY implements Function1<C0RJW, Unit> {
    public final /* synthetic */ ConstraintSizeVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693720RJa(ConstraintSizeVM constraintSizeVM) {
        super(1);
        this.LL = constraintSizeVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RJW c0rjw) {
        int i = C1DDC.LLILZLL.LJFF;
        if (c0rjw.LL != i) {
            this.LL.setState(new AwS26S0001000_11(i, 3));
        }
        return Unit.LIZ;
    }
}
