package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C951303nj extends ConstraintLayout {
    public static final int LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
    public static final int LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public static final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    public static final int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public final SmartImageView LL;
    public final C197039127h LLILLJJLI;
    public final TuxTextView LLILLL;
    public final FrameLayout LLILZ;
    public C03D2 LLILZIL;
    public final TuxTextView LLILZLL;
    public final LinearLayout LLIZ;
    public final LinearLayout LLIZLLLIL;
    public final C1331730kl9 LLJ;
    public Function1<? super String, Unit> LLJI;
    public C1753740vjo<C952103nr, View> LLJIJIL;
    public final LinkedList<TuxTextView> LLJILJIL;

    public final void setViewPreLoader(C1753740vjo<C952103nr, View> c1753740vjo) {
        if (this.LLJIJIL != null) {
            return;
        }
        this.LLJIJIL = c1753740vjo;
    }

    public C951303nj(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        SmartImageView smartImageView = new SmartImageView(getContext());
        smartImageView.setId(R.id.v6y);
        smartImageView.setPlaceholderImage(R.drawable.b74);
        smartImageView.setActualImageScaleType(EnumC1338240kve.CENTER_CROP);
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C631470Opl.LIZ(smartImageView, Float.valueOf(C418440Gaw.LIZIZ(200)), null, null, null, null, 30);
        C786410Ut5.I7(new AjS60S0100000_1(this, 132), smartImageView);
        this.LL = smartImageView;
        C197039127h c197039127h = new C197039127h(getContext(), null, 6, 0);
        c197039127h.setId(R.id.visit);
        c197039127h.setText(c197039127h.getContext().getString(2131832576));
        c197039127h.setGravity(17);
        c197039127h.setButtonVariant(0);
        c197039127h.setTuxFont(52);
        C786410Ut5.I7(new AjS60S0100000_1(this, 133), c197039127h);
        this.LLILLJJLI = c197039127h;
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setId(R.id.v78);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (C1071004Gu.LIZIZ().LIZ()) {
            i2 = 102;
        } else {
            i2 = 42;
        }
        tuxTextView.setTuxFont(i2);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setMinWidth(LLJJ);
        tuxTextView.setMaxWidth(LLJILLL);
        this.LLILLL = tuxTextView;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.sri);
        C0H1U.LIZIZ(frameLayout);
        this.LLILZ = frameLayout;
        TuxTextView tuxTextView2 = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView2.setId(ViewGroup.generateViewId());
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        C0H1U.LIZIZ(tuxTextView2);
        this.LLILZLL = tuxTextView2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R.id.nhu);
        linearLayout.setGravity(8388611);
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(LLJJJIL);
        linearLayout.addView(frameLayout, layoutParams);
        linearLayout.addView(tuxTextView2, new LinearLayout.LayoutParams(-2, -2));
        this.LLIZ = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setId(R.id.nho);
        linearLayout2.setGravity(8388611);
        this.LLIZLLLIL = linearLayout2;
        C19MW c19mw = new C19MW(getContext());
        c19mw.setId(ViewGroup.generateViewId());
        c19mw.setReferencedIds(new int[]{smartImageView.getId(), linearLayout.getId(), c197039127h.getId()});
        c19mw.setType(3);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
            c1331750klB.LIZJ = iIntValue;
            c1331750klB.LIZIZ = fLIZIZ;
        }
        this.LLJ = new C1331730kl9(c1331750klB);
        this.LLJILJIL = new LinkedList<>();
        int i3 = LLJJIJIIJIL;
        Integer numValueOf = Integer.valueOf(i3);
        int i4 = LLJJIJIL;
        C426750GoL.LJIIL(this, numValueOf, Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i4), 16);
        addView(smartImageView);
        addView(c197039127h);
        addView(tuxTextView);
        addView(linearLayout);
        addView(c19mw);
        addView(linearLayout2);
        SmartImageView smartImageView2 = this.LL;
        int i5 = LLJILJILJ;
        C19ME c19me = new C19ME(i5, i5);
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.endToStart = tuxTextView.getId();
        c19me.bottomToTop = c19mw.getId();
        int i6 = LLJJIII;
        c19me.setMarginEnd(i6);
        int i7 = LLJJIJI;
        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = i7;
        C786410Ut5.G6(smartImageView2, c19me);
        TuxTextView tuxTextView3 = this.LLILLL;
        C19ME c19me2 = new C19ME(0, -2);
        c19me2.startToEnd = smartImageView.getId();
        c19me2.topToTop = 0;
        c19me2.endToStart = c197039127h.getId();
        c19me2.bottomToTop = linearLayout.getId();
        c19me2.horizontalChainStyle = 0;
        c19me2.verticalChainStyle = 2;
        c19me2.setMarginEnd(i6);
        C786410Ut5.R6(tuxTextView3, c19me2);
        C197039127h c197039127h2 = this.LLILLJJLI;
        C19ME c19me3 = new C19ME(-2, LLJJI);
        c19me3.topToTop = 0;
        c19me3.endToEnd = 0;
        c19me3.bottomToTop = c19mw.getId();
        C786410Ut5.J6(c197039127h2, c19me3);
        LinearLayout linearLayout3 = this.LLIZ;
        C19ME c19me4 = new C19ME(0, -2);
        c19me4.startToStart = tuxTextView.getId();
        c19me4.topToBottom = tuxTextView.getId();
        c19me4.endToEnd = tuxTextView.getId();
        c19me4.bottomToTop = c19mw.getId();
        ((ViewGroup.MarginLayoutParams) c19me4).topMargin = i7;
        c19me4.setMarginEnd(i6);
        C786410Ut5.d6(linearLayout3, c19me4);
        LinearLayout linearLayout4 = this.LLIZLLLIL;
        C19ME c19me5 = new C19ME(0, -2);
        c19me5.startToStart = 0;
        c19me5.topToBottom = c19mw.getId();
        c19me5.endToEnd = 0;
        c19me5.bottomToBottom = 0;
        C786410Ut5.d6(linearLayout4, c19me5);
    }
}
