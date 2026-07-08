package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0et3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105990et3 extends C1119660fF6 {
    public C1105990et3(C1105980et2 c1105980et2) {
        String strLJIIL;
        TextView textView;
        super(c1105980et2);
        if (this.LIZ != null) {
            int i = c1105980et2.LJJIIJZLJL;
            if (i <= 1) {
                strLJIIL = C497740JfY.LJIJI(2131852524);
            } else {
                strLJIIL = C497740JfY.LJIIL(2131755849, i, Integer.valueOf(i));
            }
            View viewSd = C786410Ut5.Sd(R.layout.gzq, C786410Ut5.ne(this.LIZ), null);
            if ((viewSd instanceof ViewGroup) && viewSd != null && (textView = (TextView) viewSd.findViewById(R.id.xzd)) != null) {
                textView.setText(strLJIIL);
            }
            this.LIZJ = viewSd;
        }
    }
}
