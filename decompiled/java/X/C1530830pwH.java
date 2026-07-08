package X;

import android.webkit.WebResourceRequest;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.hybridkit.forest.SSPFetcher;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530830pwH {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C1529330ptr.LIZIZ.put("ssp_fetcher", new InterfaceC1530870pwL() { // from class: X.0pwK
            @Override // X.InterfaceC1530870pwL
            public final InterfaceC1532430pyr LIZ(C08AB c08ab, C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR) {
                Object obj;
                final WebResourceRequest webResourceRequest;
                final WebKitView webKitView;
                Map<String, Object> map = c1532710pzJ.LJ;
                if (map != null) {
                    obj = map.get("WEB_RESOURCE_REQUEST");
                } else {
                    obj = null;
                }
                if (!(obj instanceof WebResourceRequest) || (webResourceRequest = (WebResourceRequest) obj) == null) {
                    return null;
                }
                String str = c1532710pzJ.LJIIL;
                if (!(str instanceof String) || str == null) {
                    return null;
                }
                C1529870puj.LIZ.getClass();
                InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str);
                if (!(interfaceC1541990qEHLJFF instanceof WebKitView) || (webKitView = (WebKitView) interfaceC1541990qEHLJFF) == null) {
                    return null;
                }
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("spark_ssp_business_fetch_filter", false)) {
                    SSPFetcher.Companion.getClass();
                    if (C0WTI.LIZ(webResourceRequest, webKitView)) {
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("skip ssp_fetcher by business filter, url: ");
                        sbLIZ.append(c1532710pzJ.LJJIII.LIZ);
                        c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.I, "SspLifeCycle_");
                        return null;
                    }
                }
                return new InterfaceC1532430pyr() { // from class: X.0pwM
                    @Override // X.InterfaceC1532520pz0
                    public final boolean LIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1532430pyr
                    public final boolean LIZJ(C1532300pye c1532300pye) {
                        return true;
                    }

                    @Override // X.InterfaceC1532520pz0
                    public final boolean LJFF() {
                        return true;
                    }

                    @Override // X.InterfaceC1532520pz0
                    public final String getName() {
                        return "ssp_provider";
                    }

                    @Override // X.InterfaceC1532520pz0
                    public final EnumC1528520psY LIZLLL() {
                        return EnumC1528520psY.NO_REUSE;
                    }

                    @Override // X.InterfaceC1532520pz0
                    public final void LJ(Function1 function1, Object obj2) {
                        C1532460pyu.LIZ(this, (C1532550pz3) obj2, function1);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
                    
                        if (r4 != null) goto L20;
                     */
                    @Override // X.InterfaceC1532430pyr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(X.C08AB r14, X.C1532710pzJ r15, X.C1532470pyv r16, X.C1532170pyR r17, kotlin.jvm.functions.Function1<? super X.C1532340pyi, kotlin.Unit> r18) {
                        /*
                            Method dump skipped, instruction units count: 394
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1530880pwM.LIZIZ(X.08AB, X.0pzJ, X.0pyv, X.0pyR, kotlin.jvm.functions.Function1):void");
                    }
                };
            }
        });
    }
}
