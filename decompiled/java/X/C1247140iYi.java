package X;

import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0iYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247140iYi {
    public final List<InterfaceC1247150iYj> LIZ = new ArrayList();
    public final int LIZIZ = R.string.f1_;

    public final C1247130iYh LIZ() {
        List<InterfaceC1247150iYj> list = this.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<InterfaceC1247150iYj> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().get());
        }
        return new C1247130iYh(arrayList, this.LIZIZ);
    }
}
