package X;

import com.google.android.material.bottomsheet.TitlePanelBottomSheetBehavior;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370840lmE extends C09AY implements Function0<Integer> {
    public final /* synthetic */ TitlePanelBottomSheetBehavior LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370840lmE(TitlePanelBottomSheetBehavior titlePanelBottomSheetBehavior) {
        super(0);
        this.LL = titlePanelBottomSheetBehavior;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.LL.getViewConfiguration().getScaledTouchSlop());
    }
}
