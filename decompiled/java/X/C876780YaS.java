package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.Map;

/* JADX INFO: renamed from: X.0YaS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876780YaS {
    public static final boolean LIZ(C869590Y9l c869590Y9l) {
        String str;
        if (c869590Y9l == null) {
            return false;
        }
        C1844807Kk.LIZ.getClass();
        if (!C1844807Kk.LIZ().isEmpty()) {
            Map<String, String> ext = c869590Y9l.getExt();
            String str2 = null;
            if (ext != null) {
                str = ext.get("a:bot_type");
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                Map<String, String> ext2 = c869590Y9l.getExt();
                if (ext2 != null) {
                    str2 = ext2.get("a:bot_type");
                }
                return C13LP.LJJJJ(str2, C1844807Kk.LIZ());
            }
        }
        return false;
    }

    public static final boolean LIZIZ(C869590Y9l c869590Y9l) {
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC876790YaT interfaceC876790YaTLJII;
        if (c869590Y9l == null || !LIZ(c869590Y9l) || (iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) == null || (interfaceC876790YaTLJII = iAiChatFeatureService.LJII()) == null || !interfaceC876790YaTLJII.LIZIZ(c869590Y9l)) {
            return false;
        }
        return true;
    }
}
