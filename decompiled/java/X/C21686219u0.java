package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19u0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21686219u0 {
    public final int LJ;
    public final ArrayList<View> LIZ = new ArrayList<>();
    public int LIZIZ = Integer.MIN_VALUE;
    public int LIZJ = Integer.MIN_VALUE;
    public int LIZLLL = 0;
    public int LJFF = Integer.MIN_VALUE;
    public int LJI = Integer.MIN_VALUE;

    public final void LIZ() {
        this.LIZ.clear();
        this.LIZIZ = Integer.MIN_VALUE;
        this.LIZJ = Integer.MIN_VALUE;
        this.LJI = Integer.MIN_VALUE;
        this.LJFF = Integer.MIN_VALUE;
        this.LIZLLL = 0;
    }

    public C21686219u0(int i) {
        this.LJ = i;
    }

    public final void LIZLLL(int i) {
        int i2 = this.LJFF;
        if (i2 != Integer.MIN_VALUE) {
            this.LJFF = i2 + i;
        }
        int i3 = this.LIZIZ;
        if (i3 != Integer.MIN_VALUE) {
            this.LIZIZ = i3 + i;
        }
        int i4 = this.LJI;
        if (i4 != Integer.MIN_VALUE) {
            this.LJI = i4 + i;
        }
        int i5 = this.LIZJ;
        if (i5 != Integer.MIN_VALUE) {
            this.LIZJ = i5 + i;
        }
    }

    public final void LJ(AbstractC21686519u3 abstractC21686519u3) {
        int size = this.LIZ.size();
        View view = (View) ListProtector.remove(this.LIZ, size - 1);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.LIZLLL -= abstractC21686519u3.LIZJ(view);
        }
        if (size == 1) {
            this.LIZIZ = Integer.MIN_VALUE;
        }
        this.LIZJ = Integer.MIN_VALUE;
    }

    public final void LJFF(AbstractC21686519u3 abstractC21686519u3) {
        View view = (View) ListProtector.remove(this.LIZ, 0);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (this.LIZ.isEmpty()) {
            this.LIZJ = Integer.MIN_VALUE;
        }
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            this.LIZLLL -= abstractC21686519u3.LIZJ(view);
        }
        this.LIZIZ = Integer.MIN_VALUE;
    }

    public final int LIZIZ(int i, AbstractC21686519u3 abstractC21686519u3) {
        int i2 = this.LIZJ;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (i != Integer.MIN_VALUE && this.LIZ.isEmpty()) {
            int i3 = this.LJFF;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            return i;
        }
        if (this.LIZ.isEmpty()) {
            this.LIZJ = Integer.MIN_VALUE;
        } else {
            this.LIZJ = abstractC21686519u3.LIZIZ((View) ListProtector.get(this.LIZ, r1.size() - 1));
        }
        return this.LIZJ;
    }

    public final int LIZJ(int i, AbstractC21686519u3 abstractC21686519u3) {
        int i2 = this.LIZIZ;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (i != Integer.MIN_VALUE && this.LIZ.isEmpty()) {
            int i3 = this.LJI;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            return i;
        }
        if (this.LIZ.isEmpty()) {
            this.LIZIZ = Integer.MIN_VALUE;
        } else {
            this.LIZIZ = abstractC21686519u3.LJ((View) ListProtector.get(this.LIZ, 0));
        }
        return this.LIZIZ;
    }
}
