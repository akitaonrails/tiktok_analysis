package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0IpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478300IpI extends AbstractC478270IpF {
    public TextView LJ;

    @Override // X.AbstractC478270IpF
    public final int LIZJ() {
        return R.layout.hmm;
    }

    @Override // X.AbstractC478270IpF
    public final void LJ() {
        View view = this.LIZIZ;
        TextView textView = view != null ? (TextView) view.findViewById(R.id.mwz) : null;
        this.LJ = textView;
        if (textView != null) {
            C500260Jjc.LJLJJL(this.LIZJ, textView);
        }
        TextView textView2 = this.LJ;
        if (textView2 != null) {
            textView2.setText(" ");
        }
        AbstractC478270IpF.LIZ(this.LJ);
    }

    public C478300IpI(Context context) {
        super(context);
    }
}
