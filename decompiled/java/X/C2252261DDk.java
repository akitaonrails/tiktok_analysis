package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.1DDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252261DDk extends LinearLayout {
    public C2252251DDj LL;

    public final void LIZIZ() {
        C2252251DDj c2252251DDj = this.LL;
        if (c2252251DDj != null) {
            c2252251DDj.LIZ();
        }
    }

    public C2252261DDk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void LIZ(int i, int i2) {
        C2252251DDj c2252251DDj = this.LL;
        if (c2252251DDj != null) {
            c2252251DDj.LIZ();
        }
        C2252251DDj c2252251DDj2 = new C2252251DDj(this);
        this.LL = c2252251DDj2;
        c2252251DDj2.LIZIZ = i2;
        c2252251DDj2.LIZJ = 2;
        c2252251DDj2.LIZLLL = i;
        c2252251DDj2.LJFF = true;
        c2252251DDj2.LJIIIIZZ.run();
    }
}
