package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem.vm.FullyCustomizedBoardTextColorViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01DL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01DL extends C09AY implements Function1<C01D5, Unit> {
    public final /* synthetic */ FullyCustomizedBoardTextColorViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01DL(FullyCustomizedBoardTextColorViewModel fullyCustomizedBoardTextColorViewModel) {
        super(1);
        this.LL = fullyCustomizedBoardTextColorViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C01D5 c01d5) {
        String str;
        C01DP c01dpWQ2 = this.LL.wQ2();
        final C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_board_edit_alignment_click");
        C01DR c01dr = c01dpWQ2.LLILZIL;
        int i = c01dpWQ2.LLILLL;
        int i2 = c01d5.LLILZ;
        Map<String, Object> mapLIZ = c01dr.LIZ(i);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    str = "?";
                } else {
                    str = "right";
                }
            } else {
                str = "center";
            }
        } else {
            str = "left";
        }
        ((LinkedHashMap) C2097608Jq.LJIIL(mapLIZ, C2097908Jt.LIZJ(new Pair("alignment", str)))).forEach(new BiConsumer() { // from class: X.01DM
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                c474500IjALIZ.LJJII(obj2, (String) obj);
            }
        });
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
