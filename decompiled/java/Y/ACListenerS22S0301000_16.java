package Y;

import X.C1009410cNH;
import X.C1012830cSn;
import X.C1012860cSq;
import X.C1012920cSw;
import X.C1013300cTY;
import X.C1051950dTt;
import X.InterfaceC1051960dTu;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.model.AnoleProductModel;
import kotlin.jvm.internal.AwS124S0101000_16;

/* JADX INFO: loaded from: classes17.dex */
public class ACListenerS22S0301000_16 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS22S0301000_16 aCListenerS22S0301000_16, View view) {
        if (!((C1051950dTt) aCListenerS22S0301000_16.l0).LLILZ) {
            return;
        }
        InterfaceC1051960dTu interfaceC1051960dTu = (InterfaceC1051960dTu) aCListenerS22S0301000_16.l1;
        if (interfaceC1051960dTu != null) {
            interfaceC1051960dTu.LJIIJJI(aCListenerS22S0301000_16.i3);
        }
        ((ViewPager) aCListenerS22S0301000_16.l2).setCurrentItem(aCListenerS22S0301000_16.i3);
    }

    public static final void onClick$1(ACListenerS22S0301000_16 aCListenerS22S0301000_16, View view) {
        C1009410cNH.LIZ(((C1013300cTY) aCListenerS22S0301000_16.l0).itemView.getContext(), "videotile", (AnoleProductModel) aCListenerS22S0301000_16.l1, ((C1012920cSw) aCListenerS22S0301000_16.l2).LLILLJJLI.LIZ(), ((C1012920cSw) aCListenerS22S0301000_16.l2).LLILLJJLI.LIZIZ().LIZLLL);
        C1012860cSq logger = ((C1012920cSw) aCListenerS22S0301000_16.l2).LLILLJJLI.getLogger();
        int i = aCListenerS22S0301000_16.i3;
        AnoleProductModel anoleProductModel = (AnoleProductModel) aCListenerS22S0301000_16.l1;
        logger.getClass();
        C1012830cSn.LIZ.getClass();
        logger.logAd(C1012830cSn.LJIL, new AwS124S0101000_16(i, anoleProductModel, 20));
    }

    public ACListenerS22S0301000_16(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
