package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ibB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248670ibB extends AbstractC1247880iZu {
    public final C1248700ibE LIZIZ;
    public TuxTextView LIZJ;
    public TuxIconView LIZLLL;
    public final LinearLayout LJ;

    @Override // X.AbstractC1247880iZu
    public final View LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC1247880iZu
    public final View LIZIZ() {
        return this.LJ;
    }

    public C1248670ibB(C1248700ibE c1248700ibE) {
        LinearLayout linearLayout;
        Context context;
        super(c1248700ibE);
        this.LIZIZ = c1248700ibE;
        if (c1248700ibE != null && (context = c1248700ibE.LIZ) != null) {
            linearLayout = new LinearLayout(context);
        } else {
            linearLayout = null;
        }
        this.LJ = linearLayout;
    }

    public final void LJ(Function2 function2) {
        TuxIconView tuxIconView;
        View viewLIZ = new C1248680ibC(this.LIZIZ).LIZ();
        TuxTextView tuxTextView = null;
        if (viewLIZ instanceof TuxIconView) {
            tuxIconView = (TuxIconView) viewLIZ;
        } else {
            tuxIconView = null;
        }
        this.LIZLLL = tuxIconView;
        View viewLIZ2 = new C1248690ibD(this.LIZIZ).LIZ();
        if (viewLIZ2 instanceof TuxTextView) {
            tuxTextView = (TuxTextView) viewLIZ2;
        }
        this.LIZJ = tuxTextView;
        LinearLayout linearLayout = this.LJ;
        if (linearLayout != null) {
            linearLayout.addView(this.LIZLLL);
        }
        LinearLayout linearLayout2 = this.LJ;
        if (linearLayout2 != null) {
            linearLayout2.addView(this.LIZJ);
        }
        function2.invoke(this.LIZJ, this.LIZLLL);
    }
}
