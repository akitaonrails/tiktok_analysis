package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0udp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711590udp extends LinearLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public final C21411818qq LLILLL;

    public C1711590udp(Context context) {
        super(context);
        setOrientation(0);
        setGravity(16);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        addView(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.a1h);
        this.LL = tuxTextView;
        linearLayout.addView(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setTuxFont(41);
        tuxTextView2.setTextColorRes(R.attr.a1k);
        this.LLILLJJLI = tuxTextView2;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = C1722120uuo.LIZJ(2);
        linearLayout.addView(tuxTextView2, layoutParams2);
        C21411818qq c21411818qq = new C21411818qq(context, null, 6);
        this.LLILLL = c21411818qq;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(C1722120uuo.LIZJ(12));
        addView(c21411818qq, layoutParams3);
    }
}
