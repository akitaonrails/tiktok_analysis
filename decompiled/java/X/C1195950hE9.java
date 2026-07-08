package X;

import android.content.Context;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0hE9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195950hE9 extends AndroidView {
    public Function2<? super Integer, ? super Integer, Unit> LL;

    public C1195950hE9(Context context) {
        super(context);
    }

    public final void setOnHeaderOffsetChangeListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.LL = function2;
    }
}
