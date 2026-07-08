package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: renamed from: X.19SR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19SR extends C19SQ {
    public int[][] LJJIJIIJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19SQ
    public void LJ() {
        int[][] iArr = this.LJJIJIIJI;
        int[][] iArr2 = new int[iArr.length][];
        for (int length = iArr.length - 1; length >= 0; length--) {
            int[] iArr3 = this.LJJIJIIJI[length];
            iArr2[length] = iArr3 != null ? iArr3.clone() : null;
        }
        this.LJJIJIIJI = iArr2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new C19SO(this, null);
    }

    public final int LJFF(int[] iArr) {
        int[][] iArr2 = this.LJJIJIIJI;
        int i = this.LJII;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C19SO(this, resources);
    }

    public C19SR(C19SR c19sr, C19SO c19so, Resources resources) {
        super(c19sr, c19so, resources);
        if (c19sr != null) {
            this.LJJIJIIJI = c19sr.LJJIJIIJI;
        } else {
            this.LJJIJIIJI = new int[this.LJI.length][];
        }
    }
}
