package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0y8W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845940y8W {
    public Object LIZ;
    public Integer LIZIZ;
    public CharSequence LIZJ;
    public int LIZLLL = -1;
    public C1846060y8i LJ;
    public C1845930y8V LJFF;

    public final void LIZ() {
        C1846060y8i c1846060y8i = this.LJ;
        if (c1846060y8i != null) {
            C1085640eME c1085640eME = C1846060y8i.LLJL;
            c1846060y8i.LJIILL(this, true);
        }
    }

    public final void LIZIZ(CharSequence charSequence) {
        C1845930y8V c1845930y8V;
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence) && (c1845930y8V = this.LJFF) != null) {
            c1845930y8V.setContentDescription(charSequence);
        }
        this.LIZJ = charSequence;
        C1846060y8i c1846060y8i = this.LJ;
        if (c1846060y8i != null) {
            c1846060y8i.LLJJJJLIIL = true;
        }
        C1845930y8V c1845930y8V2 = this.LJFF;
        if (c1845930y8V2 != null) {
            c1845930y8V2.LIZ();
        }
    }
}
