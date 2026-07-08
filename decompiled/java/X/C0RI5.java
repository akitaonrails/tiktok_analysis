package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.fullscreen.above.FullScreenAboveInteractionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RI5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RI5 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FullScreenAboveInteractionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RI5(FullScreenAboveInteractionComponent fullScreenAboveInteractionComponent) {
        super(1);
        this.LL = fullScreenAboveInteractionComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        IAdComponentService iAdComponentService;
        C19719912Dl c19719912DlLJ;
        ReusedUIContentAssem reusedUIContentAssem;
        Object service;
        C13IQ c13iq;
        Object service2;
        String aid;
        Object obj;
        String aid2;
        IVideoCellAbility iVideoCellAbility;
        BaseFeedPageParams baseFeedPageParamsNJ2;
        Object c098200Yq;
        Object c098200Yq2;
        boolean zBooleanValue;
        C0RUJ c0ruj;
        C0RUJ c0ruj2;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        Assembler assembler2 = assembler;
        String str = null;
        if (Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_feed") && (baseFeedPageParams = this.LL.jm().LJ) != null && (c2189821An6 = baseFeedPageParams.param) != null && (Intrinsics.LJFF(c2189821An6.getFrom(), "from_paid_collection") || Intrinsics.LJFF(c2189821An6.getFrom(), "from_paid_content_detail_video_list_entrance") || Intrinsics.LJFF(c2189821An6.getFrom(), "from_paid_content_detail_cta_entrance"))) {
            C13IQ c13iqLJJ = C0SFC.LIZIZ.LJJ(this.LL.jm());
            if ((c13iqLJJ instanceof C13IQ) && c13iqLJJ != null) {
                C0RJE.LIZJ(assembler2, this.LL, new AwS590S0100000_11(c13iqLJJ, (C13IQ<? extends BaseCellTriggerComponent<? extends C03H5>>) 318));
            }
        } else {
            C0S0L c0s0l = C0S0L.LIZ;
            C690870R8b c690870R8bJm = this.LL.jm();
            c0s0l.getClass();
            if ((C0S0L.LIZIZ(c690870R8bJm) || Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_mid_roll") || Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_text") || (Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_detail") && ((Boolean) C04UE.LIZ.getValue()).booleanValue())) && (iAdComponentService = (IAdComponentService) ServiceManager.get().getService(IAdComponentService.class)) != null && (c19719912DlLJ = iAdComponentService.LJ()) != null && (reusedUIContentAssem = (ReusedUIContentAssem) C09R7.LIZ(c19719912DlLJ).newInstance()) != null) {
                C0RJE.LIZJ(assembler2, this.LL, new C0REU(reusedUIContentAssem));
            }
        }
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchFullScreenAboveInteractionPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchFullScreenAboveInteractionPartial");
            }
        }
        if (((InterfaceC634440OuY) service).LJIIZILJ()) {
            if (C1157804fw.LIZ()) {
                service2 = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                if (service2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchFullScreenAboveInteractionPartial");
                }
            } else {
                service2 = ServiceManager.get().getService(ISearchService.class);
                if (service2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchFullScreenAboveInteractionPartial");
                }
            }
            C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iqC0 = ((InterfaceC634440OuY) service2).C0();
            if ((c13iqC0 instanceof C13IQ) && c13iqC0 != null) {
                FullScreenAboveInteractionComponent fullScreenAboveInteractionComponent = this.LL;
                boolean zBooleanValue2 = ((Boolean) C271360AkI.LIZ.getValue()).booleanValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lazy load assem enabled = ");
                sbLIZ.append(zBooleanValue2);
                sbLIZ.append(' ');
                Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(fullScreenAboveInteractionComponent)).getAweme();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                sbLIZ.append(aid);
                C2188811AlT.LIZIZ(sbLIZ);
                if (zBooleanValue2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("lazy load assem real trigger downgradeReusedUITriggerAssemV2 ");
                    C724270Sb3 c724270Sb3 = fullScreenAboveInteractionComponent.LLJI;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    } else {
                        obj = null;
                    }
                    Aweme aweme2 = ((VideoItemParams) obj).getAweme();
                    if (aweme2 != null) {
                        aid2 = aweme2.getAid();
                    } else {
                        aid2 = null;
                    }
                    sbLIZ2.append(aid2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(c13iqC0, (C13IQ<? extends BaseCellTriggerComponent<? extends C03H5>>) 319);
                    C0RUD c0rud = new C0RUD();
                    awS590S0100000_11.invoke(c0rud);
                    ReusedUIContentAssem<? extends C03H5> reusedUIContentAssem2 = c0rud.LLJ;
                    if (reusedUIContentAssem2 == null) {
                        reusedUIContentAssem2 = (ReusedUIContentAssem) C13LP.LJJJJZI(c0rud.LIZIZ(c0rud.LL.LL));
                    }
                    if ((reusedUIContentAssem2 instanceof BaseCellTriggerComponent) && (iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(C1558520qew.LJIIL(fullScreenAboveInteractionComponent), IVideoCellAbility.class, null)) != null && (baseFeedPageParamsNJ2 = iVideoCellAbility.nJ2()) != null && ((BaseCellTriggerComponent) reusedUIContentAssem2).kp(baseFeedPageParamsNJ2, iVideoCellAbility.Yf2())) {
                        try {
                            if ((reusedUIContentAssem2 instanceof C0RUJ) && (c0ruj2 = (C0RUJ) reusedUIContentAssem2) != null) {
                                c098200Yq = c0ruj2.T1();
                            } else {
                                c098200Yq = null;
                            }
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        String str2 = (String) c098200Yq;
                        try {
                            if ((reusedUIContentAssem2 instanceof C0RUJ) && (c0ruj = (C0RUJ) reusedUIContentAssem2) != null) {
                                c098200Yq2 = Boolean.valueOf(c0ruj.m8());
                            } else {
                                c098200Yq2 = null;
                            }
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                            c098200Yq2 = null;
                        }
                        Boolean bool = (Boolean) c098200Yq2;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = true;
                        }
                        C0RUB c0rubLJI = c0rud.LJI(str2, zBooleanValue);
                        EnumC695670RQn enumC695670RQn = c0rubLJI.LIZ;
                        int i = C693540RIi.LIZ[enumC695670RQn.ordinal()];
                        if (i != 1 && i != 2) {
                            if (i != 3) {
                                assembler2.LQ2(fullScreenAboveInteractionComponent, new AwS377S0200000_11(c0rud, (C0RUD) reusedUIContentAssem2, (ReusedUIContentAssem<? extends C03H5>) 153));
                                C0RUC.LIZLLL(C724240Sb0.LIZ(fullScreenAboveInteractionComponent), enumC695670RQn, c0rubLJI, reusedUIContentAssem2, new AwS412S0200000_11(fullScreenAboveInteractionComponent, (ReusedUIContentAssem) reusedUIContentAssem2, 96));
                            } else {
                                assembler2.LQ2(fullScreenAboveInteractionComponent, new AwS377S0200000_11(c0rud, (C0RUD) reusedUIContentAssem2, (ReusedUIContentAssem<? extends C03H5>) 152));
                            }
                        }
                    }
                } else {
                    C0RJE.LIZJ(assembler2, fullScreenAboveInteractionComponent, new AwS377S0200000_11(fullScreenAboveInteractionComponent, (FullScreenAboveInteractionComponent) c13iqC0, (C13IQ<? extends BaseCellTriggerComponent<? extends C03H5>>) 72));
                }
            }
        }
        ((IPaidContentVideoHotSwapService) this.LL.LLJJJJLIIL.getValue()).LJII();
        C19719912Dl c19719912DlLJI = ((IPaidContentVideoHotSwapService) this.LL.LLJJJJLIIL.getValue()).LJI();
        if ((c19719912DlLJI instanceof C13IQ) && c19719912DlLJI != null) {
            C0RI6.LIZ(assembler2, this.LL, new C694280RLe(c19719912DlLJI));
        }
        C1EE1 c1ee1 = C1EE1.LIZIZ;
        if (c1ee1.LJJJ()) {
            C0RJN c0rjnLIZIZ = this.LL.jm().LIZIZ();
            if (c0rjnLIZIZ != null) {
                str = c0rjnLIZIZ.LIZ;
            }
            if (Intrinsics.LJFF(str, "For You")) {
                Object objLJJJJLI = c1ee1.LJJJJLI();
                if ((objLJJJJLI instanceof C13IQ) && (c13iq = (C13IQ) objLJJJJLI) != null) {
                    C0RJE.LIZJ(assembler2, this.LL, new AwS590S0100000_11(c13iq, (C13IQ<? extends BaseCellTriggerComponent<? extends C03H5>>) 320));
                }
            }
        }
        return Unit.LIZ;
    }
}
