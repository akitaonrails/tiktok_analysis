package Y;

import X.C03AS;
import X.C03AU;
import X.C127K;
import X.C926003je;
import X.C941203m6;
import X.C941803mC;
import X.C942303mH;
import X.C942403mI;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: loaded from: classes2.dex */
public class ACListenerS77S1100000_1 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS77S1100000_1 aCListenerS77S1100000_1, View view) {
        String str = aCListenerS77S1100000_1.s0;
        Activity activity = (Activity) aCListenerS77S1100000_1.l1;
        if (!TextUtils.isEmpty(str)) {
            SmartRouter.buildRoute(activity, str).open();
        }
    }

    public static final void onClick$1(ACListenerS77S1100000_1 aCListenerS77S1100000_1, View view) {
        SmartRouter.buildRoute(((TuxIconView) aCListenerS77S1100000_1.l1).getContext(), aCListenerS77S1100000_1.s0).open();
    }

    public static final void onClick$2(ACListenerS77S1100000_1 aCListenerS77S1100000_1, View view) {
        SmartRouter.buildRoute(((C127K) aCListenerS77S1100000_1.l1).getContext(), aCListenerS77S1100000_1.s0).open();
    }

    public static final void onClick$3(ACListenerS77S1100000_1 aCListenerS77S1100000_1, View view) {
        SmartRouter.buildRoute(((C941803mC) aCListenerS77S1100000_1.l1).getContext(), aCListenerS77S1100000_1.s0).open();
    }

    public static final void onClick$4(ACListenerS77S1100000_1 aCListenerS77S1100000_1, View view) {
        SmartRouter.buildRoute(((C942303mH) aCListenerS77S1100000_1.l1).getContext(), aCListenerS77S1100000_1.s0).open();
    }

    public static final void onClick$5(ACListenerS77S1100000_1 aCListenerS77S1100000_1, View view) {
        SmartRouter.buildRoute(((C942403mI) aCListenerS77S1100000_1.l1).getContext(), aCListenerS77S1100000_1.s0).open();
    }

    public static final void onClick$6(ACListenerS77S1100000_1 aCListenerS77S1100000_1, View view) {
        SmartRouter.buildRoute(((C941203m6) aCListenerS77S1100000_1.l1).getContext(), aCListenerS77S1100000_1.s0).open();
    }

    public static final void onClick$7(ACListenerS77S1100000_1 aCListenerS77S1100000_1, View view) {
        SmartRouter.buildRoute(((C926003je) aCListenerS77S1100000_1.l1).getContext(), aCListenerS77S1100000_1.s0).open();
    }

    public static final void onClick$8(ACListenerS77S1100000_1 aCListenerS77S1100000_1, View view) {
        C03AU c03au = ((C03AS) aCListenerS77S1100000_1.l1).LLILLJJLI;
        if (c03au != null) {
            c03au.LIZ(aCListenerS77S1100000_1.s0);
        }
    }

    public ACListenerS77S1100000_1(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
