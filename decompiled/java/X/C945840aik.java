package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0aik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945840aik implements InterfaceC785120Ur0 {
    public final View LIZ;
    public final View LIZIZ;
    public final EnumC1102740eno LIZJ;
    public final C1099960ejK LIZLLL;
    public final TBViewModel LJ;
    public boolean LJFF = true;

    @Override // X.InterfaceC1103130eoR
    public final void LIZIZ() {
        View view = this.LIZ;
        if (view instanceof FrameLayout) {
            ((ViewGroup) view).setClipChildren(false);
        }
    }

    @Override // X.InterfaceC1103130eoR
    public final void LIZLLL() {
        this.LIZJ.hide(this.LIZLLL.LIZJ);
    }

    @Override // X.InterfaceC1103130eoR
    public final Context getContext() {
        return this.LIZ.getContext();
    }

    @Override // X.InterfaceC1103130eoR
    public final ViewGroup.LayoutParams getLayoutParams() {
        return this.LIZIZ.getLayoutParams();
    }

    @Override // X.InterfaceC1103130eoR
    public final int getVisibility() {
        return this.LIZJ.isShowing(this.LIZLLL.LIZJ) ? 0 : 8;
    }

    @Override // X.InterfaceC785120Ur0
    public final View LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1103130eoR
    public final View LJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1103130eoR
    public final boolean LJFF() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1103130eoR
    public final View getContentView() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1103130eoR
    public final void LIZ(boolean z) {
        this.LIZ.setClickable(z);
    }

    @Override // X.InterfaceC1103130eoR
    public final void LJI(boolean z) {
        this.LJFF = z;
    }

    @Override // X.InterfaceC1103130eoR
    public final void addView(View view) {
        View view2 = this.LIZIZ;
        if (view2 instanceof FrameLayout) {
            ((ViewGroup) view2).addView(view);
        }
    }

    @Override // X.InterfaceC1103130eoR
    public final <T extends View> T findViewById(int i) {
        return (T) this.LIZ.findViewById(i);
    }

    @Override // X.InterfaceC1103130eoR
    public final void post(Runnable runnable) {
        HandlerHook.viewPost(this.LIZIZ, runnable);
    }

    @Override // X.InterfaceC1103130eoR
    public final void setAlpha(float f) {
        this.LJ.LLILZLL.setValue(Float.valueOf(f));
    }

    @Override // X.InterfaceC1103130eoR
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C786410Ut5.W5(this.LIZIZ, layoutParams);
    }

    @Override // X.InterfaceC1103130eoR
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.I7(onClickListener, this.LIZ);
    }

    @Override // X.InterfaceC1103130eoR
    public final void setVisibility(int i) {
        this.LIZJ.setVisibility(this.LIZLLL.LIZJ, i);
    }

    public C945840aik(View view, View view2, EnumC1102740eno enumC1102740eno, C1099960ejK c1099960ejK, TBViewModel tBViewModel) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = enumC1102740eno;
        this.LIZLLL = c1099960ejK;
        this.LJ = tBViewModel;
    }
}
