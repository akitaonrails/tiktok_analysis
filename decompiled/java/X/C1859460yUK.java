package X;

import android.text.Spanned;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yUK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859460yUK {
    public static final InterfaceC1859200yTu LIZ(ViewGroup viewGroup, Spanned spanned, InterfaceC1859630yUb interfaceC1859630yUb) {
        List list;
        Object next;
        int spanStart = spanned.getSpanStart(interfaceC1859630yUb);
        int spanEnd = spanned.getSpanEnd(interfaceC1859630yUb);
        String dataType = interfaceC1859630yUb.getDataType();
        String strLIZ = interfaceC1859630yUb.LIZ();
        Object tag = viewGroup.getTag(R.id.o0p);
        if (!C19719512Dh.LJI(tag) || (list = (List) tag) == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C1859550yUT c1859550yUT = (C1859550yUT) next;
                C07QJ.LIZ.getClass();
                if (C07QJ.LIZIZ()) {
                    if (c1859550yUT.LIZ == spanStart && c1859550yUT.LIZIZ == spanEnd && Intrinsics.LJFF(c1859550yUT.LIZLLL, strLIZ)) {
                        break;
                    }
                } else if (c1859550yUT.LIZ == spanStart && c1859550yUT.LIZIZ == spanEnd && Intrinsics.LJFF(c1859550yUT.LIZJ, dataType) && Intrinsics.LJFF(c1859550yUT.LIZLLL, strLIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1859550yUT c1859550yUT2 = (C1859550yUT) next;
        if (c1859550yUT2 == null) {
            return null;
        }
        list.remove(c1859550yUT2);
        viewGroup.setTag(R.id.o0p, list);
        return c1859550yUT2.LJ;
    }
}
