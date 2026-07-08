package X;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11eT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19551511eT extends C19561611g6 {
    public final Set<Integer> LLILZ;
    public Function1<? super Integer, Boolean> LLILZIL;
    public Function1<? super Integer, Unit> LLILZLL;

    public final void setInterceptPositions(Collection<Integer> collection) {
        this.LLILZ.clear();
        this.LLILZ.addAll(collection);
    }

    public final void setInterceptPredicate(Function1<? super Integer, Boolean> function1) {
        this.LLILZIL = function1;
    }

    public final void setOnInterceptedListener(Function1<? super Integer, Unit> function1) {
        this.LLILZLL = function1;
    }

    public C19551511eT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19551511eT(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = new LinkedHashSet();
        setOnTabClickListener(new InterfaceC1638460sjs() { // from class: X.11eU
            @Override // X.InterfaceC1638460sjs
            public final void LIZ(C12H3 c12h3) {
                int i2 = c12h3.LIZLLL;
                Function1<? super Integer, Boolean> function1 = this.LIZ.LLILZIL;
                if ((function1 != null && function1.invoke(Integer.valueOf(i2)).booleanValue()) || this.LIZ.LLILZ.contains(Integer.valueOf(i2))) {
                    Function1<? super Integer, Unit> function12 = this.LIZ.LLILZLL;
                    if (function12 != null) {
                        function12.invoke(Integer.valueOf(i2));
                        return;
                    }
                    return;
                }
                c12h3.LIZ();
            }
        });
    }
}
