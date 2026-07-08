package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20368114mt extends FrameLayout {
    public final CopyOnWriteArrayList<Function1<View, Unit>> LL;

    public abstract void LIZ();

    public final CopyOnWriteArrayList<Function1<View, Unit>> getMoreClickListenerList() {
        return this.LL;
    }

    public AbstractC20368114mt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new CopyOnWriteArrayList<>();
    }
}
