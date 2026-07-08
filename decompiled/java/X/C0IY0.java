package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IY0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IY0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C1AXM LLILLJJLI;
    public final /* synthetic */ Rect LLILLL;
    public final /* synthetic */ C0IEU LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IY0(View view, C1AXM c1axm, Rect rect, C0IEU c0ieu) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = c1axm;
        this.LLILLL = rect;
        this.LLILZ = c0ieu;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        String str = this.LLILLJJLI.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doAdjustV1: rect=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", width:");
        sbLIZ.append(this.LLILZ.LIZ);
        sbLIZ.append(", height:");
        sbLIZ.append(this.LLILZ.LIZIZ);
        sbLIZ.append(", left:");
        sbLIZ.append(this.LLILZ.LIZLLL);
        sbLIZ.append(", top:");
        sbLIZ.append(this.LLILZ.LIZJ);
        C1AZW.LJIIJ(12, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (layoutParams2 != null) {
            C0IEU c0ieu = this.LLILZ;
            View view = this.LL;
            layoutParams2.width = c0ieu.LIZ;
            layoutParams2.height = c0ieu.LIZIZ;
            layoutParams2.gravity = 51;
            layoutParams2.leftMargin = c0ieu.LIZLLL;
            layoutParams2.rightMargin = c0ieu.LJ;
            layoutParams2.topMargin = c0ieu.LIZJ;
            C786410Ut5.W5(view, layoutParams2);
        }
        return Unit.LIZ;
    }
}
