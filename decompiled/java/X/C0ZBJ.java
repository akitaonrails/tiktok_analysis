package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ZBJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBJ {
    public static final List<View> LIZ(C1087110eOb c1087110eOb, ViewGroup viewGroup) {
        View viewFindViewById;
        ArrayList arrayList = new ArrayList();
        int length = c1087110eOb.getReferencedIds().length;
        for (int i = 0; i < length; i++) {
            int i2 = c1087110eOb.getReferencedIds()[i];
            if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(i2)) != null) {
                arrayList.add(viewFindViewById);
            }
        }
        return arrayList;
    }
}
