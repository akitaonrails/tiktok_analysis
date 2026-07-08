package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Az, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1055904Az extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Voucher LL;
    public final /* synthetic */ C1054104Ah LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055904Az(int i, Voucher voucher, C1054104Ah c1054104Ah, String str, String str2) {
        super(0);
        this.LL = voucher;
        this.LLILLJJLI = c1054104Ah;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        InstanceInfo instanceInfo;
        String instanceKey;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String voucherTypeID = this.LL.getVoucherTypeID();
        String str2 = "";
        if (voucherTypeID == null) {
            voucherTypeID = "";
        }
        sbLIZ.append(voucherTypeID);
        List<InstanceInfo> instanceInfoList = this.LL.getInstanceInfoList();
        if (instanceInfoList != null && (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) != null && (instanceKey = instanceInfo.getInstanceKey()) != null) {
            str2 = instanceKey;
        }
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LLILLJJLI.LJJJJIZL.contains(strLIZIZ)) {
            this.LLILLJJLI.LJJJJIZL.add(strLIZIZ);
            C04DE c04de = new C04DE();
            Voucher voucher = this.LL;
            C1054104Ah c1054104Ah = this.LLILLJJLI;
            String str3 = this.LLILLL;
            String str4 = this.LLILZ;
            int i = this.LLILZIL;
            C04CA.LJ(C04CA.LIZLLL(voucher), c04de, c1054104Ah.LIZIZ);
            if (str3 != null) {
                c04de.LIZIZ.put("is_coupon_available", str3);
            }
            if (str4 == null) {
                str4 = "discounts_module";
            }
            c04de.LJFF(str4);
            c04de.LJ(Integer.valueOf(i));
            Integer costType = voucher.getCostType();
            if (costType != null) {
                int iIntValue = costType.intValue();
                if (iIntValue != 2) {
                    str = iIntValue == 3 ? "seller_min_spend_off" : "seller_free_shipping";
                }
                c04de.LIZIZ.put("coupon_cost_type", str);
            }
            c04de.LIZIZ();
        }
        return Unit.LIZ;
    }
}
