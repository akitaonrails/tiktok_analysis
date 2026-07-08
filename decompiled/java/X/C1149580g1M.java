package X;

import Y.ARunnableS50S0300000_17;
import Y.ARunnableS72S0200000_3;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletExceptionService;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0g1M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149580g1M implements InterfaceC1151070g3l {
    public final /* synthetic */ ExchangeParams LIZ;
    public final /* synthetic */ Function2<Boolean, Throwable, Unit> LIZIZ;

    @Override // X.InterfaceC1151070g3l
    public final void LIZ(Throwable th) {
        int statusCode;
        Exception exc;
        ARunnableS72S0200000_3 aRunnableS72S0200000_3;
        Function2<Boolean, Throwable, Unit> function2;
        boolean z = th instanceof C501470JlZ;
        if (z) {
            statusCode = ((C501520Jle) th).getErrorCode();
        } else if (th instanceof C1811850xFX) {
            statusCode = ((C1811850xFX) th).statusCode;
        } else if (th instanceof C1494690ozz) {
            statusCode = ((C1494690ozz) th).getStatusCode();
        } else {
            statusCode = -1;
        }
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            ARunnableS50S0300000_17 aRunnableS50S0300000_17 = null;
            if (z) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
            Boolean boolCq0 = C1148670fzt.LIZ().walletException().cq0(customErrorExtra, statusCode);
            if (boolCq0.booleanValue()) {
                ExchangeParams exchangeParams = this.LIZ;
                Function2<Boolean, Throwable, Unit> function22 = this.LIZIZ;
                aRunnableS50S0300000_17 = new ARunnableS50S0300000_17(exchangeParams, customErrorExtra, function22, 21);
                aRunnableS72S0200000_3 = new ARunnableS72S0200000_3(function22, th, 47);
            } else {
                aRunnableS72S0200000_3 = null;
            }
            IWalletExceptionService iWalletExceptionServiceWalletException = C1148670fzt.LIZ().walletException();
            ExchangeParams exchangeParams2 = this.LIZ;
            iWalletExceptionServiceWalletException.NO1(contextLIZ, th, aRunnableS50S0300000_17, aRunnableS72S0200000_3, exchangeParams2.source, exchangeParams2.way, null, exchangeParams2, null);
            if (!boolCq0.booleanValue() && (function2 = this.LIZIZ) != null) {
                function2.invoke(Boolean.FALSE, th);
            }
        }
    }

    @Override // X.InterfaceC1151070g3l
    public final void LIZIZ(String str) {
        C784440Upu.LIZ().LIZIZ(new C1149590g1N());
        C784440Upu.LIZ().LIZIZ(new C1124340fMe((int) this.LIZ.coinsCount, true, false, 0L, false, false, null, 0, 1016));
        Function2<Boolean, Throwable, Unit> function2 = this.LIZIZ;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1149580g1M(ExchangeParams exchangeParams, Function2<? super Boolean, ? super Throwable, Unit> function2) {
        this.LIZ = exchangeParams;
        this.LIZIZ = function2;
    }
}
