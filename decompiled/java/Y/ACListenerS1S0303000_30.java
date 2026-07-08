package Y;

import X.AbstractDialogInterfaceC1397690mTX;
import X.C20286614Zk;
import X.C259800zU;
import X.EnumC20283814Yi;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes31.dex */
public class ACListenerS1S0303000_30 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public int i4;
    public int i5;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS1S0303000_30 aCListenerS1S0303000_30, View view) {
        C20286614Zk c20286614Zk = C20286614Zk.LIZ;
        Aweme aweme = (Aweme) aCListenerS1S0303000_30.l0;
        EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.CANCEL;
        VerticalViewPager verticalViewPager = (VerticalViewPager) aCListenerS1S0303000_30.l1;
        int i = aCListenerS1S0303000_30.i3;
        int i2 = aCListenerS1S0303000_30.i4;
        int i3 = aCListenerS1S0303000_30.i5;
        c20286614Zk.getClass();
        C20286614Zk.LIZ(aweme, enumC20283814Yi, verticalViewPager, i, i2, i3);
        AbstractDialogInterfaceC1397690mTX abstractDialogInterfaceC1397690mTX = (AbstractDialogInterfaceC1397690mTX) ((C259800zU) aCListenerS1S0303000_30.l2).element;
        if (abstractDialogInterfaceC1397690mTX != null) {
            abstractDialogInterfaceC1397690mTX.LIZIZ(null);
        }
    }

    public static final void onClick$1(ACListenerS1S0303000_30 aCListenerS1S0303000_30, View view) {
        ((TuxSheet) aCListenerS1S0303000_30.l0).dismiss();
        C20286614Zk c20286614Zk = C20286614Zk.LIZ;
        Aweme aweme = (Aweme) aCListenerS1S0303000_30.l1;
        EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.CANCEL;
        VerticalViewPager verticalViewPager = (VerticalViewPager) aCListenerS1S0303000_30.l2;
        int i = aCListenerS1S0303000_30.i3;
        int i2 = aCListenerS1S0303000_30.i4;
        int i3 = aCListenerS1S0303000_30.i5;
        c20286614Zk.getClass();
        C20286614Zk.LIZ(aweme, enumC20283814Yi, verticalViewPager, i, i2, i3);
    }

    public ACListenerS1S0303000_30(Object obj, Object obj2, Object obj3, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
        this.i4 = i2;
        this.i5 = i3;
    }
}
