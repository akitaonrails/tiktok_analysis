package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontDescriptionColorAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01DG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DG extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ CustomizedBoardTextFontDescriptionColorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01DG(CustomizedBoardTextFontDescriptionColorAssem customizedBoardTextFontDescriptionColorAssem) {
        super(1);
        this.LL = customizedBoardTextFontDescriptionColorAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        AssemVMLazy assemVMLazy = this.LL.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CustomizedBoardTextFontDescriptionColorAssem.LLJI;
        FullyCustomizedBoardTextColorViewModel fullyCustomizedBoardTextColorViewModel = (FullyCustomizedBoardTextColorViewModel) assemVMLazy.getValue();
        if (fullyCustomizedBoardTextColorViewModel.wQ2().LIZ()) {
            fullyCustomizedBoardTextColorViewModel.withState(new C01D8(fullyCustomizedBoardTextColorViewModel, iIntValue));
        } else {
            fullyCustomizedBoardTextColorViewModel.setState(new C01DF(iIntValue));
        }
        if (!fullyCustomizedBoardTextColorViewModel.LLILLJJLI) {
            fullyCustomizedBoardTextColorViewModel.LLILLJJLI = true;
        } else {
            fullyCustomizedBoardTextColorViewModel.withState(new C01DK(fullyCustomizedBoardTextColorViewModel));
        }
        return Unit.LIZ;
    }
}
