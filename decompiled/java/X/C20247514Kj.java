package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.14Kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20247514Kj extends C19SR {
    public C20066713fN<Long> LJJIJIIJIL;
    public C1119470fEn<Integer> LJJIJIL;

    @Override // X.C19SR, X.C19SQ
    public final void LJ() {
        this.LJJIJIIJIL = this.LJJIJIIJIL.clone();
        this.LJJIJIL = this.LJJIJIL.clone();
    }

    @Override // X.C19SR, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C19SN(this, null);
    }

    @Override // X.C19SR, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C19SN(this, resources);
    }

    public C20247514Kj(C20247514Kj c20247514Kj, C19SN c19sn, Resources resources) {
        super(c20247514Kj, c19sn, resources);
        if (c20247514Kj != null) {
            this.LJJIJIIJIL = c20247514Kj.LJJIJIIJIL;
            this.LJJIJIL = c20247514Kj.LJJIJIL;
        } else {
            this.LJJIJIIJIL = new C20066713fN<>();
            this.LJJIJIL = new C1119470fEn<>();
        }
    }
}
