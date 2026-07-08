package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0mHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.PopupMonitorServiceImpl$PopupMonitorSmartRouterInterceptor$onInterceptRoute$1", f = "PopupMonitorServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1390330mHf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RouteIntent LL;
    public final /* synthetic */ C1390660mIC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390330mHf(RouteIntent routeIntent, C1390660mIC c1390660mIC, InterfaceC1364105Vn<? super C1390330mHf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = routeIntent;
        this.LLILLJJLI = c1390660mIC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390330mHf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String url;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C1C7U.LIZ("PopupMonitorServiceImpl$PopupMonitorSmartRouterInterceptor@d8da.onInterceptRoute$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RouteIntent routeIntent = this.LL;
        if (routeIntent != null && (url = routeIntent.getUrl()) != null) {
            RouteIntent routeIntent2 = this.LL;
            C1390660mIC c1390660mIC = this.LLILLJJLI;
            String strLJJZ = a0.LJJZ(url, "?", url);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
            if (Intrinsics.LJFF(strLJJZ, "aweme://webview/")) {
                Uri uri = routeIntent2.getUri();
                if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = a0.LJJZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "?", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJJZ);
                sbLIZ.append("?url=");
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                strLJJZ = C2188811AlT.LIZIZ(sbLIZ);
            } else if (Intrinsics.LJFF(strLJJZ, "aweme://lynxview/")) {
                Uri uri2 = routeIntent2.getUri();
                if (uri2 != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "channel");
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJJZ);
                sbLIZ2.append("?channel=");
                sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                strLJJZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            PopupMonitorServiceImpl.LIZ.getClass();
            if (PopupMonitorServiceImpl.LJJJJI()) {
                c1390660mIC.LJFF = 1;
                C1390650mIB c1390650mIB = C1390650mIB.LIZ;
                EnumC1390310mHd enumC1390310mHd = EnumC1390310mHd.SMART_ROUTER;
                c1390650mIB.getClass();
                C1390650mIB.LJFF(strLJJZ, enumC1390310mHd, c1390660mIC, "", 1, "");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PopupMonitorServiceImpl$PopupMonitorSmartRouterInterceptor@d8da.onInterceptRoute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
