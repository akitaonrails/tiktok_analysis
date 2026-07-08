package X;

import android.widget.EditText;
import com.bytedance.pipo.ttpay.recharge.RechargeAssem;
import com.bytedance.pipo.ttpay.recharge.widget.NumberTextWatcher;
import defpackage.CurrencyFormat;

/* JADX INFO: renamed from: X.0uu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721660uu4 extends NumberTextWatcher {
    public final /* synthetic */ RechargeAssem LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721660uu4(RechargeAssem rechargeAssem, CurrencyFormat currencyFormat, EditText editText, int i) {
        super(rechargeAssem, editText, currencyFormat, i);
        this.LLJIJIL = rechargeAssem;
    }
}
