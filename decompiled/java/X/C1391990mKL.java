package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mKL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391990mKL {
    public C197039127h LIZ;
    public Function2<? super View, ? super C1391990mKL, Unit> LIZJ;
    public CharSequence LJ;
    public boolean LIZIZ = true;
    public boolean LIZLLL = true;

    public final void LIZ(CharSequence charSequence) {
        C197039127h c197039127h;
        this.LJ = charSequence;
        C197039127h c197039127h2 = this.LIZ;
        if (c197039127h2 != null) {
            c197039127h2.setText(charSequence);
        }
        CharSequence charSequence2 = this.LJ;
        if ((charSequence2 == null || charSequence2.length() == 0) && (c197039127h = this.LIZ) != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 8);
        }
    }
}
