package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01DK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DK extends C09AY implements Function1<C01D5, Unit> {
    public final /* synthetic */ FullyCustomizedBoardTextColorViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01DK(FullyCustomizedBoardTextColorViewModel fullyCustomizedBoardTextColorViewModel) {
        super(1);
        this.LL = fullyCustomizedBoardTextColorViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C01D5 c01d5) {
        C01D5 c01d52 = c01d5;
        C01DP c01dpWQ2 = this.LL.wQ2();
        if (c01dpWQ2.LL.style != null) {
            final C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_edit_color_click");
            C01DR c01dr = c01dpWQ2.LLILZIL;
            int i = c01dpWQ2.LLILLL;
            String strLJI = C202500qF.LJI(c01d52.LLILLJJLI);
            if (strLJI == null) {
                strLJI = "";
            }
            ((LinkedHashMap) C2097608Jq.LJIIL(c01dr.LIZ(i), C2097908Jt.LIZJ(new Pair("color", strLJI)))).forEach(new BiConsumer() { // from class: X.01DN
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    c474500IjALIZ.LJJII(obj2, (String) obj);
                }
            });
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }
}
