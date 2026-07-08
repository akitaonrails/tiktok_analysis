package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: renamed from: X.0DCN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCN {
    public final View LIZ;
    public final C0DC4 LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0DC4] */
    public C0DCN(final C19EG c19eg, final View view, final OnestepCheckoutViewModel onestepCheckoutViewModel) {
        this.LIZ = view;
        this.LIZIZ = new AbstractC336200DFy(c19eg, view, onestepCheckoutViewModel) { // from class: X.0DC4
            public final OnestepCheckoutViewModel LIZLLL;
            public final int LJ = R.layout.i4o;

            @Override // X.AbstractC336200DFy
            public final int LIZJ() {
                return 0;
            }

            @Override // X.AbstractC336200DFy
            public final TextView LIZ() {
                TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
                tuxTextView.setTuxFont(71);
                return tuxTextView;
            }

            @Override // X.AbstractC336200DFy
            public final int LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC336200DFy
            public final boolean LJII(C0D3V c0d3v) {
                return c0d3v.isVariantLoading();
            }

            @Override // X.AbstractC336200DFy
            public final boolean LJIIIIZZ(C0D3V c0d3v) {
                return c0d3v.isSingleSku();
            }

            @Override // X.AbstractC336200DFy
            public final C0DGF LIZIZ(final List list, final AwS370S0200000_4 awS370S0200000_4) {
                return new C0DGF(list, awS370S0200000_4) { // from class: X.0DCP
                    public final int LLILZIL = R.layout.i48;

                    @Override // X.C0DGF
                    public final int LLLFZ() {
                        return this.LLILZIL;
                    }

                    @Override // X.C0DGF
                    public final void LLLI(C0DGH c0dgh, boolean z) {
                        TuxTextView tuxTextView;
                        int i;
                        TextView textView = c0dgh.LLILLJJLI;
                        if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
                            if (z) {
                                i = 72;
                            } else {
                                i = 71;
                            }
                            tuxTextView.setTuxFont(i);
                        }
                    }
                };
            }

            @Override // X.AbstractC336200DFy
            public final void LJ(String str, String str2) {
                C0D3P c0d3p = this.LIZLLL.LL.LJIIJ;
                c0d3p.getClass();
                c0d3p.LJIIJJI(C2097908Jt.LIZJ(new Pair(str, str2)));
            }

            {
                this.LIZLLL = onestepCheckoutViewModel;
            }
        };
    }
}
