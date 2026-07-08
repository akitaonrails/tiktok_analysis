package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qQC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549380qQC extends AbstractC602170Njb {
    public C1549420qQG LLILLL;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        C1549420qQG c1549420qQG = this.LLILLL;
        if (c1549420qQG != null) {
            c1549420qQG.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0qQD] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0Njd] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        SparkContext sparkContext;
        InterfaceC602180Njc interfaceC602180Njc = (InterfaceC602180Njc) xBaseParamModel;
        String url = interfaceC602180Njc.getUrl();
        if (u.LJJIIJZLJL(url, "https", false)) {
            Uri.Builder builder = new Uri.Builder();
            builder.path("//webview/");
            builder.appendQueryParameter("url", url);
            String string = builder.build().toString();
            sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(string);
        } else {
            sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(url);
        }
        SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        C1549420qQG c1549420qQG = null;
        if (sparkSchemaParamLJJJI == null) {
            C2382909Vj.LIZ(completionBlock, -3, "Parameter 'url' is required!", null, 4);
            return;
        }
        Set<C1BP1<?, ?>> set = C1542450qF1.LIZ;
        Map<String, Object> context = interfaceC602180Njc.getContext();
        ?? r6 = new InterfaceC1530550pvp() { // from class: X.0Njd
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                Map<String, ? extends Object> map;
                Object obj2 = ((Map) obj).get("result");
                if ((obj2 instanceof Map) && (map = (Map) obj2) != null) {
                    CompletionBlock<InterfaceC602150NjZ> completionBlock2 = completionBlock;
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC602150NjZ.class, null);
                    ((InterfaceC602150NjZ) xBaseModelLIZJ).setResult(map);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    return;
                }
                C2382909Vj.LIZ(completionBlock, -5, "The result is null", null, 4);
            }
        };
        ?? r4 = new InterfaceC1530550pvp() { // from class: X.0qQD
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                if (th instanceof C2204191BOn) {
                    CompletionBlock<InterfaceC602150NjZ> completionBlock2 = completionBlock;
                    C2204191BOn c2204191BOn = (C2204191BOn) th;
                    int code = c2204191BOn.getCode();
                    String message = c2204191BOn.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C2382909Vj.LIZ(completionBlock2, code, message, null, 4);
                    return;
                }
                C2382909Vj.LIZ(completionBlock, 0, th.toString(), null, 4);
            }
        };
        InterfaceC1549430qQH interfaceC1549430qQH = (InterfaceC1549430qQH) C1963807me.LIZ(InterfaceC1549430qQH.class);
        if (interfaceC1549430qQH == 0) {
            r4.accept(new C1549410qQF("No service implemented."));
        } else {
            C1541480qDS c1541480qDS = new C1541480qDS(UriProtector.parse(sparkSchemaParamLJJJI.getUrl()));
            c1541480qDS.LJIIL = sparkSchemaParamLJJJI;
            String url2 = sparkSchemaParamLJJJI.getUrl();
            new C1530150pvB(sparkContext, c1541480qDS);
            C1BOB c1bobLIZ = interfaceC1549430qQH.LIZ(url2, context, r6, new C1549400qQE(r4));
            if (c1bobLIZ != null) {
                c1549420qQG = new C1549420qQG(c1bobLIZ);
            }
        }
        this.LLILLL = c1549420qQG;
    }
}
