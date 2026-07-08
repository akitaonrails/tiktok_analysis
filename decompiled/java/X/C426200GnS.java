package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426200GnS extends ConstraintLayout {
    public C426200GnS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C426200GnS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.bst, this);
    }

    public final void e0(String str, String str2, UrlModel urlModel, Long l, boolean z) {
        long jLongValue;
        C427660Gpo.LJIIJJI((C427660Gpo) findViewById(R.id.bh2), C438710HIf.LIZ(urlModel), false, null, null, false, false, null, null, false, null, 1022);
        ((TextView) findViewById(R.id.user_name)).setText(str2);
        TextView textView = (TextView) findViewById(R.id.mnc);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        textView.setText(C1843500y4a.LIZIZ(jLongValue));
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.desc);
        if (str != null && str.length() == 0) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        tuxTextView.setText(str);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.k1i);
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_like_fill;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a04, getContext());
            c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
            tuxIconView.setTuxIcon(c419910GdJ);
            return;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_like;
        c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
        tuxIconView.setTuxIcon(c419910GdJ2);
    }
}
