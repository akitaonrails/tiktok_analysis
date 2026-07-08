package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180791AWn extends C09AY implements Function1<View, Rect> {
    public final /* synthetic */ C2180891AWx LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180791AWn(C2180891AWx c2180891AWx) {
        super(1);
        this.LL = c2180891AWx;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Rect invoke(View view) {
        View view2 = view;
        Rect rect = new Rect();
        C2180891AWx c2180891AWx = this.LL;
        rect.left = view2.getLeft() + c2180891AWx.getMAllAreaInWindow().left;
        rect.top = view2.getTop() + c2180891AWx.getMAllAreaInWindow().top;
        rect.right = rect.left + view2.getWidth();
        rect.bottom = rect.top + view2.getHeight();
        return rect;
    }
}
