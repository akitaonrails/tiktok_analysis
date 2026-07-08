package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370570lln extends FrameLayout {
    public FrameLayout LL;
    public LinearLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public View LLILZ;

    public final FrameLayout getIconFrameLayout() {
        return this;
    }

    public final FrameLayout getFlAdditionalContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i2g);
            this.LL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final FrameLayout getFlBottomContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.i3m);
            this.LLILLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final LinearLayout getLlSecondaryContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nhk);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final View getSecondaryContainerDividerFromXml() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.ui_);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final FrameLayout getAdditionalFrameLayout() {
        return getFlAdditionalContainerFromXml();
    }

    public final LinearLayout getIconLinearLayout() {
        return getLlSecondaryContainerFromXml();
    }

    public final FrameLayout getInnerBottomContainer() {
        return getFlBottomContainerFromXml();
    }

    public C1370570lln(Context context) {
        super(context, null, 0);
        InterfaceC1370610llr interfaceC1370610llr = C1370370llT.LJIIIZ;
        if (interfaceC1370610llr != null) {
            interfaceC1370610llr.LIZ(context, R.layout.d8s, this);
        } else {
            C786410Ut5.LJLLJ(context, R.layout.d8s, this);
        }
        setId(R.id.i_a);
        setClickable(true);
    }

    public final void setDividerVisibility(boolean z) {
        int i;
        View secondaryContainerDividerFromXml = getSecondaryContainerDividerFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, secondaryContainerDividerFromXml);
    }

    public final void setFlAdditionalContainerFromXml(FrameLayout frameLayout) {
        this.LL = frameLayout;
    }

    public final void setFlBottomContainerFromXml(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public final void setLlSecondaryContainerFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setSecondaryContainerDividerFromXml(View view) {
        this.LLILZ = view;
    }
}
