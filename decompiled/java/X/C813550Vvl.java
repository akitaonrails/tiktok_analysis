package X;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: X.0Vvl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813550Vvl {
    public final IconCompat LIZ;
    public final CharSequence LIZIZ;
    public final PendingIntent LIZJ;
    public final boolean LIZLLL;
    public final Bundle LJ;
    public ArrayList<C813560Vvm> LJFF;
    public final int LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    public final C813540Vvk LIZ() {
        CharSequence[] charSequenceArr;
        Set<String> set;
        if (this.LJIIIIZZ && this.LIZJ == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<C813560Vvm> arrayList3 = this.LJFF;
        if (arrayList3 != null) {
            for (C813560Vvm c813560Vvm : arrayList3) {
                if (c813560Vvm.LIZLLL || (!((charSequenceArr = c813560Vvm.LIZJ) == null || charSequenceArr.length == 0) || (set = c813560Vvm.LJI) == null || set.isEmpty())) {
                    arrayList2.add(c813560Vvm);
                } else {
                    arrayList.add(c813560Vvm);
                }
            }
        }
        return new C813540Vvk(this.LIZ, this.LIZIZ, this.LIZJ, this.LJ, arrayList2.isEmpty() ? null : (C813560Vvm[]) arrayList2.toArray(new C813560Vvm[arrayList2.size()]), arrayList.isEmpty() ? null : (C813560Vvm[]) arrayList.toArray(new C813560Vvm[arrayList.size()]), this.LIZLLL, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ);
    }

    public C813550Vvl(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.LJFF(null, "", i) : null, charSequence, pendingIntent, new Bundle());
    }

    public C813550Vvl(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.LIZLLL = true;
        this.LJII = true;
        this.LIZ = iconCompat;
        this.LIZIZ = C813610Vvr.LIZJ(charSequence);
        this.LIZJ = pendingIntent;
        this.LJ = bundle;
        this.LJFF = null;
        this.LIZLLL = true;
        this.LJI = 0;
        this.LJII = true;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
    }
}
