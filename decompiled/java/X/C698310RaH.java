package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698310RaH extends C09AY implements Function0<Integer> {
    public final /* synthetic */ InteractAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698310RaH(InteractAreaComponent interactAreaComponent) {
        super(0);
        this.LL = interactAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LL.LLLILZJ.getValue();
        int iXu1 = iScreenComponentAbility != null ? iScreenComponentAbility.xu1() : 0;
        View view = this.LL.LLLFF;
        if (view == null) {
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return Integer.valueOf(iXu1 - (marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0)));
    }
}
