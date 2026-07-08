package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.SceneryApplyViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.SceneryLayoutSelectorAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.typechunk.SceneryLayoutTypeViewModel;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xQ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818410xQ7 extends C09AY implements Function2<UIAssem, C291001Au<? extends Bitmap>, Unit> {
    public final /* synthetic */ SceneryLayoutSelectorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818410xQ7(SceneryLayoutSelectorAssem sceneryLayoutSelectorAssem) {
        super(2);
        this.LL = sceneryLayoutSelectorAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Bitmap> c291001Au) {
        InterfaceC1814530xJr boardsDisplayStateManager;
        if (c291001Au.LIZ != 0) {
            SceneryLayoutSelectorAssem sceneryLayoutSelectorAssem = this.LL;
            AssemVMLazy assemVMLazy = sceneryLayoutSelectorAssem.LLJJIJIIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SceneryLayoutSelectorAssem.LLJJJJLIIL;
            SceneryLayoutTypeViewModel sceneryLayoutTypeViewModel = (SceneryLayoutTypeViewModel) assemVMLazy.getValue();
            if (((C1735840vGw) sceneryLayoutTypeViewModel.getState()).LLILLJJLI == 0) {
                sceneryLayoutTypeViewModel.withState(new C1818460xQC(sceneryLayoutTypeViewModel, 1));
            }
            SceneryApplyViewModel sceneryApplyViewModel = (SceneryApplyViewModel) sceneryLayoutSelectorAssem.LLJJJ.getValue();
            EnumC1818710xQb enumC1818710xQbEy0 = sceneryApplyViewModel.LLILZ.ey0();
            if (enumC1818710xQbEy0 != null) {
                int i = C1818700xQa.LIZ[enumC1818710xQbEy0.ordinal()];
                if (i != 1) {
                    if (i == 2 && (boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager()) != null) {
                        boardsDisplayStateManager.LJIIJ(new C1815520xLS(null), null);
                    }
                } else {
                    sceneryApplyViewModel.wQ2();
                }
            }
        }
        return Unit.LIZ;
    }
}
