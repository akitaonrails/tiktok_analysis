package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.playablecomponent.AnolePlayableData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cUU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013880cUU extends AbstractC1014240cV4 {
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public C1009850cNz LLJLLL;
    public C1749280vcc LLJZ;
    public C197039127h LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public InterfaceC1008670cM5 LLLFZ;
    public View LLLI;
    public boolean LLLII;
    public Boolean LLLIIII;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final AnolePlayableData LJJ() {
        return (AnolePlayableData) this.LLJLLIL.getValue();
    }

    public final SparkContext LJJI() {
        C1009850cNz c1009850cNz = this.LLJLLL;
        if (c1009850cNz != null) {
            return c1009850cNz.getSparkContext();
        }
        return null;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void clear() {
        Unit unit;
        if (((Boolean) C0A9S.LIZ.getValue()).booleanValue()) {
            try {
                C1009850cNz c1009850cNz = this.LLJLLL;
                if (c1009850cNz != null) {
                    c1009850cNz.LJFF();
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        this.LLJJIJIL = null;
        this.LLJZIJLIL = null;
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLLFZ = null;
        this.LLLFFI = false;
        this.LLLI = null;
        this.LLL = false;
        this.LLLF = false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        C1013910cUX.LIZIZ(this);
        this.LLLII = false;
        this.LLLIIII = null;
        this.LLLFF = 0;
        InterfaceC1013890cUV interfaceC1013890cUV = (InterfaceC1013890cUV) this.LLJLL.getValue();
        if (interfaceC1013890cUV != null) {
            interfaceC1013890cUV.dH2(LJJI());
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
        this.LLLII = true;
        InterfaceC1013890cUV interfaceC1013890cUV = (InterfaceC1013890cUV) this.LLJLL.getValue();
        if (interfaceC1013890cUV != null) {
            interfaceC1013890cUV.Lg0(LJJI());
        }
    }

    public final Context LJJIFFI() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        return (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? this.LLILZ : activityLIZIZ;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Ck(Function1<? super Boolean, Unit> function1) {
        if (((Boolean) C0A9Q.LIZ.getValue()).booleanValue()) {
            C1013910cUX.LIZ(this);
            C1013910cUX.LIZLLL(this, true, false, 2);
        }
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.LJII(anoleComponentAppearModel);
        C1013910cUX.LIZLLL(this, false, this.LLLF, 1);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        if (abstractC1003980cEW instanceof C991730bul) {
            C991730bul c991730bul = (C991730bul) abstractC1003980cEW;
            if (!Intrinsics.LJFF(this.LLLIIII, Boolean.valueOf(c991730bul.LIZ)) && this.LLLII) {
                this.LLLIIII = Boolean.valueOf(c991730bul.LIZ);
                if (c991730bul.LIZ) {
                    InterfaceC1013890cUV interfaceC1013890cUV = (InterfaceC1013890cUV) this.LLJLL.getValue();
                    if (interfaceC1013890cUV != null) {
                        interfaceC1013890cUV.Wf1(LJJI());
                        return;
                    }
                    return;
                }
                InterfaceC1013890cUV interfaceC1013890cUV2 = (InterfaceC1013890cUV) this.LLJLL.getValue();
                if (interfaceC1013890cUV2 == null) {
                    return;
                }
                interfaceC1013890cUV2.TT(LJJI());
            }
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Nk(AnoleComponentAppearModel anoleComponentAppearModel) {
        C1013910cUX.LIZ(this);
        super.Nk(anoleComponentAppearModel);
    }

    public C1013880cUU(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(417));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS417S0200000_16(c1009340cNA, anoleComponentModel, 66));
        this.LLJLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(418));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 747));
    }
}
