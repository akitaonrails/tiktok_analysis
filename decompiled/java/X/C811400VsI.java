package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0VsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811400VsI {
    public final String LIZ;
    public final AbstractC19875512pd LIZIZ;

    public final Bundle LIZ() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.LIZ)) {
            C786410Ut5.LJJJI("A", this.LIZ, bundle);
        }
        if (!TextUtils.isEmpty(null)) {
            C786410Ut5.LJJJI("B", null, bundle);
        }
        if (!this.LIZIZ.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            AbstractC19875512pd abstractC19875512pd = this.LIZIZ;
            int size = abstractC19875512pd.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((C811170Vrv) ListProtector.get(abstractC19875512pd, i)).LIZ());
            }
            C786410Ut5.LJJIL(bundle, "C", arrayList);
        }
        return bundle;
    }

    public /* synthetic */ C811400VsI(C811470VsP c811470VsP) {
        this.LIZ = c811470VsP.LIZ;
        this.LIZIZ = c811470VsP.LIZIZ.LJI();
    }
}
