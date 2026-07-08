package X;

import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: renamed from: X.0DD5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DD5 extends AbstractC336200DFy {
    public final PdpViewModel LIZLLL;
    public final int LJ;

    @Override // X.AbstractC336200DFy
    public final TextView LIZ() {
        TextView textView = new TextView(this.LIZ);
        textView.setTextSize(12.0f);
        return textView;
    }

    @Override // X.AbstractC336200DFy
    public final int LIZLLL() {
        return this.LJ;
    }

    @Override // X.AbstractC336200DFy
    public final C0DGF LIZIZ(final List list, final AwS370S0200000_4 awS370S0200000_4) {
        return new C0DGF(list, awS370S0200000_4) { // from class: X.0DD6
            public final int LLILZIL = R.layout.i43;

            @Override // X.C0DGF
            public final int LLLFZ() {
                return this.LLILZIL;
            }
        };
    }

    @Override // X.AbstractC336200DFy
    public final void LJ(String str, String str2) {
        C0D3P c0d3p = this.LIZLLL.LLJILJIL;
        c0d3p.getClass();
        c0d3p.LJIIJJI(C2097908Jt.LIZJ(new Pair(str, str2)));
    }

    public C0DD5(C19EG c19eg, View view, PdpViewModel pdpViewModel) {
        super(view, c19eg);
        this.LIZLLL = pdpViewModel;
        this.LJ = R.layout.i5_;
    }
}
