package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0KFL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KFL extends C0KJO {
    public static Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> LLIZLLLIL;
    public final Map<String, String> LLILLL = new HashMap();
    public Map<String, String> LLILZ = new HashMap();
    public String LLILZIL = "";
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(346));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(347));

    public static final String LIZJ(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1255350552) {
                if (iHashCode != 0) {
                    if (iHashCode == 1352224630 && str.equals("sub_change_price_email")) {
                        return "price_change";
                    }
                    return "unknown_jsb";
                }
                if (str.equals("")) {
                    return "normal_sub";
                }
                return "unknown_jsb";
            }
            if (str.equals("normal_sub")) {
                return "normal_sub";
            }
            return "unknown_jsb";
        }
        return "unknown_jsb";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05e5  */
    /* JADX WARN: Type inference failed for: r18v7, types: [android.content.Context] */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r34, final com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r35, X.EnumC1063300dmC r36) {
        /*
            Method dump skipped, instruction units count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KFL.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
