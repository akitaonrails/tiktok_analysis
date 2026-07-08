package X;

import Y.AComparatorS39S0000000_20;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: X.0kIN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313890kIN {
    public final ViewGroup LIZ;
    public int LIZIZ;
    public int[] LIZJ;

    public final void LIZ() {
        int childCount = this.LIZ.getChildCount();
        if (this.LIZJ == null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(this.LIZ.getChildAt(i));
            }
            Collections.sort(arrayList, new AComparatorS39S0000000_20(6));
            this.LIZJ = new int[childCount];
            for (int i2 = 0; i2 < childCount; i2++) {
                this.LIZJ[i2] = this.LIZ.indexOfChild((View) ListProtector.get(arrayList, i2));
            }
        }
    }

    public C1313890kIN(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }
}
