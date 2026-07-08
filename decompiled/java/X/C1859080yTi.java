package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAnyCard;
import java.util.Map;

/* JADX INFO: renamed from: X.0yTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859080yTi implements C0R2N, InterfaceC1587906Jp {
    public final /* synthetic */ TakoAnyCard LL;

    @Override // X.C0R2N
    public final String LIZ() {
        Integer num;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        TakoAnyCard takoAnyCard = this.LL;
        return (takoAnyCard == null || (num = takoAnyCard.category) == null || num.intValue() != 2 || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(takoAnyCard.schema), "templates")) == null) ? "" : strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    @Override // X.C0R2N
    public final Map<String, Object> getRawData() {
        TakoAnyCard takoAnyCard = this.LL;
        return C1905490zgZ.LIZ(takoAnyCard != null ? takoAnyCard.rawData : null);
    }

    public C1859080yTi(TakoAnyCard takoAnyCard) {
        this.LL = takoAnyCard;
    }
}
