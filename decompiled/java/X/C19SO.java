package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: renamed from: X.19SO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19SO extends C19SP {
    public C19SR LLJILLL;
    public boolean LLJJ;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // X.C19SP
    /* JADX INFO: renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public C19SR LIZIZ() {
        return new C19SR(this.LLJILLL, this, null);
    }

    @Override // X.C19SP, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.LLJJ) {
            super.mutate();
            this.LLJILLL.LJ();
            this.LLJJ = true;
        }
        return this;
    }

    public C19SO() {
    }

    @Override // X.C19SP
    public void LJ(C19SQ c19sq) {
        this.LL = c19sq;
        int i = this.LLIZ;
        if (i >= 0) {
            Drawable drawableLIZLLL = c19sq.LIZLLL(i);
            this.LLILLL = drawableLIZLLL;
            if (drawableLIZLLL != null) {
                LIZJ(drawableLIZLLL);
            }
        }
        this.LLILZ = null;
        if (c19sq instanceof C19SR) {
            this.LLJILLL = (C19SR) c19sq;
        }
    }

    @Override // X.C19SP, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // X.C19SP, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iLJFF = this.LLJILLL.LJFF(iArr);
        if (iLJFF < 0) {
            iLJFF = this.LLJILLL.LJFF(StateSet.WILD_CARD);
        }
        if (!LIZLLL(iLJFF) && !zOnStateChange) {
            return false;
        }
        return true;
    }

    public C19SO(C19SR c19sr, Resources resources) {
        LJ(new C19SR(c19sr, this, resources));
        onStateChange(getState());
    }
}
