package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardEditFontViewModel;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817940xPM extends C09AY implements Function1<C0O2V, Unit> {
    public final /* synthetic */ FullyCustomizedBoardEditFontViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817940xPM(FullyCustomizedBoardEditFontViewModel fullyCustomizedBoardEditFontViewModel) {
        super(1);
        this.LL = fullyCustomizedBoardEditFontViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0O2V c0o2v) {
        C01DP c01dp = (C01DP) this.LL.LLILLJJLI.getValue();
        FullyCustomizedBoardEditFontViewModel fullyCustomizedBoardEditFontViewModel = this.LL;
        final C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_edit_font_click");
        ((LinkedHashMap) C2097608Jq.LJIIL(c01dp.LLILZIL.LIZ(c01dp.LLILLL), C2097908Jt.LIZJ(new Pair("font", fullyCustomizedBoardEditFontViewModel.vQ2())))).forEach(new BiConsumer() { // from class: X.0xPO
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                c474500IjALIZ.LJJII(obj2, (String) obj);
            }
        });
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
