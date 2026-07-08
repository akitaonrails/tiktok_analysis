package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0etb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106330etb {
    public static final void LIZ(SparkContext sparkContext) {
        Uri uri = UriProtector.parse(sparkContext.LJIJI());
        if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "need_cpc"), "1")) {
            sparkContext.LJJ(InterfaceC1106350etd.class, new InterfaceC1106350etd() { // from class: X.0etc
                @Override // X.InterfaceC1106350etd
                public final View LIZ() {
                    IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                    return ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).generateCPCTopView(iHostAction != null ? iHostAction.getTopContext() : null, true, AFwS205S0000000_17.get$arr$(140));
                }
            });
        }
        if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_title_bar"), "1") || Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_title_bar"), "true")) {
            sparkContext.LJJ(InterfaceC1106350etd.class, new C1106320eta(uri, sparkContext));
        }
    }
}
