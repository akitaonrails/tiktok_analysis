package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0lMQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1354840lMQ extends C1353510lKH {
    public boolean LLJJ;
    public boolean LLJJI;
    public InterfaceC1354850lMR LLJJIII;

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        InterfaceC1354850lMR interfaceC1354850lMR;
        super.onWindowFocusChanged(z);
        this.LLJJ = z;
        if (z && this.LLJJI && (interfaceC1354850lMR = this.LLJJIII) != null) {
            interfaceC1354850lMR.LIZ();
        }
    }

    public void setFocusChangeListener(InterfaceC1354850lMR interfaceC1354850lMR) {
        this.LLJJIII = interfaceC1354850lMR;
    }

    public C1354840lMQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C0I7D, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.LLJJI = z;
        InterfaceC1354850lMR interfaceC1354850lMR = this.LLJJIII;
        if (interfaceC1354850lMR != null && z && this.LLJJ) {
            interfaceC1354850lMR.LIZ();
        }
    }
}
