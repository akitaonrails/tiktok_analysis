package X;

import com.bytedance.android.livesdk.model.message.Img;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.17vD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC21184117vD {
    void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0);

    void LJJIIZI(String str, Img img);

    void LJJLIIIJILLIZJL(boolean z);

    void LJJLIIIJLJLI(PopupCardVO popupCardVO, String str);

    void b0(ProductItem productItem);

    List<String> getProductShowIds();
}
