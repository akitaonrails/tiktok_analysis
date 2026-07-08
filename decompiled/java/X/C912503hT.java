package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03hT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C912503hT {
    public final PaymentMethod LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final WeakReference<Context> LJ;
    public final WeakReference<InterfaceC497601wk> LJFF;
    public final C05XL<Unit> LJI;
    public final C05XL<Boolean> LJII;
    public final String LJIIIIZZ;

    public C912503hT(PaymentMethod paymentMethod, String str, Context context, InterfaceC497601wk interfaceC497601wk, C099F c099f, C099F c099f2, String str2) {
        WeakReference<Context> weakReference = new WeakReference<>(context);
        WeakReference<InterfaceC497601wk> weakReference2 = new WeakReference<>(interfaceC497601wk);
        this.LIZ = paymentMethod;
        this.LIZIZ = str;
        this.LIZJ = "payment_failed";
        this.LIZLLL = "payment_failure_pop_up";
        this.LJ = weakReference;
        this.LJFF = weakReference2;
        this.LJI = c099f;
        this.LJII = c099f2;
        this.LJIIIIZZ = str2;
    }
}
