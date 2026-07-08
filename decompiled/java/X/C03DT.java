package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03DT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DT extends C03DU {
    public View LLILLJJLI;

    @Override // X.C03DU
    public final void LIZ() {
        getTitleTextView().setText(getContext().getResources().getQuantityString(2131755312, 0, 0));
        View view = new View(getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(C960203pA.LIZ(R.attr.a1r, view.getContext()));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        this.LLILLJJLI = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        layoutParams.gravity = 8388629;
        addView(this.LLILLJJLI, layoutParams);
    }

    public C03DT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
