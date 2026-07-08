package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C425280Gly extends AbstractViewOnLayoutChangeListenerC425300Gm0 {
    public final View LLILLJJLI;
    public final C01GW LLILLL;
    public int LLILZ;
    public int LLILZIL;

    @Override // X.AbstractViewOnLayoutChangeListenerC425300Gm0
    public final void LIZ() {
        this.LLILZ = -1;
        this.LLILZIL = -1;
        View view = this.LL;
        if (view != null) {
            view.setBackgroundResource(R.drawable.crt);
        }
        if (this.LLILZ != -1 || this.LLILZIL != -1) {
            this.LLILZ = -1;
            this.LLILZIL = -1;
            int height = this.LLILLJJLI.getHeight();
            View view2 = (View) this.LLILLL.getValue();
            LIZLLL(height, view2 != null ? view2.getHeight() : 0);
        }
        View view3 = (View) this.LLILLL.getValue();
        if (view3 != null) {
            view3.addOnLayoutChangeListener(this);
        }
        View view4 = (View) this.LLILLL.getValue();
        if (view4 != null) {
            onLayoutChange(view4, view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom(), view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
        }
    }

    @Override // X.AbstractViewOnLayoutChangeListenerC425300Gm0
    public final void LIZIZ() {
        View view = (View) this.LLILLL.getValue();
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
    }

    public C425280Gly(View view, View view2) {
        super(view);
        this.LLILLJJLI = view2;
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1605));
        this.LLILZ = -1;
        this.LLILZIL = -1;
    }

    public int LIZJ(int i, int i2) {
        return (i - i2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    }

    public final void LIZLLL(int i, int i2) {
        View view;
        int i3;
        if (this.LLILZ >= 0 && (i3 = this.LLILZIL) > 0) {
            View view2 = this.LL;
            if (view2 != null) {
                C425270Glx.LIZIZ(i3, view2);
            }
            View view3 = this.LL;
            if (view3 != null) {
                C425270Glx.LIZ(this.LLILZ, view3);
                return;
            }
            return;
        }
        if (i > 0 && i2 > 0 && i > i2 && (view = this.LL) != null) {
            C425270Glx.LIZIZ(LIZJ(i, i2), view);
        }
        View view4 = this.LL;
        if (view4 != null) {
            C425270Glx.LIZ(0, view4);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view == null || i4 - i2 == i8 - i6) {
            return;
        }
        LIZLLL(this.LLILLJJLI.getHeight(), view.getHeight());
    }
}
