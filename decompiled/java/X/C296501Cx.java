package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C296501Cx extends C09AY implements Function1<C01D5, Unit> {
    public final /* synthetic */ FullyCustomizedBoardTextColorViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C296501Cx(FullyCustomizedBoardTextColorViewModel fullyCustomizedBoardTextColorViewModel) {
        super(1);
        this.LL = fullyCustomizedBoardTextColorViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C01D5 c01d5) {
        this.LL.setState(new C01D4(c01d5));
        return Unit.LIZ;
    }
}
