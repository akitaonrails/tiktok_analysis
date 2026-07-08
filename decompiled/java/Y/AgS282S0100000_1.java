package Y;

import X.C047L;
import X.C047Y;
import X.C04BG;
import X.C04EM;
import X.C099R;
import X.C21578619ce;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuBodyReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.RecommendListResponse;
import kotlin.Unit;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class AgS282S0100000_1 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS282S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$0(AgS282S0100000_1 agS282S0100000_1, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        RecommendListResponse recommendListResponse;
        String str;
        Response response = (Response) obj;
        ((C04BG) agS282S0100000_1.l0).LJFF = true;
        if (response != null && (recommendListResponse = (RecommendListResponse) response.data) != null && (str = recommendListResponse.data) != null && response.isCodeOK()) {
            ((C04BG) agS282S0100000_1.l0).LJI = "success";
            ((C04BG) agS282S0100000_1.l0).LIZJ = str;
        } else {
            ((C04BG) agS282S0100000_1.l0).LJI = "error";
        }
        C04BG c04bg = (C04BG) agS282S0100000_1.l0;
        c04bg.LIZ.setState(new AwS580S0100000_1(c04bg, 17));
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS282S0100000_1 agS282S0100000_1, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        View childAt;
        C047L c047l = (C047L) obj;
        int i = c047l.LIZIZ;
        if (i >= 0) {
            LinearLayout linearLayout = ((SkuBodyReusedAssem) agS282S0100000_1.l0).LLJZ;
            int top = 0;
            if (linearLayout != null && i < linearLayout.getChildCount()) {
                LinearLayout linearLayout2 = ((SkuBodyReusedAssem) agS282S0100000_1.l0).LLJZ;
                if (linearLayout2 != null) {
                    childAt = linearLayout2.getChildAt(c047l.LIZIZ);
                } else {
                    childAt = null;
                }
                int[] iArr = new int[2];
                if (childAt != null) {
                    childAt.getLocationOnScreen(iArr);
                    top = childAt.getTop();
                }
                Object objEmit = ((SkuBodyReusedAssem) agS282S0100000_1.l0).getViewModel().LLJJIJIL.emit(new C047Y(c047l.LIZIZ, top), interfaceC1364105Vn);
                if (objEmit != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return objEmit;
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS282S0100000_1 agS282S0100000_1, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C047Y c047y = (C047Y) obj;
        C21578619ce c21578619ce = ((SeaSkuPanelFragment) agS282S0100000_1.l0).LLJILLL;
        if (c21578619ce != null) {
            int[] iArr = new int[2];
            c21578619ce.getLocationOnScreen(iArr);
            c21578619ce.smoothScrollBy(0, c047y.LIZIZ - iArr[1]);
        }
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS282S0100000_1 agS282S0100000_1, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C047L c047l = (C047L) obj;
        int i = c047l.LIZIZ;
        if (i >= 0) {
            C04EM c04em = ((SkuWidget) agS282S0100000_1.l0).LLJILJILJ;
            C04EM c04em2 = null;
            if (c04em == null) {
                c04em = null;
            }
            if (i < c04em.getChildCount()) {
                C04EM c04em3 = ((SkuWidget) agS282S0100000_1.l0).LLJILJILJ;
                if (c04em3 != null) {
                    c04em2 = c04em3;
                }
                int[] iArr = new int[2];
                c04em2.getChildAt(c047l.LIZIZ).getLocationOnScreen(iArr);
                Object objEmit = ((SkuWidget) agS282S0100000_1.l0).LJII().LLJJIJIL.emit(new C047Y(c047l.LIZIZ, iArr[1]), interfaceC1364105Vn);
                if (objEmit != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return objEmit;
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS282S0100000_1 agS282S0100000_1, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        SkuPanelAssem skuPanelAssem = (SkuPanelAssem) agS282S0100000_1.l0;
        skuPanelAssem.withState(skuPanelAssem.Lo(), new AwS367S0200000_1((SkuPanelAssem) agS282S0100000_1.l0, (C047Y) obj, 182));
        return Unit.LIZ;
    }
}
