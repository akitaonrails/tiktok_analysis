package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;

/* JADX INFO: renamed from: X.0L3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class BinderC536850L3r extends BinderC538440L9u {
    public final String LLILLJJLI;
    public final String LLILLL;
    public final C536880L3u LLILZ;
    public ITemplateMobService LLILZIL;
    public EnumC1412640mre LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;

    public final ITemplateMobService LIZ() {
        if (this.LLILZIL == null) {
            this.LLILZIL = (ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class);
        }
        return this.LLILZIL;
    }

    public BinderC536850L3r(String str, String str2, String str3, String str4) {
        String str5;
        this.LLILLJJLI = str3;
        this.LLILLL = str4;
        CutsameDataItem cutsameDataItemLIZIZ = C536810L3n.LIZIZ();
        if (cutsameDataItemLIZIZ != null) {
            str5 = cutsameDataItemLIZIZ.templateId;
        } else {
            str5 = null;
        }
        this.LLILZ = new C536880L3u(str, str2, String.valueOf(str5));
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0510 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.cut_reportor_interface.ICutReporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void report(int r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39) {
        /*
            Method dump skipped, instruction units count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BinderC536850L3r.report(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
