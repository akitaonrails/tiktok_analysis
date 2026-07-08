package X;

import android.content.Context;
import android.widget.Scroller;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: X.0MQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568360MQw extends Scroller {
    public int LIZ;

    public C568360MQw(Context context) {
        super(context);
        this.LIZ = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, this.LIZ);
    }

    @Override // android.widget.Scroller
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.LIZ);
    }
}
