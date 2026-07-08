package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.TTSProbeHeaderInterceptor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PipoRequestWrapper;
import com.ss.android.ugc.aweme.ecommerce.dependency.localtest.PipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.03bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C877403bo {
    public static final /* synthetic */ C877403bo LIZ = new C877403bo();
    public static final C01K1 LIZIZ;
    public static final IECRetrofitFactory LIZJ;

    static {
        AnonymousClass0317 anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin;
        InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin = PipoOfflineDependencyService.createIPipoOfflineDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IPipoOfflineDependencyService.class.getName(), anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPipoOfflineDependencyService.class);
        }
        C860003Xq.LIZ(interfaceC859903XpCreateBuilder, ((IPipoOfflineDependencyService) anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin).getNetworkInterceptor());
        LIZIZ = interfaceC859903XpCreateBuilder.build();
        LIZJ = (IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class);
    }

    public static C11NZ LIZ(PaymentListRequest paymentListRequest) {
        PaymentApi paymentApi;
        AnonymousClass0317 anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin;
        String name;
        if (C1008803x0.LIZ()) {
            InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/");
            interfaceC859903XpCreateBuilder.LIZ(new TTSProbeHeaderInterceptor());
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin = PipoOfflineDependencyService.createIPipoOfflineDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = IPipoOfflineDependencyService.class.getName();
                if (anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPipoOfflineDependencyService.class);
            }
            C860003Xq.LIZ(interfaceC859903XpCreateBuilder, ((IPipoOfflineDependencyService) anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin).getNetworkInterceptor());
            paymentApi = (PaymentApi) interfaceC859903XpCreateBuilder.build().create(PaymentApi.class);
        } else {
            paymentApi = (PaymentApi) LIZIZ.create(PaymentApi.class);
        }
        return paymentApi.LJ(paymentListRequest);
    }

    public static C11NZ LJ(BindInfoRequest bindInfoRequest) {
        return ((PaymentApi) LIZIZ.create(PaymentApi.class)).LJFF(bindInfoRequest);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a A[Catch: all -> 0x00f1, CancellationException -> 0x00f6, TryCatch #2 {CancellationException -> 0x00f6, all -> 0x00f1, blocks: (B:47:0x00eb, B:48:0x00ee, B:15:0x0037, B:17:0x0045, B:18:0x0050, B:20:0x0056, B:22:0x005c, B:25:0x0064, B:26:0x0068, B:33:0x007e, B:35:0x008a, B:36:0x0090, B:38:0x00a0, B:39:0x00a6, B:44:0x00e2, B:32:0x0076), top: B:56:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0 A[Catch: all -> 0x00f1, CancellationException -> 0x00f6, TryCatch #2 {CancellationException -> 0x00f6, all -> 0x00f1, blocks: (B:47:0x00eb, B:48:0x00ee, B:15:0x0037, B:17:0x0045, B:18:0x0050, B:20:0x0056, B:22:0x005c, B:25:0x0064, B:26:0x0068, B:33:0x007e, B:35:0x008a, B:36:0x0090, B:38:0x00a0, B:39:0x00a6, B:44:0x00e2, B:32:0x0076), top: B:56:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C897703f5 r21, X.InterfaceC1364105Vn<? super com.google.gson.n> r22) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C877403bo.LJFF(X.03f5, X.05Vn):java.lang.Object");
    }

    public static Object LIZIZ(String str, PipoRequestWrapper pipoRequestWrapper, InterfaceC1364105Vn interfaceC1364105Vn) {
        PaymentApi paymentApi;
        if (C1008803x0.LIZ()) {
            InterfaceC859903Xp interfaceC859903XpCreateBuilder = LIZJ.createBuilder(str);
            interfaceC859903XpCreateBuilder.LIZ(new TTSProbeHeaderInterceptor());
            paymentApi = (PaymentApi) interfaceC859903XpCreateBuilder.build().create(PaymentApi.class);
        } else {
            paymentApi = (PaymentApi) LIZJ.createBuilder(str).build().create(PaymentApi.class);
        }
        return paymentApi.paymentAppeal(pipoRequestWrapper.bizContent, pipoRequestWrapper.merchantId, pipoRequestWrapper.requestTime, pipoRequestWrapper.sign, pipoRequestWrapper.nonce, interfaceC1364105Vn);
    }

    public static Object LIZJ(String str, PipoRequestWrapper pipoRequestWrapper, InterfaceC1364105Vn interfaceC1364105Vn) {
        PaymentApi paymentApi;
        String str2;
        String str3;
        String str4;
        String str5;
        if (C1008803x0.LIZ()) {
            InterfaceC859903Xp interfaceC859903XpCreateBuilder = LIZJ.createBuilder(str);
            interfaceC859903XpCreateBuilder.LIZ(new TTSProbeHeaderInterceptor());
            paymentApi = (PaymentApi) interfaceC859903XpCreateBuilder.build().create(PaymentApi.class);
        } else {
            paymentApi = (PaymentApi) LIZJ.createBuilder(str).build().create(PaymentApi.class);
        }
        String str6 = null;
        if (pipoRequestWrapper != null) {
            str2 = pipoRequestWrapper.merchantId;
            str3 = pipoRequestWrapper.requestTime;
            str4 = pipoRequestWrapper.sign;
            str5 = pipoRequestWrapper.bizContent;
            str6 = pipoRequestWrapper.nonce;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        return paymentApi.paymentBindAndSetPrimarySuspendForm(str2, str3, str4, str5, str6, interfaceC1364105Vn);
    }

    public static Object LIZLLL(String str, PipoRequestWrapper pipoRequestWrapper, C898503fD c898503fD) {
        PaymentApi paymentApi;
        if (C1008803x0.LIZ()) {
            InterfaceC859903Xp interfaceC859903XpCreateBuilder = LIZJ.createBuilder(str);
            interfaceC859903XpCreateBuilder.LIZ(new TTSProbeHeaderInterceptor());
            paymentApi = (PaymentApi) interfaceC859903XpCreateBuilder.build().create(PaymentApi.class);
        } else {
            paymentApi = (PaymentApi) LIZJ.createBuilder(str).build().create(PaymentApi.class);
        }
        return paymentApi.paymentPreBindVerify(pipoRequestWrapper.merchantId, pipoRequestWrapper.requestTime, pipoRequestWrapper.sign, pipoRequestWrapper.bizContent, pipoRequestWrapper.nonce, c898503fD);
    }
}
