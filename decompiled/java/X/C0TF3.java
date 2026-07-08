package X;

import Y.ARunnableS112S0100000_12;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0TF3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TF3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C785450UrX LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    public C0TF3(C785450UrX c785450UrX, int i, int i2) {
        this.LL = c785450UrX;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = C0TF4.LIZ[this.LL.LIZ.ordinal()];
        int iMin = 0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new C1954807lC();
                }
            } else if (C785430UrV.LIZ(view.getContext())) {
            }
            iMin = (i9 - Math.min((int) ((this.LL.LJFF * view.getContext().getResources().getDisplayMetrics().density) + 0.5f), i9)) / 2;
        }
        if (view.getPaddingLeft() != iMin || view.getPaddingRight() != iMin) {
            view.setPadding(iMin, this.LLILLJJLI, iMin, this.LLILLL);
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(view, 6));
        }
    }
}
