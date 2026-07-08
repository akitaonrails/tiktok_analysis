package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.container.PaymentCheckoutFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04JN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JN implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
            case 3:
                onCancel$3(this, dialogInterface);
                break;
        }
    }

    public C04JN(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(C04JN c04jn, DialogInterface dialogInterface) {
        ((Function0) c04jn.l0).invoke();
    }

    public static final void onCancel$1(C04JN c04jn, DialogInterface dialogInterface) {
        ((Function1) c04jn.l0).invoke(EnumC884003cs.CLICK_CLOSE);
    }

    public static final void onCancel$2(C04JN c04jn, DialogInterface dialogInterface) {
        ((Function1) c04jn.l0).invoke(EnumC884003cs.CLICK_CLOSE);
    }

    public static final void onCancel$3(C04JN c04jn, DialogInterface dialogInterface) {
        ((PaymentCheckoutFragment) c04jn.l0).UR();
    }
}
