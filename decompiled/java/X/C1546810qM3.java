package X;

import com.bytedance.lynx.hybrid.i18n.SparkI18nManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0qM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546810qM3 extends AbstractC1546850qM7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        String containerID;
        InterfaceC1546900qMC interfaceC1546900qMC = (InterfaceC1546900qMC) xBaseParamModel;
        InterfaceC1546930qMF i18nXMeta = interfaceC1546900qMC.getI18nXMeta();
        String str = "";
        final C1537480q70 hybridContext = null;
        if (i18nXMeta != null) {
            try {
                Map<String, Object> convertMap = i18nXMeta.getDetail().getConvertMap();
                ArrayList arrayList = new ArrayList(convertMap.size());
                for (Map.Entry<String, Object> entry : convertMap.entrySet()) {
                    arrayList.add(new Pair(entry.getKey(), (String) entry.getValue()));
                }
                c098200Yq = C2097608Jq.LJIILLIIL(arrayList);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Map map = (Map) c098200Yq;
            if (map != null) {
                String channel = i18nXMeta.getChannel();
                String keysetVersion = i18nXMeta.getKeysetVersion();
                String pageKeysetVersion = i18nXMeta.getPageKeysetVersion();
                Set setLLIIJI = C13LP.LLIIJI(i18nXMeta.getDetail().getLangTags());
                String publicPath = i18nXMeta.getDetail().getPublicPath();
                String hash = i18nXMeta.getDetail().getHash();
                if (hash == null) {
                    hash = "";
                }
                SparkI18nManager.Meta meta = new SparkI18nManager.Meta(channel, keysetVersion, pageKeysetVersion, new SparkI18nManager.ResDetail(setLLIIJI, publicPath, hash, map));
                if (meta != null) {
                    C1529870puj c1529870puj = C1529870puj.LIZ;
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
                        str = containerID;
                    }
                    c1529870puj.getClass();
                    InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str);
                    if (interfaceC1541990qEHLJFF != null) {
                        hybridContext = interfaceC1541990qEHLJFF.getHybridContext();
                    }
                    if (hybridContext != null) {
                        C1530570pvr.LIZJ(hybridContext, new EnumC1537220q6a[]{EnumC1537220q6a.I18N_LOAD_ASYNC_START}, null);
                    }
                    final C259800zU c259800zU = new C259800zU();
                    ?? locale = interfaceC1546900qMC.getLocale();
                    c259800zU.element = locale;
                    if (locale == 0 || a0.LJJJIL(locale)) {
                        SparkI18nManager.LIZ.getClass();
                        c259800zU.element = SparkI18nManager.LIZ();
                    }
                    SparkI18nManager sparkI18nManager = SparkI18nManager.LIZ;
                    C1540610qC3 c1540610qC3 = new C1540610qC3(meta, (String) c259800zU.element, interfaceC1546900qMC.getUseLatest(), null, 8);
                    InterfaceC1546990qML interfaceC1546990qML = new InterfaceC1546990qML() { // from class: X.0q6S
                        @Override // X.InterfaceC1546990qML
                        public final void LIZ(Object obj) {
                            String str2;
                            CompletionBlock<InterfaceC1537160q6U> completionBlock2 = completionBlock;
                            C1537480q70 c1537480q70 = hybridContext;
                            C259800zU<String> c259800zU2 = c259800zU;
                            if (C189200o6.m8isSuccessimpl(obj)) {
                                C1536580q5Y c1536580q5Y = (C1536580q5Y) obj;
                                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1537160q6U.class, null);
                                InterfaceC1537160q6U interfaceC1537160q6U = (InterfaceC1537160q6U) xBaseModelLIZJ;
                                interfaceC1537160q6U.setLocale(c259800zU2.element);
                                interfaceC1537160q6U.setResource(c1536580q5Y.LIZ);
                                interfaceC1537160q6U.setUpdateTime(Long.valueOf(c1536580q5Y.LIZJ));
                                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                                if (c1537480q70 != null) {
                                    EnumC1537150q6T enumC1537150q6T = EnumC1537150q6T.I18N_LOAD_ASYNC_FROM;
                                    if (c1536580q5Y.LIZIZ) {
                                        str2 = "cache";
                                    } else {
                                        str2 = "cdn";
                                    }
                                    C1530570pvr.LJFF(c1537480q70, enumC1537150q6T, str2);
                                    C1530570pvr.LJFF(c1537480q70, EnumC1537150q6T.I18N_LOAD_ASYNC_STATUS, "1");
                                    C1530570pvr.LJFF(c1537480q70, EnumC1537150q6T.I18N_LOAD_ASYNC_LANG, c1536580q5Y.LIZLLL);
                                }
                            }
                            CompletionBlock<InterfaceC1537160q6U> completionBlock3 = completionBlock;
                            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
                            if (thM5exceptionOrNullimpl != null) {
                                C2382909Vj.LIZ(completionBlock3, 0, String.valueOf(thM5exceptionOrNullimpl.getMessage()), null, 4);
                            }
                            C1537480q70 c1537480q702 = hybridContext;
                            if (c1537480q702 == null) {
                                return;
                            }
                            C1530570pvr.LIZJ(c1537480q702, new EnumC1537220q6a[]{EnumC1537220q6a.I18N_LOAD_ASYNC_END}, null);
                        }

                        @Override // X.InterfaceC1546990qML
                        public final void LIZIZ(C1537200q6Y c1537200q6Y) {
                            String str2;
                            C1537480q70 c1537480q70 = hybridContext;
                            if (c1537480q70 != null) {
                                EnumC1537150q6T enumC1537150q6T = EnumC1537150q6T.I18N_LOAD_ASYNC_IS_LATEST;
                                if (c1537200q6Y.LIZ) {
                                    str2 = CardStruct.IStatusCode.DEFAULT;
                                } else {
                                    str2 = "1";
                                }
                                C1530570pvr.LJFF(c1537480q70, enumC1537150q6T, str2);
                            }
                        }
                    };
                    sparkI18nManager.getClass();
                    SparkI18nManager.LIZLLL(c1540610qC3, interfaceC1546990qML);
                    return;
                }
            }
        }
        C2382909Vj.LIZ(completionBlock, -3, "Invalid meta format!", null, 4);
    }
}
