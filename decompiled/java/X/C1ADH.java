package X;

import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1ADH, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ADH extends C09AY implements Function1<Rect, Unit> {
    public final /* synthetic */ C1ACX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ADH(C1ACX c1acx) {
        super(1);
        this.LL = c1acx;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Rect rect) {
        Function1<? super Rect, Unit> function1 = this.LL.LLL;
        if (function1 != null) {
            function1.invoke(rect);
        }
        return Unit.LIZ;
    }
}
