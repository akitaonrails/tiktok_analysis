package X;

import android.view.MotionEvent;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZOA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZOA implements C0ZOE {
    public final Function2<ViewGroup, MotionEvent, Unit> LIZ;

    public C0ZOA() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0ZOA(Function2<? super ViewGroup, ? super MotionEvent, Unit> function2) {
        this.LIZ = function2;
    }
}
