package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageSelectorAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xRT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819250xRT extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ LiveBoardsPageSelectorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819250xRT(LiveBoardsPageSelectorAssem liveBoardsPageSelectorAssem) {
        super(1);
        this.LL = liveBoardsPageSelectorAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        AssemVMLazy assemVMLazy = this.LL.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveBoardsPageSelectorAssem.LLJILLL;
        ((LiveBoardsPageViewModel) assemVMLazy.getValue()).vQ2(EnumC1815680xLi.GENERAL);
        return Unit.LIZ;
    }
}
