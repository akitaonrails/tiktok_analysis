package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.SceneryLayoutSelectorAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818240xPq extends C09AY implements Function2<UIAssem, Integer, Unit> {
    public final /* synthetic */ SceneryLayoutSelectorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818240xPq(SceneryLayoutSelectorAssem sceneryLayoutSelectorAssem) {
        super(2);
        this.LL = sceneryLayoutSelectorAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Integer num) {
        int iIntValue = num.intValue();
        AssemVMLazy assemVMLazy = this.LL.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SceneryLayoutSelectorAssem.LLJJJJLIIL;
        SceneryApplyViewModel sceneryApplyViewModel = (SceneryApplyViewModel) assemVMLazy.getValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 3) {
                sceneryApplyViewModel.wQ2();
            }
        } else {
            InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
            if (boardsDisplayStateManager != null) {
                boardsDisplayStateManager.LJIIJ(new C1815520xLS(null), null);
            }
        }
        return Unit.LIZ;
    }
}
