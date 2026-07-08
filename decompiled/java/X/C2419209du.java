package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.lynx.tasm.LynxView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09du, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2419209du {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Object obj, String str, EnumC1063300dmC enumC1063300dmC, CompletionBlock completionBlock, String str2, Function0 function0) {
        if (!(obj instanceof WebView) && !(obj instanceof LynxView)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(" get wrong view");
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        if (str == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(" get wrong url");
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
            return;
        }
        Uri uri = UriProtector.parse(str);
        String path = uri.getPath();
        String host = uri.getHost();
        if (!C1AUZ.LIZ(enumC1063300dmC, path, host) && !C1AUZ.LIZIZ(enumC1063300dmC, path, host)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str2);
            sbLIZ3.append(" get wrong path");
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ3), null, 4);
            return;
        }
        function0.invoke();
    }
}
