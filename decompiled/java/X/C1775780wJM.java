package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.assem.ProductListAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.viewmodel.ProductListViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.verify.pi.PiVerifyAssem;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0wJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775780wJM implements TextView.OnEditorActionListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$t) {
            case 0:
                return onEditorAction$0(this, textView, i, keyEvent);
            case 1:
                return onEditorAction$1(this, textView, i, keyEvent);
            case 2:
                return onEditorAction$2(this, textView, i, keyEvent);
            default:
                return false;
        }
    }

    public C1775780wJM(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C1775780wJM c1775780wJM, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5 && i != 6) {
            return false;
        }
        ((Function0) c1775780wJM.l0).invoke();
        return true;
    }

    public static final boolean onEditorAction$1(C1775780wJM c1775780wJM, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6 && ((PiVerifyAssem) c1775780wJM.l0).Zo().isEnabled()) {
            ((PiVerifyAssem) c1775780wJM.l0).Zo().performClick();
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onEditorAction$2(C1775780wJM c1775780wJM, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        textView.clearFocus();
        KeyboardUtils.LIZIZ(textView);
        ProductListViewModel productListViewModelJo = ((ProductListAssem) c1775780wJM.l0).Jo();
        String string = textView.getText().toString();
        if (string != null && string.length() != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList<C1731700vAG> arrayList2 = ((C1731710vAH) productListViewModelJo.getState()).LLILLL;
            if (arrayList2 != null) {
                for (C1731700vAG c1731700vAG : arrayList2) {
                    if (a0.LJJJ(c1731700vAG.LLILZ, string, 0, true, 2) != -1) {
                        arrayList.add(c1731700vAG);
                    }
                }
            }
            productListViewModelJo.setState(new AwS605S0100000_26(arrayList, (ArrayList<PaymentOption>) 499));
            return true;
        }
        productListViewModelJo.setState(new AwS605S0100000_26(productListViewModelJo, 500));
        return true;
    }
}
