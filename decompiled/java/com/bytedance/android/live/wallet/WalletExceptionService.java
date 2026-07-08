package com.bytedance.android.live.wallet;

import X.C1149670g1V;
import X.C1151120g3q;
import X.C1151130g3r;
import X.C1797250wrz;
import X.C1797270ws1;
import X.C1802340x0C;
import X.C1802390x0H;
import X.C1802410x0J;
import X.C1802440x0M;
import X.C1802580x0a;
import X.C1802810x0x;
import X.C19EG;
import X.C501470JlZ;
import X.InterfaceC1797280ws2;
import X.InterfaceC1802450x0N;
import android.content.Context;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import java.util.HashSet;

/* JADX INFO: loaded from: classes28.dex */
public class WalletExceptionService implements IWalletExceptionService {
    public static final C1802440x0M LL = new Object() { // from class: X.0x0M
    };
    public static volatile WalletExceptionService LLILLJJLI;

    @Override // com.bytedance.android.live.wallet.IWalletExceptionService
    public final Boolean wk0(Throwable th) {
        CustomErrorExtra customErrorExtra;
        boolean z;
        if ((th instanceof C501470JlZ) && (customErrorExtra = CustomErrorExtra.getCustomErrorExtra((Exception) th)) != null) {
            if (customErrorExtra.getPromptType() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }

    @Override // com.bytedance.android.live.wallet.IWalletExceptionService
    public final void Tu2(C19EG c19eg, C1802410x0J c1802410x0J) {
        C1802580x0a.LJ(c19eg, c1802410x0J);
    }

    @Override // com.bytedance.android.live.wallet.IWalletExceptionService
    public final Boolean cq0(CustomErrorExtra customErrorExtra, int i) {
        boolean z;
        HashSet<Integer> hashSet = InterfaceC1802450x0N.LIZIZ;
        if (hashSet.isEmpty()) {
            hashSet.add(4005266);
            hashSet.add(4005267);
        }
        if (hashSet.contains(Integer.valueOf(i)) || (customErrorExtra != null && customErrorExtra.isContinuable())) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.bytedance.android.live.wallet.IWalletExceptionService
    public final C1149670g1V iu2(Context context, Throwable th) {
        return C1802340x0C.LJ(context, th, null, null, 0, 1002, false);
    }

    @Override // com.bytedance.android.live.wallet.IWalletExceptionService
    public final C1149670g1V h31(Context context, C1797250wrz c1797250wrz, String str) {
        InterfaceC1797280ws2 interfaceC1797280ws2LIZ = C1797270ws1.LIZ().LIZ(context, c1797250wrz, "recharge_pay_fail", str);
        if (interfaceC1797280ws2LIZ != null) {
            return new C1149670g1V(interfaceC1797280ws2LIZ.LIZIZ(), interfaceC1797280ws2LIZ.LIZ());
        }
        return new C1149670g1V(false, false);
    }

    @Override // com.bytedance.android.live.wallet.IWalletExceptionService
    public final void mO0(Context context, CustomErrorExtra customErrorExtra, int i, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        if (customErrorExtra != null) {
            C1802410x0J c1802410x0J = new C1802410x0J();
            C501470JlZ c501470JlZ = new C501470JlZ(i);
            c1802410x0J.LIZIZ = i;
            c1802410x0J.LJIILIIL = zBooleanValue;
            c1802410x0J.LIZLLL = c501470JlZ;
            C1802810x0x.LIZJ(context, customErrorExtra, null, null, null, c1802410x0J, null, "");
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletExceptionService
    public final C1149670g1V MF1(Context context, Throwable th, int i, int i2, boolean z, String str) {
        C1802390x0H.LIZ(th, null, null, i, i2, str);
        if (z) {
            C1802410x0J c1802410x0JLIZ = C1802390x0H.LIZ(th, null, null, i, i2, str);
            C1797250wrz c1797250wrz = new C1797250wrz();
            c1797250wrz.LIZ = c1802410x0JLIZ.LIZIZ;
            c1797250wrz.LIZIZ = c1802410x0JLIZ.LIZJ;
            c1797250wrz.LIZJ = c1802410x0JLIZ.LIZLLL;
            c1797250wrz.LJIIIIZZ = c1802410x0JLIZ;
            c1797250wrz.LJI = c1802410x0JLIZ.LJIIIZ;
            c1797250wrz.LJII = null;
            InterfaceC1797280ws2 interfaceC1797280ws2LIZ = C1797270ws1.LIZ().LIZ(context, c1797250wrz, "recharge_pay_fail", null);
            return new C1149670g1V(interfaceC1797280ws2LIZ.LIZIZ(), interfaceC1797280ws2LIZ.LIZ());
        }
        return NO1(context, th, null, null, i, i2, str, null, null);
    }

    @Override // com.bytedance.android.live.wallet.IWalletExceptionService
    public final C1149670g1V NO1(Context context, Throwable th, Runnable runnable, Runnable runnable2, int i, int i2, String str, ExchangeParams exchangeParams, String str2) {
        C1151120g3q c1151120g3qLIZ = C1151130g3r.LIZ(C1802390x0H.LIZ(th, runnable, runnable2, i, i2, str));
        if (exchangeParams != null) {
            c1151120g3qLIZ.LJ = exchangeParams;
        }
        c1151120g3qLIZ.LIZJ = runnable2;
        c1151120g3qLIZ.LIZLLL = runnable;
        InterfaceC1797280ws2 interfaceC1797280ws2LIZ = C1797270ws1.LIZ().LIZ(context, c1151120g3qLIZ, "exchange_fail_block", str2);
        return new C1149670g1V(interfaceC1797280ws2LIZ.LIZIZ(), interfaceC1797280ws2LIZ.LIZ());
    }
}
