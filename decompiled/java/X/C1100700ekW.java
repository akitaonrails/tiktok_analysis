package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ekW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100700ekW extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ C1133380fbE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100700ekW(C1133380fbE c1133380fbE) {
        super(1);
        this.LL = c1133380fbE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        for (C1135030fdt c1135030fdt : ((LinkedHashMap) this.LL.LLIZLLLIL).values()) {
            ConstraintLayout constraintLayout = c1135030fdt.LLJ;
            if (constraintLayout != null) {
                float translationY = constraintLayout.getTranslationY();
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        ConstraintLayout constraintLayout2 = c1135030fdt.LLJ;
                        if (constraintLayout2 != null) {
                            C786410Ut5.ed(constraintLayout2, 0.0f);
                        }
                    } else {
                        ConstraintLayout constraintLayout3 = c1135030fdt.LLJ;
                        if (constraintLayout3 != null) {
                            C786410Ut5.ed(constraintLayout3, translationY - ((int) C497740JfY.LIZIZ(38.0f)));
                        }
                    }
                } else {
                    ConstraintLayout constraintLayout4 = c1135030fdt.LLJ;
                    if (constraintLayout4 != null) {
                        C786410Ut5.ed(constraintLayout4, translationY - ((int) C497740JfY.LIZIZ(72.0f)));
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
