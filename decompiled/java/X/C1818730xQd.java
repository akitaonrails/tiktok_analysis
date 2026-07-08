package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.viewmodel.SceneryModeOperationListViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.zoom.SceneryCropPictureAssem;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818730xQd extends C09AY implements Function2<UIAssem, EnumC1818710xQb, Unit> {
    public final /* synthetic */ SceneryCropPictureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818730xQd(SceneryCropPictureAssem sceneryCropPictureAssem) {
        super(2);
        this.LL = sceneryCropPictureAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, EnumC1818710xQb enumC1818710xQb) {
        int i = C1818720xQc.LIZ[enumC1818710xQb.ordinal()];
        if (i == 1 || i != 2) {
            C786410Ut5.LJLLLLLL(8, this.LL.getContentView());
        } else {
            AssemVMLazy assemVMLazy = this.LL.LLJZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SceneryCropPictureAssem.LLJZIJLIL;
            SceneryModeOperationListViewModel sceneryModeOperationListViewModel = (SceneryModeOperationListViewModel) assemVMLazy.getValue();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_scenery_crop_editing_page");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(((C1815530xLT) sceneryModeOperationListViewModel.LL.getValue()).LLILLL, "decoration_entrance");
            c474500IjALIZ.LJJII("show", "action_type");
            c474500IjALIZ.LIZ();
            C786410Ut5.LJLLLLLL(0, this.LL.getContentView());
        }
        return Unit.LIZ;
    }
}
