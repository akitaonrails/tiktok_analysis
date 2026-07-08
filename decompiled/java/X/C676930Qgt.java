package X;

import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676930Qgt {
    public CharSequence LIZ;
    public int LIZIZ = -1;
    public C1846140y8q LIZJ;
    public C1845990y8b LIZLLL;
    public Integer LJ;

    public final void LIZ(CharSequence charSequence) {
        String string;
        String string2;
        C1846140y8q c1846140y8q;
        C1845990y8b c1845990y8b;
        CharSequence charSequence2 = this.LIZ;
        if (charSequence2 != null) {
            string = charSequence2.toString();
        } else {
            string = null;
        }
        if (charSequence != null) {
            string2 = charSequence.toString();
        } else {
            string2 = null;
        }
        boolean z = !Intrinsics.LJFF(string, string2);
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence) && (c1845990y8b = this.LIZLLL) != null) {
            c1845990y8b.setContentDescription(charSequence);
        }
        this.LIZ = charSequence;
        C1845990y8b c1845990y8b2 = this.LIZLLL;
        if (c1845990y8b2 != null) {
            c1845990y8b2.LIZ();
        }
        if (z && (c1846140y8q = this.LIZJ) != null) {
            c1846140y8q.LJIIIZ();
        }
    }
}
