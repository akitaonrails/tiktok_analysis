package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS402S0200000_1;

/* JADX INFO: renamed from: X.03ZM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZM extends FrameLayout {
    public LinearLayout LL;
    public C874203bI LLILLJJLI;
    public C874203bI LLILLL;
    public final C01GW LLILZ;
    public C874203bI LLILZIL;
    public C874203bI LLILZLL;

    public final LinearLayout getContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eqx);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final List<C874203bI> getItemList() {
        return (List) this.LLILZ.getValue();
    }

    public final C874203bI getItemUnderFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c1h);
            this.LLILLL = (C874203bI) callbackFindViewById;
        }
        return (C874203bI) callbackFindViewById;
    }

    public final C874203bI getItemUpperFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c1i);
            this.LLILLJJLI = (C874203bI) callbackFindViewById;
        }
        return (C874203bI) callbackFindViewById;
    }

    public final C874203bI getBindItemView() {
        return this.LLILZLL;
    }

    public final C874203bI getPayItemView() {
        return this.LLILZIL;
    }

    public final void setBindItemChecked$ecommerce_transaction_release(boolean z) {
        C874203bI c874203bI = this.LLILZLL;
        if (c874203bI != null) {
            c874203bI.setChecked$ecommerce_transaction_release(z);
        }
    }

    public final void setBindItemView(C874203bI c874203bI) {
        this.LLILZLL = c874203bI;
    }

    public final void setContainerFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setItemUnderFromXml(C874203bI c874203bI) {
        this.LLILLL = c874203bI;
    }

    public final void setItemUpperFromXml(C874203bI c874203bI) {
        this.LLILLJJLI = c874203bI;
    }

    public final void setLeftPadding(int i) {
        C0H1U.LJIIIIZZ(i, getContainerFromXml());
    }

    public final void setPayItemChecked$ecommerce_transaction_release(boolean z) {
        C874203bI c874203bI = this.LLILZIL;
        if (c874203bI != null) {
            c874203bI.setChecked$ecommerce_transaction_release(z);
        }
    }

    public final void setPayItemView(C874203bI c874203bI) {
        this.LLILZIL = c874203bI;
    }

    public C03ZM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(304));
        C0H1U.LIZJ(R.layout.akw, this, true);
    }

    public final void LIZ(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, Function1<? super C03ZM, Unit> function1, PaymentMethod paymentMethod, Function1<? super PaymentMethod, Unit> function12, Function1<? super PaymentMethod, Unit> function13, Function0<Unit> function0) {
        PaymentMethod paymentMethod2;
        if (z2) {
            ListProtector.set(getItemList(), 0, getItemUpperFromXml());
            ListProtector.set(getItemList(), 1, getItemUnderFromXml());
        } else {
            ListProtector.set(getItemList(), 0, getItemUnderFromXml());
            ListProtector.set(getItemList(), 1, getItemUpperFromXml());
        }
        this.LLILZIL = (C874203bI) ListProtector.get(getItemList(), 1);
        this.LLILZLL = (C874203bI) ListProtector.get(getItemList(), 0);
        C874203bI c874203bI = (C874203bI) ListProtector.get(getItemList(), 0);
        if (c874203bI != null) {
            Boolean boolValueOf = Boolean.valueOf(z4);
            Boolean bool = Boolean.TRUE;
            C835503Of c835503Of = paymentMethod.LJI;
            if (c835503Of != null) {
                paymentMethod2 = c835503Of.LIZ;
            } else {
                paymentMethod2 = null;
            }
            c874203bI.LIZ(str3, str4, boolValueOf, bool, str5, z, function0, function13, paymentMethod2);
        }
        C874203bI c874203bI2 = (C874203bI) ListProtector.get(getItemList(), 1);
        if (c874203bI2 != null) {
            c874203bI2.LIZ(str, str2, Boolean.valueOf(z3), Boolean.FALSE, null, z, new AwS402S0200000_1((Function1) function1, (Function1<? super C03ZM, Unit>) this, (C03ZM) 17), function12, paymentMethod);
        }
    }
}
