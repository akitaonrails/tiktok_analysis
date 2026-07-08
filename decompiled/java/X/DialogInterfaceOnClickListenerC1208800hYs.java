package X;

import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesVM;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0hYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class DialogInterfaceOnClickListenerC1208800hYs implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
            case 5:
                onClick$5(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC1208800hYs(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC1208800hYs dialogInterfaceOnClickListenerC1208800hYs, DialogInterface dialogInterface, int i) {
        LocationServicesVM locationServicesVM;
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        Context context = (Context) dialogInterfaceOnClickListenerC1208800hYs.l0;
        c19741112Lp.getClass();
        C19741112Lp.LJIIIZ(context, "android.permission.ACCESS_COARSE_LOCATION");
        WeakReference<LocationServicesVM> weakReference = LocationServicesManager.LJ;
        if (weakReference != null && (locationServicesVM = weakReference.get()) != null) {
            locationServicesVM.LLILZ.put(locationServicesVM.LL, "system_location_setting_off_result");
            locationServicesVM.LLILZ.put(locationServicesVM.LLILLJJLI, "click_gps_never");
        }
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC1208800hYs dialogInterfaceOnClickListenerC1208800hYs, DialogInterface dialogInterface, int i) {
        C1206930hVr c1206930hVr = C1206930hVr.LIZ;
        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18((Context) dialogInterfaceOnClickListenerC1208800hYs.l0, 63);
        c1206930hVr.getClass();
        C1206930hVr.LIZIZ("system_location_setting_off_result", "click_gps_never", 1, awS597S0100000_18);
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC1208800hYs dialogInterfaceOnClickListenerC1208800hYs, DialogInterface dialogInterface, int i) {
        C12QB c12qb = (C12QB) dialogInterfaceOnClickListenerC1208800hYs.l0;
        if (c12qb != null) {
            c12qb.LIZ();
        }
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC1208800hYs dialogInterfaceOnClickListenerC1208800hYs, DialogInterface dialogInterface, int i) {
        C12QB c12qb = (C12QB) dialogInterfaceOnClickListenerC1208800hYs.l0;
        if (c12qb != null) {
            c12qb.LIZ();
        }
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC1208800hYs dialogInterfaceOnClickListenerC1208800hYs, DialogInterface dialogInterface, int i) {
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((Context) dialogInterfaceOnClickListenerC1208800hYs.l0).getResources().getString(2131826361), true);
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        Context context = (Context) dialogInterfaceOnClickListenerC1208800hYs.l0;
        c19741112Lp.getClass();
        C19741112Lp.LJIIIZ(context, "android.permission.ACCESS_COARSE_LOCATION");
    }

    public static final void onClick$5(DialogInterfaceOnClickListenerC1208800hYs dialogInterfaceOnClickListenerC1208800hYs, DialogInterface dialogInterface, int i) {
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((Context) dialogInterfaceOnClickListenerC1208800hYs.l0).getResources().getString(2131826361), true);
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        Context context = (Context) dialogInterfaceOnClickListenerC1208800hYs.l0;
        c19741112Lp.getClass();
        C19741112Lp.LJIIIZ(context, "android.permission.ACCESS_COARSE_LOCATION");
    }
}
