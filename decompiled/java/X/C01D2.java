package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneViewModel;
import com.bytedance.android.livesdk.model.BoardItemStyle;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01D2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01D2 extends C09AY implements Function1<C01D5, Unit> {
    public final /* synthetic */ CustomizedBoardTitleDoneAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01D2(CustomizedBoardTitleDoneAssem customizedBoardTitleDoneAssem) {
        super(1);
        this.LL = customizedBoardTitleDoneAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C01D5 c01d5) {
        AssemVMLazy assemVMLazy = this.LL.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CustomizedBoardTitleDoneAssem.LLJJIII;
        FullyCustomizedBoardTextColorViewModel fullyCustomizedBoardTextColorViewModel = (FullyCustomizedBoardTextColorViewModel) assemVMLazy.getValue();
        C01D5 state = fullyCustomizedBoardTextColorViewModel.getState();
        BoardItemStyle boardItemStyle = fullyCustomizedBoardTextColorViewModel.wQ2().LL.style;
        if (boardItemStyle != null) {
            boardItemStyle.alignment = state.LLILZ;
            boardItemStyle.styleType = state.LLILLL;
            String strLJI = C202500qF.LJI(state.LLILLJJLI);
            if (strLJI != null) {
                boardItemStyle.colorTheme = strLJI;
            }
        }
        CustomizedBoardTitleDoneViewModel customizedBoardTitleDoneViewModelJo = this.LL.Jo();
        customizedBoardTitleDoneViewModelJo.withState(new C1817360xOQ(customizedBoardTitleDoneViewModelJo));
        return Unit.LIZ;
    }
}
