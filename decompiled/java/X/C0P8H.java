package X;

import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0P8H, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P8H {
    public final String LIZ;
    public final LifecycleOwner LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(443));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(444));

    public final Taco LIZ() {
        String str = this.LIZ;
        LifecycleOwner lifecycleOwner = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(lifecycleOwner.hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        Taco taco = new Taco(lifecycleOwner);
        SparseArray sparseArray = (SparseArray) this.LIZJ.getValue();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            C0P74 c0p74 = (C0P74) sparseArray.valueAt(i);
            if (c0p74 != null) {
                taco.LIZLLL().put(iKeyAt, c0p74);
                c0p74.z1(taco.LIZJ());
            }
        }
        Iterator it2 = ((ArrayList) this.LIZLLL.getValue()).iterator();
        while (it2.hasNext()) {
            taco.LIZIZ((InterfaceC588620N6u) it2.next());
        }
        return taco;
    }

    public final void LIZLLL(InterfaceC588620N6u interfaceC588620N6u) {
        if (interfaceC588620N6u == null) {
            return;
        }
        ((ArrayList) this.LIZLLL.getValue()).add(interfaceC588620N6u);
    }

    public C0P8H(String str, LifecycleOwner lifecycleOwner) {
        this.LIZ = str;
        this.LIZIZ = lifecycleOwner;
    }

    public final void LIZIZ(C0P74 c0p74, int i) {
        if (c0p74 == null) {
            return;
        }
        ((SparseArray) this.LIZJ.getValue()).put(i, c0p74);
    }
}
