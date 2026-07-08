package X;

import Y.ALAdapterS12S0200000_17;
import android.graphics.PointF;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.like.widget.SelfLikeWidget;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0ePr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087890ePr extends AbstractC1086460eNY {
    public final HashSet<C1295960jpS> LIZ = new HashSet<>();
    public final HashSet<C1126540fQC> LIZIZ = new HashSet<>();
    public final /* synthetic */ SelfLikeWidget LIZJ;

    public C1087890ePr(SelfLikeWidget selfLikeWidget) {
        this.LIZJ = selfLikeWidget;
    }

    public final void LIZIZ(C1295960jpS c1295960jpS) {
        C786410Ut5.LLD(4, c1295960jpS);
        if (this.LIZ.size() >= 5) {
            FrameLayout frameLayout = this.LIZJ.LL;
            if (frameLayout == null) {
                frameLayout = null;
            }
            C786410Ut5.LJJJZ(c1295960jpS, frameLayout);
            return;
        }
        this.LIZ.add(c1295960jpS);
    }

    public final void LIZ(C1295960jpS c1295960jpS, PointF pointF) {
        C786410Ut5.LLD(0, c1295960jpS);
        float f = pointF.x;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setX(f);
        float f2 = pointF.y;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1295960jpS);
        c1295960jpS.setY(f2);
        ALAdapterS12S0200000_17 aLAdapterS12S0200000_17 = new ALAdapterS12S0200000_17(c1295960jpS, this, 5);
        ((InterfaceC500100JjM) AbstractC19484711Kz.LJII(new C1151800g4w(c1295960jpS, aLAdapterS12S0200000_17, 0)).LJIIJJI(new C1151750g4r(c1295960jpS, aLAdapterS12S0200000_17, this, 0)).LIZLLL(C11RD.LJ(this.LIZJ))).subscribe();
    }
}
