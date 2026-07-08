package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ev2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379940Ev2 extends C379950Ev3 {
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;

    public C379940Ev2(View view) {
        super(view);
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.gte);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.gtg);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
    }
}
