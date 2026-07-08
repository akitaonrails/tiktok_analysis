package X;

import Y.ARunnableS97S0200000_28;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.configuration.scene.UGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJPushService;
import com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility;
import com.ss.android.ugc.aweme.journey.events.NujFlowEngineNextEvent;
import com.ss.android.ugc.aweme.journey.events.NujPerformanceTrackerV2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS30S1400000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10P4, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10P4 {
    public final C10PP LIZ;
    public volatile boolean LIZJ;
    public List<? extends C10ND> LJFF;
    public final List<AbstractC19239910Ov> LJI;
    public String LJII;
    public volatile int LIZIZ = -1;
    public final CopyOnWriteArraySet<C10P9> LIZLLL = new CopyOnWriteArraySet<>();
    public final C01GW LJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(699));

    public final void LIZ() {
        String str;
        NujFlowEngineNextEvent nujFlowEngineNextEvent = new NujFlowEngineNextEvent();
        nujFlowEngineNextEvent.LJI(Integer.valueOf(this.LIZJ ? 1 : 0), "is_complete");
        nujFlowEngineNextEvent.LJI(String.valueOf(this.LIZIZ), "step");
        nujFlowEngineNextEvent.LJIIIIZZ();
        if (this.LIZJ) {
            NujPerformanceTrackerV2.LIZ.getClass();
            NujPerformanceTrackerV2.LJII = false;
            C1911410zq7.LIZLLL("NUJFlowEngineV2", "");
            return;
        }
        if (this.LIZIZ >= this.LJFF.size() - 1) {
            LIZJ();
            return;
        }
        if (this.LIZIZ < -1) {
            C1911410zq7.LIZ("NUJFlowEngineV2", "next, step is illegal");
            LIZIZ(AFwS271S0000000_28.get$arr$(410));
            return;
        }
        this.LIZIZ++;
        if (this.LIZIZ == 0) {
            C1911410zq7.LIZ("NUJFlowEngineV2", "next, step is 0");
            LIZIZ(AFwS271S0000000_28.get$arr$(411));
        }
        C10ND c10nd = (C10ND) ListProtector.get(this.LJFF, this.LIZIZ);
        C10MP.LIZ.getClass();
        Keva.getRepo("nuj_extend").storeString("current_step", c10nd.getId());
        if (c10nd instanceof AbstractC19239910Ov) {
            ((ArrayList) this.LJI).add(c10nd);
            LIZ();
            return;
        }
        if (!(c10nd instanceof C10NF)) {
            LIZ();
            return;
        }
        String str2 = C19240310Oz.LIZ;
        C10NF c10nf = (C10NF) c10nd;
        String str3 = c10nf.LIZJ;
        C19240310Oz.LIZLLL = str3;
        this.LJII = str3;
        C10NW c10nw = c10nf.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("V2 interceptors: ");
        sbLIZ.append(this.LJ.getValue());
        C1911410zq7.LIZ("NUJFlowEngineV2", C2188811AlT.LIZIZ(sbLIZ));
        for (C10PH c10ph : (CopyOnWriteArrayList) this.LJ.getValue()) {
            C10PO.LIZ.getClass();
            C10P6 c10p6 = C10PO.LIZIZ;
            if (c10p6 != null) {
                c10ph.LIZ(c10p6, c10nw);
            }
        }
        C10PO.LIZ.getClass();
        C10P6 c10p62 = C10PO.LIZIZ;
        C10P7 c10p7LIZLLL = c10p62 != null ? c10nf.LIZLLL(this.LIZ.context(), c10p62) : null;
        if (!(c10p7LIZLLL instanceof C10P7)) {
            c10p7LIZLLL = null;
        }
        if (c10p7LIZLLL == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("component's [");
            sbLIZ2.append(c10nf.LIZJ);
            sbLIZ2.append('-');
            sbLIZ2.append(c10nf.LIZIZ);
            sbLIZ2.append("] data type is not a ComponentData");
            C1911410zq7.LIZIZ("NUJFlowEngineV2", C2188811AlT.LIZIZ(sbLIZ2));
            LIZIZ(AFwS271S0000000_28.get$arr$(409));
            LIZ();
            return;
        }
        C1869040yjm c1869040yjmLIZ = this.LIZ.context().LIZ(c10nw);
        Pair<String, Boolean> pairLJFF = c10nd.LJFF();
        if (!pairLJFF.getSecond().booleanValue()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handleCurrentStep component [");
            sbLIZ3.append(c10nf.LIZJ);
            sbLIZ3.append('-');
            sbLIZ3.append(c10nf.LIZIZ);
            sbLIZ3.append("] shouldHandle is ");
            sbLIZ3.append(pairLJFF);
            C1911410zq7.LIZJ("NUJFlowEngineV2", C2188811AlT.LIZIZ(sbLIZ3));
            C19240010Ow c19240010Ow = C19240010Ow.LIZ;
            C10OL.LIZ.getClass();
            long j = C10OL.LIZIZ;
            String str4 = c10nf.LIZJ;
            String first = pairLJFF.getFirst();
            c19240010Ow.getClass();
            C19240010Ow.LIZLLL(j, str4, first, false);
            String str5 = C19240310Oz.LIZLLL;
            C19240310Oz.LJ = str5;
            ((ArrayList) C19240310Oz.LJFF).add(str5);
            IUGStrategyTriggerAbility iUGStrategyTriggerAbilityLJI = UGStrategyTriggerAbility.LJI();
            if (iUGStrategyTriggerAbilityLJI != null) {
                iUGStrategyTriggerAbilityLJI.LIZ("after_nuj_node_end");
            }
            LIZ();
            return;
        }
        String str6 = C19240310Oz.LIZ;
        String str7 = c10nf.LIZJ;
        C19240310Oz.LIZ = str7;
        C10SW.LIZ.LJIIJ(str7);
        C19240010Ow c19240010Ow2 = C19240010Ow.LIZ;
        C10OL.LIZ.getClass();
        long j2 = C10OL.LIZIZ;
        String str8 = c10nf.LIZJ;
        String first2 = pairLJFF.getFirst();
        c19240010Ow2.getClass();
        C19240010Ow.LIZLLL(j2, str8, first2, true);
        if (c1869040yjmLIZ != null && (str = c1869040yjmLIZ.LIZ) != null) {
            C0C5P.LIZJ().getClass();
            C0C5P.LIZ(str);
            C10H5 c10h5 = C10H5.HYBRID_AB_EXPOSE;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(System.currentTimeMillis() - C1150504el.LIZ().LJJII, "duration_since_launch");
            c2344009Gk.LJIIIIZZ("vid", str);
            C10SV.LIZIZ(c10h5, c2344009Gk.LIZ);
        }
        String first3 = pairLJFF.getFirst();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("component :");
        sbLIZ4.append(c10p7LIZLLL.type());
        sbLIZ4.append(" start execute");
        C1911410zq7.LIZ("NUJFlowEngineV2", C2188811AlT.LIZIZ(sbLIZ4));
        LIZIZ(new AwS607S0100000_28(c10p7LIZLLL, (C10P7<C1869040yjm>) 352));
        final ArrayList arrayList = new ArrayList();
        for (AbstractC19239910Ov abstractC19239910Ov : (ArrayList) this.LJI) {
            if (!abstractC19239910Ov.LIZIZ) {
                arrayList.add(abstractC19239910Ov);
            }
        }
        if (arrayList.size() > 0) {
            final int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                AbstractC19239910Ov abstractC19239910Ov2 = (AbstractC19239910Ov) obj;
                if (i <= arrayList.size() - 2) {
                    abstractC19239910Ov2.LIZJ = new C10MF() { // from class: X.10P2
                        @Override // X.C10MF
                        public final void onEnd() {
                            ((AbstractC19239910Ov) ListProtector.get(arrayList, i + 1)).LJII();
                        }
                    };
                }
                i = i2;
            }
            ((AbstractC19239910Ov) ListProtector.get(arrayList, 0)).LJII();
        }
        c10p7LIZLLL.LIZLLL(this.LIZ.context(), c1869040yjmLIZ, new AwS30S1400000_28(c10p7LIZLLL, (C10P7<C1869040yjm>) new C013C(), (C013C) c10nf, (C10NF<?>) first3, (String) this, (C10P4) 3));
        IUGStrategyTriggerAbility iUGStrategyTriggerAbilityLJI2 = UGStrategyTriggerAbility.LJI();
        if (iUGStrategyTriggerAbilityLJI2 != null) {
            iUGStrategyTriggerAbilityLJI2.LIZ("after_nuj_node_open");
        }
    }

    public final void LIZJ() {
        IUGStrategyTriggerAbility iUGStrategyTriggerAbilityLJI = UGStrategyTriggerAbility.LJI();
        if (iUGStrategyTriggerAbilityLJI != null) {
            iUGStrategyTriggerAbilityLJI.LIZ("before_nuj_end");
        }
        C10QE.LIZ.getClass();
        if (C10QE.LIZIZ && !C10QE.LJ) {
            C10QE.LIZJ = true;
            return;
        }
        C1911410zq7.LIZLLL("NUJFlowEngineV2", "real complete");
        C19240010Ow c19240010Ow = C19240010Ow.LIZ;
        C10OL.LIZ.getClass();
        long j = C10OL.LIZIZ;
        c19240010Ow.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "config_id");
        C19240010Ow.LIZJ("config_scene_end", c2344009Gk.LIZ);
        C19241310Pj.LIZ.getClass();
        if ((C19241310Pj.LIZ() == C10MN.BEFORE_INTEREST_SELECT || C19241310Pj.LIZ() == C10MN.AFTER_INTEREST_SELECT) && !((INUJPushService) ServiceManager.get().getService(INUJPushService.class)).LJIIIIZZ() && new C10N2(false).LIZ("need_compensate", false)) {
            ((INUJPushService) ServiceManager.get().getService(INUJPushService.class)).LJI();
        }
        this.LIZJ = true;
        LIZIZ(AFwS271S0000000_28.get$arr$(412));
    }

    public C10P4(C10PI c10pi) {
        this.LIZ = c10pi;
        C13BV c13bv = C13BV.INSTANCE;
        this.LJFF = c13bv;
        this.LJI = new ArrayList(c13bv);
        this.LJII = "";
    }

    public final void LIZIZ(Function1<? super C10P9, Unit> function1) {
        C587550N2r.LIZIZ(new ARunnableS97S0200000_28(this, function1, 39));
    }
}
