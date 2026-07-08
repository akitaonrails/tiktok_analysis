package X;

import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS71S1300000_1;
import kotlin.jvm.internal.AwS86S1200000_1;

/* JADX INFO: renamed from: X.038g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7940038g extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BillItem LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLL;
    public final /* synthetic */ C7970039k LLILZ;
    public final /* synthetic */ LinearLayout LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7940038g(BillItem billItem, Fragment fragment, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C7970039k c7970039k, LinearLayout linearLayout, Map<String, Object> map, String str) {
        super(0);
        this.LL = billItem;
        this.LLILLJJLI = fragment;
        this.LLILLL = orderSubmitAssemViewModel;
        this.LLILZ = c7970039k;
        this.LLILZIL = linearLayout;
        this.LLILZLL = map;
        this.LLIZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<String> list;
        FragmentManager fragmentManager;
        C7979039t c7979039tLJFF = C7969039j.LJFF(C7969039j.LIZ, this.LL.itemExplain, null, null, null, 14);
        Fragment fragment = this.LLILLJJLI;
        if (fragment != null && (fragmentManager = fragment.getFragmentManager()) != null) {
            LinearLayout linearLayout = this.LLILZIL;
            BillItem billItem = this.LL;
            Map<String, Object> map = this.LLILZLL;
            String str = this.LLIZ;
            C7939038f c7939038fLIZJ = C808003Dq.LIZJ(linearLayout.getContext(), c7979039tLJFF);
            String str2 = billItem.itemName;
            if (str2 == null) {
                str2 = "";
            }
            C808003Dq.LJFF(C808003Dq.LIZLLL(c7939038fLIZJ, str2, false, null, 60), fragmentManager, null, new AwS71S1300000_1(linearLayout, (LinearLayout) map, (Map<String, Object>) billItem, (BillItem) str, (String) 6), 4);
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILLL;
        if (orderSubmitAssemViewModel != null && (list = orderSubmitAssemViewModel.LLLIIL) != null) {
            ((ArrayList) list).add("click_price_icon");
        }
        C1748720vbi.LIZLLL(this.LLILZ, new C049Y(), new AwS86S1200000_1((Map) this.LLILZLL, (Map<String, Object>) this.LL, (BillItem) this.LLIZ, (String) 48));
        return Unit.LIZ;
    }
}
