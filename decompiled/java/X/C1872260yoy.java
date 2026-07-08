package X;

import Y.ARunnableS0S4201000_16;
import android.text.TextUtils;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yoy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872260yoy extends AbstractC1872290yp1 {
    public final ExecutorService LIZJ() {
        C1871520ynm c1871520ynm;
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        C1871520ynm c1871520ynm2 = (C1871520ynm) provideContext(C1871520ynm.class);
        return (((c1871520ynm2 == null || (iHostThreadPoolExecutorDepend = c1871520ynm2.LJIIJ) == null) && ((c1871520ynm = C1871520ynm.LJIIL) == null || (iHostThreadPoolExecutorDepend = c1871520ynm.LJIIJ) == null)) || (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) == null) ? C2126108Up.LIZ : normalThreadExecutor;
    }

    public final IHostNetworkDepend LIZLLL() {
        IHostNetworkDepend iHostNetworkDepend;
        IHostNetworkDepend iHostNetworkDepend2;
        C1871520ynm c1871520ynm = (C1871520ynm) provideContext(C1871520ynm.class);
        if (c1871520ynm != null && (iHostNetworkDepend2 = c1871520ynm.LJIIIIZZ) != null) {
            return iHostNetworkDepend2;
        }
        C1871520ynm c1871520ynm2 = C1871520ynm.LJIIL;
        return (c1871520ynm2 == null || (iHostNetworkDepend = c1871520ynm2.LJIIIIZZ) == null) ? new C1515160pX0() : iHostNetworkDepend;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, final EnumC1063300dmC enumC1063300dmC) {
        final HashMap map;
        final int iIntValue;
        final InterfaceC1872270yoz interfaceC1872270yoz = (InterfaceC1872270yoz) xBaseParamModel;
        C1544050qHb c1544050qHb = C1544050qHb.LIZ;
        String jsbSecureDataflowId = interfaceC1872270yoz.getJsbSecureDataflowId();
        String name = getName();
        c1544050qHb.getClass();
        C443120HZe c443120HZeLIZ = C1544050qHb.LIZ(jsbSecureDataflowId, name);
        final Integer num = (Integer) c443120HZeLIZ.getSecond();
        if (num == null) {
            C2382909Vj.LIZ(completionBlock, 0, (String) c443120HZeLIZ.getThird(), null, 4);
            return;
        }
        final String url = interfaceC1872270yoz.getUrl();
        final Map<String, Object> header = interfaceC1872270yoz.getHeader();
        if (header == null) {
            header = new LinkedHashMap<>();
        }
        final String method = interfaceC1872270yoz.getMethod();
        final String bodyType = interfaceC1872270yoz.getBodyType();
        final Object body = interfaceC1872270yoz.getBody();
        final boolean zLJFF = Intrinsics.LJFF(interfaceC1872270yoz.getDisableRedirect(), Boolean.TRUE);
        Map<String, Object> params = interfaceC1872270yoz.getParams();
        if (params instanceof HashMap) {
            map = (HashMap) params;
        } else {
            map = null;
        }
        Number jsonFormatOption = interfaceC1872270yoz.getJsonFormatOption();
        if (jsonFormatOption != null) {
            iIntValue = jsonFormatOption.intValue();
        } else {
            iIntValue = 0;
        }
        if (TextUtils.isEmpty(interfaceC1872270yoz.getUrl())) {
            LJ(-3, method, interfaceC1872270yoz.getUrl(), "Illegal empty url", 0, enumC1063300dmC.name());
            C2382909Vj.LIZ(completionBlock, -3, "url is empty", null, 4);
        } else {
            final String hybridUrl = getHybridUrl(enumC1063300dmC);
            LIZJ().execute(new Runnable(header, interfaceC1872270yoz, map, enumC1063300dmC, this, method, body, bodyType, iIntValue, zLJFF, num, hybridUrl, completionBlock, url) { // from class: X.0yow
                public final /* synthetic */ Map<String, Object> LL;
                public final /* synthetic */ InterfaceC1872270yoz LLILLJJLI;
                public final /* synthetic */ HashMap<String, Object> LLILLL;
                public final /* synthetic */ EnumC1063300dmC LLILZ;
                public final /* synthetic */ C1872260yoy LLILZIL;
                public final /* synthetic */ String LLILZLL;
                public final /* synthetic */ Object LLIZ;
                public final /* synthetic */ String LLIZLLLIL;
                public final /* synthetic */ int LLJ;
                public final /* synthetic */ boolean LLJI;
                public final /* synthetic */ Integer LLJIJIL;
                public final /* synthetic */ CompletionBlock<InterfaceC1872280yp0> LLJILJIL;
                public final /* synthetic */ String LLJILJILJ;

                {
                    this.LLJILJIL = completionBlock;
                    this.LLJILJILJ = url;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 640
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1872240yow.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("XRequestForThirdMethodIDL@e66c.handle$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("XRequestForThirdMethodIDL@e66c.handle$1");
                }
            });
        }
    }

    public final void LJ(int i, String str, String str2, String str3, Integer num, String str4) {
        LIZJ().execute(new ARunnableS0S4201000_16(str4, this, str2, i, str3, str, num, 0));
    }
}
