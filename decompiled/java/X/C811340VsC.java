package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0VsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811340VsC {
    public final AbstractC19875512pd LIZ;
    public final AbstractC19875512pd LIZIZ;

    public final Bundle LIZ() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("A", false);
        if (!this.LIZ.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((AbstractC811280Vs6) it2.next()).LIZ());
            }
            C786410Ut5.LJJIL(bundle, "C", arrayList);
        }
        if (!this.LIZIZ.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            AbstractC19875512pd abstractC19875512pd = this.LIZIZ;
            int size = abstractC19875512pd.size();
            for (int i = 0; i < size; i++) {
                ListProtector.get(abstractC19875512pd, i).getClass();
                arrayList2.add(new Bundle());
            }
            C786410Ut5.LJJIL(bundle, "D", arrayList2);
        }
        return bundle;
    }

    public /* synthetic */ C811340VsC(C811320VsA c811320VsA) {
        this.LIZ = c811320VsA.LIZ.LJI();
        this.LIZIZ = c811320VsA.LIZIZ.LJI();
    }
}
