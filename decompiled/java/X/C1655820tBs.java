package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0tBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655820tBs {
    public static final void LIZ(Activity activity, String str, String str2, final InterfaceC1655960tC6 interfaceC1655960tC6) {
        C0CHQ.LIZ().getAccountService().LJIIIIZZ(activity, str, str2, null, new InterfaceC19305710fv() { // from class: X.0tC2
            @Override // X.InterfaceC19305710fv
            public final void onCancel() {
                InterfaceC1655960tC6 interfaceC1655960tC62 = interfaceC1655960tC6;
                if (interfaceC1655960tC62 != null) {
                    interfaceC1655960tC62.LIZ();
                }
            }

            @Override // X.InterfaceC19305710fv
            public final void onSuccess() {
                InterfaceC1655960tC6 interfaceC1655960tC62 = interfaceC1655960tC6;
                if (interfaceC1655960tC62 != null) {
                    interfaceC1655960tC62.onSuccess();
                }
            }
        });
    }
}
