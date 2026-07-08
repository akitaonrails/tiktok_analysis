package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;

/* JADX INFO: renamed from: X.15Pz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20516915Pz {
    public DialogC1389620mGW LIZ;
    public final Context LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public boolean LJI;
    public final int LJII;
    public C15Q0 LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public ShootExtraData LJIIJJI;
    public String LJIIL;

    public C20516915Pz(Context context) {
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = true;
        this.LJII = 2;
        this.LIZIZ = context;
    }

    public C20516915Pz(Context context, Integer num) {
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = true;
        this.LJII = 2;
        this.LIZIZ = context;
        if (num != null) {
            this.LJII = num.intValue();
        }
    }

    public final void LIZ(String str, Integer num, C1394510mOP c1394510mOP, String str2, String str3, int i, boolean z, String str4, ShootExtraData shootExtraData) {
        int i2;
        String str5;
        this.LIZJ = str2;
        this.LJ = str3;
        this.LIZLLL = str4;
        this.LJI = z;
        this.LJIIJJI = shootExtraData;
        if (num == null) {
            num = 1;
        }
        int iIntValue = num.intValue();
        String str6 = C0P00.LIZ;
        if (iIntValue == 2) {
            i2 = 4;
        } else {
            i2 = 1;
        }
        if (!C2354709Kn.LJIIZILJ()) {
            C12ES.LIZLLL(2131847054, this.LIZIZ);
            return;
        }
        if (C2354709Kn.LJIILL() < 20971520) {
            C12ES.LIZLLL(2131847055, this.LIZIZ);
            return;
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (this.LJFF) {
                    if (this.LIZ == null) {
                        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this.LIZIZ);
                        this.LIZ = dialogC1389620mGW;
                        dialogC1389620mGW.LJJLJ(2131832484);
                        C0FNV.LIZJ(this.LIZ);
                    } else {
                        Context context = this.LIZIZ;
                        if ((context instanceof Activity) && !C1388190mED.LIZ(context).isFinishing()) {
                            C786410Ut5.J4(this.LIZ);
                        }
                    }
                }
                if (TextUtils.isEmpty(this.LIZJ)) {
                    str5 = "mv_reuse";
                } else {
                    str5 = this.LIZJ;
                }
                C20516815Py c20516815Py = new C20516815Py(this, str5, str, c1394510mOP, i2, i);
                if ("mv_page".equals(str5)) {
                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(str5, c20516815Py);
                    return;
                } else {
                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncServiceWithOutPanel(str5, c20516815Py);
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C844470XAv.LIZ.getClass();
        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy.LIZIZ(2131837962);
        c1233040iBy.LIZLLL();
    }
}
