package X;

import android.view.View;

/* JADX INFO: renamed from: X.0muW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ViewOnLayoutChangeListenerC1414420muW implements View.OnLayoutChangeListener {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C1414440muY LLILLJJLI;
    public final /* synthetic */ InterfaceC1414430muX LLILLL;

    public ViewOnLayoutChangeListenerC1414420muW(C370670Eg5 c370670Eg5, C1414440muY c1414440muY, InterfaceC1414430muX interfaceC1414430muX) {
        this.LL = c370670Eg5;
        this.LLILLJJLI = c1414440muY;
        this.LLILLL = interfaceC1414430muX;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.LL.removeOnLayoutChangeListener(this);
        C1414440muY c1414440muY = this.LLILLJJLI;
        View view2 = this.LL;
        c1414440muY.getClass();
        if (C1414440muY.LIZ(view2)) {
            C1414440muY c1414440muY2 = this.LLILLJJLI;
            if (!c1414440muY2.LIZ) {
                c1414440muY2.LIZ = true;
                this.LLILLL.LJI();
            }
        }
    }
}
