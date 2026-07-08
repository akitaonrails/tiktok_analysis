package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03Cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C805603Cs extends ConstraintLayout {
    public static final int LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final C0HZQ LL;
    public final C03EF LLILLJJLI;
    public final C03EF LLILLL;
    public final LinearLayout LLILZ;
    public C805603Cs LLILZIL;

    public final C0HZQ getCheckBox() {
        return this.LL;
    }

    public final C805603Cs getCurrentSelectedLogisticItem() {
        return this.LLILZIL;
    }

    public final void setCurrentSelectedLogisticItem(C805603Cs c805603Cs) {
        this.LLILZIL = c805603Cs;
    }

    public C805603Cs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0HZQ c0hzq = new C0HZQ(context, null, 6);
        c0hzq.setId(R.id.ehb);
        this.LL = c0hzq;
        C03EF c03ef = new C03EF(context, null, 6);
        c03ef.setId(R.id.ehe);
        this.LLILLJJLI = c03ef;
        C03EF c03ef2 = new C03EF(context, null, 6);
        c03ef2.setId(R.id.ehd);
        this.LLILLL = c03ef2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.ehc);
        linearLayout.setOrientation(1);
        this.LLILZ = linearLayout;
        C19MW c19mw = new C19MW(context);
        c19mw.setId(View.generateViewId());
        C19ME c19me = new C19ME(0, 0);
        c19mw.setReferencedIds(new int[]{c0hzq.getId(), c03ef.getId(), c03ef2.getId()});
        C786410Ut5.l6(c19mw, c19me);
        c19mw.setType(3);
        C0HZQ c0hzq2 = this.LL;
        C19ME c19me2 = new C19ME(-2, -2);
        c19me2.startToStart = 0;
        c19me2.topToTop = 0;
        c19me2.endToStart = c03ef.getId();
        c19me2.bottomToTop = c19mw.getId();
        C786410Ut5.N6(c0hzq2, c19me2);
        c0hzq2.setSize(0);
        C03EF c03ef3 = this.LLILLJJLI;
        C19ME c19me3 = new C19ME(0, -2);
        c19me3.startToEnd = c0hzq.getId();
        c19me3.topToTop = 0;
        c19me3.endToStart = c03ef2.getId();
        c19me3.bottomToTop = c19mw.getId();
        c19me3.horizontalBias = 0.0f;
        c19me3.verticalBias = 0.5f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03ef3);
        c03ef3.setLayoutParams(c19me3);
        c03ef3.setMaxLines(1);
        c03ef3.setGravity(16);
        c03ef3.setEllipsize(TextUtils.TruncateAt.END);
        C03EF c03ef4 = this.LLILLL;
        C19ME c19me4 = new C19ME(-2, -2);
        c19me4.topToTop = 0;
        c19me4.endToEnd = 0;
        c19me4.bottomToTop = c19mw.getId();
        c19me4.verticalBias = 0.5f;
        c19me4.setMarginStart(LLILZLL);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03ef4);
        c03ef4.setLayoutParams(c19me4);
        LinearLayout linearLayout2 = this.LLILZ;
        C19ME c19me5 = new C19ME(0, -2);
        c19me5.startToEnd = c0hzq.getId();
        c19me5.topToBottom = c19mw.getId();
        c19me5.endToEnd = 0;
        C786410Ut5.d6(linearLayout2, c19me5);
        addView(c0hzq);
        addView(c03ef);
        addView(c03ef2);
        addView(c19mw);
        addView(linearLayout);
    }
}
