package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS664S0100000_15;

/* JADX INFO: renamed from: X.0ii8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252980ii8 extends FrameLayout {
    public final C16FB LL;
    public final C1252970ii7 LLILLJJLI;
    public InterfaceC929120aHm LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    @Override // android.view.View
    public final EnumC19356710o9 getOverScrollMode() {
        return this.LL.getOverScrollMode();
    }

    public final EnumC481060Itk getScrollMode() {
        return this.LL.getScrollMode();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        this.LL.setBackgroundColor(i);
    }

    public final void setOnBottomRefreshListener(InterfaceC929120aHm interfaceC929120aHm) {
        this.LLILLL = interfaceC929120aHm;
    }

    public final void setOnRefreshListener(Function0<Unit> function0) {
        this.LL.setOnRefreshListener(function0);
    }

    public final void setOverScrollMode(EnumC19356710o9 enumC19356710o9) {
        this.LL.setOverScrollMode(enumC19356710o9);
    }

    public final void setScrollMode(EnumC481060Itk enumC481060Itk) {
        this.LL.setScrollMode(enumC481060Itk);
    }

    public C1252980ii8(Context context, AttributeSet attributeSet) {
        EnumC19356710o9 enumC19356710o9;
        EnumC481060Itk enumC481060Itk;
        super(context, attributeSet, 0);
        C16FB c16fb = new C16FB(context, attributeSet, 0);
        this.LL = c16fb;
        addView(c16fb, new FrameLayout.LayoutParams(-1, -1));
        C1252970ii7 c1252970ii7 = new C1252970ii7(context);
        this.LLILLJJLI = c1252970ii7;
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, c1252970ii7.getActualHeight(), 80);
        C786410Ut5.LLJIJIL(c1252970ii7, 4);
        addView(c1252970ii7, layoutParams);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MgRefreshLayout, 0, 0);
            int i = typedArrayObtainStyledAttributes.getInt(R$styleable.MgRefreshLayout_mg_overScrollMode, 2);
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i != 3) {
                        enumC19356710o9 = EnumC19356710o9.ALWAYS;
                    } else {
                        enumC19356710o9 = EnumC19356710o9.NONE;
                    }
                } else {
                    enumC19356710o9 = EnumC19356710o9.ONLY_BOTTOM;
                }
            } else {
                enumC19356710o9 = EnumC19356710o9.ONLY_TOP;
            }
            setOverScrollMode(enumC19356710o9);
            int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.MgRefreshLayout_mg_scrollMode, 0);
            if (i2 == 0 || i2 != 1) {
                enumC481060Itk = EnumC481060Itk.REFRESH;
            } else {
                enumC481060Itk = EnumC481060Itk.NONE;
            }
            setScrollMode(enumC481060Itk);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (c16fb.getScrollMode() == EnumC481060Itk.REFRESH && c16fb.getNestedHeader() == null) {
            c16fb.setNestedHeader(new C446160HeY(context));
        }
        c16fb.setHoverBottomHeight(c1252970ii7.getActualHeight());
        c16fb.setOnHoverBottomListener(new AwS559S0100000_15(this, 376));
        c16fb.setOnScrollChangeListener(new AwS664S0100000_15(this, 9));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C16FB c16fb = this.LL;
        if (view != c16fb && view != this.LLILLJJLI) {
            c16fb.addView(view, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }
}
