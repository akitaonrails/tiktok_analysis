package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zXB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899670zXB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1899490zWt LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899670zXB(C1899490zWt c1899490zWt, int i) {
        super(0);
        this.LL = c1899490zWt;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        ViewGroup.LayoutParams layoutParams = this.LL.getCloseView().getLayoutParams();
        int i = this.LLILLJJLI;
        layoutParams.width = i;
        layoutParams.height = i;
        C786410Ut5.c6(this.LL.getCloseView(), layoutParams);
        ImageView closeView = this.LL.getCloseView();
        int i2 = this.LLILLL;
        closeView.setPadding(i2, i2, i2, i2);
        return Unit.LIZ;
    }
}
