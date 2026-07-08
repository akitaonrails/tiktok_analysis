package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;

/* JADX INFO: renamed from: X.0Kui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class BinderC532620Kui extends BinderC538440L9u {
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public ITemplateMobService LLILZIL;
    public EnumC1412640mre LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    public final ITemplateMobService LIZ() {
        if (this.LLILZIL == null) {
            this.LLILZIL = (ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class);
        }
        return this.LLILZIL;
    }

    public BinderC532620Kui(String str, String str2, int i) {
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
    }

    public static void LIZIZ(BinderC532620Kui binderC532620Kui, int i, String str, Boolean bool, int i2) {
        boolean zBooleanValue;
        if ((i2 & 4) != 0) {
            bool = Boolean.FALSE;
        }
        binderC532620Kui.LLILZLL = C1412660mrg.LIZJ(i);
        binderC532620Kui.LLIZ = str;
        binderC532620Kui.LLIZLLLIL = null;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        binderC532620Kui.LLJI = zBooleanValue;
        binderC532620Kui.LLJ = null;
        binderC532620Kui.LLJIJIL = false;
    }

    public final void LIZJ(int i, int i2, String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("template_id", this.LLILLL);
        c0lab.LJ("template_url", str2);
        c0lab.LIZ(i, "duration");
        c0lab.LIZ(i2, "error_code");
        c0lab.LJ("error_msg", str3);
        c0lab.LIZ(this.LLILZ, Scene.SCENE_SERVICE);
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    @Override // com.ss.android.ugc.cut_reportor_interface.ICutReporter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void report(int r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BinderC532620Kui.report(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
