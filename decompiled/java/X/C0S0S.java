package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.TransformLinkResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S0S, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.incentive.crossplatform.ReferralOneLinkManager$tryTransformOneLink$1", f = "ReferralOneLinkManager.kt", l = {}, m = "invokeSuspend")
public final class C0S0S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Uri LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S0S(Uri uri, InterfaceC1364105Vn<? super C0S0S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S0S(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String str;
        INetworkApi iNetworkApiLIZJ;
        ListenableFuture<TransformLinkResponse> listenableFutureTransformIncentiveLink;
        TransformLinkResponse transformLinkResponse;
        C1C7U.LIZ("ReferralOneLinkManager@3840.tryTransformOneLink$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            string = this.LL.toString();
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LL, "url");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ReferralOneLinkManager@3840.tryTransformOneLink$1");
            return unit;
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null && (listenableFutureTransformIncentiveLink = iNetworkApiLIZJ.transformIncentiveLink(string)) != null && (transformLinkResponse = listenableFutureTransformIncentiveLink.get()) != null) {
            str = transformLinkResponse.finalLink;
        } else {
            str = null;
        }
        C0S0T.LIZ.put(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ReferralOneLinkManager@3840.tryTransformOneLink$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
