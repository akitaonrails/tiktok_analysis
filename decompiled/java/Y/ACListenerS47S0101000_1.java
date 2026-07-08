package Y;

import X.C03AQ;
import X.C1074404Ic;
import X.C978603s8;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class ACListenerS47S0101000_1 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS47S0101000_1 aCListenerS47S0101000_1, View view) {
        Function2<? super Integer, ? super ReviewFilterStruct, Unit> function2 = ((C1074404Ic) aCListenerS47S0101000_1.l0).LLILLJJLI;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(aCListenerS47S0101000_1.i1), view.getTag());
        }
    }

    public static final void onClick$1(ACListenerS47S0101000_1 aCListenerS47S0101000_1, View view) {
        C978603s8 c978603s8 = (C978603s8) aCListenerS47S0101000_1.l0;
        int i = c978603s8.LLILLJJLI;
        int i2 = aCListenerS47S0101000_1.i1;
        if (i != i2) {
            c978603s8.setSelectedIndex(i2);
            Function1<? super Integer, Unit> function1 = ((C978603s8) aCListenerS47S0101000_1.l0).LL;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(aCListenerS47S0101000_1.i1));
            }
        }
    }

    public static final void onClick$2(ACListenerS47S0101000_1 aCListenerS47S0101000_1, View view) {
        C03AQ c03aq = (C03AQ) aCListenerS47S0101000_1.l0;
        c03aq.LL.invoke((String) ListProtector.get(c03aq.LLILLJJLI, aCListenerS47S0101000_1.i1));
    }

    public ACListenerS47S0101000_1(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
