package Y;

import X.AbstractDialogInterfaceC1397690mTX;
import X.C20286614Zk;
import X.C259800zU;
import X.C786410Ut5;
import X.EnumC20283814Yi;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class ACListenerS0S0403000_30 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS0S0403000_30 aCListenerS0S0403000_30, View view) {
        C20286614Zk c20286614Zk = C20286614Zk.LIZ;
        C20286614Zk.LIZIZ = new Option[]{ListProtector.get((List) aCListenerS0S0403000_30.l0, 0)};
        C20286614Zk.LIZJ = String.valueOf(((Option) ListProtector.get((List) aCListenerS0S0403000_30.l0, 0)).id);
        C20286614Zk c20286614Zk2 = C20286614Zk.LIZ;
        Aweme aweme = (Aweme) aCListenerS0S0403000_30.l1;
        EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.SUBMIT;
        VerticalViewPager verticalViewPager = (VerticalViewPager) aCListenerS0S0403000_30.l2;
        int i = aCListenerS0S0403000_30.i4;
        int i2 = aCListenerS0S0403000_30.i5;
        int i3 = aCListenerS0S0403000_30.i6;
        c20286614Zk2.getClass();
        C20286614Zk.LIZ(aweme, enumC20283814Yi, verticalViewPager, i, i2, i3);
        AbstractDialogInterfaceC1397690mTX abstractDialogInterfaceC1397690mTX = (AbstractDialogInterfaceC1397690mTX) ((C259800zU) aCListenerS0S0403000_30.l3).element;
        if (abstractDialogInterfaceC1397690mTX != null) {
            abstractDialogInterfaceC1397690mTX.LIZIZ(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(ACListenerS0S0403000_30 aCListenerS0S0403000_30, View view) {
        C20286614Zk c20286614Zk = C20286614Zk.LIZ;
        C20286614Zk.LIZIZ = new Option[]{ListProtector.get((List) aCListenerS0S0403000_30.l0, 1)};
        C20286614Zk.LIZJ = String.valueOf(((Option) ListProtector.get((List) aCListenerS0S0403000_30.l0, 1)).id);
        C20286614Zk c20286614Zk2 = C20286614Zk.LIZ;
        Aweme aweme = (Aweme) aCListenerS0S0403000_30.l1;
        EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.SUBMIT;
        VerticalViewPager verticalViewPager = (VerticalViewPager) aCListenerS0S0403000_30.l2;
        int i = aCListenerS0S0403000_30.i4;
        int i2 = aCListenerS0S0403000_30.i5;
        int i3 = aCListenerS0S0403000_30.i6;
        c20286614Zk2.getClass();
        C20286614Zk.LIZ(aweme, enumC20283814Yi, verticalViewPager, i, i2, i3);
        AbstractDialogInterfaceC1397690mTX abstractDialogInterfaceC1397690mTX = (AbstractDialogInterfaceC1397690mTX) ((C259800zU) aCListenerS0S0403000_30.l3).element;
        if (abstractDialogInterfaceC1397690mTX != null) {
            abstractDialogInterfaceC1397690mTX.LIZIZ(null);
        }
    }

    public static final void onClick$2(ACListenerS0S0403000_30 aCListenerS0S0403000_30, View view) {
        ((TuxSheet) aCListenerS0S0403000_30.l0).dismiss();
        C20286614Zk c20286614Zk = C20286614Zk.LIZ;
        Aweme aweme = (Aweme) aCListenerS0S0403000_30.l1;
        EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.SUBMIT;
        VerticalViewPager verticalViewPager = (VerticalViewPager) aCListenerS0S0403000_30.l2;
        int i = aCListenerS0S0403000_30.i4;
        int i2 = aCListenerS0S0403000_30.i5;
        int i3 = aCListenerS0S0403000_30.i6;
        c20286614Zk.getClass();
        C20286614Zk.LIZ(aweme, enumC20283814Yi, verticalViewPager, i, i2, i3);
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2((Context) aCListenerS0S0403000_30.l3, 18));
    }

    public ACListenerS0S0403000_30(Object obj, Object obj2, Object obj3, int i, int i2, int i3, Object obj4, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i4 = i;
        this.i5 = i2;
        this.i6 = i3;
        this.l3 = obj4;
    }
}
