package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03Nd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C832703Nd extends C09AY implements Function1<C2262851Dhb, C2262851Dhb> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ C259800zU<C722302rt> LLILLL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C259800zU<Integer> LLILZLL;
    public final /* synthetic */ C259800zU<ECRichText> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ C259800zU<C2262991Dhp> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C832703Nd(C013C c013c, C259800zU<String> c259800zU, C259800zU<C722302rt> c259800zU2, OrderSubmitAssemViewModel orderSubmitAssemViewModel, int i, C259800zU<Integer> c259800zU3, C259800zU<ECRichText> c259800zU4, boolean z, C259800zU<C2262991Dhp> c259800zU5) {
        super(1);
        this.LL = c013c;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = orderSubmitAssemViewModel;
        this.LLILZIL = i;
        this.LLILZLL = c259800zU3;
        this.LLIZ = c259800zU4;
        this.LLIZLLLIL = z;
        this.LLJ = c259800zU5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2262851Dhb invoke(C2262851Dhb c2262851Dhb) {
        Price price;
        Integer num;
        BillInfoSetting billInfoSetting;
        C2262851Dhb c2262851Dhb2 = c2262851Dhb;
        C833003Ng c833003Ng = new C833003Ng(this.LL.element, 2);
        String str = this.LLILLJJLI.element;
        C722302rt c722302rt = this.LLILLL.element;
        if (c722302rt != null) {
            price = c722302rt.LLIZ;
        } else {
            price = null;
        }
        BillInfoData billInfoData = this.LLILZ.LLJJI;
        if (billInfoData != null && (billInfoSetting = billInfoData.settings) != null) {
            num = billInfoSetting.totalPriceStyle;
        } else {
            num = null;
        }
        return C2262851Dhb.LIZ(c2262851Dhb2, null, null, new C2262861Dhc(c833003Ng, str, price, num, Integer.valueOf(this.LLILZIL), this.LLILZLL.element, this.LLIZ.element, (String) null, Boolean.valueOf(this.LLIZLLLIL), this.LLJ.element, (Boolean) null, (Integer) null, 6528), null, null, null, null, null, null, null, null, 2043);
    }
}
