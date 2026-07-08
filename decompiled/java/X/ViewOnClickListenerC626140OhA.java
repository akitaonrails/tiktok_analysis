package X;

import android.view.View;

/* JADX INFO: renamed from: X.0OhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnClickListenerC626140OhA extends C11RC implements View.OnClickListener {
    public final View LLILLJJLI;
    public final InterfaceC626120Oh8<? super Object> LLILLL;

    @Override // X.C11RC
    public final void LIZ() {
        C786410Ut5.I7(null, this.LLILLJJLI);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!isDisposed()) {
            this.LLILLL.onNext(C626150OhB.LIZ);
        }
    }

    public ViewOnClickListenerC626140OhA(View view, InterfaceC626120Oh8<? super Object> interfaceC626120Oh8) {
        this.LLILLJJLI = view;
        this.LLILLL = interfaceC626120Oh8;
    }
}
