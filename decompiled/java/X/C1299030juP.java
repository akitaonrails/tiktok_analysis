package X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0juP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1299030juP extends AbstractC1299040juQ<C1313680kI2> {
    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final int LJIJJLI() {
        this.LLILZ.getClass();
        return 1;
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJL() {
        T t = this.LLLLLILLIL;
        if (t != 0) {
            ((C1313680kI2) t).setNativeInteractionEnabled(this.LLLIL);
        }
        super.LJJLIIIJL();
    }

    public C1299030juP(final AbstractC1317090kNX abstractC1317090kNX) {
        new AbstractC1313500kHk<T>(abstractC1317090kNX) { // from class: X.0juQ
        };
        abstractC1317090kNX.getClass();
    }

    @Override // X.AbstractC1313520kHm
    public final View LJLJJL(Context context) {
        C1313680kI2 c1313680kI2LJZ = LJZ((AbstractC1317090kNX) context);
        c1313680kI2LJZ.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1339240kxG(this, 5));
        return c1313680kI2LJZ;
    }

    public C1313680kI2 LJZ(AbstractC1317090kNX abstractC1317090kNX) {
        return new C1313680kI2(abstractC1317090kNX);
    }

    @InterfaceC1291270jht(name = "impression_id")
    public void setImpressionId(String str) {
        ((C1313680kI2) this.LLLLLILLIL).setImpressionId(str);
    }
}
