package X;

import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DLC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DLC extends FrameLayout {
    public TuxTextView LL;

    public C0DLC(C19EG c19eg) {
        int i;
        super(c19eg, null, 0);
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setTuxFont(71);
        if (C296530Bjn.LIZ()) {
            i = 2;
        } else {
            i = 4;
        }
        tuxTextView.setTextAlignment(i);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        this.LL = tuxTextView;
        addView(tuxTextView, new FrameLayout.LayoutParams(-1, -2, 49));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
        setBackgroundColor(C960203pA.LIZ(R.attr.c7, getContext()));
    }
}
