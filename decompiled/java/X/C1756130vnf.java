package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vnf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756130vnf {
    public static final /* synthetic */ int LJ = 0;
    public final Fragment LIZ;
    public final C1756290vnv LIZIZ;
    public final Map<String, InterfaceC1756300vnw> LIZJ = new LinkedHashMap();
    public final Map<String, View> LIZLLL = new LinkedHashMap();

    public final void LIZ(boolean z) {
        int i;
        for (Map.Entry entry : ((LinkedHashMap) this.LIZLLL).entrySet()) {
            Object key = entry.getKey();
            View view = (View) entry.getValue();
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
            InterfaceC1756300vnw interfaceC1756300vnw = (InterfaceC1756300vnw) ((LinkedHashMap) this.LIZJ).get(key);
            if (interfaceC1756300vnw != null) {
                interfaceC1756300vnw.LIZLLL(z);
            }
        }
    }

    public C1756130vnf(Fragment fragment, C1756290vnv c1756290vnv) {
        this.LIZ = fragment;
        this.LIZIZ = c1756290vnv;
    }
}
