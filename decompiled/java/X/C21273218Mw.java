package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.18Mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21273218Mw implements InterfaceC2249881D4g {
    public final ViewGroup LL;
    public final ECommerceAnchorPanelViewModel LLILLJJLI = new ECommerceAnchorPanelViewModel();
    public AnchorCommonViewModel LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Double LLILZLL;
    public InterfaceC21275218Nq LLIZ;
    public final C054G LLIZLLLIL;
    public AnonymousClass0956 LLJ;

    @Override // X.InterfaceC2249881D4g
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC2249881D4g
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC2249881D4g
    public final void LIZ() {
        Aweme awemeLJJLIIIJJIZ;
        String aid;
        Aweme awemeLJJLIIIJJIZ2;
        Aweme awemeLJJLIIIJJIZ3;
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        String aid2 = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = null;
        InterfaceC21275218Nq interfaceC21275218Nq = this.LLIZ;
        if (interfaceC21275218Nq != null) {
            interfaceC21275218Nq.LIZ();
        }
        this.LLILZ = false;
        this.LLILLJJLI.MQ2();
        C21272518Mp c21272518Mp = C21272518Mp.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLJJLI.LL;
        C21272518Mp.LIZLLL(c21272518Mp, (interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ3 = interfaceC1392640mLO.LJJLIIIJJIZ()) == null) ? null : awemeLJJLIIIJJIZ3.getAid());
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLILLJJLI.LL;
        if (interfaceC1392640mLO2 != null && (awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ()) != null) {
            aid2 = awemeLJJLIIIJJIZ2.getAid();
        }
        C21272518Mp.LJ(aid2);
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LLILLJJLI.LL;
        if (interfaceC1392640mLO3 == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO3.LJJLIIIJJIZ()) == null || (aid = awemeLJJLIIIJJIZ.getAid()) == null || aid.length() == 0) {
            return;
        }
        C21272518Mp.LIZLLL.remove(aid);
    }

    public final void LIZIZ() {
        InterfaceC21275218Nq interfaceC21275218Nq = this.LLIZ;
        if ((!(interfaceC21275218Nq instanceof C18NT) && !(interfaceC21275218Nq instanceof C18NP)) || !ECommerceAnchorPanelViewModel.wQ2(this.LLILLJJLI)) {
            AnonymousClass0956 anonymousClass0956 = this.LLJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLILLJJLI.getClass();
            return;
        }
        this.LLILZ = true;
        InterfaceC21275218Nq interfaceC21275218Nq2 = this.LLIZ;
        if (interfaceC21275218Nq2 != null) {
            interfaceC21275218Nq2.LIZLLL();
        }
        this.LLILLJJLI.getClass();
    }

    @Override // X.InterfaceC2249881D4g
    public final C1400390mXt getAnchorMobConfiguration() {
        return new C1400390mXt(null, new AwS556S0100000_12(this, 1006), null, null, null, 29);
    }

    @Override // X.InterfaceC2249881D4g
    public final HashMap<String, String> getShowContentInfo() {
        InterfaceC21275218Nq interfaceC21275218Nq = this.LLIZ;
        if (interfaceC21275218Nq != null) {
            return interfaceC21275218Nq.getShowContentInfo();
        }
        return null;
    }

    public C21273218Mw(AbstractC2249871D4f abstractC2249871D4f) {
        this.LL = abstractC2249871D4f;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLIZLLLIL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
    }

    @Override // X.InterfaceC2249881D4g
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        Aweme awemeLJJLIIIJJIZ;
        String str;
        C21272618Mq c21272618Mq = C21272618Mq.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLJJLI.LL;
        Aweme awemeLJJLIIIJJIZ2 = null;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        c21272618Mq.getClass();
        if (C21272618Mq.LJIILIIL(awemeLJJLIIIJJIZ)) {
            AnonymousClass0956 anonymousClass0956 = this.LLJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJ = C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C21164517s3(this, null), 3);
        }
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLILLJJLI.LL;
        if (interfaceC1392640mLO2 != null) {
            C18LI.LIZ.getClass();
            C18LI.LIZ(interfaceC1392640mLO2);
        }
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LLILLJJLI.LL;
        if (interfaceC1392640mLO3 != null) {
            awemeLJJLIIIJJIZ2 = interfaceC1392640mLO3.LJJLIIIJJIZ();
        }
        if (C21272618Mq.LJFF(awemeLJJLIIIJJIZ2, this.LLILLJJLI.LLILZIL)) {
            str = "c9855.d40179";
        } else {
            str = "c5134.d0";
        }
        c2344009Gk.LJ(C1104190eq9.LIZ(this.LL, str), "btm_param_map_key");
        InterfaceC21275218Nq interfaceC21275218Nq = this.LLIZ;
        if (interfaceC21275218Nq != null) {
            interfaceC21275218Nq.LIZJ(c2344009Gk);
        }
        this.LLILZ = false;
        return true;
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJI(int i) {
        Aweme awemeLJJLIIIJJIZ;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LLILLJJLI;
        InterfaceC1392640mLO interfaceC1392640mLO = eCommerceAnchorPanelViewModel.LL;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        eCommerceAnchorPanelViewModel.TQ2(i, awemeLJJLIIIJJIZ);
    }

    @Override // X.InterfaceC2249881D4g
    public final String LJIIJ(C2344009Gk c2344009Gk) {
        String strLJFF;
        this.LLILLJJLI.LLJJIJI = c2344009Gk;
        InterfaceC21275218Nq interfaceC21275218Nq = this.LLIZ;
        if (interfaceC21275218Nq == null || (strLJFF = interfaceC21275218Nq.LJFF()) == null) {
            return "click_list";
        }
        return strLJFF;
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJIIL(double d) {
        Aweme awemeLJJLIIIJJIZ;
        Aweme awemeLJJLIIIJJIZ2;
        double dDoubleValue;
        int i;
        boolean z;
        int videoLength;
        Aweme awemeLJJLIIIJJIZ3;
        Video video;
        if (this.LLILZLL == null) {
            this.LLILZLL = Double.valueOf(d);
        }
        C21272618Mq c21272618Mq = C21272618Mq.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLJJLI.LL;
        Aweme awemeLJJLIIIJJIZ4 = null;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        c21272618Mq.getClass();
        if (!C21272618Mq.LJIILIIL(awemeLJJLIIIJJIZ)) {
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLILLJJLI.LL;
            if (interfaceC1392640mLO2 != null) {
                awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ2 = null;
            }
            if (C21272618Mq.LJ(awemeLJJLIIIJJIZ2) && !this.LLILZ) {
                Double d2 = this.LLILZLL;
                if (d2 != null) {
                    dDoubleValue = d2.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                InterfaceC1392640mLO interfaceC1392640mLO3 = this.LLILLJJLI.LL;
                if (interfaceC1392640mLO3 != null) {
                    awemeLJJLIIIJJIZ4 = interfaceC1392640mLO3.LJJLIIIJJIZ();
                }
                AnchorBizUtils.LIZ.getClass();
                if (AnchorBizUtils.LJJJLL(awemeLJJLIIIJJIZ4)) {
                    i = C21276218Oa.LIZ().delayShowSubtitle;
                } else {
                    i = C21276318Ob.LIZ().delayShowSubtitle;
                }
                boolean z2 = false;
                if (d >= dDoubleValue + ((double) i)) {
                    z = true;
                } else {
                    z = false;
                }
                int iFloor = (int) Math.floor(d);
                InterfaceC1392640mLO interfaceC1392640mLO4 = this.LLILLJJLI.LL;
                if (interfaceC1392640mLO4 != null && (awemeLJJLIIIJJIZ3 = interfaceC1392640mLO4.LJJLIIIJJIZ()) != null && (video = awemeLJJLIIIJJIZ3.getVideo()) != null) {
                    videoLength = video.getVideoLength();
                } else {
                    videoLength = Integer.MAX_VALUE;
                }
                if (iFloor >= (videoLength / LSPassThroughRecordSizeConfig.DEFAULT) - 1) {
                    z2 = true;
                }
                if (z || z2) {
                    LIZIZ();
                }
            }
        }
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJ(C2344009Gk c2344009Gk, Function1<? super Boolean, Unit> function1) {
        this.LLILLJJLI.LLJJIJI = c2344009Gk;
        function1.invoke(Boolean.TRUE);
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJIIIIZZ(AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, int i, Function0 function0) {
        if (!this.LLILZIL) {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C18N4(this, anchorCommonStruct, interfaceC1392640mLO, false, i, function0, null), 2);
            this.LLILZIL = true;
            C1345605Ok.LIZIZ(interfaceC1392640mLO.LJJLIIIJJIZ(), interfaceC1392640mLO.Cf());
        }
    }
}
