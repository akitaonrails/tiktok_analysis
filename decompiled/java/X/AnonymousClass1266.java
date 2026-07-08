package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1266, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1266 {
    public static List LIZ(int i, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                NinePatchDiv ninePatchDiv = (NinePatchDiv) ListProtector.get(list, i2);
                if (i2 == 0) {
                    if (ninePatchDiv.getStart() != 0) {
                        arrayList.add(new NinePatchDiv(0, ninePatchDiv.getStart() - 1));
                    }
                } else if (i2 > 0) {
                    arrayList.add(new NinePatchDiv(((NinePatchDiv) ListProtector.get(list, i2 - 1)).getEnd(), ninePatchDiv.getStart() - 1));
                }
                arrayList.add(new NinePatchDiv(ninePatchDiv.getStart(), ninePatchDiv.getEnd() - 1));
                if (i2 == list.size() - 1 && ninePatchDiv.getEnd() < i) {
                    arrayList.add(new NinePatchDiv(ninePatchDiv.getEnd(), i - 1));
                }
            }
        }
        return arrayList;
    }
}
