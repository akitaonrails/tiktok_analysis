package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.09fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2432009fy {
    public static final List<Fragment> LIZIZ(C19EG c19eg) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c19eg.getSupportFragmentManager().LJJLIIIJL());
        Iterator<Fragment> it2 = c19eg.getSupportFragmentManager().LJJLIIIJL().iterator();
        while (it2.hasNext()) {
            LIZ(it2.next(), arrayList);
        }
        return arrayList;
    }

    public static final void LIZ(Fragment fragment, List<Fragment> list) {
        if (fragment.isAdded() && !fragment.isRemoving() && fragment.getHost() != null && !fragment.getChildFragmentManager().LJJLIIIJL().isEmpty()) {
            ((ArrayList) list).addAll(fragment.getChildFragmentManager().LJJLIIIJL());
            Iterator<Fragment> it2 = fragment.getChildFragmentManager().LJJLIIIJL().iterator();
            while (it2.hasNext()) {
                LIZ(it2.next(), list);
            }
        }
    }
}
