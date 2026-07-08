package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gdb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C420090Gdb extends FrameLayout implements InterfaceC1339760ky6 {
    public LinearLayout LL;
    public ObjectAnimator LLILLJJLI;
    public boolean LLILLL;
    public TuxTextView LLILZ;
    public String LLILZIL;

    @Override // X.InterfaceC1339760ky6
    public final void LIZ() {
    }

    public void setDefaultLoadingText(String str) {
        this.LLILZIL = str;
    }

    @Override // X.InterfaceC1339760ky6
    public void setLoading(boolean z) {
        int i;
        if (this.LLILLL == z) {
            return;
        }
        if (z) {
            String string = getContext().getString(2131829235);
            if (!TextUtils.isEmpty(this.LLILZIL)) {
                string = this.LLILZIL;
            }
            this.LLILZ.setText(string);
            C786410Ut5.Pd(this.LLILLJJLI);
            i = 0;
        } else {
            ObjectAnimator objectAnimator = this.LLILLJJLI;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            i = 8;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
        this.LLILLL = z;
    }

    public void setLoadingText(int i) {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(i);
        }
    }

    @Override // X.InterfaceC1339760ky6
    public void setViewVisibility(int i) {
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    public void setLoadingText(String str) {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public C420090Gdb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new LinearLayout(getContext());
        C786410Ut5.d6(this.LL, new FrameLayout.LayoutParams(-2, -1));
        this.LL.setOrientation(0);
        this.LL.setGravity(16);
        TuxIconView tuxIconView = new TuxIconView(getContext());
        tuxIconView.setIconRes(R.raw.icon_spinner_normal);
        tuxIconView.setTintColor(R.attr.a1j);
        ObjectAnimator duration = ObjectAnimator.ofFloat(tuxIconView, "rotation", 0.0f, 360.0f).setDuration(800L);
        this.LLILLJJLI = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.LLILLJJLI.setRepeatCount(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C418440Gaw.LIZ(14), C418440Gaw.LIZ(14));
        layoutParams.gravity = 16;
        C786410Ut5.M6(tuxIconView, layoutParams);
        this.LL.addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.ud);
        this.LLILZ = tuxTextView;
        tuxTextView.setText(2131829235);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) C12ES.LIZJ(1.0f, getContext());
        layoutParams2.gravity = 16;
        C786410Ut5.R6(this.LLILZ, layoutParams2);
        this.LL.addView(this.LLILZ);
        addView(this.LL);
        setLoading(false);
    }
}
