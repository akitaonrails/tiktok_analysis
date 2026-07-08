package X;

import Y.ARunnableS104S0100000_4;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutLineItemContext;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D5I, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5I {
    public final C0D5E LIZ;
    public final Function1<C0D5V, Unit> LIZIZ;
    public final C0DCW LIZJ;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final C0D5J LJI;

    public final String LIZ() {
        CheckoutLineItemContext checkoutLineItemContext;
        String strLIZIZ;
        List<CheckoutLineItemContext> list = this.LIZ.LIZIZ.items;
        if (list == null || (checkoutLineItemContext = (CheckoutLineItemContext) C13LP.LJJJLL(list)) == null) {
            throw new IllegalStateException("checkout item is empty");
        }
        Map<String, String> map = this.LIZ.LIZIZ.passThrough;
        if (map != null && (strLIZIZ = map.get("shop_domain")) != null) {
            if (!a0.LJJJIL(strLIZIZ)) {
                String str = checkoutLineItemContext.variantId;
                if (str == null || !(!a0.LJJJIL(str))) {
                    throw new IllegalStateException("variant_id is empty");
                }
                Integer num = checkoutLineItemContext.quantity;
                int iIntValue = num != null ? num.intValue() : 1;
                String strLJJLJLI = a0.LJJLJLI(str, "/", str);
                String strLJJZ = a0.LJJZ(strLJJLJLI, "?", strLJJLJLI);
                if (!u.LJJIIJZLJL(strLIZIZ, "http", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://");
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("/cart/");
                sbLIZ2.append(strLJJZ);
                sbLIZ2.append(':');
                sbLIZ2.append(iIntValue);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        throw new IllegalStateException("shop_domain is empty");
    }

    public final void LIZIZ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS104S0100000_4((Function0) function0, 149));
        }
    }

    public final void LIZJ(C0D5V c0d5v) {
        if (!this.LJ.compareAndSet(false, true)) {
            return;
        }
        this.LJI.LIZJ = C0D5K.FINISHED;
        if (!this.LJFF.compareAndSet(false, true)) {
            return;
        }
        this.LIZIZ.invoke(c0d5v);
    }

    public C0D5I(C0D5E c0d5e, AwS583S0100000_4 awS583S0100000_4, C0DCW c0dcw) {
        this.LIZ = c0d5e;
        this.LIZIZ = awS583S0100000_4;
        this.LIZJ = c0dcw;
        this.LJI = new C0D5J(c0d5e.LIZLLL);
    }
}
