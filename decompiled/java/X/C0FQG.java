package X;

import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;

/* JADX INFO: renamed from: X.0FQG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQG {
    public static final C531740KtI LIZ = C0FQL.LIZ("reverseTemplate", new C353720Dtq(null));
    public static final C532290KuB LIZIZ;
    public static final C531740KtI LIZJ;
    public static final C532290KuB LIZLLL;

    static {
        C0FQC c0fqc = new C0FQC(null);
        C1DFB c1dfb = C0PEM.LIZJ;
        LIZIZ = new C532290KuB("magicTemplate", c1dfb, c0fqc);
        LIZJ = C0FQL.LIZ("freezeTemplate", new C0FQH(null));
        LIZLLL = new C532290KuB("mattingTemplate", c1dfb, new C0FQB(null));
    }

    public static final String LIZ(TemplateConsumeCoreParam templateConsumeCoreParam) {
        C532330KuF c532330KuF;
        String str;
        C531550Ksz c531550KszLIZ = C0FQK.LIZ(templateConsumeCoreParam.templateId);
        if (c531550KszLIZ == null || (c532330KuF = c531550KszLIZ.LIZJ) == null || (str = c532330KuF.LIZ) == null) {
            return "";
        }
        return str;
    }
}
