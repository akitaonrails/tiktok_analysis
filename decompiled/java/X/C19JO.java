package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.a;

/* JADX INFO: renamed from: X.19JO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JO extends ViewGroup {
    public a getYogaNode() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C19JR(-1, -1);
    }

    public static void LIZ(ViewGroup viewGroup) {
        if ((viewGroup instanceof C19JO) || (viewGroup instanceof C19JN)) {
            throw null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VirtualYogaLayout cannot transfer children to ViewGroup of type ");
        sbLIZ.append(viewGroup.getClass().getCanonicalName());
        sbLIZ.append(".  Must either be a VirtualYogaLayout or a YogaLayout.");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C19JR;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C19JR(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C19JO) {
            view.getClass();
            LIZ(this);
            throw null;
        }
        C19JX c19jx = new C19JX();
        C19JN.LJFF(new C19JR(layoutParams), c19jx, view);
        c19jx.LLILZIL = view;
        c19jx.LJJIIJ(new C19JZ());
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
