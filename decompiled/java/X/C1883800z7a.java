package X;

import android.net.Uri;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0z7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883800z7a extends C09AY implements Function0<String> {
    public final /* synthetic */ MixSparkCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883800z7a(MixSparkCard mixSparkCard) {
        super(0);
        this.LL = mixSparkCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        List listLJJLIIIJILLIZJL;
        String str;
        Uri uri;
        String path;
        if (u.LJJIIJZLJL((String) this.LL.LLJJIJI.getValue(), "aweme://roma_redirect", false)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(((C0KYM) this.LL.LLJJIJIIJIL.getValue()).LIZ(), "spark_page");
            str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null ? strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter : "";
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lynx_card_");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        String strLIZIZ = C1107580evc.LIZIZ(((C0KYM) this.LL.LLJJIJIIJIL.getValue()).LIZ());
        if (strLIZIZ == null || (uri = UriProtector.parse(strLIZIZ)) == null || (path = uri.getPath()) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(path, new String[]{"/"}, 0, 6)) == null) {
            listLJJLIIIJILLIZJL = C13BV.INSTANCE;
        }
        String str2 = (String) C13LP.LJJJLZIJ(C1697810uHb.LJIIJ(listLJJLIIIJILLIZJL) - 1, listLJJLIIIJILLIZJL);
        str = str2 != null ? str2 : "";
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("lynx_card_");
        sbLIZ2.append(str);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
