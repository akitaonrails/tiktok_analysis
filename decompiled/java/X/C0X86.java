package X;

import android.app.Application;
import com.bytedance.hybrid.spark.security.impl.service.lynx.LynxTemplateVerifyDialogSettings;
import com.bytedance.hybrid.spark.security.impl.service.lynx.LynxTemplateVerifySettings;
import com.bytedance.lynx.service.security.LynxSecurityService;
import com.lynx.tasm.service.IServiceProvider;
import com.lynx.tasm.service.security.ILynxSecurityService;

/* JADX INFO: renamed from: X.0X86, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X86 {
    public static final C0X86 LIZ = new C0X86();
    public static LynxTemplateVerifySettings LIZIZ = new LynxTemplateVerifySettings(false, 0, null, null, null, null, null, 127, null);

    static {
        new LynxTemplateVerifyDialogSettings("", EnumC843650X7r.NONE.getCode(), "", null, "", "");
    }

    public static void LIZ(LynxTemplateVerifySettings lynxTemplateVerifySettings) {
        LynxSecurityService lynxSecurityService;
        if (lynxTemplateVerifySettings != null) {
            LIZIZ = lynxTemplateVerifySettings;
        }
        Application application = (Application) C20642515q3.LIZ();
        if (application != null) {
            C1285920jZG.LIZJ().LIZIZ(application);
        }
        IServiceProvider iServiceProviderLIZ = C1285920jZG.LIZJ().LIZ(ILynxSecurityService.class);
        if ((iServiceProviderLIZ instanceof LynxSecurityService) && (lynxSecurityService = (LynxSecurityService) iServiceProviderLIZ) != null) {
            String str = LIZIZ.publicKey;
            if (str == null) {
                str = "{\"0\":\"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvekhb6Oaujs72xv5MW1iJqD17eE9dgUyEMPBa6RMu4yk8ByG7CeKRl4hFPa7NcF2U79EjKg4lXOh7mtoyPH87ZZSLzdPd3lk4o86saVwoNGNJDUJmYbGjj7331dJLtIw6SGbfHNUcWietWfkjA4nkw2an2d7adbHbDc3MB6G9kxtseUtlMRTYhfRBU9im3kicNv55fhFHbxfMtlaJQGMCiuP4q9ZiLp6+1JQql0UnlZXIN/GZB+/htlh9BRRZfL0bsRpXfVenzM88wB3DUmeTLBy/tPbwzzJm0J1C+Bmf8HmCjJmKNij/bCAOC2L0mSck9OPTQMUoDqPwBgzsYZfnwIDAQAB\"}";
            }
            lynxSecurityService.updateRSAPublicKeys(str);
            lynxSecurityService.setSecurityDelegate(new C0X84() { // from class: X.0X7s
                @Override // X.C0X84
                public final boolean LIZIZ() {
                    C0X86.LIZ.getClass();
                    return C0X86.LIZIZ.signVerifyMode != EnumC843650X7r.NONE.getCode();
                }

                /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
                
                    if (r6.LJFF == false) goto L32;
                 */
                @Override // X.C0X84
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C0X80 LIZ(X.C0X82 r6) {
                    /*
                        r5 = this;
                        com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter r0 = com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter.INSTANCE
                        com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService r4 = r0.protocol()
                        com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService r4 = (com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService) r4
                        X.0Wee r3 = new X.0Wee
                        X.1E6N r2 = X.C1E6N.SparkSecuritySolutionEndpointNative
                        X.1E6N r1 = X.C1E6N.SparkSecuritySolutionEndpointLynx
                        X.1E6B r0 = X.C1E6B.SparkSecuritySolutionChannelHybridLoad
                        r3.<init>(r2, r1, r0)
                        java.lang.String r2 = r6.LIZJ
                        if (r2 == 0) goto L1e
                        java.util.Map<java.lang.String, java.lang.Object> r1 = r3.LJFF
                        java.lang.String r0 = "URL"
                        r1.put(r0, r2)
                    L1e:
                        java.util.Map<java.lang.String, java.lang.Object> r2 = r3.LJFF
                        boolean r0 = r6.LJFF
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                        java.lang.String r0 = "verified"
                        r2.put(r0, r1)
                        X.0X7w r2 = r6.LJII
                        if (r2 == 0) goto L37
                        java.util.Map<java.lang.String, java.lang.Object> r1 = r3.LJFF
                        java.lang.String r0 = "error_code"
                        r1.put(r0, r2)
                    L37:
                        java.lang.String r2 = r6.LJI
                        if (r2 == 0) goto L42
                        java.util.Map<java.lang.String, java.lang.Object> r1 = r3.LJFF
                        java.lang.String r0 = "error_msg"
                        r1.put(r0, r2)
                    L42:
                        X.0WLv r3 = r4.handleLynxTemplateVerify(r3)
                        r1 = 1
                        r2 = 0
                        if (r3 == 0) goto L79
                        X.0WLo r0 = r3.LJ
                        if (r0 == 0) goto L76
                        X.0WLw r0 = r0.LIZ
                        if (r0 == 0) goto L76
                        java.lang.Boolean r0 = r0.getIntercept()
                        if (r0 == 0) goto L76
                        boolean r0 = r0.booleanValue()
                    L5c:
                        if (r0 == 0) goto L7f
                        if (r3 == 0) goto L7d
                        X.0WLo r0 = r3.LJ
                        if (r0 == 0) goto L7d
                        X.0WLw r0 = r0.LIZ
                        if (r0 == 0) goto L7d
                        java.lang.String r1 = r0.getDescription()
                    L6c:
                        X.0X80 r0 = new X.0X80
                        r0.<init>()
                        r0.LIZ = r2
                        r0.LIZIZ = r1
                        return r0
                    L76:
                        boolean r0 = r3.LIZ
                        goto L5c
                    L79:
                        boolean r0 = r6.LJFF
                        if (r0 != 0) goto L7f
                    L7d:
                        r1 = 0
                        goto L6c
                    L7f:
                        X.0X80 r0 = new X.0X80
                        r0.<init>()
                        r0.LIZ = r1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C843660X7s.LIZ(X.0X82):X.0X80");
                }
            });
            return;
        }
        C1530030puz.LIZ("LynxTemplateVerifyInitializer", "LynxSecurityService not found", null);
    }
}
