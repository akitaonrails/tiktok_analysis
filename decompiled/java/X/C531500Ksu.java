package X;

import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Ksu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531500Ksu {
    public static final C532290KuB LIZ = new C532290KuB("downloadMusic", C0PEM.LIZJ, new C531480Kss(null));

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C531490Kst r15, java.util.List<java.lang.String> r16, android.content.Context r17, boolean r18, X.InterfaceC1364105Vn<? super X.C189200o6<? extends java.util.List<X.C531370Ksh>>> r19) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C531500Ksu.LIZ(X.0Kst, java.util.List, android.content.Context, boolean, X.05Vn):java.lang.Object");
    }

    public static final void LIZIZ(TemplateConsumeCoreParam templateConsumeCoreParam, C531490Kst c531490Kst, long j, boolean z, int i, String str, Integer num, Integer num2) {
        String str2;
        C532330KuF c532330KuF;
        C531550Ksz c531550KszLIZ = C0FQK.LIZ(templateConsumeCoreParam.templateId);
        if (c531550KszLIZ == null || (c532330KuF = c531550KszLIZ.LIZJ) == null || (str2 = c532330KuF.LIZ) == null) {
            str2 = "";
        }
        ITemplateMobService iTemplateMobService = (ITemplateMobService) PluggableExtentionKt.pluggableSpi$default(ITemplateMobService.class, false, false, false, 14, null);
        if (iTemplateMobService != null) {
            iTemplateMobService.LJ(templateConsumeCoreParam.templateId, Integer.valueOf(templateConsumeCoreParam.templateType.getValue()), str2, templateConsumeCoreParam.dispatchType.LIZ, "download_music", j, z, i, false, str, num2, num, c531490Kst.LIZJ, c531490Kst.LIZLLL, true, new LinkedHashMap());
        }
    }
}
