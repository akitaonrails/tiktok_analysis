package X;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Vs5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811270Vs5 {
    public final AbstractC19875512pd LIZ;

    public final Bundle LIZ() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(null)) {
            C786410Ut5.LJJJI("A", null, bundle);
        }
        if (!this.LIZ.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C811170Vrv) it2.next()).LIZ());
            }
            C786410Ut5.LJJIL(bundle, "B", arrayList);
        }
        return bundle;
    }

    public /* synthetic */ C811270Vs5(C811290Vs7 c811290Vs7) {
        c811290Vs7.getClass();
        this.LIZ = c811290Vs7.LIZ.LJI();
    }
}
