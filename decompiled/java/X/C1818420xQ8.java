package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.operationbtm.SceneryBtmOperationAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xQ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818420xQ8 extends C09AY implements Function2<UIAssem, EnumC1818710xQb, Unit> {
    public final /* synthetic */ SceneryBtmOperationAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818420xQ8(SceneryBtmOperationAssem sceneryBtmOperationAssem) {
        super(2);
        this.LL = sceneryBtmOperationAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, EnumC1818710xQb enumC1818710xQb) {
        InterfaceC1814530xJr boardsDisplayStateManager;
        EnumC1818710xQb enumC1818710xQb2 = enumC1818710xQb;
        AssemVMLazy assemVMLazy = this.LL.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SceneryBtmOperationAssem.LLJJ;
        SceneryApplyViewModel sceneryApplyViewModel = (SceneryApplyViewModel) assemVMLazy.getValue();
        if (enumC1818710xQb2 != null) {
            int i = C1818700xQa.LIZ[enumC1818710xQb2.ordinal()];
            if (i != 1) {
                if (i == 2 && (boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager()) != null) {
                    boardsDisplayStateManager.LJIIJ(new C1815520xLS(null), null);
                }
            } else {
                sceneryApplyViewModel.wQ2();
            }
        }
        return Unit.LIZ;
    }
}
