package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06MH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06MH extends LinearLayout implements InterfaceC1632106aF {
    public final /* synthetic */ C1631706aB LL;

    @Override // X.InterfaceC1632106aF
    public final void LJIILIIL() {
        this.LL.LJIILIIL();
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    public C06MH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C1631706aB();
        if (C1665706ff.LIZJ.LJIIIIZZ()) {
            C786410Ut5.LJLLJ(context, R.layout.cfj, this);
            ImageView imageView = (ImageView) findViewById(R.id.loh);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.za;
            imageView.setImageDrawable(c0hti.LIZ(context));
        } else {
            C786410Ut5.LJLLJ(context, R.layout.cfi, this);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
        if (numLIZJ != null) {
            findViewById(R.id.dpn).setBackgroundColor(numLIZJ.intValue());
        }
    }
}
