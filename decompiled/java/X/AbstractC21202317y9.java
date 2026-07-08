package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.17y9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21202317y9 extends AbstractC21202917yF {
    public boolean LLILZIL;
    public final Map<String, String> LLILZLL;
    public UsPopupCardVO LLIZ;

    @Override // X.InterfaceC21184217vE
    public boolean LLLLLZ() {
        return false;
    }

    public void U(ProductItem productItem, C1563990qnl c1563990qnl) {
    }

    @Override // X.AbstractC21202917yF
    public abstract /* synthetic */ Map<String, String> getCommonShowParams();

    @Override // X.AbstractC21202917yF
    public abstract /* synthetic */ void setAtmosphereTags(List<C184F> list);

    @Override // X.AbstractC21202917yF, X.InterfaceC21184217vE
    public List<String> getProductShowIds() {
        UsPopupCardVO usPopupCardVO = this.LLIZ;
        return Collections.singletonList(String.valueOf(usPopupCardVO != null ? Long.valueOf(usPopupCardVO.productId) : null));
    }

    public AbstractC21202317y9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZLL = new LinkedHashMap();
    }
}
