package X;

import Y.ACListenerS81S0300000_15;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0b6B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960370b6B extends AbstractC960410b6F<C960380b6C, C960360b6A> {
    public final RecyclerView LIZIZ;
    public final InterfaceC960350b69 LIZJ;

    @Override // X.AbstractC960410b6F
    public final String LJIIIZ() {
        return "InteractRandomGuidanceLargeViewBinder";
    }

    public C960370b6B(RunnableC781530UlD runnableC781530UlD, InterfaceC960350b69 interfaceC960350b69) {
        this.LIZIZ = runnableC781530UlD;
        this.LIZJ = interfaceC960350b69;
    }

    @Override // X.AbstractC960410b6F
    public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gue, viewGroup, false);
        return new AbstractC960400b6E<C960380b6C>(viewTd) { // from class: X.0b6A
            public final C01GW LLILZ;

            @Override // X.AbstractC960400b6E
            public final void LLIILZL() {
                this.LL = false;
                View view = (View) this.LLILZ.getValue();
                if (view != null) {
                    C786410Ut5.I7(null, view);
                }
            }

            @Override // X.AbstractC960400b6E
            public final String getName() {
                return "InteractRandomGuidanceLargeViewHolder";
            }

            {
                super(viewTd);
                this.LLILZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS559S0100000_15(viewTd, 1009));
                Resources resources = viewTd.getResources();
                TextView textView = (TextView) viewTd.findViewById(R.id.tv_random_linkmic_guidance_desc1);
                if (textView != null) {
                    textView.setText(C786410Ut5.j4(resources.getString(2131855483), Arrays.copyOf(new Object[]{resources.getString(2131841099)}, 1)));
                }
                TextView textView2 = (TextView) viewTd.findViewById(R.id.tv_random_linkmic_guidance_desc2);
                if (textView2 != null) {
                    textView2.setText(C786410Ut5.j4(resources.getString(2131855483), Arrays.copyOf(new Object[]{resources.getString(2131841100)}, 1)));
                }
                TextView textView3 = (TextView) viewTd.findViewById(R.id.tv_random_linkmic_guidance_desc3);
                if (textView3 != null) {
                    textView3.setText(C786410Ut5.j4(resources.getString(2131855483), Arrays.copyOf(new Object[]{resources.getString(2131841101)}, 1)));
                }
            }

            @Override // X.AbstractC960400b6E
            public final void I5(List list, int i, Object obj) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                int i2;
                C960380b6C c960380b6C = (C960380b6C) obj;
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    if (i == 0) {
                        i2 = 8;
                    } else {
                        i2 = 16;
                    }
                    marginLayoutParams.topMargin = C439101nJ.LIZ(i2);
                }
                View view = (View) this.LLILZ.getValue();
                if (view != null) {
                    C786410Ut5.I7(new ACListenerS81S0300000_15(this.LLILZIL, c960380b6C, this, 15), view);
                }
            }
        };
    }
}
