package X;

import android.util.SparseArray;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.19JR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19JR extends ViewGroup.LayoutParams {
    public final SparseArray<Float> LIZ;
    public final SparseArray<String> LIZIZ;

    public C19JR(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        if (layoutParams instanceof C19JR) {
            C19JR c19jr = (C19JR) layoutParams;
            this.LIZ = c19jr.LIZ.clone();
            this.LIZIZ = c19jr.LIZIZ.clone();
            return;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        this.LIZ = sparseArray;
        this.LIZIZ = new SparseArray<>();
        if (layoutParams.width >= 0) {
            sparseArray.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
        }
        if (layoutParams.height < 0) {
            return;
        }
        sparseArray.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
    }

    public C19JR(int i, int i2) {
        super(i, i2);
        SparseArray<Float> sparseArray = new SparseArray<>();
        this.LIZ = sparseArray;
        this.LIZIZ = new SparseArray<>();
        if (i == -2 || i == -1 || i >= 0) {
            sparseArray.put(15, Float.valueOf(i));
        }
        if (i2 == -2 || i2 == -1 || i2 >= 0) {
            sparseArray.put(16, Float.valueOf(i2));
        }
    }
}
