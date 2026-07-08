package X;

import Y.AObjectS405S0100000_31;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.157k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204686157k extends FrameLayout {
    public static final /* synthetic */ int LLIZ = 0;
    public View LL;
    public ImageView LLILLJJLI;
    public EditText LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;

    public final void setPlayerExtraListener(InterfaceC204689157n interfaceC204689157n) {
    }

    public final String getEditTextContent() throws Throwable {
        EditText editText = this.LLILLL;
        if (editText == null) {
            editText = null;
        }
        Editable editableLLJILJILJ = C2204961BRm.LLJILJILJ(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb9Whbo/CkibOUtUjCwuL+L/RQF/y2c6obC5vuoG7j2oA+2NoGNQUt9FycnQ=", null));
        if (editableLLJILJILJ != null) {
            return editableLLJILJILJ.toString();
        }
        return null;
    }

    public final View getEditTextLayout() {
        View view = this.LLILZ;
        if (view == null) {
            return null;
        }
        return view;
    }

    public C204686157k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d9n, this, true);
        this.LL = viewTd;
        this.LLILLJJLI = (ImageView) (viewTd == null ? null : viewTd).findViewById(R.id.xm7);
        View view = this.LL;
        this.LLILLL = (EditText) (view == null ? null : view).findViewById(R.id.ccx);
        View view2 = this.LL;
        this.LLILZ = (view2 == null ? null : view2).findViewById(R.id.ccy);
        View view3 = this.LL;
        this.LLILZIL = (view3 == null ? null : view3).findViewById(R.id.hz2);
        View view4 = this.LL;
        this.LLILZLL = (view4 == null ? null : view4).findViewById(R.id.xlc);
        int iLIZ = C355430Dwb.LIZ(1.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(iLIZ, -1);
        gradientDrawable.setCornerRadius(0);
        View view5 = this.LLILZLL;
        (view5 == null ? null : view5).setBackground(gradientDrawable);
        ImageView imageView = this.LLILLJJLI;
        C560180Ly4.LIZ(imageView == null ? null : imageView, new AObjectS405S0100000_31(this, 7));
        View view6 = this.LLILZIL;
        C560180Ly4.LIZ(view6 == null ? null : view6, new AObjectS405S0100000_31(this, 8));
        EditText editText = this.LLILLL;
        (editText != null ? editText : null).addTextChangedListener(new C204688157m() { // from class: X.157l
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                this.LL.getClass();
            }
        });
        context.getResources().getDimensionPixelOffset(R.dimen.b3s);
        context.getResources().getDimensionPixelOffset(R.dimen.b3t);
    }
}
