package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.CustomizedBoardKeyboardPlaceHolderAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cAC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001300cAC extends C09AY implements Function2<UIAssem, C291001Au<? extends Pair<? extends Boolean, ? extends Integer>>, Unit> {
    public final /* synthetic */ CustomizedBoardKeyboardPlaceHolderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001300cAC(CustomizedBoardKeyboardPlaceHolderAssem customizedBoardKeyboardPlaceHolderAssem) {
        super(2);
        this.LL = customizedBoardKeyboardPlaceHolderAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Pair<? extends Boolean, ? extends Integer>> c291001Au) {
        Pair<? extends Boolean, ? extends Integer> pairLIZ = c291001Au.LIZ();
        if (pairLIZ != null) {
            CustomizedBoardKeyboardPlaceHolderAssem customizedBoardKeyboardPlaceHolderAssem = this.LL;
            boolean zBooleanValue = pairLIZ.getFirst().booleanValue();
            int iIntValue = pairLIZ.getSecond().intValue();
            if (zBooleanValue) {
                if (iIntValue > 0) {
                    customizedBoardKeyboardPlaceHolderAssem.LLJILJIL = iIntValue;
                }
                C500260Jjc.LJJZ(iIntValue, (View) customizedBoardKeyboardPlaceHolderAssem.LLJIJIL.getValue());
            } else {
                int iLIZIZ = customizedBoardKeyboardPlaceHolderAssem.LLJI;
                if (iLIZIZ <= 0) {
                    iLIZIZ = (int) C497740JfY.LIZIZ(80.0f);
                }
                C500260Jjc.LJJZ(iLIZIZ, (View) customizedBoardKeyboardPlaceHolderAssem.LLJIJIL.getValue());
            }
        }
        return Unit.LIZ;
    }
}
