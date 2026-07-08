package com.bytedance.android.live.wallet;

import X.C006A;
import X.C1149670g1V;
import X.C1797250wrz;
import X.C1802410x0J;
import X.C19EG;
import android.content.Context;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;

/* JADX INFO: loaded from: classes18.dex */
public interface IWalletExceptionService extends C006A {
    C1149670g1V MF1(Context context, Throwable th, int i, int i2, boolean z, String str);

    C1149670g1V NO1(Context context, Throwable th, Runnable runnable, Runnable runnable2, int i, int i2, String str, ExchangeParams exchangeParams, String str2);

    void Tu2(C19EG c19eg, C1802410x0J c1802410x0J);

    Boolean cq0(CustomErrorExtra customErrorExtra, int i);

    C1149670g1V h31(Context context, C1797250wrz c1797250wrz, String str);

    C1149670g1V iu2(Context context, Throwable th);

    void mO0(Context context, CustomErrorExtra customErrorExtra, int i, Boolean bool);

    Boolean wk0(Throwable th);
}
