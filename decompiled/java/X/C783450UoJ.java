package X;

import java.util.Comparator;

/* JADX INFO: renamed from: X.0UoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C783450UoJ implements Comparator<C0WIY<String, Float>> {
    @Override // java.util.Comparator
    public final int compare(C0WIY<String, Float> c0wiy, C0WIY<String, Float> c0wiy2) {
        float fFloatValue = c0wiy.LIZIZ.floatValue();
        float fFloatValue2 = c0wiy2.LIZIZ.floatValue();
        if (fFloatValue2 > fFloatValue) {
            return 1;
        }
        if (fFloatValue > fFloatValue2) {
            return -1;
        }
        return 0;
    }
}
