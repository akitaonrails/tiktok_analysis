package Y;

import X.AbstractC1126600fQI;
import X.AnonymousClass0054;
import X.C1125160fNy;
import X.C1127390fRZ;
import X.C1127490fRj;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;

/* JADX INFO: loaded from: classes18.dex */
public class ACListenerS43S0210000_17 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final void onClick$0(ACListenerS43S0210000_17 aCListenerS43S0210000_17, View view) {
        Object obj;
        String str;
        C1127390fRZ c1127390fRZ = (C1127390fRZ) aCListenerS43S0210000_17.l0;
        Context context = c1127390fRZ.LL;
        GiftLeafRootViewModel giftLeafRootViewModelLJJJJJL = c1127390fRZ.LJJJJJL();
        AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) aCListenerS43S0210000_17.l1;
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        } else {
            obj = null;
        }
        Gift gift = (Gift) obj;
        if (aCListenerS43S0210000_17.z2) {
            str = "eoy_activity";
        } else {
            str = "gift_gallery";
        }
        C1125160fNy.LIZIZ(context, giftLeafRootViewModelLJJJJJL, gift, str, "gift_panel");
    }

    public static final void onClick$1(ACListenerS43S0210000_17 aCListenerS43S0210000_17, View view) {
        Object obj;
        String str;
        C1127490fRj c1127490fRj = (C1127490fRj) aCListenerS43S0210000_17.l0;
        Context context = c1127490fRj.LLILLJJLI;
        GiftLeafRootViewModel giftLeafRootViewModel = c1127490fRj.LLILZIL;
        AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) aCListenerS43S0210000_17.l1;
        if (abstractC1126600fQI != null) {
            obj = abstractC1126600fQI.LIZIZ;
        } else {
            obj = null;
        }
        Gift gift = (Gift) obj;
        if (aCListenerS43S0210000_17.z2) {
            str = "eoy_activity";
        } else {
            str = "gift_gallery";
        }
        C1125160fNy.LIZIZ(context, giftLeafRootViewModel, gift, str, "gift_panel");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS43S0210000_17(Object obj, C1127390fRZ c1127390fRZ, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = obj;
        this.l1 = c1127390fRZ;
        this.z2 = abstractC1126600fQI;
    }
}
