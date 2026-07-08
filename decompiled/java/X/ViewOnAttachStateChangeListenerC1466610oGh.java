package X;

import android.view.View;

/* JADX INFO: renamed from: X.0oGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class ViewOnAttachStateChangeListenerC1466610oGh implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC1466610oGh(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1466610oGh viewOnAttachStateChangeListenerC1466610oGh, View view) {
        ((C1413350msn) viewOnAttachStateChangeListenerC1466610oGh.l0).LJII = false;
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1466610oGh viewOnAttachStateChangeListenerC1466610oGh, View view) {
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) ((C1425080nBi) viewOnAttachStateChangeListenerC1466610oGh.l0).LLJZIJLIL.getValue();
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.kF(((C1425080nBi) viewOnAttachStateChangeListenerC1466610oGh.l0).LLL);
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1466610oGh viewOnAttachStateChangeListenerC1466610oGh, View view) {
        AnonymousClass0956 anonymousClass0956 = ((C1413350msn) viewOnAttachStateChangeListenerC1466610oGh.l0).LJIIIIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        ((C1413350msn) viewOnAttachStateChangeListenerC1466610oGh.l0).LJIIIIZZ = null;
        ((C1413350msn) viewOnAttachStateChangeListenerC1466610oGh.l0).LJII = true;
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1466610oGh viewOnAttachStateChangeListenerC1466610oGh, View view) {
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) ((C1425080nBi) viewOnAttachStateChangeListenerC1466610oGh.l0).LLJZIJLIL.getValue();
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.b8(((C1425080nBi) viewOnAttachStateChangeListenerC1466610oGh.l0).LLL);
        }
    }
}
