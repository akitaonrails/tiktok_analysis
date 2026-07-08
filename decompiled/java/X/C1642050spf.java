package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: X.0spf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1642050spf extends RelativeLayout {
    public InterfaceC1642040spe LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC1642040spe interfaceC1642040spe = this.LL;
        if (interfaceC1642040spe != null) {
            interfaceC1642040spe.LIZ();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setNoBlockTouchListener(InterfaceC1642040spe interfaceC1642040spe) {
        this.LL = interfaceC1642040spe;
    }

    public C1642050spf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
