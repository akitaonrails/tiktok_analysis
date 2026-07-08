package X;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.0cUZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013930cUZ extends C1009850cNz {
    public boolean LLJJIII;

    public C1013930cUZ(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && this.LLJJIII) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJIII) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setInClearMode(boolean z) {
        C1013990cUf c1013990cUf;
        this.LLJJIII = z;
        SparkContext sparkContext = getSparkContext();
        if (sparkContext == null || (c1013990cUf = (C1013990cUf) sparkContext.LJFF(C1013990cUf.class)) == null) {
            c1013990cUf = new C1013990cUf(0);
            SparkContext sparkContext2 = getSparkContext();
            if (sparkContext2 != null) {
                sparkContext2.LJJ(C1013990cUf.class, c1013990cUf);
            }
        }
        c1013990cUf.LIZJ = Boolean.valueOf(z);
    }
}
