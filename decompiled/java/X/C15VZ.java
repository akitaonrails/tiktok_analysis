package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15VZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VZ implements InterfaceC1086510eNd {
    public final float LL = ((Number) C07D2.LIZ.getValue()).floatValue();

    @Override // X.InterfaceC1086510eNd
    public final void b1() {
    }

    @Override // X.InterfaceC1086510eNd
    public final float z4() {
        return this.LL;
    }

    public final boolean LIZ(View view) {
        float fFloatValue;
        Float f;
        Object tag = view.getTag(R.id.hh2);
        if ((tag instanceof Float) && (f = (Float) tag) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = -1.0f;
        }
        if (fFloatValue >= this.LL) {
            return true;
        }
        return false;
    }
}
