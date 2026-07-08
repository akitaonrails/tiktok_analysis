package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.FullyCustomizedBoardItemEditContainerDialog;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xP0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817720xP0 extends C09AY implements Function1<Pair<? extends Object, ? extends Boolean>, Unit> {
    public final /* synthetic */ FullyCustomizedBoardItemEditContainerDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817720xP0(FullyCustomizedBoardItemEditContainerDialog fullyCustomizedBoardItemEditContainerDialog) {
        super(1);
        this.LL = fullyCustomizedBoardItemEditContainerDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Object, ? extends Boolean> pair) {
        Pair<? extends Object, ? extends Boolean> pair2 = pair;
        Object first = pair2.getFirst();
        pair2.getSecond().booleanValue();
        if (first instanceof C1814370xJb) {
            this.LL.dismiss();
        }
        return Unit.LIZ;
    }
}
