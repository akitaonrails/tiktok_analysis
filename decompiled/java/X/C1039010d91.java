package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0d91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039010d91 extends AbstractC1067720dtK {
    public final /* synthetic */ C1039050d95 LIZ;

    public C1039010d91(C1039050d95 c1039050d95) {
        this.LIZ = c1039050d95;
    }

    @Override // X.AbstractC1067720dtK
    public final View LIZ(Context context) {
        this.LIZ.LJLLLL(context);
        return this.LIZ.LLILLL;
    }

    @Override // X.AbstractC1067720dtK
    public final void LIZIZ(View.OnClickListener onClickListener) {
        View viewFindViewById;
        View view = this.LIZ.LLILLL;
        if (view != null && (viewFindViewById = view.findViewById(R.id.jux)) != null) {
            C786410Ut5.I7(new ACListenerS119S0200000_16(this.LIZ, onClickListener, 47), viewFindViewById);
        }
    }

    @Override // X.AbstractC1067720dtK
    public final void LIZJ(boolean z) {
        View viewFindViewById;
        int i;
        View view = this.LIZ.LLILLL;
        if (view != null && (viewFindViewById = view.findViewById(R.id.juy)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
    }

    @Override // X.AbstractC1067720dtK
    public final void LIZLLL(View.OnClickListener onClickListener) {
        View viewFindViewById;
        View view = this.LIZ.LLILLL;
        if (view != null && (viewFindViewById = view.findViewById(R.id.juy)) != null) {
            C786410Ut5.I7(onClickListener, viewFindViewById);
        }
    }

    @Override // X.AbstractC1067720dtK
    public final void LJ(String str) {
        View view = this.LIZ.LLILLL;
        if (view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.tlq);
        View viewFindViewById2 = view.findViewById(R.id.cu8);
        View viewFindViewById3 = view.findViewById(R.id.cv0);
        C786410Ut5.I7(new ACListenerS151S0100000_16(this.LIZ, 194), viewFindViewById);
        C786410Ut5.I7(new ACListenerS151S0100000_16(this.LIZ, 195), viewFindViewById2);
        C786410Ut5.I7(new ACListenerS151S0100000_16(this.LIZ, 196), viewFindViewById3);
        int iHashCode = str.hashCode();
        if (iHashCode != -934521548) {
            if (iHashCode != 109400031) {
                if (iHashCode == 949444906 && str.equals("collect")) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                    return;
                }
                return;
            }
            if (!str.equals("share")) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
            return;
        }
        if (!str.equals("report")) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById2);
    }

    @Override // X.AbstractC1067720dtK
    public final void LJFF(String str) {
        View view;
        TextView textView;
        if (!C1039030d93.LIZ(str) && (view = this.LIZ.LLILLL) != null && (textView = (TextView) view.findViewById(R.id.tv_title)) != null) {
            textView.setText(str);
        }
    }

    @Override // X.AbstractC1067720dtK
    public final void LJI(int i) {
        View view = this.LIZ.LLILLL;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Override // X.AbstractC1067720dtK
    public final void LJII(int i) {
        TextView textView;
        View view = this.LIZ.LLILLL;
        if (view != null && (textView = (TextView) view.findViewById(R.id.tv_title)) != null) {
            textView.setTextColor(i);
        }
    }
}
