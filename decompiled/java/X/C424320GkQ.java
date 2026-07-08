package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424320GkQ extends LinearLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final ImageView LLILLL;
    public final TextView LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;

    public final void LIZ() {
        this.LL.setBackgroundColor(this.LLILZIL);
        C786410Ut5.LJLLLLLL(8, this.LLILLJJLI);
    }

    public final void LIZIZ(String str) {
        boolean z = this.LLIZ;
        try {
            if (Intrinsics.LJFF(getResources().getResourceTypeName(0), "drawable")) {
                this.LLILLL.setImageResource(0);
            }
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (z) {
            C786410Ut5.LJLLLLLL(0, this.LL);
            this.LL.setBackgroundColor(this.LLILZLL);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LL);
        }
        C786410Ut5.LJLLLLLL(0, this.LLILLJJLI);
        this.LLILZ.setText(str);
    }

    public C424320GkQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZ = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.InputResultIndicator);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.InputResultIndicator_dividerLineHeight, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.InputResultIndicator_dividerNormalColor, C960203pA.LIZ(R.attr.nb, context));
        this.LLILZLL = typedArrayObtainStyledAttributes.getColor(R$styleable.InputResultIndicator_dividerResultColor, C446980Hfs.LIZ(context, R.color.mk));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.InputResultIndicator_resultTextColor, C446980Hfs.LIZ(context, R.color.mk));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.InputResultIndicator_resultDrawable, R.drawable.c6w);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.InputResultIndicator_showLine, true);
        this.LLIZ = z;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.InputResultIndicator_marginTop, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.InputResultIndicator_android_textSize, -1);
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.LJLLJ(context, R.layout.cth, this);
        View viewFindViewById = findViewById(R.id.tdq);
        this.LL = viewFindViewById;
        setOrientation(1);
        View viewFindViewById2 = findViewById(R.id.tdo);
        this.LLILLJJLI = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.tdp);
        this.LLILLL = imageView;
        TextView textView = (TextView) findViewById(R.id.tdr);
        this.LLILZ = textView;
        if (dimensionPixelSize2 != -1) {
            ((ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams()).topMargin = dimensionPixelSize2;
        }
        if (dimensionPixelSize3 != -1) {
            textView.setTextSize(0, dimensionPixelSize3);
        }
        View view = this.LL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = dimensionPixelSize;
            C786410Ut5.W5(view, layoutParams);
        }
        try {
            if (Intrinsics.LJFF(getResources().getResourceTypeName(resourceId), "drawable")) {
                imageView.setImageResource(resourceId);
                imageView.setContentDescription(getContext().getString(2131823972));
            }
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        textView.setTextColor(color);
        C786410Ut5.LJLLLLLL(z ? 0 : 8, viewFindViewById);
        LIZ();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
