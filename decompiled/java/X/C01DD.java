package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01DD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DD extends C09AY implements Function1<C01D5, Unit> {
    public final /* synthetic */ FullyCustomizedBoardTextColorViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01DD(FullyCustomizedBoardTextColorViewModel fullyCustomizedBoardTextColorViewModel) {
        super(1);
        this.LL = fullyCustomizedBoardTextColorViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C01D5 c01d5) {
        int i = c01d5.LLILZ;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 0;
            } else {
                i2 = 2;
            }
        }
        this.LL.setState(new C01DE(i2));
        return Unit.LIZ;
    }
}
