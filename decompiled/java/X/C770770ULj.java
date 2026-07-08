package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ULj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770770ULj {
    public C197039127h LIZ;
    public Function1<? super C770770ULj, Unit> LIZJ;
    public boolean LJ;
    public CharSequence LJFF;
    public boolean LIZIZ = true;
    public boolean LIZLLL = true;

    public final void LIZ(boolean z) {
        this.LJ = z;
        C197039127h c197039127h = this.LIZ;
        if (c197039127h != null) {
            c197039127h.setLoading(z);
        }
    }

    public final void LIZIZ(CharSequence charSequence) {
        C197039127h c197039127h;
        this.LJFF = charSequence;
        C197039127h c197039127h2 = this.LIZ;
        if (c197039127h2 != null) {
            c197039127h2.setText(charSequence);
        }
        CharSequence charSequence2 = this.LJFF;
        if ((charSequence2 == null || charSequence2.length() == 0) && (c197039127h = this.LIZ) != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 8);
        }
    }
}
