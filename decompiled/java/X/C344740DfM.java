package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0DfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20647615qs("tiktok_beta_app_ready")
public final class C344740DfM extends AbstractC20660815t0 {
    public static final String LLILLL;
    public static final Keva LLILZ;
    public final int LL;
    public TuxSheet LLILLJJLI;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sheet_beta_ready_showed-");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        LLILLL = C2188811AlT.LIZIZ(sbLIZ);
        LLILZ = Keva.getRepo("beta_testing");
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LL;
    }

    public C344740DfM(InterfaceC20658015sY interfaceC20658015sY) {
        super(interfaceC20658015sY);
        this.LL = 491;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        Context context = c688120Qyw.LIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
        C770750ULh c770750ULh = new C770750ULh();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_tiktok_beta;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = iLIZIZ;
        c384050F3z.LJI = iLIZIZ;
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e1);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
        c770750ULh.LIZ = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
        c770750ULh.LIZLLL = 2;
        c770750ULh.LJ = context.getString(2131827339);
        c770750ULh.LIZJ(context.getString(2131827338));
        c770750ULh.LJI(context.getString(2131827335), new AwS582S0100000_3(context, 103));
        c770750ULh.LJIILLIIL = true;
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        DialogInterfaceOnDismissListenerC346390Di1 dialogInterfaceOnDismissListenerC346390Di1 = new DialogInterfaceOnDismissListenerC346390Di1(c20656615sK, 1);
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LLILLJJLI = dialogInterfaceOnDismissListenerC346390Di1;
        this.LLILLJJLI = tuxSheet;
        FragmentManager fragmentManager = ((Fragment) this.scene).getFragmentManager();
        if (fragmentManager != null) {
            TuxSheet tuxSheet2 = this.LLILLJJLI;
            if (tuxSheet2 != null) {
                tuxSheet2.show(fragmentManager, (String) null);
            }
            LLILZ.storeBoolean(LLILLL, true);
            C2344009Gk c2344009Gk = new C2344009Gk();
            Keva keva = BetaAppExperiment.LJI;
            c2344009Gk.LJIIIIZZ("beta_version", keva.getString(BetaAppExperiment.LJ, ""));
            c2344009Gk.LIZJ(keva.getInt(BetaAppExperiment.LIZLLL, -1), "beta_build");
            C20684815ws.LJIILLIIL("tiktok_beta_profile_upgrade_guide_show", c2344009Gk.LIZ);
            return;
        }
        c20656615sK.LIZ();
    }
}
