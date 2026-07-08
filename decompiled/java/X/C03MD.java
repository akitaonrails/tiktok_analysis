package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonAreaSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PriceSubText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03MD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MD extends C09AY implements Function1<C03JV, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C259800zU<C722302rt> LLILLJJLI;
    public final /* synthetic */ C259800zU<ECRichText> LLILLL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILZ;
    public final /* synthetic */ C259800zU<C2262991Dhp> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ C259800zU<Integer> LLIZLLLIL;
    public final /* synthetic */ C03MC LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03MD(C013C c013c, C259800zU c259800zU, C259800zU c259800zU2, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C259800zU c259800zU3, boolean z, C259800zU c259800zU4, C259800zU c259800zU5, C03MC c03mc) {
        super(1);
        this.LL = c013c;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = orderSubmitAssemViewModel;
        this.LLILZIL = c259800zU3;
        this.LLILZLL = z;
        this.LLIZ = c259800zU4;
        this.LLIZLLLIL = c259800zU5;
        this.LLJ = c03mc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.02rt] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, X.1Dhp] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C03JV c03jv) {
        T t;
        T t2;
        BillInfoSetting billInfoSetting;
        ButtonAreaSetting buttonAreaSetting;
        String priceStr;
        String priceStr2;
        Summary summary;
        Price price;
        Summary summary2;
        Price price2;
        Price price3;
        PriceSubText priceSubText;
        C03JV c03jv2 = c03jv;
        C013C c013c = this.LL;
        Boolean bool = c03jv2.LLIZLLLIL;
        Boolean bool2 = Boolean.TRUE;
        c013c.element = Intrinsics.LJFF(bool, bool2);
        C259800zU<C722302rt> c259800zU = this.LLILLJJLI;
        ?? r0 = c03jv2.LLILLL;
        c259800zU.element = r0;
        C259800zU<ECRichText> c259800zU2 = this.LLILLL;
        String str = null;
        str = null;
        if (r0 != 0 && (priceSubText = r0.LLJJIII) != null) {
            t = priceSubText.richText;
        } else {
            t = 0;
        }
        c259800zU2.element = t;
        C722302rt c722302rt = c259800zU.element;
        if (c722302rt != null && (price3 = c722302rt.LLIZ) != null) {
            String priceStr3 = price3.getPriceStr();
            str = priceStr3;
            if (priceStr3 != null) {
                ((ArrayList) this.LLJ.LIZ().LLJI).add(priceStr3);
                str = priceStr3;
            }
        }
        if (Intrinsics.LJFF(this.LLILZ.LLLLZLLIL, bool2)) {
            BillInfoData billInfoData = this.LLILZ.LLJJI;
            if (billInfoData == null || (summary2 = billInfoData.summary) == null || (price2 = summary2.total) == null || (priceStr = price2.getPriceStr()) == null) {
                priceStr = "";
            }
            C259800zU<C2262991Dhp> c259800zU3 = this.LLILZIL;
            BillInfoData billInfoData2 = this.LLILZ.LLJJI;
            if (billInfoData2 == null || (summary = billInfoData2.summary) == null || (price = summary.origin) == null || (priceStr2 = price.getPriceStr()) == null) {
                priceStr2 = "";
            }
            c259800zU3.element = new C2262991Dhp(priceStr, priceStr2, 4);
        } else if (!this.LLILZLL) {
            C259800zU<String> c259800zU4 = this.LLIZ;
            if (str == null) {
                t2 = "";
            } else {
                t2 = str;
            }
            c259800zU4.element = t2;
        }
        if (this.LLILZLL) {
            C259800zU<String> c259800zU5 = this.LLIZ;
            T t3 = str;
            if (str == null) {
                t3 = "";
            }
            c259800zU5.element = t3;
        }
        BillInfoData billInfoData3 = this.LLILZ.LLJJI;
        if (billInfoData3 != null && (billInfoSetting = billInfoData3.settings) != null && (buttonAreaSetting = billInfoSetting.buttonAreaSetting) != null && Intrinsics.LJFF(buttonAreaSetting.highlightTotalPrice, bool2)) {
            this.LLIZLLLIL.element = Integer.valueOf(R.attr.a1r);
        }
        this.LLJ.LIZ().setState(new C832703Nd(this.LL, this.LLIZ, this.LLILLJJLI, this.LLILZ, 32, this.LLIZLLLIL, this.LLILLL, this.LLILZLL, this.LLILZIL));
        return Unit.LIZ;
    }
}
