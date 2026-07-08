package X;

import com.ss.android.ugc.aweme.video.experiment.LowMemoryClearPlayerExp;
import java.lang.ref.Reference;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0ohz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483530ohz {
    public static boolean LIZ;

    public static void LIZ(int i, List list) {
        InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI;
        InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI2;
        ListIterator listIterator = ((CopyOnWriteArrayList) list).listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            InterfaceC1483520ohy interfaceC1483520ohy = (InterfaceC1483520ohy) ((Reference) listIterator.next()).get();
            if (interfaceC1483520ohy == null || (((interfaceC1483510ohxLJJJJZI = interfaceC1483520ohy.LJJJJZI()) != null && interfaceC1483510ohxLJJJJZI.LJJIJIIJIL()) || ((interfaceC1483510ohxLJJJJZI2 = interfaceC1483520ohy.LJJJJZI()) != null && !interfaceC1483510ohxLJJJJZI2.isPlaying() && LowMemoryClearPlayerExp.LIZIZ.clearWhenPause))) {
                if (i > 0 && i2 > i) {
                    return;
                }
                listIterator.remove();
                if (interfaceC1483520ohy != null) {
                    InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI3 = interfaceC1483520ohy.LJJJJZI();
                    if (interfaceC1483510ohxLJJJJZI3 != null) {
                        interfaceC1483510ohxLJJJJZI3.release();
                    }
                    i2++;
                }
            }
        }
    }
}
