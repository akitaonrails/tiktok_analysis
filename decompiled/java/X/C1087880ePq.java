package X;

import Y.ALAdapterS12S0200000_17;
import android.graphics.PointF;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0ePq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087880ePq extends AbstractC1087860ePo {
    public final HashSet<C1295960jpS> LIZ = new HashSet<>();
    public final /* synthetic */ C1087840ePm LIZIZ;

    public C1087880ePq(C1087840ePm c1087840ePm) {
        this.LIZIZ = c1087840ePm;
    }

    public final void LIZ(C1295960jpS c1295960jpS, PointF pointF) {
        C786410Ut5.LLD(0, c1295960jpS);
        float f = pointF.x;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setX(f);
        float f2 = pointF.y;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setY(f2);
        ALAdapterS12S0200000_17 aLAdapterS12S0200000_17 = new ALAdapterS12S0200000_17(c1295960jpS, this, 34);
        this.LIZIZ.LJIIL.LIZ(AbstractC19484711Kz.LJII(new C1151800g4w(c1295960jpS, aLAdapterS12S0200000_17, 1)).LJIIJJI(new C1151750g4r(c1295960jpS, aLAdapterS12S0200000_17, this, 2)).LJJIIJ());
    }
}
