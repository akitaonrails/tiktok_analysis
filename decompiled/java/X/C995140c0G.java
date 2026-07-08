package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0c0G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995140c0G extends C09AY implements Function1<View, Boolean> {
    public final /* synthetic */ C1011940cRM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C995140c0G(C1011940cRM c1011940cRM) {
        super(1);
        this.LL = c1011940cRM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(View view) {
        List<Rect> listLJIIJJI;
        C1011940cRM c1011940cRM = this.LL;
        if (Build.VERSION.SDK_INT < 29) {
            listLJIIJJI = null;
        } else {
            int bottom = c1011940cRM.getBottom();
            listLJIIJJI = C1697810uHb.LJIIJJI(new Rect(0, bottom - C11VU.LIZJ(200.0d, c1011940cRM.getContext()), c1011940cRM.getLeft() + C11VU.LIZJ(100.0d, c1011940cRM.getContext()), bottom), new Rect(c1011940cRM.getRight() - C11VU.LIZJ(100.0d, c1011940cRM.getContext()), bottom - C11VU.LIZJ(200.0d, c1011940cRM.getContext()), c1011940cRM.getRight(), bottom));
            c1011940cRM.setSystemGestureExclusionRects(listLJIIJJI);
        }
        c1011940cRM.LLLLZLL = listLJIIJJI;
        return Boolean.FALSE;
    }
}
