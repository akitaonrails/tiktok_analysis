package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420670GeX extends LinearLayout {
    public static final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
    public static final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
    public final View LL;

    public C420670GeX(Context context) {
        super(context, null, 0);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LLILLJJLI, LLILLL);
        layoutParams.gravity = 16;
        C786410Ut5.W5(view, layoutParams);
        C0H9H.LJFF(LLILZ, view);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a02);
        view.setBackground(c384050F3z.LIZ(context));
        this.LL = view;
        addView(view);
    }
}
