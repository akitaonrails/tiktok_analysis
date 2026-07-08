package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.03Lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C828103Lj extends C21674119s3 {
    public final int LJIILL;
    public Pair<Integer, Integer> LJIILLIIL;
    public float LJIIZILJ;

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        float f = this.LJIIZILJ * 1.5f;
        this.LJIIZILJ = f;
        return f / displayMetrics.densityDpi;
    }

    public C828103Lj(Context context, int i) {
        super(context);
        this.LJIILL = i;
        this.LJIIZILJ = 20.0f;
    }

    @Override // X.C21674119s3
    public final int LJIIJ(int i, View view) {
        Pair<Integer, Integer> pair = null;
        if (view != null) {
            try {
                C813303Fr c813303Fr = (C813303Fr) view.findViewById(R.id.vi5);
                if (c813303Fr != null) {
                    int i2 = this.LJIILL;
                    try {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) c813303Fr.findViewById(R.id.rn0);
                        if (i2 < viewOnAttachStateChangeListenerC20604515jv.getChildCount()) {
                            View childAt = viewOnAttachStateChangeListenerC20604515jv.getChildAt(i2);
                            pair = new Pair<>(Integer.valueOf(childAt.getTop() + viewOnAttachStateChangeListenerC20604515jv.getTop()), Integer.valueOf(childAt.getBottom() + viewOnAttachStateChangeListenerC20604515jv.getTop()));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        this.LJIILLIIL = pair;
        return super.LJIIJ(i, view);
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        int iIntValue;
        Pair<Integer, Integer> pair = this.LJIILLIIL;
        int iIntValue2 = 0;
        if (pair != null) {
            iIntValue = pair.getFirst().intValue();
        } else {
            iIntValue = 0;
        }
        int i6 = iIntValue + i;
        Pair<Integer, Integer> pair2 = this.LJIILLIIL;
        if (pair2 != null) {
            iIntValue2 = pair2.getSecond().intValue();
        }
        return (i3 + ((i4 - i3) / 2)) - (i6 + (((i + iIntValue2) - i6) / 2));
    }
}
