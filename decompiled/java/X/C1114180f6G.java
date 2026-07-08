package X;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleConfigSetting;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0f6G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114180f6G extends ViewGroup implements InterfaceC1113760f5a {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public Function2<? super Boolean, ? super Float, Unit> LLILZIL;
    public C1112330f3H LLILZLL;
    public final Map<Integer, Integer> LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;

    private final TextView getAction() {
        return (TextView) this.LL.getValue();
    }

    private final C21415018rM getContent() {
        return (C21415018rM) this.LLILLJJLI.getValue();
    }

    private final View getDivider() {
        return (View) this.LLILLL.getValue();
    }

    private final int getTextColor() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // X.InterfaceC1113760f5a
    public View getActionView() {
        return getAction();
    }

    @Override // X.InterfaceC1113760f5a
    public View getContentView() {
        return getContent();
    }

    public final Function2<Boolean, Float, Unit> getCapsuleRadiusObserver() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1113760f5a
    public final void LJLJLLL(InterfaceC1113740f5Y interfaceC1113740f5Y) {
        C1112330f3H c1112330f3H;
        this.LLIZLLLIL = interfaceC1113740f5Y.LJI().maxTextSize;
        this.LLJ = interfaceC1113740f5Y.LJI().minTextSize;
        this.LLJI = interfaceC1113740f5Y.LJI().contentMaxLine;
        this.LLJIJIL = interfaceC1113740f5Y.LJI().shrinkTextSizeLineThreshold;
        this.LLJILJIL = (int) TypedValue.applyDimension(1, interfaceC1113740f5Y.LJI().actionMaxWidth, getContext().getResources().getDisplayMetrics());
        this.LLJILJILJ = (int) TypedValue.applyDimension(1, interfaceC1113740f5Y.LJI().shrinkTextSizeActionWidthThreshold, getContext().getResources().getDisplayMetrics());
        this.LLJILLL = interfaceC1113740f5Y.LJI().displayNameMinCharCount;
        this.LLJJ = interfaceC1113740f5Y.LJI().displayNameTruncateType;
        this.LLJJI = interfaceC1113740f5Y.LJI().ellipsisCharCount;
        this.LLJJIII = TypedValue.applyDimension(1, interfaceC1113740f5Y.LJI().capsuleRadius, getContext().getResources().getDisplayMetrics());
        this.LLJJIJI = interfaceC1113740f5Y.LJI().balancer;
        this.LLJJIJIIJIL = interfaceC1113740f5Y.LJI().trimSpace;
        getAction().setText(interfaceC1113740f5Y.getActionText());
        if (interfaceC1113740f5Y instanceof C1112330f3H) {
            c1112330f3H = (C1112330f3H) interfaceC1113740f5Y;
        } else {
            c1112330f3H = null;
        }
        this.LLILZLL = c1112330f3H;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setCapsuleRadiusObserver(Function2<? super Boolean, ? super Float, Unit> function2) {
        this.LLILZIL = function2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public C1114180f6G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C292401Bi.LIZ(new AwS561S0100000_17(this, 683));
        this.LLILLJJLI = C292401Bi.LIZ(new AwS561S0100000_17(this, 684));
        this.LLILLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 685));
        this.LLILZ = C292401Bi.LIZ(new AwS550S0100000_6(context, 1666));
        this.LLIZ = C2097608Jq.LJIIIIZZ(new Pair(14, 52), new Pair(13, 62), new Pair(12, 72), new Pair(11, 82), new Pair(10, 92));
        LiveCapsuleStyleConfigSetting liveCapsuleStyleConfigSetting = LiveCapsuleStyleConfigSetting.INSTANCE;
        this.LLIZLLLIL = liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.maxTextSize;
        this.LLJ = liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.minTextSize;
        this.LLJI = liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.contentMaxLine;
        this.LLJIJIL = liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.shrinkTextSizeLineThreshold;
        this.LLJILJIL = (int) TypedValue.applyDimension(1, liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.actionMaxWidth, context.getResources().getDisplayMetrics());
        this.LLJILJILJ = (int) TypedValue.applyDimension(1, liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.shrinkTextSizeActionWidthThreshold, context.getResources().getDisplayMetrics());
        this.LLJILLL = liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.displayNameMinCharCount;
        this.LLJJ = liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.displayNameTruncateType;
        this.LLJJI = liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.ellipsisCharCount;
        this.LLJJIII = TypedValue.applyDimension(1, liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.capsuleRadius, context.getResources().getDisplayMetrics());
        this.LLJJIJI = liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.balancer;
        this.LLJJIJIIJIL = liveCapsuleStyleConfigSetting.getValue().capsuleStyleItemConfig.trimSpace;
        C500260Jjc.LJIILL(R.layout.gpx, this, true);
        C1119920fFW.LJI(500, getAction());
    }

    public static int LIZIZ(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i;
        int measuredHeight = view.getMeasuredHeight();
        int i2 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        int i3 = measuredHeight + i;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.bottomMargin;
        }
        return i3 + i2;
    }

    public static int LIZJ(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i;
        int measuredWidth = view.getMeasuredWidth();
        int i2 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.leftMargin;
        } else {
            i = 0;
        }
        int i3 = measuredWidth + i;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.rightMargin;
        }
        return i3 + i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e6 A[PHI: r10
      0x01e6: PHI (r10v7 int) = (r10v1 int), (r10v0 int) binds: [B:40:0x0162, B:35:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1114180f6G.onMeasure(int, int):void");
    }

    public final int LIZ(int i, ViewGroup.MarginLayoutParams marginLayoutParams, ViewGroup.MarginLayoutParams marginLayoutParams2, ViewGroup.MarginLayoutParams marginLayoutParams3) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int measuredWidth = (((i - getAction().getMeasuredWidth()) - getDivider().getMeasuredWidth()) - getContent().getPaddingLeft()) - getContent().getPaddingRight();
        int i7 = 0;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.leftMargin;
        } else {
            i2 = 0;
        }
        int i8 = measuredWidth - i2;
        if (marginLayoutParams != null) {
            i3 = marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
        }
        int i9 = i8 - i3;
        if (marginLayoutParams2 != null) {
            i4 = marginLayoutParams2.leftMargin;
        } else {
            i4 = 0;
        }
        int i10 = i9 - i4;
        if (marginLayoutParams2 != null) {
            i5 = marginLayoutParams2.rightMargin;
        } else {
            i5 = 0;
        }
        int i11 = i10 - i5;
        if (marginLayoutParams3 != null) {
            i6 = marginLayoutParams3.leftMargin;
        } else {
            i6 = 0;
        }
        int i12 = i11 - i6;
        if (marginLayoutParams3 != null) {
            i7 = marginLayoutParams3.rightMargin;
        }
        return i12 - i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2 = true;
        if (getLayoutDirection() == 1) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                int height = (getHeight() - childAt.getMeasuredHeight()) / 2;
                if (z2) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (marginLayoutParams != null) {
                        i7 = marginLayoutParams.rightMargin;
                    } else {
                        i7 = 0;
                    }
                    int i10 = paddingLeft - (measuredWidth + i7);
                    childAt.layout(i10, height, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + height);
                    if (marginLayoutParams != null) {
                        i8 = marginLayoutParams.leftMargin;
                    } else {
                        i8 = 0;
                    }
                    paddingLeft = i10 - i8;
                } else {
                    if (marginLayoutParams != null) {
                        i5 = marginLayoutParams.leftMargin;
                    } else {
                        i5 = 0;
                    }
                    int i11 = paddingLeft + i5;
                    childAt.layout(i11, height, childAt.getMeasuredWidth() + i11, childAt.getMeasuredHeight() + height);
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    if (marginLayoutParams != null) {
                        i6 = marginLayoutParams.rightMargin;
                    } else {
                        i6 = 0;
                    }
                    paddingLeft = i11 + measuredWidth2 + i6;
                }
            }
        }
    }

    public final Layout LIZLLL(int i, int i2, CharSequence charSequence, int i3, int i4, TextUtils.TruncateAt truncateAt) {
        int i5;
        C444830HcP c444830HcP = new C444830HcP();
        if (i < 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
        c444840HcQ.LIZLLL = i5;
        c444840HcQ.LIZJ = i2;
        if (i < 0) {
            i = 0;
        }
        c444840HcQ.LJ = i;
        c444830HcP.LJIILIIL(charSequence);
        c444830HcP.LJIIIZ(i4);
        c444830HcP.LJIILJJIL(getTextColor());
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        C444840HcQ c444840HcQ2 = c444830HcP.LIZIZ;
        c444840HcQ2.LJI = alignment;
        c444840HcQ2.LJII = truncateAt;
        c444830HcP.LJII(i3);
        return C444830HcP.LIZJ(c444830HcP, this.LLJJIJI, this.LLJJIJIIJIL, null, 28);
    }
}
