package X;

import android.graphics.Canvas;
import java.io.Serializable;

/* JADX INFO: renamed from: X.1DZN, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DZN implements Serializable {
    public boolean LL = true;

    public abstract void attach(C0S3W c0s3w);

    public abstract void onDraw(Canvas canvas);

    public abstract void updateData(C1DZS c1dzs);

    public final boolean getEnable() {
        return this.LL;
    }

    public final void setEnable(boolean z) {
        this.LL = z;
    }
}
