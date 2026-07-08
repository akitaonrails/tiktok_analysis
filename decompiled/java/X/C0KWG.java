package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KWG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0KWG extends C1091740eW4 implements C0KWH {
    public static final /* synthetic */ int LLJ = 0;
    public TextView LLILZ;
    public LinearLayout LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;

    public void setButtonOrientation(int i) {
        this.LLILZIL.setOrientation(i);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Space) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.LLILZIL.getOrientation() == 1) {
                    layoutParams.width = -2;
                    layoutParams.height = getContext().getResources().getDimensionPixelSize(R.dimen.a4u);
                } else {
                    layoutParams.width = getContext().getResources().getDimensionPixelSize(R.dimen.a5j);
                    layoutParams.height = -2;
                }
                C786410Ut5.W5(childAt, layoutParams);
            }
        }
        for (int i3 = 0; i3 < this.LLILZIL.getChildCount(); i3++) {
            View childAt2 = this.LLILZIL.getChildAt(i3);
            if (!(childAt2 instanceof Space)) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                if (i == 1) {
                    layoutParams2.width = -1;
                    layoutParams2.weight = 0.0f;
                } else {
                    layoutParams2.width = 0;
                    layoutParams2.weight = 1.0f;
                }
                C786410Ut5.W5(childAt2, layoutParams2);
            }
        }
    }

    public void setPaddingStyle(EnumC500050JjH enumC500050JjH) {
        if (enumC500050JjH == EnumC500050JjH.PADDING_STYLE_NORMAL) {
            return;
        }
        if (enumC500050JjH == EnumC500050JjH.PADDING_STYLE_LARGE) {
            this.LLILZLL = getContext().getResources().getDimensionPixelSize(R.dimen.a5i);
        }
        int i = this.LLILZLL;
        setPadding(i, this.LLIZ, i, this.LLIZLLLIL);
    }

    public void setTopText(CharSequence charSequence) {
        this.LLILZ.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            C786410Ut5.LLIL(this.LLILZ, 8);
        } else {
            C786410Ut5.LLIL(this.LLILZ, 0);
        }
    }

    public C0KWG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout.inflate(getContext(), R.layout.ded, this);
        this.LLILZLL = getContext().getResources().getDimensionPixelSize(R.dimen.a5g);
        this.LLIZ = getContext().getResources().getDimensionPixelSize(R.dimen.a5h);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.a57);
        this.LLIZLLLIL = dimensionPixelSize;
        int i = this.LLILZLL;
        setPadding(i, this.LLIZ, i, dimensionPixelSize);
        setOrientation(1);
        TextView textView = (TextView) findViewById(R.id.cdm);
        this.LLILZ = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.LLILZIL = (LinearLayout) findViewById(R.id.cdf);
    }
}
