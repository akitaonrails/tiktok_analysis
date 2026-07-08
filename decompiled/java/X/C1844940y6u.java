package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0y6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844940y6u {
    public static C19GN LIZ;

    public static void LIZ(final Activity activity, final Intent intent) {
        final String stringExtra;
        try {
            stringExtra = intent.getStringExtra("type");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (C500260Jjc.LJJIIZ(stringExtra)) {
            C500260Jjc.LJJLIIIJL(LIZ);
            C19GO c19go = new C19GO(activity);
            c19go.LJI(2131842645);
            c19go.LIZIZ(2131842647);
            c19go.LIZJ(2131842648, new DialogInterface.OnClickListener() { // from class: X.0y6y
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }, false);
            c19go.LJ(2131842646, new DialogInterface.OnClickListener() { // from class: X.0y6v
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    String stringExtra2;
                    dialogInterface.dismiss();
                    activity.finish();
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//launcher/shortcut_proxy");
                    smartRouteBuildRoute.withParam("type", stringExtra);
                    try {
                        stringExtra2 = intent.getStringExtra("open_url");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        stringExtra2 = null;
                    }
                    smartRouteBuildRoute.withParam("open_url", stringExtra2);
                    smartRouteBuildRoute.withParam("from_live_block_dialog", true);
                    smartRouteBuildRoute.open();
                }
            }, false);
            C19GN c19gnLIZ = c19go.LIZ();
            LIZ = c19gnLIZ;
            C500260Jjc.LJJLIIIJLLLLLLLZ(c19gnLIZ);
        }
    }

    public static void LIZIZ(final Context context, final InterfaceC214902198i interfaceC214902198i, final Bundle bundle) {
        final String string = bundle.getString("type");
        if (C500260Jjc.LJJIIZ(string)) {
            C500260Jjc.LJJLIIIJL(LIZ);
            C19GO c19go = new C19GO(context);
            c19go.LJI(2131842645);
            c19go.LIZIZ(2131842647);
            c19go.LIZJ(2131842648, new DialogInterface.OnClickListener() { // from class: X.0y6x
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }, false);
            c19go.LJ(2131842646, new DialogInterface.OnClickListener() { // from class: X.0y6w
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    interfaceC214902198i.finish();
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//launcher/shortcut_proxy");
                    smartRouteBuildRoute.withParam("type", string);
                    smartRouteBuildRoute.withParam("open_url", bundle.getString("open_url"));
                    smartRouteBuildRoute.withParam("from_live_block_dialog", true);
                    smartRouteBuildRoute.open();
                }
            }, false);
            C19GN c19gnLIZ = c19go.LIZ();
            LIZ = c19gnLIZ;
            C500260Jjc.LJJLIIIJLLLLLLLZ(c19gnLIZ);
        }
    }
}
