package Y;

import X.C1711380udU;
import X.EnumC1770130wAF;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class ACListenerS58S0101000_26 implements View.OnClickListener {
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
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS58S0101000_26 aCListenerS58S0101000_26, View view) {
        ((EcVideoGuideAssem) aCListenerS58S0101000_26.l0).Bp(EnumC1770130wAF.CLICK_SHADOW, aCListenerS58S0101000_26.i1);
    }

    public static final void onClick$1(ACListenerS58S0101000_26 aCListenerS58S0101000_26, View view) {
        ((C1711380udU) aCListenerS58S0101000_26.l0).LLLFZ(aCListenerS58S0101000_26.i1);
    }

    public static final void onClick$2(ACListenerS58S0101000_26 aCListenerS58S0101000_26, View view) {
        ((C1711380udU) aCListenerS58S0101000_26.l0).LLLFZ(aCListenerS58S0101000_26.i1);
    }

    public static final void onClick$3(ACListenerS58S0101000_26 aCListenerS58S0101000_26, View view) {
        ((Function1) aCListenerS58S0101000_26.l0).invoke(Integer.valueOf(aCListenerS58S0101000_26.i1));
    }

    public ACListenerS58S0101000_26(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
