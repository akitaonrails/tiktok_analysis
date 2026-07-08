package X;

import android.text.TextUtils;
import android.view.View;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425810nCt implements InterfaceC1846270y93 {
    public Object LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public Pair<Integer, Integer> LIZLLL;
    public CharSequence LJ;
    public View LJFF;
    public int LJI = -1;
    public Integer LJII;
    public C1846220y8y LJIIIIZZ;
    public C1846230y8z LJIIIZ;

    @Override // X.InterfaceC1846270y93
    public final void LIZ() {
    }

    @Override // X.InterfaceC1846270y93
    public final void LIZIZ() {
        C1846230y8z c1846230y8z = this.LJIIIZ;
        if (c1846230y8z != null) {
            c1846230y8z.LIZJ();
        }
    }

    @Override // X.InterfaceC1846270y93
    public final void LIZJ(C1425810nCt c1425810nCt) {
        C1846230y8z c1846230y8z = this.LJIIIZ;
        if (c1846230y8z != null) {
            c1846230y8z.LIZJ();
        }
    }

    public final void LIZLLL(View view) {
        this.LJFF = view;
        C1846220y8y c1846220y8y = this.LJIIIIZZ;
        if (c1846220y8y != null) {
            c1846220y8y.LJIIZILJ();
        }
        C1846230y8z c1846230y8z = this.LJIIIZ;
        if (c1846230y8z != null) {
            c1846230y8z.LIZJ();
        }
    }

    public final void LJFF(CharSequence charSequence) {
        C1846230y8z c1846230y8z;
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence) && (c1846230y8z = this.LJIIIZ) != null) {
            c1846230y8z.setContentDescription(charSequence);
        }
        this.LJ = charSequence;
        this.LJFF = null;
        C1846220y8y c1846220y8y = this.LJIIIIZZ;
        if (c1846220y8y != null) {
            c1846220y8y.LLJL = true;
        }
        C1846230y8z c1846230y8z2 = this.LJIIIZ;
        if (c1846230y8z2 != null) {
            c1846230y8z2.LIZJ();
        }
    }

    public final void LJ(int i, Integer num, Pair pair) {
        this.LIZIZ = Integer.valueOf(i);
        this.LIZJ = num;
        this.LIZLLL = pair;
        C1846220y8y c1846220y8y = this.LJIIIIZZ;
        if (c1846220y8y != null) {
            c1846220y8y.LJIIZILJ();
        }
        C1846220y8y c1846220y8y2 = this.LJIIIIZZ;
        if (c1846220y8y2 != null) {
            c1846220y8y2.LIZ(this);
        }
        C1846230y8z c1846230y8z = this.LJIIIZ;
        if (c1846230y8z != null) {
            c1846230y8z.LIZJ();
        }
    }
}
