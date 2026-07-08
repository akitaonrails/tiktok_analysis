package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageSelectorAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xRN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819190xRN extends C09AY implements Function2<UIAssem, EnumC1815680xLi, Unit> {
    public final /* synthetic */ LiveBoardsPageSelectorAssem LL;
    public final /* synthetic */ TextView LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ TextView LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819190xRN(LiveBoardsPageSelectorAssem liveBoardsPageSelectorAssem, TextView textView, View view, TextView textView2) {
        super(2);
        this.LL = liveBoardsPageSelectorAssem;
        this.LLILLJJLI = textView;
        this.LLILLL = view;
        this.LLILZ = textView2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, EnumC1815680xLi enumC1815680xLi) {
        int i = C1819210xRP.LIZ[enumC1815680xLi.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LiveBoardsPageSelectorAssem liveBoardsPageSelectorAssem = this.LL;
                TextView textView = this.LLILLJJLI;
                Context context = this.LLILLL.getContext();
                liveBoardsPageSelectorAssem.getClass();
                LiveBoardsPageSelectorAssem.Go(context, textView, false);
                LiveBoardsPageSelectorAssem liveBoardsPageSelectorAssem2 = this.LL;
                TextView textView2 = this.LLILZ;
                Context context2 = this.LLILLL.getContext();
                liveBoardsPageSelectorAssem2.getClass();
                LiveBoardsPageSelectorAssem.Go(context2, textView2, true);
                C0KPJ.jf.LJFF(2);
                LiveBoardsPageSelectorAssem liveBoardsPageSelectorAssem3 = this.LL;
                if (!liveBoardsPageSelectorAssem3.LLJI) {
                    liveBoardsPageSelectorAssem3.LLJI = true;
                    ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).BT1(EnumC937290aUx.BOARD, RedDotExtensionKt.LJIILLIIL(C0UX6.MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE), EnumC919090a1b.CLICK, false);
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            LiveBoardsPageSelectorAssem liveBoardsPageSelectorAssem4 = this.LL;
            TextView textView3 = this.LLILLJJLI;
            Context context3 = this.LLILLL.getContext();
            liveBoardsPageSelectorAssem4.getClass();
            LiveBoardsPageSelectorAssem.Go(context3, textView3, true);
            LiveBoardsPageSelectorAssem liveBoardsPageSelectorAssem5 = this.LL;
            TextView textView4 = this.LLILZ;
            Context context4 = this.LLILLL.getContext();
            liveBoardsPageSelectorAssem5.getClass();
            LiveBoardsPageSelectorAssem.Go(context4, textView4, false);
            C0KPJ.jf.LJFF(1);
        }
        return Unit.LIZ;
    }
}
