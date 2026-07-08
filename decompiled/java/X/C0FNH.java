package X;

import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0FNH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FNH {
    public static final List<C0FNM> LIZ(List<InspirationItemData> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (InspirationItemData inspirationItemData : list) {
            String title = inspirationItemData.getTitle();
            inspirationItemData.getContent();
            inspirationItemData.getEffectId();
            arrayList.add(new C0FNM(title));
        }
        return arrayList;
    }
}
