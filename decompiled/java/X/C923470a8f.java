package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0a8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923470a8f {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C936770aU7 c936770aU7 = (C936770aU7) it2.next();
            final long j = c936770aU7.LIZ;
            final Long l = c936770aU7.LIZIZ;
            final String str = c936770aU7.LIZLLL;
            final String str2 = c936770aU7.LJ;
            final ImageModel imageModel = c936770aU7.LJFF;
            final String str3 = c936770aU7.LJII;
            arrayList.add(new C923380a8W(j, str, l, str2, imageModel, str3) { // from class: X.0a8c
            });
        }
        return arrayList;
    }
}
