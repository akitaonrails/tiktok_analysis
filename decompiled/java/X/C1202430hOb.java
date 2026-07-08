package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.poi.experiment.LsComplianceGlobalConfig;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202430hOb {
    public static final C1202430hOb LIZ = new C1202430hOb();
    public static int LIZIZ = Integer.MAX_VALUE;

    public static void LIZIZ(String str, Object obj, Map map, Function1 function1) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        LsComplianceGlobalConfig lsComplianceGlobalConfig = C1202490hOh.LIZ;
        LsComplianceGlobalConfig lsComplianceGlobalConfig2 = (LsComplianceGlobalConfig) settingsManagerLIZLLL.LJIIIIZZ("local_service_compliance_toast_config", LsComplianceGlobalConfig.class, lsComplianceGlobalConfig);
        if (lsComplianceGlobalConfig2 != null) {
            lsComplianceGlobalConfig = lsComplianceGlobalConfig2;
        }
        if (!Intrinsics.LJFF(lsComplianceGlobalConfig.enable, Boolean.TRUE)) {
            function1.invoke(Boolean.FALSE);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C481201u6(lsComplianceGlobalConfig, str, map, obj, function1, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.poi.experiment.LsComplianceGlobalConfig r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.String> r20, java.lang.Object r21, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r22, X.InterfaceC1364105Vn<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1202430hOb.LIZ(com.ss.android.ugc.aweme.poi.experiment.LsComplianceGlobalConfig, java.lang.String, java.util.Map, java.lang.Object, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
