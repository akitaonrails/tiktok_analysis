package X;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.190r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214703190r extends AbstractC214710190y {
    public final WeakReference<Fragment> LLILZ;

    public C214703190r(WeakReference<Fragment> weakReference) {
        this.LLILZ = weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC214710190y
    public final C191E LIZJ(boolean z) {
        final int iIntValue;
        T tLIZLLL;
        Context context;
        Fragment fragment = this.LLILZ.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            if (C960203pA.LIZIZ(context) && C0SO2.LIZLLL()) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -16777216;
                }
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, context);
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                } else {
                    iIntValue = -1;
                }
            }
        } else {
            iIntValue = 0;
        }
        final C259800zU c259800zU = new C259800zU();
        Fragment fragment2 = this.LLILZ.get();
        if (fragment2 != null) {
            tLIZLLL = C1766560w4U.LIZLLL(fragment2);
        } else {
            tLIZLLL = 0;
        }
        c259800zU.element = tLIZLLL;
        if (z) {
            return new C191E() { // from class: X.190s
                @Override // X.C191E
                public final void LIZIZ(float f) {
                    C21462518z1.LIZIZ.set(this.LJ.LL, Float.valueOf(f));
                    int iIntValue2 = ((Integer) new ArgbEvaluator().evaluate(f, 0, Integer.valueOf(iIntValue))).intValue();
                    TuxImmersionBar tuxImmersionBar = c259800zU.element;
                    if (tuxImmersionBar != null) {
                        tuxImmersionBar.LJFF(iIntValue2);
                        tuxImmersionBar.LIZLLL();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
        }
        return new C191E() { // from class: X.190t
            @Override // X.C191E
            public final void LIZIZ(float f) {
                C21462518z1.LIZIZ.set(this.LJ.LL, Float.valueOf(1.0f - f));
                int iIntValue2 = ((Integer) new ArgbEvaluator().evaluate(f, Integer.valueOf(iIntValue), 0)).intValue();
                TuxImmersionBar tuxImmersionBar = c259800zU.element;
                if (tuxImmersionBar != null) {
                    tuxImmersionBar.LJFF(iIntValue2);
                    tuxImmersionBar.LIZ(true);
                    tuxImmersionBar.LIZLLL();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        };
    }

    @Override // X.AbstractC214710190y
    public final void LJ(boolean z) {
        C214696190k.LIZ.LIZ(this.LL, 1.0f);
    }

    @Override // X.AbstractC214710190y
    public final void LIZ(View view, ViewGroup viewGroup) {
        this.LL = view;
        this.LLILLJJLI = viewGroup;
        C214696190k.LIZ.LIZLLL(view);
    }
}
