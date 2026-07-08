package X;

import Y.ARunnableS16S0301000_27;
import android.app.Activity;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.wallet.Diamond;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wrx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797230wrx extends C09AY implements Function1<Throwable, Boolean> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Diamond LLILLL;
    public final /* synthetic */ InterfaceC1796910wrR LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1797230wrx(int i, int i2, int i3, int i4, C19EG c19eg, C1807550x8b c1807550x8b, Diamond diamond, String str) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = i;
        this.LLILLL = diamond;
        this.LLILZ = c1807550x8b;
        this.LLILZIL = str;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Throwable th) {
        int errorCode;
        Exception exc;
        Throwable th2 = th;
        boolean z = th2 instanceof C501470JlZ;
        if (z) {
            errorCode = ((C501520Jle) th2).getErrorCode();
        } else {
            errorCode = -1;
        }
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (z) {
            exc = (Exception) th2;
        } else {
            exc = null;
        }
        final CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
        boolean zBooleanValue = iWalletService.walletException().cq0(customErrorExtra, errorCode).booleanValue();
        if (zBooleanValue) {
            final Activity activity = this.LL;
            final Diamond diamond = this.LLILLL;
            final InterfaceC1796910wrR interfaceC1796910wrR = this.LLILZ;
            final String str = this.LLILZIL;
            final int i = this.LLILZLL;
            final int i2 = this.LLILLJJLI;
            final int i3 = this.LLIZ;
            final int i4 = this.LLIZLLLIL;
            C1802340x0C.LJ(activity, th2, new Runnable() { // from class: X.0wrp
                public final void LIZ() throws Throwable {
                    C1797100wrk c1797100wrk = C1797100wrk.LIZIZ;
                    Activity activity2 = activity;
                    Diamond diamond2 = diamond;
                    InterfaceC1796910wrR interfaceC1796910wrR2 = interfaceC1796910wrR;
                    String str2 = str;
                    int i5 = i;
                    int i6 = i2;
                    int i7 = i3;
                    int i8 = i4;
                    CustomErrorExtra customErrorExtra2 = customErrorExtra;
                    c1797100wrk.LJFF(activity2, diamond2, interfaceC1796910wrR2, str2, i5, i6, 0, i7, i8, null, true, customErrorExtra2 == null ? "" : customErrorExtra2.getPenaltyWarningSkip(), null, null, null, null, "", "", 0, null, null, null, false, null, null);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PayManager@437b.chargePayForNonLiveBusiness$createFailBlock$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PayManager@437b.chargePayForNonLiveBusiness$createFailBlock$1$1");
                }
            }, new ARunnableS16S0301000_27(interfaceC1796910wrR, th2, diamond, errorCode, 2), i2, 1001, true);
        } else {
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
