package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.038I, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C038I extends FrameLayout {
    public View LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;

    public final LinearLayout getTabContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wxb);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final View getTabRedDotFromXml() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.wys);
        this.LL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getTabTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wz2);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LIZ() {
        getTabTextFromXml().setTextColor(C960203pA.LIZ(R.attr.a1h, getContext()));
        LinearLayout tabContainerFromXml = getTabContainerFromXml();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(C960203pA.LIZ(R.attr.a1d, getContext()));
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tabContainerFromXml.setBackground(c384050F3z.LIZ(getContext()));
    }

    public final void LIZIZ() {
        getTabTextFromXml().setTextColor(C960203pA.LIZ(R.attr.a1k, getContext()));
        getTabContainerFromXml().setBackground(new C384050F3z().LIZ(getContext()));
    }

    public final void setTabContainerFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setTabRedDotFromXml(View view) {
        this.LL = view;
    }

    public final void setTabTextFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setText(String str) {
        getTabTextFromXml().setText(str);
    }

    public C038I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ao_, this, true);
        View tabRedDotFromXml = getTabRedDotFromXml();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(C960203pA.LIZ(R.attr.a04, context));
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        tabRedDotFromXml.setBackground(c384050F3z.LIZ(context));
    }
}
