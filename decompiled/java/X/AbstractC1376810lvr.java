package X;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0lvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1376810lvr {
    public final InterfaceC1374230lrh LL;

    public boolean LIZ() {
        return false;
    }

    public abstract void LIZIZ(View view);

    public void LIZJ() {
    }

    public Integer LIZLLL() {
        return null;
    }

    public Integer LJFF() {
        return null;
    }

    public Integer LJI() {
        return null;
    }

    public void LJIIIIZZ(ImageView imageView, View view, int i) {
    }

    public AbstractC1376810lvr(InterfaceC1374230lrh interfaceC1374230lrh) {
        this.LL = interfaceC1374230lrh;
    }

    public void LJII(View view) {
        InterfaceC1374230lrh interfaceC1374230lrh;
        if (!(this instanceof C1374210lrf) && (interfaceC1374230lrh = this.LL) != null) {
            interfaceC1374230lrh.dismiss();
        }
        LIZIZ(view);
    }
}
