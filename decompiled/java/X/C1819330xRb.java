package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.LiveBoardsPageTitleBarAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819330xRb extends C09AY implements Function2<UIAssem, C627660Ojc<InterfaceC1891350zJl>, Unit> {
    public final /* synthetic */ LiveBoardsPageTitleBarAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819330xRb(LiveBoardsPageTitleBarAssem liveBoardsPageTitleBarAssem, View view) {
        super(2);
        this.LL = liveBoardsPageTitleBarAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        List<InterfaceC1891350zJl> list;
        C627660Ojc<InterfaceC1891350zJl> c627660Ojc2 = c627660Ojc;
        if ((c627660Ojc2.LL instanceof C1623606Xi) && (list = c627660Ojc2.LLILZ) != null && list.isEmpty()) {
            LiveBoardsPageViewModel liveBoardsPageViewModelHo = this.LL.Ho();
            Context context = this.LLILLJJLI.getContext();
            if (!Intrinsics.LJFF(liveBoardsPageViewModelHo.zQ2().LL, "notification")) {
                liveBoardsPageViewModelHo.xQ2(context);
            }
        }
        return Unit.LIZ;
    }
}
