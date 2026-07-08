package X;

import android.os.SystemClock;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.TTSProbeHeaderInterceptor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckIdentityRequest;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcTransactionPbSwitch;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcTransactionRequestOpt;
import com.ss.android.ugc.aweme.ecommerce.dependency.localtest.PipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.proto.ChunkComposePJResponseBodyConverter;
import com.ss.android.ugc.aweme.ecommerce.proto.EcomPbRequestInterceptor;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C859403Xk {
    public static final /* synthetic */ C859403Xk LIZ = new C859403Xk();
    public static final C01K1 LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0pJz] */
    static {
        AnonymousClass0317 anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin;
        InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/");
        interfaceC859903XpCreateBuilder.LIZJ();
        interfaceC859903XpCreateBuilder.LIZ(EcomPbRequestInterceptor.LL);
        interfaceC859903XpCreateBuilder.LIZ(new TTSProbeHeaderInterceptor());
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
        interfaceC859903XpCreateBuilder.LIZLLL(new AbstractC2343909Gj(C7740030o.LIZ().getGson(), EcTransactionPbSwitch.LIZ().ospEnableAsyncDataParse, EcTransactionPbSwitch.LIZ().ospEnableAsyncDispatch) { // from class: X.0pJz
            public final Gson LIZ;
            public final InterfaceC1515510pXZ LIZIZ;
            public final boolean LIZJ;
            public final boolean LIZLLL;

            {
                C0CWR c0cwr = C0CWR.LIZ;
                this.LIZ = gson;
                this.LIZIZ = c0cwr;
                this.LIZJ = z;
                this.LIZLLL = z;
            }

            @Override // X.AbstractC2343909Gj
            public final InterfaceC1501660pBE<TypedInput, ?> LJ(Type type, Annotation[] annotationArr, Retrofit retrofit) {
                Class cls;
                if (!(type instanceof ParameterizedType)) {
                    return null;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                if (!(rawType instanceof Class) || (cls = (Class) rawType) == null || !C1515820pY4.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    Type type2 = actualTypeArguments[0];
                    if (type2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                        if (Intrinsics.LJFF(parameterizedType2.getRawType(), ComposePbAndJson.class)) {
                            return new ChunkComposePJResponseBodyConverter(parameterizedType2, this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
                        }
                    }
                    return null;
                }
                throw new RuntimeException("ChunkBundle should have one generic type.");
            }
        });
        if (!EcTransactionRequestOpt.LIZ()) {
            interfaceC859903XpCreateBuilder.LIZ(new GecNetInterceptor());
        }
        LIZIZ = interfaceC859903XpCreateBuilder.build();
    }

    public static HashMap LIZLLL(String str) {
        HashMap map = new HashMap();
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("biz_type", str);
        return map;
    }

    public static Object LIZIZ(CheckIdentityRequest checkIdentityRequest, C1749080vcI c1749080vcI) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c1749080vcI));
        ((OrderSubmitApi) LIZIZ.create(OrderSubmitApi.class)).LIZJ(checkIdentityRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C1077404Jg(c23260099m, 5));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c1749080vcI);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C859703Xn
            if (r0 == 0) goto L20
            r4 = r7
            X.03Xn r4 = (X.C859703Xn) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L26
        L20:
            X.03Xn r4 = new X.03Xn
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4f
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C859403Xk.LIZIZ     // Catch: java.lang.Exception -> L4f
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi.class
            java.lang.Object r1 = r1.create(r0)     // Catch: java.lang.Exception -> L4f
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi) r1     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = r6.LIZ     // Catch: java.lang.Exception -> L4f
            java.util.HashMap r0 = LIZLLL(r0)     // Catch: java.lang.Exception -> L4f
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4f
            java.lang.Object r1 = r1.cancelOrder(r6, r0, r4)     // Catch: java.lang.Exception -> L4f
            if (r1 != r3) goto L4e
            return r3
        L4e:
            return r1
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r3 = r0.toString()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse r2 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse
            r1 = 0
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r0, r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C859403Xk.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest r6, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C859803Xo
            if (r0 == 0) goto L20
            r4 = r7
            X.03Xo r4 = (X.C859803Xo) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L26
        L20:
            X.03Xo r4 = new X.03Xo
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4f
            return r1
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C859403Xk.LIZIZ     // Catch: java.lang.Exception -> L4f
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi.class
            java.lang.Object r1 = r1.create(r0)     // Catch: java.lang.Exception -> L4f
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi) r1     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = r6.LIZ     // Catch: java.lang.Exception -> L4f
            java.util.HashMap r0 = LIZLLL(r0)     // Catch: java.lang.Exception -> L4f
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4f
            java.lang.Object r1 = r1.couponCancelOrder(r6, r0, r4)     // Catch: java.lang.Exception -> L4f
            if (r1 != r3) goto L4e
            return r3
        L4e:
            return r1
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r3 = r0.toString()
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse r2 = new com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse
            r1 = 0
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r0, r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C859403Xk.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest, X.05Vn):java.lang.Object");
    }
}
