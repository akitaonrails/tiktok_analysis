package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.17uA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21177617uA extends AbstractC21202217y8 {
    public boolean LLILZLL;
    public final Map<String, String> LLIZ;
    public PopupCardVO LLIZLLLIL;

    @Override // X.InterfaceC21184117vD
    public void b0(ProductItem productItem) {
    }

    @Override // X.AbstractC21202217y8
    public abstract /* synthetic */ Map<String, String> getCommonShowParams();

    @Override // X.AbstractC21202217y8
    public abstract /* synthetic */ void setAtmosphereTags(List<AtmosphereTag> list);

    @Override // X.AbstractC21202217y8, X.InterfaceC21184117vD
    public List<String> getProductShowIds() {
        PopupCardVO popupCardVO = this.LLIZLLLIL;
        return Collections.singletonList(String.valueOf(popupCardVO != null ? Long.valueOf(popupCardVO.productId) : null));
    }

    public AbstractC21177617uA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZ = new LinkedHashMap();
    }
}
