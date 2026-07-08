package X;

import android.view.View;
import android.widget.HorizontalScrollView;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03oz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C959103oz<T> {
    public final Function0<Map<C1190004l8<T>, View>> LIZ;
    public final HorizontalScrollView LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabShowCtrlInitParams(data2ViewMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", horizontalScrollView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C959103oz(Function0<? extends Map<C1190004l8<T>, ? extends View>> function0, HorizontalScrollView horizontalScrollView) {
        this.LIZ = function0;
        this.LIZIZ = horizontalScrollView;
    }
}
