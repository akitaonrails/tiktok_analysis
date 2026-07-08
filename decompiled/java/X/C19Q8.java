package X;

import android.content.Context;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Q8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19Q8 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;

    public C19Q8(Context context) {
        boolean z;
        int i;
        TypedValue typedValueLIZ = C19PF.LIZ(R.attr.bqm, context);
        if (typedValueLIZ != null && typedValueLIZ.type == 18 && typedValueLIZ.data != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
        TypedValue typedValueLIZ2 = C19PF.LIZ(R.attr.bql, context);
        if (typedValueLIZ2 != null) {
            i = typedValueLIZ2.data;
        } else {
            i = 0;
        }
        this.LIZIZ = i;
        TypedValue typedValueLIZ3 = C19PF.LIZ(R.attr.bix, context);
        this.LIZJ = typedValueLIZ3 != null ? typedValueLIZ3.data : 0;
        this.LIZLLL = context.getResources().getDisplayMetrics().density;
    }
}
