package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS134S0110000_16;
import kotlin.jvm.internal.AwS140S0201000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dZM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055340dZM implements InterfaceC1013940cUa {
    public C1055330dZL LIZ;
    public Aweme LIZIZ;
    public boolean LIZJ;

    @Override // X.InterfaceC1013940cUa
    public final void LIZ() {
        LJIIL(new AwS560S0100000_16(this, 4));
    }

    @Override // X.InterfaceC1013940cUa
    public final void LIZJ() {
        if (this.LIZIZ == null) {
            return;
        }
        this.LIZJ = false;
        LJIIL(new AwS560S0100000_16(this, 7));
    }

    @Override // X.InterfaceC1013940cUa
    public final int LIZLLL() {
        C1055330dZL c1055330dZL = this.LIZ;
        if (c1055330dZL != null) {
            return c1055330dZL.LIZJ;
        }
        return -1;
    }

    @Override // X.InterfaceC1013940cUa
    public final void LJI() {
        LJIIL(new AwS560S0100000_16(this, 3));
    }

    @Override // X.InterfaceC1013940cUa
    public final void LJII() {
        LJIIL(new AwS560S0100000_16(this, 5));
    }

    @Override // X.InterfaceC1013940cUa
    public final void LJLLLLLL() {
        LJIIL(new AwS560S0100000_16(this, 6));
    }

    @Override // X.InterfaceC1013940cUa
    public final void LIZIZ(boolean z) {
        LJIIL(new AwS134S0110000_16(this, z, 0));
    }

    @Override // X.InterfaceC1013940cUa
    public final void LJ(Aweme aweme) {
        if (C1009740cNo.LJIILIIL(aweme)) {
            LJIIJJI(aweme);
            this.LIZJ = true;
            C1055330dZL c1055330dZL = this.LIZ;
            if (c1055330dZL != null && c1055330dZL.LJI != -1) {
                c1055330dZL.LJI = System.currentTimeMillis();
            }
        }
    }

    @Override // X.InterfaceC1013940cUa
    public final void LJFF(AnoleComponentModel anoleComponentModel) {
        LJIIL(new AwS417S0200000_16(this, anoleComponentModel, 0));
    }

    @Override // X.InterfaceC1013940cUa
    public final void LJIIIIZZ(SparkContext sparkContext) {
        LJIIL(new AwS417S0200000_16(this, sparkContext, 1));
    }

    @Override // X.InterfaceC1013940cUa
    public final void LJIIIZ(Aweme aweme) {
        LJIIJJI(aweme);
    }

    @Override // X.InterfaceC1013940cUa
    public final void LJIIJ(boolean z) {
        LJIIL(new AwS134S0110000_16(this, z, 1));
    }

    public final void LJIIJJI(Aweme aweme) {
        String aid;
        Aweme aweme2;
        if (aweme == null || !C1009740cNo.LJIILIIL(aweme)) {
            return;
        }
        this.LIZIZ = aweme;
        String aid2 = aweme.getAid();
        C1055330dZL c1055330dZL = this.LIZ;
        if (c1055330dZL != null && (aweme2 = c1055330dZL.LIZ) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid2, aid)) {
            this.LIZ = new C1055330dZL(aweme);
        }
    }

    public final void LJIIL(Function0<Unit> function0) {
        Aweme aweme = this.LIZIZ;
        if (aweme != null && C1009740cNo.LJIILIIL(aweme)) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1013940cUa
    public final void hv(SparkContext sparkContext, int i, String str) {
        LJIIL(new AwS140S0201000_16(this, i, str, sparkContext, 0));
    }
}
