package X;

import android.widget.CompoundButton;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.BillboardSettingsAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import kotlin.jvm.internal.AwS38S0010000_26;

/* JADX INFO: renamed from: X.0wJR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775830wJR implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
        }
    }

    public C1775830wJR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C1775830wJR c1775830wJR, CompoundButton compoundButton, boolean z) {
        BillboardGlobalViewModel billboardGlobalViewModelGo = ((BillboardSettingsAssem) c1775830wJR.l0).Go();
        billboardGlobalViewModelGo.setStateImmediate(new AwS38S0010000_26(z, 11));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(billboardGlobalViewModelGo), C2126308Ur.LJFF, null, new C1728130v4V(billboardGlobalViewModelGo.getState().LL, billboardGlobalViewModelGo, null, z), 2);
    }

    public static final void onCheckedChanged$1(C1775830wJR c1775830wJR, CompoundButton compoundButton, boolean z) {
        ((C0HZQ) c1775830wJR.l0).setChecked(!z);
        C1745180vW0.LJIIIZ((C0HZQ) c1775830wJR.l0);
    }
}
