package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0K3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511360K3q extends C0K3V {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;
    public final C0I7D LLILLL;
    public final ImageView LLILZ;
    public final TextView LLILZIL;
    public C0K4G LLILZLL;
    public final C521840KdK LLIZ;

    public C511360K3q(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
        this.LLILLL = (C0I7D) view.findViewById(R.id.rfs);
        this.LLILZ = (ImageView) view.findViewById(R.id.fkv);
        this.LLILZIL = (TextView) view.findViewById(R.id.kkx);
        this.LLIZ = new C521840KdK(this, 8);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K4G c0k4g;
        C0K4F c0k4f;
        String strValueOf;
        int i;
        if ((abstractC511160K2w instanceof C0K4G) && (c0k4g = (C0K4G) abstractC511160K2w) != null && (interfaceC2753014t instanceof C0K4F) && (c0k4f = (C0K4F) interfaceC2753014t) != null) {
            this.LLILZLL = c0k4g;
            TextView textView = this.LLILZIL;
            int i2 = c0k4g.LIZ.LIZ;
            if (1 <= i2 && i2 < 27) {
                strValueOf = String.valueOf((char) (i2 + 64));
            } else {
                strValueOf = "?";
            }
            textView.setText(strValueOf);
            ImageView imageView = this.LLILZ;
            if (c0k4g.LIZ.LIZJ) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJZI(i, imageView);
            C786410Ut5.Q7(this.LLILZ, new ACListenerS111S0200000_7(this, c0k4g, 81));
            C0I7D c0i7d = this.LLILLL;
            String strLJII = C511520K4g.LJII(2131839600);
            if (strLJII == null) {
                strLJII = "";
            }
            c0i7d.setHint(C786410Ut5.j4(strLJII, Arrays.copyOf(new Object[]{26}, 1)));
            this.LLILLL.setText(c0k4g.LIZ.LIZIZ);
            this.LLILLL.removeTextChangedListener(this.LLIZ);
            this.LLILLL.addTextChangedListener(this.LLIZ);
            this.LLILLL.setOnFocusChangeListener(new ViewOnFocusChangeListenerC521740KdA(c0k4f, 3));
        }
    }
}
