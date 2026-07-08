package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IY1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IY1 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1AXM LL;
    public final /* synthetic */ C0IEU LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IY1(C1AXM c1axm, C0IEU c0ieu, View view) {
        super(0);
        this.LL = c1axm;
        this.LLILLJJLI = c0ieu;
        this.LLILLL = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        FrameLayout.LayoutParams layoutParams;
        String str = this.LL.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doAdjust:width:");
        sbLIZ.append(this.LLILLJJLI.LIZ);
        sbLIZ.append(", height:");
        sbLIZ.append(this.LLILLJJLI.LIZIZ);
        sbLIZ.append(", left:");
        sbLIZ.append(this.LLILLJJLI.LIZLLL);
        sbLIZ.append(", top:");
        sbLIZ.append(this.LLILLJJLI.LIZJ);
        C1AZW.LJIIJ(12, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
        ViewGroup.LayoutParams layoutParams2 = this.LLILLL.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            C0IEU c0ieu = this.LLILLJJLI;
            View view = this.LLILLL;
            layoutParams.width = c0ieu.LIZ;
            layoutParams.height = c0ieu.LIZIZ;
            layoutParams.gravity = 51;
            layoutParams.leftMargin = c0ieu.LIZLLL;
            layoutParams.rightMargin = c0ieu.LJ;
            layoutParams.topMargin = c0ieu.LIZJ;
            C786410Ut5.W5(view, layoutParams);
        }
        return Unit.LIZ;
    }
}
