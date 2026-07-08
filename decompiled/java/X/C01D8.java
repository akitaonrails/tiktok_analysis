package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01D8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01D8 extends C09AY implements Function1<C01D5, Unit> {
    public final /* synthetic */ FullyCustomizedBoardTextColorViewModel LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01D8(FullyCustomizedBoardTextColorViewModel fullyCustomizedBoardTextColorViewModel, int i) {
        super(1);
        this.LL = fullyCustomizedBoardTextColorViewModel;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C01D5 c01d5) {
        this.LL.setState(new C01D7(c01d5, this.LLILLJJLI));
        return Unit.LIZ;
    }
}
