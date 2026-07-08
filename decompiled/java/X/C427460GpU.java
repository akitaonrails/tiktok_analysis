package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;

/* JADX INFO: renamed from: X.0GpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427460GpU extends ViewGroup {
    public final SmartImageView LL;
    public final SmartImageView LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;

    public C427460GpU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.LLILLL, 1073741824);
        this.LL.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        this.LLILLJJLI.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        setMeasuredDimension(this.LLILZ, this.LLILZIL);
    }

    public C427460GpU(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        this.LLILLL = iLIZIZ;
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.5f)));
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f)));
        float fLIZJ = C12ES.LIZJ(1.5f, context);
        float fLIZJ2 = C12ES.LIZJ(7.0f, context);
        setClipChildren(false);
        setClipToPadding(false);
        SmartImageView smartImageView = new SmartImageView(context);
        C786410Ut5.G6(smartImageView, new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ));
        C1331070kk5 hierarchy = smartImageView.getHierarchy();
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJII(fLIZJ2);
        c1331100kk8.LJ(fLIZJ, -1);
        hierarchy.LJJIII(c1331100kk8);
        C786410Ut5.Eb(smartImageView, 8.0f);
        C786410Ut5.u5(smartImageView, 0.6f);
        this.LLILLJJLI = smartImageView;
        SmartImageView smartImageView2 = new SmartImageView(context);
        C786410Ut5.G6(smartImageView2, new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ));
        C1331070kk5 hierarchy2 = smartImageView2.getHierarchy();
        C1331100kk8 c1331100kk82 = new C1331100kk8();
        c1331100kk82.LJII(fLIZJ2);
        c1331100kk82.LJ(fLIZJ, -1);
        hierarchy2.LJJIII(c1331100kk82);
        C786410Ut5.Eb(smartImageView2, -8.0f);
        this.LL = smartImageView2;
        addView(smartImageView);
        addView(smartImageView2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SmartImageView smartImageView = this.LL;
        int i5 = this.LLILZLL;
        int i6 = this.LLIZ;
        int i7 = this.LLILLL;
        smartImageView.layout(i5, i6, i5 + i7, i7 + i6);
        SmartImageView smartImageView2 = this.LLILLJJLI;
        int iLIZIZ = this.LLILZLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        int i8 = this.LLIZ;
        int iLIZIZ2 = this.LLILZLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        int i9 = this.LLILLL;
        smartImageView2.layout(iLIZIZ, i8, iLIZIZ2 + i9, this.LLIZ + i9);
    }
}
