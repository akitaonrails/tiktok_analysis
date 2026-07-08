package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.EcUploadPayInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentParams;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03f5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C897703f5 {
    public final Context LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public NewPayInfo LIZLLL;
    public final Cashier LJ;
    public final String LJFF;
    public final PaymentInfo LJI;
    public final Map<String, Object> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final OneClickPayContext LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public InterfaceC911103hF LJIILJJIL;
    public final InterfaceC877803bs LJIILL;
    public final Boolean LJIILLIIL;
    public final C898303fB LJIIZILJ = new C898303fB();
    public final C898003f8 LJIJ = new C898003f8();
    public final C898403fC LJIJI = new C898403fC();
    public final EcUploadPayInfoRequest LJIJJ = new EcUploadPayInfoRequest(null, null, null, null);
    public boolean LJIJJLI = true;
    public boolean LJIL;
    public boolean LJJ;
    public final String LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public String LJJIII;
    public final boolean LJJIIJ;
    public final PaymentMethodsData LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final long LJJIIZI;
    public final boolean LJJIJ;

    public final boolean LIZ() {
        PaymentParams paymentParams;
        Cashier cashier = this.LJ;
        if (cashier == null || (paymentParams = cashier.paymentParams) == null) {
            return false;
        }
        return Intrinsics.LJFF(paymentParams.pollPayStatusWhenBreak, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C897703f5(X.C03PP r14) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C897703f5.<init>(X.03PP):void");
    }
}
