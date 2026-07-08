package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180841AWs extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C1AXM LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180841AWs(C1AXM c1axm, float f, boolean z, boolean z2) {
        super(1);
        this.LL = c1axm;
        this.LLILLJJLI = f;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        C1AZW.LIZ.getClass();
        C1AZW.LIZ("LayoutFirstFrameOptLog", "setParentWithOutVideoSize, ControlGroupSetParent", null, null);
        Rect rect = new Rect();
        view2.getGlobalVisibleRect(rect);
        this.LL.LLJIJIL(this.LLILLL, view2, this.LLILZ, this.LL.LJJIFFI(rect, this.LLILLJJLI), view2.getWidth(), view2.getHeight(), false);
        return Unit.LIZ;
    }
}
