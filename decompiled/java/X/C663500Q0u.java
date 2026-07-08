package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import defpackage.x;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663500Q0u {
    public static void LIZ(AbstractC1549150qPp abstractC1549150qPp, x.b bVar, CompletionBlock completionBlock) {
        Context context;
        View view;
        String schema = bVar.getSchema();
        InterfaceC634840OvC interfaceC634840OvC = abstractC1549150qPp.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (C2196708j7.LIZ(context, schema)) {
            C2382909Vj.LIZ(completionBlock, 0, "search top1 plugin unavailable", null, 4);
            return;
        }
        C663530Q0x.LIZ.getClass();
        InterfaceC663520Q0w interfaceC663520Q0wLIZ = C663530Q0x.LIZ(schema);
        if (interfaceC663520Q0wLIZ == null) {
            interfaceC663520Q0wLIZ = new C0Q0Z();
        }
        interfaceC663520Q0wLIZ.LIZJ(completionBlock);
        interfaceC663520Q0wLIZ.LIZ(abstractC1549150qPp.IBridgeSdkContext);
        interfaceC663520Q0wLIZ.LIZIZ(bVar);
    }

    public static void LIZIZ(String str, View view, Map map) {
        Object c098200Yq;
        Object c098200Yq2;
        if (str != null && str.length() != 0) {
            Uri uri = UriProtector.parse(str);
            try {
                c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_c_code");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str2 = (String) c098200Yq;
            try {
                c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_d_code");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            String str3 = (String) obj;
            if (view != null) {
                IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
                if (str2 == null) {
                    str2 = "c0";
                }
                if (str3 == null) {
                    str3 = "d0";
                }
                iEcomSearchService.LJJLIIJ(view, str2, str3, map, null);
            }
        }
    }
}
