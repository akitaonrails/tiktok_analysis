package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.eu.bonus.BonusInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.bonus.USHalfPageBonusCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.04JO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JO implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onCheckedChanged$0(C04JO c04jo, CompoundButton compoundButton, boolean z) {
        C0P0T c0p0t = ((USHalfPageBonusCell) c04jo.l0).LLJI;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        ((USHalfPageBonusCell) c04jo.l0).L5().q = compoundButton.isChecked();
        OrderSubmitAssemViewModel.OS2(((USHalfPageBonusCell) c04jo.l0).L5(), false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.USE_BONUS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
        ((BonusInfo) c04jo.l1).useBonusRedeem = Boolean.valueOf(compoundButton.isChecked());
        C1748720vbi.LIZLLL((C21411818qq) c04jo.l2, new C10516049i(), new AwS367S0200000_1((USHalfPageBonusCell) c04jo.l0, (BonusInfo) c04jo.l1, 164));
    }

    public static final void onCheckedChanged$1(C04JO c04jo, CompoundButton compoundButton, boolean z) {
        C0P0T c0p0t = ((BonusInfoCell) c04jo.l0).LLJI;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        ((BonusInfoCell) c04jo.l0).L5().q = compoundButton.isChecked();
        OrderSubmitAssemViewModel.OS2(((BonusInfoCell) c04jo.l0).L5(), false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.USE_BONUS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380415);
        ((BonusInfo) c04jo.l1).useBonusRedeem = Boolean.valueOf(compoundButton.isChecked());
        C1748720vbi.LIZLLL((C21411818qq) c04jo.l2, new C10516049i(), new AwS367S0200000_1((BonusInfoCell) c04jo.l0, (BonusInfo) c04jo.l1, 388));
    }

    public C04JO(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
