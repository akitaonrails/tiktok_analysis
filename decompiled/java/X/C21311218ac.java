package X;

import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.18ac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21311218ac {
    public final ArrayList<C21311418ae> LIZ = new ArrayList<>();
    public final SparseArray<C21311418ae> LIZIZ = new SparseArray<>();
    public final ArrayDeque<C21311418ae> LIZJ = new ArrayDeque<>();

    public final void LIZ(boolean z, Map<View, Integer> map, int i, View[] viewArr, int... iArr) {
        int i2;
        C21311418ae c21311418ae;
        SparseArray<C21311418ae> sparseArray = this.LIZIZ;
        ArrayList<C21311418ae> arrayList = this.LIZ;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C21311418ae c21311418ae2 = (C21311418ae) ListProtector.get(arrayList, i3);
            c21311418ae2.LIZIZ.clear();
            c21311418ae2.LIZJ.clear();
        }
        for (int i4 = 0; i4 < size; i4++) {
            C21311418ae c21311418ae3 = (C21311418ae) ListProtector.get(arrayList, i4);
            int[] rules = ((C21311318ad) c21311418ae3.LIZ.getLayoutParams()).getRules();
            for (int i5 : iArr) {
                int i6 = rules[i5];
                if ((i6 > 0 || C21311118ab.isValid(i6)) && (c21311418ae = sparseArray.get(i6)) != null && c21311418ae != c21311418ae3) {
                    c21311418ae.LIZIZ.put(c21311418ae3, this);
                    c21311418ae3.LIZJ.put(i6, c21311418ae);
                }
            }
        }
        ArrayDeque<C21311418ae> arrayDeque = this.LIZJ;
        arrayDeque.clear();
        for (int i7 = 0; i7 < size; i7++) {
            C21311418ae c21311418ae4 = (C21311418ae) ListProtector.get(arrayList, i7);
            if (c21311418ae4.LIZJ.size() == 0) {
                arrayDeque.addLast(c21311418ae4);
            }
        }
        int i8 = 0;
        while (true) {
            C21311418ae c21311418aePollLast = arrayDeque.pollLast();
            if (c21311418aePollLast == null) {
                break;
            }
            View view = c21311418aePollLast.LIZ;
            int id = view.getId();
            int i9 = i8 + 1;
            viewArr[i8] = view;
            ArrayMap<C21311418ae, C21311218ac> arrayMap = c21311418aePollLast.LIZIZ;
            int size2 = arrayMap.size();
            for (int i10 = 0; i10 < size2; i10++) {
                C21311418ae c21311418aeKeyAt = arrayMap.keyAt(i10);
                SparseArray<C21311418ae> sparseArray2 = c21311418aeKeyAt.LIZJ;
                sparseArray2.remove(id);
                if (sparseArray2.size() == 0) {
                    arrayDeque.add(c21311418aeKeyAt);
                }
            }
            if (z) {
                if (size2 == 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                int i11 = i2 * i;
                if (map.containsKey(view)) {
                    map.put(view, Integer.valueOf(map.get(view).intValue() + i11));
                } else {
                    map.put(view, Integer.valueOf(i11));
                }
            }
            i8 = i9;
        }
        if (i8 < viewArr.length) {
            throw new IllegalStateException("Circular dependencies cannot exist in RelativeLayout");
        }
    }
}
