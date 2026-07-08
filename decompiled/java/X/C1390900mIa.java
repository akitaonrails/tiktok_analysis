package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390900mIa extends ViewGroup {
    public final C21578619ce LL;
    public final FrameLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final View LLILZ;
    public Integer LLILZIL;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C1390900mIa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f517yd);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxPanelContentLayout, R.attr.f517yd, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxPanelContentLayout__tux_panelScrollBarColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxPanelContentLayout__tux_panelSeparatorColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout frameLayout = new FrameLayout(context);
        this.LLILLJJLI = frameLayout;
        C21578619ce c21578619ce = new C21578619ce(context);
        this.LL = c21578619ce;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.LLILLL = frameLayout2;
        View view = new View(context);
        this.LLILZ = view;
        FrameLayout frameLayout3 = this.LLILLJJLI;
        frameLayout3.setId(R.id.z0r);
        C786410Ut5.a6(frameLayout3, new FrameLayout.LayoutParams(-1, -2));
        C21578619ce c21578619ce2 = this.LL;
        C786410Ut5.o6(c21578619ce2, new LinearLayout.LayoutParams(-1, -2));
        c21578619ce2.setVerticalScrollBarEnabled(true);
        c21578619ce2.setScrollbarFadingEnabled(true);
        c21578619ce2.setScrollBarSize(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        c21578619ce2.setScrollBarStyle(0);
        if (Build.VERSION.SDK_INT >= 29) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(color);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(0), c384050F3z.LIZ(context)});
            layerDrawable.setLayerInset(1, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), 0, 0);
            c21578619ce2.setVerticalScrollbarThumbDrawable(layerDrawable);
        }
        c21578619ce2.addView(frameLayout);
        addView(c21578619ce);
        View view2 = this.LLILZ;
        C786410Ut5.W5(view2, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)))));
        view2.setBackgroundColor(color2);
        view2.setZ(Float.MAX_VALUE);
        FrameLayout frameLayout4 = this.LLILLL;
        C786410Ut5.a6(frameLayout4, new LinearLayout.LayoutParams(-1, -2));
        frameLayout4.addView(view);
        addView(frameLayout2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iIntValue;
        int iLIZ = C497820Jfg.LIZ(getContext());
        int i3 = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iLIZ, 0);
        this.LL.measure(i, iMakeMeasureSpec);
        this.LLILLL.measure(i, iMakeMeasureSpec);
        int measuredHeight = this.LL.getMeasuredHeight() + this.LLILLL.getMeasuredHeight();
        int iLIZIZ = iLIZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2);
        if (C497820Jfg.LIZLLL(getContext())) {
            iLIZIZ -= C497820Jfg.LIZJ(getContext());
        }
        Integer num = this.LLILZIL;
        if (num != null && (iIntValue = num.intValue() + this.LLILLL.getMeasuredHeight()) < iLIZIZ) {
            iLIZIZ = iIntValue;
        }
        if (measuredHeight > iLIZIZ) {
            if (this.LLILLL.getMeasuredHeight() > iLIZIZ) {
                this.LLILLL.measure(i, View.MeasureSpec.makeMeasureSpec(iLIZIZ, 1073741824));
                this.LL.measure(i, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            } else {
                this.LL.measure(i, View.MeasureSpec.makeMeasureSpec(iLIZIZ - this.LLILLL.getMeasuredHeight(), 1073741824));
            }
        } else {
            iLIZIZ = measuredHeight;
        }
        View view = this.LLILZ;
        if (iLIZIZ >= measuredHeight || this.LLILLL.getMeasuredHeight() <= 0) {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, view);
        setMeasuredDimension(View.MeasureSpec.getSize(i), iLIZIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C21578619ce c21578619ce = this.LL;
        c21578619ce.layout(i, i2, i3, c21578619ce.getMeasuredHeight());
        this.LLILLL.layout(i, i2 + this.LL.getMeasuredHeight(), i3, i4);
    }
}
