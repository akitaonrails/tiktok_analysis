package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0KsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531070KsD {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static View LIZ(C19EG c19eg, int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        InterfaceC530790Krl interfaceC530790Krl;
        C0QTN inflater;
        View viewLIZIZ;
        if (!(c19eg instanceof InterfaceC530790Krl) || (interfaceC530790Krl = (InterfaceC530790Krl) c19eg) == null || (inflater = interfaceC530790Krl.getInflater()) == null || (viewLIZIZ = inflater.LIZIZ(i)) == null) {
            return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        }
        return viewLIZIZ;
    }
}
