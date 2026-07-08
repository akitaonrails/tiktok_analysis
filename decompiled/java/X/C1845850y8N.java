package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0y8N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845850y8N {
    public Object LIZ;
    public CharSequence LIZIZ;
    public int LIZJ = -1;
    public C1846010y8d LIZLLL;
    public C1845910y8T LJ;
    public boolean LJFF;

    public final void LIZ(CharSequence charSequence) {
        C1845910y8T c1845910y8T;
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence) && (c1845910y8T = this.LJ) != null) {
            c1845910y8T.setContentDescription(charSequence);
        }
        this.LIZIZ = charSequence;
        C1846010y8d c1846010y8d = this.LIZLLL;
        if (c1846010y8d != null) {
            c1846010y8d.LLJJJJLIIL = true;
        }
        C1845910y8T c1845910y8T2 = this.LJ;
        if (c1845910y8T2 != null) {
            c1845910y8T2.LIZ();
        }
    }
}
