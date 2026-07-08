package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.bottom.font.CustomizedBoardTextFontSelectAreaAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditFontViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xPL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817930xPL extends C09AY implements Function1<C1817980xPQ, Unit> {
    public final /* synthetic */ CustomizedBoardTextFontSelectAreaAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817930xPL(CustomizedBoardTextFontSelectAreaAssem customizedBoardTextFontSelectAreaAssem) {
        super(1);
        this.LL = customizedBoardTextFontSelectAreaAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1817980xPQ c1817980xPQ) {
        this.LL.Go().xQ2(0);
        FullyCustomizedBoardEditFontViewModel fullyCustomizedBoardEditFontViewModelGo = this.LL.Go();
        fullyCustomizedBoardEditFontViewModelGo.withState(new C1817940xPM(fullyCustomizedBoardEditFontViewModelGo));
        return Unit.LIZ;
    }
}
