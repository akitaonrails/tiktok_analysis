package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059650dgJ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0dgK, X.1BQt] */
    public static C1059660dgK LIZ(final InterfaceC1541990qEH interfaceC1541990qEH) {
        Context context;
        ?? r2 = new C2204771BQt() { // from class: X.0dgK
            @Override // X.C2204771BQt
            public final void LIZ(Object obj) {
                if (obj instanceof JSONObject) {
                    interfaceC1541990qEH.LIZ("downloadMediaStatusChange", (JSONObject) obj);
                }
            }
        };
        View viewE1 = interfaceC1541990qEH.e1();
        Uri uriLIZ = null;
        if (viewE1 != null) {
            context = viewE1.getContext();
        } else {
            context = null;
        }
        r2.LIZ = context;
        r2.LIZLLL = interfaceC1541990qEH.e1();
        InterfaceC1531560pxS interfaceC1531560pxS = interfaceC1541990qEH.getHybridContext().hybridParams;
        if (interfaceC1531560pxS != null) {
            uriLIZ = interfaceC1531560pxS.LIZ();
        }
        r2.LIZIZ = String.valueOf(uriLIZ);
        return r2;
    }
}
