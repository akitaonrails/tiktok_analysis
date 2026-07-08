package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditPageViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.title.CustomizedBoardTitleDoneAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818080xPa extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ CustomizedBoardTitleDoneAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818080xPa(CustomizedBoardTitleDoneAssem customizedBoardTitleDoneAssem) {
        super(2);
        this.LL = customizedBoardTitleDoneAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        Boolean boolLIZ = c291001Au.LIZ();
        if (boolLIZ != null) {
            CustomizedBoardTitleDoneAssem customizedBoardTitleDoneAssem = this.LL;
            boolLIZ.booleanValue();
            AssemVMLazy assemVMLazy = customizedBoardTitleDoneAssem.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CustomizedBoardTitleDoneAssem.LLJJIII;
            ((FullyCustomizedBoardEditPageViewModel) assemVMLazy.getValue()).yQ2(true);
        }
        return Unit.LIZ;
    }
}
