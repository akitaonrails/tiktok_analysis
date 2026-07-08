package X;

import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hAJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193570hAJ {
    public final LifecycleOwner LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(273));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(274));

    public C1193570hAJ(LifecycleOwner lifecycleOwner) {
        this.LIZ = lifecycleOwner;
    }

    public static void LIZ(C1193570hAJ c1193570hAJ, AbstractC1203660hQa abstractC1203660hQa) {
        if (abstractC1203660hQa != null) {
            ((SparseArray) c1193570hAJ.LIZIZ.getValue()).put(abstractC1203660hQa.hashCode(), abstractC1203660hQa);
        }
    }
}
