package X;

import Y.ARunnableS11S1100000_6;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.nativecountdownlabel.AnoleCountDownModel;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.FeedBottomLabelLayout;
import java.util.Map;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003040cD0 extends AbstractC1014240cV4 {
    public final AnoleCountDownModel LLJLIL;
    public final C427020Gom LLJLILLLLZIIL;
    public FeedBottomLabelLayout LLJLL;
    public Long LLJLLIL;
    public final C01GW LLJLLL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final boolean Hk() {
        return TextUtils.equals(EnumC1008920cMU.LUCKY_BOX_COUNT_DOWN.getType(), this.LL.type);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, "");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        C427020Gom c427020Gom = this.LLJLILLLLZIIL;
        c427020Gom.getClass();
        c427020Gom.LIZ(new AwS550S0100000_6(c427020Gom, 1598));
        ARunnableS11S1100000_6 aRunnableS11S1100000_6 = c427020Gom.LJII;
        if (aRunnableS11S1100000_6 != null) {
            ((Handler) c427020Gom.LIZ.getValue()).removeCallbacks(aRunnableS11S1100000_6);
        }
        c427020Gom.LJII = null;
        Long l = this.LLJLLIL;
        if (l != null) {
            ((C1003060cD2) this.LLJLLL.getValue()).LJJIIZ(this.LL, System.currentTimeMillis() - l.longValue());
            this.LLJLLIL = null;
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Dk(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.Dk(anoleComponentAppearModel);
        C427020Gom c427020Gom = this.LLJLILLLLZIIL;
        c427020Gom.getClass();
        c427020Gom.LIZ(new AwS550S0100000_6(c427020Gom, 1598));
        ARunnableS11S1100000_6 aRunnableS11S1100000_6 = c427020Gom.LJII;
        if (aRunnableS11S1100000_6 != null) {
            ((Handler) c427020Gom.LIZ.getValue()).removeCallbacks(aRunnableS11S1100000_6);
        }
        c427020Gom.LJII = null;
        Long l = this.LLJLLIL;
        if (l != null) {
            ((C1003060cD2) this.LLJLLL.getValue()).LJJIIZ(this.LL, System.currentTimeMillis() - l.longValue());
            this.LLJLLIL = null;
        }
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        C427020Gom c427020Gom = this.LLJLILLLLZIIL;
        c427020Gom.getClass();
        c427020Gom.LIZ(new AwS550S0100000_6(c427020Gom, 1601));
        this.LLJLLIL = Long.valueOf(System.currentTimeMillis());
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        if (abstractC1003980cEW instanceof AbstractC1003210cDH) {
            if (Intrinsics.LJFF(abstractC1003980cEW, C1003170cDD.LIZ)) {
                C427020Gom c427020Gom = this.LLJLILLLLZIIL;
                c427020Gom.getClass();
                c427020Gom.LIZ(new AwS550S0100000_6(c427020Gom, 1599));
            } else if (Intrinsics.LJFF(abstractC1003980cEW, C1003180cDE.LIZ)) {
                C427020Gom c427020Gom2 = this.LLJLILLLLZIIL;
                c427020Gom2.getClass();
                c427020Gom2.LIZ(new AwS550S0100000_6(c427020Gom2, 1600));
            } else {
                if (!Intrinsics.LJFF(abstractC1003980cEW, C1003190cDF.LIZ)) {
                    return;
                }
                C427020Gom c427020Gom3 = this.LLJLILLLLZIIL;
                c427020Gom3.getClass();
                c427020Gom3.LIZ(new AwS550S0100000_6(c427020Gom3, 1600));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fk(android.view.ViewGroup r16, X.InterfaceC1014340cVE r17) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1003040cD0.Fk(android.view.ViewGroup, X.0cVE):void");
    }

    public C1003040cD0(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLILLLLZIIL = new C427020Gom();
        this.LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(c1009340cNA, 979));
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (AnoleCountDownModel) C1227904rF.LIZIZ(C1227904rF.LJI(map), AnoleCountDownModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            AnoleCountDownModel anoleCountDownModel = (AnoleCountDownModel) c098200Yq;
            this.LLJLIL = anoleCountDownModel;
            this.LLJLILLLLZIIL.LJ = anoleCountDownModel;
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            this.LLJLIL = null;
        }
    }
}
