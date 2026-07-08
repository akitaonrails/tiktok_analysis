package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11y2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19672811y2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C1AH6 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19672811y2(View view, C1AH6 c1ah6, int i, View view2) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = c1ah6;
        this.LLILLL = i;
        this.LLILZ = view2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Rect rect = new Rect(0, 0, this.LL.getWidth(), this.LL.getHeight());
        this.LLILLJJLI.offsetDescendantRectToMyCoords(this.LL, rect);
        int i = rect.top - this.LLILLL;
        this.LLILZ.layout(0, i, this.LLILLJJLI.getWidth(), this.LL.getHeight() + (this.LLILLL * 2) + i);
        return Unit.LIZ;
    }
}
