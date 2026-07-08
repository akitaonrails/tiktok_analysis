package X;

import android.content.Context;
import android.content.DialogInterface;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0f7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114760f7C {
    public static void LIZ(Context context, final String str, final InterfaceC1114770f7D interfaceC1114770f7D) {
        C19GO c19go = new C19GO(context);
        c19go.LJI(2131853428);
        c19go.LIZJ(2131853426, new DialogInterfaceOnClickListenerC1151580g4a(1), false);
        c19go.LJ(2131853427, new DialogInterface.OnClickListener(str, interfaceC1114770f7D) { // from class: X.0f7B
            public final /* synthetic */ String LL;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                String str2 = this.LL;
                HashMap map = new HashMap();
                map.put("bind_page_source", str2);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_phone_bind_page_show");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
        }, false);
        c19go.LJJIIJ = false;
        C786410Ut5.M4(c19go.LIZ());
    }
}
