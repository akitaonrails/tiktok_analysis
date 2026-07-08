package X;

import com.bytedance.android.widget.Widget;

/* JADX INFO: renamed from: X.0eAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078430eAb implements InterfaceC1078490eAh {
    public boolean LIZ;
    public final /* synthetic */ Widget LIZIZ;
    public final /* synthetic */ C1077990e9t LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // X.InterfaceC1078490eAh
    public final /* synthetic */ void LIZ(Object... objArr) {
    }

    @Override // X.InterfaceC1078490eAh
    public final void invoke(Object obj) {
        if (!this.LIZ) {
            this.LIZ = true;
            Widget widget = this.LIZIZ;
            widget.args = new C1078480eAg[]{new C1078480eAg(obj)};
            this.LIZJ.LIZ.load(this.LIZLLL, widget, false);
        }
    }

    public C1078430eAb(Widget widget, C1077990e9t c1077990e9t, int i) {
        this.LIZIZ = widget;
        this.LIZJ = c1077990e9t;
        this.LIZLLL = i;
    }
}
