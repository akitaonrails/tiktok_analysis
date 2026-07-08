package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: X.08XD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08XD extends C15440062s {
    public static final <T extends Comparable<? super T>> void LJIL(List<T> list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void LJJ(List<T> list, Comparator<? super T> comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
