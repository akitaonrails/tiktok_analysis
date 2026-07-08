package Y;

import X.C017O;
import X.C0RT5;
import X.C1389890mGx;
import X.C20693915yL;
import X.C2286608xc;
import X.C299060Bns;
import X.C708250RqJ;
import X.C708900RrM;
import X.EnumC2748014o;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.captionsheet.DMTranslationPanelFragment;
import com.ss.android.ugc.aweme.captionsheet.PhotoTranslationPanelFragment;
import com.ss.android.ugc.aweme.captionsheet.PhotoTranslationPanelFragmentV2;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.service.IAutoDubbingService;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.AutoDubbingConsumptionLabelAssemV2;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class AgS201S0200000_11 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS201S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS201S0200000_11 agS201S0200000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Integer numLJ;
        IAutoDubbingService iAutoDubbingServiceLIZ;
        AutoDubbingConsumptionLabelAssemV2 autoDubbingConsumptionLabelAssemV2 = (AutoDubbingConsumptionLabelAssemV2) agS201S0200000_11.l0;
        autoDubbingConsumptionLabelAssemV2.Fp(autoDubbingConsumptionLabelAssemV2.up((VideoItemParams) agS201S0200000_11.l1));
        IAutoDubbingService iAutoDubbingServiceLIZ2 = C0RT5.LIZ();
        if (iAutoDubbingServiceLIZ2 != null && iAutoDubbingServiceLIZ2.LIZLLL(((VideoItemParams) agS201S0200000_11.l1).getAweme())) {
            numLJ = C2286608xc.LJ(R.raw.icon_info_circle);
        } else {
            numLJ = null;
        }
        ((AutoDubbingConsumptionLabelAssemV2) agS201S0200000_11.l0).Ep(numLJ);
        IAutoDubbingService iAutoDubbingServiceLIZ3 = C0RT5.LIZ();
        if (iAutoDubbingServiceLIZ3 != null) {
            iAutoDubbingServiceLIZ3.LJ(((VideoItemParams) agS201S0200000_11.l1).getAweme());
        }
        AutoDubbingConsumptionLabelAssemV2 autoDubbingConsumptionLabelAssemV22 = (AutoDubbingConsumptionLabelAssemV2) agS201S0200000_11.l0;
        if (!autoDubbingConsumptionLabelAssemV22.LLJLILLLLZIIL ? autoDubbingConsumptionLabelAssemV22.LJJIJL().getVisibility() == 0 : autoDubbingConsumptionLabelAssemV22.LLJZIJLIL) {
            if (!C017O.LIZ() && (iAutoDubbingServiceLIZ = C0RT5.LIZ()) != null) {
                iAutoDubbingServiceLIZ.LJFF(((VideoItemParams) agS201S0200000_11.l1).mEventType, EnumC2748014o.SHOW.getValue(), ((VideoItemParams) agS201S0200000_11.l1).getAweme().getAid());
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS201S0200000_11 agS201S0200000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C708250RqJ c708250RqJ = (C708250RqJ) obj;
        ((C20693915yL) agS201S0200000_11.l0).LJI(new AwS590S0100000_11(c708250RqJ, 598));
        boolean zLIZJ = C299060Bns.LIZJ();
        if (c708250RqJ.LIZ) {
            if (!zLIZJ) {
                C1389890mGx c1389890mGx = new C1389890mGx((PhotoTranslationPanelFragmentV2) agS201S0200000_11.l1);
                c1389890mGx.LJIIIZ(2131828782);
                c1389890mGx.LJIIJJI();
            }
        } else if (!zLIZJ) {
            C1389890mGx c1389890mGx2 = new C1389890mGx((PhotoTranslationPanelFragmentV2) agS201S0200000_11.l1);
            c1389890mGx2.LJIIIZ(2131828781);
            c1389890mGx2.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS201S0200000_11 agS201S0200000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C708900RrM c708900RrM = (C708900RrM) obj;
        ((C20693915yL) agS201S0200000_11.l0).LJI(new AwS590S0100000_11(c708900RrM, 599));
        boolean zLIZJ = C299060Bns.LIZJ();
        if (c708900RrM.LIZ) {
            if (!zLIZJ) {
                C1389890mGx c1389890mGx = new C1389890mGx((DMTranslationPanelFragment) agS201S0200000_11.l1);
                c1389890mGx.LJIIIZ(2131828782);
                c1389890mGx.LJIIJJI();
            }
        } else if (!zLIZJ) {
            C1389890mGx c1389890mGx2 = new C1389890mGx((DMTranslationPanelFragment) agS201S0200000_11.l1);
            c1389890mGx2.LJIIIZ(2131828781);
            c1389890mGx2.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS201S0200000_11 agS201S0200000_11, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C708250RqJ c708250RqJ = (C708250RqJ) obj;
        ((C20693915yL) agS201S0200000_11.l0).LJI(new AwS590S0100000_11(c708250RqJ, 600));
        boolean zLIZJ = C299060Bns.LIZJ();
        if (c708250RqJ.LIZ) {
            if (!zLIZJ) {
                C1389890mGx c1389890mGx = new C1389890mGx((PhotoTranslationPanelFragment) agS201S0200000_11.l1);
                c1389890mGx.LJIIIZ(2131828782);
                c1389890mGx.LJIIJJI();
            }
        } else if (!zLIZJ) {
            C1389890mGx c1389890mGx2 = new C1389890mGx((PhotoTranslationPanelFragment) agS201S0200000_11.l1);
            c1389890mGx2.LJIIIZ(2131828781);
            c1389890mGx2.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
