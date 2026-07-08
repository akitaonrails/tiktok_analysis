package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.ActivityUserSelection;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherMeta;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.037J, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C037J {
    public final OrderSubmitAssemViewModel LIZ;
    public List<String> LIZIZ;
    public List<VoucherMeta> LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public boolean LJFF;
    public ActivityUserSelection LJI;
    public final List<VoucherInfoNew> LJII = new ArrayList();
    public final HashMap<String, List<VoucherInfoNew>> LJIIIIZZ = new HashMap<>();

    public final List<VoucherInfoNew> LIZ() {
        ArrayList arrayList = new ArrayList();
        C037K.LIZ(new C5183020f((List) arrayList, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 348), this.LJIIIIZZ);
        C037K.LIZ(new C5183020f((List) arrayList, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 349), this.LJII);
        return arrayList;
    }

    public C037J(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
    }

    public final void LIZIZ(BillInfoData billInfoData) {
        C037K.LIZ(new AwS580S0100000_1(billInfoData, 986), this.LJII);
        C037K.LIZ(new AwS580S0100000_1(billInfoData, 987), this.LJIIIIZZ);
        String str = billInfoData.useUserSelection;
        if (str != null) {
            this.LIZLLL = Boolean.parseBoolean(str);
        }
        this.LIZIZ = null;
        this.LIZJ = null;
    }
}
