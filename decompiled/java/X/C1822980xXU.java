package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0xXU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1822980xXU extends AbstractC1823000xXW {
    public final TextView LLJILLL;
    public final TextView LLJJ;
    public final TextView LLJJI;
    public final TextView LLJJIII;
    public final ConstraintLayout LLJJIJI;
    public final LinearLayout LLJJIJIIJIL;
    public final ConstraintLayout LLJJIJIL;

    @Override // X.AbstractC1823000xXW
    public final void I5(C1822350xWT c1822350xWT) {
        super.I5(c1822350xWT);
        if (c1822350xWT != null) {
            boolean z = true;
            if (c1822350xWT.LIZJ.length() == 0 && c1822350xWT.LIZLLL.length() == 0) {
                C500260Jjc.LJIILIIL(this.LLJJIJI);
                C500260Jjc.LJLJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), this.LLIZLLLIL);
            } else {
                C500260Jjc.LLFFF(this.LLJJIJI);
                if (c1822350xWT.LIZJ.length() + c1822350xWT.LIZLLL.length() <= 40) {
                    z = false;
                }
                P5(z, c1822350xWT);
            }
        }
        N5();
    }

    public void P5(boolean z, C1822350xWT c1822350xWT) {
        Pair pair;
        if (z || c1822350xWT.LIZLLL.length() == 0) {
            C500260Jjc.LLFFF(this.LLJJIJIIJIL);
            C500260Jjc.LJIILIIL(this.LLJJIJIL);
            pair = new Pair(this.LLJJIII, this.LLJJ);
        } else {
            C500260Jjc.LJIILIIL(this.LLJJIJIIJIL);
            C500260Jjc.LLFFF(this.LLJJIJIL);
            pair = new Pair(this.LLJJI, this.LLJILLL);
        }
        final TextView textView = (TextView) pair.getFirst();
        final TextView textView2 = (TextView) pair.getSecond();
        if (c1822350xWT.LIZLLL.length() == 0) {
            C500260Jjc.LJIILIIL(textView);
        } else {
            textView.setText(c1822350xWT.LIZLLL);
            C500260Jjc.LLFFF(textView);
            if (!this.LL) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xXZ
                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view) throws JSONException {
                        if (view != null) {
                            C1749450vct c1749450vct = C1749450vct.LIZ;
                            Context context = textView.getContext();
                            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("text", textView.getText().toString()), new Pair("toast", C497740JfY.LJIJI(2131856030)));
                            EnumC1749470vcv enumC1749470vcv = EnumC1749470vcv.DEFAULT;
                            Map mapLJ = C2097608Jq.LJ();
                            c1749450vct.getClass();
                            C1749450vct.LIZIZ(context, mapLJIIJ, enumC1749470vcv, mapLJ);
                            this.LLILLL.LJ("phone");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(300L);
                    }
                }, textView);
            }
        }
        if (c1822350xWT.LIZJ.length() == 0) {
            C500260Jjc.LJIILIIL(textView2);
            return;
        }
        textView2.setText(c1822350xWT.LIZJ);
        C500260Jjc.LLFFF(textView2);
        if (this.LL) {
            return;
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0xXf
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) throws JSONException {
                if (view != null) {
                    C1822980xXU c1822980xXU = this;
                    TextView textView3 = textView2;
                    c1822980xXU.L5(textView3, textView3.getText().toString());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, textView2);
    }

    public C1822980xXU(View view, boolean z, String str, String str2, InterfaceC1823190xXp interfaceC1823190xXp, boolean z2, C1822330xWR c1822330xWR) {
        super(view, z, str, str2, interfaceC1823190xXp, z2, 2131856015, c1822330xWR);
        this.LLJILLL = (TextView) view.findViewById(R.id.gy5);
        this.LLJJ = (TextView) view.findViewById(R.id.gy6);
        this.LLJJI = (TextView) view.findViewById(R.id.qa_);
        this.LLJJIII = (TextView) view.findViewById(R.id.qaa);
        this.LLJJIJI = (ConstraintLayout) view.findViewById(R.id.equ);
        this.LLJJIJIIJIL = (LinearLayout) view.findViewById(R.id.eqw);
        this.LLJJIJIL = (ConstraintLayout) view.findViewById(R.id.eqv);
    }
}
