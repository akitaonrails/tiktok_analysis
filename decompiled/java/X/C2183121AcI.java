package X;

import Y.ACListenerS167S0100000_33;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.model.interact.VirtualWaitingUser;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1AcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183121AcI extends C0J8P<VirtualWaitingUser, C2183131AcJ> {
    public final InterfaceC2183161AcM LIZIZ;

    public C2183121AcI(InterfaceC2183161AcM interfaceC2183161AcM) {
        this.LIZIZ = interfaceC2183161AcM;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, VirtualWaitingUser virtualWaitingUser) {
        boolean z;
        C2183131AcJ c2183131AcJ = (C2183131AcJ) viewHolder;
        VirtualWaitingUser virtualWaitingUser2 = virtualWaitingUser;
        c2183131AcJ.getClass();
        ((TextView) c2183131AcJ.LLILZLL.getValue()).setText(2131841169);
        long jLJ = C915980Zwa.LJIIIZ().LJ(virtualWaitingUser2.sendUserId);
        C786410Ut5.LLJJJJ((C16F5) c2183131AcJ.LLILLL.getValue(), 0);
        ((TextView) c2183131AcJ.LLILLL.getValue()).setTextSize(15.0f);
        if (jLJ > 0) {
            TextView textView = (TextView) c2183131AcJ.LLILLL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(jLJ);
            sbLIZ.append('s');
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            ((TextView) c2183131AcJ.LLILLL.getValue()).setText("...");
        }
        if (virtualWaitingUser2.sendUserId == C950220apo.LJFF()) {
            C786410Ut5.LJLLLLLL(0, (View) c2183131AcJ.LLILZ.getValue());
            C786410Ut5.LJLLLLLL(0, (View) c2183131AcJ.LLILZIL.getValue());
        } else {
            C786410Ut5.LJLLLLLL(8, (View) c2183131AcJ.LLILZ.getValue());
            C786410Ut5.LJLLLLLL(8, (View) c2183131AcJ.LLILZIL.getValue());
        }
        C786410Ut5.I7(new ACListenerS167S0100000_33(this, 79), (View) c2183131AcJ.LLILZ.getValue());
        if (virtualWaitingUser2.sendUserId == C950220apo.LJFF()) {
            z = true;
        } else {
            z = false;
        }
        C1099610eil c1099610eil = (C1099610eil) c2183131AcJ.LL.getValue();
        C1099610eil c1099610eil2 = (C1099610eil) c2183131AcJ.LLILLJJLI.getValue();
        if (c1099610eil != null) {
            C786410Ut5.q5(c1099610eil, 1.0f);
            C786410Ut5.LLLJ(c1099610eil, 0);
        }
        if (c1099610eil2 != null) {
            C786410Ut5.q5(c1099610eil2, 0.0f);
            C786410Ut5.LLLJ(c1099610eil2, 0);
        }
        C2183141AcK<Integer> c2183141AcK = C2183111AcH.LJIIL;
        int iIntValue = c2183141AcK.LIZ(z).intValue();
        C2183141AcK<Boolean> c2183141AcK2 = C2183111AcH.LJIILL;
        C2183101AcG.LIZIZ(c1099610eil, iIntValue + (c2183141AcK2.LIZ(z).booleanValue() ? 1 : 0), z, Float.valueOf(50.0f));
        if (!c2183141AcK2.LIZ(z).booleanValue()) {
            C2183101AcG.LIZIZ(c1099610eil2, c2183141AcK.LIZ(z).intValue() + 1, z, Float.valueOf(50.0f));
            if (c1099610eil != null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1099610eil, (Property<C1099610eil, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat.setDuration(300L);
                C786410Ut5.Pd(objectAnimatorOfFloat);
            }
            if (c1099610eil2 != null) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1099610eil2, (Property<C1099610eil, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(300L);
                C786410Ut5.Pd(objectAnimatorOfFloat2);
            }
        }
        c2183141AcK2.LIZIZ(Boolean.TRUE, z);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C2183131AcJ(C786410Ut5.Td(layoutInflater, R.layout.gsd, viewGroup, false));
    }
}
