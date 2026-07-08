package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.intelligent.vm.IntelligentBoardTemplatePreviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xLX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815570xLX extends C09AY implements Function1<C00IK, Unit> {
    public final /* synthetic */ IntelligentBoardTemplatePreviewViewModel LL;
    public final /* synthetic */ InterfaceC1891350zJl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815570xLX(IntelligentBoardTemplatePreviewViewModel intelligentBoardTemplatePreviewViewModel, C1157010gDL c1157010gDL) {
        super(1);
        this.LL = intelligentBoardTemplatePreviewViewModel;
        this.LLILLJJLI = c1157010gDL;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C00IK c00ik) {
        IntelligentBoardTemplatePreviewViewModel intelligentBoardTemplatePreviewViewModel = this.LL;
        intelligentBoardTemplatePreviewViewModel.runOnUIThread(new C1815560xLW(c00ik, this.LLILLJJLI, intelligentBoardTemplatePreviewViewModel));
        return Unit.LIZ;
    }
}
