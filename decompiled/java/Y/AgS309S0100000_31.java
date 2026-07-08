package Y;

import X.AbstractC1604130rqV;
import X.AnonymousClass1604;
import X.AnonymousClass1629;
import X.C1113800f5e;
import X.C1389890mGx;
import X.C160B;
import X.C161N;
import X.C19292910dr;
import X.C20693915yL;
import X.C20698415z4;
import X.C20703515zt;
import X.C207042160a;
import X.C2188811AlT;
import X.C299060Bns;
import X.C305370By3;
import X.C319100Cf6;
import X.C631370Opb;
import X.C708250RqJ;
import X.EnumC1120860fH2;
import X.InterfaceC1364105Vn;
import X.InterfaceC20698115z1;
import X.InterfaceC319170CfD;
import X.InterfaceC346701Wf;
import android.view.View;
import com.bytedance.android.livesdk.impl.revenue.enigma.paywall.EnigmaPaywallFragment;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionViewModelV2;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS117S0110000_31;
import kotlin.jvm.internal.AwS12S0120000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class AgS309S0100000_31 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS309S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(AgS309S0100000_31 agS309S0100000_31, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AnonymousClass1629 anonymousClass1629;
        C207042160a c207042160a = (C207042160a) obj;
        if (c207042160a == null) {
            return Unit.LIZ;
        }
        String str = c207042160a.LIZ;
        CLACaptionViewModelV2 cLACaptionViewModelV2Bp = ((CLACaptionAssemV2) agS309S0100000_31.l0).Bp();
        cLACaptionViewModelV2Bp.getClass();
        if (Intrinsics.LJFF(str, AnonymousClass1604.LIZ(cLACaptionViewModelV2Bp)) && ((CLACaptionAssemV2) agS309S0100000_31.l0).Bp().wQ2().LLILLJJLI.LLILZIL == C160B.EXPANDED) {
            C161N c161n = C161N.LIZIZ;
            boolean zLJIIJ = c161n.LJIIJ(((VideoItemParams) C631370Opb.LIZ((CLACaptionAssemV2) agS309S0100000_31.l0)).getAweme(), c161n.LLIIZ());
            CLACaptionAssemV2 cLACaptionAssemV2 = (CLACaptionAssemV2) agS309S0100000_31.l0;
            if (zLJIIJ) {
                anonymousClass1629 = null;
            } else {
                anonymousClass1629 = AnonymousClass1629.LAND_ON_ITEM;
            }
            cLACaptionAssemV2.jS0(anonymousClass1629, c207042160a.LIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS309S0100000_31 agS309S0100000_31, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC319170CfD interfaceC319170CfD = (InterfaceC319170CfD) obj;
        if (interfaceC319170CfD instanceof C319100Cf6) {
            if (((C319100Cf6) interfaceC319170CfD).LIZ == 2) {
                EnigmaPaywallFragment enigmaPaywallFragment = (EnigmaPaywallFragment) agS309S0100000_31.l0;
                enigmaPaywallFragment.NR(enigmaPaywallFragment.LLJIJIL, false);
                View view = enigmaPaywallFragment.LLJIJIL;
                AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(367);
                enigmaPaywallFragment.MR(view, aFwS221S0000000_31, true);
                enigmaPaywallFragment.MR(enigmaPaywallFragment.LLJILJIL, aFwS221S0000000_31, false);
                enigmaPaywallFragment.NR(enigmaPaywallFragment.LLJILJIL, true);
                enigmaPaywallFragment.UR();
            } else {
                EnigmaPaywallFragment enigmaPaywallFragment2 = (EnigmaPaywallFragment) agS309S0100000_31.l0;
                enigmaPaywallFragment2.getClass();
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                C1113800f5e.LIZJ(EnumC1120860fH2.ENIGMA_PAYWALL);
                enigmaPaywallFragment2.MR(enigmaPaywallFragment2.LLJIJIL, AFwS221S0000000_31.get$arr$(367), false);
                enigmaPaywallFragment2.NR(enigmaPaywallFragment2.LLJIJIL, true);
                enigmaPaywallFragment2.NR(enigmaPaywallFragment2.LLJILJIL, false);
                enigmaPaywallFragment2.MR(enigmaPaywallFragment2.LLJILJIL, new AwS575S0100000_31(enigmaPaywallFragment2, 1352), true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS309S0100000_31 agS309S0100000_31, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Aweme aweme;
        Aweme aweme2;
        InterfaceC20698115z1 interfaceC20698115z1;
        InterfaceC20698115z1 interfaceC20698115z12;
        InterfaceC20698115z1 interfaceC20698115z13;
        C708250RqJ c708250RqJ = (C708250RqJ) obj;
        CaptionsPanelFragment captionsPanelFragment = (CaptionsPanelFragment) agS309S0100000_31.l0;
        C20693915yL c20693915yL = captionsPanelFragment.LLJILJIL;
        if (c20693915yL != null) {
            c20693915yL.LJI(new AwS397S0200000_31(c708250RqJ, captionsPanelFragment, 128));
        }
        AbstractC1604130rqV abstractC1604130rqVHS = ((CaptionsPanelFragment) agS309S0100000_31.l0).hS();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionsPanelFragment onMasterTranslationToggleStatusChanged: ");
        sbLIZ.append(c708250RqJ.LIZ);
        abstractC1604130rqVHS.LJ(C2188811AlT.LIZIZ(sbLIZ));
        CaptionsPanelFragment captionsPanelFragment2 = (CaptionsPanelFragment) agS309S0100000_31.l0;
        boolean z = c708250RqJ.LIZ;
        captionsPanelFragment2.getClass();
        boolean zLIZJ = C299060Bns.LIZJ();
        if (z) {
            captionsPanelFragment2.qS();
            if (!zLIZJ) {
                C1389890mGx c1389890mGx = new C1389890mGx(captionsPanelFragment2);
                c1389890mGx.LJIIIZ(2131828782);
                c1389890mGx.LJIIJJI();
            }
        } else {
            captionsPanelFragment2.oS();
            if (!zLIZJ) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(captionsPanelFragment2);
                c1389890mGx2.LJIIIZ(2131828781);
                c1389890mGx2.LJIIJJI();
            }
        }
        C20698415z4 c20698415z4 = captionsPanelFragment2.LLILLJJLI;
        Aweme aweme3 = null;
        if (c20698415z4 != null && (interfaceC20698115z13 = c20698415z4.LIZ) != null) {
            aweme = interfaceC20698115z13.getAweme();
        } else {
            aweme = null;
        }
        boolean zLJJI = C20703515zt.LJJI(aweme);
        C19292910dr c19292910dr = captionsPanelFragment2.LLJIJIL;
        if (c19292910dr != null) {
            c19292910dr.LJI(new AwS117S0110000_31(captionsPanelFragment2, zLJJI, 8));
        }
        captionsPanelFragment2.wS(captionsPanelFragment2.LLJJ);
        if (C305370By3.LIZ) {
            C20698415z4 c20698415z42 = captionsPanelFragment2.LLILLJJLI;
            if (c20698415z42 != null && (interfaceC20698115z12 = c20698415z42.LIZ) != null) {
                aweme2 = interfaceC20698115z12.getAweme();
            } else {
                aweme2 = null;
            }
            boolean zLJJI2 = C20703515zt.LJJI(aweme2);
            C20703515zt c20703515zt = C20703515zt.LIZ;
            C20698415z4 c20698415z43 = captionsPanelFragment2.LLILLJJLI;
            if (c20698415z43 != null && (interfaceC20698115z1 = c20698415z43.LIZ) != null) {
                aweme3 = interfaceC20698115z1.getAweme();
            }
            c20703515zt.getClass();
            boolean zLJIL = C20703515zt.LJIL(aweme3);
            C19292910dr c19292910dr2 = captionsPanelFragment2.LLJIJIL;
            if (c19292910dr2 != null) {
                c19292910dr2.LJI(new AwS12S0120000_31(captionsPanelFragment2, zLJJI2, zLJIL, 2));
            }
        }
        return Unit.LIZ;
    }
}
