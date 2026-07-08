package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0m7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383930m7L {
    public static final List LIZ(C1383920m7K c1383920m7K) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (c1383920m7K.LIZLLL == EnumC1384040m7W.APPEND) {
            i = c1383920m7K.LJ;
        } else {
            i = 0;
        }
        int size = c1383920m7K.LIZJ.size();
        while (i < size) {
            Iterator<IDanmakuData> it2 = ((C1383960m7O) ListProtector.get(c1383920m7K.LIZJ, i)).LIZJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getData());
            }
            i++;
        }
        return arrayList;
    }
}
