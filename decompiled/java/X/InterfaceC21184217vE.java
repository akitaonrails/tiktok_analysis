package X;

import com.bytedance.android.livesdk.model.message.Img;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.17vE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC21184217vE {
    void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0);

    void LJJIIZI(String str, Img img);

    void LJJLIIIJILLIZJL(boolean z);

    boolean LLLLLZ();

    void U(ProductItem productItem, C1563990qnl c1563990qnl);

    List<String> getProductShowIds();

    void u(UsPopupCardVO usPopupCardVO, String str, Map<String, ? extends Object> map);
}
