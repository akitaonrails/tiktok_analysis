package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19RT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19RT extends ConstraintLayout {
    public final RunnableC1211800hdi LL;
    public int LLILLJJLI;
    public C21538919Rb LLILLL;

    public final void e0() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.dtn && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.LLILLJJLI;
                C19M2 c19m2 = c19mb.LJIJI(id).LIZLLL;
                c19m2.LJJ = R.id.dtn;
                c19m2.LJJI = i4;
                c19m2.LJJIFFI = f;
                f += 360.0f / (childCount - i);
            }
        }
        c19mb.LIZIZ(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        e0();
    }

    public int getRadius() {
        return this.LLILLJJLI;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.LL);
            C786410Ut5.LJJZZIII(handler, this.LL);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.LLILLL.LJIIJJI(ColorStateList.valueOf(i));
    }

    public void setRadius(int i) {
        this.LLILLJJLI = i;
        e0();
    }

    public C19RT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0hdi] */
    public C19RT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Sd(R.layout.dkt, C786410Ut5.ne(context), this);
        C21538919Rb c21538919Rb = new C21538919Rb();
        this.LLILLL = c21538919Rb;
        C1844480y6A c1844480y6A = new C1844480y6A(0.5f);
        C19RX c19rx = c21538919Rb.LL.LIZ;
        c19rx.getClass();
        C19RY c19ry = new C19RY(c19rx);
        c19ry.LJ = c1844480y6A;
        c19ry.LJFF = c1844480y6A;
        c19ry.LJI = c1844480y6A;
        c19ry.LJII = c1844480y6A;
        c21538919Rb.setShapeAppearanceModel(new C19RX(c19ry));
        this.LLILLL.LJIIJJI(ColorStateList.valueOf(-1));
        setBackground(this.LLILLL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadialViewGroup, i, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RadialViewGroup_materialCircleRadius, 0);
        this.LL = new Runnable() { // from class: X.0hdi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RadialViewGroup@83d2.<init>$1");
                try {
                    this.LL.e0();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RadialViewGroup@83d2.<init>$1");
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.LL);
            C786410Ut5.LJJZZIII(handler, this.LL);
        }
    }
}
